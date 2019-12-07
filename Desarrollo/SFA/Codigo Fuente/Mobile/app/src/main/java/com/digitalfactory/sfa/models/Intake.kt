package com.digitalfactory.sfa.models

import java.io.Serializable

data class Intake(
    val idClient: String?,
    val name: String,
    val quantity: String?,
    val energy: String?,
    val measurer: String?,
    val gateway: String?
) : Serializable {
    constructor() : this("",
        "",
        "",
        "",
        "",
        "")



}