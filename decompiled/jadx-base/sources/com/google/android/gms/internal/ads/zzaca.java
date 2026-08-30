package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaca implements com.google.android.gms.internal.ads.zzadm {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaca(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final java.lang.String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        return "ChunkIndex(length=" + this.zza + ", sizes=" + java.util.Arrays.toString(this.zzb) + ", offsets=" + java.util.Arrays.toString(jArr3) + ", timeUs=" + java.util.Arrays.toString(jArr2) + ", durationsUs=" + java.util.Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        long[] jArr = this.zze;
        int iZzd = com.google.android.gms.internal.ads.zzei.zzd(jArr, j, true, true);
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(jArr[iZzd], this.zzc[iZzd]);
        if (zzadnVar.zzb >= j || iZzd == this.zza - 1) {
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        int i = iZzd + 1;
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, new com.google.android.gms.internal.ads.zzadn(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
