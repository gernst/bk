// BK non-local backtracking
// (c) 2018 Gidon Ernst <gidonernst@gmail.com>
// This code is licensed under MIT license (see LICENSE for details)

package object bk {
  trait NoStackTrace {
    this: Throwable =>
    override def fillInStackTrace = this
    override val getStackTrace = Array[StackTraceElement]()
  }

  def backtrack() = {
    throw Backtrack()
  }

  case class Backtrack() extends Throwable /* with NoStackTrace */ {
    override def toString = "backtrack"
  }

  implicit class Control[A](first: => A) {
    def or[B <: A](second: => B) = {
      try {
        first
      } catch {
        case Backtrack() =>
          second
      }
    }
  }
}