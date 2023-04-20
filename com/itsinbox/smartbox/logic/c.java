package com.itsinbox.smartbox.logic;

import com.itsinbox.smartbox.a.SmartCardLogic;
import com.itsinbox.smartbox.model.SmartCard;
import com.itsinbox.smartbox.proxy.ProxyUtils;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;

public final class c {
  private final CardTerminal a;
  
  private volatile SmartCard b;
  
  private CopyOnWriteArrayList c;
  
  private final Thread d;
  
  public c(CardTerminal paramCardTerminal) {
    this.a = paramCardTerminal;
    this.c = new CopyOnWriteArrayList();
    this.d = new Thread(new d(this, paramCardTerminal));
    this.d.start();
  }
  
  public final void a(e parame) {
    this.c.add(parame);
    a(parame, true);
  }
  
  private void a(e parame, boolean paramBoolean) {
    if (this.b != null) {
      parame.a(this.b);
      return;
    } 
    if (!paramBoolean)
      parame.a(); 
  }
  
  public final void a() {
    Card card = this.a.connect("*");
    ProxyUtils.b();
    card = card;
    SmartCardLogic SmartCardLogic = new SmartCardLogic();
    SmartCardLogic.b("CertBody: ANY");
    SmartCardLogic.a(card);
    card.getBasicChannel();
    this.b = (SmartCard) SmartCardLogic;
  }
  
  public final void b() {
    this.b.b();
    this.b = null;
  }
}


/* Location:              /com/itsinbox/smartbox/b/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */