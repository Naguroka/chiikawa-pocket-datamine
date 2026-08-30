package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04153u {
    public static final com.facebook.ads.redexgen.core.InterfaceC04143t A01;
    public final java.lang.Object A00;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            A01 = new com.facebook.ads.redexgen.core.FV();
        } else if (android.os.Build.VERSION.SDK_INT >= 16) {
            A01 = new com.facebook.ads.redexgen.core.FW();
        } else {
            A01 = new com.facebook.ads.redexgen.core.C1265ax();
        }
    }

    public C04153u() {
        this.A00 = A01.AAw(this);
    }

    public C04153u(java.lang.Object obj) {
        this.A00 = obj;
    }

    public final com.facebook.ads.redexgen.core.C04133s A00(int i) {
        return null;
    }

    public final com.facebook.ads.redexgen.core.C04133s A01(int i) {
        return null;
    }

    public final java.lang.Object A02() {
        return this.A00;
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C04133s> A03(java.lang.String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, android.os.Bundle bundle) {
        return false;
    }
}
