package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleSignatureVerifier {

    @javax.annotation.Nullable
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;

    @javax.annotation.Nullable
    private static volatile java.util.Set zzb;

    @javax.annotation.Nullable
    private static volatile java.util.Set zzc;
    private final android.content.Context zzd;
    private volatile java.lang.String zze;

    public GoogleSignatureVerifier(android.content.Context context) {
        this.zzd = context.getApplicationContext();
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        synchronized (com.google.android.gms.common.GoogleSignatureVerifier.class) {
            if (zza == null) {
                com.google.android.gms.common.zzq.zzd(context);
                zza = new com.google.android.gms.common.GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    static final boolean zza(android.content.pm.PackageInfo packageInfo, boolean z) {
        com.google.android.gms.internal.common.zzal zzalVarZzm;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo == null) {
            return false;
        }
        try {
            com.google.android.gms.internal.common.zzal zzalVar = z ? com.google.android.gms.common.zzp.zzc : com.google.android.gms.common.zzp.zzb;
            int i = com.google.android.gms.common.util.AndroidUtilsLight.zza;
            if (android.os.Build.VERSION.SDK_INT < 28) {
                byte[] byteArray = null;
                if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                    byteArray = packageInfo.signatures[0].toByteArray();
                }
                zzalVarZzm = byteArray != null ? com.google.android.gms.internal.common.zzal.zzn(byteArray) : com.google.android.gms.internal.common.zzal.zzm();
            } else {
                com.google.android.gms.internal.common.zzv.zzd(android.os.Build.VERSION.SDK_INT >= 28);
                android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    zzalVarZzm = com.google.android.gms.internal.common.zzal.zzm();
                } else {
                    int i2 = com.google.android.gms.internal.common.zzal.zzd;
                    com.google.android.gms.internal.common.zzah zzahVar = new com.google.android.gms.internal.common.zzah();
                    for (android.content.pm.Signature signature : signingInfo.getSigningCertificateHistory()) {
                        zzahVar.zzb(signature.toByteArray());
                    }
                    zzalVarZzm = zzahVar.zzd();
                }
            }
            if (zzalVarZzm.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Unable to obtain package certificate history.");
            }
            com.google.android.gms.internal.common.zzal zzalVarZzh = zzalVarZzm.zzh();
            int size = zzalVarZzh.size();
            int i3 = 0;
            while (i3 < size) {
                byte[] bArr = (byte[]) zzalVarZzh.get(i3);
                com.google.android.gms.internal.common.zzap zzapVarListIterator = zzalVar.listIterator(0);
                do {
                    int i4 = i3 + 1;
                    if (!zzapVarListIterator.hasNext()) {
                        i3 = i4;
                    }
                } while (!java.util.Arrays.equals(bArr, (byte[]) zzapVarListIterator.next()));
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z ? zzb(packageInfo, com.google.android.gms.common.zzp.zza) : zzb(packageInfo, com.google.android.gms.common.zzp.zza[0])) != null;
        }
    }

    @javax.annotation.Nullable
    private static com.google.android.gms.common.zzm zzb(android.content.pm.PackageInfo packageInfo, com.google.android.gms.common.zzm... zzmVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            com.google.android.gms.common.zzn zznVar = new com.google.android.gms.common.zzn(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzmVarArr.length; i++) {
                if (zzmVarArr[i].equals(zznVar)) {
                    return zzmVarArr[i];
                }
            }
        }
        return null;
    }

    private final com.google.android.gms.common.zzad zzc(@javax.annotation.Nullable java.lang.String str, boolean z, boolean z2) {
        com.google.android.gms.common.zzad zzadVarZzc;
        if (str == null) {
            return com.google.android.gms.common.zzad.zzc("null pkg");
        }
        if (str.equals(this.zze)) {
            return com.google.android.gms.common.zzad.zzb();
        }
        if (com.google.android.gms.common.zzq.zzf()) {
            com.google.android.gms.common.zzy zzyVar = new com.google.android.gms.common.zzy(null);
            zzyVar.zzc(str);
            zzyVar.zza(com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd));
            zzyVar.zzb(true);
            zzadVarZzc = com.google.android.gms.common.zzq.zzb(zzyVar.zzd());
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = this.zzd.getPackageManager().getPackageInfo(str, android.os.Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                boolean zHonorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                if (packageInfo == null) {
                    zzadVarZzc = com.google.android.gms.common.zzad.zzc("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    zzadVarZzc = com.google.android.gms.common.zzad.zzc("single cert required");
                } else {
                    com.google.android.gms.common.zzn zznVar = new com.google.android.gms.common.zzn(packageInfo.signatures[0].toByteArray());
                    java.lang.String str2 = packageInfo.packageName;
                    com.google.android.gms.common.zzad zzadVarZza = com.google.android.gms.common.zzq.zza(str2, zznVar, zHonorsDebugCertificates, false);
                    zzadVarZzc = (!zzadVarZza.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzq.zza(str2, zznVar, false, true).zza) ? zzadVarZza : com.google.android.gms.common.zzad.zzc("debuggable release cert app rejected");
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                return com.google.android.gms.common.zzad.zzd("no pkg ".concat(str), e);
            }
        }
        if (zzadVarZzc.zza) {
            this.zze = str;
        }
        return zzadVarZzc;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd)) {
                return true;
            }
            android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(@javax.annotation.Nullable java.lang.String str) {
        com.google.android.gms.common.zzad zzadVarZzc = zzc(str, false, false);
        zzadVarZzc.zze();
        return zzadVarZzc.zza;
    }

    public boolean isUidGoogleSigned(int i) {
        com.google.android.gms.common.zzad zzadVarZzc;
        java.lang.String[] packagesForUid = this.zzd.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            zzadVarZzc = com.google.android.gms.common.zzad.zzc("no pkgs");
        } else {
            zzadVarZzc = null;
            for (java.lang.String str : packagesForUid) {
                zzadVarZzc = zzc(str, false, false);
                if (!zzadVarZzc.zza) {
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzadVarZzc);
        }
        zzadVarZzc.zze();
        return zzadVarZzc.zza;
    }
}
