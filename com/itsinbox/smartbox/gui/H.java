package com.itsinbox.smartbox.gui;

import java.util.Timer;
import java.util.TimerTask;

final class H extends TimerTask {
  H(A paramA, Timer paramTimer) {}
  
  public final void run() {
    A.f(this.b);
    if (A.g(this.b) != null) {
      this.a.cancel();
      this.a.purge();
      A.h(this.b);
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/gui/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */