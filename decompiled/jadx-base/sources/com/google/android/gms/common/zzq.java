package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq {
    private static volatile com.google.android.gms.common.internal.zzaf zzg;
    private static android.content.Context zzi;
    static final com.google.android.gms.common.zzo zza = new com.google.android.gms.common.zzg(com.google.android.gms.common.zzm.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final com.google.android.gms.common.zzo zzb = new com.google.android.gms.common.zzh(com.google.android.gms.common.zzm.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final com.google.android.gms.common.zzo zzc = new com.google.android.gms.common.zzi(com.google.android.gms.common.zzm.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final com.google.android.gms.common.zzo zzd = new com.google.android.gms.common.zzj(com.google.android.gms.common.zzm.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final com.google.android.gms.common.zzo zze = new com.google.android.gms.common.zzk(com.google.android.gms.common.zzm.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final com.google.android.gms.common.zzo zzf = new com.google.android.gms.common.zzl(com.google.android.gms.common.zzm.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final java.lang.Object zzh = new java.lang.Object();

    @java.lang.Deprecated
    static com.google.android.gms.common.zzad zza(java.lang.String str, com.google.android.gms.common.zzm zzmVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzmVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static com.google.android.gms.common.zzad zzb(com.google.android.gms.common.zzaa zzaaVar) {
        com.google.android.gms.common.zzad zzadVarZzd;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzi);
            try {
                zzi();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzi);
                com.google.android.gms.common.zzs zzsVarZza = zzaaVar.zza(zzi);
                try {
                    zzadVarZzd = zzg(zzaaVar.zzb() ? zzg.zze(zzsVarZza) : zzg.zzf(zzsVarZza));
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    zzadVarZzd = com.google.android.gms.common.zzad.zzd("module call", e);
                }
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                zzadVarZzd = com.google.android.gms.common.zzad.zzd("module init: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
            }
            return zzadVarZzd;
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static /* synthetic */ java.lang.String zzc(boolean z, java.lang.String str, com.google.android.gms.common.zzm zzmVar) throws java.lang.Exception {
        java.lang.String str2 = true != (!z && zzh(str, zzmVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest messageDigestZza = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA-256");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageDigestZza);
        return java.lang.String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.Hex.bytesToStringLowercase(messageDigestZza.digest(zzmVar.zzf())), java.lang.Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void zzd(android.content.Context context) {
        if (zzi != null) {
            android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            zzi = context.getApplicationContext();
        }
    }

    static boolean zze() {
        boolean zZzg;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                zzi();
                zZzg = zzg.zzg();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            zZzg = false;
        }
        return zZzg;
    }

    static boolean zzf() {
        boolean zZzi;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                zzi();
                zZzi = zzg.zzi();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            zZzi = false;
        }
        return zZzi;
    }

    private static com.google.android.gms.common.zzad zzg(com.google.android.gms.common.zzu zzuVar) {
        if (zzuVar.zzd()) {
            com.google.android.gms.common.zzu zzuVarZzb = zzuVar.zzb();
            return com.google.android.gms.common.zzad.zzf(zzuVar.zze(), zzuVar.zza(), zzuVarZzb != null ? zzg(zzuVarZzb) : null);
        }
        java.lang.String strZzc = zzuVar.zzc();
        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = zzuVar.zzf() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
        if (strZzc == null) {
            strZzc = "error checking package certificate";
        }
        return com.google.android.gms.common.zzad.zzg(zzuVar.zze(), zzuVar.zzf(), strZzc, nameNotFoundException);
    }

    @java.lang.Deprecated
    private static com.google.android.gms.common.zzad zzh(final java.lang.String str, final com.google.android.gms.common.zzm zzmVar, final boolean z, boolean z2) {
        try {
            zzi();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzi);
            try {
                return zzg.zzh(new com.google.android.gms.common.zzw(str, zzmVar, z, z2), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzi.getPackageManager())) ? com.google.android.gms.common.zzad.zzb() : new com.google.android.gms.common.zzab(new java.util.concurrent.Callable() { // from class: com.google.android.gms.common.zzf
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.google.android.gms.common.zzq.zzc(z, str, zzmVar);
                    }
                }, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return com.google.android.gms.common.zzad.zzd("module call", e);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return com.google.android.gms.common.zzad.zzd("module init: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
        }
    }

    private static void zzi() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        if (zzg != null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzi);
        synchronized (zzh) {
            if (zzg == null) {
                zzg = com.google.android.gms.common.internal.zzae.zzb(com.google.android.gms.dynamite.DynamiteModule.load(zzi, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
