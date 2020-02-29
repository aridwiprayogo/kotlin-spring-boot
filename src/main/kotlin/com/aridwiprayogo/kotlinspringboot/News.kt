package com.aridwiprayogo.kotlinspringboot

import  javax.validation.constraints.NotBlank
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable

@Entity
data class News(
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long?=0,
	@get: NotBlank
	var author: String?="",
	@get: NotBlank
	var head: String?="",
	@get: NotBlank
	var body: String?="" 
	): Serializable

