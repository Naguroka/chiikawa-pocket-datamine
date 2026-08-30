package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.measurement.zzoe zzb;

    static {
        int i = com.google.android.gms.internal.measurement.zznp.zza;
        zzb = new com.google.android.gms.internal.measurement.zzog();
    }

    public static void zzA(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzC(i, list, z);
    }

    public static void zzB(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzE(i, list, z);
    }

    public static void zzC(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzJ(i, list, z);
    }

    public static void zzD(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzL(i, list, z);
    }

    static boolean zzE(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(java.util.List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzme) {
            com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(zzmeVar.zze(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    static int zzb(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.measurement.zzlk.zzz(i << 3) + 4);
    }

    static int zzc(java.util.List list) {
        return list.size() * 4;
    }

    static int zzd(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.measurement.zzlk.zzz(i << 3) + 8);
    }

    static int zze(java.util.List list) {
        return list.size() * 8;
    }

    static int zzf(java.util.List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzme) {
            com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(zzmeVar.zze(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    static int zzg(java.util.List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzmw) {
            com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(zzmwVar.zza(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzA;
    }

    static int zzh(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzns zznsVar) {
        int i2 = i << 3;
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzms)) {
            return com.google.android.gms.internal.measurement.zzlk.zzz(i2) + com.google.android.gms.internal.measurement.zzlk.zzx((com.google.android.gms.internal.measurement.zznh) obj, zznsVar);
        }
        int iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i2);
        int iZza = ((com.google.android.gms.internal.measurement.zzms) obj).zza();
        return iZzz + com.google.android.gms.internal.measurement.zzlk.zzz(iZza) + iZza;
    }

    static int zzi(java.util.List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzme) {
            com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
            iZzz = 0;
            while (i < size) {
                int iZze = zzmeVar.zze(i);
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzz;
    }

    static int zzj(java.util.List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzmw) {
            com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
            iZzA = 0;
            while (i < size) {
                long jZza = zzmwVar.zza(i);
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                long jLongValue = ((java.lang.Long) list.get(i)).longValue();
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzA;
    }

    static int zzk(java.util.List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzme) {
            com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
            iZzz = 0;
            while (i < size) {
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz(zzmeVar.zze(i));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzz;
    }

    static int zzl(java.util.List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzmw) {
            com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(zzmwVar.zza(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzA;
    }

    public static com.google.android.gms.internal.measurement.zzoe zzm() {
        return zzb;
    }

    static java.lang.Object zzn(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.measurement.zzoe zzoeVar) {
        com.google.android.gms.internal.measurement.zzmd zzmdVar;
        com.google.android.gms.internal.measurement.zzof zzofVar;
        java.lang.Object obj3 = obj2;
        if (obj2 == null && (zzofVar = (zzmdVar = (com.google.android.gms.internal.measurement.zzmd) obj).zzc) == com.google.android.gms.internal.measurement.zzof.zzc()) {
            obj3 = zzofVar;
            com.google.android.gms.internal.measurement.zzof zzofVarZzf = com.google.android.gms.internal.measurement.zzof.zzf();
            zzmdVar.zzc = zzofVarZzf;
            obj3 = zzofVarZzf;
        }
        obj3 = zzofVar;
        ((com.google.android.gms.internal.measurement.zzof) obj3).zzj(i << 3, java.lang.Long.valueOf(i2));
        return obj3;
    }

    static void zzo(com.google.android.gms.internal.measurement.zzlq zzlqVar, java.lang.Object obj, java.lang.Object obj2) {
        if (((com.google.android.gms.internal.measurement.zzma) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(com.google.android.gms.internal.measurement.zzoe zzoeVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzmd zzmdVar = (com.google.android.gms.internal.measurement.zzmd) obj;
        com.google.android.gms.internal.measurement.zzof zzofVarZze = zzmdVar.zzc;
        com.google.android.gms.internal.measurement.zzof zzofVar = ((com.google.android.gms.internal.measurement.zzmd) obj2).zzc;
        if (!com.google.android.gms.internal.measurement.zzof.zzc().equals(zzofVar)) {
            if (com.google.android.gms.internal.measurement.zzof.zzc().equals(zzofVarZze)) {
                zzofVarZze = com.google.android.gms.internal.measurement.zzof.zze(zzofVarZze, zzofVar);
            } else {
                zzofVarZze.zzd(zzofVar);
            }
        }
        zzmdVar.zzc = zzofVarZze;
    }

    public static void zzq(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzc(i, list, z);
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzg(i, list, z);
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzj(i, list, z);
    }

    public static void zzt(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzl(i, list, z);
    }

    public static void zzu(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzn(i, list, z);
    }

    public static void zzv(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzp(i, list, z);
    }

    public static void zzw(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzs(i, list, z);
    }

    public static void zzx(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzu(i, list, z);
    }

    public static void zzy(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzy(i, list, z);
    }

    public static void zzz(int i, java.util.List list, com.google.android.gms.internal.measurement.zzor zzorVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzA(i, list, z);
    }
}
