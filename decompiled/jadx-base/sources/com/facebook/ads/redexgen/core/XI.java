package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XI implements com.facebook.ads.redexgen.core.InterfaceC0694Ft {
    public final com.facebook.ads.redexgen.core.GG A00;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> A01;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GH> A02;
    public final long[] A03;

    public XI(com.facebook.ads.redexgen.core.GG gg, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GH> map2) {
        java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> mapEmptyMap;
        this.A00 = gg;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = java.util.Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = java.util.Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = gg.A0F();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A6x(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final long A7O(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7P() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7r(long j) {
        int iA0A = com.facebook.ads.redexgen.core.IK.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
