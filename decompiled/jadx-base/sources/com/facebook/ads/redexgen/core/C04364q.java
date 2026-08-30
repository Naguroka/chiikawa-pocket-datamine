package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04364q extends com.facebook.ads.redexgen.core.DO implements java.lang.Comparable<com.facebook.ads.redexgen.core.C04364q> {
    public long A00;

    public C04364q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C04364q c04364q) {
        if (A04() != c04364q.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((com.facebook.ads.redexgen.core.C1177Yw) this).A00 - ((com.facebook.ads.redexgen.core.C1177Yw) c04364q).A00;
        if (j == 0) {
            long j2 = this.A00;
            long delta = c04364q.A00;
            j = j2 - delta;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
