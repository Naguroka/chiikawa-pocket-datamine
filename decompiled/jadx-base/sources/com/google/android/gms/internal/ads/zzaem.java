package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaem implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(4);
    private final com.google.android.gms.internal.ads.zzado zzb = new com.google.android.gms.internal.ads.zzado(-1, -1, androidx.media3.common.MimeTypes.IMAGE_AVIF);

    private final boolean zza(com.google.android.gms.internal.ads.zzaco zzacoVar, int i) throws java.io.IOException {
        this.zza.zzI(4);
        ((com.google.android.gms.internal.ads.zzacc) zzacoVar).zzm(this.zza.zzN(), 0, 4, false);
        return this.zza.zzu() == ((long) i);
    }

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
        ((com.google.android.gms.internal.ads.zzacc) zzacoVar).zzl(4, false);
        return zza(zzacoVar, androidx.media3.extractor.mp4.Atom.TYPE_ftyp) && zza(zzacoVar, 1635150182);
    }
}
