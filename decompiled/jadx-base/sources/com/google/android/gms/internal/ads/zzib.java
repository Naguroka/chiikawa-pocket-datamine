package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzib extends com.google.android.gms.internal.ads.zzbd {
    public final int zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final com.google.android.gms.internal.ads.zzab zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzug zzh;
    final boolean zzi;

    static {
        java.lang.Integer.toString(1001, 36);
        java.lang.Integer.toString(1002, 36);
        java.lang.Integer.toString(1003, 36);
        java.lang.Integer.toString(1004, 36);
        java.lang.Integer.toString(1005, 36);
        java.lang.Integer.toString(1006, 36);
    }

    private zzib(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static com.google.android.gms.internal.ads.zzib zzb(java.lang.Throwable th, java.lang.String str, int i, com.google.android.gms.internal.ads.zzab zzabVar, int i2, boolean z, int i3) {
        return new com.google.android.gms.internal.ads.zzib(1, th, null, i3, str, i, zzabVar, zzabVar == null ? 4 : i2, z);
    }

    public static com.google.android.gms.internal.ads.zzib zzc(java.io.IOException iOException, int i) {
        return new com.google.android.gms.internal.ads.zzib(0, iOException, i);
    }

    public static com.google.android.gms.internal.ads.zzib zzd(java.lang.RuntimeException runtimeException, int i) {
        return new com.google.android.gms.internal.ads.zzib(2, runtimeException, i);
    }

    final com.google.android.gms.internal.ads.zzib zza(com.google.android.gms.internal.ads.zzug zzugVar) {
        java.lang.String message = getMessage();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return new com.google.android.gms.internal.ads.zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzugVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzib(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, com.google.android.gms.internal.ads.zzab zzabVar, int i4, boolean z) {
        java.lang.String str3;
        java.lang.String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(zzabVar);
            int i5 = com.google.android.gms.internal.ads.zzei.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i3 + ", format=" + strValueOf + ", format_supported=" + str4;
        }
        this(android.text.TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i2, i, str2, i3, zzabVar, i4, null, android.os.SystemClock.elapsedRealtime(), z);
    }

    private zzib(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, com.google.android.gms.internal.ads.zzab zzabVar, int i4, com.google.android.gms.internal.ads.zzug zzugVar, long j, boolean z) {
        int i5;
        boolean z2;
        super(str, th, i, android.os.Bundle.EMPTY, j);
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z2);
        com.google.android.gms.internal.ads.zzcw.zzd(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzabVar;
        this.zzg = i4;
        this.zzh = zzugVar;
        this.zzi = z;
    }
}
