package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb extends com.google.android.gms.ads.internal.client.zzbh {
    private final com.google.android.gms.ads.internal.client.zza zza;

    public zzb(com.google.android.gms.ads.internal.client.zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
