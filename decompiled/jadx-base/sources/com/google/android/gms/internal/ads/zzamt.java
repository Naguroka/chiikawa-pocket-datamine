package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamt implements com.google.android.gms.internal.ads.zzamj {
    private com.google.android.gms.internal.ads.zzadt zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(10);
    private long zzd = androidx.media3.common.C.TIME_UNSET;

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzb);
        if (this.zzc) {
            int iZzb = zzdyVar.zzb();
            int i = this.zzf;
            if (i < 10) {
                int iMin = java.lang.Math.min(iZzb, 10 - i);
                java.lang.System.arraycopy(zzdyVar.zzN(), zzdyVar.zzd(), this.zza.zzN(), this.zzf, iMin);
                if (this.zzf + iMin == 10) {
                    this.zza.zzL(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        com.google.android.gms.internal.ads.zzdo.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzM(3);
                        this.zze = this.zza.zzl() + 10;
                    }
                }
            }
            int iMin2 = java.lang.Math.min(iZzb, this.zze - this.zzf);
            this.zzb.zzr(zzdyVar, iMin2);
            this.zzf += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 5);
        this.zzb = zzadtVarZzw;
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzM(zzanxVar.zzb());
        zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_ID3);
        zzadtVarZzw.zzm(zzzVar.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        int i;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzd != androidx.media3.common.C.TIME_UNSET);
            this.zzb.zzt(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzd = androidx.media3.common.C.TIME_UNSET;
    }
}
