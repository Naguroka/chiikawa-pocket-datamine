package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcqf extends com.google.android.gms.internal.ads.zzcom {
    private final com.google.android.gms.internal.ads.zzbhn zzc;
    private final java.lang.Runnable zzd;
    private final java.util.concurrent.Executor zze;

    public zzcqf(com.google.android.gms.internal.ads.zzcqy zzcqyVar, com.google.android.gms.internal.ads.zzbhn zzbhnVar, java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        super(zzcqyVar);
        this.zzc = zzbhnVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzj(java.util.concurrent.atomic.AtomicReference atomicReference) {
        java.lang.Runnable runnable = (java.lang.Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final android.view.View zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.internal.ads.zzfbp zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.internal.ads.zzfbp zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzi(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzk() {
        final com.google.android.gms.internal.ads.zzcqd zzcqdVar = new com.google.android.gms.internal.ads.zzcqd(new java.util.concurrent.atomic.AtomicReference(this.zzd));
        this.zze.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzl(zzcqdVar);
            }
        });
    }

    final /* synthetic */ void zzl(java.lang.Runnable runnable) {
        try {
            if (this.zzc.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzj(((com.google.android.gms.internal.ads.zzcqd) runnable).zza);
        } catch (android.os.RemoteException unused) {
            zzj(((com.google.android.gms.internal.ads.zzcqd) runnable).zza);
        }
    }
}
