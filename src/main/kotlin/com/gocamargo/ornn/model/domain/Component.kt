package com.gocamargo.ornn.model.domain

import com.gocamargo.ornn.util.Content
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component")
data class Component (val id: String? = null,
                      val type: ComponentType,
                      val content: MutableList<Content>)