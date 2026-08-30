package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzam {
    static java.lang.Object[] zza(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new java.lang.NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}
