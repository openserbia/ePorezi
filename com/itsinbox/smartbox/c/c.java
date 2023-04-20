package com.itsinbox.smartbox.c;

import java.security.KeyStore;
import javax.smartcardio.Card;

public abstract class c {
  private Card a;
  
  private KeyStore b;
  
  public final void b() {
    a(false);
  }
  
  private void a(boolean paramBoolean) {
    this.a.disconnect(false);
    this.a = null;
  }
  
  public final void a(Card paramCard) {
    this.a = paramCard;
  }
  
  public final KeyStore c() {
    return this.b;
  }
  
  public final void a(KeyStore paramKeyStore) {
    this.b = paramKeyStore;
  }
  
  public abstract KeyStore a();
}


/* Location:              /com/itsinbox/smartbox/c/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */