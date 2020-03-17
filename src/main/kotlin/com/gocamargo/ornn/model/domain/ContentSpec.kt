package com.gocamargo.ornn.model.domain

data class ContentSpec(val name: String,
                       val optional: Boolean = false,
                       val type: String,
                       val version: Int,
                       val description: String)