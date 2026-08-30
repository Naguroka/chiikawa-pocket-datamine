package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzami implements com.google.android.gms.internal.ads.zzamj {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzadt[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = androidx.media3.common.C.TIME_UNSET;

    public zzami(java.util.List list) {
        this.zza = list;
        this.zzb = new com.google.android.gms.internal.ads.zzadt[list.size()];
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        if (zzdyVar.zzb() == 0) {
            return false;
        }
        if (zzdyVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int iZzd = zzdyVar.zzd();
                    int iZzb = zzdyVar.zzb();
                    for (com.google.android.gms.internal.ads.zzadt zzadtVar : this.zzb) {
                        zzdyVar.zzL(iZzd);
                        zzadtVar.zzr(zzdyVar, iZzb);
                    }
                    this.zze += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            com.google.android.gms.internal.ads.zzanu zzanuVar = (com.google.android.gms.internal.ads.zzanu) this.zza.get(i);
            zzanxVar.zzc();
            com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzM(zzanxVar.zzb());
            zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS);
            zzzVar.zzN(java.util.Collections.singletonList(zzanuVar.zzb));
            zzzVar.zzQ(zzanuVar.zza);
            zzadtVarZzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzadtVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        if (this.zzc) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzf != androidx.media3.common.C.TIME_UNSET);
            for (com.google.android.gms.internal.ads.zzadt zzadtVar : this.zzb) {
                zzadtVar.zzt(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzf = androidx.media3.common.C.TIME_UNSET;
    }
}
