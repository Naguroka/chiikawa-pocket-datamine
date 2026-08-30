package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05278q {
    public static com.facebook.ads.redexgen.core.C05278q A00 = new com.facebook.ads.redexgen.core.C05278q();

    public static com.facebook.ads.redexgen.core.C05278q A00() {
        return A00;
    }

    public final com.facebook.ads.redexgen.core.ZN A01(com.facebook.ads.redexgen.core.C7j c7j, boolean z) {
        return new com.facebook.ads.redexgen.core.ZN(c7j, z, new com.facebook.ads.redexgen.core.C6V());
    }

    public final java.util.Map<java.lang.String, java.lang.String> A02(com.facebook.ads.redexgen.core.C7j c7j) {
        try {
            return A01(c7j, false).A05();
        } catch (java.lang.Throwable th) {
            c7j.A07().A3y(th);
            return com.facebook.ads.redexgen.core.C05198i.A01(c7j);
        }
    }
}
