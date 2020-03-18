package com.gocamargo.ornn.controller

import com.gocamargo.ornn.model.domain.ComponentType
import com.gocamargo.ornn.service.ComponentTypeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/component/type")
class ComponentTypeController(private val service: ComponentTypeService) {

    @GetMapping("/name/{name}")
    fun findComponentTypeByName(@PathVariable name: String): Mono<ComponentType> =
            service.findComponentTypeByName(name)
}