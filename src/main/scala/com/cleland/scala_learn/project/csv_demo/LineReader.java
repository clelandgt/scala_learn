package com.cleland.scala_learn.project.csv_demo;

import java.io.Closeable;
import java.io.IOException;

public interface LineReader extends Closeable{
    String readLineWithTerminator() throws IOException;
}
