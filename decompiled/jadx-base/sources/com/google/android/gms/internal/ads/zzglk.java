package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzglk extends com.google.android.gms.internal.ads.zzgdx {
    private final com.google.android.gms.internal.ads.zzgnh zza;

    public zzglk(com.google.android.gms.internal.ads.zzgnh zzgnhVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        zzc(zzgnhVar, zzgeoVar);
        this.zza = zzgnhVar;
    }

    private static void zzc(com.google.android.gms.internal.ads.zzgnh zzgnhVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        int i = com.google.android.gms.internal.ads.zzglj.zzb[zzgnhVar.zzb().ordinal()];
    }

    public final com.google.android.gms.internal.ads.zzgnh zza(@javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        zzc(this.zza, zzgeoVar);
        return this.zza;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return this.zza.zzf();
    }
}
