package com.itsinbox.smartbox.proxy;

public enum ProxyType {
  a(0),
  b(1),
  c(2),
  d(3);
  
  private final int e;
  
  private static final ProxyType[] f;
  
  ProxyType(int paramInt1) {
    this.e = paramInt1;
  }
  
  public final int a() {
    return this.e;
  }
  
  public static ProxyType a(int paramInt) {
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