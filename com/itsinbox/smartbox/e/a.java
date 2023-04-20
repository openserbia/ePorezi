package com.itsinbox.smartbox.e;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a {
  private String a = System.getProperty("user.home") + File.separator + "eporezi.log";
  
  private BufferedWriter b;
  
  public a() {
    try {
      this.b = new BufferedWriter(new FileWriter(this.a));
      return;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
      return;
    } 
  }
  
  public final void a(String paramString) {
    try {
      this.b.append(paramString);
      this.b.newLine();
      this.b.flush();
      return;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
      return;
    } 
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/e/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */