package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final com.google.android.gms.internal.ads.zzacx zzk;
    private final com.google.android.gms.internal.ads.zzay zzl;

    private zzacy(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, com.google.android.gms.internal.ads.zzacx zzacxVar, com.google.android.gms.internal.ads.zzay zzayVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzacxVar;
        this.zzl = zzayVar;
    }

    public zzacy(byte[] bArr, int i) {
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArr, bArr.length);
        zzdxVar.zzl(i * 8);
        this.zza = zzdxVar.zzd(16);
        this.zzb = zzdxVar.zzd(16);
        this.zzc = zzdxVar.zzd(24);
        this.zzd = zzdxVar.zzd(24);
        int iZzd = zzdxVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzdxVar.zzd(3) + 1;
        int iZzd2 = zzdxVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        this.zzj = zzdxVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case androidx.media3.extractor.OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        return j == 0 ? androidx.media3.common.C.TIME_UNSET : (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        return java.lang.Math.max(0L, java.lang.Math.min((j * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    public final com.google.android.gms.internal.ads.zzab zzc(byte[] bArr, com.google.android.gms.internal.ads.zzay zzayVar) {
        bArr[4] = -128;
        com.google.android.gms.internal.ads.zzay zzayVarZzd = zzd(zzayVar);
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_FLAC);
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzzVar.zzR(i);
        zzzVar.zzz(this.zzg);
        zzzVar.zzab(this.zze);
        zzzVar.zzU(com.google.android.gms.internal.ads.zzei.zzn(this.zzh));
        zzzVar.zzN(java.util.Collections.singletonList(bArr));
        zzzVar.zzT(zzayVarZzd);
        return zzzVar.zzag();
    }

    public final com.google.android.gms.internal.ads.zzay zzd(com.google.android.gms.internal.ads.zzay zzayVar) {
        com.google.android.gms.internal.ads.zzay zzayVar2 = this.zzl;
        return zzayVar2 == null ? zzayVar : zzayVar2.zzd(zzayVar);
    }

    public final com.google.android.gms.internal.ads.zzacy zze(java.util.List list) {
        return new com.google.android.gms.internal.ads.zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new com.google.android.gms.internal.ads.zzay(list)));
    }

    public final com.google.android.gms.internal.ads.zzacy zzf(com.google.android.gms.internal.ads.zzacx zzacxVar) {
        return new com.google.android.gms.internal.ads.zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzacxVar, this.zzl);
    }

    public final com.google.android.gms.internal.ads.zzacy zzg(java.util.List list) {
        return new com.google.android.gms.internal.ads.zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(com.google.android.gms.internal.ads.zzadz.zzb(list)));
    }
}
