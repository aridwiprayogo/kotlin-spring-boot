package com.aridwiprayogo.kotlinspringboot

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.time.LocalDate
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
class News(
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "uuid2")
        @Type(type = "uuid2")
        var id: UUID = UUID.randomUUID(),
        @get: NotBlank
        var author: String? = "",
        @get: NotBlank
        var head: String? = "",
        @get: NotBlank
        var body: String? = "",
        @Column(name = "CREATED_AT")
        var created_at: LocalDate? = LocalDate.now()
)
