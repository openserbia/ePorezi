package com.itsinbox.smartbox.proxy;

import com.itsinbox.smartbox.a.SmartCardLogic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProxyUtils {
  private static String CONFIG_FILE;
  
  private static ProxyUtils proxyUtils;
  
  public static void init(String configPath) {
    CONFIG_FILE = configPath;
  }
  
  public static void init(boolean paramBoolean) {
    c();
    if (paramBoolean)
      init(new SmartCardLogic(proxyUtils.CONFIG_FILE));
  }
  
  public static void b(boolean paramBoolean) {
    c();
    System.setProperty("java.net.useSystemProxies", "true");
    if (paramBoolean)
      init(new SmartCardLogic(proxyUtils.proxyUtils));
  }
  
  public static void init(String paramString1, String paramString2, boolean paramBoolean) {
    c();
    System.setProperty("http.proxyHost", paramString1);
    System.setProperty("http.proxyPort", paramString2);
    System.setProperty("https.proxyHost", paramString1);
    System.setProperty("https.proxyPort", paramString2);
    if (paramBoolean)
      init(new SmartCardLogic(proxyUtils.c, paramString1, paramString2));
  }
  
  public static void b(String paramString1, String paramString2, boolean paramBoolean) {
    c();
    System.setProperty("socksProxyHost", paramString1);
    System.setProperty("socksProxyPort", paramString2);
    if (paramBoolean)
      init(new SmartCardLogic(proxyUtils.d, paramString1, paramString2));
  }
  
  private static void c() {
    System.clearProperty("http.proxyHost");
    System.clearProperty("http.proxyPort");
    System.clearProperty("https.proxyHost");
    System.clearProperty("https.proxyPort");
    System.clearProperty("socksProxyHost");
    System.clearProperty("socksProxyPort");
    System.setProperty("java.net.useSystemProxies", "false");
  }
  
  public static SmartCardLogic init() {
    null = System.getProperty("user.home") + File.separator + CONFIG_FILE;
    FileInputStream fileInputStream = null;
    try {
      Properties properties = new Properties();
      fileInputStream = new FileInputStream(null);
      properties.load(fileInputStream);
      ProxyType ProxyType = ProxyType.a(Integer.parseInt(properties.getProperty("proxyType")));
      String str2 = properties.getProperty("proxyHost");
      String str1 = properties.getProperty("proxyPort");
      SmartCardLogic SmartCardLogic = new SmartCardLogic(ProxyType, str2, str1);
    } catch (Exception exception) {
      CONFIG_FILE.b("Config read error! " + exception.getMessage());
      SmartCardLogic SmartCardLogic = new SmartCardLogic(proxyUtils.CONFIG_FILE);
    } finally {
      try {
        if (fileInputStream != null)
          fileInputStream.close(); 
      } catch (IOException iOException) {
        CONFIG_FILE.b("Config read error! " + iOException.getMessage());
      } 
    } 
    if (SYNTHETIC_LOCAL_VARIABLE_0.a() != null) {
      boolean bool = false;
      Object object = SYNTHETIC_LOCAL_VARIABLE_0;
      switch (d.a[object.a().ordinal()]) {
        case 1:
          init(false);
          break;
        case 2:
          b(false);
          break;
        case 3:
          init(object.b(), object.c(), false);
          break;
        case 4:
          b(object.b(), object.c(), false);
          break;
      } 
    } 
    return (SmartCardLogic)SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  private static void init(SmartCardLogic parama) {
    String str = System.getProperty("user.home") + File.separator + CONFIG_FILE;
    FileOutputStream fileOutputStream = null;
    try {
      Properties properties = new Properties();
      fileOutputStream = new FileOutputStream(str);
      properties.setProperty("proxyType", String.valueOf(parama.SmartCardLogic().a()));
      if (parama.b() != null)
        properties.setProperty("proxyHost", parama.b()); 
      if (parama.c() != null)
        properties.setProperty("proxyPort", parama.c()); 
      properties.store(fileOutputStream, (String)null);
    } catch (IOException iOException) {
      CONFIG_FILE.b("Config save error! " + iOException.getMessage());
    } finally {
      try {
        if (fileOutputStream != null)
          fileOutputStream.close(); 
      } catch (IOException iOException) {
        CONFIG_FILE.b("Config save error! " + iOException.getMessage());
      } 
    } 
  }
  
  public static ProxyUtils b() {
    if (proxyUtils == null)
      proxyUtils = new ProxyUtils();
    return proxyUtils;
  }
}


/* Location:              /com/itsinbox/smartbox/d/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */