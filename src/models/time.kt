package models

import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "times")
data class Time(
    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uuid", updatable = false, nullable = false)
    var id: UUID = UUID.randomUUID(),

    @Column(name = "date", nullable = false)
    var date: String,

    @Column(name = "entry_time", nullable = false)
    var entryTime: LocalDateTime,

    @Column(name = "lunch_entry_time")
    var lunchEntryTime: LocalDateTime? = null,

    @Column(name = "lunch_exit_time")
    var lunchExitTime: LocalDateTime? = null,

    @Column(name = "exit_time")
    var exitTime: LocalDateTime? = null
) {
    @PrePersist
    fun beforeCreate() {
        if (id == UUID(0, 0)) {
            id = UUID.randomUUID()
        }
    }
}
