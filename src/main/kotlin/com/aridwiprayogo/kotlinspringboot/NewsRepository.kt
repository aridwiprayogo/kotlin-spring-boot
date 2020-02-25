package com.aridwiprayogo.kotlinspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository

@Repository
public interface NewsRepository : JpaRepository<News, Long> {

}
