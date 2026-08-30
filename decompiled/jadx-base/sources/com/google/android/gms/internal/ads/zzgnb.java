package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnb {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzgnb(com.google.android.gms.internal.ads.zzgmy zzgmyVar, com.google.android.gms.internal.ads.zzgna zzgnaVar) {
        this.zza = new java.util.HashMap(zzgmyVar.zza);
        this.zzb = new java.util.HashMap(zzgmyVar.zzb);
    }

    public final java.lang.Class zza(java.lang.Class cls) throws java.security.GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((com.google.android.gms.internal.ads.zzgng) this.zzb.get(cls)).zza();
        }
        throw new java.security.GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final java.lang.Object zzb(com.google.android.gms.internal.ads.zzgdx zzgdxVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgmz zzgmzVar = new com.google.android.gms.internal.ads.zzgmz(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgmzVar)) {
            return ((com.google.android.gms.internal.ads.zzgmx) this.zza.get(zzgmzVar)).zza(zzgdxVar);
        }
        throw new java.security.GeneralSecurityException("No PrimitiveConstructor for " + zzgmzVar.toString() + " available");
    }

    public final java.lang.Object zzc(com.google.android.gms.internal.ads.zzgnf zzgnfVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        com.google.android.gms.internal.ads.zzgng zzgngVar = (com.google.android.gms.internal.ads.zzgng) this.zzb.get(cls);
        if (zzgnfVar.zzd().equals(zzgngVar.zza()) && zzgngVar.zza().equals(zzgnfVar.zzd())) {
            return zzgngVar.zzc(zzgnfVar);
        }
        throw new java.security.GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
