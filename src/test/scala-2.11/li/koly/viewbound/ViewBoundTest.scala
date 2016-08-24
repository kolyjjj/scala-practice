package li.koly.viewbound

import org.scalatest.FunSpec

class ViewBoundTest extends FunSpec{
  describe("view bound") {
    it("should convert") {
      assert(ViewBound.run(new Dog("bingo", 3)) == "bingo is roaring")
    }
  }
}
