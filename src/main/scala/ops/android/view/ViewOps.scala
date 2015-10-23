package ops.android.view

import android.view.View

object ViewOps {

  implicit class Common(val self: View) extends AnyVal {
    def find[T <: View](id: Int): T = self.findViewById(id).asInstanceOf[T]
  }

  implicit class ViewHoldable(val self: View) extends AnyVal {
    def getHolder[T](find: View => T): T = Option(self.getTag.asInstanceOf[T]) getOrElse find(self)
  }
}
