package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfs extends com.google.android.gms.ads.internal.client.zzdq {
    private final com.google.android.gms.ads.OnPaidEventListener zza;

    public zzfs(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(com.google.android.gms.ads.internal.client.zzu zzuVar) {
        com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(com.google.android.gms.ads.AdValue.zza(zzuVar.zzb, zzuVar.zzc, zzuVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
        return this.zza == null;
    }
}
