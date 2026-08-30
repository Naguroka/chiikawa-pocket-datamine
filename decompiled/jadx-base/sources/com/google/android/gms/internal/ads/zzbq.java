package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbq {
    public static final com.google.android.gms.internal.ads.zzbq zza = new com.google.android.gms.internal.ads.zzbn();

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
    }

    protected zzbq() {
    }

    public final boolean equals(java.lang.Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzbq)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbq zzbqVar = (com.google.android.gms.internal.ads.zzbq) obj;
        if (zzbqVar.zzc() == zzc() && zzbqVar.zzb() == zzb()) {
            com.google.android.gms.internal.ads.zzbp zzbpVar = new com.google.android.gms.internal.ads.zzbp();
            com.google.android.gms.internal.ads.zzbo zzboVar = new com.google.android.gms.internal.ads.zzbo();
            com.google.android.gms.internal.ads.zzbp zzbpVar2 = new com.google.android.gms.internal.ads.zzbp();
            com.google.android.gms.internal.ads.zzbo zzboVar2 = new com.google.android.gms.internal.ads.zzbo();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbpVar, 0L).equals(zzbqVar.zze(i, zzbpVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzboVar, true).equals(zzbqVar.zzd(i2, zzboVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzbqVar.zzg(true) && (iZzh = zzh(true)) == zzbqVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzbqVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        com.google.android.gms.internal.ads.zzbp zzbpVar = new com.google.android.gms.internal.ads.zzbp();
        com.google.android.gms.internal.ads.zzbo zzboVar = new com.google.android.gms.internal.ads.zzbo();
        int iZzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = iZzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            iZzc = i + zze(i2, zzbpVar, 0L).hashCode();
            i2++;
        }
        int iZzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            iZzb = (iZzb * 31) + zzd(i3, zzboVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(java.lang.Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract com.google.android.gms.internal.ads.zzbo zzd(int i, com.google.android.gms.internal.ads.zzbo zzboVar, boolean z);

    public abstract com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j);

    public abstract java.lang.Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, com.google.android.gms.internal.ads.zzbo zzboVar, com.google.android.gms.internal.ads.zzbp zzbpVar, int i2, boolean z) {
        int i3 = zzd(i, zzboVar, false).zzc;
        if (zze(i3, zzbpVar, 0L).zzo != i) {
            return i + 1;
        }
        int iZzj = zzj(i3, i2, z);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzbpVar, 0L).zzn;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final android.util.Pair zzl(com.google.android.gms.internal.ads.zzbp zzbpVar, com.google.android.gms.internal.ads.zzbo zzboVar, int i, long j) {
        android.util.Pair pairZzm = zzm(zzbpVar, zzboVar, i, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final android.util.Pair zzm(com.google.android.gms.internal.ads.zzbp zzbpVar, com.google.android.gms.internal.ads.zzbo zzboVar, int i, long j, long j2) {
        com.google.android.gms.internal.ads.zzcw.zza(i, 0, zzc());
        zze(i, zzbpVar, j2);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            long j3 = zzbpVar.zzl;
            j = 0;
        }
        int i2 = zzbpVar.zzn;
        zzd(i2, zzboVar, false);
        while (i2 < zzbpVar.zzo) {
            long j4 = zzboVar.zze;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzboVar, false).zze;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzboVar, true);
        long j6 = zzboVar.zze;
        long j7 = zzboVar.zzd;
        if (j7 != androidx.media3.common.C.TIME_UNSET) {
            j = java.lang.Math.min(j, j7 - 1);
        }
        long jMax = java.lang.Math.max(0L, j);
        java.lang.Object obj = zzboVar.zzb;
        obj.getClass();
        return android.util.Pair.create(obj, java.lang.Long.valueOf(jMax));
    }

    public com.google.android.gms.internal.ads.zzbo zzn(java.lang.Object obj, com.google.android.gms.internal.ads.zzbo zzboVar) {
        return zzd(zza(obj), zzboVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
