package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcje implements com.google.android.gms.internal.ads.zzfbh {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private android.content.Context zzb;
    private java.lang.String zzc;

    /* synthetic */ zzcje(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfbh zza(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final com.google.android.gms.internal.ads.zzfbi zzc() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, android.content.Context.class);
        return new com.google.android.gms.internal.ads.zzcjf(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfbh zzb(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
