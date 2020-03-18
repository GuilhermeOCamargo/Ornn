package com.gocamargo.ornn.service

import com.gocamargo.ornn.model.domain.ComponentSpec
import com.gocamargo.ornn.model.dto.ComponentSpecDto
import com.gocamargo.ornn.repository.ComponentSpecRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ComponentSpecService(private val repository: ComponentSpecRepository,
                           private val componentTypeService: ComponentTypeService) {

    fun findByType(type: String): Mono<ComponentSpec> =
            componentTypeService.findComponentTypeByName(type)
                    .flatMap { repository.findOne(Example.of(ComponentSpec(type = it))) }


    fun findComponentByTypeAndVersion(type: String, version: Int): Mono<ComponentSpec> =
            findByType(type)
                    .map { componentSpec ->
                        println(componentSpec)
                        componentSpec.filterVersion(version)
                    }

    fun save(componentSpec: ComponentSpec): Mono<ComponentSpec> =
            repository.save(componentSpec)

    fun createComponentSpec(componentSpecDto: ComponentSpecDto): Mono<ComponentSpec> =
            componentTypeService.insertComponentType(componentSpecDto.type)
                    .map { componentSpecDto.toEntity(it) }
                    .flatMap { save(it) }

}
