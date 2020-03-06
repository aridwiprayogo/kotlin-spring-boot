package com.aridwiprayogo.kotlinspringboot

import java.io.Serializable
import java.util.*
import javax.persistence.Id
import javax.persistence.MappedSuperclass


@MappedSuperclass
abstract class AbstractBaseEntity : Serializable {
    @Id
    var id: String = UUID.randomUUID().toString()
    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (other !is AbstractBaseEntity) {
            return false
        }
        return id == other.id
    }

    companion object {
        const val serialVersionUID = 1L
    }

}