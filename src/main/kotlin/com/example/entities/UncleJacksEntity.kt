package com.example.entities

import com.example.entities.CartInhancementFinalEntity.primaryKey
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


object CartFinalEntity:Table<Nothing>("CartProductsFinal")
{
    val itemPicFinal = varchar("itemPicFinal")
    val itemNameFinal = varchar("itemNameFinal")
    val itemPriceFinal = varchar("itemPriceFinal")
    val itemTypeFinal = varchar("itemTypeFinal")
    val itemQuantityFinal = varchar("itemQuantityFinal")
    val timeDate = varchar("timeDate")
    val namePerson = varchar("namePerson")
    val telephonePerson = varchar("telephonePerson")
    val emailPerson = varchar("emailPerson")
}



object BillFinalEntity:Table<Nothing>("billFinal")
{
    val id = int("id")
    val totalPrice = varchar("totalPrice")
    val serviceFee = varchar("serviceFee")
    val deliveryFee = varchar("deliveryFee")
    val vat = varchar("vat")
    val totalFinalPrice = varchar("totalFinalPrice")
    val longitude = varchar("longitude")
    val latitude = varchar("latitude")
    val phoneNumber = varchar("phoneNumber")
    val namePerson = varchar("namePerson")
    val emailPerson = varchar("emailPerson")
    val timeDate = varchar("timeDate")
}

object CartInhancementFinalEntity:Table<Nothing>("FinalCartData")
{
    val timeDate = varchar("timeDate").primaryKey()
    val namePerson = varchar("namePerson")
    val telephonePerson = varchar("telephonePerson")
    val itemNameFinal = varchar("itemNameFinal")
    val itemPriceFinal = varchar("itemPriceFinal")
    val itemTypeFinal = varchar("itemTypeFinal")
    val itemQuantityFinal = varchar("itemQuantityFinal")
}