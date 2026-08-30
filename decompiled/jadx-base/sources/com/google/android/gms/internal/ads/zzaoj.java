package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaoj implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(4);
    private final com.google.android.gms.internal.ads.zzado zzb = new com.google.android.gms.internal.ads.zzado(-1, -1, androidx.media3.common.MimeTypes.IMAGE_WEBP);

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        return this.zzb.zzb(zzacoVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zzb.zze(zzacqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzb.zzf(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        this.zza.zzI(4);
        com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
        zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzaccVar.zzl(4, false);
            this.zza.zzI(4);
            zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
