package com.gocamargo.ornn.model.enums

import com.gocamargo.ornn.configuration.MessageSource
import com.gocamargo.ornn.exception.UnprocessableEntityException
import com.gocamargo.ornn.model.dto.FieldError

enum class ComponentType(val description: String) {
    CAROUSEL_ROW("carousel"),
    TITLE_ROW("title");

    companion object {
        @JvmStatic
        fun from(value: String): ComponentType =
                ComponentType.values().first { v -> v.description.equals(value, true) }

        fun validate(value: String) =
                try {
                    from(value)
                }catch (e: Exception){
                    throw UnprocessableEntityException(listOf(FieldError("type", MessageSource["type.invalid"])))
                }
    }
}