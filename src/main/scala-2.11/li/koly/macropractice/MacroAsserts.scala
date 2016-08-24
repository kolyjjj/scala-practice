package li.koly.macropractice

import scala.reflect.macros.Context


object MacroAsserts {
  def raise(msg: Any) = throw new AssertionError(msg)
  def assertImpl(c: Context)(cond: c.Expr[Boolean], msg: c.Expr[String]): c.Expr[Unit] = {
    ???
  }
}
