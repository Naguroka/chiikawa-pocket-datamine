package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfxt {
    public static java.lang.Object zza(java.lang.Iterable iterable, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfzt it = ((com.google.android.gms.internal.ads.zzfzj) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean zzb(java.lang.Iterable iterable, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        if ((iterable instanceof java.util.RandomAccess) && (iterable instanceof java.util.List)) {
            zzfuoVar.getClass();
            return zzd((java.util.List) iterable, zzfuoVar);
        }
        java.util.Iterator it = iterable.iterator();
        zzfuoVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfuoVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(java.util.List list, com.google.android.gms.internal.ads.zzfuo zzfuoVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfuoVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean zzd(java.util.List list, com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            java.lang.Object obj = list.get(i);
            if (!zzfuoVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        zzc(list, zzfuoVar, i2, i);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        zzc(list, zzfuoVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
