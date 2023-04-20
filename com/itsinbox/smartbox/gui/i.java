package com.itsinbox.smartbox.gui;

import SmartCardLogic;
import com.itsinbox.smartbox.model.b;
import java.security.KeyStore;
import java.util.List;

final class i extends Thread {
  i(d paramd) {}
  
  public final void run() {
    KeyStore keyStore;
    if ((keyStore = d.s(this.a)) == null) {
      d.o(this.a).setText("<html>Грешка у одабиру сертификационог тела или његовом софтверу.</html>");
      return;
    } 
    List<?> list2;
    if ((list2 = SmartCardLogic.a(keyStore)).isEmpty()) {
      d.o(this.a).setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
      return;
    } 
    List<?> list1;
    if (!(list1 = SmartCardLogic.a(keyStore, list2)).isEmpty()) {
      if (list1.size() > 1) {
        b b;
        (b = (b)d.t(this.a).getModel()).a(list1);
      } else {
        d.c(this.a, ((SmartCardLogic)list1.get(0)).SmartCardLogic());
      } 
    } else {
      d.o(this.a).setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
    } 
    if (d.d(this.a).c() != null) {
      if (d.u(this.a) == null) {
        d.v(this.a).setVisible(true);
        d.p(this.a);
        d.o(this.a).setText("Из табеле изаберите сертификат за пријаву.");
        return;
      } 
      d.o(this.a).setText("Читач и картица препознати.");
      d.n(this.a);
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/gui/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */