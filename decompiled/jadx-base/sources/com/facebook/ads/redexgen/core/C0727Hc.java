package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0727Hc extends java.lang.Thread {
    public final /* synthetic */ android.os.ConditionVariable A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1117Wl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0727Hc(com.facebook.ads.redexgen.core.C1117Wl c1117Wl, java.lang.String str, android.os.ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1117Wl;
        this.A00 = conditionVariable;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001a */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } catch (java.lang.Throwable th) {
                    th = th;
                    while (true) {
                        throw th;
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
        }
    }
}
