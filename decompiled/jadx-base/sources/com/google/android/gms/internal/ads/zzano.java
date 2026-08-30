package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzano implements com.google.android.gms.internal.ads.zzabx {
    private final com.google.android.gms.internal.ads.zzef zza;
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy();
    private final int zzc;

    public zzano(int i, com.google.android.gms.internal.ads.zzef zzefVar, int i2) {
        this.zzc = i;
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final com.google.android.gms.internal.ads.zzabw zza(com.google.android.gms.internal.ads.zzaco zzacoVar, long j) throws java.io.IOException {
        int iZza;
        int iZza2;
        long jZzf = zzacoVar.zzf();
        int iMin = (int) java.lang.Math.min(112800L, zzacoVar.zzd() - jZzf);
        this.zzb.zzI(iMin);
        zzacoVar.zzh(this.zzb.zzN(), 0, iMin);
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzb;
        int iZze = zzdyVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzdyVar.zzb() >= 188 && (iZza2 = (iZza = com.google.android.gms.internal.ads.zzanz.zza(zzdyVar.zzN(), zzdyVar.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = com.google.android.gms.internal.ads.zzanz.zzb(zzdyVar, iZza, this.zzc);
            if (jZzb != androidx.media3.common.C.TIME_UNSET) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 <= j) {
                    j4 = iZza;
                    if (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jZzb2 <= j) {
                        j3 = jZzb2;
                    }
                } else if (j3 == androidx.media3.common.C.TIME_UNSET) {
                    return com.google.android.gms.internal.ads.zzabw.zzd(jZzb2, jZzf);
                }
                return com.google.android.gms.internal.ads.zzabw.zze(jZzf + j4);
            }
            zzdyVar.zzL(iZza2);
            j2 = iZza2;
        }
        return j3 != androidx.media3.common.C.TIME_UNSET ? com.google.android.gms.internal.ads.zzabw.zzf(j3, jZzf + j2) : com.google.android.gms.internal.ads.zzabw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        byte[] bArr = com.google.android.gms.internal.ads.zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
