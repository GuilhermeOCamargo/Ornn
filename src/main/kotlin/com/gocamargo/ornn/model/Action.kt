package com.gocamargo.ornn.model

import com.gocamargo.ornn.model.enums.ActionCase

data class Action(val type: String, val case: ActionCase, val data: String)