package com.itsinbox.smartbox.b;

import com.itsinbox.smartbox.a.a;
import com.itsinbox.smartbox.c.a;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;

public final class c {
  private final CardTerminal a;
  
  private volatile com.itsinbox.smartbox.c.c b;
  
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
    com.itsinbox.smartbox.d.c.b();
    card = card;
    a a = new a();
    a.b("CertBody: ANY");
    a.a(card);
    card.getBasicChannel();
    this.b = (com.itsinbox.smartbox.c.c)a;
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