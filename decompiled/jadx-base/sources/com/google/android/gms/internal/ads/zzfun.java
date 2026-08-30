package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfun {
    public static int zza(int i, int i2, java.lang.String str) {
        java.lang.String strZzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZzb = com.google.android.gms.internal.ads.zzfve.zzb("%s (%s) must not be negative", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i2);
            }
            strZzb = com.google.android.gms.internal.ads.zzfve.zzb("%s (%s) must be less than size (%s)", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzn(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static java.lang.Object zzc(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public static java.lang.Object zzd(@javax.annotation.CheckForNull java.lang.Object obj, java.lang.String str, @javax.annotation.CheckForNull java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(com.google.android.gms.internal.ads.zzfve.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void zzg(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzfve.zzb(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void zzh(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzfve.zzb(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void zzi(boolean z, java.lang.String str, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzfve.zzb(str, obj));
        }
    }

    public static void zzj(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzfve.zzb(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void zzk(int i, int i2, int i3) {
        java.lang.String strZzn;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzn = zzn(i, i3, "start index");
            } else {
                strZzn = (i2 < 0 || i2 > i3) ? zzn(i2, i3, "end index") : com.google.android.gms.internal.ads.zzfve.zzb("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(strZzn);
        }
    }

    public static void zzl(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void zzm(boolean z, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    private static java.lang.String zzn(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.ads.zzfve.zzb("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.ads.zzfve.zzb("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }
}
