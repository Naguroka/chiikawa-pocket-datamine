package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgiw {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgis
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgiw.zzd((com.google.android.gms.internal.ads.zzgfk) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgfk.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgit
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgiw.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgiu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgiw.zzc((com.google.android.gms.internal.ads.zzgfb) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgfb.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgiv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgiw.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgfb zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgqk zzgqkVarZzd = com.google.android.gms.internal.ads.zzgqk.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgqkVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgqkVarZzd.zzf().zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgqkVarZzd.zzg().zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            com.google.android.gms.internal.ads.zzgfg zzgfgVarZzf = com.google.android.gms.internal.ads.zzgfk.zzf();
            zzgfgVarZzf.zza(zzgqkVarZzd.zzf().zzg().zzd());
            zzgfgVarZzf.zzc(zzgqkVarZzd.zzg().zzh().zzd());
            zzgfgVarZzf.zzd(zzgqkVarZzd.zzf().zzf().zza());
            zzgfgVarZzf.zze(zzgqkVarZzd.zzg().zzg().zza());
            zzgfgVarZzf.zzb(zzf(zzgqkVarZzd.zzg().zzg().zzb()));
            zzgfgVarZzf.zzf(zzg(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzgfk zzgfkVarZzg = zzgfgVarZzf.zzg();
            com.google.android.gms.internal.ads.zzgez zzgezVarZza = com.google.android.gms.internal.ads.zzgfb.zza();
            zzgezVarZza.zzd(zzgfkVarZzg);
            zzgezVarZza.zza(com.google.android.gms.internal.ads.zzgvp.zzb(zzgqkVarZzd.zzf().zzg().zzA(), zzgeoVar));
            zzgezVarZza.zzb(com.google.android.gms.internal.ads.zzgvp.zzb(zzgqkVarZzd.zzg().zzh().zzA(), zzgeoVar));
            zzgezVarZza.zzc(zzgnhVar.zzf());
            return zzgezVarZza.zze();
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgfk zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgqn zzgqnVarZzc = com.google.android.gms.internal.ads.zzgqn.zzc(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgqnVarZzc.zzf().zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzgfg zzgfgVarZzf = com.google.android.gms.internal.ads.zzgfk.zzf();
            zzgfgVarZzf.zza(zzgqnVarZzc.zzd().zza());
            zzgfgVarZzf.zzc(zzgqnVarZzc.zzf().zza());
            zzgfgVarZzf.zzd(zzgqnVarZzc.zzd().zzf().zza());
            zzgfgVarZzf.zze(zzgqnVarZzc.zzf().zzh().zza());
            zzgfgVarZzf.zzb(zzf(zzgqnVarZzc.zzf().zzh().zzb()));
            zzgfgVarZzf.zzf(zzg(zzgniVar.zzc().zzg()));
            return zzgfgVarZzf.zzg();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzgfb zzgfbVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgqi zzgqiVarZzb = com.google.android.gms.internal.ads.zzgqk.zzb();
        com.google.android.gms.internal.ads.zzgqo zzgqoVarZzb = com.google.android.gms.internal.ads.zzgqq.zzb();
        com.google.android.gms.internal.ads.zzgqu zzgquVarZzb = com.google.android.gms.internal.ads.zzgqw.zzb();
        zzgquVarZzb.zza(zzgfbVar.zzb().zzd());
        zzgqoVarZzb.zzb((com.google.android.gms.internal.ads.zzgqw) zzgquVarZzb.zzbr());
        byte[] bArrZzd = zzgfbVar.zzd().zzd(zzgeoVar);
        zzgqoVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        zzgqiVarZzb.zza((com.google.android.gms.internal.ads.zzgqq) zzgqoVarZzb.zzbr());
        com.google.android.gms.internal.ads.zzgrz zzgrzVarZzb = com.google.android.gms.internal.ads.zzgsb.zzb();
        zzgrzVarZzb.zzb(zzh(zzgfbVar.zzb()));
        byte[] bArrZzd2 = zzgfbVar.zze().zzd(zzgeoVar);
        zzgrzVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgqiVarZzb.zzb((com.google.android.gms.internal.ads.zzgsb) zzgrzVarZzb.zzbr());
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((com.google.android.gms.internal.ads.zzgqk) zzgqiVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzi(zzgfbVar.zzb().zzh()), zzgfbVar.zzf());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzgfk zzgfkVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        com.google.android.gms.internal.ads.zzgql zzgqlVarZza = com.google.android.gms.internal.ads.zzgqn.zza();
        com.google.android.gms.internal.ads.zzgqr zzgqrVarZzb = com.google.android.gms.internal.ads.zzgqt.zzb();
        com.google.android.gms.internal.ads.zzgqu zzgquVarZzb = com.google.android.gms.internal.ads.zzgqw.zzb();
        zzgquVarZzb.zza(zzgfkVar.zzd());
        zzgqrVarZzb.zzb((com.google.android.gms.internal.ads.zzgqw) zzgquVarZzb.zzbr());
        zzgqrVarZzb.zza(zzgfkVar.zzb());
        zzgqlVarZza.zza((com.google.android.gms.internal.ads.zzgqt) zzgqrVarZzb.zzbr());
        com.google.android.gms.internal.ads.zzgsc zzgscVarZzc = com.google.android.gms.internal.ads.zzgse.zzc();
        zzgscVarZzc.zzb(zzh(zzgfkVar));
        zzgscVarZzc.zza(zzgfkVar.zzc());
        zzgqlVarZza.zzb((com.google.android.gms.internal.ads.zzgse) zzgscVarZzc.zzbr());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgqn) zzgqlVarZza.zzbr()).zzaN());
        zzgsnVarZza.zza(zzi(zzgfkVar.zzh()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzgfh zzf(com.google.android.gms.internal.ads.zzgry zzgryVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgryVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgfh.zza;
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.internal.ads.zzgfh.zzd;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.zzgfh.zzc;
        }
        if (iOrdinal == 4) {
            return com.google.android.gms.internal.ads.zzgfh.zze;
        }
        if (iOrdinal == 5) {
            return com.google.android.gms.internal.ads.zzgfh.zzb;
        }
        throw new java.security.GeneralSecurityException("Unable to parse HashType: " + zzgryVar.zza());
    }

    private static com.google.android.gms.internal.ads.zzgfi zzg(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgfi.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.zzgfi.zzc;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
        }
        return com.google.android.gms.internal.ads.zzgfi.zzb;
    }

    private static com.google.android.gms.internal.ads.zzgsh zzh(com.google.android.gms.internal.ads.zzgfk zzgfkVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgry zzgryVar;
        com.google.android.gms.internal.ads.zzgsf zzgsfVarZzc = com.google.android.gms.internal.ads.zzgsh.zzc();
        zzgsfVarZzc.zzb(zzgfkVar.zze());
        com.google.android.gms.internal.ads.zzgfh zzgfhVarZzg = zzgfkVar.zzg();
        if (com.google.android.gms.internal.ads.zzgfh.zza.equals(zzgfhVarZzg)) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA1;
        } else if (com.google.android.gms.internal.ads.zzgfh.zzb.equals(zzgfhVarZzg)) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA224;
        } else if (com.google.android.gms.internal.ads.zzgfh.zzc.equals(zzgfhVarZzg)) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA256;
        } else if (com.google.android.gms.internal.ads.zzgfh.zzd.equals(zzgfhVarZzg)) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA384;
        } else {
            if (!com.google.android.gms.internal.ads.zzgfh.zze.equals(zzgfhVarZzg)) {
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgfhVarZzg))));
            }
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA512;
        }
        zzgsfVarZzc.zza(zzgryVar);
        return (com.google.android.gms.internal.ads.zzgsh) zzgsfVarZzc.zzbr();
    }

    private static com.google.android.gms.internal.ads.zzgtp zzi(com.google.android.gms.internal.ads.zzgfi zzgfiVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgfi.zza.equals(zzgfiVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzgfi.zzb.equals(zzgfiVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzgfi.zzc.equals(zzgfiVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgfiVar))));
    }
}
