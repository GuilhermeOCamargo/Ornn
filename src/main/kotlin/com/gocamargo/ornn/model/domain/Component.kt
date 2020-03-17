package com.gocamargo.ornn.model.domain

import com.gocamargo.ornn.util.Content
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "component")
data class Component (val id: String? = null,
                      val type: String,
                      val content: MutableList<Content>)