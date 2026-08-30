package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgmx {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgmx(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.zzgmw zzgmwVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzgmx zzb(com.google.android.gms.internal.ads.zzgmv zzgmvVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzgmu(cls, cls2, zzgmvVar);
    }

    public abstract java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzc() {
        return this.zza;
    }

    public final java.lang.Class zzd() {
        return this.zzb;
    }
}
