package com.itsinbox.smartbox.c;

import com.itsinbox.smartbox.a.a;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public final class b extends AbstractTableModel {
  private List a;
  
  private String[] b;
  
  public b(List paramList) {
    this.a = paramList;
    this.b = new String[] { "Алиас", "Издат за", "Издат од", "Важи до" };
  }
  
  public final int getRowCount() {
    return this.a.size();
  }
  
  public final int getColumnCount() {
    return this.b.length;
  }
  
  public final Object getValueAt(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
        return ((a)this.a.get(paramInt1)).a();
      case 1:
        return ((a)this.a.get(paramInt1)).b();
      case 2:
        return ((a)this.a.get(paramInt1)).c();
      case 3:
        return ((a)this.a.get(paramInt1)).d();
    } 
    return "n/a";
  }
  
  public final String getColumnName(int paramInt) {
    return this.b[paramInt];
  }
  
  public final void a(List paramList) {
    this.a = paramList;
    fireTableDataChanged();
  }
}


/* Location:              /home/oleg/pet_projects/ePorezi/ePorezi/test.jar!/com/itsinbox/smartbox/c/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */