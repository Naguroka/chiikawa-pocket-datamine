package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzblv implements com.google.android.gms.ads.initialization.AdapterStatus {
    private final com.google.android.gms.ads.initialization.AdapterStatus.State zza;
    private final java.lang.String zzb;
    private final int zzc;

    public zzblv(com.google.android.gms.ads.initialization.AdapterStatus.State state, java.lang.String str, int i) {
        this.zza = state;
        this.zzb = str;
        this.zzc = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final java.lang.String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzc;
    }
}
