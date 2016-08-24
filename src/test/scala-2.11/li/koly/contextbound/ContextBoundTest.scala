package li.koly.contextbound

import org.scalatest.FunSpec

class ContextBoundTest extends FunSpec{
  describe("context bound") {
    it("should implicit convert") {
      assert(ContextBound.run(new Apple("Hongfushi")) == "Hongfushi grows 1 years.")
      assert(ContextBound.run(new Apple("baitong")) == "baitong grows 1 years.")
    }
  }
}
