package com.gocamargo.ornn.util

import com.gocamargo.ornn.configuration.MessageSource
import com.gocamargo.ornn.exception.UnprocessableEntityException
import com.gocamargo.ornn.model.dto.ComponentSpecDto
import com.gocamargo.ornn.model.dto.ContentSpecDto
import com.gocamargo.ornn.model.dto.FieldError
import com.gocamargo.ornn.model.enums.ComponentType
import com.gocamargo.ornn.model.enums.Type
import com.google.common.base.Strings.*

inline fun ContentSpecDto.validate() {
    val errors: MutableList<FieldError> = ArrayList()

    if (isNullOrEmpty(this.name))
        errors.add(FieldError("name", MessageSource["string.not.null.or.empty"]))
    if (isNullOrEmpty(this.type))
        errors.add(FieldError("type", MessageSource["string.not.null.or.empty"]))
    try {
        Type.from(this.type)
    } catch (e: Exception) {
        errors.add(FieldError("type", MessageSource["type.invalid"]))
    }
    if (errors.isNotEmpty())
        throw UnprocessableEntityException(errors)
}

inline fun ComponentSpecDto.validate() {
    val errors: MutableList<FieldError> = ArrayList()

    if(isNullOrEmpty(this.type))
        errors.add(FieldError("type", MessageSource["string.not.null.or.empty"]))
    try {
        ComponentType.from(this.type)
    } catch (e: Exception) {
        errors.add(FieldError("type", MessageSource["type.invalid"]))
    }

    if (errors.isNotEmpty())
        throw UnprocessableEntityException(errors)
}