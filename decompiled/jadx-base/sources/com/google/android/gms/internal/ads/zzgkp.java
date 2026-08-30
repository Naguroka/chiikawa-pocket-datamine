package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkp {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkl
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgkp.zzd((com.google.android.gms.internal.ads.zzgir) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgir.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgkp.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgkp.zzc((com.google.android.gms.internal.ads.zzgil) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgil.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgkp.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgil zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgue zzgueVarZzd = com.google.android.gms.internal.ads.zzgue.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgueVarZzd.zza() == 0) {
                return com.google.android.gms.internal.ads.zzgil.zza(zzf(zzgnhVar.zzc()), com.google.android.gms.internal.ads.zzgvp.zzb(zzgueVarZzd.zzf().zzA(), zzgeoVar), zzgnhVar.zzf());
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgir zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            if (com.google.android.gms.internal.ads.zzguh.zzd(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza()).zza() == 0) {
                return com.google.android.gms.internal.ads.zzgir.zzc(zzf(zzgniVar.zzc().zzg()));
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzgil zzgilVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzguc zzgucVarZzb = com.google.android.gms.internal.ads.zzgue.zzb();
        byte[] bArrZzd = zzgilVar.zzd().zzd(zzgeoVar);
        zzgucVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((com.google.android.gms.internal.ads.zzgue) zzgucVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzg(zzgilVar.zzb().zzb()), zzgilVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzgir zzgirVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgsnVarZza.zzc(com.google.android.gms.internal.ads.zzguh.zzc().zzaN());
        zzgsnVarZza.zza(zzg(zzgirVar.zzb()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzgiq zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgiq.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.zzgiq.zzc;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
        }
        return com.google.android.gms.internal.ads.zzgiq.zzb;
    }

    private static com.google.android.gms.internal.ads.zzgtp zzg(com.google.android.gms.internal.ads.zzgiq zzgiqVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgiq.zza.equals(zzgiqVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzgiq.zzb.equals(zzgiqVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzgiq.zzc.equals(zzgiqVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzgiqVar.toString()));
    }
}
