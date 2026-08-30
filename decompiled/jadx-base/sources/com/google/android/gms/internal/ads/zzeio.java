package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeio implements com.google.android.gms.ads.internal.zzg {
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.internal.ads.zzcvr zzb;
    private final com.google.android.gms.internal.ads.zzcwl zzc;
    private final com.google.android.gms.internal.ads.zzddu zzd;
    private final com.google.android.gms.internal.ads.zzddm zze;
    private final com.google.android.gms.internal.ads.zzcnh zzf;

    zzeio(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzddu zzdduVar, com.google.android.gms.internal.ads.zzddm zzddmVar, com.google.android.gms.internal.ads.zzcnh zzcnhVar) {
        this.zzb = zzcvrVar;
        this.zzc = zzcwlVar;
        this.zzd = zzdduVar;
        this.zze = zzddmVar;
        this.zzf = zzcnhVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(android.view.View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
