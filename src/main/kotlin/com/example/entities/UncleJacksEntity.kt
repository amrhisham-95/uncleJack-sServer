package com.example.entities

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object FruitsEntity:Table<Nothing>("fruits")
{
    val id = int("id").primaryKey()
    val Name = varchar("Name")
    val Type = varchar("Type")
    val Price = varchar("Price")
    val Image = varchar("Image")
}

object JuicesEntity:Table<Nothing>("juices")
{
    val id = int("id").primaryKey()
    val Name = varchar("Name")
    val Type = varchar("Type")
    val Price = varchar("Price")
    val Image = varchar("Image")
}

object JacksMixesEntity:Table<Nothing>("jacksMixes")
{
    val id = int("id").primaryKey()
    val Name = varchar("Name")
    val Type = varchar("Type")
    val Price = varchar("Price")
    val Image = varchar("Image")
}

object ServicesEntity:Table<Nothing>("services")
{
    val id = int("id").primaryKey()
    val Service = varchar("Service")
    val Delivery = varchar("Delivery")
    val VAT = varchar("VAT")
}
