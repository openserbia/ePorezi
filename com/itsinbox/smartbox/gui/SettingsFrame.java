package com.itsinbox.smartbox.gui;

import com.itsinbox.smartbox.SmartBox;
import com.itsinbox.smartbox.d.a;
import com.itsinbox.smartbox.d.b;
import com.itsinbox.smartbox.d.c;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SettingsFrame extends JFrame {
  private b a = this.b.a();
  
  private a b = SmartBox.a();
  
  private JRadioButton c;
  
  private JLabel d;
  
  private JLabel e;
  
  private JLabel f;
  
  private JRadioButton g;
  
  private ButtonGroup h;
  
  private JTextField i;
  
  private JPanel j;
  
  private JTextField k;
  
  private JButton l;
  
  private JRadioButton m;
  
  private JRadioButton n;
  
  public SettingsFrame() {
    SettingsFrame settingsFrame;
    (settingsFrame = this).h = new ButtonGroup();
    settingsFrame.j = new JPanel();
    settingsFrame.d = new JLabel();
    settingsFrame.e = new JLabel();
    settingsFrame.i = new JTextField();
    settingsFrame.k = new JTextField();
    settingsFrame.f = new JLabel();
    settingsFrame.g = new JRadioButton();
    settingsFrame.n = new JRadioButton();
    settingsFrame.c = new JRadioButton();
    settingsFrame.m = new JRadioButton();
    settingsFrame.l = new JButton();
    settingsFrame.setDefaultCloseOperation(3);
    settingsFrame.setResizable(false);
    settingsFrame.d.setText("Адреса proxy сервера");
    settingsFrame.e.setText("Порт proxy сервера");
    GroupLayout groupLayout = new GroupLayout(settingsFrame.j);
    settingsFrame.j.setLayout(groupLayout);
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingsFrame.i).addComponent(settingsFrame.k).addComponent(settingsFrame.d, -1, -1, 32767).addComponent(settingsFrame.e, -1, -1, 32767));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(settingsFrame.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(settingsFrame.i, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(settingsFrame.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(settingsFrame.k, -2, -1, -2).addContainerGap(-1, 32767)));
    settingsFrame.d.getAccessibleContext().setAccessibleName("");
    settingsFrame.f.setFont(new Font("Tahoma", 1, 12));
    settingsFrame.f.setText("Подешавања proxy сервера");
    settingsFrame.h.add(settingsFrame.g);
    settingsFrame.g.setSelected(true);
    settingsFrame.g.setText("Не користи proxy сервер");
    settingsFrame.g.addActionListener(new s(settingsFrame));
    settingsFrame.h.add(settingsFrame.n);
    settingsFrame.n.setText("Користи системски proxy сервер");
    settingsFrame.n.addActionListener(new t(settingsFrame));
    settingsFrame.h.add(settingsFrame.c);
    settingsFrame.c.setText("Користи HTTP/HTTPS proxy сервер");
    settingsFrame.c.addActionListener(new u(settingsFrame));
    settingsFrame.h.add(settingsFrame.m);
    settingsFrame.m.setText("Користи SOCSK proxy сервер");
    settingsFrame.m.addActionListener(new v(settingsFrame));
    settingsFrame.l.setText("Примени");
    settingsFrame.l.addActionListener(new w(settingsFrame));
    groupLayout = new GroupLayout(settingsFrame.getContentPane());
    settingsFrame.getContentPane().setLayout(groupLayout);
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingsFrame.j, -1, -1, 32767).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingsFrame.m).addComponent(settingsFrame.c).addComponent(settingsFrame.n).addComponent(settingsFrame.g).addComponent(settingsFrame.f)).addGap(0, 102, 32767))).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(settingsFrame.l).addGap(121, 121, 121)));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(settingsFrame.f).addGap(13, 13, 13).addComponent(settingsFrame.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(settingsFrame.n).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(settingsFrame.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(settingsFrame.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, 32767).addComponent(settingsFrame.j, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(settingsFrame.l).addContainerGap()));
    settingsFrame.l.getAccessibleContext().setAccessibleName("Сачувај");
    settingsFrame.pack();
    setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/itsinbox/smartbox/resources/app.png")));
    setDefaultCloseOperation(1);
    setTitle("еПорези 1.3.1 - Подешавања");
    pack();
    if ((settingsFrame = this).b != null && settingsFrame.b.a() != null) {
      switch (z.a[settingsFrame.b.a().ordinal()]) {
        case 1:
          settingsFrame.g.setSelected(true);
          settingsFrame.j.setVisible(false);
          break;
        case 2:
          settingsFrame.n.setSelected(true);
          settingsFrame.j.setVisible(false);
          break;
        case 3:
          settingsFrame.c.setSelected(true);
          settingsFrame.j.setVisible(true);
          if (settingsFrame.b.b() != null)
            settingsFrame.i.setText(settingsFrame.b.b()); 
          if (settingsFrame.b.c() != null)
            settingsFrame.k.setText(settingsFrame.b.c()); 
          break;
        case 4:
          settingsFrame.m.setSelected(true);
          settingsFrame.j.setVisible(true);
          if (settingsFrame.b.b() != null)
            settingsFrame.i.setText(settingsFrame.b.b()); 
          if (settingsFrame.b.c() != null)
            settingsFrame.k.setText(settingsFrame.b.c()); 
          break;
      } 
      settingsFrame.pack();
    } 
  }
  
  public static void main(String[] paramArrayOfString) {
    try {
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
      int i = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length;
      for (byte b1 = 0; b1 < i; b1++) {
        UIManager.LookAndFeelInfo lookAndFeelInfo = arrayOfLookAndFeelInfo[b1];
        if ("Nimbus".equals(lookAndFeelInfo.getName())) {
          UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
          break;
        } 
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      Logger.getLogger(SettingsFrame.class.getName()).log(Level.SEVERE, (String)null, classNotFoundException);
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(SettingsFrame.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(SettingsFrame.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
      Logger.getLogger(SettingsFrame.class.getName()).log(Level.SEVERE, (String)null, unsupportedLookAndFeelException);
    } 
    EventQueue.invokeLater(new x());
  }
  
  public static void a() {
    EventQueue.invokeLater(new y());
  }
}


/* Location:              /com/itsinbox/smartbox/gui/SettingsFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */