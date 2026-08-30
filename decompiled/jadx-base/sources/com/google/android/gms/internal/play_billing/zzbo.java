package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbo {
    static void zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
