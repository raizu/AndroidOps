package ops.android.widget

import android.content.Context
import android.widget.ArrayAdapter

import scala.collection.JavaConversions._

class ArrayAdapterO[T](res: Int, objects: Seq[T])(implicit c: Context) extends ArrayAdapter(c, res, objects)