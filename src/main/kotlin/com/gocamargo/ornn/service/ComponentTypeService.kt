package com.gocamargo.ornn.service

import com.gocamargo.ornn.configuration.MessageSource
import com.gocamargo.ornn.exception.ObjectNotFoundException
import com.gocamargo.ornn.model.domain.ComponentType
import com.gocamargo.ornn.repository.ComponentTypeRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ComponentTypeService(private val repository: ComponentTypeRepository) {

    fun findComponentTypeById(id: String): Mono<ComponentType> =
            repository.findById(id)
                    .switchIfEmpty(Mono.defer { Mono.error(ObjectNotFoundException(MessageSource["component.type.not.found"])) })

    fun findComponentTypeByName(name: String): Mono<ComponentType> =
            repository.findOne(Example.of(ComponentType(name = name)))
                    .switchIfEmpty(Mono.defer { Mono.error(ObjectNotFoundException(MessageSource["component.type.not.found"])) })

    private fun save(componentType: ComponentType): Mono<ComponentType> =
            repository.save(componentType)

    fun insertComponentType(name: String): Mono<ComponentType> =
            findComponentTypeByName(name)
                    .onErrorResume { repository.save(ComponentType(name = name)) }
}