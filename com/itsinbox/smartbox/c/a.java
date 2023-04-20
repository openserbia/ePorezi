package com.itsinbox.smartbox.c;

import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;

public final class a extends c {
  public final KeyStore a() {
    com.itsinbox.smartbox.a.a.b("SunMSCAPI");
    Provider provider = Security.getProvider("SunMSCAPI");
    KeyStore keyStore;
    (keyStore = KeyStore.getInstance("Windows-MY", provider)).load(null);
    com.itsinbox.smartbox.a.a.c(keyStore);
    return keyStore;
  }
  
  static {
    new byte[0][];
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/c/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */