package com.gocamargo.ornn.model.dto


data class ContentSpecDto(val name: String,
                          val optional: Boolean = false,
                          val type: String,
                          val description: String,
                          val version: Int)