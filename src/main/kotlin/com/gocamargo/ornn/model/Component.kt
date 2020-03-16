package com.gocamargo.ornn.model

import com.gocamargo.ornn.model.enums.ComponentType

data class Component(val id: String, val type: ComponentType, val content: MutableList<Content>, val actions: MutableList<Action>, val version: String)