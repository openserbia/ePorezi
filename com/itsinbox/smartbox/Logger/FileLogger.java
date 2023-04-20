package com.itsinbox.smartbox.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLogger {
  private String logPath = System.getProperty("user.home") + File.separator + "eporezi.log";
  
  private BufferedWriter writer;
  
  public FileLogger() {
    try {
      this.writer = new BufferedWriter(new FileWriter(this.logPath));
      return;
    } catch (IOException iOException) {
      Logger.getLogger(FileLogger.class.getName()).log(Level.SEVERE, (String)null, iOException);
      return;
    } 
  }
  
  public final void writeToLog(String message) {
    try {
      this.writer.append(message);
      this.writer.newLine();
      this.writer.flush();
      return;
    } catch (IOException iOException) {
      Logger.getLogger(FileLogger.class.getName()).log(Level.SEVERE, (String)null, iOException);
      return;
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/e/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */