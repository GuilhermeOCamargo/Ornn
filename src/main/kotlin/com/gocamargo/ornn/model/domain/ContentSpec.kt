package com.gocamargo.ornn.model.domain

import com.gocamargo.ornn.model.enums.Type

data class ContentSpec(val name: String,
                       val optional: Boolean = false,
                       val type: Type,
                       val minVersion: Int,
                       val currentVersion: Int,
                       val description: String)