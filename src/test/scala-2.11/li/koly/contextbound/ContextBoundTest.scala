package li.koly.contextbound

import org.scalatest.FunSpec

class ContextBoundTest extends FunSpec{
  describe("context bound") {
    it("should implicit convert") {
      assert(ContextBound.run(new Apple("Hongfushi")) == "Hongfushi grows 1 years.")
      assert(ContextBound.run(new Apple("baitong")) == "baitong grows 1 years.")
    }

    it("a implicitly example with ordering") {
      implicit val test = new Ordering[Int] {
        override def compare(x: Int, y: Int): Int = (x - y) match {
          case z if z > 0 => -1
          case z if z == 0 => 0
          case _ => 1
        }
      }

      def myCompare[T : Ordering](a: T, b: T): T = if (implicitly[Ordering[T]].lt(a, b)) a else b

      assert(myCompare(4, 5) == 5)
    }
  }
}
