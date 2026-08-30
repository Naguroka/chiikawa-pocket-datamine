package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdtj implements com.google.android.gms.internal.ads.zzdsx {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzekv zzb;

    zzdtj(long j, android.content.Context context, com.google.android.gms.internal.ads.zzdtc zzdtcVar, com.google.android.gms.internal.ads.zzcgx zzcgxVar, java.lang.String str) {
        this.zza = j;
        com.google.android.gms.internal.ads.zzezt zzeztVarZzv = zzcgxVar.zzv();
        zzeztVarZzv.zzc(context);
        zzeztVarZzv.zza(new com.google.android.gms.ads.internal.client.zzs());
        zzeztVarZzv.zzb(str);
        com.google.android.gms.internal.ads.zzekv zzekvVarZza = zzeztVarZzv.zzd().zza();
        this.zzb = zzekvVarZza;
        zzekvVarZza.zzD(new com.google.android.gms.internal.ads.zzdti(this, zzdtcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        this.zzb.zzW(com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
    }
}
