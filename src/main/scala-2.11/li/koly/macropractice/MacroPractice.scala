package li.koly.macropractice

import scala.reflect.macros.Context
import scala.language.experimental.macros


object MacroPractice {
  def assert(cond: Boolean, msg: String) = macro MacroAsserts.assertImpl
  def printf(format: String, params: Any*): Unit = macro printfImpl

  def printfImpl(c: Context)(format: c.Expr[String], params: c.Expr[Any]*): c.Expr[Unit] = {
    ???
  }
}
