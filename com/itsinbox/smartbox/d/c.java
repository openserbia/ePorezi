package com.itsinbox.smartbox.d;

import com.itsinbox.smartbox.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class c {
  private static String a;
  
  private static c b;
  
  public static void a(String paramString) {
    a = paramString;
  }
  
  public static void a(boolean paramBoolean) {
    c();
    if (paramBoolean)
      a(new a(b.a)); 
  }
  
  public static void b(boolean paramBoolean) {
    c();
    System.setProperty("java.net.useSystemProxies", "true");
    if (paramBoolean)
      a(new a(b.b)); 
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean) {
    c();
    System.setProperty("http.proxyHost", paramString1);
    System.setProperty("http.proxyPort", paramString2);
    System.setProperty("https.proxyHost", paramString1);
    System.setProperty("https.proxyPort", paramString2);
    if (paramBoolean)
      a(new a(b.c, paramString1, paramString2)); 
  }
  
  public static void b(String paramString1, String paramString2, boolean paramBoolean) {
    c();
    System.setProperty("socksProxyHost", paramString1);
    System.setProperty("socksProxyPort", paramString2);
    if (paramBoolean)
      a(new a(b.d, paramString1, paramString2)); 
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
  
  public static a a() {
    null = System.getProperty("user.home") + File.separator + a;
    FileInputStream fileInputStream = null;
    try {
      Properties properties = new Properties();
      fileInputStream = new FileInputStream(null);
      properties.load(fileInputStream);
      b b = b.a(Integer.parseInt(properties.getProperty("proxyType")));
      String str2 = properties.getProperty("proxyHost");
      String str1 = properties.getProperty("proxyPort");
      a a = new a(b, str2, str1);
    } catch (Exception exception) {
      a.b("Config read error! " + exception.getMessage());
      a a = new a(b.a);
    } finally {
      try {
        if (fileInputStream != null)
          fileInputStream.close(); 
      } catch (IOException iOException) {
        a.b("Config read error! " + iOException.getMessage());
      } 
    } 
    if (SYNTHETIC_LOCAL_VARIABLE_0.a() != null) {
      boolean bool = false;
      Object object = SYNTHETIC_LOCAL_VARIABLE_0;
      switch (d.a[object.a().ordinal()]) {
        case 1:
          a(false);
          break;
        case 2:
          b(false);
          break;
        case 3:
          a(object.b(), object.c(), false);
          break;
        case 4:
          b(object.b(), object.c(), false);
          break;
      } 
    } 
    return (a)SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  private static void a(a parama) {
    String str = System.getProperty("user.home") + File.separator + a;
    FileOutputStream fileOutputStream = null;
    try {
      Properties properties = new Properties();
      fileOutputStream = new FileOutputStream(str);
      properties.setProperty("proxyType", String.valueOf(parama.a().a()));
      if (parama.b() != null)
        properties.setProperty("proxyHost", parama.b()); 
      if (parama.c() != null)
        properties.setProperty("proxyPort", parama.c()); 
      properties.store(fileOutputStream, (String)null);
    } catch (IOException iOException) {
      a.b("Config save error! " + iOException.getMessage());
    } finally {
      try {
        if (fileOutputStream != null)
          fileOutputStream.close(); 
      } catch (IOException iOException) {
        a.b("Config save error! " + iOException.getMessage());
      } 
    } 
  }
  
  public static c b() {
    if (b == null)
      b = new c(); 
    return b;
  }
}


/* Location:              /com/itsinbox/smartbox/d/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */