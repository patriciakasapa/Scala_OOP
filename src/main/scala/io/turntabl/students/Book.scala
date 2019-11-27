package io.turntabl.students

case class Book(authorSurname: String, title: String, publisherYear: Int, category: String) {
  def unapply(book: Book) = (book.authorSurname, book.title, book.publisherYear, book.category)

}

object Book{

  val collect = List(
    Book("Phillips", "Shades", 1882, "Romance"),
    Book("Andreas", "Chilly", 1224, "Horror"),
    Book("Aidoo", "Nkrumah", 2008, "History")
  )
    def search (book: Book) {
      book match {
      case bk:Book => println(bk.title)
    }
    }
  collect foreach search

  def booksByTitle (books: List[Book]) = books.map(onebook => onebook.title -> onebook) toMap
val listifbooktitles = List("Shades", "Game of thrones", "Nkrumah")
  }

