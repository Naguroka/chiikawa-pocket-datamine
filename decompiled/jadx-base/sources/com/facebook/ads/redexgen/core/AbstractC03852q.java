package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03852q {
    public static void A00() {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.endSection();
        }
    }

    public static void A01(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.beginSection(str);
        }
    }
}
