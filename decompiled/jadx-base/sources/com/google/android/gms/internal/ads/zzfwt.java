package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwt extends com.google.android.gms.internal.ads.zzfwh {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfww zza;
    private final java.lang.Object zzb;
    private int zzc;

    zzfwt(com.google.android.gms.internal.ads.zzfww zzfwwVar, int i) {
        this.zza = zzfwwVar;
        this.zzb = com.google.android.gms.internal.ads.zzfww.zzg(zzfwwVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !com.google.android.gms.internal.ads.zzfuk.zza(this.zzb, com.google.android.gms.internal.ads.zzfww.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object getValue() {
        java.util.Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzfww.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.util.Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zza;
        java.lang.Object objZzj = com.google.android.gms.internal.ads.zzfww.zzj(zzfwwVar, i);
        com.google.android.gms.internal.ads.zzfww.zzn(zzfwwVar, this.zzc, obj);
        return objZzj;
    }
}
