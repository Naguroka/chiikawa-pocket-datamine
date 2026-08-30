package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzciq implements com.google.android.gms.internal.ads.zzeyc {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private android.content.Context zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    /* synthetic */ zzciq(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final com.google.android.gms.internal.ads.zzeyd zzd() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, java.lang.String.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzs.class);
        return new com.google.android.gms.internal.ads.zzcir(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeyc zza(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzsVar.getClass();
        this.zzd = zzsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeyc zzb(java.lang.String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeyc zzc(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
