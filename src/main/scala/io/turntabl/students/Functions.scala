package io.turntabl.students

object Functions {
  val lengthfunc: String => Int = (word: String) => word length()
  val spacescount: String => Int = (something: String) => something count(_==' ')
  val ApplyToString: (String, String => Int) => Int = (stringtoapply: String, func: String => Int) => func(stringtoapply)
  val funAdd = (a: Int, b: Int) => a + b
  val funSubtract = (c: Int, d: Int) => c - d
  val funMultiply = (e: Int, f: Int) => e * f
  val calculate = (stringc: String) =>
  stringc match{
    case "add" => funAdd
    case "subtract" => funSubtract
    case "multiply" => funMultiply
  }
}
