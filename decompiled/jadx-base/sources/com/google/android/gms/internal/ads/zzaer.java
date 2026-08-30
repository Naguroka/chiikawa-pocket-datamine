package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaer extends com.google.android.gms.internal.ads.zzaby {
    public zzaer(final com.google.android.gms.internal.ads.zzacy zzacyVar, int i, long j, long j2) {
        long j3;
        java.util.Objects.requireNonNull(zzacyVar);
        com.google.android.gms.internal.ads.zzabv zzabvVar = new com.google.android.gms.internal.ads.zzabv() { // from class: com.google.android.gms.internal.ads.zzaeo
            @Override // com.google.android.gms.internal.ads.zzabv
            public final long zza(long j4) {
                return zzacyVar.zzb(j4);
            }
        };
        com.google.android.gms.internal.ads.zzaep zzaepVar = new com.google.android.gms.internal.ads.zzaep(zzacyVar, i, null);
        long jZza = zzacyVar.zza();
        long j4 = zzacyVar.zzj;
        int i2 = zzacyVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzacyVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzacyVar.zza;
            long j5 = 4096;
            if (i3 == zzacyVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * ((long) zzacyVar.zzg)) * ((long) zzacyVar.zzh)) / 8) + 64;
        }
        super(zzabvVar, zzaepVar, jZza, 0L, j4, j, j2, j3, java.lang.Math.max(6, zzacyVar.zzc));
    }
}
