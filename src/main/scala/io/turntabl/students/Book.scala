package io.turntabl.students

case class Book(authorSurname: String, title: String, publisherYear: Int, category: String) {
  def unapply(book: Book) = (book.authorSurname, book.title, book.publisherYear, book.category)

}

object Book{

  val collect = Seq(
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

  val booksByTitle = for(Book <- collect: collect.Book.map(.)

  }

