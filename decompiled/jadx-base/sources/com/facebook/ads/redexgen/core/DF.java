package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DF {
    public final int A00;
    public final java.lang.String A01;
    public final java.util.List<com.facebook.ads.redexgen.core.DE> A02;
    public final byte[] A03;

    public DF(int i, java.lang.String str, java.util.List<com.facebook.ads.redexgen.core.DE> list, byte[] bArr) {
        java.util.List<com.facebook.ads.redexgen.core.DE> listUnmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = java.util.Collections.emptyList();
        } else {
            listUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
