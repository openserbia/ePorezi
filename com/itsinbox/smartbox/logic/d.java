package com.itsinbox.smartbox.logic;

import com.itsinbox.smartbox.model.SmartCard;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

final class d implements Runnable {
  d(SmartCard paramc, CardTerminal paramCardTerminal) {}
  
  public final void run() {
    try {
      char c1 = Character.MIN_VALUE;
      while (true) {
        boolean bool = true;
        try {
          if (SmartCard.a(this.b) == null) {
            this.a.waitForCardPresent(c1);
          } else {
            this.a.waitForCardAbsent(c1);
          } 
          if (SmartCard.a(this.b) == null && this.a.isCardPresent()) {
            this.b.a();
          } else if (SmartCard.a(this.b) != null && !this.a.isCardPresent()) {
            this.b.b();
          } else {
            c1 = 'ஸ';
            bool = false;
          } 
        } catch (CardException cardException) {
          SmartCard.a(this.b, (SmartCard)null);
          if (this.a.isCardPresent())
            this.b.a(); 
        } 
        if (bool) {
          d d1;
          for (e e : SmartCard.b((d1 = this).b))
            SmartCard.a(d1.b, e, false);
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