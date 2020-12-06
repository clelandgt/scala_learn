package main.scala.com.cleland.scala_learn.project.csv_demo

trait DefaultCSVFormat extends CSVFormat {

  val delimiter: Char = ','

  val quoteChar: Char = '"'

  val escapeChar: Char = '"'

  val lineTerminator: String = "\r\n"

  val quoting: Quoting = QUOTE_MINIMAL

  val treatEmptyLineAsNil: Boolean = false
}