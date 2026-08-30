package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfoy {
    public static java.io.File zza(java.io.File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static java.io.File zzb(java.lang.String str, java.lang.String str2, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return new java.io.File(zzc(str, file), str2);
    }

    public static java.io.File zzc(java.lang.String str, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(java.io.File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                java.io.File file2 = fileArrListFiles[i];
                z = file2 != null && zzd(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static boolean zze(java.io.File file, byte[] bArr) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (java.io.IOException unused) {
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
