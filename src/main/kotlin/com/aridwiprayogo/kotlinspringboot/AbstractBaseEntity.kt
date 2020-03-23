package com.aridwiprayogo.kotlinspringboot

import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractBaseEntity : Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    var id: String = UUID.randomUUID().toString()
    override fun hashCode(): Int = id.hashCode()

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other == null -> false
        other !is AbstractBaseEntity -> {
            false
        }
        else -> id == other.id
    }

    companion object {
        const val serialVersionUID = 1L
    }

}