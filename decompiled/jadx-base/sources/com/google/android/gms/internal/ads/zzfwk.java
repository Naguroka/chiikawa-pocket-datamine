package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwk {
    static int zza(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    static void zzb(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
