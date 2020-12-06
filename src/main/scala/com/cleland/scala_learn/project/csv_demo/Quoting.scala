package com.cleland.scala_learn.project.csv_demo

sealed abstract trait Quoting extends Product with Serializable
case object QUOTE_ALL extends Quoting
case object QUOTE_MINIMAL extends Quoting
case object QUOTE_NONE extends Quoting
case object QUOTE_NONNUMERIC extends Quoting
