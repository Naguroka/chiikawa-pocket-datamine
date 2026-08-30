package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EA implements java.lang.Runnable {
    public final /* synthetic */ android.os.ConditionVariable A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.EL A01;

    public EA(com.facebook.ads.redexgen.core.EL el, android.os.ConditionVariable conditionVariable) {
        this.A01 = el;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
