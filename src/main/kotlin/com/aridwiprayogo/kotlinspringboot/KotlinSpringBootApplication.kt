package com.aridwiprayogo.kotlinspringboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSpringBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}

@Bean
fun runner(repository: NewsRepository): CommandLineRunner? {
	return CommandLineRunner {_: Array<String> ->
		repository.run {
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
			save(News(author = "aridwiprayogo",head =  "belajar command line runner", body = "anu"))
		}
	}
}


