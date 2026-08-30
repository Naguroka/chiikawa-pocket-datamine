package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1283bH implements com.facebook.ads.redexgen.core.C2Y {
    public final android.content.SharedPreferences A00;

    public C1283bH(android.content.SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.C2Y
    public final com.facebook.ads.redexgen.core.C1284bI A5o() {
        return new com.facebook.ads.redexgen.core.C1284bI(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.C2Y
    public final long A7i(java.lang.String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.C2Y
    public final java.lang.String A8T(java.lang.String str, java.lang.String str2) {
        return this.A00.getString(str, str2);
    }
}
