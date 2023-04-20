package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.a;
import com.itsinbox.smartbox.a.a;
import com.itsinbox.smartbox.b.a;
import com.itsinbox.smartbox.b.c;
import com.itsinbox.smartbox.b.e;
import com.itsinbox.smartbox.c.b;
import com.itsinbox.smartbox.c.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class d extends JFrame implements e, ActionListener {
  private String a;
  
  private final boolean b;
  
  private c c = null;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private String h = null;
  
  private String i;
  
  private String j;
  
  private CardTerminal k;
  
  private String l;
  
  private final a m;
  
  private boolean n = false;
  
  private JLabel o;
  
  private JTable p;
  
  private JPanel q;
  
  private JPanel r;
  
  private JButton s;
  
  private JLabel t;
  
  private JLabel u;
  
  private JLabel v;
  
  private JPanel w;
  
  private JPanel x;
  
  private JScrollPane y;
  
  private JLabel z;
  
  private JButton A;
  
  private JButton B;
  
  private JButton C;
  
  private JPanel D;
  
  private JLabel E;
  
  private JButton F;
  
  private JLabel G;
  
  private JLabel H;
  
  public d(a parama, String paramString) {
    this.m = parama;
    this.a = paramString;
    this.b = (paramString == null);
    d d1 = this;
    d1.D = new JPanel();
    d1.B = new JButton();
    d1.C = new JButton();
    d1.v = new JLabel();
    d1.E = new JLabel();
    d1.t = new JLabel();
    d1.s = new JButton();
    d1.q = new JPanel();
    d1.y = new JScrollPane();
    d1.p = new JTable();
    d1.w = new JPanel();
    d1.o = new JLabel();
    d1.r = new JPanel();
    d1.z = new JLabel();
    d1.x = new JPanel();
    d1.A = new JButton();
    d1.u = new JLabel();
    d1.F = new JButton();
    d1.G = new JLabel();
    d1.H = new JLabel();
    d1.setDefaultCloseOperation(3);
    d1.setResizable(false);
    d1.D.setMaximumSize((Dimension)null);
    d1.B.setBackground(new Color(210, 44, 52));
    d1.B.setFont(new Font("Tahoma", 0, 18));
    d1.B.setForeground(new Color(255, 255, 255));
    d1.B.setText("ПРИСТУП ПОРТАЛУ");
    d1.B.setToolTipText("");
    d1.B.setBorder((Border)null);
    d1.B.setBorderPainted(false);
    d1.B.setContentAreaFilled(false);
    d1.B.setMaximumSize(new Dimension(120, 50));
    d1.B.setMinimumSize(new Dimension(120, 50));
    d1.B.setOpaque(true);
    d1.B.setPreferredSize(new Dimension(120, 50));
    d1.B.addActionListener(new e(d1));
    d1.C.setBackground(new Color(33, 48, 84));
    d1.C.setFont(new Font("Tahoma", 0, 18));
    d1.C.setForeground(new Color(255, 255, 255));
    d1.C.setText("Тестно окружење");
    d1.C.setBorder((Border)null);
    d1.C.setBorderPainted(false);
    d1.C.setContentAreaFilled(false);
    d1.C.setMaximumSize(new Dimension(120, 50));
    d1.C.setMinimumSize(new Dimension(120, 50));
    d1.C.setOpaque(true);
    d1.C.setPreferredSize(new Dimension(120, 50));
    d1.C.addActionListener(new k(d1));
    d1.v.setFont(new Font("Arial", 0, 12));
    d1.v.setText("<html>\"Тестно окружење\" служи за тестирање и проверу исправности електронских пореских пријава. Пријаве које су поднете путем \"Тестног окружења\" не стварају пореску обавезу.</html>");
    d1.v.setVerticalAlignment(1);
    d1.E.setFont(new Font("Arial", 0, 12));
    d1.E.setText("<html>Сва питања, сугестије и примедбе на рад портала еПорези можете послати електронском поштом на адресу <a href=\"mailto:eporezi@purs.gov.rs\">eporezi@purs.gov.rs</a></html>");
    d1.E.setVerticalAlignment(1);
    d1.E.addMouseListener(new l(d1));
    d1.t.setFont(new Font("Arial", 1, 14));
    d1.t.setText("Пријавите се на");
    d1.s.setIcon(new ImageIcon(d1.getClass().getResource("/com/itsinbox/smartbox/resources/header.png")));
    d1.s.setBorder((Border)null);
    d1.s.setBorderPainted(false);
    d1.s.setContentAreaFilled(false);
    d1.s.setFocusPainted(false);
    d1.s.setFocusable(false);
    d1.q.setBackground(new Color(228, 228, 228));
    d1.y.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    d1.y.setViewportBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    d1.p.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    d1.p.setFont(new Font("Arial", 0, 12));
    d1.p.setModel(new m(d1, new Object[][] { { null, null, null, null }, , { null, null, null, null }, , { null, null, null, null }, , { null, null, null, null },  }, (Object[])new String[] { "Алиас", "Издат за", "Издат од", "Важи до" }));
    d1.p.getTableHeader().setReorderingAllowed(false);
    d1.y.setViewportView(d1.p);
    if (d1.p.getColumnModel().getColumnCount() > 0) {
      d1.p.getColumnModel().getColumn(0).setResizable(false);
      d1.p.getColumnModel().getColumn(1).setResizable(false);
      d1.p.getColumnModel().getColumn(2).setResizable(false);
      d1.p.getColumnModel().getColumn(3).setResizable(false);
    } 
    GroupLayout groupLayout1 = new GroupLayout(d1.q);
    d1.q.setLayout(groupLayout1);
    groupLayout1.setHorizontalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.y, GroupLayout.Alignment.TRAILING, -1, 935, 32767));
    groupLayout1.setVerticalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.y, -2, 94, -2));
    d1.w.setBackground(new Color(228, 228, 228));
    d1.o.setFont(new Font("Arial", 0, 12));
    d1.o.setText("Статус сертификата.");
    d1.o.setVerticalAlignment(1);
    GroupLayout groupLayout2 = new GroupLayout(d1.w);
    d1.w.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addComponent(d1.o, -1, -1, 32767).addContainerGap()));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(d1.o, -1, 51, 32767).addContainerGap()));
    d1.r.setBackground(new Color(211, 211, 211));
    d1.r.setMaximumSize(new Dimension(32767, 1));
    d1.r.setPreferredSize(new Dimension(913, 1));
    groupLayout2 = new GroupLayout(d1.r);
    d1.r.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1, 32767));
    d1.A.setIcon(new ImageIcon(d1.getClass().getResource("/com/itsinbox/smartbox/resources/log_36.png")));
    d1.A.setToolTipText("Лог");
    d1.A.setBorder((Border)null);
    d1.A.setBorderPainted(false);
    d1.A.setContentAreaFilled(false);
    d1.A.setFocusPainted(false);
    d1.A.addActionListener(new n(d1));
    d1.u.setFont(new Font("Arial", 1, 14));
    d1.u.setHorizontalAlignment(2);
    d1.u.setText("<html>Пажња! Три неуспешна покушаја уноса ПИН кода блокираће вашу картицу.</html>");
    d1.F.setIcon(new ImageIcon(d1.getClass().getResource("/com/itsinbox/smartbox/resources/settings.png")));
    d1.F.setToolTipText("Подешавања");
    d1.F.setBorder((Border)null);
    d1.F.setBorderPainted(false);
    d1.F.setContentAreaFilled(false);
    d1.F.addActionListener(new o(d1));
    groupLayout2 = new GroupLayout(d1.x);
    d1.x.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addComponent(d1.u).addGap(29, 29, 29).addComponent(d1.F, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(d1.A)));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.A, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap(-1, 32767).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(d1.u, -2, -1, -2).addComponent(d1.F)).addContainerGap()));
    groupLayout2 = new GroupLayout(d1.D);
    d1.D.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(446, 446, 446).addComponent(d1.z).addGap(0, 0, 32767)).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.r, GroupLayout.Alignment.TRAILING, -1, 935, 32767).addComponent(d1.s, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(d1.E, GroupLayout.Alignment.LEADING, -1, 550, 32767).addComponent(d1.B, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(d1.t, -1, -1, 32767).addComponent(d1.C, GroupLayout.Alignment.TRAILING, -1, 314, 32767)).addComponent(d1.v, GroupLayout.Alignment.TRAILING, -2, 316, -2))).addComponent(d1.w, -1, -1, 32767).addComponent(d1.x, -1, -1, 32767).addComponent(d1.q, -1, -1, 32767)))).addContainerGap()));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(d1.s).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(d1.x, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(d1.q, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.w, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.z).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.r, -2, -1, -2).addGap(18, 18, 18).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout2.createSequentialGroup().addComponent(d1.t).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.C, -1, -1, 32767)).addComponent(d1.B, -1, -1, 32767)).addGap(12, 12, 12).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.v, -2, 78, -2).addComponent(d1.E, -2, 34, -2))));
    d1.G.setFont(new Font("Arial", 1, 14));
    d1.G.setForeground(new Color(255, 0, 51));
    d1.G.addMouseListener(new p(d1));
    d1.H.setFont(new Font("Arial", 1, 14));
    d1.H.setForeground(new Color(255, 0, 51));
    d1.H.setText("Нова верзија апликације је доступна. Кликните овде за преузимање.");
    d1.H.addMouseListener(new q(d1));
    groupLayout1 = new GroupLayout(d1.getContentPane());
    d1.getContentPane().setLayout(groupLayout1);
    groupLayout1.setHorizontalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addContainerGap().addGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addComponent(d1.D, -2, -1, -2).addGap(0, 0, 32767)).addGroup(groupLayout1.createSequentialGroup().addGap(10, 10, 10).addGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(d1.H, -1, -1, 32767).addComponent(d1.G, -1, -1, 32767)))).addContainerGap()));
    groupLayout1.setVerticalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addGap(21, 21, 21).addComponent(d1.D, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.H).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(d1.G).addGap(21, 21, 21)));
    d1.pack();
    (d1 = this).setTitle("еПорези 1.3.1");
    d1.setLocationRelativeTo(null);
    d1.setIconImage(Toolkit.getDefaultToolkit().getImage(d1.getClass().getResource("/com/itsinbox/smartbox/resources/app.png")));
    d1.H.setVisible(false);
    d d2 = d1;
    b b = new b(new ArrayList());
    d2.p.setModel((TableModel)b);
    d2.p.getTableHeader().setFont(new Font("Arial", 1, 13));
    d2.p.setShowGrid(false);
    d2.p.setRowMargin(0);
    d2.p.setShowVerticalLines(false);
    d2.p.setShowHorizontalLines(false);
    boolean bool = false;
    TableColumn tableColumn;
    JTable jTable;
    (tableColumn = (jTable = d2.p).getColumnModel().getColumn(0)).setMinWidth(0);
    tableColumn.setMaxWidth(0);
    tableColumn.setResizable(false);
    d2.q.setVisible(false);
    ListSelectionModel listSelectionModel;
    (listSelectionModel = d2.p.getSelectionModel()).setSelectionMode(0);
    listSelectionModel.addListSelectionListener(paramListSelectionEvent -> {
          if (!paramListSelectionEvent.getValueIsAdjusting() && this.p.getSelectedRow() >= 0) {
            int[] arrayOfInt = this.p.getSelectedRows();
            String str = (String)this.p.getValueAt(arrayOfInt[0], 0);
            this.o.setText("<html>Изабран је сертификат: <b>" + (String)this.p.getValueAt(arrayOfInt[0], 1) + ", " + (String)this.p.getValueAt(arrayOfInt[0], 2) + "</b></html>");
            this.h = str;
            f();
          } 
        });
    d1.pack();
    b();
    c();
    d1 = this;
    (new h(d1)).start();
  }
  
  public static void a(a parama, String paramString) {
    EventQueue.invokeLater(new r(parama, paramString));
  }
  
  private void b() {
    try {
      TerminalFactory terminalFactory;
      List<CardTerminal> list = (terminalFactory = TerminalFactory.getDefault()).terminals().list();
      this.k = list.get(0);
      this.o.setText("Картица није пронађена. Молим, убаците картицу у читач.");
      i();
      return;
    } catch (Exception exception) {
      this.o.setText("Читач картица није пронађен.");
      i();
      return;
    } 
  }
  
  private void c() {
    if (this.k != null) {
      c c1;
      (c1 = new c(this.k)).a(this);
      return;
    } 
    d();
  }
  
  private void d() {
    Timer timer = new Timer();
    f f = new f(this, timer);
    timer.schedule(f, 1000L, 1000L);
  }
  
  private void a(String paramString) {
    if (this.k == null) {
      this.o.setText("Читач картица није пронађен.");
      JOptionPane.showMessageDialog(null, "Читач картица није пронађен.", "SmartBox", 0);
      return;
    } 
    if (this.c == null) {
      this.o.setText("Картица није пронађена. Молим, убаците картицу у читач.");
      JOptionPane.showMessageDialog(null, "Картица није пронађена. Молим, убаците картицу у читач.", "SmartBox", 0);
      return;
    } 
    if (this.n) {
      this.o.setText("Приступање порталу еПорези...");
    } else {
      this.o.setText("Приступање Тестном окружењу...");
    } 
    j();
    i();
    k();
    getContentPane().repaint();
    (new g(this, paramString)).start();
  }
  
  private String b(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      if (this.c != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        Certificate[] arrayOfCertificate;
        if ((arrayOfCertificate = this.c.c().getCertificateChain(paramString)).length > 0) {
          X509Certificate x509Certificate;
          String str = (x509Certificate = (X509Certificate)arrayOfCertificate[0]).getSubjectX500Principal().toString();
          try {
            LdapName ldapName;
            Iterator<Rdn> iterator = (ldapName = new LdapName(str)).getRdns().iterator();
            while (iterator.hasNext()) {
              Rdn rdn;
              if ((rdn = iterator.next()).getType().equals("CN")) {
                String str1 = rdn.getValue().toString();
                this.d = a.a(this.c.c(), paramString);
                if (str1 != null) {
                  String[] arrayOfString = str1.split(" ");
                  this.e = arrayOfString[0];
                  if (arrayOfString.length > 1)
                    this.f = arrayOfString[1]; 
                } 
              } 
            } 
          } catch (InvalidNameException invalidNameException) {
            a.b("Error " + invalidNameException);
          } 
          stringBuilder1.append(this.e).append(" ").append(this.f).append(" [").append(this.d).append("]");
          stringBuilder.append(stringBuilder1.toString());
        } 
      } else {
        stringBuilder.append("Нема података о кориснику");
      } 
    } catch (KeyStoreException keyStoreException) {
      a.b("Error " + keyStoreException);
    } 
    return stringBuilder.toString();
  }
  
  private boolean a(String paramString, KeyStore paramKeyStore) {
    Certificate[] arrayOfCertificate1;
    try {
      String str;
      if ((str = this.h) == null) {
        this.o.setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
        return false;
      } 
      a a1;
      (a1 = new a()).a(this.g);
      a1.b(this.i);
      if (this.i == null)
        a1.b(paramString + "/checkXML.jsp"); 
      a1.a(this.c);
      a1.d(this.e);
      a1.e(this.f);
      a1.c(this.d);
      boolean bool1 = a1.b(paramKeyStore);
      this.j = "";
      if (bool1) {
        this.j = a1.a();
        a.b("TEST SIG: " + this.j);
      } else {
        this.o.setText("<html>Невалидан сертификат. Обратите се вашем<br>сертификационом телу за помоћ.</html>");
        return false;
      } 
      if ((arrayOfCertificate1 = this.c.c().getCertificateChain(str)).length > 0) {
        X509Certificate x509Certificate;
        (x509Certificate = (X509Certificate)arrayOfCertificate1[0]).checkValidity();
        this.o.setText("<html>Валидан сертификат.</html>");
        this.g = str;
      } else {
        this.o.setText("<html>Невалидан сертификат. Обратите се вашем<br>сертификационом телу за помоћ.</html>");
        return false;
      } 
    } catch (KeyStoreException keyStoreException) {
      a.b("Error " + keyStoreException);
      this.o.setText("<html>Невалидан сертификат. Обратите се вашем<br>сертификационом телу за помоћ.</html>");
      return false;
    } catch (CertificateExpiredException certificateExpiredException) {
      a.b("Error " + certificateExpiredException);
      this.o.setText("<html>Вашем сертификату је истекао период важења. Обратите се вашем сертификационом телу ради обнављања.</html>");
      return false;
    } catch (CertificateNotYetValidException certificateNotYetValidException) {
      a.b("Error " + certificateNotYetValidException);
      this.o.setText("<html>Ваш сертификат још увек није валидиран. Обратите се вашем сертификационом телу за помоћ.</html>");
      return false;
    } catch (IOException iOException) {
      a.b("Error " + iOException);
      this.o.setText("Грешка у комуникацији са сервером.");
      return false;
    } 
    boolean bool = false;
    Certificate[] arrayOfCertificate2;
    int i = (arrayOfCertificate2 = arrayOfCertificate1).length;
    for (byte b = 0; b < i; b++) {
      Certificate certificate;
      boolean[] arrayOfBoolean = (certificate = certificate = arrayOfCertificate2[b]).getKeyUsage();
      bool = (bool || arrayOfBoolean[0] || arrayOfBoolean[1]) ? true : false;
    } 
    if (!bool)
      this.o.setText("<html>Сертификат није намењен за непорецивост информација,<br>те стога не може бити коришћен на овом порталу.</html>"); 
    return bool;
  }
  
  private KeyStore e() {
    KeyStore keyStore = null;
    try {
      keyStore = this.c.a();
    } catch (IOException iOException) {
      a.b("Error " + iOException);
      String str = "Блокирана картица.";
      if (iOException.getCause() != null && iOException.getCause().getCause() != null)
        if ("CKR_PIN_INCORRECT".equals(iOException.getCause().getCause().getLocalizedMessage())) {
          str = "Погрешан ПИН!";
        } else if ("CKR_PIN_LOCKED".equals(iOException.getCause().getCause().getLocalizedMessage())) {
          str = "Блокирана картица.";
        }  
      this.o.setText("<html>" + str + "</html>");
    } catch (NoSuchAlgorithmException|java.security.cert.CertificateException|KeyStoreException|java.security.NoSuchProviderException noSuchAlgorithmException) {
      a.b("Error " + noSuchAlgorithmException);
      this.o.setText("Дисфункционална картица.");
      return null;
    } 
    this.c.a(keyStore);
    return keyStore;
  }
  
  private void f() {
    switch (j.a[this.m.ordinal()]) {
      case 2:
        g();
        return;
      case 1:
      case 3:
        h();
        return;
    } 
    g();
    h();
  }
  
  private void g() {
    this.B.setEnabled(true);
    this.B.setBackground(new Color(210, 44, 52));
  }
  
  private void h() {
    this.C.setEnabled(true);
    this.C.setBackground(new Color(33, 48, 84));
  }
  
  private void i() {
    this.B.setEnabled(false);
    this.C.setEnabled(false);
    this.B.setBackground(new Color(214, 215, 216));
    this.C.setBackground(new Color(214, 215, 216));
  }
  
  private void j() {
    this.q.setEnabled(false);
  }
  
  private void k() {
    this.z.setIcon(new ImageIcon(getClass().getResource("/com/itsinbox/smartbox/resources/loading.gif")));
    pack();
  }
  
  private void l() {
    this.z.setIcon((Icon)null);
    pack();
  }
  
  public final void a(c paramc) {
    this.c = paramc;
    try {
      d d1;
      (d1 = this).k();
      d1.h = null;
      d1.o.setText("<html>Читач и картица препознати.<br><br><b>Учитавање сертификата са картице ...</b></html>");
      i i;
      (i = new i(d1)).start();
      i.join();
      d1.l();
      return;
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      return;
    } 
  }
  
  public final void a() {
    this.c = null;
    i();
    this.q.setVisible(false);
    b b;
    (b = (b)this.p.getModel()).a(new ArrayList());
    this.o.setText("Картица није пронађена. Молим, убаците картицу у читач.");
    pack();
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}


/* Location:              /com/itsinbox/smartbox/gui/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */