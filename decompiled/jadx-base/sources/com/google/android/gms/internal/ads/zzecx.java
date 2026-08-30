package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecx implements com.google.android.gms.internal.ads.zzecw {
    public final com.google.android.gms.internal.ads.zzecw zza;
    private final com.google.android.gms.internal.ads.zzfuc zzb;

    public zzecx(com.google.android.gms.internal.ads.zzecw zzecwVar, com.google.android.gms.internal.ads.zzfuc zzfucVar) {
        this.zza = zzecwVar;
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return com.google.android.gms.internal.ads.zzgch.zzm(this.zza.zza(zzfcaVar, zzfboVar), this.zzb, com.google.android.gms.internal.ads.zzbzw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return this.zza.zzb(zzfcaVar, zzfboVar);
    }
}
