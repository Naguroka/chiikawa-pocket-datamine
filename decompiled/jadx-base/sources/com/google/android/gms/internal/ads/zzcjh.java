package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcjh implements com.google.android.gms.internal.ads.zzdoe {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private com.google.android.gms.internal.ads.zzezj zzb;
    private com.google.android.gms.internal.ads.zzeym zzc;
    private com.google.android.gms.internal.ads.zzdbm zzd;
    private com.google.android.gms.internal.ads.zzcvc zze;

    /* synthetic */ zzcjh(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcuy zza(com.google.android.gms.internal.ads.zzeym zzeymVar) {
        this.zzc = zzeymVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcuy zzb(com.google.android.gms.internal.ads.zzezj zzezjVar) {
        this.zzb = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdoe zzc(com.google.android.gms.internal.ads.zzdbm zzdbmVar) {
        this.zzd = zzdbmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdoe zzd(com.google.android.gms.internal.ads.zzcvc zzcvcVar) {
        this.zze = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdof zzh() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzd, com.google.android.gms.internal.ads.zzdbm.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zze, com.google.android.gms.internal.ads.zzcvc.class);
        return new com.google.android.gms.internal.ads.zzcji(this.zza, new com.google.android.gms.internal.ads.zzcsf(), new com.google.android.gms.internal.ads.zzfdo(), new com.google.android.gms.internal.ads.zzcue(), new com.google.android.gms.internal.ads.zzdsl(), this.zzd, this.zze, com.google.android.gms.internal.ads.zzehb.zza(), null, this.zzb, this.zzc, null);
    }
}
