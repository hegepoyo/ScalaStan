package com.cibo.scalastan.run

class StanException(val errorCode: Int) extends Exception(s"error $errorCode: ${StanException.getMessage(errorCode)}")

object StanException {
  object ErrorCodes {
    val ok: Int = 0
    val usage: Int = 64
    val dataError: Int = 65
    val noInput: Int = 66
    val software: Int = 70
    val config: Int = 78
  }

  def getMessage(errorCode: Int): String = errorCode match {
    case ErrorCodes.ok        => "success"
    case ErrorCodes.usage     => "command used incorrectly"
    case ErrorCodes.dataError => "input data is invalid"
    case ErrorCodes.noInput   => "no input"
    case ErrorCodes.software  => "internal error"
    case ErrorCodes.config    => "bad configuration"
    case _                    => "unknown"
  }
}
