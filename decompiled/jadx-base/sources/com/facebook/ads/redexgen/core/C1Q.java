package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1Q implements java.io.Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public long A00;
    public final java.util.List<java.lang.String> A01;

    public C1Q(java.util.List<java.lang.String> screenshots, long j) {
        this.A01 = screenshots;
        this.A00 = j;
    }

    public final long A00() {
        return this.A00;
    }

    public final java.util.List<java.lang.String> A01() {
        return java.util.Collections.unmodifiableList(this.A01);
    }
}
