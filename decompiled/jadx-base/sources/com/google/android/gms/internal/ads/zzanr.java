package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzanr implements com.google.android.gms.internal.ads.zzank {
    final /* synthetic */ com.google.android.gms.internal.ads.zzant zza;
    private final com.google.android.gms.internal.ads.zzdx zzb = new com.google.android.gms.internal.ads.zzdx(new byte[4], 4);

    public zzanr(com.google.android.gms.internal.ads.zzant zzantVar) {
        this.zza = zzantVar;
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        if (zzdyVar.zzm() == 0 && (zzdyVar.zzm() & 128) != 0) {
            zzdyVar.zzM(6);
            int iZzb = zzdyVar.zzb() / 4;
            for (int i = 0; i < iZzb; i++) {
                zzdyVar.zzG(this.zzb, 4);
                com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzb;
                int iZzd = zzdxVar.zzd(16);
                zzdxVar.zzn(3);
                if (iZzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        com.google.android.gms.internal.ads.zzant zzantVar = this.zza;
                        zzantVar.zzg.put(iZzd2, new com.google.android.gms.internal.ads.zzanl(new com.google.android.gms.internal.ads.zzans(zzantVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
    }
}
