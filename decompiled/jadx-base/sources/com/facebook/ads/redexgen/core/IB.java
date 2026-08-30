package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IB extends java.io.BufferedOutputStream {
    public boolean A00;

    public IB(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    public IB(java.io.OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(java.io.OutputStream outputStream) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        this.A00 = true;
        java.lang.Throwable e = null;
        try {
            flush();
        } catch (java.lang.Throwable th) {
            e = th;
        }
        try {
            this.out.close();
        } catch (java.lang.Throwable thrown) {
            if (e == null) {
                e = thrown;
            }
        }
        if (e != null) {
            com.facebook.ads.redexgen.core.IK.A0Y(e);
            throw null;
        }
    }
}
