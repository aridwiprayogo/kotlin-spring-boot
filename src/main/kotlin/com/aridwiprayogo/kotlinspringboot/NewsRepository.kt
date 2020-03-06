package com.aridwiprayogo.kotlinspringboot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface NewsRepository : JpaRepository<News, UUID>
