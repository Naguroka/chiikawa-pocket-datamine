package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgeg {
    private final com.google.android.gms.internal.ads.zzgsx zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzglo zzc;

    private zzgeg(com.google.android.gms.internal.ads.zzgsx zzgsxVar, java.util.List list) {
        this.zza = zzgsxVar;
        this.zzb = list;
        this.zzc = com.google.android.gms.internal.ads.zzglo.zza;
    }

    /* synthetic */ zzgeg(com.google.android.gms.internal.ads.zzgsx zzgsxVar, java.util.List list, com.google.android.gms.internal.ads.zzglo zzgloVar, com.google.android.gms.internal.ads.zzgef zzgefVar) {
        this.zza = zzgsxVar;
        this.zzb = list;
        this.zzc = zzgloVar;
    }

    static final com.google.android.gms.internal.ads.zzgeg zza(com.google.android.gms.internal.ads.zzgsx zzgsxVar) throws java.security.GeneralSecurityException {
        zzh(zzgsxVar);
        return new com.google.android.gms.internal.ads.zzgeg(zzgsxVar, zzg(zzgsxVar));
    }

    public static final com.google.android.gms.internal.ads.zzgeg zzb(com.google.android.gms.internal.ads.zzgek zzgekVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzged zzgedVar = new com.google.android.gms.internal.ads.zzged();
        com.google.android.gms.internal.ads.zzgeb zzgebVar = new com.google.android.gms.internal.ads.zzgeb(zzgekVar, null);
        zzgebVar.zzd();
        zzgebVar.zzc();
        zzgedVar.zza(zzgebVar);
        return zzgedVar.zzb();
    }

    private final java.lang.Object zzf(com.google.android.gms.internal.ads.zzgky zzgkyVar, java.lang.Class cls, java.lang.Class cls2) throws java.security.GeneralSecurityException {
        int i = com.google.android.gms.internal.ads.zzger.zza;
        com.google.android.gms.internal.ads.zzgsx zzgsxVar = this.zza;
        int iZzb = zzgsxVar.zzb();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (com.google.android.gms.internal.ads.zzgsv zzgsvVar : zzgsxVar.zzh()) {
            if (zzgsvVar.zzk() == 3) {
                if (!zzgsvVar.zzj()) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has no key data", java.lang.Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zzf() == com.google.android.gms.internal.ads.zzgtp.UNKNOWN_PREFIX) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown prefix", java.lang.Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zzk() == 2) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown status", java.lang.Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zza() == iZzb) {
                    if (z) {
                        throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgsvVar.zzb().zzb() == com.google.android.gms.internal.ads.zzgsj.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        com.google.android.gms.internal.ads.zzgnc zzgncVarZzb = com.google.android.gms.internal.ads.zzgnf.zzb(cls2);
        zzgncVarZzb.zzc(this.zzc);
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            com.google.android.gms.internal.ads.zzgsv zzgsvVarZzd = this.zza.zzd(i3);
            if (zzgsvVarZzd.zzk() == 3) {
                com.google.android.gms.internal.ads.zzgee zzgeeVar = (com.google.android.gms.internal.ads.zzgee) this.zzb.get(i3);
                if (zzgeeVar == null) {
                    throw new java.security.GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzgsvVarZzd.zzb().zzg() + " failed, unable to get primitive");
                }
                com.google.android.gms.internal.ads.zzgdx zzgdxVarZza = zzgeeVar.zza();
                try {
                    java.lang.Object objZzb = zzgkyVar.zzb(zzgdxVarZza, cls2);
                    if (zzgsvVarZzd.zza() == this.zza.zzb()) {
                        zzgncVarZzb.zzb(objZzb, zzgdxVarZza, zzgsvVarZzd);
                    } else {
                        zzgncVarZzb.zza(objZzb, zzgdxVarZza, zzgsvVarZzd);
                    }
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.security.GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + zzgsvVarZzd.zzb().zzg() + ", see https://developers.google.com/tink/faq/registration_errors", e);
                }
            }
        }
        return zzgkyVar.zzc(zzgncVarZzb.zzd(), cls);
    }

    private static java.util.List zzg(com.google.android.gms.internal.ads.zzgsx zzgsxVar) {
        com.google.android.gms.internal.ads.zzgdz zzgdzVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(zzgsxVar.zza());
        for (com.google.android.gms.internal.ads.zzgsv zzgsvVar : zzgsxVar.zzh()) {
            int iZza = zzgsvVar.zza();
            try {
                com.google.android.gms.internal.ads.zzgnh zzgnhVarZza = com.google.android.gms.internal.ads.zzgnh.zza(zzgsvVar.zzb().zzg(), zzgsvVar.zzb().zzf(), zzgsvVar.zzb().zzb(), zzgsvVar.zzf(), zzgsvVar.zzf() == com.google.android.gms.internal.ads.zzgtp.RAW ? null : java.lang.Integer.valueOf(zzgsvVar.zza()));
                com.google.android.gms.internal.ads.zzgmk zzgmkVarZzc = com.google.android.gms.internal.ads.zzgmk.zzc();
                com.google.android.gms.internal.ads.zzgeo zzgeoVarZza = com.google.android.gms.internal.ads.zzgeo.zza();
                com.google.android.gms.internal.ads.zzgdx zzglkVar = !zzgmkVarZzc.zzj(zzgnhVarZza) ? new com.google.android.gms.internal.ads.zzglk(zzgnhVarZza, zzgeoVarZza) : zzgmkVarZzc.zza(zzgnhVarZza, zzgeoVarZza);
                int iZzk = zzgsvVar.zzk() - 2;
                if (iZzk == 1) {
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zza;
                } else if (iZzk == 2) {
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new java.security.GeneralSecurityException("Unknown key status");
                    }
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zzc;
                }
                arrayList.add(new com.google.android.gms.internal.ads.zzgee(zzglkVar, zzgdzVar, iZza, iZza == zzgsxVar.zzb(), null));
            } catch (java.security.GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(com.google.android.gms.internal.ads.zzgsx zzgsxVar) throws java.security.GeneralSecurityException {
        if (zzgsxVar == null || zzgsxVar.zza() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
    }

    public final java.lang.String toString() {
        int i = com.google.android.gms.internal.ads.zzger.zza;
        com.google.android.gms.internal.ads.zzgsy zzgsyVarZza = com.google.android.gms.internal.ads.zzgtc.zza();
        com.google.android.gms.internal.ads.zzgsx zzgsxVar = this.zza;
        zzgsyVarZza.zzb(zzgsxVar.zzb());
        for (com.google.android.gms.internal.ads.zzgsv zzgsvVar : zzgsxVar.zzh()) {
            com.google.android.gms.internal.ads.zzgsz zzgszVarZza = com.google.android.gms.internal.ads.zzgta.zza();
            zzgszVarZza.zzc(zzgsvVar.zzb().zzg());
            zzgszVarZza.zzd(zzgsvVar.zzk());
            zzgszVarZza.zzb(zzgsvVar.zzf());
            zzgszVarZza.zza(zzgsvVar.zza());
            zzgsyVarZza.zza((com.google.android.gms.internal.ads.zzgta) zzgszVarZza.zzbr());
        }
        return ((com.google.android.gms.internal.ads.zzgtc) zzgsyVarZza.zzbr()).toString();
    }

    final com.google.android.gms.internal.ads.zzgsx zzc() {
        return this.zza;
    }

    public final java.lang.Object zzd(com.google.android.gms.internal.ads.zzgdr zzgdrVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgky zzgkyVar = (com.google.android.gms.internal.ads.zzgky) zzgdrVar;
        java.lang.Class clsZza = zzgkyVar.zza(cls);
        if (clsZza != null) {
            return zzf(zzgkyVar, cls, clsZza);
        }
        throw new java.security.GeneralSecurityException("No wrapper found for ".concat(java.lang.String.valueOf(cls.getName())));
    }
}
