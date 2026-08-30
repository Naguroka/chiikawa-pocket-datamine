package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhi extends com.google.android.gms.internal.ads.zzbq {
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzwb zzc;

    public zzhi(boolean z, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        this.zzc = zzwbVar;
        this.zzb = zzwbVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzd(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(java.lang.Object obj) {
        int iZza;
        if (obj instanceof android.util.Pair) {
            android.util.Pair pair = (android.util.Pair) obj;
            java.lang.Object obj2 = pair.first;
            java.lang.Object obj3 = pair.second;
            int iZzp = zzp(obj2);
            if (iZzp != -1 && (iZza = zzu(iZzp).zza(obj3)) != -1) {
                return zzs(iZzp) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbo zzd(int i, com.google.android.gms.internal.ads.zzbo zzboVar, boolean z) {
        int iZzq = zzq(i);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i - zzs(iZzq), zzboVar, z);
        zzboVar.zzc += iZzt;
        if (z) {
            java.lang.Object objZzv = zzv(iZzq);
            java.lang.Object obj = zzboVar.zzb;
            obj.getClass();
            zzboVar.zzb = android.util.Pair.create(objZzv, obj);
        }
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i - iZzt, zzbpVar, j);
        java.lang.Object objZzv = zzv(iZzr);
        if (!com.google.android.gms.internal.ads.zzbp.zza.equals(zzbpVar.zzb)) {
            objZzv = android.util.Pair.create(objZzv, zzbpVar.zzb);
        }
        zzbpVar.zzb = objZzv;
        zzbpVar.zzn += iZzs;
        zzbpVar.zzo += iZzs;
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final java.lang.Object zzf(int i) {
        int iZzq = zzq(i);
        return android.util.Pair.create(zzv(iZzq), zzu(iZzq).zzf(i - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzg(boolean z) {
        if (this.zzb != 0) {
            int iZza = z ? this.zzc.zza() : 0;
            while (zzu(iZza).zzo()) {
                iZza = zzw(iZza, z);
                if (iZza == -1) {
                }
            }
            return zzt(iZza) + zzu(iZza).zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzh(boolean z) {
        int i = this.zzb;
        if (i != 0) {
            int iZzb = z ? this.zzc.zzb() : i - 1;
            while (zzu(iZzb).zzo()) {
                iZzb = zzx(iZzb, z);
                if (iZzb == -1) {
                }
            }
            return zzt(iZzb) + zzu(iZzb).zzh(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzj(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i - iZzt, i2 == 2 ? 0 : i2, z);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z);
        }
        if (iZzw != -1) {
            return zzt(iZzw) + zzu(iZzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzk(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx != -1) {
            return zzt(iZzx) + zzu(iZzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbo zzn(java.lang.Object obj, com.google.android.gms.internal.ads.zzbo zzboVar) {
        android.util.Pair pair = (android.util.Pair) obj;
        java.lang.Object obj2 = pair.first;
        java.lang.Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzboVar);
        zzboVar.zzc += iZzt;
        zzboVar.zzb = obj;
        return zzboVar;
    }

    protected abstract int zzp(java.lang.Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract com.google.android.gms.internal.ads.zzbq zzu(int i);

    protected abstract java.lang.Object zzv(int i);
}
