package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class IH {
    public static void A00() {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 18) {
            A01();
        }
    }

    public static void A01() {
        android.os.Trace.endSection();
    }

    public static void A02(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 18) {
            A03(str);
        }
    }

    public static void A03(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }
}
