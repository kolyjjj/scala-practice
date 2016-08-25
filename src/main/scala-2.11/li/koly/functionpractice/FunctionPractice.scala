package li.koly.functionpractice

object FunctionPractice {
  def commonFunction(x: Int, y: Int): Int = x + y
  def functionWithOneParameter(x: Int): Int = x + 1
  def commonBraceFunction(f: Int => String) = f(4)

  def curriedFunction(x: Int)(y: Int): Int = x + y
  def curriedBraceFunction(x: Int)(f: Int => String) = f(x)

  def add4 = curriedFunction(4)_
  def anotherAdd4 = commonFunction(_: Int, 4)

  // procedure is a function that returns Unit
  def aProcedure(s: String) { println(s) }

}
