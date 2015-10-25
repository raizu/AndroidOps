package ops.android.app

import android.app.Fragment
import android.content.Context

trait FragmentOps extends ContextOps {

  self: Fragment =>

  override implicit lazy val context: Context = getActivity

  override def _getString(resId: Int, args: AnyRef*): String = getString(resId, args: _*)
}
