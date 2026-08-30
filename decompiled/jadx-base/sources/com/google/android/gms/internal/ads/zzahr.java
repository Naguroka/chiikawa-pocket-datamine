package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahr implements com.google.android.gms.internal.ads.zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahr(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == androidx.media3.common.C.TIME_UNSET ? com.google.android.gms.internal.ads.zzei.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static com.google.android.gms.internal.ads.zzahr zzb(long j, com.google.android.gms.internal.ads.zzagm zzagmVar, long j2) {
        int length = zzagmVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzagmVar.zzb + zzagmVar.zzd[i3]);
            j3 += (long) (zzagmVar.zzc + zzagmVar.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new com.google.android.gms.internal.ads.zzahr(jArr, jArr2, j2);
    }

    private static android.util.Pair zzf(long j, long[] jArr, long[] jArr2) {
        int iZzd = com.google.android.gms.internal.ads.zzei.zzd(jArr, j, true, true);
        long j2 = jArr[iZzd];
        long j3 = jArr2[iZzd];
        int i = iZzd + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return androidx.media3.common.C.RATE_UNSET_INT;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        return com.google.android.gms.internal.ads.zzei.zzs(((java.lang.Long) zzf(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        android.util.Pair pairZzf = zzf(com.google.android.gms.internal.ads.zzei.zzv(java.lang.Math.max(0L, java.lang.Math.min(j, this.zzc))), this.zzb, this.zza);
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(com.google.android.gms.internal.ads.zzei.zzs(((java.lang.Long) pairZzf.first).longValue()), ((java.lang.Long) pairZzf.second).longValue());
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
