package com.gocamargo.ornn.service

import com.gocamargo.ornn.model.domain.Component
import com.gocamargo.ornn.model.domain.ContentSpec
import com.gocamargo.ornn.util.Content
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ComponentService(private val componenetSpecService: ComponentSpecService) {

    fun createComponent(type: String, version: Int): Mono<Component> =
            componenetSpecService.findComponentByTypeAndVersion(type, version)
                    .map { spec -> Component(type = spec.type, content = createContent(spec.contentSpec)) }

    fun createContent(contentSpecList: MutableList<ContentSpec>?): MutableList<Content> =
            contentSpecList!!.map { contentSpec ->
                mutableMapOf(contentSpec.name to contentSpec.name)
            } as MutableList<Content>
}