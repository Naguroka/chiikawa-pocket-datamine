package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeit implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfca zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbo zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeiz zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeiu zze;

    zzeit(com.google.android.gms.internal.ads.zzeiu zzeiuVar, com.google.android.gms.internal.ads.zzcab zzcabVar, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzeiz zzeizVar) {
        this.zza = zzcabVar;
        this.zzb = zzfcaVar;
        this.zzc = zzfboVar;
        this.zzd = zzeizVar;
        this.zze = zzeiuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(android.view.View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
