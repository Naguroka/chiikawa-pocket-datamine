package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabb {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzabc zzb;

    public zzabb(android.os.Handler handler, com.google.android.gms.internal.ads.zzabc zzabcVar) {
        if (zzabcVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzabcVar;
    }

    public final void zza(final java.lang.String str, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final java.lang.String str) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        zzhsVar.zza();
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzhsVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaat
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final com.google.android.gms.internal.ads.zzhs zzhsVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzhsVar);
                }
            });
        }
    }

    public final void zzf(final com.google.android.gms.internal.ads.zzab zzabVar, final com.google.android.gms.internal.ads.zzht zzhtVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzabVar, zzhtVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(java.lang.String str, long j, long j2) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        zzhsVar.zza();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzr(zzhsVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzl(i, j);
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhs zzhsVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzs(zzhsVar);
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzu(zzabVar, zzhtVar);
    }

    final /* synthetic */ void zzm(java.lang.Object obj, long j) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzt(j, i);
    }

    final /* synthetic */ void zzo(java.lang.Exception exc) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzo(exc);
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzcd zzcdVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb.zzv(zzcdVar);
    }

    public final void zzq(final java.lang.Object obj) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaaw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final com.google.android.gms.internal.ads.zzcd zzcdVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaas
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzcdVar);
                }
            });
        }
    }
}
