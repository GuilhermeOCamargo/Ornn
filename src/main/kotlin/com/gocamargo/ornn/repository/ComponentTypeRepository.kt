package com.gocamargo.ornn.repository

import com.gocamargo.ornn.model.domain.ComponentType
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface ComponentTypeRepository: ReactiveMongoRepository<ComponentType, String>