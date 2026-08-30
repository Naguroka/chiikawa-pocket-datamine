package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmy {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zzgmy() {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.ads.zzgmy zza(com.google.android.gms.internal.ads.zzgmx zzgmxVar) throws java.security.GeneralSecurityException {
        if (zzgmxVar == null) {
            throw new java.lang.NullPointerException("primitive constructor must be non-null");
        }
        com.google.android.gms.internal.ads.zzgmz zzgmzVar = new com.google.android.gms.internal.ads.zzgmz(zzgmxVar.zzc(), zzgmxVar.zzd(), null);
        if (this.zza.containsKey(zzgmzVar)) {
            com.google.android.gms.internal.ads.zzgmx zzgmxVar2 = (com.google.android.gms.internal.ads.zzgmx) this.zza.get(zzgmzVar);
            if (!zzgmxVar2.equals(zzgmxVar) || !zzgmxVar.equals(zzgmxVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgmzVar.toString()));
            }
        } else {
            this.zza.put(zzgmzVar, zzgmxVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgmy zzb(com.google.android.gms.internal.ads.zzgng zzgngVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zzb;
        java.lang.Class clsZzb = zzgngVar.zzb();
        if (map.containsKey(clsZzb)) {
            com.google.android.gms.internal.ads.zzgng zzgngVar2 = (com.google.android.gms.internal.ads.zzgng) this.zzb.get(clsZzb);
            if (!zzgngVar2.equals(zzgngVar) || !zzgngVar.equals(zzgngVar2)) {
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzgngVar);
        }
        return this;
    }

    /* synthetic */ zzgmy(com.google.android.gms.internal.ads.zzgna zzgnaVar) {
        this.zza = new java.util.HashMap();
        this.zzb = new java.util.HashMap();
    }

    /* synthetic */ zzgmy(com.google.android.gms.internal.ads.zzgnb zzgnbVar, com.google.android.gms.internal.ads.zzgna zzgnaVar) {
        this.zza = new java.util.HashMap(zzgnbVar.zza);
        this.zzb = new java.util.HashMap(zzgnbVar.zzb);
    }
}
