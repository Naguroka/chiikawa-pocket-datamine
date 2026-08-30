package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzanc implements com.google.android.gms.internal.ads.zzank {
    private com.google.android.gms.internal.ads.zzab zza;
    private com.google.android.gms.internal.ads.zzef zzb;
    private com.google.android.gms.internal.ads.zzadt zzc;

    public zzanc(java.lang.String str) {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(str);
        this.zza = zzzVar.zzag();
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzb);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == androidx.media3.common.C.TIME_UNSET || jZzf == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        com.google.android.gms.internal.ads.zzab zzabVar = this.zza;
        if (jZzf != zzabVar.zzt) {
            com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
            zzzVarZzb.zzae(jZzf);
            com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVarZzb.zzag();
            this.zza = zzabVarZzag;
            this.zzc.zzm(zzabVarZzag);
        }
        int iZzb = zzdyVar.zzb();
        this.zzc.zzr(zzdyVar, iZzb);
        this.zzc.zzt(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        this.zzb = zzefVar;
        zzanxVar.zzc();
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 5);
        this.zzc = zzadtVarZzw;
        zzadtVarZzw.zzm(this.zza);
    }
}
