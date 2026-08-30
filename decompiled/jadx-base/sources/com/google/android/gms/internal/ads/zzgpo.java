package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgpo {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgpo.zzb((com.google.android.gms.internal.ads.zzgof) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgof.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgpl
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgpo.zzd((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgpm
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgpo.zza((com.google.android.gms.internal.ads.zzgnx) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgnx.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgpn
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgpo.zzc((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zza(com.google.android.gms.internal.ads.zzgnx zzgnxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgpz zzgpzVarZzb = com.google.android.gms.internal.ads.zzgqb.zzb();
        zzgpzVarZzb.zzb(zzg(zzgnxVar.zzb()));
        byte[] bArrZzd = zzgnxVar.zzd().zzd(zzgeoVar);
        zzgpzVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((com.google.android.gms.internal.ads.zzgqb) zzgpzVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzh(zzgnxVar.zzb().zzf()), zzgnxVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzb(com.google.android.gms.internal.ads.zzgof zzgofVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        com.google.android.gms.internal.ads.zzgqc zzgqcVarZzb = com.google.android.gms.internal.ads.zzgqe.zzb();
        zzgqcVarZzb.zzb(zzg(zzgofVar));
        zzgqcVarZzb.zza(zzgofVar.zzc());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgqe) zzgqcVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzh(zzgofVar.zzf()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnx zzc(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgqb zzgqbVarZzd = com.google.android.gms.internal.ads.zzgqb.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgqbVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzgoc zzgocVarZze = com.google.android.gms.internal.ads.zzgof.zze();
            zzgocVarZze.zza(zzgqbVarZzd.zzg().zzd());
            zzgocVarZze.zzb(zzgqbVarZzd.zzf().zza());
            zzgocVarZze.zzc(zzf(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzgof zzgofVarZzd = zzgocVarZze.zzd();
            com.google.android.gms.internal.ads.zzgnv zzgnvVarZza = com.google.android.gms.internal.ads.zzgnx.zza();
            zzgnvVarZza.zzc(zzgofVarZzd);
            zzgnvVarZza.zza(com.google.android.gms.internal.ads.zzgvp.zzb(zzgqbVarZzd.zzg().zzA(), zzgeoVar));
            zzgnvVarZza.zzb(zzgnhVar.zzf());
            return zzgnvVarZza.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgof zzd(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgqe zzgqeVarZzd = com.google.android.gms.internal.ads.zzgqe.zzd(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            com.google.android.gms.internal.ads.zzgoc zzgocVarZze = com.google.android.gms.internal.ads.zzgof.zze();
            zzgocVarZze.zza(zzgqeVarZzd.zza());
            zzgocVarZze.zzb(zzgqeVarZzd.zzf().zza());
            zzgocVarZze.zzc(zzf(zzgniVar.zzc().zzg()));
            return zzgocVarZze.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzgod zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgod.zza;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.zzgod.zzc;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.zzgod.zzd;
        }
        if (iOrdinal == 4) {
            return com.google.android.gms.internal.ads.zzgod.zzb;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
    }

    private static com.google.android.gms.internal.ads.zzgqh zzg(com.google.android.gms.internal.ads.zzgof zzgofVar) {
        com.google.android.gms.internal.ads.zzgqf zzgqfVarZzb = com.google.android.gms.internal.ads.zzgqh.zzb();
        zzgqfVarZzb.zza(zzgofVar.zzb());
        return (com.google.android.gms.internal.ads.zzgqh) zzgqfVarZzb.zzbr();
    }

    private static com.google.android.gms.internal.ads.zzgtp zzh(com.google.android.gms.internal.ads.zzgod zzgodVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgod.zza.equals(zzgodVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzgod.zzb.equals(zzgodVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzgod.zzd.equals(zzgodVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        if (com.google.android.gms.internal.ads.zzgod.zzc.equals(zzgodVar)) {
            return com.google.android.gms.internal.ads.zzgtp.LEGACY;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgodVar))));
    }
}
