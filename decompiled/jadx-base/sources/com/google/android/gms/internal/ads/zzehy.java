package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzehy extends com.google.android.gms.internal.ads.zzbwg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcxz zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcvr zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcxa zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdeb zzd;

    zzehy(com.google.android.gms.internal.ads.zzehz zzehzVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzdeb zzdebVar) {
        this.zza = zzcxzVar;
        this.zzb = zzcvrVar;
        this.zzc = zzcxaVar;
        this.zzd = zzdebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwi zzbwiVar) {
        this.zzd.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
