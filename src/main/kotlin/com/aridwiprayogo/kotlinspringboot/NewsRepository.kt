package com.aridwiprayogo.kotlinspringboot;

import org.springframework.data.repository.CrudRepository;

public interface NewsRepository : CrudRepository<News, Long> {

}
