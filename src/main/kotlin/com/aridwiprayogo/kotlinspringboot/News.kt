package com.aridwiprayogo.kotlinspringboot

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
data class News(
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private val id: Long?=null,
	private val author: String,
	private val head: String,
	private val body: String 
	)
