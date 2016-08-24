package li.koly.contextbound

object ContextBound {

  implicit val fru: Fruit[Apple] = new Fruit[Apple]("Hongfushi")

  def grow[T : Fruit](year: Int): String = implicitly[Fruit[T]].grow(year)

  def run(): String = grow(1)

  def run(apple: Apple): String = {
    implicit val fru: Fruit[Apple] = new Fruit[Apple](apple.name)
    grow(1)
  }
}
