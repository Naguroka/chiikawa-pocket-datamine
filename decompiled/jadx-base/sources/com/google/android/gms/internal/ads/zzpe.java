package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzpe {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzpf zzb;

    public zzpe(android.os.Handler handler, com.google.android.gms.internal.ads.zzpf zzpfVar) {
        if (zzpfVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzpfVar;
    }

    public final void zza(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzoy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzpg zzpgVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzpgVar);
                }
            });
        }
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzpg zzpgVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzox
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzpgVar);
                }
            });
        }
    }

    public final void zze(final java.lang.String str, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final java.lang.String str) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(str);
                }
            });
        }
    }

    public final void zzg(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        zzhsVar.zza();
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzhsVar);
                }
            });
        }
    }

    public final void zzh(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(zzhsVar);
                }
            });
        }
    }

    public final void zzi(final com.google.android.gms.internal.ads.zzab zzabVar, final com.google.android.gms.internal.ads.zzht zzhtVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(zzabVar, zzhtVar);
                }
            });
        }
    }

    final /* synthetic */ void zzj(java.lang.Exception exc) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zza(exc);
    }

    final /* synthetic */ void zzk(java.lang.Exception exc) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzh(exc);
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzpg zzpgVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzi(zzpgVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzpg zzpgVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzj(zzpgVar);
    }

    final /* synthetic */ void zzn(java.lang.String str, long j, long j2) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzb(str, j, j2);
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzc(str);
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        zzhsVar.zza();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzd(zzhsVar);
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zze(zzhsVar);
    }

    final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzf(zzabVar, zzhtVar);
    }

    final /* synthetic */ void zzs(long j) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzg(j);
    }

    final /* synthetic */ void zzt(boolean z) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzn(z);
    }

    final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzu(i, j, j2);
                }
            });
        }
    }
}
