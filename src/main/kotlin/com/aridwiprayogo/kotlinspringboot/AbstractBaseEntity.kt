package com.aridwiprayogo.kotlinspringboot

import org.springframework.data.domain.Persistable
import java.util.*
import javax.persistence.*


@MappedSuperclass
abstract class AbstractBaseEntity(givenId: UUID?=null) : Persistable<UUID>  {
    @Id
    var id: UUID = givenId ?: UUID.randomUUID()
    
    @Transient
    private var persisted: Boolean = givenId != null
    
    override fun getId(): UUID = id

    override fun isNew(): Boolean = !persisted

    override fun hashCode(): Int = id.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (other !is AbstractBaseEntity) {
            return false
        }
        return getId() == other.id
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
