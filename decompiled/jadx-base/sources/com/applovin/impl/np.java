package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class np extends com.applovin.impl.a2 {
    private final int e;
    private final byte[] f;
    private final java.net.DatagramPacket g;
    private android.net.Uri h;
    private java.net.DatagramSocket i;
    private java.net.MulticastSocket j;
    private java.net.InetAddress k;
    private java.net.InetSocketAddress l;
    private boolean m;
    private int n;

    public static final class a extends com.applovin.impl.i5 {
        public a(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public np() {
        this(2000);
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.np.a {
        android.net.Uri uri = k5Var.f947a;
        this.h = uri;
        java.lang.String host = uri.getHost();
        int port = this.h.getPort();
        b(k5Var);
        try {
            this.k = java.net.InetAddress.getByName(host);
            this.l = new java.net.InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new java.net.DatagramSocket(this.l);
            }
            this.i.setSoTimeout(this.e);
            this.m = true;
            c(k5Var);
            return -1L;
        } catch (java.io.IOException e) {
            throw new com.applovin.impl.np.a(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new com.applovin.impl.np.a(e2, 2006);
        }
    }

    public np(int i) {
        this(i, 8000);
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.h;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.h = null;
        java.net.MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.k);
            } catch (java.io.IOException unused) {
            }
            this.j = null;
        }
        java.net.DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            g();
        }
    }

    public np(int i, int i2) {
        super(true);
        this.e = i2;
        byte[] bArr = new byte[i];
        this.f = bArr;
        this.g = new java.net.DatagramPacket(bArr, 0, i);
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.np.a {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length = this.g.getLength();
                this.n = length;
                d(length);
            } catch (java.net.SocketTimeoutException e) {
                throw new com.applovin.impl.np.a(e, 2002);
            } catch (java.io.IOException e2) {
                throw new com.applovin.impl.np.a(e2, 2001);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.n;
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.f, length2 - i3, bArr, i, iMin);
        this.n -= iMin;
        return iMin;
    }
}
