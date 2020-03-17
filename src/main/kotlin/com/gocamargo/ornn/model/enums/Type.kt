package com.gocamargo.ornn.model.enums

enum class Type(val description: String) {
    STRING("String"),
    INT("Int"),
    DOUBLE("Double");

    companion object{
        @JvmStatic
        fun from(value: String){
            values().first{v-> v.description.equals(value, true)}
        }
    }
}