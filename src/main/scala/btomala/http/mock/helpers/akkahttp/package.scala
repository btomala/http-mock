package btomala.http.mock.helpers

import akka.http.scaladsl.model.headers.{`User-Agent`, Host}

package object akkahttp {
  /** required headers when you are using akka-http client*/
  def headers(host: String = "localhost", port: Int = 80, userAgent:String  = "akka-http/2.3.11") =
    scala.collection.immutable.Seq(
      Host(host, port),
      `User-Agent`(userAgent)
    )

}
