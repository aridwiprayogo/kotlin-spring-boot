package com.aridwiprayogo.kotlinspringboot

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/news")
public class NewsController(private val _newsRepository: NewsRepository) {

    @GetMapping
    fun getNews(): List<News> = _newsRepository.findAll()

    @PostMapping
    fun saveNews(@RequestBody news: News) = _newsRepository.save(news)

    @GetMapping("/{id}")
    fun getNewsById(@PathVariable("id")id: UUID)= _newsRepository.findById(id)

    @DeleteMapping("/{id}")
    fun deleteNewsById(@PathVariable("id")id: UUID){ _newsRepository.deleteById(id) }
}
