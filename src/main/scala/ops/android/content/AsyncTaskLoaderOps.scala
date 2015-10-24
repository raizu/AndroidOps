package ops.android.content

import android.content.{Context, AsyncTaskLoader}

import scala.util.Try

object AsyncTaskLoaderOps {

  def apply[T](body: => T)(implicit context: Context): AsyncTaskLoader[Try[T]] = {
    new AsyncTaskLoader[Try[T]](context) {
      override def loadInBackground(): Try[T] = Try { body }
    }
  }

}
