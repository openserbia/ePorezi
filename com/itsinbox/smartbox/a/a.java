package com.itsinbox.smartbox.a;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;

public class a {
  private String a;
  
  private String b;
  
  private String c;
  
  private Date d;
  
  private static com.itsinbox.smartbox.e.a e;
  
  public static List a(KeyStore paramKeyStore) {
    ArrayList<String> arrayList = new ArrayList();
    try {
      Enumeration<String> enumeration = paramKeyStore.aliases();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        if (paramKeyStore.isKeyEntry(str) && b(paramKeyStore, str))
          arrayList.add(str); 
      } 
    } catch (KeyStoreException keyStoreException) {
      System.out.println("Error while finding alias: " + keyStoreException.getMessage());
    } 
    return arrayList;
  }
  
  public static List a(KeyStore paramKeyStore, List paramList) {
    ArrayList arrayList = new ArrayList();
    paramList.forEach(paramString -> {
          try {
            Certificate[] arrayOfCertificate;
            int i = (arrayOfCertificate = arrayOfCertificate = paramKeyStore.getCertificateChain(paramString)).length;
            for (byte b = 0; b < i; b++) {
              Certificate certificate;
              X509Certificate x509Certificate;
              boolean[] arrayOfBoolean;
              if ((arrayOfBoolean = (x509Certificate = (X509Certificate)(certificate = arrayOfCertificate[b])).getKeyUsage()) != null) {
                if (certificate instanceof X509Certificate)
                  try {
                    ((X509Certificate)certificate).checkValidity();
                  } catch (CertificateExpiredException|java.security.cert.CertificateNotYetValidException certificateExpiredException) {} 
                boolean bool;
                if (bool = (arrayOfBoolean[0] || arrayOfBoolean[1]) ? true : false) {
                  String str1 = c(x509Certificate.getIssuerX500Principal().getName());
                  String str2 = c(x509Certificate.getSubjectX500Principal().getName());
                  Date date = x509Certificate.getNotAfter();
                  arrayOfBoolean = arrayOfBoolean;
                  paramList.add(new a(paramString, str2, str1, date, arrayOfBoolean));
                } 
              } 
            } 
            return;
          } catch (KeyStoreException keyStoreException) {
            System.out.println("Error while finding correct alias: " + keyStoreException.getMessage());
            return;
          } 
        });
    return arrayList;
  }
  
  private static String c(String paramString) {
    Matcher matcher;
    String str;
    Pattern pattern;
    return (matcher = (pattern = Pattern.compile(str = "(?<=CN=)(.*?)(?=,)")).matcher(paramString)).find() ? matcher.group(0) : "";
  }
  
  private static boolean b(KeyStore paramKeyStore, String paramString) {
    String str = "";
    boolean bool = false;
    try {
      Certificate[] arrayOfCertificate;
      if ((arrayOfCertificate = paramKeyStore.getCertificateChain(paramString)).length > 0) {
        X509Certificate x509Certificate;
        String str1 = (x509Certificate = (X509Certificate)arrayOfCertificate[0]).getSubjectX500Principal().toString();
        try {
          LdapName ldapName;
          Iterator<Rdn> iterator = (ldapName = new LdapName(str1)).getRdns().iterator();
          while (iterator.hasNext()) {
            Rdn rdn;
            String str2;
            if ((str2 = (rdn = iterator.next()).getType()).equals("CN")) {
              str = d(rdn.getValue().toString());
            } else if (str.length() != 13 && str2.equals("SERIALNUMBER")) {
              String[] arrayOfString;
              int i = (arrayOfString = arrayOfString = rdn.toString().split("=")).length;
              for (byte b = 0; b < i; b++) {
                String str3;
                if ((str3 = arrayOfString[b]).toUpperCase().startsWith("PNORS-"))
                  str = d(str3); 
              } 
            } 
            if (str.length() == 13) {
              bool = true;
              break;
            } 
          } 
        } catch (InvalidNameException invalidNameException) {
          bool = false;
        } 
      } 
    } catch (KeyStoreException keyStoreException) {
      bool = false;
    } 
    return bool;
  }
  
  public a() {}
  
  private a(String paramString1, String paramString2, String paramString3, Date paramDate, boolean[] paramArrayOfboolean) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramDate;
  }
  
  public String a() {
    return this.a;
  }
  
  public String b() {
    return this.b;
  }
  
  public String c() {
    return this.c;
  }
  
  public Date d() {
    return this.d;
  }
  
  public static String b(KeyStore paramKeyStore) {
    String str = null;
    ArrayList<String> arrayList = new ArrayList();
    try {
      Enumeration<String> enumeration = paramKeyStore.aliases();
      while (enumeration.hasMoreElements()) {
        String str1 = enumeration.nextElement();
        if (paramKeyStore.isKeyEntry(str1)) {
          b("Alias: " + str1);
          arrayList.add(str1);
        } 
      } 
    } catch (KeyStoreException keyStoreException) {
      b("Error while finding alias: " + keyStoreException.getMessage());
    } 
    if (!arrayList.isEmpty())
      str = b(paramKeyStore, arrayList); 
    return str;
  }
  
  private static String d(String paramString) {
    String str = "";
    Matcher matcher;
    Pattern pattern;
    if (paramString != null && (matcher = (pattern = Pattern.compile("[0-9]{13}")).matcher(paramString)).find()) {
      b("PERSONAL ID: " + matcher.group(0));
      str = matcher.group(0);
    } 
    return str;
  }
  
  public static String a(KeyStore paramKeyStore, String paramString) {
    String str = "";
    try {
      Certificate[] arrayOfCertificate;
      if ((arrayOfCertificate = paramKeyStore.getCertificateChain(paramString)).length > 0) {
        X509Certificate x509Certificate;
        String str1 = (x509Certificate = (X509Certificate)arrayOfCertificate[0]).getSubjectX500Principal().toString();
        b("DN: " + str1);
        try {
          LdapName ldapName;
          Iterator<Rdn> iterator = (ldapName = new LdapName(str1)).getRdns().iterator();
          while (iterator.hasNext()) {
            Rdn rdn;
            String str2;
            if ((str2 = (rdn = iterator.next()).getType()).equals("CN")) {
              str = d(rdn.getValue().toString());
            } else if (str.length() != 13 && str2.equals("SERIALNUMBER")) {
              String[] arrayOfString;
              int i = (arrayOfString = arrayOfString = rdn.toString().split("=")).length;
              for (byte b = 0; b < i; b++) {
                String str3;
                if ((str3 = arrayOfString[b]).toUpperCase().startsWith("PNORS-"))
                  str = d(str3); 
              } 
            } 
            if (str.length() != 13);
          } 
        } catch (InvalidNameException invalidNameException) {
          b("Invalid name found while finding personalId: " + invalidNameException.getMessage());
        } 
      } 
    } catch (KeyStoreException keyStoreException) {
      b("Keystore error while finding personalId: " + keyStoreException.getMessage());
    } 
    return str;
  }
  
  private static String b(KeyStore paramKeyStore, List paramList) {
    String str = null;
    for (String str1 : paramList) {
      String str2 = "";
      boolean bool = false;
      try {
        str2 = a(paramKeyStore, str1);
        Certificate[] arrayOfCertificate = paramKeyStore.getCertificateChain(str1);
        for (byte b = 0; b < arrayOfCertificate.length; b++) {
          X509Certificate x509Certificate;
          boolean[] arrayOfBoolean;
          if ((arrayOfBoolean = (x509Certificate = (X509Certificate)arrayOfCertificate[b]).getKeyUsage()) != null) {
            if (arrayOfBoolean[0])
              b("digitalSignature"); 
            if (arrayOfBoolean[1])
              b("nonRepudiation"); 
            if (arrayOfBoolean[2])
              b("keyEncypherment"); 
            if (arrayOfBoolean[3])
              b("dataEncypherment"); 
            if (arrayOfBoolean[4])
              b("keyAgreement"); 
            if (arrayOfBoolean[5])
              b("keyCertSign"); 
            if (arrayOfBoolean[6])
              b("cRLSign"); 
            if (arrayOfBoolean[7])
              b("encipherOnly"); 
            if (arrayOfBoolean[8])
              b("decipherOnly"); 
            bool = (bool || arrayOfBoolean[0] || arrayOfBoolean[1]) ? true : false;
          } 
        } 
      } catch (KeyStoreException keyStoreException) {
        b("Error while finding correct alias: " + keyStoreException.getMessage());
      } 
      if (str2.length() == 13 && bool)
        str = str1; 
    } 
    return str;
  }
  
  public static void c(KeyStore paramKeyStore) {
    try {
      Field field;
      (field = paramKeyStore.getClass().getDeclaredField("keyStoreSpi")).setAccessible(true);
      KeyStoreSpi keyStoreSpi = (KeyStoreSpi)field.get(paramKeyStore);
      if ("sun.security.mscapi.KeyStore$MY".equals(keyStoreSpi.getClass().getName())) {
        (field = keyStoreSpi.getClass().getEnclosingClass().getDeclaredField("entries")).setAccessible(true);
        Collection<?> collection;
        Iterator<?> iterator = (collection = (Collection)field.get(keyStoreSpi)).iterator();
        while (iterator.hasNext()) {
          Object object;
          (field = (object = iterator.next()).getClass().getDeclaredField("certChain")).setAccessible(true);
          X509Certificate[] arrayOfX509Certificate;
          String str2 = Integer.toString((arrayOfX509Certificate = (X509Certificate[])field.get(object))[0].hashCode());
          (field = object.getClass().getDeclaredField("alias")).setAccessible(true);
          String str1;
          if (!(str1 = (String)field.get(object)).equals(str2))
            field.set(object, str1.concat(" - ").concat(str2)); 
        } 
      } 
      return;
    } catch (Exception exception) {
      b("Error while fixing alias: " + exception.getMessage());
      return;
    } 
  }
  
  public static String a(String paramString, HashMap paramHashMap) {
    return a("POST", paramString, paramHashMap);
  }
  
  private static String a(String paramString1, String paramString2, HashMap paramHashMap) {
    HttpURLConnection httpURLConnection;
    URL uRL;
    (httpURLConnection = (HttpURLConnection)(uRL = new URL(paramString2)).openConnection()).setRequestMethod(paramString1);
    httpURLConnection.setRequestProperty("User-Agent", "SmartBoxApp");
    httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
    if (paramHashMap != null) {
      paramString1 = a(paramHashMap);
      httpURLConnection.setDoOutput(true);
      DataOutputStream dataOutputStream;
      (dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream())).writeBytes(paramString1);
      dataOutputStream.flush();
      dataOutputStream.close();
    } 
    httpURLConnection.getResponseCode();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
    StringBuilder stringBuilder = new StringBuilder();
    while ((paramString1 = bufferedReader.readLine()) != null)
      stringBuilder.append(paramString1); 
    bufferedReader.close();
    return stringBuilder.toString();
  }
  
  private static String a(HashMap paramHashMap) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    for (String str : paramHashMap.keySet()) {
      try {
        if (b)
          stringBuilder.append("&"); 
        stringBuilder.append(str).append("=").append(URLEncoder.encode((String)paramHashMap.get(str), "UTF-8"));
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        b("HTTP params encoding error: " + unsupportedEncodingException);
      } 
      b++;
    } 
    return stringBuilder.toString();
  }
  
  public static void a(String paramString) {
    String str = System.getProperty("os.name").toLowerCase();
    Runtime runtime = Runtime.getRuntime();
    try {
      if (str.contains("win")) {
        runtime.exec("rundll32 url.dll,FileProtocolHandler " + paramString);
      } else if (str.contains("mac")) {
        runtime.exec("open " + paramString);
      } else {
        if (str.contains("nix") || str.contains("nux"))
          runtime.exec("xdg-open " + paramString); 
        return;
      } 
    } catch (IOException iOException) {
      b("Ne mogu da otvorim browser!");
    } 
  }
  
  public static void b(String paramString) {
    System.out.println(paramString);
    if (e == null)
      e = new com.itsinbox.smartbox.e.a(); 
    e.a(paramString);
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/a/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */