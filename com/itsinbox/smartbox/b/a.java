package com.itsinbox.smartbox.b;

import com.itsinbox.smartbox.c.c;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public final class a {
  private String a;
  
  private c b = null;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  public final void a(String paramString) {
    this.a = paramString;
  }
  
  public final void b(String paramString) {
    this.c = paramString;
  }
  
  public final void a(c paramc) {
    this.b = paramc;
  }
  
  public final void c(String paramString) {
    this.d = paramString;
  }
  
  public final String a() {
    return this.e;
  }
  
  public final void d(String paramString) {
    this.f = paramString;
  }
  
  public final void e(String paramString) {
    this.g = paramString;
  }
  
  private b c(KeyStore paramKeyStore) {
    String str;
    if ((str = this.a) == null)
      str = com.itsinbox.smartbox.a.a.b(paramKeyStore); 
    f(str);
    try {
      if (str != null) {
        Certificate[] arrayOfCertificate = paramKeyStore.getCertificateChain(str);
        PrivateKey privateKey = (PrivateKey)paramKeyStore.getKey(str, null);
        b b1;
        (b1 = new b()).a = privateKey;
        b1.b = arrayOfCertificate;
        for (byte b = 0; b < arrayOfCertificate.length; b++) {
          X509Certificate x509Certificate;
          boolean[] arrayOfBoolean = (x509Certificate = (X509Certificate)arrayOfCertificate[b]).getKeyUsage();
          com.itsinbox.smartbox.a.a.b("Chain member: " + b);
          if (arrayOfBoolean[0])
            com.itsinbox.smartbox.a.a.b("digitalSignature"); 
          if (arrayOfBoolean[1])
            com.itsinbox.smartbox.a.a.b("nonRepudiation"); 
          if (arrayOfBoolean[2])
            com.itsinbox.smartbox.a.a.b("keyEncypherment"); 
          if (arrayOfBoolean[3])
            com.itsinbox.smartbox.a.a.b("dataEncypherment"); 
          if (arrayOfBoolean[4])
            com.itsinbox.smartbox.a.a.b("keyAgreement"); 
          if (arrayOfBoolean[5])
            com.itsinbox.smartbox.a.a.b("keyCertSign"); 
          if (arrayOfBoolean[6])
            com.itsinbox.smartbox.a.a.b("cRLSign"); 
          if (arrayOfBoolean[7])
            com.itsinbox.smartbox.a.a.b("encipherOnly"); 
          if (arrayOfBoolean[8])
            com.itsinbox.smartbox.a.a.b("decipherOnly"); 
          if (arrayOfBoolean[0] || arrayOfBoolean[1])
            b1.c = x509Certificate; 
        } 
        return b1;
      } 
      return null;
    } catch (KeyStoreException|NoSuchAlgorithmException|java.security.UnrecoverableKeyException keyStoreException) {
      com.itsinbox.smartbox.a.a.b("Error while getting key and certificate chain: " + keyStoreException.getMessage());
      return null;
    } 
  }
  
  public final boolean a(KeyStore paramKeyStore) {
    DocumentBuilder documentBuilder;
    Document document;
    b b;
    X509Certificate x509Certificate;
    if ((x509Certificate = (b = c(paramKeyStore)).c) == null)
      x509Certificate = (X509Certificate)b.b[0]; 
    KeyPair keyPair = new KeyPair(x509Certificate.getPublicKey(), b.a);
    DocumentBuilderFactory documentBuilderFactory;
    (documentBuilderFactory = DocumentBuilderFactory.newInstance()).setNamespaceAware(true);
    try {
      documentBuilder = documentBuilderFactory.newDocumentBuilder();
    } catch (ParserConfigurationException parserConfigurationException) {
      com.itsinbox.smartbox.a.a.b("Error while building document for signing: " + parserConfigurationException.getMessage());
      return false;
    } 
    try {
      a a1;
      document = documentBuilder.parse((new URL((a1 = this).c + "?jmbg=" + this.d)).openStream());
    } catch (SAXException|java.io.IOException sAXException) {
      com.itsinbox.smartbox.a.a.b("Error while parsing document for signing: " + sAXException.getMessage());
      return false;
    } 
    Element element1;
    Element element2 = (Element)(element1 = document.getDocumentElement()).getElementsByTagName("signatures").item(0);
    DOMSignContext dOMSignContext = new DOMSignContext(keyPair.getPrivate(), element2);
    (element1 = (Element)element1.getElementsByTagName("deklaracijaZaglavlje").item(0)).setIdAttributeNode(element1.getAttributeNodeNS(null, "id"), true);
    String str = element1.getAttribute("id");
    try {
      XMLSignatureFactory xMLSignatureFactory = XMLSignatureFactory.getInstance("DOM");
      ArrayList<Transform> arrayList1 = new ArrayList();
      TransformParameterSpec transformParameterSpec = null;
      xMLSignatureFactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", transformParameterSpec);
      Transform transform = xMLSignatureFactory.newTransform("http://www.w3.org/2001/10/xml-exc-c14n#", transformParameterSpec);
      arrayList1.add(transform);
      Reference reference = xMLSignatureFactory.newReference("#" + str, xMLSignatureFactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), arrayList1, null, null);
      SignedInfo signedInfo = xMLSignatureFactory.newSignedInfo(xMLSignatureFactory.newCanonicalizationMethod("http://www.w3.org/2001/10/xml-exc-c14n#", (C14NMethodParameterSpec)null), xMLSignatureFactory.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null), Collections.singletonList(reference));
      KeyInfoFactory keyInfoFactory = xMLSignatureFactory.getKeyInfoFactory();
      ArrayList<X509Certificate> arrayList2;
      (arrayList2 = new ArrayList<>()).add(x509Certificate);
      X509IssuerSerial x509IssuerSerial = keyInfoFactory.newX509IssuerSerial(x509Certificate.getIssuerDN().getName(), x509Certificate.getSerialNumber());
      arrayList2.add(x509IssuerSerial);
      arrayList2.add(x509Certificate.getSubjectX500Principal().toString());
      X509Data x509Data = keyInfoFactory.newX509Data(arrayList2);
      keyInfoFactory.newKeyValue(keyPair.getPublic());
      ArrayList<X509Data> arrayList;
      (arrayList = new ArrayList<>()).add(x509Data);
      KeyInfo keyInfo = keyInfoFactory.newKeyInfo(arrayList);
      XMLSignature xMLSignature;
      (xMLSignature = xMLSignatureFactory.newXMLSignature(signedInfo, keyInfo)).sign(dOMSignContext);
      try {
        StringWriter stringWriter = new StringWriter();
        Transformer transformer;
        (transformer = TransformerFactory.newInstance().newTransformer()).transform(new DOMSource(document), new StreamResult(stringWriter));
        String str1 = stringWriter.toString();
        try {
          str1 = URLEncoder.encode(str1, "UTF-8");
          a a2;
          (a2 = this).e = str1;
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          com.itsinbox.smartbox.a.a.b("Error while writing signature results: " + unsupportedEncodingException.getMessage());
        } 
        a a1;
        com.itsinbox.smartbox.a.a.b("SIGNATURE: " + (a1 = this).e);
      } catch (TransformerException transformerException) {
        com.itsinbox.smartbox.a.a.b("Error while writing signature results: " + transformerException.getMessage());
        return false;
      } 
    } catch (NoSuchAlgorithmException|java.security.InvalidAlgorithmParameterException|java.security.KeyException|javax.xml.crypto.MarshalException|javax.xml.crypto.dsig.XMLSignatureException noSuchAlgorithmException) {
      com.itsinbox.smartbox.a.a.b("Error while signing XML: " + noSuchAlgorithmException.getMessage());
      return false;
    } 
    return true;
  }
  
  private String f(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      a a1;
      if ((a1 = this).b != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        Certificate[] arrayOfCertificate;
        if ((arrayOfCertificate = (a1 = this).b.c().getCertificateChain(paramString)).length > 0) {
          X509Certificate x509Certificate;
          String str = (x509Certificate = (X509Certificate)arrayOfCertificate[0]).getSubjectX500Principal().toString();
          try {
            LdapName ldapName;
            Iterator<Rdn> iterator = (ldapName = new LdapName(str)).getRdns().iterator();
            while (iterator.hasNext()) {
              Rdn rdn;
              String str1;
              if ((rdn = iterator.next()).getType().equals("CN") && (str1 = rdn.getValue().toString()) != null) {
                String[] arrayOfString = str1.split(" ");
                String str2 = arrayOfString[0];
                (a1 = this).f = str2;
                if (arrayOfString.length > 1) {
                  str2 = arrayOfString[1];
                  (a1 = this).g = str2;
                } 
              } 
            } 
          } catch (InvalidNameException invalidNameException) {
            com.itsinbox.smartbox.a.a.b("Error while getting certificate info: " + invalidNameException);
          } 
          stringBuilder1.append(this.f).append(" ").append(this.g).append(" [").append(this.d).append("]");
          stringBuilder.append(stringBuilder1.toString());
        } 
      } else {
        stringBuilder.append("Not a key entry!");
      } 
    } catch (KeyStoreException keyStoreException) {
      com.itsinbox.smartbox.a.a.b("Error while getting certificate info: " + keyStoreException);
    } 
    return stringBuilder.toString();
  }
  
  public final boolean b(KeyStore paramKeyStore) {
    DocumentBuilder documentBuilder;
    Document document;
    b b;
    X509Certificate x509Certificate;
    if ((x509Certificate = (b = c(paramKeyStore)).c) == null)
      x509Certificate = (X509Certificate)b.b[0]; 
    KeyPair keyPair = new KeyPair(x509Certificate.getPublicKey(), b.a);
    DocumentBuilderFactory documentBuilderFactory;
    (documentBuilderFactory = DocumentBuilderFactory.newInstance()).setNamespaceAware(true);
    try {
      documentBuilder = documentBuilderFactory.newDocumentBuilder();
    } catch (ParserConfigurationException parserConfigurationException) {
      com.itsinbox.smartbox.a.a.b("Error while building document for signing: " + parserConfigurationException.getMessage());
      return false;
    } 
    try {
      a a1;
      String str1 = (a1 = this).c + "?jmbg=" + this.d;
      document = documentBuilder.parse((new URL(str1)).openStream());
    } catch (SAXException sAXException) {
      com.itsinbox.smartbox.a.a.b("Error while parsing document for signing: " + sAXException.getMessage());
      return false;
    } 
    Element element1;
    Element element2 = (Element)(element1 = document.getDocumentElement()).getElementsByTagName("signatures").item(0);
    DOMSignContext dOMSignContext = new DOMSignContext(keyPair.getPrivate(), element2);
    (element1 = (Element)element1.getElementsByTagName("deklaracijaZaglavlje").item(0)).setIdAttributeNode(element1.getAttributeNodeNS(null, "id"), true);
    String str = element1.getAttribute("id");
    try {
      XMLSignatureFactory xMLSignatureFactory = XMLSignatureFactory.getInstance("DOM");
      ArrayList<Transform> arrayList = new ArrayList();
      TransformParameterSpec transformParameterSpec = null;
      xMLSignatureFactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", transformParameterSpec);
      Transform transform = xMLSignatureFactory.newTransform("http://www.w3.org/2001/10/xml-exc-c14n#", transformParameterSpec);
      arrayList.add(transform);
      Reference reference = xMLSignatureFactory.newReference("#" + str, xMLSignatureFactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), arrayList, null, null);
      SignedInfo signedInfo = xMLSignatureFactory.newSignedInfo(xMLSignatureFactory.newCanonicalizationMethod("http://www.w3.org/2001/10/xml-exc-c14n#", (C14NMethodParameterSpec)null), xMLSignatureFactory.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null), Collections.singletonList(reference));
      KeyInfoFactory keyInfoFactory = xMLSignatureFactory.getKeyInfoFactory();
      ArrayList<X509Certificate> arrayList1;
      (arrayList1 = new ArrayList<>()).add(x509Certificate);
      X509IssuerSerial x509IssuerSerial = keyInfoFactory.newX509IssuerSerial(x509Certificate.getIssuerDN().getName(), x509Certificate.getSerialNumber());
      arrayList1.add(x509IssuerSerial);
      arrayList1.add(x509Certificate.getSubjectX500Principal().toString());
      X509Data x509Data = keyInfoFactory.newX509Data(arrayList1);
      KeyValue keyValue = keyInfoFactory.newKeyValue(keyPair.getPublic());
      (arrayList1 = new ArrayList<>()).add(x509Data);
      arrayList1.add(keyValue);
      KeyInfo keyInfo = keyInfoFactory.newKeyInfo(arrayList1);
      XMLSignature xMLSignature;
      (xMLSignature = xMLSignatureFactory.newXMLSignature(signedInfo, keyInfo)).sign(dOMSignContext);
      try {
        StringWriter stringWriter = new StringWriter();
        Transformer transformer;
        (transformer = TransformerFactory.newInstance().newTransformer()).transform(new DOMSource(document), new StreamResult(stringWriter));
        String str1 = stringWriter.toString();
        try {
          str1 = URLEncoder.encode(str1, "UTF-8");
          a a2;
          (a2 = this).e = str1;
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          com.itsinbox.smartbox.a.a.b("Error while writing signature results: " + unsupportedEncodingException);
        } 
        a a1;
        com.itsinbox.smartbox.a.a.b("SIGNATURE: " + (a1 = this).e);
      } catch (TransformerException transformerException) {
        com.itsinbox.smartbox.a.a.b("Error while writing signature results: " + transformerException.getMessage());
        return false;
      } 
    } catch (NoSuchAlgorithmException|java.security.InvalidAlgorithmParameterException|java.security.KeyException|javax.xml.crypto.MarshalException|javax.xml.crypto.dsig.XMLSignatureException noSuchAlgorithmException) {
      com.itsinbox.smartbox.a.a.b("Error while signing XML for login: " + noSuchAlgorithmException);
      return false;
    } 
    return true;
  }
}


/* Location:              /com/itsinbox/smartbox/b/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */