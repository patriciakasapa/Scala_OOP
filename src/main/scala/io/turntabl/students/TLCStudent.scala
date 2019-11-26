package io.turntabl.students

import io.turntabl.scalagettingstarted.GradeCase


class TLCStudent(val firstName: String,val lastName: String, year: Int, val idNumber: Int = 1, val roleD: String = "Student", val gitRepo: String = "github.com/turntabl") extends TurntablEmployee {
    override def toString = s"$firstName $lastName $roleD $gitRepo"
  import java.time.{LocalDate => CurrentDate}
  val currentYear = CurrentDate.now().getYear
    def yearOfService = currentYear - year
  def isSameService(s: TLCStudent) = s.yearOfService == yearOfService
  val topGrade = GradeCase("Scala", 99.999)

  override def getWorkLoad = "Works Super hard :)"

}
  object TLCStudent{
    def apply(firstName: String, lastName: String, year: Int, idNumber: Int = 1, roleD: String = "Student", gitRepo: String = "github.com/turntabl") =
      new TLCStudent(firstName: String, lastName: String, year, idNumber, roleD, gitRepo){

    }
  }

