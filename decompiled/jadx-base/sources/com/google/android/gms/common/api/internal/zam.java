package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    zam(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i;
    }

    final int zaa() {
        return this.zaa;
    }

    final com.google.android.gms.common.ConnectionResult zab() {
        return this.zab;
    }
}
