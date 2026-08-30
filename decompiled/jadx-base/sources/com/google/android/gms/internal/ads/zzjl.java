package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzjl implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzpf, com.google.android.gms.internal.ads.zzwm, com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzjp zza;

    /* synthetic */ zzjl(com.google.android.gms.internal.ads.zzjp zzjpVar, com.google.android.gms.internal.ads.zzjo zzjoVar) {
        this.zza = zzjpVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.internal.ads.zzjp.zzK(this.zza, surfaceTexture);
        this.zza.zzZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.zza.zzac(null);
        this.zza.zzZ(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzZ(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.zza.zzZ(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zza(java.lang.Exception exc) {
        this.zza.zzq.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzb(java.lang.String str, long j, long j2) {
        this.zza.zzq.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzc(java.lang.String str) {
        this.zza.zzq.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzd(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        this.zza.zzq.zzy(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zze(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        this.zza.zzq.zzz(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzf(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        this.zza.zzq.zzA(zzabVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzg(long j) {
        this.zza.zzq.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzh(java.lang.Exception exc) {
        this.zza.zzq.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzi(com.google.android.gms.internal.ads.zzpg zzpgVar) {
        this.zza.zzq.zzD(zzpgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzj(com.google.android.gms.internal.ads.zzpg zzpgVar) {
        this.zza.zzq.zzE(zzpgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzk(int i, long j, long j2) {
        this.zza.zzq.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzl(int i, long j) {
        this.zza.zzq.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzm(java.lang.Object obj, long j) {
        this.zza.zzq.zzH(obj, j);
        com.google.android.gms.internal.ads.zzjp zzjpVar = this.zza;
        if (zzjpVar.zzF == obj) {
            com.google.android.gms.internal.ads.zzdn zzdnVar = zzjpVar.zzl;
            zzdnVar.zzd(26, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjk
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(java.lang.Object obj2) {
                }
            });
            zzdnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzn(final boolean z) {
        com.google.android.gms.internal.ads.zzjp zzjpVar = this.zza;
        if (zzjpVar.zzM == z) {
            return;
        }
        zzjpVar.zzM = z;
        com.google.android.gms.internal.ads.zzdn zzdnVar = this.zza.zzl;
        zzdnVar.zzd(23, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzjl.zzb;
                ((com.google.android.gms.internal.ads.zzbh) obj).zzn(z);
            }
        });
        zzdnVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo(java.lang.Exception exc) {
        this.zza.zzq.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzp(java.lang.String str, long j, long j2) {
        this.zza.zzq.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzq(java.lang.String str) {
        this.zza.zzq.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzr(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        this.zza.zzq.zzM(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzs(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        this.zza.zzq.zzN(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzt(long j, int i) {
        this.zza.zzq.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzu(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        this.zza.zzq.zzP(zzabVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzv(final com.google.android.gms.internal.ads.zzcd zzcdVar) {
        com.google.android.gms.internal.ads.zzdn zzdnVar = this.zza.zzl;
        zzdnVar.zzd(25, new com.google.android.gms.internal.ads.zzdk() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzjl.zzb;
                ((com.google.android.gms.internal.ads.zzbh) obj).zzr(zzcdVar);
            }
        });
        zzdnVar.zzc();
    }
}
