package com.itsinbox.smartbox.proxy;

public final class ProxyParams {
    private final ProxyType proxyType;
    private final String proxyHost;
    private final String proxyPort;

    public ProxyParams(ProxyType paramb) {
        this.proxyType = paramb;
        this.proxyHost = null;
        this.proxyPort = null;
    }

    public ProxyParams(ProxyType proxyType, String paramString1, String paramString2) {
        this.proxyType = proxyType;
        this.proxyHost = paramString1;
        this.proxyPort = paramString2;
    }

    public final ProxyType getProxyType() {
        return this.proxyType;
    }

    public final String getProxyHost() {
        return this.proxyHost;
    }

    public final String getProxyPort() {
        return this.proxyPort;
    }
}


/* Location:              /com/itsinbox/smartbox/d/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */