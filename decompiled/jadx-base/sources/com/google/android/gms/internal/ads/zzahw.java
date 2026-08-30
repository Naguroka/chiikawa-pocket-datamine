package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahw {
    public final com.google.android.gms.internal.ads.zzadf zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahw(com.google.android.gms.internal.ads.zzadf zzadfVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new com.google.android.gms.internal.ads.zzadf(zzadfVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static com.google.android.gms.internal.ads.zzahw zzb(com.google.android.gms.internal.ads.zzadf zzadfVar, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzg = zzdyVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzdyVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzdyVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzdyVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzg & 8) != 0) {
            zzdyVar.zzM(4);
        }
        if (zzdyVar.zzb() >= 24) {
            zzdyVar.zzM(21);
            int iZzo = zzdyVar.zzo();
            i2 = iZzo & 4095;
            i = iZzo >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new com.google.android.gms.internal.ads.zzahw(zzadfVar, iZzp, jZzu, jArr, i, i2);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        com.google.android.gms.internal.ads.zzadf zzadfVar = this.zza;
        return com.google.android.gms.internal.ads.zzei.zzt((j * ((long) zzadfVar.zzg)) - 1, zzadfVar.zzd);
    }
}
