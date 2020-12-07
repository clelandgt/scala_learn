package com.cleland.scala_learn.project.csv_demo

import scala.annotation.switch


object CSVParser {
  private type State = Int
  private final val Start = 0
  private final val End =3
  private final val Field = 1
  private final val Delimiter = 2
  private final val QuoteStart = 4
  private final val QuoteEnd = 5
  private final val quotedField = 6

  def parse(input: String, escapeChar: Char, delimiter: Char, quoteChar: Char): Option[List[String]] = {
    val buf: Array[Char] = input.toCharArray
    var fields: Vector[String] = Vector()
    var field = new StringBuilder
    var state: State = Start
    var pos = 0
    val buflen = buf.length

    if (buf.length > 0 && buf(0) == '\uFEFF'){
      pos += 1
    }

    while (state != End && pos < buflen){
      val c = buf(pos)
      (state: @switch) match {
        case Start => {
         c match {
           case `quoteChar` => {
             state = QuoteStart
             pos += 1

           }
           case `delimiter` => {
             fields :+= field.toString
             field = new StringBuilder
             state = Delimiter
             pos += 1
           }
           case '\n' | '\u2028' | '\u2029' | '\u0085' => {
             fields :+= field.toString
             field = new StringBuilder
             state = End
             pos += 1
           }
           case '\r' => {
             if (pos + 1 < buflen && buf(1) == '\n'){
               pos += 1
             }
             fields :+= field.toString
             field = new StringBuilder
             state = End
             pos += 1
           }
         }
        }
        case Delimiter => {
          c match {
            case `quoteChar` => {
              state = QuoteStart
              pos += 1
            }
            case `escapeChar` => {
              if (pos + 1 < buflen && )
            }
          }
        }
      }
    }
  }
}

class CSVParser {

}
