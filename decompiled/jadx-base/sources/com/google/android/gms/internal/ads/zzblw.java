package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzblw implements com.google.android.gms.ads.initialization.InitializationStatus {
    private final java.util.Map zza;

    public zzblw(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final java.util.Map<java.lang.String, com.google.android.gms.ads.initialization.AdapterStatus> getAdapterStatusMap() {
        return this.zza;
    }
}
