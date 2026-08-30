package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgjn {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjj
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgjn.zzd((com.google.android.gms.internal.ads.zzggq) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzggq.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjk
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgjn.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgjl
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgjn.zzc((com.google.android.gms.internal.ads.zzggi) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzggi.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgjn.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzggi zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgro zzgroVarZzd = com.google.android.gms.internal.ads.zzgro.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgroVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzggn zzggnVarZzc = com.google.android.gms.internal.ads.zzggq.zzc();
            zzggnVarZzc.zza(zzgroVarZzd.zzf().zzd());
            zzggnVarZzc.zzb(zzf(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzggq zzggqVarZzc = zzggnVarZzc.zzc();
            com.google.android.gms.internal.ads.zzggg zzgggVarZza = com.google.android.gms.internal.ads.zzggi.zza();
            zzgggVarZza.zzc(zzggqVarZzc);
            zzgggVarZza.zzb(com.google.android.gms.internal.ads.zzgvp.zzb(zzgroVarZzd.zzf().zzA(), zzgeoVar));
            zzgggVarZza.zza(zzgnhVar.zzf());
            return zzgggVarZza.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzggq zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgrr zzgrrVarZzf = com.google.android.gms.internal.ads.zzgrr.zzf(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgrrVarZzf.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            com.google.android.gms.internal.ads.zzggn zzggnVarZzc = com.google.android.gms.internal.ads.zzggq.zzc();
            zzggnVarZzc.zza(zzgrrVarZzf.zza());
            zzggnVarZzc.zzb(zzf(zzgniVar.zzc().zzg()));
            return zzggnVarZzc.zzc();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzggi zzggiVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgrm zzgrmVarZzb = com.google.android.gms.internal.ads.zzgro.zzb();
        byte[] bArrZzd = zzggiVar.zzd().zzd(zzgeoVar);
        zzgrmVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((com.google.android.gms.internal.ads.zzgro) zzgrmVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzg(zzggiVar.zzb().zzd()), zzggiVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzggq zzggqVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        com.google.android.gms.internal.ads.zzgrp zzgrpVarZzc = com.google.android.gms.internal.ads.zzgrr.zzc();
        zzgrpVarZzc.zza(zzggqVar.zzb());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgrr) zzgrpVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzggqVar.zzd()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzggo zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzggo.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.zzggo.zzc;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
        }
        return com.google.android.gms.internal.ads.zzggo.zzb;
    }

    private static com.google.android.gms.internal.ads.zzgtp zzg(com.google.android.gms.internal.ads.zzggo zzggoVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzggo.zza.equals(zzggoVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzggo.zzb.equals(zzggoVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzggo.zzc.equals(zzggoVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzggoVar))));
    }
}
