package com.itsinbox.smartbox.b;

import com.itsinbox.smartbox.c.c;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

final class d implements Runnable {
  d(c paramc, CardTerminal paramCardTerminal) {}
  
  public final void run() {
    try {
      char c1 = Character.MIN_VALUE;
      while (true) {
        boolean bool = true;
        try {
          if (c.a(this.b) == null) {
            this.a.waitForCardPresent(c1);
          } else {
            this.a.waitForCardAbsent(c1);
          } 
          if (c.a(this.b) == null && this.a.isCardPresent()) {
            this.b.a();
          } else if (c.a(this.b) != null && !this.a.isCardPresent()) {
            this.b.b();
          } else {
            c1 = 'ஸ';
            bool = false;
          } 
        } catch (CardException cardException) {
          c.a(this.b, (c)null);
          if (this.a.isCardPresent())
            this.b.a(); 
        } 
        if (bool) {
          d d1;
          for (e e : c.b((d1 = this).b))
            c.a(d1.b, e, false); 
        } 
      } 
    } catch (CardException cardException) {
      return;
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/b/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */