package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzejc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzder zza;

    zzejc(com.google.android.gms.internal.ads.zzejd zzejdVar, com.google.android.gms.internal.ads.zzder zzderVar) {
        this.zza = zzderVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(android.view.View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
