package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgmt {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgmt(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.zzgms zzgmsVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzgmt zzb(com.google.android.gms.internal.ads.zzgmr zzgmrVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzgmq(cls, cls2, zzgmrVar);
    }

    public abstract com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzc() {
        return this.zza;
    }

    public final java.lang.Class zzd() {
        return this.zzb;
    }
}
