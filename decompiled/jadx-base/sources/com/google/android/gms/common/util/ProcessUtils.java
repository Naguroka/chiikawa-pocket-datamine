package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    @javax.annotation.Nullable
    private static java.lang.Boolean zzc;

    private ProcessUtils() {
    }

    public static boolean zza() {
        java.lang.Boolean boolValueOf = zzc;
        if (boolValueOf == null) {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
                boolValueOf = java.lang.Boolean.valueOf(android.os.Process.isIsolated());
            } else {
                try {
                    java.lang.Object objZza = com.google.android.gms.internal.common.zzl.zza(android.os.Process.class, "isIsolated", new com.google.android.gms.internal.common.zzj[0]);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (objZza == null) {
                        throw new com.google.android.gms.internal.common.zzac(com.google.android.gms.internal.common.zzab.zza("expected a non-null reference", objArr));
                    }
                    boolValueOf = (java.lang.Boolean) objZza;
                } catch (java.lang.ReflectiveOperationException unused) {
                    boolValueOf = false;
                }
            }
            zzc = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static java.lang.String getMyProcessName() throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        if (zza == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                zza = android.app.Application.getProcessName();
            } else {
                int iMyPid = zzb;
                if (iMyPid == 0) {
                    iMyPid = android.os.Process.myPid();
                    zzb = iMyPid;
                }
                java.lang.String strTrim = null;
                strTrim = null;
                strTrim = null;
                java.io.BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        java.lang.String str = "/proc/" + iMyPid + "/cmdline";
                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str));
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                java.lang.String line = bufferedReader.readLine();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(line);
                                java.lang.String str2 = line;
                                strTrim = line.trim();
                            } catch (java.io.IOException unused) {
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (java.io.IOException unused2) {
                        bufferedReader = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader);
                }
                zza = strTrim;
            }
        }
        return zza;
    }
}
