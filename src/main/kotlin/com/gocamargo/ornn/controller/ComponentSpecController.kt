package com.gocamargo.ornn.controller

import com.gocamargo.ornn.model.domain.ComponentSpec
import com.gocamargo.ornn.service.ComponentSpecService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/componenent/spec")
class ComponentSpecController(private val componentSpecService: ComponentSpecService){

    @GetMapping
    fun findSpecByType(@RequestParam type: String): Mono<ComponentSpec> =
            componentSpecService.findByType(type)
}