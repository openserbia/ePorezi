package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.a.a;
import java.security.KeyStore;
import java.util.HashMap;

final class g extends Thread {
  g(d paramd, String paramString) {}
  
  public final void run() {
    KeyStore keyStore;
    if ((keyStore = d.d(this.b).c()) != null) {
      d.e(this.b);
      if (d.a(this.b, this.a, keyStore)) {
        a.b("IM SENDING: " + d.f(this.b));
        HashMap<Object, Object> hashMap;
        (hashMap = new HashMap<>()).put("jmbg", d.g(this.b));
        hashMap.put("firstName", d.h(this.b));
        hashMap.put("lastName", d.i(this.b));
        hashMap.put("pinOK", "true");
        hashMap.put("token", d.f(this.b));
        hashMap.put("chosenAlias", d.j(this.b));
        if (d.k(this.b))
          d.a(this.b, d.l(this.b)); 
        hashMap.put("loginKey", d.m(this.b));
        try {
          a.a(this.a + "/sw4i/smartBoxLogin", hashMap);
          if (d.k(this.b))
            a.a(this.a + "/user/login2.html?loginKey=" + d.m(this.b)); 
          d.d(this.b).b();
          System.exit(0);
        } catch (Exception exception) {
          a.b("Error in communication with the server while logging in: " + exception.getMessage());
          d.n(this.b);
          d.o(this.b).setText("Грешка у комуникацији са сервером.");
        } 
      } else {
        a.b("Error: Something wrong with the certificate!");
      } 
    } 
    d.p(this.b);
    d.n(this.b);
    d.q(this.b);
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/gui/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */