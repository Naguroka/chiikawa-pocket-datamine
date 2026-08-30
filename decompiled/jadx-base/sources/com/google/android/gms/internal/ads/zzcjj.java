package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcjj implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private com.google.android.gms.internal.ads.zzcvc zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzc;

    /* synthetic */ zzcjj(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zza(com.google.android.gms.internal.ads.zzcvc zzcvcVar) {
        this.zzb = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzazVar) {
        this.zzc = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzc() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, com.google.android.gms.internal.ads.zzcvc.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzaz.class);
        return new com.google.android.gms.internal.ads.zzcjk(this.zza, this.zzc, new com.google.android.gms.internal.ads.zzcsf(), new com.google.android.gms.internal.ads.zzcue(), new com.google.android.gms.internal.ads.zzdsl(), this.zzb, null, null, null);
    }
}
