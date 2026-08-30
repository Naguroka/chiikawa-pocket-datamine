package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzx {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhah zzb;

    static {
        int i = com.google.android.gms.internal.ads.zzgzm.zza;
        zzb = new com.google.android.gms.internal.ads.zzhaj();
    }

    public static void zzA(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzu(i, list, z);
    }

    public static void zzB(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.ads.zzgwx) zzhawVar).zzv(i, list.get(i2), zzgzvVar);
        }
    }

    public static void zzC(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzy(i, list, z);
    }

    public static void zzD(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzA(i, list, z);
    }

    public static void zzE(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzC(i, list, z);
    }

    public static void zzF(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzE(i, list, z);
    }

    public static void zzG(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzH(i, list);
    }

    public static void zzH(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzJ(i, list, z);
    }

    public static void zzI(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzL(i, list, z);
    }

    static boolean zzJ(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(java.util.List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzb(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.ads.zzgww.zzD(i << 3) + 4);
    }

    static int zzc(java.util.List list) {
        return list.size() * 4;
    }

    static int zzd(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.ads.zzgww.zzD(i << 3) + 8);
    }

    static int zze(java.util.List list) {
        return list.size() * 8;
    }

    static int zzf(java.util.List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzg(java.util.List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(zzgyrVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzh(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        int i2 = i << 3;
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgyn)) {
            return com.google.android.gms.internal.ads.zzgww.zzD(i2) + com.google.android.gms.internal.ads.zzgww.zzA((com.google.android.gms.internal.ads.zzgzc) obj, zzgzvVar);
        }
        int iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i2);
        int iZza = ((com.google.android.gms.internal.ads.zzgyn) obj).zza();
        return iZzD + com.google.android.gms.internal.ads.zzgww.zzD(iZza) + iZza;
    }

    static int zzi(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            iZzD = 0;
            while (i < size) {
                int iZzd = zzgxsVar.zzd(i);
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzD;
    }

    static int zzj(java.util.List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            iZzE = 0;
            while (i < size) {
                long jZza = zzgyrVar.zza(i);
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                long jLongValue = ((java.lang.Long) list.get(i)).longValue();
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzE;
    }

    static int zzk(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgxs) {
            com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzl(java.util.List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzgyr) {
            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(zzgyrVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static com.google.android.gms.internal.ads.zzhah zzm() {
        return zzb;
    }

    static java.lang.Object zzn(java.lang.Object obj, int i, java.util.List list, com.google.android.gms.internal.ads.zzgxx zzgxxVar, java.lang.Object obj2, com.google.android.gms.internal.ads.zzhah zzhahVar) {
        if (zzgxxVar == null) {
            return obj2;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
                if (zzgxxVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzhahVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                if (!zzgxxVar.zza(iIntValue2)) {
                    obj2 = zzo(obj, i, iIntValue2, obj2, zzhahVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static java.lang.Object zzo(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.ads.zzhah zzhahVar) {
        if (obj2 == null) {
            obj2 = zzhahVar.zza(obj);
        }
        zzhahVar.zzh(obj2, i, i2);
        return obj2;
    }

    static void zzp(com.google.android.gms.internal.ads.zzgxc zzgxcVar, java.lang.Object obj, java.lang.Object obj2) {
        if (((com.google.android.gms.internal.ads.zzgxn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzq(com.google.android.gms.internal.ads.zzhah zzhahVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzgxr zzgxrVar = (com.google.android.gms.internal.ads.zzgxr) obj;
        com.google.android.gms.internal.ads.zzhai zzhaiVarZze = zzgxrVar.zzt;
        com.google.android.gms.internal.ads.zzhai zzhaiVar = ((com.google.android.gms.internal.ads.zzgxr) obj2).zzt;
        if (!com.google.android.gms.internal.ads.zzhai.zzc().equals(zzhaiVar)) {
            if (com.google.android.gms.internal.ads.zzhai.zzc().equals(zzhaiVarZze)) {
                zzhaiVarZze = com.google.android.gms.internal.ads.zzhai.zze(zzhaiVarZze, zzhaiVar);
            } else {
                zzhaiVarZze.zzd(zzhaiVar);
            }
        }
        zzgxrVar.zzt = zzhaiVarZze;
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzc(i, list, z);
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zze(i, list);
    }

    public static void zzt(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzg(i, list, z);
    }

    public static void zzu(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzj(i, list, z);
    }

    public static void zzv(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzl(i, list, z);
    }

    public static void zzw(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzn(i, list, z);
    }

    public static void zzx(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzp(i, list, z);
    }

    public static void zzy(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.ads.zzgwx) zzhawVar).zzq(i, list.get(i2), zzgzvVar);
        }
    }

    public static void zzz(int i, java.util.List list, com.google.android.gms.internal.ads.zzhaw zzhawVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzs(i, list, z);
    }
}
