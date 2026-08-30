package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1420dg implements java.lang.Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1419df A01;
    public final /* synthetic */ java.lang.Exception A02;

    public RunnableC1420dg(com.facebook.ads.redexgen.core.C1419df c1419df, int i, java.lang.Exception exc) {
        this.A01 = c1419df;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    this.A01.A04(this.A01.A05.AAy());
                    this.A01.A04.postDelayed(this.A01.A0A, this.A00);
                }
            } catch (java.lang.Exception e) {
                java.lang.StackTraceElement[] innerTrace = e.getStackTrace();
                java.lang.StackTraceElement[] result = this.A02.getStackTrace();
                java.lang.StackTraceElement[] callerTrace = (java.lang.StackTraceElement[]) java.util.Arrays.copyOf(innerTrace, innerTrace.length + result.length);
                java.lang.System.arraycopy(result, 0, callerTrace, innerTrace.length, result.length);
                e.setStackTrace(callerTrace);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
