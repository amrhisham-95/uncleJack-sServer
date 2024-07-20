package com.example

import com.example.models.FruitsData
import com.example.plugins.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.application.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.coroutines.runBlocking
import kotlin.text.get


/*fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}*/

 fun main(){
    embeddedServer(Netty, port = 8100, host = "0.0.0.0")
    /* embeddedServer(Netty,  port = (System.getenv("PORT")?:"5000").toInt())*/{


        install(ContentNegotiation){
            json()
        }

      /*  runBlocking {

            val client = HttpClient(CIO){
                this@embeddedServer.install(ContentNegotiation){
                    json()
                }

            }
            val response : HttpResponse =client.get ("https://jsonplaceholder.typicode.com/posts")
            println(response.status)
            client.close()

        }*/

        configureRouting()
        amr()


    }.start(wait = true)
}


fun Application.module() {

   /* install(ContentNegotiation){
        json()
    }*/

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
