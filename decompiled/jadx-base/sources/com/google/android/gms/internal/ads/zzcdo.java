package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcdo extends javax.net.ssl.SSLSocketFactory {
    final javax.net.ssl.SSLSocketFactory zza = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdp zzb;

    zzcdo(com.google.android.gms.internal.ads.zzcdp zzcdpVar) {
        this.zzb = zzcdpVar;
    }

    private final java.net.Socket zza(java.net.Socket socket) throws java.net.SocketException {
        com.google.android.gms.internal.ads.zzcdp zzcdpVar = this.zzb;
        if (zzcdpVar.zzq > 0) {
            socket.setReceiveBufferSize(zzcdpVar.zzq);
        }
        this.zzb.zzr.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.zza.createSocket(str, i);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.zza.createSocket(str, i, inetAddress, i2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.zza.createSocket(inetAddress, i);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.zza.createSocket(inetAddress, i, inetAddress2, i2);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.zza.createSocket(socket, str, i, z);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }
}
