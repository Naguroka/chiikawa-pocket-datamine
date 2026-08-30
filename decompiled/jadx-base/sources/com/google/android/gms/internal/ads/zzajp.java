package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajp extends com.google.android.gms.internal.ads.zzajt {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzajp() {
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return zzk(zzdyVar, zza);
    }

    private static boolean zzk(com.google.android.gms.internal.ads.zzdy zzdyVar, byte[] bArr) {
        if (zzdyVar.zzb() < 8) {
            return false;
        }
        int iZzd = zzdyVar.zzd();
        byte[] bArr2 = new byte[8];
        zzdyVar.zzH(bArr2, 0, 8);
        zzdyVar.zzL(iZzd);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final long zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return zzg(com.google.android.gms.internal.ads.zzadi.zzd(zzdyVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, long j, com.google.android.gms.internal.ads.zzajq zzajqVar) throws com.google.android.gms.internal.ads.zzbc {
        if (zzk(zzdyVar, zza)) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(zzdyVar.zzN(), zzdyVar.zze());
            int i = bArrCopyOf[9] & 255;
            java.util.List listZze = com.google.android.gms.internal.ads.zzadi.zze(bArrCopyOf);
            if (zzajqVar.zza == null) {
                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_OPUS);
                zzzVar.zzz(i);
                zzzVar.zzab(androidx.media3.extractor.OpusUtil.SAMPLE_RATE);
                zzzVar.zzN(listZze);
                zzajqVar.zza = zzzVar.zzag();
                return true;
            }
        } else {
            if (!zzk(zzdyVar, zzb)) {
                com.google.android.gms.internal.ads.zzcw.zzb(zzajqVar.zza);
                return false;
            }
            com.google.android.gms.internal.ads.zzcw.zzb(zzajqVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzdyVar.zzM(8);
                com.google.android.gms.internal.ads.zzay zzayVarZzb = com.google.android.gms.internal.ads.zzadz.zzb(com.google.android.gms.internal.ads.zzfxn.zzm(com.google.android.gms.internal.ads.zzadz.zzc(zzdyVar, false, false).zza));
                if (zzayVarZzb != null) {
                    com.google.android.gms.internal.ads.zzz zzzVarZzb = zzajqVar.zza.zzb();
                    zzzVarZzb.zzT(zzayVarZzb.zzd(zzajqVar.zza.zzl));
                    zzajqVar.zza = zzzVarZzb.zzag();
                }
            }
        }
        return true;
    }
}
