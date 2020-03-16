package com.gocamargo.ornn.model

import com.gocamargo.ornn.model.enums.ActionCase
import com.gocamargo.ornn.model.enums.ActionType

data class Action(val type: ActionType, val case: ActionCase, val data: String)