package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzzx {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaah zza;
    private com.google.android.gms.internal.ads.zzab zzb;

    /* synthetic */ zzzx(com.google.android.gms.internal.ads.zzaah zzaahVar, com.google.android.gms.internal.ads.zzaag zzaagVar) {
        this.zza = zzaahVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzcd zzcdVar) {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaf(zzcdVar.zzb);
        zzzVar.zzK(zzcdVar.zzc);
        zzzVar.zzaa(androidx.media3.common.MimeTypes.VIDEO_RAW);
        this.zzb = zzzVar.zzag();
        java.util.Iterator it = this.zza.zzj.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzaac) it.next()).zzA(this.zza, zzcdVar);
        }
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            com.google.android.gms.internal.ads.zzaah zzaahVar = this.zza;
            if (zzaahVar.zzm != null) {
                java.util.Iterator it = zzaahVar.zzj.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.zzaac) it.next()).zzy(this.zza);
                }
            }
        }
        if (this.zza.zzk != null) {
            com.google.android.gms.internal.ads.zzab zzabVarZzag = this.zzb;
            if (zzabVarZzag == null) {
                zzabVarZzag = new com.google.android.gms.internal.ads.zzz().zzag();
            }
            com.google.android.gms.internal.ads.zzab zzabVar = zzabVarZzag;
            com.google.android.gms.internal.ads.zzaah zzaahVar2 = this.zza;
            zzaahVar2.zzk.zza(j2, zzaahVar2.zzi.zzc(), zzabVar, null);
        }
        com.google.android.gms.internal.ads.zzbm zzbmVar = null;
        com.google.android.gms.internal.ads.zzcw.zzb(null);
        zzbmVar.zza();
        throw null;
    }
}
