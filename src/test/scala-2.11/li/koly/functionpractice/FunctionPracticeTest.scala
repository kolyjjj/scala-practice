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

    it("should call a default function") {
      assert(FunctionPractice.defaultParameter(5, 10) == 50)
      assert(FunctionPractice.defaultParameter(5) == 50)
    }

    it("should call a repeated parameter function") {
      assert(FunctionPractice.repeatedParameters(3, 4) == 7)
      assert(FunctionPractice.repeatedParameters(3) == 3)
      assert(FunctionPractice.repeatedParameters(3, 4, 5) == 12)
    }

    describe("first class function") {
      it("should call a val which is a function") {
        assert(FunctionPractice.add2(3) == 5)
      }

      it("should consume a function as argument") {
        assert(FunctionPractice.applyFunc(x => x + 4) == 5)
        assert(FunctionPractice.applyFunc((x: Int) => x + 4) == 5)
        assert(FunctionPractice.applyFunc(_ + 4) == 5)

        assertDoesNotCompile("val one = (x: Int): Int = x + 1")
      }
    }
  }
}
