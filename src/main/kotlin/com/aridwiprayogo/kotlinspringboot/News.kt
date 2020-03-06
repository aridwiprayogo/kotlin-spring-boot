package com.aridwiprayogo.kotlinspringboot

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.validation.constraints.NotBlank

@Entity
data class News(
        @get: NotBlank
        var author: String? = "",
        @get: NotBlank
        var head: String? = "",
        @get: NotBlank
        var body: String? = "",
        @Column(name = "CREATED_AT")
        var created_at: LocalDate? = LocalDate.now()
) : AbstractBaseEntity()

