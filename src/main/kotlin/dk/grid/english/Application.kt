package dk.grid.english

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import dk.grid.plugins.*

//fun main() {
//    embeddedServer(Netty, port = 8081, host = "0.0.0.0") {
//        configureRouting()
//        configureTemplating()
//        //configureSecurity()
//    }.start(wait = true)
//}

fun main(args: Array<String>): Unit = EngineMain.main(args)

