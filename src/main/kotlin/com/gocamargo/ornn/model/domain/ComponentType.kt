package com.gocamargo.ornn.model.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component_type")
data class ComponentType(@Id val id: String? = null, val name: String)