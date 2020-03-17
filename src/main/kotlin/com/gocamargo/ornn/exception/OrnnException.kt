package com.gocamargo.ornn.exception

import com.gocamargo.ornn.model.dto.FieldError

class UnprocessableEntityException(val errors: List<FieldError>): RuntimeException()