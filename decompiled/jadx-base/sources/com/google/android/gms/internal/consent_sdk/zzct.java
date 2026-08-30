package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzct {
    public static int zza(int i, int i2, java.lang.String str) {
        java.lang.String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = com.google.android.gms.internal.consent_sdk.zzcu.zza("%s (%s) must not be negative", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i2);
            }
            strZza = com.google.android.gms.internal.consent_sdk.zzcu.zza("%s (%s) must be less than size (%s)", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzd(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzc(int i, int i2, int i3) {
        java.lang.String strZzd;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzd = zzd(i, i3, "start index");
            } else {
                strZzd = (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : com.google.android.gms.internal.consent_sdk.zzcu.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(strZzd);
        }
    }

    private static java.lang.String zzd(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.consent_sdk.zzcu.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.consent_sdk.zzcu.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }
}
