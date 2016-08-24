package li.koly.viewbound

object ViewBound {
  implicit def convert(dog: Dog): Animal = new Animal(dog.name)

  // T <% Animal means there is an implicit conversion to convert T to Animal
  private def dogRoar[T <% Animal](dog: T): String = dog.animalRoar()

  def run(dog: Dog): String = dogRoar(dog) // so convert is available when dogRoar is called
}
