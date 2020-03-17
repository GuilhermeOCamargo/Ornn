package com.gocamargo.ornn.service

import com.gocamargo.ornn.model.domain.ComponentSpec
import com.gocamargo.ornn.model.enums.ComponentType
import com.gocamargo.ornn.repository.ComponentSpecRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ComponentSpecService(val repository: ComponentSpecRepository) {

    fun findByType(type: String): Mono<ComponentSpec> {
        ComponentType.validate(type)
        return repository.findOne(Example.of(ComponentSpec(type = type)))
    }

    fun findComponentByTypeAndVersion(type: String, version: Int): Mono<ComponentSpec> =
            findByType(type)
                    .map { componentSpec ->
                        println(componentSpec)
                        componentSpec.filterVersion(version)
                    }
}
