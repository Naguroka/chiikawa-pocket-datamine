package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaet extends com.google.android.gms.internal.ads.zzaex {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaet(com.google.android.gms.internal.ads.zzadt zzadtVar) {
        super(zzadtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzaew {
        if (this.zzc) {
            zzdyVar.zzM(1);
        } else {
            int iZzm = zzdyVar.zzm();
            int i = iZzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzm >> 2) & 3];
                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_MPEG);
                zzzVar.zzz(1);
                zzzVar.zzab(i2);
                this.zza.zzm(zzzVar.zzag());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
                zzzVar2.zzaa(i == 7 ? androidx.media3.common.MimeTypes.AUDIO_ALAW : androidx.media3.common.MimeTypes.AUDIO_MLAW);
                zzzVar2.zzz(1);
                zzzVar2.zzab(8000);
                this.zza.zzm(zzzVar2.zzag());
                this.zzd = true;
            } else if (i != 10) {
                throw new com.google.android.gms.internal.ads.zzaew("Audio format not supported: " + i);
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(com.google.android.gms.internal.ads.zzdy zzdyVar, long j) throws com.google.android.gms.internal.ads.zzbc {
        if (this.zze == 2) {
            int iZzb = zzdyVar.zzb();
            this.zza.zzr(zzdyVar, iZzb);
            this.zza.zzt(j, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = zzdyVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = zzdyVar.zzb();
            this.zza.zzr(zzdyVar, iZzb2);
            this.zza.zzt(j, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = zzdyVar.zzb();
        byte[] bArr = new byte[iZzb3];
        zzdyVar.zzH(bArr, 0, iZzb3);
        com.google.android.gms.internal.ads.zzabi zzabiVarZza = com.google.android.gms.internal.ads.zzabk.zza(bArr);
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_AAC);
        zzzVar.zzA(zzabiVarZza.zzc);
        zzzVar.zzz(zzabiVarZza.zzb);
        zzzVar.zzab(zzabiVarZza.zza);
        zzzVar.zzN(java.util.Collections.singletonList(bArr));
        this.zza.zzm(zzzVar.zzag());
        this.zzd = true;
        return false;
    }
}
