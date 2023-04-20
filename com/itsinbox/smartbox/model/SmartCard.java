package com.itsinbox.smartbox.model;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.smartcardio.Card;
import javax.smartcardio.CardException;

public abstract class SmartCard {
  private Card card;
  
  private KeyStore keyStore;
  
  public final void b() throws CardException {
    disconnect(false);
  }
  
  private void disconnect(boolean reset) throws CardException {
    this.card.disconnect(reset);
    this.card = null;
  }
  
  public final void loadKeyStore(Card paramCard) {
    this.card = paramCard;
  }
  
  public final KeyStore getKeyStore() {
    return this.keyStore;
  }
  
  public final void loadKeyStore(KeyStore paramKeyStore) {
    this.keyStore = paramKeyStore;
  }
  
  public abstract KeyStore loadKeyStore() throws KeyStoreException, CertificateException, IOException, NoSuchAlgorithmException;
}


/* Location:              /com/itsinbox/smartbox/c/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */