package com.gocamargo.ornn.dsl

import com.gocamargo.ornn.model.ComponentSpec
import com.gocamargo.ornn.model.ContentSpec
import com.gocamargo.ornn.model.enums.ComponentType
import com.gocamargo.ornn.model.enums.Type

fun OrnnSpec(type: ComponentType, block: ComponentSpecBuilder.() -> Unit): ComponentSpec = ComponentSpecBuilder(type).apply(block).build()

class ComponentSpecBuilder(private val type: ComponentType) {

    private val contentSpec = mutableListOf<ContentSpec>()
    fun contents(block: CONTENTS.() -> Unit) {
        contentSpec.addAll(CONTENTS().apply(block))
    }
    var minVersion: Int = 0
    var description: String = ""

    fun build(): ComponentSpec {
        return ComponentSpec(description = description, type = type.description, contentSpec = contentSpec, version = minVersion)
    }
}

class CONTENTS : ArrayList<ContentSpec>() {
    fun contentSpec(block: ContentSpecBuilder.() -> Unit) {
        add(ContentSpecBuilder().apply(block).build())
    }
}

class ContentSpecBuilder {
    lateinit var name: String
    var optional: Boolean = false
    lateinit var type: Type
    var minVersion: Int = 0

    fun build(): ContentSpec = ContentSpec(name, optional, type.description, minVersion)
}