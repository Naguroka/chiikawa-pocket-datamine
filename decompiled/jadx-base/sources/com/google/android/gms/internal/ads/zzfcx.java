package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcx {
    public static android.os.Bundle zza(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new android.os.Bundle() : bundle2;
    }

    public static void zzb(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzc(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzd(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new java.util.ArrayList<>(list));
        }
    }

    public static void zze(android.os.Bundle bundle, java.lang.String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    public static void zzf(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzg(android.os.Bundle bundle, java.lang.String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
