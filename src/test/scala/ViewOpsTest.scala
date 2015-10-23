
import android.view.View
import android.widget.TextView
import ops.android.view.ViewOps._

class ViewOpsTest {

  val v: View = null

  case class Test(id: Int, name: String)

  private val test = v.getHolder[Test](v => new Test(1, ""))

  private val view = v.find[TextView](1)
}
