package com.itsinbox.smartbox.model;

import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;

public final class AnyCard extends SmartCard {
  public final KeyStore loadKeyStore() throws KeyStoreException, CertificateException, IOException, NoSuchAlgorithmException {
    com.itsinbox.smartbox.a.SmartCardLogic.b("SunMSCAPI");
    Provider provider = Security.getProvider("SunMSCAPI");
    KeyStore keyStore;
    (keyStore = KeyStore.getInstance("Windows-MY", provider)).load(null);
    com.itsinbox.smartbox.a.SmartCardLogic.c(keyStore);
    return keyStore;
  }
  
  static {
    new byte[0][];
  }
}


/* Location:              /com/itsinbox/smartbox/c/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */