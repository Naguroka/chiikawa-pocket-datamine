package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnr {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    /* synthetic */ zzgnr(com.google.android.gms.internal.ads.zzgnn zzgnnVar, com.google.android.gms.internal.ads.zzgnq zzgnqVar) {
        this.zza = new java.util.HashMap(zzgnnVar.zza);
        this.zzb = new java.util.HashMap(zzgnnVar.zzb);
        this.zzc = new java.util.HashMap(zzgnnVar.zzc);
        this.zzd = new java.util.HashMap(zzgnnVar.zzd);
    }

    public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgno zzgnoVar = new com.google.android.gms.internal.ads.zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzb.containsKey(zzgnoVar)) {
            return ((com.google.android.gms.internal.ads.zzgld) this.zzb.get(zzgnoVar)).zza(zzgnmVar, zzgeoVar);
        }
        throw new java.security.GeneralSecurityException("No Key Parser for requested key type " + zzgnoVar.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.zzgek zzb(com.google.android.gms.internal.ads.zzgnm zzgnmVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgno zzgnoVar = new com.google.android.gms.internal.ads.zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzd.containsKey(zzgnoVar)) {
            return ((com.google.android.gms.internal.ads.zzgmp) this.zzd.get(zzgnoVar)).zza(zzgnmVar);
        }
        throw new java.security.GeneralSecurityException("No Parameters Parser for requested key type " + zzgnoVar.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.zzgnm zzc(com.google.android.gms.internal.ads.zzgdx zzgdxVar, java.lang.Class cls, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnp zzgnpVar = new com.google.android.gms.internal.ads.zzgnp(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgnpVar)) {
            return ((com.google.android.gms.internal.ads.zzglh) this.zza.get(zzgnpVar)).zza(zzgdxVar, zzgeoVar);
        }
        throw new java.security.GeneralSecurityException("No Key serializer for " + zzgnpVar.toString() + " available");
    }

    public final com.google.android.gms.internal.ads.zzgnm zzd(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnp zzgnpVar = new com.google.android.gms.internal.ads.zzgnp(zzgekVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgnpVar)) {
            return ((com.google.android.gms.internal.ads.zzgmt) this.zzc.get(zzgnpVar)).zza(zzgekVar);
        }
        throw new java.security.GeneralSecurityException("No Key Format serializer for " + zzgnpVar.toString() + " available");
    }

    public final boolean zzi(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
        return this.zzb.containsKey(new com.google.android.gms.internal.ads.zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }

    public final boolean zzj(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
        return this.zzd.containsKey(new com.google.android.gms.internal.ads.zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }
}
