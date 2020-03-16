package com.gocamargo.ornn.model.enums

enum class ComponentType(val description: String) {
    CAROUSEL_ROW("carousel"),
    TITLE_ROW("title");

    companion object {
        @JvmStatic
        fun from(value: String): ComponentType =
                ComponentType.values().first { v -> v.description.equals(value, true) }
    }
}