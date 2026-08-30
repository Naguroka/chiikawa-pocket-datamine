package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkz {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgkz.class.getName());
    private static final com.google.android.gms.internal.ads.zzgkz zzb = new com.google.android.gms.internal.ads.zzgkz();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentMap zzd = new java.util.concurrent.ConcurrentHashMap();

    public static com.google.android.gms.internal.ads.zzgkz zzc() {
        return zzb;
    }

    private final synchronized com.google.android.gms.internal.ads.zzgdy zzg(java.lang.String str) throws java.security.GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new java.security.GeneralSecurityException("No key manager found for key type ".concat(java.lang.String.valueOf(str)));
        }
        return (com.google.android.gms.internal.ads.zzgdy) this.zzc.get(str);
    }

    private final synchronized void zzh(com.google.android.gms.internal.ads.zzgdy zzgdyVar, boolean z, boolean z2) throws java.security.GeneralSecurityException {
        java.lang.String str = ((com.google.android.gms.internal.ads.zzgli) zzgdyVar).zza;
        if (this.zzd.containsKey(str) && !((java.lang.Boolean) this.zzd.get(str)).booleanValue()) {
            throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        com.google.android.gms.internal.ads.zzgdy zzgdyVar2 = (com.google.android.gms.internal.ads.zzgdy) this.zzc.get(str);
        if (zzgdyVar2 != null && !zzgdyVar2.getClass().equals(zzgdyVar.getClass())) {
            zza.logp(java.util.logging.Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new java.security.GeneralSecurityException(java.lang.String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgdyVar2.getClass().getName(), zzgdyVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(str, zzgdyVar);
        this.zzd.put(str, true);
    }

    public final com.google.android.gms.internal.ads.zzgdy zza(java.lang.String str, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgdy zzgdyVarZzg = zzg(str);
        if (zzgdyVarZzg.zzb().equals(cls)) {
            return zzgdyVarZzg;
        }
        throw new java.security.GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + java.lang.String.valueOf(zzgdyVarZzg.getClass()) + ", which only supports: " + zzgdyVarZzg.zzb().toString());
    }

    public final com.google.android.gms.internal.ads.zzgdy zzb(java.lang.String str) throws java.security.GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzgdy zzgdyVar, boolean z) throws java.security.GeneralSecurityException {
        zzf(zzgdyVar, 1, true);
    }

    public final boolean zze(java.lang.String str) {
        return ((java.lang.Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzgdy zzgdyVar, int i, boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(i)) {
            throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgdyVar, false, true);
    }
}
