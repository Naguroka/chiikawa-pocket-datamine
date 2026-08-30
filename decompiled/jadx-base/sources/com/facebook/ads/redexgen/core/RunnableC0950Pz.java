package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0950Pz implements java.lang.Runnable {
    public static java.lang.String[] A01 = {"2Fm0K3iCPRr4s", "EU0X6MVFAjFTSb3IQ96JVLxBODK0ji7f", "kCaGUq5JvggeMgMKx8S0y94YuIT5XcC8", "RnkBIHZpUwOry9GZ8kTuD", "sA1zdgzxdT", "CEtS1j3lrrmxulYDjXKY", "vw2xXVPQEGSMd83f0P3isbbUyKAy6xNq", "SkmV6xyVRRhMHUmgX0z0vsybBVz87hUy"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public RunnableC0950Pz(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0K) {
                this.A00.A0N();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            if (A01[1].charAt(30) != '7') {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "J2Oqtidk0iYMOENvLyv0dYeMHatuKemd";
        }
    }
}
