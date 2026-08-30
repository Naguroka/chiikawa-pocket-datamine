package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgji {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgji.zzd((com.google.android.gms.internal.ads.zzggf) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzggf.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgji.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgji.zzc((com.google.android.gms.internal.ads.zzgfx) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgfx.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgji.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgfx zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgri zzgriVarZzd = com.google.android.gms.internal.ads.zzgri.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgriVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzggc zzggcVarZzc = com.google.android.gms.internal.ads.zzggf.zzc();
            zzggcVarZzc.zzb(zzgriVarZzd.zzf().zzd());
            zzggcVarZzc.zza(12);
            zzggcVarZzc.zzc(16);
            zzggcVarZzc.zzd(zzf(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzggf zzggfVarZze = zzggcVarZzc.zze();
            com.google.android.gms.internal.ads.zzgfv zzgfvVarZza = com.google.android.gms.internal.ads.zzgfx.zza();
            zzgfvVarZza.zzc(zzggfVarZze);
            zzgfvVarZza.zzb(com.google.android.gms.internal.ads.zzgvp.zzb(zzgriVarZzd.zzf().zzA(), zzgeoVar));
            zzgfvVarZza.zza(zzgnhVar.zzf());
            return zzgfvVarZza.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzggf zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgrl zzgrlVarZzf = com.google.android.gms.internal.ads.zzgrl.zzf(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgrlVarZzf.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            com.google.android.gms.internal.ads.zzggc zzggcVarZzc = com.google.android.gms.internal.ads.zzggf.zzc();
            zzggcVarZzc.zzb(zzgrlVarZzf.zza());
            zzggcVarZzc.zza(12);
            zzggcVarZzc.zzc(16);
            zzggcVarZzc.zzd(zzf(zzgniVar.zzc().zzg()));
            return zzggcVarZzc.zze();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzgfx zzgfxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgrg zzgrgVarZzb = com.google.android.gms.internal.ads.zzgri.zzb();
        byte[] bArrZzd = zzgfxVar.zzd().zzd(zzgeoVar);
        zzgrgVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((com.google.android.gms.internal.ads.zzgri) zzgrgVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzg(zzgfxVar.zzb().zzd()), zzgfxVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzggf zzggfVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        com.google.android.gms.internal.ads.zzgrj zzgrjVarZzc = com.google.android.gms.internal.ads.zzgrl.zzc();
        zzgrjVarZzc.zza(zzggfVar.zzb());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgrl) zzgrjVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzggfVar.zzd()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzggd zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzggd.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.zzggd.zzc;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
        }
        return com.google.android.gms.internal.ads.zzggd.zzb;
    }

    private static com.google.android.gms.internal.ads.zzgtp zzg(com.google.android.gms.internal.ads.zzggd zzggdVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzggd.zza.equals(zzggdVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzggd.zzb.equals(zzggdVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzggd.zzc.equals(zzggdVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzggdVar))));
    }
}
