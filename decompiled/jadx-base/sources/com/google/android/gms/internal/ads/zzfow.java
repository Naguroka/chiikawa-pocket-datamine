package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfow {
    private final com.google.android.gms.internal.ads.zzaxz zza;
    private final java.io.File zzb;
    private final java.io.File zzc;
    private final java.io.File zzd;
    private byte[] zze;

    public zzfow(com.google.android.gms.internal.ads.zzaxz zzaxzVar, java.io.File file, java.io.File file2, java.io.File file3) {
        this.zza = zzaxzVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final com.google.android.gms.internal.ads.zzaxz zza() {
        return this.zza;
    }

    public final java.io.File zzb() {
        return this.zzc;
    }

    public final java.io.File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j) {
        return this.zza.zzb() - (java.lang.System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] zze() throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        byte[] bArrZzA;
        java.io.FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new java.io.FileInputStream(this.zzd);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i = 0;
                        while (i < iMin) {
                            int i2 = fileInputStream.read(bArr, i, iMin - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                        }
                        com.google.android.gms.internal.ads.zzgwj zzgwjVarZzv = i == 0 ? null : com.google.android.gms.internal.ads.zzgwj.zzv(bArr, 0, i);
                        if (zzgwjVarZzv == null) {
                            break;
                        }
                        arrayList.add(zzgwjVarZzv);
                        iMin = java.lang.Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = com.google.android.gms.internal.ads.zzgwj.zzu(arrayList).zzA();
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream);
                } catch (java.io.IOException unused) {
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
                fileInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return java.util.Arrays.copyOf(bArr2, bArr2.length);
    }
}
