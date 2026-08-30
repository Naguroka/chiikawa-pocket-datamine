package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GV implements java.lang.Comparable<com.facebook.ads.redexgen.core.GV> {
    public final int A00;
    public final com.facebook.ads.redexgen.core.GR A01;

    public GV(int i, com.facebook.ads.redexgen.core.GR gr) {
        this.A00 = i;
        this.A01 = gr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.GV gv) {
        return this.A00 - gv.A00;
    }
}
