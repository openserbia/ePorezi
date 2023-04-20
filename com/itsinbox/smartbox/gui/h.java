package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.a.a;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

final class h extends Thread {
  h(d paramd) {}
  
  public final void run() {
    try {
      URL uRL;
      InputStream inputStream = (uRL = new URL("https://eporezi.purs.gov.rs/upload/eporezi/version")).openStream();
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
      Properties properties;
      (properties = new Properties()).load(inputStreamReader);
      inputStreamReader.close();
      String str = properties.getProperty("version");
      a.b("Server version: " + String.valueOf(str));
      a.b("Application version: " + String.valueOf("1.3.1"));
      if (!str.equals("1.3.1")) {
        d.b(this.a, str);
        d.r(this.a).setVisible(true);
        this.a.pack();
      } 
      return;
    } catch (Exception exception) {
      a.b("Error while checking for updates: " + exception.getMessage());
      return;
    } 
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/gui/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */