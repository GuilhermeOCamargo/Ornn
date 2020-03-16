package com.gocamargo.ornn.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component_spec")
data class ComponentSpec(@Id val id: String? = null,
                         val description: String? = null,
                         val type: String,
                         val contentSpec: MutableList<ContentSpec>,
                         val version: Int)