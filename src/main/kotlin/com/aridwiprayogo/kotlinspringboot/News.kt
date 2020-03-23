package com.aridwiprayogo.kotlinspringboot

import java.time.LocalDate
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.validation.constraints.NotBlank

@Entity
class News(
        id: UUID?=null,
        @get: NotBlank
        var author: String? = "",
        @get: NotBlank
        var head: String? = "",
        @get: NotBlank
        var body: String? = "",
        @Column(name = "CREATED_AT")
        var created_at: LocalDate? = LocalDate.now()
) : AbstractBaseEntity(id)
