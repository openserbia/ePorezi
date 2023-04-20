package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.a;
import com.itsinbox.smartbox.a.a;
import com.itsinbox.smartbox.b.c;
import com.itsinbox.smartbox.b.e;
import com.itsinbox.smartbox.c.b;
import com.itsinbox.smartbox.c.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public final class A extends JFrame implements e {
  private JTable a;
  
  private JButton b;
  
  private JScrollPane c;
  
  private JLabel d;
  
  private JLabel e;
  
  private JLabel f;
  
  private JButton g;
  
  private JButton h;
  
  private JPanel i;
  
  private JPanel j;
  
  private JPanel k;
  
  private JPanel l;
  
  private JPanel m;
  
  private JButton n;
  
  private c o = null;
  
  private CardTerminal p = null;
  
  private String q;
  
  private String r = null;
  
  private final String s;
  
  private final String t;
  
  private final String u;
  
  private final String v;
  
  private final String w;
  
  private final String x;
  
  private final String y;
  
  private final String z;
  
  private final a A;
  
  private final String B;
  
  public A(a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9) {
    this.A = parama;
    this.B = paramString1;
    this.u = paramString2;
    this.s = paramString3;
    this.t = paramString4;
    this.v = paramString5;
    this.w = paramString6;
    this.x = paramString7;
    this.y = paramString8;
    this.z = paramString9;
    A a1;
    (a1 = this).m = new JPanel();
    a1.k = new JPanel();
    a1.b = new JButton();
    a1.g = new JButton();
    a1.i = new JPanel();
    a1.c = new JScrollPane();
    a1.a = new JTable();
    a1.e = new JLabel();
    a1.j = new JPanel();
    a1.n = new JButton();
    a1.h = new JButton();
    a1.d = new JLabel();
    a1.l = new JPanel();
    a1.f = new JLabel();
    a1.setPreferredSize(new Dimension(959, 510));
    a1.setResizable(false);
    a1.setSize(new Dimension(0, 0));
    a1.b.setIcon(new ImageIcon(a1.getClass().getResource("/com/itsinbox/smartbox/resources/headerTest.png")));
    a1.b.setBorder((Border)null);
    a1.b.setBorderPainted(false);
    a1.b.setContentAreaFilled(false);
    a1.b.setFocusPainted(false);
    a1.b.setFocusable(false);
    a1.b.addActionListener(new B(a1));
    a1.g.setIcon(new ImageIcon(a1.getClass().getResource("/com/itsinbox/smartbox/resources/log_36.png")));
    a1.g.setBorder((Border)null);
    a1.g.setBorderPainted(false);
    a1.g.setContentAreaFilled(false);
    a1.g.setFocusPainted(false);
    a1.g.addActionListener(new C(a1));
    GroupLayout groupLayout1 = new GroupLayout(a1.k);
    a1.k.setLayout(groupLayout1);
    groupLayout1.setHorizontalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addContainerGap(-1, 32767).addComponent(a1.g).addContainerGap()).addGroup(groupLayout1.createSequentialGroup().addComponent(a1.b).addGap(0, 0, 32767)));
    groupLayout1.setVerticalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addGap(0, 0, 0).addComponent(a1.b).addGap(18, 18, 18).addComponent(a1.g).addContainerGap(-1, 32767)));
    a1.c.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    a1.c.setViewportBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    a1.a.setFont(new Font("Arial", 0, 12));
    a1.a.setModel(new D(a1, new Object[][] { { null, null, null, null }, , { null, null, null, null }, , { null, null, null, null }, , { null, null, null, null },  }, (Object[])new String[] { "Алиас", "Издат за", "Издат од", "Важи до" }));
    a1.a.getTableHeader().setReorderingAllowed(false);
    a1.c.setViewportView(a1.a);
    GroupLayout groupLayout2 = new GroupLayout(a1.i);
    a1.i.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(a1.c, -1, 926, 32767));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(a1.c, -2, 94, -2).addContainerGap(-1, 32767)));
    a1.e.setFont(new Font("Arial", 1, 16));
    a1.e.setHorizontalAlignment(0);
    a1.e.setText("Да ли сте сигурни да желите да потпишете и поднесете пријаву?\t");
    a1.n.setBackground(new Color(210, 44, 52));
    a1.n.setFont(new Font("Tahoma", 0, 18));
    a1.n.setForeground(new Color(255, 255, 255));
    a1.n.setText("ДА");
    a1.n.setBorder((Border)null);
    a1.n.setBorderPainted(false);
    a1.n.setContentAreaFilled(false);
    a1.n.setFocusPainted(false);
    a1.n.setMaximumSize(new Dimension(200, 50));
    a1.n.setMinimumSize(new Dimension(200, 50));
    a1.n.setOpaque(true);
    a1.n.setPreferredSize(new Dimension(200, 50));
    a1.n.addActionListener(new E(a1));
    a1.h.setBackground(new Color(210, 44, 52));
    a1.h.setFont(new Font("Tahoma", 0, 18));
    a1.h.setForeground(new Color(255, 255, 255));
    a1.h.setText("НЕ");
    a1.h.setBorder((Border)null);
    a1.h.setBorderPainted(false);
    a1.h.setContentAreaFilled(false);
    a1.h.setFocusPainted(false);
    a1.h.setMaximumSize(new Dimension(200, 50));
    a1.h.setMinimumSize(new Dimension(200, 50));
    a1.h.setOpaque(true);
    a1.h.setPreferredSize(new Dimension(200, 50));
    a1.h.addActionListener(new F(a1));
    groupLayout2 = new GroupLayout(a1.j);
    a1.j.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(335, 335, 335).addComponent(a1.n, -2, 120, -2).addGap(18, 18, 18).addComponent(a1.h, -2, 120, -2).addContainerGap(-1, 32767)));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(a1.n, -2, -1, -2).addComponent(a1.h, -2, -1, -2)).addContainerGap(-1, 32767)));
    a1.d.setFont(new Font("Arial", 0, 13));
    a1.d.setHorizontalAlignment(0);
    a1.d.setText("Молимо за стрпљење током потписивања пријаве.");
    a1.f.setAutoscrolls(true);
    groupLayout2 = new GroupLayout(a1.l);
    a1.l.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap(25, 32767).addComponent(a1.f, -2, 82, -2).addContainerGap(26, 32767)));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(a1.f, -1, 20, 32767).addContainerGap()));
    groupLayout2 = new GroupLayout(a1.m);
    a1.m.setLayout(groupLayout2);
    groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(a1.k, -2, 926, -2).addComponent(a1.i, -2, -1, -2).addGroup(groupLayout2.createSequentialGroup().addGap(420, 420, 420).addComponent(a1.l, -2, -1, -2)).addComponent(a1.e, -2, 927, -2).addComponent(a1.j, -1, -1, 32767).addComponent(a1.d, -2, 927, -2));
    groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(a1.k, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(a1.i, -2, 94, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(a1.l, -2, -1, -2).addGap(6, 6, 6).addComponent(a1.e).addGap(6, 6, 6).addComponent(a1.j, -2, -1, -2).addGap(18, 18, 18).addComponent(a1.d).addContainerGap(-1, 32767)));
    groupLayout1 = new GroupLayout(a1.getContentPane());
    a1.getContentPane().setLayout(groupLayout1);
    groupLayout1.setHorizontalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addGap(9, 9, 9).addComponent(a1.m, -2, 923, -2)));
    groupLayout1.setVerticalGroup(groupLayout1.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout1.createSequentialGroup().addGap(10, 10, 10).addComponent(a1.m, -2, -1, -2).addContainerGap(-1, 32767)));
    (a1 = this).setTitle("еПорези 1.3.1");
    a1.setIconImage(Toolkit.getDefaultToolkit().getImage(a1.getClass().getResource("/com/itsinbox/smartbox/resources/app.png")));
    if (a1.A == a.a) {
      a1.b.setIcon(new ImageIcon(a1.getClass().getResource("/com/itsinbox/smartbox/resources/header.png")));
    } else {
      a1.b.setIcon(new ImageIcon(a1.getClass().getResource("/com/itsinbox/smartbox/resources/headerTest.png")));
    } 
    A a2 = a1;
    b b = new b(new ArrayList());
    a2.a.setModel((TableModel)b);
    a2.a.getTableHeader().setFont(new Font("Arial", 1, 13));
    a2.a.setShowGrid(false);
    a2.a.setRowMargin(0);
    a2.a.setShowVerticalLines(false);
    a2.a.setShowHorizontalLines(false);
    boolean bool = false;
    JTable jTable;
    TableColumn tableColumn;
    (tableColumn = (jTable = a2.a).getColumnModel().getColumn(0)).setMinWidth(0);
    tableColumn.setMaxWidth(0);
    tableColumn.setResizable(false);
    a2.i.setVisible(false);
    ListSelectionModel listSelectionModel;
    (listSelectionModel = a2.a.getSelectionModel()).setSelectionMode(0);
    listSelectionModel.addListSelectionListener(paramListSelectionEvent -> {
          if (!paramListSelectionEvent.getValueIsAdjusting() && this.a.getSelectedRow() >= 0) {
            int[] arrayOfInt = this.a.getSelectedRows();
            String str = (String)this.a.getValueAt(arrayOfInt[0], 0);
            this.e.setText("<html>Изабран је сертификат: <b>" + (String)this.a.getValueAt(arrayOfInt[0], 1) + ", " + (String)this.a.getValueAt(arrayOfInt[0], 2) + "</b><br>Да ли сте сигурни да желите да потпишете и поднесете пријаву?" + "</html>");
            this.r = str;
            g();
            k();
          } 
        });
    a1.j();
    a1.setLocationRelativeTo((Component)null);
  }
  
  public final void b() {
    setDefaultCloseOperation(3);
    this.d.setText("");
    c();
    d();
  }
  
  private void c() {
    try {
      TerminalFactory terminalFactory;
      List<CardTerminal> list = (terminalFactory = TerminalFactory.getDefault()).terminals().list();
      this.p = list.get(0);
      this.d.setText("Картица није пронађена. Молим, убаците картицу у читач.");
      h();
      return;
    } catch (Exception exception) {
      a.b("No reader! \n" + exception.toString());
      this.d.setText("Читач картица није пронађен.");
      h();
      return;
    } 
  }
  
  private void d() {
    if (this.p != null) {
      c c1;
      (c1 = new c(this.p)).a(this);
      return;
    } 
    e();
  }
  
  private void e() {
    Timer timer = new Timer();
    H h = new H(this, timer);
    timer.schedule(h, 1000L, 1000L);
  }
  
  private KeyStore f() {
    KeyStore keyStore = null;
    try {
      keyStore = this.o.a();
    } catch (IOException iOException) {
      a.b("Error " + iOException);
      String str = "Блокирана картица.";
      if (iOException.getCause() != null && iOException.getCause().getCause() != null)
        if ("CKR_PIN_INCORRECT".equals(iOException.getCause().getCause().getLocalizedMessage())) {
          str = "Погрешан ПИН!";
        } else if ("CKR_PIN_LOCKED".equals(iOException.getCause().getCause().getLocalizedMessage())) {
          str = "Блокирана картица.";
        }  
      this.d.setText("<html>" + str + "</html>");
    } catch (NoSuchAlgorithmException|java.security.cert.CertificateException|java.security.KeyStoreException|java.security.NoSuchProviderException noSuchAlgorithmException) {
      a.b("Error " + noSuchAlgorithmException);
      this.d.setText("Дисфункционална картица.");
      return null;
    } 
    if (keyStore == null) {
      this.d.setText("<html>Грешка у одабиру<br>сертификационог тела<br>или његовом софтверу.</html>");
      return null;
    } 
    this.q = a.b(keyStore);
    if (this.q == null) {
      this.d.setText("Дошло је до грешке приликом читања сертификата. Молим, покушајте поново.");
      return null;
    } 
    this.o.a(keyStore);
    return keyStore;
  }
  
  private void g() {
    this.n.setEnabled(true);
    this.n.setBackground(new Color(210, 44, 52));
  }
  
  private void h() {
    this.n.setEnabled(false);
    this.n.setBackground(new Color(214, 215, 216));
  }
  
  private void i() {
    this.f.setIcon(new ImageIcon(getClass().getResource("/com/itsinbox/smartbox/resources/loading.gif")));
    this.l.setVisible(true);
    pack();
  }
  
  private void j() {
    this.j.setVisible(false);
    pack();
  }
  
  private void k() {
    this.j.setVisible(true);
    pack();
  }
  
  public final void a(c paramc) {
    this.o = paramc;
    try {
      i();
      A a1;
      (a1 = this).i();
      a1.r = null;
      a1.e.setText("Учитавање сертификата са картице ...");
      a1.d.setText("Молимо за стрпљење током потписивања пријаве.");
      I i;
      (i = new I(a1)).start();
      i.join();
      (a1 = a1).f.setIcon((Icon)null);
      a1.l.setVisible(false);
      a1.pack();
      return;
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      return;
    } 
  }
  
  public final void a() {
    this.o = null;
    this.d.setText("");
    this.e.setText("Картица није пронађена. Молим, убаците картицу у читач.");
    j();
    this.i.setVisible(false);
    b b;
    (b = (b)this.a.getModel()).a(new ArrayList());
    pack();
  }
}


/* Location:              /com/itsinbox/smartbox/gui/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */