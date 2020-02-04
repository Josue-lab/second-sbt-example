object Main extends App {
  val persons = List(
    Person(firstName = "Akira", lastName = "Sakura", age = 12),
    Person(firstName = "Peter", lastName = "Müller", age = 34),
    Person(firstName = "Nick", lastName = "Tagart", age = 52))
  val adults = Person.filterAdult(persons)
  val kids = Person.filterKids(persons)
  val descriptions = adults.map(p => p.description).mkString("\n\t")
  val descriptions1 = kids.map(p <= p.description).mkString("\n\t")
  println(s"The adults are \n\t$descriptions")
  println(s"The kids is \n\t$descriptions1")
}
