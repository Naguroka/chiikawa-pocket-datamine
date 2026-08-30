package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzet implements com.google.android.gms.ads.initialization.AdapterStatus {
    zzet(com.google.android.gms.ads.internal.client.zzex zzexVar) {
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final java.lang.String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState() {
        return com.google.android.gms.ads.initialization.AdapterStatus.State.READY;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}
