package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1284bI implements com.facebook.ads.redexgen.core.C2X {
    public final android.content.SharedPreferences.Editor A00;

    public C1284bI(android.content.SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final com.facebook.ads.redexgen.core.C1284bI A00(java.lang.String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1284bI A01(java.lang.String str, java.lang.String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
