package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfyx {
    static java.lang.Object zza(@javax.annotation.CheckForNull java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index " + i);
    }

    static java.lang.Object[] zzb(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
