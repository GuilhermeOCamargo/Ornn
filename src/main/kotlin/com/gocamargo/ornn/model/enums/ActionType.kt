package com.gocamargo.ornn.model.enums

enum class ActionType(val description: String) {
    ON_PRESS("onPress"),
    ON_HOLD("onHold");


    companion object {
        @JvmStatic
        fun from(value: String): ActionType =
                values().first { v -> v.description.equals(value, true) }
    }
}