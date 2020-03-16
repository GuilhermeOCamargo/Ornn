package com.gocamargo.ornn.model.enums

enum class ActionCase(val description: String) {

    DEEP_LINK("deeplink"),
    TOOLTIP("tooltip");

    companion object {
        @JvmStatic
        fun from(value: String): ActionCase =
                ActionCase.values().first { v -> v.description.equals(value, true) }
    }
}