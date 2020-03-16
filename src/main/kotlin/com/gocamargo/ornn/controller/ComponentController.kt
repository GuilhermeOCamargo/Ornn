package com.gocamargo.ornn.controller

import com.gocamargo.ornn.model.Component
import com.gocamargo.ornn.model.enums.ComponentType
import com.gocamargo.ornn.service.ComponentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/component")
class ComponentController(private val componentService: ComponentService) {

    @GetMapping
    fun getComponent(): Mono<Component> =
            componentService.createComponent(ComponentType.CAROUSEL_ROW.description, 1)
}