package com.itsinbox.smartbox;

import com.itsinbox.smartbox.a.SmartCardLogic;
import com.itsinbox.smartbox.gui.A;
import com.itsinbox.smartbox.gui.d;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SmartBox {
  private static SmartCardLogic SmartCardLogic = SmartCardLogic.d;
  
  private static String baseUrl;
  
  private static SmartCardLogic c;
  
  public static void main(String[] paramArrayOfString) {
    String osName = (osName = System.getProperty("os.name")).toLowerCase();
    SmartCardLogic.b("OS info: " + osName);
    try {
      if (osName.contains("windows")) {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      } else if (osName.contains("linux")) {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
      } else {
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
      } 
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException classNotFoundException) {
      SmartCardLogic.b("Error while setting window theme: " + classNotFoundException.getMessage());
    } 
    c.a("eporezi_proxy.conf");
    c = c.a();
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      osName = paramArrayOfString[0];
      try {
        Map<?, String> map;
        String env = (map = a((osName = osName.substring(0, osName.length() - 1)).replace("eporezi://", ""))).get("env");
        String loginKey = map.get("loginKey");
        String xmlUrl = map.get("xmlUrl");
        if (env == null) {
          SmartCardLogic = SmartCardLogic.d;
        } else {
          switch (env) {
            case "prod":
              SmartCardLogic = SmartCardLogic.a;
              baseUrl = "https://eporezi.purs.gov.rs";
              break;
            case "eto":
              SmartCardLogic = SmartCardLogic.b;
              baseUrl = "https://test.purs.gov.rs";
              break;
            case "ito":
              SmartCardLogic = SmartCardLogic.c;
              baseUrl = "http://10.1.65.31";
              break;
            default:
              SmartCardLogic = SmartCardLogic.d;
              baseUrl = null;
              break;
          } 
        } 
        if (SmartCardLogic == SmartCardLogic.d) {
          JOptionPane.showMessageDialog(null, "Грешка приликом читања параметара.", "SmartBox", 0);
        } else {
          if (loginKey != null && loginKey.length() > 0) {
            env = loginKey;
            d.a(SmartCardLogic, env);
          } else {
            if (xmlUrl != null && xmlUrl.length() > 0) {
              env = map.get("reqKey");
              String servletUrl = b(map.get("servletUrl"));
              loginKey = b(map.get("backUrl"));
              String jmbgAuth = b(map.get("jmbgAuth"));
              String pibAuth = b(map.get("pibAuth"));
              String id = b(map.get("id"));
              String itemId = b(map.get("itemId"));
              id = itemId;
              pibAuth = id;
              jmbgAuth = pibAuth;
              servletUrl = jmbgAuth;
              xmlUrl = loginKey;
              loginKey = servletUrl;
              itemId = xmlUrl;
              env = env;
              A a1;
              (a1 = new A(SmartCardLogic, baseUrl, env, itemId, loginKey, xmlUrl, servletUrl, jmbgAuth, pibAuth, id)).setVisible(true);
              a1.b();
            } 
            return;
          } 
          return;
        } 
      } catch (Exception exception) {
        SmartCardLogic.b("Error while processing URL: " + exception.getMessage());
        paramArrayOfString = null;
        d.a(SmartCardLogic, (String)paramArrayOfString);
        return;
      } 
    } else {
      paramArrayOfString = null;
      d.a(SmartCardLogic, (String)paramArrayOfString);
    } 
  }
  
  private static Map a(String paramString) throws UnsupportedEncodingException {
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
  
  public static SmartCardLogic a() {
    return c;
  }
  
  public static void a(SmartCardLogic parama) {
    c = parama;
  }
}


/* Location:              /com/itsinbox/smartbox/SmartBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */