package com.gocamargo.ornn.model.dto

data class FieldError(val field: String, val description: String)

data class ErrorDto(val status: Int, val timestamp: Long, val errors: List<FieldError>)