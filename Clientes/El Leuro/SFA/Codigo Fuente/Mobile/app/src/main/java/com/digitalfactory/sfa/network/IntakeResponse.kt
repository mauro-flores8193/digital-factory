package com.digitalfactory.sfa.network

import com.digitalfactory.sfa.models.Intake


class IntakeResponse(val sources: List<Intake>?) :
    IntakeApiResponse() {
    constructor() : this(ArrayList<Intake>())
}
