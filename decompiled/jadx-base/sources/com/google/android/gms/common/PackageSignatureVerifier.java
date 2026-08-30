package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzai zza;
    private static com.google.android.gms.common.zzaj zzb;

    private static com.google.android.gms.common.zzaj zza(android.content.Context context) {
        com.google.android.gms.common.zzaj zzajVar;
        synchronized (com.google.android.gms.common.PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.common.zzaj(context);
            }
            zzajVar = zzb;
        }
        return zzajVar;
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context context, java.lang.String str) {
        boolean zHonorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!com.google.android.gms.common.zzq.zze()) {
            throw new com.google.android.gms.common.zzak();
        }
        java.lang.String strConcat = java.lang.String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        com.google.android.gms.common.zzy zzyVar = new com.google.android.gms.common.zzy(null);
        zzyVar.zzc(str);
        zzyVar.zza(zHonorsDebugCertificates);
        zzyVar.zzb(false);
        com.google.android.gms.common.zzad zzadVarZzb = com.google.android.gms.common.zzq.zzb(zzyVar.zzd());
        if (zzadVarZzb.zza) {
            zza = new com.google.android.gms.common.zzai(strConcat, com.google.android.gms.common.PackageVerificationResult.zzd(str, zzadVarZzb.zze));
            return zza.zzb;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzadVarZzb.zzb);
        return com.google.android.gms.common.PackageVerificationResult.zza(str, zzadVarZzb.zzb, zzadVarZzb.zzc);
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.common.PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.common.PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                return packageVerificationResultQueryPackageSignatureVerified2;
            }
            android.util.Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
