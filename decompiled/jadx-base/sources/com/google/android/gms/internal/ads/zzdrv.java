package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdrw zza;
    private final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();

    zzdrv(com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdrv zza(com.google.android.gms.internal.ads.zzdrv zzdrvVar) {
        zzdrvVar.zzb.putAll(zzdrvVar.zza.zzc);
        return zzdrvVar;
    }

    public final com.google.android.gms.internal.ads.zzdrv zzb(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdrv zzc(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        zzb("aai", zzfboVar.zzw);
        zzb("request_id", zzfboVar.zzan);
        zzb(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzfbo.zza(zzfboVar.zzb));
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdrv zzd(com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        zzb("gqi", zzfbrVar.zzb);
        return this;
    }

    public final java.lang.String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final void zzg() {
        this.zza.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdrs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zza.zzg(this.zzb);
    }

    final /* synthetic */ void zzk() {
        this.zza.zza.zzf(this.zzb);
    }
}
