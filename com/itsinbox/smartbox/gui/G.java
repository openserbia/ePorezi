package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.logic.SigningLogic;

import java.security.KeyStore;

final class G implements Runnable {
  G(A paramA) {}
  
  public final void run() {
    KeyStore keyStore;
    if ((keyStore = A.a(this.a).c()) != null) {
      A.b(this.a).setText("Потписивање пријаве у току. Молимо за стрпљење.");
      SigningLogic SigningLogic;
      (SigningLogic = new SigningLogic()).a(A.c(this.a));
      SigningLogic.b(A.d(this.a));
      SigningLogic.a(A.a(this.a));
      SigningLogic.c(A.e(this.a));
      if (SigningLogic.a(keyStore)) {
        A.b(this.a).setText("Пријава успешно потписана. Шаљем...");
        try {
          String str;
          if ((str = SigningLogic.a()) != null) {
            A.a(this.a, SigningLogic.a());
            A.b(this.a).setText("Потписана пријава је послата.");
            A.a(this.a).b();
            System.exit(0);
          } else {
            A.b(this.a).setText("Грешка приликом потписивања пријаве!");
            return;
          } 
        } catch (Exception exception) {
          A.b(this.a).setText("Грешка у комуникацији са сервером.");
          return;
        } 
      } else {
        A.b(this.a).setText("Грешка приликом потписивања пријаве!");
      } 
    } 
  }
}


/* Location:              /com/itsinbox/smartbox/gui/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */