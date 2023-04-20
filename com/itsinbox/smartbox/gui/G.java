package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.b.a;
import java.security.KeyStore;

final class G implements Runnable {
  G(A paramA) {}
  
  public final void run() {
    KeyStore keyStore;
    if ((keyStore = A.a(this.a).c()) != null) {
      A.b(this.a).setText("Потписивање пријаве у току. Молимо за стрпљење.");
      a a;
      (a = new a()).a(A.c(this.a));
      a.b(A.d(this.a));
      a.a(A.a(this.a));
      a.c(A.e(this.a));
      if (a.a(keyStore)) {
        A.b(this.a).setText("Пријава успешно потписана. Шаљем...");
        try {
          String str;
          if ((str = a.a()) != null) {
            A.a(this.a, a.a());
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