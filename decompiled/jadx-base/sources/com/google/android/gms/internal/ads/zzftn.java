package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzftn {
    private final com.google.android.gms.internal.ads.zzfvf zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfto zzc;
    private boolean zzf;
    private final android.content.Intent zzg;
    private android.content.ServiceConnection zzi;
    private android.os.IInterface zzj;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.lang.String zzd = "OverlayDisplayService";
    private final android.os.IBinder.DeathRecipient zzh = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.zza.zzk();
        }
    };

    zzftn(android.content.Context context, com.google.android.gms.internal.ads.zzfto zzftoVar, java.lang.String str, android.content.Intent intent, com.google.android.gms.internal.ads.zzfss zzfssVar) {
        this.zzb = context;
        this.zzc = zzftoVar;
        final java.lang.String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = com.google.android.gms.internal.ads.zzfvj.zza(new com.google.android.gms.internal.ads.zzfvf(str2) { // from class: com.google.android.gms.internal.ads.zzfte
            public final /* synthetic */ java.lang.String zza = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.zza, 10);
                handlerThread.start();
                return new android.os.Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(final java.lang.Runnable runnable) {
        ((android.os.Handler) this.zza.zza()).post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzl(runnable);
            }
        });
    }

    public final android.os.IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final java.lang.Runnable runnable) {
        zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(runnable);
            }
        });
    }

    final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    final /* synthetic */ void zzl(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e) {
            this.zzc.zza("error caused by ", e);
        }
    }

    final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new java.lang.Object[0]);
            android.content.Context context = this.zzb;
            android.content.ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm();
            }
        });
    }

    final /* synthetic */ void zzj(java.lang.Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zzc("Waiting to bind to the service.", new java.lang.Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            return;
        }
        this.zzc.zzc("Initiate binding to the service.", new java.lang.Object[0]);
        synchronized (this.zze) {
            this.zze.add(runnable);
        }
        com.google.android.gms.internal.ads.zzftl zzftlVar = new com.google.android.gms.internal.ads.zzftl(this, null);
        this.zzi = zzftlVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzftlVar, 1)) {
            return;
        }
        this.zzc.zzc("Failed to bind to the service.", new java.lang.Object[0]);
        this.zzf = false;
        synchronized (this.zze) {
            this.zze.clear();
        }
    }
}
