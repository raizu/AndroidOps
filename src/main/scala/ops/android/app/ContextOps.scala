package ops.android.app

import android.content.Context

trait ContextOps {

  implicit val context: Context

  def _getString(resId: Int, args: AnyRef*): String

  implicit class ResourceString(self: Int) {
    def rString(args: Any*): String = _getString(self, args.map(_.asInstanceOf[AnyRef]): _*)
  }
}
