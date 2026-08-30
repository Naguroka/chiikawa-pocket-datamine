package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzglh {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzglh(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.zzglg zzglgVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzglh zzb(com.google.android.gms.internal.ads.zzglf zzglfVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzgle(cls, cls2, zzglfVar);
    }

    public abstract com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzc() {
        return this.zza;
    }

    public final java.lang.Class zzd() {
        return this.zzb;
    }
}
