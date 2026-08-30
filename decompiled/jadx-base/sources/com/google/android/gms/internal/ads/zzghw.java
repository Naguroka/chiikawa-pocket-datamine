package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghw {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgmt zzc;
    private static final com.google.android.gms.internal.ads.zzgmp zzd;
    private static final com.google.android.gms.internal.ads.zzglh zze;
    private static final com.google.android.gms.internal.ads.zzgld zzf;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgvoVarZzb;
        zzc = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzghs
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzghw.zzd((com.google.android.gms.internal.ads.zzghr) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzghr.class, com.google.android.gms.internal.ads.zzgni.class);
        zzd = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzght
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzghw.zzb((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zze = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzghu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzghw.zzc((com.google.android.gms.internal.ads.zzghm) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzghm.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzf = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzghv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzghw.zza((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzghm zza(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgtl zzgtlVarZzd = com.google.android.gms.internal.ads.zzgtl.zzd(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgtlVarZzd.zza() == 0) {
                return com.google.android.gms.internal.ads.zzghm.zza(zzf(zzgtlVarZzd.zzf(), zzgnhVar.zzc()), zzgnhVar.zzf());
            }
            throw new java.security.GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + java.lang.String.valueOf(zzgtlVarZzd));
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzghr zzb(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            return zzf(com.google.android.gms.internal.ads.zzgto.zzf(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza()), zzgniVar.zzc().zzg());
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zzc(com.google.android.gms.internal.ads.zzghm zzghmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgtj zzgtjVarZzb = com.google.android.gms.internal.ads.zzgtl.zzb();
        zzgtjVarZzb.zza(zzg(zzghmVar.zzb()));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((com.google.android.gms.internal.ads.zzgtl) zzgtjVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.REMOTE, zzh(zzghmVar.zzb().zzc()), zzghmVar.zzd());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzd(com.google.android.gms.internal.ads.zzghr zzghrVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgsnVarZza.zzc(zzg(zzghrVar).zzaN());
        zzgsnVarZza.zza(zzh(zzghrVar.zzc()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static com.google.android.gms.internal.ads.zzghr zzf(com.google.android.gms.internal.ads.zzgto zzgtoVar, com.google.android.gms.internal.ads.zzgtp zzgtpVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgho zzghoVar;
        com.google.android.gms.internal.ads.zzghp zzghpVar;
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb(zzgtoVar.zza().zzi());
        zzgsnVarZza.zzc(zzgtoVar.zza().zzh());
        zzgsnVarZza.zza(com.google.android.gms.internal.ads.zzgtp.RAW);
        com.google.android.gms.internal.ads.zzgek zzgekVarZza = com.google.android.gms.internal.ads.zzgeq.zza(((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr()).zzaV());
        if (zzgekVarZza instanceof com.google.android.gms.internal.ads.zzggf) {
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zza;
        } else if (zzgekVarZza instanceof com.google.android.gms.internal.ads.zzggw) {
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zzc;
        } else if (zzgekVarZza instanceof com.google.android.gms.internal.ads.zzgir) {
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zzb;
        } else if (zzgekVarZza instanceof com.google.android.gms.internal.ads.zzgfk) {
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zzd;
        } else if (zzgekVarZza instanceof com.google.android.gms.internal.ads.zzgfu) {
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zze;
        } else {
            if (!(zzgekVarZza instanceof com.google.android.gms.internal.ads.zzggq)) {
                throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgekVarZza.toString()));
            }
            zzghoVar = com.google.android.gms.internal.ads.zzgho.zzf;
        }
        com.google.android.gms.internal.ads.zzghn zzghnVar = new com.google.android.gms.internal.ads.zzghn(null);
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            zzghpVar = com.google.android.gms.internal.ads.zzghp.zza;
        } else {
            if (iOrdinal != 3) {
                throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtpVar.zza());
            }
            zzghpVar = com.google.android.gms.internal.ads.zzghp.zzb;
        }
        zzghnVar.zzd(zzghpVar);
        zzghnVar.zzc(zzgtoVar.zzg());
        zzghnVar.zza((com.google.android.gms.internal.ads.zzgeu) zzgekVarZza);
        zzghnVar.zzb(zzghoVar);
        return zzghnVar.zze();
    }

    private static com.google.android.gms.internal.ads.zzgto zzg(com.google.android.gms.internal.ads.zzghr zzghrVar) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.zzgsp zzgspVarZzf = com.google.android.gms.internal.ads.zzgsp.zzf(com.google.android.gms.internal.ads.zzgeq.zzb(zzghrVar.zzb()), com.google.android.gms.internal.ads.zzgxb.zza());
            com.google.android.gms.internal.ads.zzgtm zzgtmVarZzb = com.google.android.gms.internal.ads.zzgto.zzb();
            zzgtmVarZzb.zzb(zzghrVar.zzd());
            zzgtmVarZzb.zza(zzgspVarZzf);
            return (com.google.android.gms.internal.ads.zzgto) zzgtmVarZzb.zzbr();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static com.google.android.gms.internal.ads.zzgtp zzh(com.google.android.gms.internal.ads.zzghp zzghpVar) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.zzghp.zza.equals(zzghpVar)) {
            return com.google.android.gms.internal.ads.zzgtp.TINK;
        }
        if (com.google.android.gms.internal.ads.zzghp.zzb.equals(zzghpVar)) {
            return com.google.android.gms.internal.ads.zzgtp.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzghpVar))));
    }
}
