package io.turntabl.scalagettingstarted

import io.turntabl.students.TLCStudent


object MyApp extends App {
 val st = new TLCStudent("Martha", "Mandas", 2001)
 val st2 = new TLCStudent("Mary", "Afram", 2001)
 println(st)

 //Printing it like this will convert it to a tuple. Meaning, it will print them in a bracket.
 println("The term of Service is ", st.yearOfService)
 //Scalatic way
 println(s"The term of Service is ${st.yearOfService}")
 println(st isSameService st2)
 //Printing without parenthesis
 st isSameService st2

 val obj = TLCStudent("Johnny", "Repl", 2013)
 println(obj)
 val grade =  GradeCase("Economics", 14.2)
  println(grade)
// st getWorkLoad
}

