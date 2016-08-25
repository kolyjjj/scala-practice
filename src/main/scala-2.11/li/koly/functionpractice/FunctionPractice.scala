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

  def defaultParameter(x: Int, y: Int = 10) = x * y
  def repeatedParameters(args: Int*) = args.sum

  // first class function
  val add2 = (x: Int) => x + 2
  def applyFunc(f: Int => Int) = f(1)

  private val more = 10
  def aClosure(x: Int) = x + more

}
