package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
class eo extends java.net.ProxySelector {
    private static final java.util.List<java.net.Proxy> bg = java.util.Collections.singletonList(java.net.Proxy.NO_PROXY);
    private final java.net.ProxySelector IL = java.net.ProxySelector.getDefault();
    private final java.lang.String bX;
    private final int eqN;

    private eo(java.lang.String str, int i) {
        this.bX = str;
        this.eqN = i;
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI uri) {
        if (uri != null) {
            return (this.bX.equalsIgnoreCase(uri.getHost()) && this.eqN == uri.getPort()) ? bg : this.IL.select(uri);
        }
        throw new java.lang.IllegalArgumentException("URI can't be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
        this.IL.connectFailed(uri, socketAddress, iOException);
    }

    static void bg(java.lang.String str, int i) {
        java.net.ProxySelector.setDefault(new com.bykv.vk.openvk.bg.bg.IL.IL.eo(str, i));
    }
}
