package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfwm {
    static boolean zza(java.util.Collection collection, @javax.annotation.CheckForNull java.lang.Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }
}
