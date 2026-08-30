package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HA {
    public java.util.Map<java.lang.String, java.lang.String> A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01 = new java.util.HashMap();

    public final synchronized java.util.Map<java.lang.String, java.lang.String> A00() {
        if (this.A00 == null) {
            this.A00 = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.A01));
        }
        return this.A00;
    }
}
