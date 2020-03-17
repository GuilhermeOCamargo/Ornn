package com.gocamargo.ornn.controller

import com.gocamargo.ornn.exception.UnprocessableEntityException
import com.gocamargo.ornn.model.dto.ErrorDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import reactor.core.publisher.Mono

@RestControllerAdvice
class ExceptionHandlerController {

    @ExceptionHandler(UnprocessableEntityException::class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    fun handleUnprocessableEntity(e: UnprocessableEntityException): Mono<ErrorDto> {
        return Mono.just(ErrorDto(422, System.currentTimeMillis(), e.errors))
    }
}