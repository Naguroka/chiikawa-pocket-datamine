package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbg {
    public static int zza(int i, int i2, java.lang.String str) {
        java.lang.String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = com.google.android.gms.internal.play_billing.zzbj.zza("%s (%s) must not be negative", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i2);
            }
            strZza = com.google.android.gms.internal.play_billing.zzbj.zza("%s (%s) must be less than size (%s)", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static java.lang.Object zzc(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public static void zzd(int i, int i2, int i3) {
        java.lang.String strZzf;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzf = zzf(i, i3, "start index");
            } else {
                strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : com.google.android.gms.internal.play_billing.zzbj.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    private static java.lang.String zzf(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.play_billing.zzbj.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.play_billing.zzbj.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }
}
