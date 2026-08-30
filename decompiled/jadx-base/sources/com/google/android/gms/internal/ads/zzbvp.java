package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbvp implements java.util.concurrent.Callable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvr zzb;

    zzbvp(com.google.android.gms.internal.ads.zzbvr zzbvrVar, android.content.Context context) {
        this.zza = context;
        this.zzb = zzbvrVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzbvo zzbvoVarZza;
        com.google.android.gms.internal.ads.zzbvq zzbvqVar = (com.google.android.gms.internal.ads.zzbvq) this.zzb.zza.get(this.zza);
        if (zzbvqVar != null) {
            if (zzbvqVar.zza + ((java.lang.Long) com.google.android.gms.internal.ads.zzbea.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()) {
                zzbvoVarZza = new com.google.android.gms.internal.ads.zzbvn(this.zza).zza();
            } else {
                zzbvoVarZza = new com.google.android.gms.internal.ads.zzbvn(this.zza, zzbvqVar.zzb).zza();
            }
        } else {
            zzbvoVarZza = new com.google.android.gms.internal.ads.zzbvn(this.zza).zza();
        }
        com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zzb;
        zzbvrVar.zza.put(this.zza, new com.google.android.gms.internal.ads.zzbvq(zzbvrVar, zzbvoVarZza));
        return zzbvoVarZza;
    }
}
