package com.gocamargo.ornn.repository

import com.gocamargo.ornn.model.ComponentSpec
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ComponentSpecRepository: ReactiveMongoRepository<ComponentSpec, String>{

    fun findByTypeAndVersion(type: String, version: Int)
}