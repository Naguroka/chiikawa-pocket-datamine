package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejq extends com.google.android.gms.ads.internal.client.zzbt {
    final com.google.android.gms.internal.ads.zzfch zza;
    final com.google.android.gms.internal.ads.zzdio zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcgx zzd;
    private com.google.android.gms.ads.internal.client.zzbl zze;

    public zzejq(com.google.android.gms.internal.ads.zzcgx zzcgxVar, android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfch zzfchVar = new com.google.android.gms.internal.ads.zzfch();
        this.zza = zzfchVar;
        this.zzb = new com.google.android.gms.internal.ads.zzdio();
        this.zzd = zzcgxVar;
        zzfchVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() {
        com.google.android.gms.internal.ads.zzdiq zzdiqVarZzg = this.zzb.zzg();
        this.zza.zzE(zzdiqVarZzg.zzi());
        this.zza.zzF(zzdiqVarZzg.zzh());
        com.google.android.gms.internal.ads.zzfch zzfchVar = this.zza;
        if (zzfchVar.zzh() == null) {
            zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzc());
        }
        return new com.google.android.gms.internal.ads.zzejr(this.zzc, this.zzd, this.zza, zzdiqVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(com.google.android.gms.internal.ads.zzbgu zzbguVar) {
        this.zzb.zza(zzbguVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        this.zzb.zzb(zzbgxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzbhd zzbhdVar, com.google.android.gms.internal.ads.zzbha zzbhaVar) {
        this.zzb.zzc(str, zzbhdVar, zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.internal.ads.zzbmi zzbmiVar) {
        this.zzb.zzd(zzbmiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.internal.ads.zzbhh zzbhhVar, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb.zze(zzbhhVar);
        this.zza.zzs(zzsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(com.google.android.gms.internal.ads.zzbhk zzbhkVar) {
        this.zzb.zzf(zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zze = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.internal.ads.zzblz zzblzVar) {
        this.zza.zzw(zzblzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.internal.ads.zzbfl zzbflVar) {
        this.zza.zzD(zzbflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zza.zzV(zzcqVar);
    }
}
