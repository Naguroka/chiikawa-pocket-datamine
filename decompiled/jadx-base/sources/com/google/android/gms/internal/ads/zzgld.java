package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgld {
    private final com.google.android.gms.internal.ads.zzgvo zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgld(com.google.android.gms.internal.ads.zzgvo zzgvoVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzglc zzglcVar) {
        this.zza = zzgvoVar;
        this.zzb = cls;
    }

    public static com.google.android.gms.internal.ads.zzgld zzb(com.google.android.gms.internal.ads.zzglb zzglbVar, com.google.android.gms.internal.ads.zzgvo zzgvoVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzgla(zzgvoVar, cls, zzglbVar);
    }

    public abstract com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException;

    public final com.google.android.gms.internal.ads.zzgvo zzc() {
        return this.zza;
    }

    public final java.lang.Class zzd() {
        return this.zzb;
    }
}
