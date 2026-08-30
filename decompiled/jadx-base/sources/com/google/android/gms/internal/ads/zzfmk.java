package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmk {
    public static void zza() {
        if (!com.google.android.gms.internal.ads.zzfkn.zzb()) {
            throw new java.lang.IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void zzb(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static void zzc(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void zzd(java.lang.String str, int i, java.lang.String str2) {
        if (str.length() > 256) {
            throw new java.lang.IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
