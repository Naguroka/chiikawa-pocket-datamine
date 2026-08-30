package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgmp {
    private final com.google.android.gms.internal.ads.zzgvo zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgmp(com.google.android.gms.internal.ads.zzgvo zzgvoVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzgmo zzgmoVar) {
        this.zza = zzgvoVar;
        this.zzb = cls;
    }

    public static com.google.android.gms.internal.ads.zzgmp zzb(com.google.android.gms.internal.ads.zzgmn zzgmnVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzgmm(zzgvoVar, cls, zzgmnVar);
    }

    public abstract com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) throws java.security.GeneralSecurityException;

    public final com.google.android.gms.internal.ads.zzgvo zzc() {
        return this.zza;
    }

    public final java.lang.Class zzd() {
        return this.zzb;
    }
}
