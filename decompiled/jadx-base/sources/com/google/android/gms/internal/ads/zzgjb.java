package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgix
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgjb.zzd((com.google.android.gms.internal.ads.zzgfu) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgfu.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgjb.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgiz
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgjb.zzc((com.google.android.gms.internal.ads.zzgfn) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgfn.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgja
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgjb.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgfn zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgqz zzgqzVarZzd = com.google.android.gms.internal.ads.zzgqz.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgqzVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzgfr zzgfrVarZzd = com.google.android.gms.internal.ads.zzgfu.zzd();
            zzgfrVarZzd.zzb(zzgqzVarZzd.zzg().zzd());
            zzgfrVarZzd.zza(zzgqzVarZzd.zzf().zza());
            zzgfrVarZzd.zzc(16);
            zzgfrVarZzd.zzd(zzf(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzgfu zzgfuVarZze = zzgfrVarZzd.zze();
            com.google.android.gms.internal.ads.zzgfl zzgflVarZza = com.google.android.gms.internal.ads.zzgfn.zza();
            zzgflVarZza.zzc(zzgfuVarZze);
            zzgflVarZza.zzb(com.google.android.gms.internal.ads.zzgvp.zzb(zzgqzVarZzd.zzg().zzA(), zzgeoVar));
            zzgflVarZza.zza(zzgnhVar.zzf());
            return zzgflVarZza.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgfu zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgrc zzgrcVarZzd = com.google.android.gms.internal.ads.zzgrc.zzd(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            com.google.android.gms.internal.ads.zzgfr zzgfrVarZzd = com.google.android.gms.internal.ads.zzgfu.zzd();
            zzgfrVarZzd.zzb(zzgrcVarZzd.zza());
            zzgfrVarZzd.zza(zzgrcVarZzd.zzf().zza());
            zzgfrVarZzd.zzc(16);
            zzgfrVarZzd.zzd(zzf(zzgniVar.zzc().zzg()));
            return zzgfrVarZzd.zze();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzgfn zzgfnVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgqx zzgqxVarZzb = com.google.android.gms.internal.ads.zzgqz.zzb();
        zzgqxVarZzb.zzb(zzg(zzgfnVar.zzb()));
        byte[] bArrZzd = zzgfnVar.zzd().zzd(zzgeoVar);
        zzgqxVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((com.google.android.gms.internal.ads.zzgqz) zzgqxVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzh(zzgfnVar.zzb().zze()), zzgfnVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzgfu zzgfuVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        com.google.android.gms.internal.ads.zzgra zzgraVarZzb = com.google.android.gms.internal.ads.zzgrc.zzb();
        zzgraVarZzb.zzb(zzg(zzgfuVar));
        zzgraVarZzb.zza(zzgfuVar.zzc());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgrc) zzgraVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzh(zzgfuVar.zze()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzgfs zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgfs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return com.google.android.gms.internal.ads.zzgfs.zzc;
            }
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
        }
        return com.google.android.gms.internal.ads.zzgfs.zzb;
    }

    private static com.google.android.gms.internal.ads.zzgrf zzg(com.google.android.gms.internal.ads.zzgfu zzgfuVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgrd zzgrdVarZzb = com.google.android.gms.internal.ads.zzgrf.zzb();
        zzgrdVarZzb.zza(zzgfuVar.zzb());
        return (com.google.android.gms.internal.ads.zzgrf) zzgrdVarZzb.zzbr();
    }

    private static com.google.android.gms.internal.ads.zzgtp zzh(com.google.android.gms.internal.ads.zzgfs zzgfsVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzgfs.zza.equals(zzgfsVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzgfs.zzb.equals(zzgfsVar)) {
            return com.google.android.gms.internal.ads.zzgtp.CRUNCHY;
        }
        if (com.google.android.gms.internal.ads.zzgfs.zzc.equals(zzgfsVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgfsVar))));
    }
}
