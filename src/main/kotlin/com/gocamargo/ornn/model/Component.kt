package com.gocamargo.ornn.model

import com.gocamargo.ornn.model.enums.ComponentType
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component")
data class Component(@Id val id: String? = null,
                     val type: ComponentType,
                     val content: MutableList<Content>,
                     val actions: MutableList<Action>? = null,
                     val version: String)