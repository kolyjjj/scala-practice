package li.koly.contextbound

class Fruit[T](val name: String) {
  def grow(year: Int): String = name + " grows " + year + " years."
}
