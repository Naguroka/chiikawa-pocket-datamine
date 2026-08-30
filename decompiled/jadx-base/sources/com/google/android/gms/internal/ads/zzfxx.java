package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfxx {
    @javax.annotation.CheckForNull
    static java.lang.Object zza(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(java.util.Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(java.util.Collection collection, java.util.Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
