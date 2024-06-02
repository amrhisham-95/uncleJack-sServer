package com.example.plugins

import com.example.routing.fruitsRoutes
import com.example.routing.jacksMixesRoutes
import com.example.routing.juicesRoutes
import com.example.routing.servicesRoutes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import java.io.File

fun Application.configureRouting() {
    routing {
      /*  get("/") {
            println("URI : ${call.request.uri}")


            println("Headers: ${call.request.headers}")
            println("Headers: ${call.request.headers.names()}")



            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Accept: ${call.request.headers["Accept"]}")



            println("Query Params: ${call.request.queryParameters.names()}")
            println("Name: ${call.request.queryParameters["name"]}")
            println("Name: ${call.request.queryParameters["email"]}")

            call.respondText("Hello World!")
        }*/


     /*   get("/notes/{page}"){
            val pageNumber = call.parameters["page"]
            call.respondText("You are on page Number: $pageNumber")
        }*/


        //ابعت الداتا من الpostman الى التطبيق
       /* post("/login"){
            val userInfo = call.receive<UserInfo>()
            println(userInfo)
            call.respondText ("Everything is working")
        }*/


      /*  //تغيير الايرور و الستاتيوس في postman
        get("/"){
            call.respondText("hello world", status = HttpStatusCode.GatewayTimeout)
        }*/


       /* // ابعت الداتا من التطبيق الى الpostman
        get ("/"){
            val responseObj = UserResponse("amr","amrHisham9524@gmail.com")
            call.respond(responseObj)
        }*/

   /*     //اضيف قيمة واسم للheaders
        get("/headers"){
            call.response.headers.append("server-name","ktorServer")
            call.respondText("headers Attached")
        }*/


      /*  //download image
        get("/fileDownload"){
            val file = File("files/1.jpg")
            call.response.header(
                HttpHeaders.ContentDisposition,
                ContentDisposition.Attachment.withParameter(
                    ContentDisposition.Parameters.FileName,"downloadableImage.jpg"
                ).toString()
            )
            call.respondFile(file)
        }*/

     /*   //image open
        get("/fileOpen"){
            val file = File("files/2.png")
            call.response.header(
                HttpHeaders.ContentDisposition,
                ContentDisposition.Inline.withParameter(
                    ContentDisposition.Parameters.FileName,"openImage.png"
                ).toString()
            )
            call.respondFile(file)
        }*/
    }

    fruitsRoutes()
    juicesRoutes()
    jacksMixesRoutes()
    servicesRoutes()


}

@Serializable
data class UserInfo(
    val email :String,
    val password:String
)


@Serializable
data class UserResponse(
    val name :String,
    val email:String
)

fun Application.amr(){
    routing {
        get("/amr"){
            call.respondText("Hello Amr")
        }

        get("/amrHisham"){
            call.respondText("Hello Amr Hisham")
        }
    }
}