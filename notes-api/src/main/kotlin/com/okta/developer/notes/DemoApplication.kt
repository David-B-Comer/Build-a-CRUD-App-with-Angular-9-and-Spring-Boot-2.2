package com.okta.developer.notes

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@Entity
data class Note(@Id @GeneratedValue var id: Long? = null,
                var title: String? = null,
                var text: String? = null,
                @JsonIgnore var user: String? = null)

@RepositoryRestResource
interface NotesRepository : JpaRepository<Note, Long>