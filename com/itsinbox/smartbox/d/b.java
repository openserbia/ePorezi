package com.itsinbox.smartbox.d;

public enum b {
  a(0),
  b(1),
  c(2),
  d(3);
  
  private final int e;
  
  private static final b[] f;
  
  b(int paramInt1) {
    this.e = paramInt1;
  }
  
  public final int a() {
    return this.e;
  }
  
  public static b a(int paramInt) {
    return f[paramInt];
  }
  
  static {
    f = values();
  }
}


/* Location:              /com/itsinbox/smartbox/d/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */