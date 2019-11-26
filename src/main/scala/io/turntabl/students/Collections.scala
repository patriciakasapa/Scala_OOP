package io.turntabl.students

object Collections {
  val me = ("Patricia", "Scala")
  var name, favouritelang = me
  //val name, favouritelang = me

//me match{
//  case (name, favouritelang) => print (name, favouritelang)
//}
  val countries = Map("England" -> "London", "Ghana" -> "Accra", "Lybia" -> "Tripoly")
val addedcountry = countries + ("Togo"-> "Lome", "Wakanda" -> "Wajisu")
val friends = Set("princess", "Mary", "Francis", "Samuel", "Anna", "Samuel")
  val listofnames = Seq("Doreen", "Yaa", "Patricia", "Sheva")
  def iterating()= listofnames foreach println
  def morethan6()= (sixv: String) => String
    listofnames filter()

}
