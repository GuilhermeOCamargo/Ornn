package com.gocamargo.ornn.model.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component_spec")
data class ComponentSpec(@Id val id: String? = null,
                         val description: String? = null,
                         val type: String,
                         val contentSpec: MutableList<ContentSpec>? = null,
                         val version: Int? = null) {

    fun filterVersion(version: Int): ComponentSpec {
        var content = contentSpec!!.filter { c -> c.version <= version } as MutableList
        return ComponentSpec(this.id, this.description, this.type, content, this.version)
    }
}