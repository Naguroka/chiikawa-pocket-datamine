package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacv {
    public static com.google.android.gms.internal.ads.zzacx zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        zzdyVar.zzM(1);
        int iZzo = zzdyVar.zzo();
        long jZzd = zzdyVar.zzd();
        long j = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzt = zzdyVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzt;
            jArrCopyOf2[i2] = zzdyVar.zzt();
            zzdyVar.zzM(2);
        }
        zzdyVar.zzM((int) ((jZzd + j) - ((long) zzdyVar.zzd())));
        return new com.google.android.gms.internal.ads.zzacx(jArrCopyOf, jArrCopyOf2);
    }

    public static com.google.android.gms.internal.ads.zzay zza(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzay zzayVarZza = new com.google.android.gms.internal.ads.zzadd().zza(zzacoVar, z ? null : com.google.android.gms.internal.ads.zzagg.zza);
        if (zzayVarZza == null || zzayVarZza.zza() == 0) {
            return null;
        }
        return zzayVarZza;
    }
}
