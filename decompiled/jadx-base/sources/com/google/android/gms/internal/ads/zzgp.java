package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzgp extends com.google.android.gms.internal.ads.zzfz {
    public final int zzb;

    public zzgp(com.google.android.gms.internal.ads.zzgd zzgdVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static com.google.android.gms.internal.ads.zzgp zza(java.io.IOException iOException, com.google.android.gms.internal.ads.zzgd zzgdVar, int i) {
        int i2;
        java.lang.String message = iOException.getMessage();
        if (iOException instanceof java.net.SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof java.io.InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !com.google.android.gms.internal.ads.zzftt.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new com.google.android.gms.internal.ads.zzgo(iOException, zzgdVar) : new com.google.android.gms.internal.ads.zzgp(iOException, zzgdVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public zzgp(java.io.IOException iOException, com.google.android.gms.internal.ads.zzgd zzgdVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(java.lang.String str, com.google.android.gms.internal.ads.zzgd zzgdVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(java.lang.String str, java.io.IOException iOException, com.google.android.gms.internal.ads.zzgd zzgdVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
