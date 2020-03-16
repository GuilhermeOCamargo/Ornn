package com.gocamargo.ornn.repository

import com.gocamargo.ornn.model.Component
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ComponentRepository: ReactiveMongoRepository<Component, String>{}