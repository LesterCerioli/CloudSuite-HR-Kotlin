package domain_contracts

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
interface TimeRepository : JpaRepository<Time, UUID> {
    fun findByDate(date: LocalDate): List<Time>
}