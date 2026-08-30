package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0823Lc extends java.lang.Thread implements java.io.Closeable {
    public boolean A00 = false;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0824Ld A01;

    public C0823Lc(com.facebook.ads.redexgen.core.C0824Ld c0824Ld) {
        this.A01 = c0824Ld;
        start();
    }

    public final synchronized void A00() {
        this.A01.A02.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.A00 = true;
            this.A01.A02.A02();
        }
        try {
            join();
        } catch (java.lang.InterruptedException unused) {
            throw new java.io.InterruptedIOException();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0052 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0085 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r5.A01.A03.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        monitor-enter(r5.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        r5.A01.A02.A03();
        r5.A01.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        throw r2;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    try {
                        this.A01.A02.A04();
                        synchronized (this.A01) {
                            try {
                                synchronized (this) {
                                    try {
                                        boolean z = this.A00;
                                        boolean zA05 = this.A01.A02.A05();
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                                try {
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    } catch (java.lang.Exception unused) {
                        synchronized (this.A01) {
                            try {
                                this.A01.A02.A03();
                                this.A01.A00 = null;
                                return;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    com.facebook.ads.redexgen.core.KQ.A00(th5, this);
                    return;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        }
        synchronized (this.A01) {
            try {
                this.A01.A02.A03();
                this.A01.A00 = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                while (true) {
                    throw th;
                }
            }
        }
    }
}
