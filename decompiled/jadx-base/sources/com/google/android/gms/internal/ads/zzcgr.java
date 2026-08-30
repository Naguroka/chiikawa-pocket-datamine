package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgr {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgr(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static com.google.android.gms.internal.ads.zzcgr zza() {
        return new com.google.android.gms.internal.ads.zzcgr(0, 0, 0);
    }

    public static com.google.android.gms.internal.ads.zzcgr zzb(int i, int i2) {
        return new com.google.android.gms.internal.ads.zzcgr(1, i, i2);
    }

    public static com.google.android.gms.internal.ads.zzcgr zzc(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        if (zzsVar.zzd) {
            return new com.google.android.gms.internal.ads.zzcgr(3, 0, 0);
        }
        if (zzsVar.zzi) {
            return new com.google.android.gms.internal.ads.zzcgr(2, 0, 0);
        }
        return zzsVar.zzh ? new com.google.android.gms.internal.ads.zzcgr(0, 0, 0) : new com.google.android.gms.internal.ads.zzcgr(1, zzsVar.zzf, zzsVar.zzc);
    }

    public static com.google.android.gms.internal.ads.zzcgr zzd() {
        return new com.google.android.gms.internal.ads.zzcgr(5, 0, 0);
    }

    public static com.google.android.gms.internal.ads.zzcgr zze() {
        return new com.google.android.gms.internal.ads.zzcgr(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
