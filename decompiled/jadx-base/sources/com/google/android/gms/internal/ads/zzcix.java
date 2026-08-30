package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcix implements com.google.android.gms.internal.ads.zzdtg {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private android.content.Context zzb;
    private com.google.android.gms.internal.ads.zzbko zzc;

    /* synthetic */ zzcix(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final com.google.android.gms.internal.ads.zzdth zzc() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, com.google.android.gms.internal.ads.zzbko.class);
        return new com.google.android.gms.internal.ads.zzciy(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdtg zza(com.google.android.gms.internal.ads.zzbko zzbkoVar) {
        zzbkoVar.getClass();
        this.zzc = zzbkoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdtg zzb(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
