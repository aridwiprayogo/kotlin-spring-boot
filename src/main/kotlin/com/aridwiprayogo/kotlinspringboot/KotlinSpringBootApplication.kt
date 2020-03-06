package com.aridwiprayogo.kotlinspringboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters
import java.time.LocalDate

@EntityScan(
		basePackageClasses = [
			KotlinSpringBootApplication::class,
			Jsr310JpaConverters::class
		]
)
@SpringBootApplication
class KotlinSpringBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}

@Bean
fun runner(repository: NewsRepository): CommandLineRunner? {
	return CommandLineRunner {
		repository.run {
			save(News(
					author = "aridwiprayogo",
					head =  "learning command line runner",
					body = "anu",
					created_at = LocalDate.now()
			))
		}
	}
}


