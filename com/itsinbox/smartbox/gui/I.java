package com.itsinbox.smartbox.gui;

import SmartCardLogic;
import com.itsinbox.smartbox.model.b;
import java.security.KeyStore;
import java.util.List;

final class I extends Thread {
  I(A paramA) {}
  
  public final void run() {
    KeyStore keyStore;
    if ((keyStore = A.i(this.a)) == null) {
      A.b(this.a).setText("<html>Грешка у одабиру сертификационог тела или његовом софтверу.</html>");
      return;
    } 
    List<?> list2;
    if ((list2 = SmartCardLogic.a(keyStore)).isEmpty()) {
      A.b(this.a).setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
      return;
    } 
    List<?> list1;
    if (!(list1 = SmartCardLogic.a(keyStore, list2)).isEmpty()) {
      if (list1.size() > 1) {
        b b;
        (b = (b)A.j(this.a).getModel()).a(list1);
      } else {
        A.b(this.a, ((SmartCardLogic)list1.get(0)).SmartCardLogic());
      } 
    } else {
      A.b(this.a).setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
    } 
    if (A.a(this.a).c() != null) {
      if (A.c(this.a) == null) {
        A.k(this.a).setVisible(true);
        A.l(this.a);
        A.m(this.a).setText("Из табеле изаберите сертификат којим желите да потпишете и поднесете пријаву.");
        A.b(this.a).setText("Читач и картица препознати.");
        return;
      } 
      A.m(this.a).setText("Да ли сте сигурни да желите да потпишете и поднесете пријаву?");
      A.b(this.a).setText("Читач и картица препознати.");
      A.n(this.a);
      A.o(this.a);
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/gui/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */