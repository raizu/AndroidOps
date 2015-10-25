package ops.android.app

import android.app.Activity
import android.content.Context
import android.view.View

trait ActivityOps extends ContextOps {

  self: Activity =>

  override implicit lazy val context: Context = this

  override def _getString(resId: Int, args: AnyRef*): String = getString(resId, args: _*)

  implicit class ResourceView(self: Int) {
    def findView[T <: View](): T = findViewById(self).asInstanceOf[T]
  }
}
