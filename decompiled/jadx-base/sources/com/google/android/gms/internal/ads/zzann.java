package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzann {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzadt[] zzb;
    private final com.google.android.gms.internal.ads.zzfo zzc = new com.google.android.gms.internal.ads.zzfo(new com.google.android.gms.internal.ads.zzfm() { // from class: com.google.android.gms.internal.ads.zzanm
        @Override // com.google.android.gms.internal.ads.zzfm
        public final void zza(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
            this.zza.zzd(j, zzdyVar);
        }
    });

    public zzann(java.util.List list) {
        this.zza = list;
        this.zzb = new com.google.android.gms.internal.ads.zzadt[list.size()];
    }

    public final void zza(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        this.zzc.zzb(j, zzdyVar);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanxVar.zzc();
            com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            com.google.android.gms.internal.ads.zzab zzabVar = (com.google.android.gms.internal.ads.zzab) this.zza.get(i);
            java.lang.String str = zzabVar.zzo;
            boolean z = true;
            if (!androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) && !androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            com.google.android.gms.internal.ads.zzcw.zze(z, "Invalid closed caption MIME type provided: ".concat(java.lang.String.valueOf(str)));
            java.lang.String strZzb = zzabVar.zza;
            if (strZzb == null) {
                strZzb = zzanxVar.zzb();
            }
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzM(strZzb);
            zzzVar.zzaa(str);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzx(zzabVar.zzI);
            zzzVar.zzN(zzabVar.zzr);
            zzadtVarZzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzadtVarZzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    final /* synthetic */ void zzd(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzabz.zza(j, zzdyVar, this.zzb);
    }

    public final void zze(int i) {
        this.zzc.zzd(i);
    }
}
