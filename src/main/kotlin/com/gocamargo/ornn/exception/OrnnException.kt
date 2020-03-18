package com.gocamargo.ornn.exception

import com.gocamargo.ornn.model.dto.FieldError

class UnprocessableEntityException(val errors: List<FieldError>): RuntimeException()
class DuplicatedEntityException(override val message: String): RuntimeException(message)
class ObjectNotFoundException(override val message: String): RuntimeException(message)