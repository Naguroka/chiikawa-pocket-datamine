package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfzp {
    static int zza(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static com.google.android.gms.internal.ads.zzfzn zzb(java.util.Set set, java.util.Set set2) {
        com.google.android.gms.internal.ads.zzfun.zzc(set, "set1");
        com.google.android.gms.internal.ads.zzfun.zzc(set2, "set2");
        return new com.google.android.gms.internal.ads.zzfzj(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Set zzc(java.util.Set set, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof com.google.android.gms.internal.ads.zzfzk)) {
                set.getClass();
                return new com.google.android.gms.internal.ads.zzfzk(set, zzfuoVar);
            }
            com.google.android.gms.internal.ads.zzfzk zzfzkVar = (com.google.android.gms.internal.ads.zzfzk) set;
            return new com.google.android.gms.internal.ads.zzfzk((java.util.Set) zzfzkVar.zza, com.google.android.gms.internal.ads.zzfur.zza(zzfzkVar.zzb, zzfuoVar));
        }
        java.util.SortedSet sortedSet = (java.util.SortedSet) set;
        if (!(sortedSet instanceof com.google.android.gms.internal.ads.zzfzk)) {
            sortedSet.getClass();
            return new com.google.android.gms.internal.ads.zzfzl(sortedSet, zzfuoVar);
        }
        com.google.android.gms.internal.ads.zzfzk zzfzkVar2 = (com.google.android.gms.internal.ads.zzfzk) sortedSet;
        return new com.google.android.gms.internal.ads.zzfzl((java.util.SortedSet) zzfzkVar2.zza, com.google.android.gms.internal.ads.zzfur.zza(zzfzkVar2.zzb, zzfuoVar));
    }

    static boolean zzd(java.util.Set set, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zzf(java.util.Set set, java.util.Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zze(java.util.Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof com.google.android.gms.internal.ads.zzfyv) {
            collection = ((com.google.android.gms.internal.ads.zzfyv) collection).zza();
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        java.util.Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
