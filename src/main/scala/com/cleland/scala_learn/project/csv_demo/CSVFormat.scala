package main.scala.com.cleland.scala_learn.project.csv_demo

trait CSVFormat extends Serializable {

  val delimiter: Char

  val quoteChar: Char

  val escapeChar: Char

  val lineTerminator: String

  val quoting: Quoting

  val treatEmptyLineAsNil: Boolean

}
