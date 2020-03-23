package com.aridwiprayogo.kotlinspringboot

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.domain.Persistable
import java.util.*
import javax.persistence.*


@MappedSuperclass
abstract class AbstractBaseEntity(givenId: UUID?=null) : Persistable<UUID>  {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var id: String = givenId.toString()

    @Transient
    private var persisted: Boolean = givenId != null

    override fun getId(): UUID? = UUID.fromString(id)

    override fun isNew(): Boolean = !persisted

    override fun hashCode(): Int = id.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (other !is AbstractBaseEntity) {
            return false
        }
        return id == other.id
    }

    @PostPersist
    @PostLoad
    private fun setPersisted() {
        persisted = true
    }

    companion object {
        const val serialVersionUID = 1L
    }

}