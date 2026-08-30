package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaig implements com.google.android.gms.internal.ads.zzaid {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;

    public zzaig(com.google.android.gms.internal.ads.zzeo zzeoVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVar.zza;
        this.zzc = zzdyVar;
        zzdyVar.zzL(12);
        int iZzp = zzdyVar.zzp();
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            int iZzk = com.google.android.gms.internal.ads.zzei.zzk(zzabVar.zzF) * zzabVar.zzD;
            if (iZzp == 0 || iZzp % iZzk != 0) {
                com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzp);
                iZzp = iZzk;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzdyVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
