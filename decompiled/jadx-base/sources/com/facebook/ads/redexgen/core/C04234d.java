package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04234d extends android.database.Observable<com.facebook.ads.redexgen.core.AbstractC04244e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((com.facebook.ads.redexgen.core.AbstractC04244e) this.mObservers.get(size)).A00();
        }
    }
}
