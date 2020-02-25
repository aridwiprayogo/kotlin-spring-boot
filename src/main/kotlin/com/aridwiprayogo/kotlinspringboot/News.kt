package com.aridwiprayogo.kotlinspringboot

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
class News(
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?=null,
    var author: String,
    var head: String,
    var body: String 
)
