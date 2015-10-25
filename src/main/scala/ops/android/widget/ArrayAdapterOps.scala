package ops.android.widget

import android.content.Context
import android.view.{ViewGroup, View}
import android.widget.ArrayAdapter

import scala.collection.JavaConversions._

object ArrayAdapterOps {

  implicit class SeqOps[T](val self: Seq[T]) {

    def adapter(res: Int)(f: (ArrayAdapterOps[T], Int, View, ViewGroup) => View)(implicit c: Context): ArrayAdapterOps[T] = {
      new ArrayAdapterOps[T](res, self) {
        override def getView(position: Int, convertView: View, parent: ViewGroup): View = f(this, position, convertView, parent)
      }
    }

  }

}

class ArrayAdapterOps[T](res: Int, objects: Seq[T])(implicit c: Context) extends ArrayAdapter(c, res, objects)