package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaoh {
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        zzacoVar.zzj();
        com.google.android.gms.internal.ads.zzaog zzaogVarZzd = zzd(1684108385, zzacoVar, new com.google.android.gms.internal.ads.zzdy(8));
        zzacoVar.zzk(8);
        return android.util.Pair.create(java.lang.Long.valueOf(zzacoVar.zzf()), java.lang.Long.valueOf(zzaogVarZzd.zzb));
    }

    public static com.google.android.gms.internal.ads.zzaof zzb(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        byte[] bArr;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(16);
        com.google.android.gms.internal.ads.zzaog zzaogVarZzd = zzd(androidx.media3.extractor.WavUtil.FMT_FOURCC, zzacoVar, zzdyVar);
        com.google.android.gms.internal.ads.zzcw.zzf(zzaogVarZzd.zzb >= 16);
        zzacoVar.zzh(zzdyVar.zzN(), 0, 16);
        zzdyVar.zzL(0);
        int iZzk = zzdyVar.zzk();
        int iZzk2 = zzdyVar.zzk();
        int iZzj = zzdyVar.zzj();
        int iZzj2 = zzdyVar.zzj();
        int iZzk3 = zzdyVar.zzk();
        int iZzk4 = zzdyVar.zzk();
        int i = ((int) zzaogVarZzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzacoVar.zzh(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = com.google.android.gms.internal.ads.zzei.zzf;
        }
        zzacoVar.zzk((int) (zzacoVar.zze() - zzacoVar.zzf()));
        return new com.google.android.gms.internal.ads.zzaof(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr);
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(8);
        int i = com.google.android.gms.internal.ads.zzaog.zza(zzacoVar, zzdyVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacoVar.zzh(zzdyVar.zzN(), 0, 4);
        zzdyVar.zzL(0);
        int iZzg = zzdyVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        com.google.android.gms.internal.ads.zzdo.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static com.google.android.gms.internal.ads.zzaog zzd(int i, com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzdy zzdyVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzaog zzaogVarZza = com.google.android.gms.internal.ads.zzaog.zza(zzacoVar, zzdyVar);
        while (true) {
            int i2 = zzaogVarZza.zza;
            if (i2 == i) {
                return zzaogVarZza;
            }
            com.google.android.gms.internal.ads.zzdo.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zzaogVarZza.zzb;
            long j2 = j & 1;
            long j3 = j + 8;
            if (j2 != 0) {
                j3++;
            }
            if (j3 > 2147483647L) {
                throw com.google.android.gms.internal.ads.zzbc.zzc("Chunk is too large (~2GB+) to skip; id: " + zzaogVarZza.zza);
            }
            zzacoVar.zzk((int) j3);
            zzaogVarZza = com.google.android.gms.internal.ads.zzaog.zza(zzacoVar, zzdyVar);
        }
    }
}
