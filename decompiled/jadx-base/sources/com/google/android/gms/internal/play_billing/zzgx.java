package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgx {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.play_billing.zzhh zzb;

    static {
        int i = com.google.android.gms.internal.play_billing.zzgs.zza;
        zzb = new com.google.android.gms.internal.play_billing.zzhj();
    }

    public static void zzA(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i, list, z);
    }

    public static void zzB(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i, list, z);
    }

    public static void zzC(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzJ(i, list, z);
    }

    public static void zzD(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzL(i, list, z);
    }

    static boolean zzE(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzfj) {
            com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(zzfjVar.zze(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzb(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.zzep.zzC(i << 3) + 4);
    }

    static int zzc(java.util.List list) {
        return list.size() * 4;
    }

    static int zzd(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.zzep.zzC(i << 3) + 8);
    }

    static int zze(java.util.List list) {
        return list.size() * 8;
    }

    static int zzf(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzfj) {
            com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(zzfjVar.zze(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzg(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzga) {
            com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(zzgaVar.zze(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzh(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        int i2 = i << 3;
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfw)) {
            return com.google.android.gms.internal.play_billing.zzep.zzC(i2) + com.google.android.gms.internal.play_billing.zzep.zzA((com.google.android.gms.internal.play_billing.zzgl) obj, zzgvVar);
        }
        int iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(i2);
        int iZza = ((com.google.android.gms.internal.play_billing.zzfw) obj).zza();
        return iZzC + com.google.android.gms.internal.play_billing.zzep.zzC(iZza) + iZza;
    }

    static int zzi(java.util.List list) {
        int iZzC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzfj) {
            com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
            iZzC = 0;
            while (i < size) {
                int iZze = zzfjVar.zze(i);
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzC = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzC;
    }

    static int zzj(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzga) {
            com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
            iZzD = 0;
            while (i < size) {
                long jZze = zzgaVar.zze(i);
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD((jZze >> 63) ^ (jZze + jZze));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                long jLongValue = ((java.lang.Long) list.get(i)).longValue();
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzD;
    }

    static int zzk(java.util.List list) {
        int iZzC;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzfj) {
            com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
            iZzC = 0;
            while (i < size) {
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC(zzfjVar.zze(i));
                i++;
            }
        } else {
            iZzC = 0;
            while (i < size) {
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzC;
    }

    static int zzl(java.util.List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzga) {
            com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(zzgaVar.zze(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzD;
    }

    public static com.google.android.gms.internal.play_billing.zzhh zzm() {
        return zzb;
    }

    static java.lang.Object zzn(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.play_billing.zzhh zzhhVar) {
        if (obj2 == null) {
            obj2 = zzhhVar.zza(obj);
        }
        ((com.google.android.gms.internal.play_billing.zzhi) obj2).zzj(i << 3, java.lang.Long.valueOf(i2));
        return obj2;
    }

    static void zzo(com.google.android.gms.internal.play_billing.zzev zzevVar, java.lang.Object obj, java.lang.Object obj2) {
        if (((com.google.android.gms.internal.play_billing.zzff) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(com.google.android.gms.internal.play_billing.zzhh zzhhVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzfi zzfiVar = (com.google.android.gms.internal.play_billing.zzfi) obj;
        com.google.android.gms.internal.play_billing.zzhi zzhiVarZze = zzfiVar.zzc;
        com.google.android.gms.internal.play_billing.zzhi zzhiVar = ((com.google.android.gms.internal.play_billing.zzfi) obj2).zzc;
        if (!com.google.android.gms.internal.play_billing.zzhi.zzc().equals(zzhiVar)) {
            if (com.google.android.gms.internal.play_billing.zzhi.zzc().equals(zzhiVarZze)) {
                zzhiVarZze = com.google.android.gms.internal.play_billing.zzhi.zze(zzhiVarZze, zzhiVar);
            } else {
                zzhiVarZze.zzd(zzhiVar);
            }
        }
        zzfiVar.zzc = zzhiVarZze;
    }

    public static void zzq(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzc(i, list, z);
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzg(i, list, z);
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzj(i, list, z);
    }

    public static void zzt(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzl(i, list, z);
    }

    public static void zzu(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzn(i, list, z);
    }

    public static void zzv(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzp(i, list, z);
    }

    public static void zzw(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzs(i, list, z);
    }

    public static void zzx(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i, list, z);
    }

    public static void zzy(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i, list, z);
    }

    public static void zzz(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i, list, z);
    }
}
