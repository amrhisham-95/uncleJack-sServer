package com.example.db

import org.ktorm.database.Database

object DatabaseConnection {
    //connect the app with my sql database
    val database = Database.connect(
        url = "jdbc:mysql://127.0.0.1:3306/uncleJacks",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "AMR1924*#HISHAM1924*#DIAB1924*#AMR"
    )
}