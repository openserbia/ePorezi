package com.itsinbox.smartbox.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;

public class a extends JFrame {
  private String a;
  
  private JScrollPane b;
  
  private JButton c;
  
  private JTextArea d;
  
  public a() {
    a a1;
    (a1 = this).b = new JScrollPane();
    a1.d = new JTextArea();
    a1.c = new JButton();
    a1.setDefaultCloseOperation(3);
    a1.d.setEditable(false);
    a1.d.setColumns(20);
    a1.d.setLineWrap(true);
    a1.d.setRows(5);
    a1.d.setWrapStyleWord(true);
    a1.b.setViewportView(a1.d);
    a1.c.setBackground(new Color(210, 44, 52));
    a1.c.setFont(new Font("Tahoma", 0, 14));
    a1.c.setForeground(new Color(255, 255, 255));
    a1.c.setText("Копирај");
    a1.c.setBorder(null);
    a1.c.setBorderPainted(false);
    a1.c.setContentAreaFilled(false);
    a1.c.setMaximumSize(new Dimension(125, 30));
    a1.c.setMinimumSize(new Dimension(125, 30));
    a1.c.setPreferredSize(new Dimension(125, 30));
    a1.c.addActionListener(new b(a1));
    GroupLayout groupLayout = new GroupLayout(a1.getContentPane());
    a1.getContentPane().setLayout(groupLayout);
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(a1.b, -1, 480, 32767).addGroup(groupLayout.createSequentialGroup().addGap(0, 0, 32767).addComponent(a1.c, -2, 125, -2))).addContainerGap()));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(a1.b, -1, 337, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(a1.c, -1, -1, -2).addContainerGap()));
    a1.pack();
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/itsinbox/smartbox/resources/app.png")));
    setDefaultCloseOperation(1);
    a1 = this;
    String str = System.getProperty("user.home") + File.separator + "eporezi.log";
    try {
      a1.a = new String(Files.readAllBytes(Paths.get(str, new String[0])));
      if (a1.a != null)
        a1.d.setText(a1.a); 
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
    this.c.setOpaque(true);
  }
  
  public static void a() {
    EventQueue.invokeLater(new c());
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/gui/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */