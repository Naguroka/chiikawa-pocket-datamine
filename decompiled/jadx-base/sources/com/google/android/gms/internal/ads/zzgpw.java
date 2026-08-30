package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgpw {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgvo zzb;
    private static final com.google.android.gms.internal.ads.zzgkx zzc;
    private static final com.google.android.gms.internal.ads.zzgkx zzd;
    private static final com.google.android.gms.internal.ads.zzgmt zze;
    private static final com.google.android.gms.internal.ads.zzgmp zzf;
    private static final com.google.android.gms.internal.ads.zzglh zzg;
    private static final com.google.android.gms.internal.ads.zzgld zzh;

    static {
        com.google.android.gms.internal.ads.zzgvo zzgvoVarZzb = com.google.android.gms.internal.ads.zzgnu.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgvoVarZzb;
        com.google.android.gms.internal.ads.zzgkv zzgkvVarZza = com.google.android.gms.internal.ads.zzgkx.zza();
        zzgkvVarZza.zza(com.google.android.gms.internal.ads.zzgtp.RAW, com.google.android.gms.internal.ads.zzgou.zzd);
        zzgkvVarZza.zza(com.google.android.gms.internal.ads.zzgtp.TINK, com.google.android.gms.internal.ads.zzgou.zza);
        zzgkvVarZza.zza(com.google.android.gms.internal.ads.zzgtp.LEGACY, com.google.android.gms.internal.ads.zzgou.zzc);
        zzgkvVarZza.zza(com.google.android.gms.internal.ads.zzgtp.CRUNCHY, com.google.android.gms.internal.ads.zzgou.zzb);
        zzc = zzgkvVarZza.zzb();
        com.google.android.gms.internal.ads.zzgkv zzgkvVarZza2 = com.google.android.gms.internal.ads.zzgkx.zza();
        zzgkvVarZza2.zza(com.google.android.gms.internal.ads.zzgry.SHA1, com.google.android.gms.internal.ads.zzgot.zza);
        zzgkvVarZza2.zza(com.google.android.gms.internal.ads.zzgry.SHA224, com.google.android.gms.internal.ads.zzgot.zzb);
        zzgkvVarZza2.zza(com.google.android.gms.internal.ads.zzgry.SHA256, com.google.android.gms.internal.ads.zzgot.zzc);
        zzgkvVarZza2.zza(com.google.android.gms.internal.ads.zzgry.SHA384, com.google.android.gms.internal.ads.zzgot.zzd);
        zzgkvVarZza2.zza(com.google.android.gms.internal.ads.zzgry.SHA512, com.google.android.gms.internal.ads.zzgot.zze);
        zzd = zzgkvVarZza2.zzb();
        zze = com.google.android.gms.internal.ads.zzgmt.zzb(new com.google.android.gms.internal.ads.zzgmr() { // from class: com.google.android.gms.internal.ads.zzgps
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgek zzgekVar) {
                return com.google.android.gms.internal.ads.zzgpw.zzb((com.google.android.gms.internal.ads.zzgow) zzgekVar);
            }
        }, com.google.android.gms.internal.ads.zzgow.class, com.google.android.gms.internal.ads.zzgni.class);
        zzf = com.google.android.gms.internal.ads.zzgmp.zzb(new com.google.android.gms.internal.ads.zzgmn() { // from class: com.google.android.gms.internal.ads.zzgpt
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final com.google.android.gms.internal.ads.zzgek zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
                return com.google.android.gms.internal.ads.zzgpw.zzd((com.google.android.gms.internal.ads.zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgni.class);
        zzg = com.google.android.gms.internal.ads.zzglh.zzb(new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgpu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgpw.zza((com.google.android.gms.internal.ads.zzgom) zzgdxVar, zzgeoVar);
            }
        }, com.google.android.gms.internal.ads.zzgom.class, com.google.android.gms.internal.ads.zzgnh.class);
        zzh = com.google.android.gms.internal.ads.zzgld.zzb(new com.google.android.gms.internal.ads.zzglb() { // from class: com.google.android.gms.internal.ads.zzgpv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                return com.google.android.gms.internal.ads.zzgpw.zzc((com.google.android.gms.internal.ads.zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, com.google.android.gms.internal.ads.zzgnh.class);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnh zza(com.google.android.gms.internal.ads.zzgom zzgomVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
        com.google.android.gms.internal.ads.zzgrz zzgrzVarZzb = com.google.android.gms.internal.ads.zzgsb.zzb();
        zzgrzVarZzb.zzb(zzf(zzgomVar.zzb()));
        byte[] bArrZzd = zzgomVar.zzd().zzd(zzgeoVar);
        zzgrzVarZzb.zza(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return com.google.android.gms.internal.ads.zzgnh.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((com.google.android.gms.internal.ads.zzgsb) zzgrzVarZzb.zzbr()).zzaN(), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, (com.google.android.gms.internal.ads.zzgtp) zzc.zzb(zzgomVar.zzb().zzg()), zzgomVar.zze());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgni zzb(com.google.android.gms.internal.ads.zzgow zzgowVar) {
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZza = com.google.android.gms.internal.ads.zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        com.google.android.gms.internal.ads.zzgsc zzgscVarZzc = com.google.android.gms.internal.ads.zzgse.zzc();
        zzgscVarZzc.zzb(zzf(zzgowVar));
        zzgscVarZzc.zza(zzgowVar.zzc());
        zzgsnVarZza.zzc(((com.google.android.gms.internal.ads.zzgse) zzgscVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza((com.google.android.gms.internal.ads.zzgtp) zzc.zzb(zzgowVar.zzg()));
        return com.google.android.gms.internal.ads.zzgni.zzb((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZza.zzbr());
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgom zzc(com.google.android.gms.internal.ads.zzgnh zzgnhVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            com.google.android.gms.internal.ads.zzgsb zzgsbVarZzf = com.google.android.gms.internal.ads.zzgsb.zzf(zzgnhVar.zze(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgsbVarZzf.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.android.gms.internal.ads.zzgos zzgosVarZze = com.google.android.gms.internal.ads.zzgow.zze();
            zzgosVarZze.zzb(zzgsbVarZzf.zzh().zzd());
            zzgosVarZze.zzc(zzgsbVarZzf.zzg().zza());
            zzgosVarZze.zza((com.google.android.gms.internal.ads.zzgot) zzd.zzc(zzgsbVarZzf.zzg().zzb()));
            zzgosVarZze.zzd((com.google.android.gms.internal.ads.zzgou) zzc.zzc(zzgnhVar.zzc()));
            com.google.android.gms.internal.ads.zzgow zzgowVarZze = zzgosVarZze.zze();
            com.google.android.gms.internal.ads.zzgok zzgokVarZza = com.google.android.gms.internal.ads.zzgom.zza();
            zzgokVarZza.zzc(zzgowVarZze);
            zzgokVarZza.zzb(com.google.android.gms.internal.ads.zzgvp.zzb(zzgsbVarZzf.zzh().zzA(), zzgeoVar));
            zzgokVarZza.zza(zzgnhVar.zzf());
            return zzgokVarZza.zzd();
        } catch (com.google.android.gms.internal.ads.zzgyg | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgow zzd(com.google.android.gms.internal.ads.zzgni zzgniVar) throws java.security.GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            com.google.android.gms.internal.ads.zzgse zzgseVarZzg = com.google.android.gms.internal.ads.zzgse.zzg(zzgniVar.zzc().zzh(), com.google.android.gms.internal.ads.zzgxb.zza());
            if (zzgseVarZzg.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzgseVarZzg.zzb());
            }
            com.google.android.gms.internal.ads.zzgos zzgosVarZze = com.google.android.gms.internal.ads.zzgow.zze();
            zzgosVarZze.zzb(zzgseVarZzg.zza());
            zzgosVarZze.zzc(zzgseVarZzg.zzh().zza());
            zzgosVarZze.zza((com.google.android.gms.internal.ads.zzgot) zzd.zzc(zzgseVarZzg.zzh().zzb()));
            zzgosVarZze.zzd((com.google.android.gms.internal.ads.zzgou) zzc.zzc(zzgniVar.zzc().zzg()));
            return zzgosVarZze.zze();
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(com.google.android.gms.internal.ads.zzgmk zzgmkVar) throws java.security.GeneralSecurityException {
        zzgmkVar.zzi(zze);
        zzgmkVar.zzh(zzf);
        zzgmkVar.zzg(zzg);
        zzgmkVar.zzf(zzh);
    }

    private static com.google.android.gms.internal.ads.zzgsh zzf(com.google.android.gms.internal.ads.zzgow zzgowVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgsf zzgsfVarZzc = com.google.android.gms.internal.ads.zzgsh.zzc();
        zzgsfVarZzc.zzb(zzgowVar.zzb());
        zzgsfVarZzc.zza((com.google.android.gms.internal.ads.zzgry) zzd.zzb(zzgowVar.zzf()));
        return (com.google.android.gms.internal.ads.zzgsh) zzgsfVarZzc.zzbr();
    }
}
