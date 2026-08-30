package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzciv implements com.google.android.gms.internal.ads.zzdsy {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private final com.google.android.gms.internal.ads.zzciy zzb;
    private java.lang.Long zzc;
    private java.lang.String zzd;

    /* synthetic */ zzciv(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzciy zzciyVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        this.zzb = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsy
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdsy zzb(long j) {
        this.zzc = java.lang.Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsy
    public final com.google.android.gms.internal.ads.zzdsz zzc() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzc, java.lang.Long.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzd, java.lang.String.class);
        return new com.google.android.gms.internal.ads.zzciw(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdsy
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdsy zza(java.lang.String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }
}
