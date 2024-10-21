package dto

import java.time.LocalDateTime
import java.util.*


class TimeDTO {

    var id: UUID
    var date: String? = null
    var entryTime: LocalDateTime? = null
    var lunchEntryTime: LocalDateTime? = null
    var lunchExitTime: LocalDateTime? = null
    var exitTime: LocalDateTime? = null


    constructor() {
        this.id = UUID.randomUUID()
    }

    constructor(
        id: UUID,
        date: String?,
        entryTime: LocalDateTime?,
        lunchEntryTime: LocalDateTime?,
        lunchExitTime: LocalDateTime?,
        exitTime: LocalDateTime?
    ) {
        this.id = id
        this.date = date
        this.entryTime = entryTime
        this.lunchEntryTime = lunchEntryTime
        this.lunchExitTime = lunchExitTime
        this.exitTime = exitTime
    }
}
