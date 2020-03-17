package com.gocamargo.ornn.model.dto

data class ComponentSpecDto(val id: String? = null,
                            val description: String? = null,
                            val type: String,
                            val contentSpecDto: MutableList<ContentSpecDto>? = null,
                            val version: Int? = null)