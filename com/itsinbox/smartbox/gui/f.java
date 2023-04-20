package com.itsinbox.smartbox.gui;

import java.util.Timer;
import java.util.TimerTask;

final class f extends TimerTask {
  f(d paramd, Timer paramTimer) {}
  
  public final void run() {
    d.a(this.b);
    if (d.b(this.b) != null) {
      this.a.cancel();
      this.a.purge();
      d.c(this.b);
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/gui/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */