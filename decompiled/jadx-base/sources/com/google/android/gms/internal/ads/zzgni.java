package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgni implements com.google.android.gms.internal.ads.zzgnm {
    private final com.google.android.gms.internal.ads.zzgvo zza;
    private final com.google.android.gms.internal.ads.zzgsp zzb;

    private zzgni(com.google.android.gms.internal.ads.zzgsp zzgspVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar) {
        this.zzb = zzgspVar;
        this.zza = zzgvoVar;
    }

    public static com.google.android.gms.internal.ads.zzgni zza(com.google.android.gms.internal.ads.zzgsp zzgspVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzgni(zzgspVar, com.google.android.gms.internal.ads.zzgnu.zza(zzgspVar.zzi()));
    }

    public static com.google.android.gms.internal.ads.zzgni zzb(com.google.android.gms.internal.ads.zzgsp zzgspVar) {
        return new com.google.android.gms.internal.ads.zzgni(zzgspVar, com.google.android.gms.internal.ads.zzgnu.zzb(zzgspVar.zzi()));
    }

    public final com.google.android.gms.internal.ads.zzgsp zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final com.google.android.gms.internal.ads.zzgvo zzd() {
        return this.zza;
    }
}
