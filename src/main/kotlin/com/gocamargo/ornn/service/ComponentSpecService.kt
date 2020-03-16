package com.gocamargo.ornn.service

import com.gocamargo.ornn.model.ComponentSpec
import com.gocamargo.ornn.repository.ComponentSpecRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ComponentSpecService(val repository: ComponentSpecRepository) {

    fun findByType(type: String): Mono<ComponentSpec> =
            repository.findOne(Example.of(ComponentSpec(type = type)))
}