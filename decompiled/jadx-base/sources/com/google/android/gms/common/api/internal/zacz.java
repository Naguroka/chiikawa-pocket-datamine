package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zacz {
    public static final com.google.android.gms.common.api.Status zaa = new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost");
    final java.util.Set zab = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private final com.google.android.gms.common.api.internal.zacy zac = new com.google.android.gms.common.api.internal.zacy(this);

    final void zaa(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.zab.add(basePendingResult);
        basePendingResult.zan(this.zac);
    }

    public final void zab() {
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zab.toArray(new com.google.android.gms.common.api.internal.BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.zab.remove(basePendingResult);
            }
        }
    }
}
