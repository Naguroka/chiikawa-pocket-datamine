package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacr {
    public static int zza(com.google.android.gms.internal.ads.zzaco zzacoVar, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iZzb = zzacoVar.zzb(bArr, i + i3, i2 - i3);
            if (iZzb == -1) {
                break;
            }
            i3 += iZzb;
        }
        return i3;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzb(boolean z, java.lang.String str) throws com.google.android.gms.internal.ads.zzbc {
        if (!z) {
            throw com.google.android.gms.internal.ads.zzbc.zza(str, null);
        }
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzaco zzacoVar, byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        try {
            return zzacoVar.zzm(bArr, 0, i2, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzaco zzacoVar, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            zzacoVar.zzi(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean zze(com.google.android.gms.internal.ads.zzaco zzacoVar, int i) throws java.io.IOException {
        try {
            zzacoVar.zzk(i);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }
}
