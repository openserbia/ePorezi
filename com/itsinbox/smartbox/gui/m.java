package com.itsinbox.smartbox.gui;

import javax.swing.table.DefaultTableModel;

final class m extends DefaultTableModel {
  private boolean[] a = new boolean[] { false, false, false, false };
  
  m(d paramd, Object[][] paramArrayOfObject, Object[] paramArrayOfObject1) {
    super(paramArrayOfObject, paramArrayOfObject1);
  }
  
  public final boolean isCellEditable(int paramInt1, int paramInt2) {
    return this.a[paramInt2];
  }
}


/* Location:              /com/itsinbox/smartbox/gui/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */