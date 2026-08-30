package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfyk {
    static boolean zzb(java.util.Map map, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @javax.annotation.CheckForNull
    static java.lang.Object zza(java.util.Map map, @javax.annotation.CheckForNull java.lang.Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }
}
