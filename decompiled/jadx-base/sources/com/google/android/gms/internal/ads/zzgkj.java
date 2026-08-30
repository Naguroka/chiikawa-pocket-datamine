package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkj {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkf
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgkj.zzd((com.google.android.gms.internal.ads.zzgik) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgik.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgkj.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgkh
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgkj.zzc((com.google.android.gms.internal.ads.zzgif) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgif.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgkj.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgif zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgtv zzgtvVarZzd = com.google.android.gms.internal.ads.zzgtv.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgtvVarZzd.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgtvVarZzd.zzg().zzd() == 32) {
                return com.google.android.gms.internal.ads.zzgif.zza(com.google.android.gms.internal.ads.zzgik.zzd(zzf(zzgnhVar.zzc()), zzgtvVarZzd.zzf().zza()), com.google.android.gms.internal.ads.zzgvp.zzb(zzgtvVarZzd.zzg().zzA(), zzgeoVar), zzgnhVar.zzf());
            }
            throw new java.security.GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.android.gms.internal.ads.zzgyg unused) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgik zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgty zzgtyVarZzd = com.google.android.gms.internal.ads.zzgty.zzd(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgtyVarZzd.zza() == 0) {
                return com.google.android.gms.internal.ads.zzgik.zzd(zzf(zzgniVar.zzc().zzg()), zzgtyVarZzd.zzf().zza());
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzgif zzgifVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgtt zzgttVarZzb = com.google.android.gms.internal.ads.zzgtv.zzb();
        byte[] bArrZzd = zzgifVar.zzd().zzd(zzgeoVar);
        zzgttVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        com.google.android.gms.internal.ads.zzgtz zzgtzVarZzb = com.google.android.gms.internal.ads.zzgub.zzb();
        zzgtzVarZzb.zza(zzgifVar.zzb().zzb());
        zzgttVarZzb.zzb((com.google.android.gms.internal.ads.zzgub) zzgtzVarZzb.zzbr());
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((com.google.android.gms.internal.ads.zzgtv) zzgttVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, zzg(zzgifVar.zzb().zzc()), zzgifVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzgik zzgikVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        com.google.android.gms.internal.ads.zzgtw zzgtwVarZzb = com.google.android.gms.internal.ads.zzgty.zzb();
        com.google.android.gms.internal.ads.zzgtz zzgtzVarZzb = com.google.android.gms.internal.ads.zzgub.zzb();
        zzgtzVarZzb.zza(zzgikVar.zzb());
        zzgtwVarZzb.zza((com.google.android.gms.internal.ads.zzgub) zzgtzVarZzb.zzbr());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgty) zzgtwVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzgikVar.zzc()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzgij zzf(com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.android.gms.internal.ads.zzgij.zza;
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.internal.ads.zzgij.zzb;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
    }

    private static com.google.android.gms.internal.ads.zzgtp zzg(com.google.android.gms.internal.ads.zzgij zzgijVar) throws java.security.GeneralSecurityException {
        if (java.util.Objects.equals(zzgijVar, com.google.android.gms.internal.ads.zzgij.zza)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (java.util.Objects.equals(zzgijVar, com.google.android.gms.internal.ads.zzgij.zzb)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(zzgijVar.toString()));
    }
}
