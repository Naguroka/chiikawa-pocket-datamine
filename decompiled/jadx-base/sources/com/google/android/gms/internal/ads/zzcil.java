package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcil implements com.google.android.gms.internal.ads.zzewo {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private android.content.Context zzb;
    private java.lang.String zzc;

    /* synthetic */ zzcil(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final com.google.android.gms.internal.ads.zzewp zzc() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, java.lang.String.class);
        return new com.google.android.gms.internal.ads.zzcim(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzewo zza(java.lang.String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzewo zzb(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
