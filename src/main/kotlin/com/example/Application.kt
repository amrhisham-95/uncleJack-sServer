package com.example

import com.example.entities.FruitsEntity
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import org.ktorm.database.Database
import org.ktorm.dsl.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    install(ContentNegotiation){
        json()
    }


    configureRouting()
    amr()



  /*  //insert values into sql database
    database.insert(FruitsEntity){
        set(it.Name,"Apple")
        set(it.Type,"Kilo")
        set(it.Price,"50")
        set(it.Image,"Amr")
    }*/

  /*  //read values from sql database (select * from fruits)
    var fruits = database.from(FruitsEntity).select()
    for(row in fruits ){
        println("${row[FruitsEntity.id]} : ${row[FruitsEntity.Name]} : ${row[FruitsEntity.Price]} : ${row[FruitsEntity.Type]} : ${row[FruitsEntity.Image]}")
    }*/



   /* //update on value at specific id
    database.update(FruitsEntity){
        set(it.Name,"orange")
        where {
            it.id eq 1
        }
    }*/



 /*   // delete data row delete from fruits where fruits.id = ?
    database.delete(FruitsEntity){
            it.id eq 1
    }
*/




}