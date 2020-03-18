package com.gocamargo.ornn.model.dto

import com.gocamargo.ornn.dsl.OrnnSpec
import com.gocamargo.ornn.model.domain.ComponentSpec
import com.gocamargo.ornn.model.domain.ComponentType
import com.gocamargo.ornn.model.enums.Type

data class ComponentSpecDto(val id: String? = null,
                            val componentDescription: String? = null,
                            val type: String,
                            val contentSpec: MutableList<ContentSpecDto>? = null,
                            val version: Int? = null){

    fun toEntity(componentType: ComponentType): ComponentSpec =
            OrnnSpec(componentType) {
                description = componentDescription!!
                minVersion = version!!
                contents {
                    contentSpec!!.forEach {
                        contentSpec {
                            name = it.name
                            optional = it.optional
                            type = Type.from(it.type)
                            description = it.description
                            minVersion = it.version
                        }
                    }
                }
            }
}