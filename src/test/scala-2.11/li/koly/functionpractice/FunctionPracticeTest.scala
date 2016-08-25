package li.koly.functionpractice

import org.scalatest.FunSpec

class FunctionPracticeTest extends FunSpec{
  describe("function") {
    it("should call a common function") {
      assert(FunctionPractice.commonFunction(4, 5) == 9)
    }

    it("should call a partially applied function") {
      assert(FunctionPractice.anotherAdd4(11) == 15)
    }

    it("should use curly brace for function") {
      assert(FunctionPractice.functionWithOneParameter {4} == 5)
    }

    it("should call a curried function") {
      assert(FunctionPractice.curriedFunction(4)(5) == 9)
      assertDoesNotCompile("FunctionPractice.curriedFunction(4, 5)")

      assert(FunctionPractice.add4(5) == 9)
    }

    it("should use curly brace when calling a curried function") {
      assert(FunctionPractice.curriedBraceFunction(4){ x => (x + 10).toString } == "14")
    }

    it("should call a procedure") {
      FunctionPractice.aProcedure("This is a procedure")
    }
  }
}
