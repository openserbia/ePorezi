package com.itsinbox.smartbox;

import com.itsinbox.smartbox.a.a;
import com.itsinbox.smartbox.d.a;
import com.itsinbox.smartbox.d.c;
import com.itsinbox.smartbox.gui.A;
import com.itsinbox.smartbox.gui.d;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SmartBox {
  private static a a = a.d;
  
  private static String b;
  
  private static a c;
  
  public static void main(String[] paramArrayOfString) {
    String str = (str = System.getProperty("os.name")).toLowerCase();
    a.b("OS info: " + str);
    try {
      if (str.contains("windows")) {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      } else if (str.contains("linux")) {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
      } else {
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
      } 
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException classNotFoundException) {
      a.b("Error while setting window theme: " + classNotFoundException.getMessage());
    } 
    c.a("eporezi_proxy.conf");
    c = c.a();
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      str = paramArrayOfString[0];
      try {
        Map<?, String> map;
        String str1 = (map = a((str = str.substring(0, str.length() - 1)).replace("eporezi://", ""))).get("env");
        String str2 = map.get("loginKey");
        String str3 = map.get("xmlUrl");
        if (str1 == null) {
          a = a.d;
        } else {
          switch (str1) {
            case "prod":
              a = a.a;
              b = "https://eporezi.purs.gov.rs";
              break;
            case "eto":
              a = a.b;
              b = "https://test.purs.gov.rs";
              break;
            case "ito":
              a = a.c;
              b = "http://10.1.65.31";
              break;
            default:
              a = a.d;
              b = null;
              break;
          } 
        } 
        if (a == a.d) {
          JOptionPane.showMessageDialog(null, "Грешка приликом читања параметара.", "SmartBox", 0);
        } else {
          if (str2 != null && str2.length() > 0) {
            str1 = str2;
            d.a(a, str1);
          } else {
            if (str3 != null && str3.length() > 0) {
              str1 = map.get("reqKey");
              String str5 = b(map.get("servletUrl"));
              str2 = b(map.get("backUrl"));
              String str6 = b(map.get("jmbgAuth"));
              String str7 = b(map.get("pibAuth"));
              String str8 = b(map.get("id"));
              String str4 = b(map.get("itemId"));
              str8 = str4;
              str7 = str8;
              str6 = str7;
              str5 = str6;
              str3 = str2;
              str2 = str5;
              str4 = str3;
              str1 = str1;
              A a1;
              (a1 = new A(a, b, str1, str4, str2, str3, str5, str6, str7, str8)).setVisible(true);
              a1.b();
            } 
            return;
          } 
          return;
        } 
      } catch (Exception exception) {
        a.b("Error while processing URL: " + exception.getMessage());
        paramArrayOfString = null;
        d.a(a, (String)paramArrayOfString);
        return;
      } 
    } else {
      paramArrayOfString = null;
      d.a(a, (String)paramArrayOfString);
    } 
  }
  
  private static Map a(String paramString) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    String[] arrayOfString;
    int i = (arrayOfString = arrayOfString = paramString.split("&")).length;
    for (byte b = 0; b < i; b++) {
      String str;
      int j = (str = arrayOfString[b]).indexOf("=");
      linkedHashMap.put(URLDecoder.decode(str.substring(0, j), "UTF-8"), URLDecoder.decode(str.substring(j + 1), "UTF-8"));
    } 
    return linkedHashMap;
  }
  
  private static String b(String paramString) {
    try {
      return URLDecoder.decode(paramString, "UTF-8");
    } catch (Exception exception) {
      return paramString;
    } 
  }
  
  public static a a() {
    return c;
  }
  
  public static void a(a parama) {
    c = parama;
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/SmartBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */