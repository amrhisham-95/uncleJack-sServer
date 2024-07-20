package com.example.routing

import  com.example.db.DatabaseConnection
import com.example.entities.*
import com.example.models.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.dsl.*

fun Application.fruitsRoutes() {
    val db = DatabaseConnection.database
    routing {

        //insert data for database inside IntelliJ and read all data on postman
        get("/fruits") {
          /*  db.insert(FruitsEntity) {
                set(it.Name, "أفوكادو")
                set(it.Type, "كيلو")
                set(it.Price, "180")
                set(
                    it.Image,
                    "https://media1.popsugar-assets.com/files/thumbor/gYK73Fwr-10oYtY1jsHfQkpzrlc/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2020/04/02/334/n/44344583/tmp_qEYr1S_a3afd4007c1aed11_shutterstock_1058981363.jpg"
                )
            }
            db.insert(FruitsEntity) {
                set(it.Name, "أناناس سكري")
                set(it.Type, "كيلو")
                set(it.Price, "155")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/R.5abd7a1765d4533cb4e056452f228fb8?rik=QWSdSaV6lV4mUw&pid=ImgRaw&r=0"
                )
            }
            db.insert(FruitsEntity) {
                set(it.Name, "باباظ سكري")
                set(it.Type, "كيلو")
                set(it.Price, "25")
                set(it.Image, "https://backend.lassana.com/images/products/Papaya--1584358144--1584515385.jpg")
            }
            db.insert(FruitsEntity) {
                set(it.Name, "برتقال بلدي مسكر")
                set(it.Type, "كيلو")
                set(it.Price, "12")
                set(
                    it.Image,
                    "https://orangealhreeq.com/storage/products/images/600/12_i9KT7s8Xu6S8BqNooZNOj739VNmZ79RUyKVRDiRO.jpeg"
                )
            }
            db.insert(FruitsEntity) {
                set(it.Name, "تفاح أخضر إيطالي")
                set(it.Type, "كيلو")
                set(it.Price, "85")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/OIP.n_CQTHRbeNZD_bP_zVa0NwAAAA?w=474&h=503&rs=1&pid=ImgDetMain"
                )
            }

            db.insert(FruitsEntity) {
                set(it.Name, "تفاح أصفر إيطالي")
                set(it.Type, "كيلو")
                set(it.Price, "70")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/R.43c2a235bac32d1936c1a62f70ac394e?rik=m10y%2byxWiTOJOQ&pid=ImgRaw&r=0"
                )
            }

            db.insert(FruitsEntity) {

                set(it.Name, "تفاح سكري سوري")
                set(it.Type, "كيلو")
                set(it.Price, "75")
                set(it.Image, "https://inno-themes-prod.s3.me-south-1.amazonaws.com/blackberry_wp/126.jpg")
            }

            db.insert(FruitsEntity) {
                set(it.Name, "توت أسباني أسود")
                set(it.Type, "كيلو")
                set(it.Price, "30")
                set(it.Image, "https://th.bing.com/th/id/OIP.I08CD9AnVWKXCtdVcDQ66gAAAA?rs=1&pid=ImgDetMain")
            }
            db.insert(FruitsEntity) {
                set(it.Name, "جريب فروت")
                set(it.Type, "كيلو")
                set(it.Price, "20")
                set(it.Image, "https://th.bing.com/th/id/OIP.gKlb7XIT35Rc_708J2OfPwHaF4?rs=1&pid=ImgDetMain")
            }

            db.insert(FruitsEntity) {
                set(it.Name, "خوخ فلوريدا")
                set(it.Type, "كيلو")
                set(it.Price, "45")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/R.3198ceb43dbce6375c7a68e558b283da?rik=DJ2D7IdFA5uEuw&riu=http%3a%2f%2fwww.bardifoods.com%2fwp-content%2fuploads%2f2019%2f12%2f6-1-570x570.png&ehk=xSM%2fn8Z60QKGatmW4ctYj02Ixzy%2bCvS7wa69HZMfqF0%3d&risl=&pid=ImgRaw&r=0"
                )
            }

            db.insert(FruitsEntity) {
                set(it.Name, "شهد منجاوي")
                set(it.Type, "كيلو")
                set(it.Price, "15")
                set(
                    it.Image,
                    "https://img.freepik.com/premium-photo/melon-whole-isolated-white-background-top-view-flat-lay_438009-5093.jpg"
                )
            }

            db.insert(FruitsEntity) {
                set(it.Name, "عنب أسود مستورد")
                set(it.Type, "كيلو")
                set(it.Price, "100")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/R.b8218b911fc107e18de23bff536ff3fe?rik=BKUavFIiuINEYA&pid=ImgRaw&r=0"
                )
            }

            db.insert(FruitsEntity) {
                set(it.Name, "قرع عسل")
                set(it.Type, "كيلو")
                set(it.Price, "25")
                set(it.Image, "https://patchpuppy.com/wp-content/uploads/2021/08/Increasefiber-364x248.jpg")
            }
            db.insert(FruitsEntity) {
                set(it.Name, "قصب نتقشر")
                set(it.Type, "كيلو")
                set(it.Price, "30")
                set(it.Image, "https://media.gemini.media/img/large/2017/1/18/2017_1_18_17_39_41_825.jpg")
            }

            db.insert(FruitsEntity) {
                set(it.Name, "كمثرى أفريقي")
                set(it.Type, "كيلو")
                set(it.Price, "125")
                set(
                    it.Image,
                    "https://images.yaoota.com/yDlDYBU843Jc0uISG8bW33ty8ao=/trim/fit-in/500x500/filters:quality(80)/yaootaweb-production/media/crawledproductimages/9e54cb9f2b8cac6b300b5e3eec2b643e8e4a07ba.jpg"
                )
            }

            db.insert(FruitsEntity) {
                set(it.Name, "كيوي")
                set(it.Type, "كيلو")
                set(it.Price, "85")
                set(it.Image, "https://th.bing.com/th/id/OIP.pdt313qKZWa4Idzgdn7X2wHaFj?rs=1&pid=ImgDetMain")
            }
            db.insert(FruitsEntity) {
                set(it.Name, "مركوت يوسفي")
                set(it.Type, "كيلو")
                set(it.Price, "25")
                set(it.Image, "https://th.bing.com/th/id/OIP.0Sz4kizSHpLwiOu_sp04JQHaGv?rs=1&pid=ImgDetMain")
            }

            db.insert(FruitsEntity) {

                set(it.Name, "مشمش بشاير")
                set(it.Type, "كيلو")
                set(it.Price, "90")
                set(
                    it.Image,
                    "https://th.bing.com/th/id/R.8d1a58729f385cbf7ab29461c1ad0a4e?rik=fnIsQf0fDeQluA&riu=http%3a%2f%2fwww.stepbystep.com%2fwp-content%2fuploads%2f2013%2f04%2fApricots-Delicious-Fruits-in-the-World.jpg&ehk=QtlV3bpA1xjsTmi6RkoGlvn8gU20RXfNuPDfpX13Akw%3d&risl=&pid=ImgRaw&r=0"
                )


                db.insert(FruitsEntity) {
                    set(it.Name, "مانجو صديقة صعيدي")
                    set(it.Type, "كيلو")
                    set(it.Price, "50")
                    set(it.Image, "https://www.osmanmarket.com/us/136/pidwebp600/5286/f133004681469472003114-1.webp")
                }


                db.insert(FruitsEntity) {
                    set(it.Name, "عنب أخضر")
                    set(it.Type, "كيلو")
                    set(it.Price, "50")
                    set(
                        it.Image,
                        "https://th.bing.com/th/id/R.a4e3376c12fd22095859fb8ece3d0c5c?rik=cltg0uPqWbecbQ&pid=ImgRaw&r=0"
                    )
                }

                db.insert(FruitsEntity) {
                    set(it.Name, "برقوق أحمر")
                    set(it.Type, "كيلو")
                    set(it.Price, "60")
                    set(it.Image, "https://th.bing.com/th/id/OIP.AVYBnXrU754fbrXn3ROqfAHaEt?rs=1&pid=ImgDetMain")
                }

                db.insert(FruitsEntity) {
                    set(it.Name, "جوافة بناتي")
                    set(it.Type, "كيلو")
                    set(it.Price, "35")
                    set(
                        it.Image,
                        "https://th.bing.com/th/id/R.72e565d8dddea2eafca33fc562883469?rik=J0E71C5q3sa2vA&pid=ImgRaw&r=0&sres=1&sresct=1"
                    )
                }

                db.insert(FruitsEntity) {
                    set(it.Name, "تفاح أحمر ريد كاب")
                    set(it.Type, "كيلو")
                    set(it.Price, "85")
                    set(it.Image, "https://th.bing.com/th/id/OIP.pN-rb7bSN74RHrQZZMmoKAHaFj?rs=1&pid=ImgDetMain")
                }
            }*/

            //call.respondText("returning all fruits")
            val fruits = db.from(FruitsEntity).select().map {
                val id = it[FruitsEntity.id]
                val Name = it[FruitsEntity.Name]
                val Type = it[FruitsEntity.Type]
                val Price = it[FruitsEntity.Price]
                val Image = it[FruitsEntity.Image]

                FruitsData(id ?: -1, Name ?: "", Type ?: "", Price ?: "", Image ?: "")
            }
            call.respond(fruits)
        }


        //insert data to database من خلال اني ادخل الداتا من postman واعملها post
        post("/fruits") {
            val request = call.receive<FruitsDataPosting>()
            val result = db.insert(FruitsEntity) {
                set(it.Name, request.Name)
                set(it.Type, request.Type)
                set(it.Price, request.Price)
                set(it.Image, request.Image)
            }
            if (result == 1) {
                //send success
                call.respond(
                    HttpStatusCode.OK, FruitsResponse(
                        success = true,
                        data = "values has been successfully inserted"
                    )
                )
            } else {
                //send failuire
                call.respond(
                    HttpStatusCode.BadRequest, FruitsResponse(
                        success = false,
                        data = "failed to insert values"
                    )
                )
            }
        }


        //update on data من خلال postman by id
        put("/fruits/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1
            val updateFruits = call.receive<FruitsDataPosting>()

            val rowsEffected = db.update(FruitsEntity) {
                set(it.Name, updateFruits.Name)
                set(it.Type, updateFruits.Type)
                set(it.Price, updateFruits.Price)
                set(it.Image, updateFruits.Image)

                where {
                    it.id eq id
                }
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been updated", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to update", false))
            }
        }


        //delete data row by id from postman
        delete("/fruits/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1

            val rowsEffected = db.delete(FruitsEntity) {
                it.id eq id
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been deleted", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to delete", false))
            }
        }


    }
}

fun Application.juicesRoutes() {
    val db = DatabaseConnection.database
    routing {
        get("/juices") {
             /* db.insert(JuicesEntity) {
                  set(it.Name, "آيس بوريو")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.rOERPIqD6Qxe0RT_zQnV3QAAAA?w=444&h=403&rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "آيس كراميل")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://hsaa.hsobjects.com/h/menuitems/images/012/378/742/681c59c917681de4684779166be05db2-size1200.jpg"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "آيس كوفي")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://www.thaqfny.com/wp-content/uploads/2021/08/c413276263ba87942bd70a9bb1eecd05_w750_h750.jpg"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك هوهوز")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://i.ytimg.com/vi/M7R4cN1cd1E/maxresdefault.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك نيسكافيه")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.6315e4d3c1600a014007f527aec5ffa3?rik=C4IwaghAo8iJ8w&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك مانجو")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.1712157725b6ae8663dd147af3a80256?rik=YVYVPbE6Dil%2b4g&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك كيت كات")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.L5zn5ePnDvZtxpIek43m9QHaHa?rs=1&pid=ImgDetMain"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك كراميل")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.1d078f19e9bdeea74dcd63a4f927ef40?rik=EcsY5ySY4LrGGA&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك كادبوري")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.456a0d9469b10efbb912c2dbb3e8bb03?rik=5B7Iu3CDRtJR5A&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك فراولة")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.En7KynxtBV2r0-ie-VQfdwHaHa?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك فانيليا")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.eoR9jkBUu8A3TEoujw7eYgAAAA?w=368&h=534&rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك شوكليت")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.af9e6852894b3d4eda56bfd7bacc87c3?rik=2GTx8eWYJXFR3g&pid=ImgRaw&r=0"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك سنيكرز")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.e8676400fae772a5827cad5fe69cd121?rik=wSVe%2fQJ2aGhphQ&riu=http%3a%2f%2fwasfetmama.com%2fwp-content%2fuploads%2f2020%2f08%2f863fc436eca4b030735948141408a5ce-size900.jpeg&ehk=kJk8rAbbJJCdGLwCcXrJOplsJyGdcvq%2bwLaLoefiaYU%3d&risl=&pid=ImgRaw&r=0"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك خوخ")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.FtVFXUM8RqapGluRbE5LCAHaD_?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك توينكز")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://i.ytimg.com/vi/5jtIO9Hv91c/maxresdefault.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك توت")
                  set(it.Type, "آيس")
                  set(it.Price, "40")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.3cF_MLFAXz_mkvxz2SGBfwHaDh?rs=1&pid=ImgDetMain"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "ميلك إم آند إم")
                  set(it.Type, "آيس")
                  set(it.Price, "55")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.77d5c60c8bb2e180670c2652e1162a09?rik=TEdaQFK4PJinAA&riu=http%3a%2f%2fsonicmenuprices.com%2fwp-content%2fuploads%2f2023%2f04%2fSonic-25.jpg&ehk=y6MnLZFGnX8XSqL6B9pcX1%2b0byJ5QBcym0SIR0Y0ers%3d&risl=&pid=ImgRaw&r=0"
                  )
              }



              db.insert(JuicesEntity) {
                  set(it.Name, "أفوكادو فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "65")
                  set(
                      it.Image,
                      "https://yummy.awicdn.com/site-images/sites/default/files/prod/recipe/8/4/465200/4831d89ef1419998858426501e9f95816c04fa2b-230322174340.jpg?preset=article-main-img&save-png=1&rnd=1519151RND220215"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "أفوكادو كاجو")
                  set(it.Type, "فريش")
                  set(it.Price, "80")
                  set(
                      it.Image,
                      "https://images.deliveryhero.io/image/talabat/MenuItems/avocado_with_cashew_juice637849513481194215.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "أفوكادو مانجو جرجير")
                  set(it.Type, "فريش")
                  set(it.Price, "80")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.24fb562e2ce42db05280d33c57a8e9f1?rik=iejINJNcEjRAwQ&riu=http%3a%2f%2fi-exc.ccm2.net%2fiex%2f1280%2f1221354869%2f1368807.jpg&ehk=VocxA61jeYenGoIimLjiMKI02h6x6WeskVULLAet00A%3d&risl=&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "أفوكادو ميكس")
                  set(it.Type, "فريش")
                  set(it.Price, "90")
                  set(
                      it.Image,
                      "https://ketopots.com/wp-content/uploads/2019/08/5a-keto-avocado-green-breakfast-smoothie-square-768x768.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "برتقال فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "15")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.01406f9e8ffcfb3e1221e809dd34c68d?rik=sPjR4jIryxq%2bYg&pid=ImgRaw&r=0"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "أناناس فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "60")
                  set(
                      it.Image,
                      "https://s3.amazonaws.com/YouGarden/Web/500x500/340031_3.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "بطيخ فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://www.thepetitecook.com/wp-content/uploads/2015/08/watermelon-summer-smoothie.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "بلح باللبن فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.d0edc74ae149c5a04be6c08d32cf8be4?rik=9Lc5u9JilR4dhA&riu=http%3a%2f%2f4.bp.blogspot.com%2f-W9aw6BXu7YY%2fUWEiNWKqUyI%2fAAAAAAAADCw%2fPxy9FWvfg34%2fs1600%2fbananadatesmilkshake3.jpg&ehk=H7bFNY%2fySh7sX0DxNWqOBusgMz9ZfYUo6p%2bgDndyXeM%3d&risl=&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "تين شوكي فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://watanimg.elwatannews.com/image_archive/648x316/20474068711659100739.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "جوافة فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://thumbs.dreamstime.com/b/glass-guava-smoothie-fruit-isolated-white-background-89436782.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "حرنكش فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.MOKoVvhQUut9hU09QoTDaQAAAA?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "خوخ فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.hJ0SZ1C5rpx3FD6cXOpX-QHaHg?w=618&h=626&rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "رمان فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://5.imimg.com/data5/OV/GO/MY-48086951/dadam-anar-soft-drink-concentrate-500x500.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "فراولة فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://e7.pngegg.com/pngimages/705/502/png-clipart-strawberry-juice-illustration-orange-juice-milkshake-soft-drink-smoothie-food-ice-cream-pattern-strawberry-juice-cream-frutti-di-bosco.png"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "قصب فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "15")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.jx971vOd2mrDnZ6x9oDzFAHaIV?w=510&h=574&rs=1&pid=ImgDetMain"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "كيوي فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "45")
                  set(
                      it.Image,
                      "https://www.cleaneatingkitchen.com/wp-content/uploads/2022/12/kiwi-juice-in-tall-glass-300x450.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "لمون نعناع فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://www.alrakia.com/wp-content/uploads/2017/10/%D8%B9%D8%B5%D9%8A%D8%B1-%D8%A7%D9%84%D9%84%D9%8A%D9%85%D9%88%D9%86.png"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "مانجو فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://png.pngtree.com/png-clipart/20220124/original/pngtree-mango-mango-juice-png-image_7199742.png"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "موز فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.9PrNxbU6mRjsXAgeyovo1gHaIV?w=700&h=788&rs=1&pid=ImgDetMain"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "يوسفي فريش")
                  set(it.Type, "فريش")
                  set(it.Price, "30")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.x6ci0bKTGQD0YA51-ofo7wHaLM?rs=1&pid=ImgDetMain"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "أناناس سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://kitchen.sayidaty.net/uploads/small/0d/0d4ecddbca33721481aac770811c28a0_w550_h550.jpg"
                  )
              }



              db.insert(JuicesEntity) {
                  set(it.Name, "بلح سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.SBcWobCpGwcD2p1xI0pZcAHaEP?w=500&h=286&rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "تفاح أخضر سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.CR83uoc0PEvD031kn4deSQAAAA?w=400&h=600&rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "توت سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.Yl0Q6oessrz9flqsJ5VJHAHaFA?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "خوخ سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.__cka3zCdToREKboGf32hwHaLG?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "زبادي فراولة سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.c-CqWMcAMvLit8unxY8-iQHaEK?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "فراولة سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.350d1222bb6e587419a4ae61f61f7fc5?rik=F05CTS9RZrhcmQ&pid=ImgRaw&r=0"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "لمون نعناع سموزي")
                  set(it.Type, "سموزي")
                  set(it.Price, "50")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.990844f2f94b85b7d94f3edaf4d8153c?rik=U4Czq3KuLTWcEg&pid=ImgRaw&r=0&sres=1&sresct=1"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "أناناس صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.5d988cdfda227e80256bfe44ccaf7b83?rik=Ie%2b6aQ25HVbafA&riu=http%3a%2f%2f1.bp.blogspot.com%2f-yEihxGcPIBw%2fU3XRbrNqh3I%2fAAAAAAAAABU%2flQKIY1_kQ6o%2fs1600%2fPineapple-Soda-Square.jpg&ehk=xTt0rcckubiOktAQWPK0EUlgVoVygPoA85bjl%2fEMatQ%3d&risl=&pid=ImgRaw&r=0"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "باشون فروت صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://i.pinimg.com/originals/c9/c6/36/c9c6362b918aee12fb8740d321e49b09.jpg"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "تفاح صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.KprgRfaJgNCr4ki8VjqHqwHaHa?rs=1&pid=ImgDetMain"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "توت صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://i0.wp.com/www.lowcarbsosimple.com/wp-content/uploads/2013/08/RaspberrySurprise-7425G.jpg?resize=528%2C528&ssl=1"
                  )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "خوخ صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.9ueFJ5uu6h6YIfZkyNcPgAHaE8?rs=1&pid=ImgDetMain"
                      )
              }


              db.insert(JuicesEntity) {
                  set(it.Name, "فراولة صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://www.acouplecooks.com/wp-content/uploads/2021/06/Strawberry-Soda-001.jpg"
                  )
              }



              db.insert(JuicesEntity) {
                  set(it.Name, "كريز صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.Elt14i-uphUWPpIsbk8X5QHaMY?rs=1&pid=ImgDetMain"
                  )
              }



              db.insert(JuicesEntity) {
                  set(it.Name, "كولا صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/OIP.zvuSetSDZFQro9GAbNJN3gAAAA?rs=1&pid=ImgDetMain"
                  )
              }



              db.insert(JuicesEntity) {
                  set(it.Name, "نعناع صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://th.bing.com/th/id/R.c84b3369b55f506b631bd544fa0e9df8?rik=Iv3fE1rHK8qrjQ&riu=http%3a%2f%2fwww.vegfamily.com%2fwp-content%2fuploads%2f2014%2f10%2flemonmint-soda.jpg&ehk=ZtBLJtymw0JVpx9xoydBgt4vL93a%2bsaOIIjxS%2b9wiZI%3d&risl=&pid=ImgRaw&r=0"
                  )
              }

              db.insert(JuicesEntity) {
                  set(it.Name, "مانجو صودا")
                  set(it.Type, "صودا")
                  set(it.Price, "35")
                  set(
                      it.Image,
                      "https://www.1883.com/app/uploads/2021/05/mango-soda.jpg"
                  )
              }*/


            //call.respondText("returning all juices")
            val juices = db.from(JuicesEntity).select().map {
                val id = it[JuicesEntity.id]
                val Name = it[JuicesEntity.Name]
                val Type = it[JuicesEntity.Type]
                val Price = it[JuicesEntity.Price]
                val Image = it[JuicesEntity.Image]

                JuicesData(id ?: -1, Name ?: "", Type ?: "", Price ?: "", Image ?: "")
            }
            call.respond(juices)
        }


        //update on data من خلال postman by id
        put("/juices/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1
            val updateJuices = call.receive<JuicesDataPosting>()

            val rowsEffected = db.update(JuicesEntity) {
                set(it.Name, updateJuices.Name)
                set(it.Type, updateJuices.Type)
                set(it.Price, updateJuices.Price)
                set(it.Image, updateJuices.Image)

                where {
                    it.id eq id
                }
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been updated", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to update", false))
            }
        }


        //delete data row by id from postman
        delete("/juices/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1

            val rowsEffected = db.delete(JuicesEntity) {
                it.id eq id
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been deleted", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to delete", false))
            }
        }
    }
}

fun Application.jacksMixesRoutes() {
    val db = DatabaseConnection.database

    routing {
        get("/jacksMixes") {
            /* db.insert(JacksMixesEntity) {
                   set(it.Name, "استيك نوتيلا")
                   set(it.Type, "استيك نوتيلا")
                   set(it.Price, "20")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/OIP.OQDqPAOayeeg9MVgKiwKWQAAAA?w=320&h=320&rs=1&pid=ImgDetMain"
                   )
               }


               db.insert(JacksMixesEntity) {
                   set(it.Name, "القبطان")
                   set(it.Type, "مانجو - سوبيا - آيس كريم")
                   set(it.Price, "40")
                   set(
                       it.Image,
                       "https://shamlola.s3.amazonaws.com/Shamlola_Images/8/src/916627a6fee42c5d4e5566807cd168e7dd3d67bd.jpg"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "بروتين")
                   set(it.Type, "بلح باللبن - مانجو - عسل - آيس كريم - مكسرات")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://media.linkonlineworld.com/img/large/2017/2/6/2017_2_6_13_5_54_625.jpg"
                   )
               }


               db.insert(JacksMixesEntity) {
                   set(it.Name, "روميو و جوليت")
                   set(it.Type, "رمان - مانجو - فراولة")
                   set(it.Price, "40")
                   set(
                       it.Image,
                       "https://img-global.cpcdn.com/recipes/269bba2e3369da27/1200x630cq70/photo.jpg"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "طاقة")
                   set(it.Type, "بلح باللبن - أوريو - آيس كريم")
                   set(it.Price, "45")
                   set(
                       it.Image,
                       "https://blogscdn.thehut.net/app/uploads/sites/19/2020/12/Copy-of-Untitled-4_1608203046-176x265.png"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "فخفخينا")
                   set(it.Type, "ميكس فاكهة - عصير  - آيس كريم - صوص - مكسرات")
                   set(it.Price, "50")
                   set(
                       it.Image,
                       "https://i.pinimg.com/originals/61/a3/cb/61a3cbcc124597be70024d88e4cc85e6.png"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "فروت سلاط")
                   set(it.Type, "ميكس فاكهة - عصير - صوص - مكسرات")
                   set(it.Price, "40")
                   set(
                       it.Image,
                       "https://img.freepik.com/premium-photo/bowl-fruit-salad-with-green-leaf-background_900321-26417.jpg"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "قنبلة شوكليت كيك")
                   set(it.Type, "شوكليت كيك - قطع شوكليت - مكسرات - صوص شوكليت - آيس كريم")
                   set(it.Price, "20")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/OIP.IWGqe7Fh5WBiU7CCMzpuSwHaFD?rs=1&pid=ImgDetMain"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "قنبلة فاكهة")
                   set(it.Type, "ميكس فاكهة - عصير مانجو - آيس كريم - بسبوسة - كنافة - مكسرات - صوص فراولة")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://shattacmon.com/wp-content/uploads/2021/10/WhatsApp-Image-2021-10-27-at-6.25.38-PM.jpeg"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "قنبلة كيك فراولة")
                   set(it.Type, " كيك فانيليا - قطع شوكليت - مكسرات - صوص فراولة - آيس كريم")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://www.supermama.me/system/App/Entities/Recipe/images/000/050/581/watermarked/%25D9%2583%25D9%258A%25D9%2583-%25D8%25A7%25D9%2584%25D9%2581%25D8%25B1%25D9%2588%25D9%2584%25D8%25A9-%25D8%25A8%25D8%25A7%25D9%2584%25D9%2583%25D8%25B1%25D9%258A%25D9%2585%25D8%25A9.jpg"
                   )
               }


               db.insert(JacksMixesEntity) {
                   set(it.Name, "مارينا")
                   set(it.Type, "مانجو - قطع موز")
                   set(it.Price, "40")
                   set(
                       it.Image,
                       "https://shamlola.s3.amazonaws.com/Shamlola_Images/4/src/ba1c8caa4acd9a2480d973ab7ec73ed54db9a561.jpg"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل أناناس")
                   set(it.Type, "وافل")
                   set(it.Price, "80")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/OIP.T68DvpH1RLiUV6cRXxgXaAHaE9?rs=1&pid=ImgDetMain"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل إم آند إم")
                   set(it.Type, "وافل")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/OIP.Pi7SFkfcIOqoTivvLMFrKwHaFc?rs=1&pid=ImgDetMain"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل سنيكرز")
                   set(it.Type, "وافل")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/R.81751aa4d9381be2af2a6c85488fd612?rik=KH77jL%2fNUz6Y8Q&pid=ImgRaw&r=0"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل شوكليت")
                   set(it.Type, "وافل")
                   set(it.Price, "40")
                   set(
                       it.Image, "https://th.bing.com/th/id/OIP.5kGhJtUXYXwfUcDleVot0gHaHa?rs=1&pid=ImgDetMain"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل كادبوري")
                   set(it.Type, "وافل")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/R.e0511f85c21984b4b6c9a3e2b04f9d6d?rik=fcdSzffzlDDkdQ&riu=http%3a%2f%2fibakeheshoots.com%2fwp-content%2fuploads%2f2014%2f04%2fchocolate_waffles-5.jpg&ehk=y3KM%2fszK%2b5bXP5CNDmGAow70PGCf%2bGhpI02Vo%2f84m1U%3d&risl=&pid=ImgRaw&r=0"
                   )
               }


               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل كيت كات")
                   set(it.Type, "وافل")
                   set(it.Price, "60")
                   set(
                       it.Image,
                       "https://99pancakes.in/cdn/shop/products/KitKat_1.jpg?v=1677245695&width=1080"
                   )
               }


               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل ميكس شوكليت")
                   set(it.Type, "وافل")
                   set(it.Price, "65")
                   set(
                       it.Image,
                       "https://jmposner.e2ecdn.uk/Products/waffle-stock-014-web.jpg?w=1000&h=1000&quality=90&scale=canvas"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "وافل ميكس فروت")
                   set(it.Type, "وافل")
                   set(it.Price, "50")
                   set(
                       it.Image,
                       "https://th.bing.com/th/id/R.e91b7c4b93c6608fc7aac558eb36e47b?rik=ddiYQVQgnped3g&pid=ImgRaw&r=0"
                   )
               }

               db.insert(JacksMixesEntity) {
                   set(it.Name, "ويتش آيس كريم")
                   set(it.Type, "ويتش آيس")
                   set(it.Price, "40")
                   set(
                       it.Image,
                       "https://images.squarespace-cdn.com/content/v1/5bcf8df392441bc70d809098/1582590958629-3T5IF9JHXT8LXY04XZ7U/big-vanilla-sandwich.v1.jpg"
                   )
               }*/


            //call.respondText("returning all mixes")

            val jackMixes = db.from(JacksMixesEntity).select().map {
                val id = it[JacksMixesEntity.id]
                val Name = it[JacksMixesEntity.Name]
                val Type = it[JacksMixesEntity.Type]
                val Price = it[JacksMixesEntity.Price]
                val Image = it[JacksMixesEntity.Image]

                JacksMixesData(id ?: -1, Name ?: "", Type ?: "", Price ?: "", Image ?: "")
            }
            call.respond(jackMixes)
        }

        //update on data من خلال postman by id
        put("/jacksMixes/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1
            val updateJacksMixes = call.receive<JacksMixesDataPosting>()

            val rowsEffected = db.update(JacksMixesEntity) {
                set(it.Name, updateJacksMixes.Name)
                set(it.Type, updateJacksMixes.Type)
                set(it.Price, updateJacksMixes.Price)
                set(it.Image, updateJacksMixes.Image)

                where {
                    it.id eq id
                }
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been updated", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to update", false))
            }
        }

        //delete data row by id from postman
        delete("/jacksMixes/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1

            val rowsEffected = db.delete(JacksMixesEntity) {
                it.id eq id
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been deleted", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to delete", false))
            }
        }
    }
}

fun Application.servicesRoutes() {
    val db = DatabaseConnection.database

    routing {
        get("/services") {
               /*  db.insert(ServicesEntity) {
                      set(it.Service, "0")
                      set(it.Delivery, "15")
                      set(it.VAT, "0")
                  }*/

            //call.respondText("returning all services")

            val services = db.from(ServicesEntity).select().map {
                val id = it[ServicesEntity.id]
                val Service = it[ServicesEntity.Service]
                val Delivery = it[ServicesEntity.Delivery]
                val VAT = it[ServicesEntity.VAT]

                ServicesData(id ?: -1, Service ?: "", Delivery ?: "", VAT ?: "")
            }
            call.respond(services)


        }


        //update on data من خلال postman by id
        put("/services/{id}") {
            val id = call.parameters["id"]?.toInt() ?: -1
            val updateJacksMixes = call.receive<ServicesDataPosting>()

            val rowsEffected = db.update(ServicesEntity) {
                set(it.Service, updateJacksMixes.Service)
                set(it.Delivery, updateJacksMixes.Delivery)
                set(it.VAT, updateJacksMixes.VAT)

                where {
                    it.id eq id
                }
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been updated", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to update", false))
            }
        }
    }
}

fun Application.cartFinalRoutes() {
    val db = DatabaseConnection.database
    routing {
        get("/cartFinal") {
            //call.respondText("returning all CartFinalEntity")
            val cartFinal = db.from(CartFinalEntity).select().map {
                val itemPicFinal = it[CartFinalEntity.itemPicFinal]
                val itemNameFinal = it[CartFinalEntity.itemNameFinal]
                val itemPriceFinal = it[CartFinalEntity.itemPriceFinal]
                val itemTypeFinal = it[CartFinalEntity.itemTypeFinal]
                val itemQuantityFinal = it[CartFinalEntity.itemQuantityFinal]
                val timeDate = it[CartFinalEntity.timeDate]
                val namePerson = it[CartFinalEntity.namePerson]
                val telephonePerson = it[CartFinalEntity.telephonePerson]
                val emailPerson = it[CartFinalEntity.emailPerson]

                CartProductsFinal(
                    itemPicFinal ?: "",
                    itemNameFinal ?: "",
                    itemPriceFinal ?: "",
                    itemTypeFinal ?: "",
                    itemQuantityFinal ?: "",
                    timeDate ?: "",
                    namePerson ?: "",
                    telephonePerson ?: "",
                    emailPerson ?: ""
                )
            }
            call.respond(cartFinal)
        }

        //insert data to database من خلال اني ادخل الداتا من postman واعملها post
        post("/cartFinal") {
            val request = call.receive<CartProductsFinalPosting>()
            val result = db.insert(CartFinalEntity) {
                set(it.timeDate, request.timeDate)
                set(it.namePerson, request.namePerson)
                set(it.telephonePerson, request.telephonePerson)
                set(it.itemNameFinal, request.itemNameFinal)
                set(it.itemPriceFinal, request.itemPriceFinal)
                set(it.itemTypeFinal, request.itemTypeFinal)
                set(it.itemQuantityFinal, request.itemQuantityFinal)
                set(it.itemPicFinal,request.itemPicFinal)
                set(it.emailPerson,request.emailPerson)
            }
            if (result == 1) {
                //send success
                call.respond(
                    HttpStatusCode.OK, FruitsResponse(
                        success = true,
                        data = "values has been successfully inserted"
                    )
                )
            } else {
                //send failuire
                call.respond(
                    HttpStatusCode.BadRequest, FruitsResponse(
                        success = false,
                        data = "failed to insert values"
                    )
                )
            }
        }


        //delete data row by id from postman
        delete("/cartFinal/{telephonePerson}") {
            val telephonePerson = call.parameters["telephonePerson"] ?: ""

            val rowsEffected = db.delete(CartFinalEntity) {
                it.telephonePerson eq telephonePerson
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been deleted", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to delete", false))
            }
        }

    }
}

fun Application.billFinalRoutes() {
    val db = DatabaseConnection.database
    routing {
        get("/billFinal") {
            //call.respondText("returning all billFinal")
            val billFinal = db.from(BillFinalEntity).select().map {
                val id = it[BillFinalEntity.id]
                val totalPrice = it[BillFinalEntity.totalPrice]
                val deliveryFee = it[BillFinalEntity.deliveryFee]
                val serviceFee = it[BillFinalEntity.serviceFee]
                val vat = it[BillFinalEntity.vat]
                val totalFinalPrice = it[BillFinalEntity.totalFinalPrice]
                val longitude = it[BillFinalEntity.longitude]
                val latitude = it[BillFinalEntity.latitude]
                val phoneNumber = it[BillFinalEntity.phoneNumber]
                val namePerson = it[BillFinalEntity.namePerson]
                val emailPerson = it[BillFinalEntity.emailPerson]
                val timeDate = it[BillFinalEntity.timeDate]

                BillFinalData(
                    id ?: -1,
                    totalPrice ?: "",
                    deliveryFee ?: "",
                    serviceFee ?: "",
                    vat ?: "",
                    totalFinalPrice ?: "",
                    longitude ?: "",
                    latitude ?: "",
                    phoneNumber ?: "",
                    namePerson ?: "",
                    emailPerson ?: "",
                    timeDate ?: ""
                )
            }
            call.respond(billFinal)
        }




        post("/billFinal") {
            val request = call.receive<BillFinalDataPosting>()
            val result = db.insert(BillFinalEntity) {
                set(it.id, request.id)
                set(it.phoneNumber, request.phoneNumber)
                set(it.namePerson,request.namePerson)
                set(it.totalFinalPrice, request.totalFinalPrice)
                set(it.vat, request.vat)
                set(it.serviceFee, request.serviceFee)
                set(it.deliveryFee, request.deliveryFee)
                set(it.longitude, request.longitude)
                set(it.latitude, request.latitude)
                set(it.totalPrice, request.totalPrice)
                set(it.emailPerson,request.emailPerson)
                set(it.timeDate,request.timeDate)
            }
            if (result == 1) {
                //send success
                call.respond(
                    HttpStatusCode.OK, FruitsResponse(
                        success = true,
                        data = "values has been successfully inserted"
                    )
                )
            } else {
                //send failuire
                call.respond(
                    HttpStatusCode.BadRequest, FruitsResponse(
                        success = false,
                        data = "failed to insert values"
                    )
                )
            }
        }



        //delete data row by id from postman
        delete("/billFinal/{phoneNumber}") {
            val phoneNumber = call.parameters["phoneNumber"] ?: ""

            val rowsEffected = db.delete(BillFinalEntity) {
                it.phoneNumber eq phoneNumber
            }

            if (rowsEffected == 1) {
                call.respond(HttpStatusCode.OK, FruitsResponse("Data has been deleted", true))
            } else {
                call.respond(HttpStatusCode.BadRequest, FruitsResponse("failed to delete", false))
            }
        }
    }
}




