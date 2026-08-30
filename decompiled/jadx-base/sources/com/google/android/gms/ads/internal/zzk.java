package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzk implements java.lang.Runnable, com.google.android.gms.internal.ads.zzauv {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final java.util.concurrent.Executor zzh;
    private final com.google.android.gms.internal.ads.zzfni zzi;
    private android.content.Context zzj;
    private final android.content.Context zzk;
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzl;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final java.util.List zzc = new java.util.Vector();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    final java.util.concurrent.CountDownLatch zzb = new java.util.concurrent.CountDownLatch(1);

    public zzk(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        java.util.concurrent.ExecutorService executorServiceNewCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcy)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = com.google.android.gms.internal.ads.zzfni.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcv)).booleanValue();
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcz)).booleanValue();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcx)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdA)).booleanValue()) {
            this.zza = zzi();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdu)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(this);
            return;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(this);
        } else {
            run();
        }
    }

    private final com.google.android.gms.internal.ads.zzauv zzq() {
        return zzm() == 2 ? (com.google.android.gms.internal.ads.zzauv) this.zze.get() : (com.google.android.gms.internal.ads.zzauv) this.zzd.get();
    }

    private final void zzr() {
        java.util.List list = this.zzc;
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
        if (list.isEmpty() || zzauvVarZzq == null) {
            return;
        }
        for (java.lang.Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzauvVarZzq.zzk((android.view.MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzauvVarZzq.zzl(((java.lang.Integer) objArr[0]).intValue(), ((java.lang.Integer) objArr[1]).intValue(), ((java.lang.Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzs(boolean z) {
        java.lang.String str = this.zzl.afmaVersion;
        android.content.Context contextZzt = zzt(this.zzj);
        com.google.android.gms.internal.ads.zzare zzareVarZza = com.google.android.gms.internal.ads.zzarg.zza();
        zzareVarZza.zza(z);
        zzareVarZza.zzb(str);
        this.zzd.set(com.google.android.gms.internal.ads.zzauz.zzu(contextZzt, new com.google.android.gms.internal.ads.zzaux((com.google.android.gms.internal.ads.zzarg) zzareVarZza.zzbr())));
    }

    private static final android.content.Context zzt(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final com.google.android.gms.internal.ads.zzaus zzu(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        com.google.android.gms.internal.ads.zzare zzareVarZza = com.google.android.gms.internal.ads.zzarg.zza();
        zzareVarZza.zza(z);
        zzareVarZza.zzb(versionInfoParcel.afmaVersion);
        return com.google.android.gms.internal.ads.zzaus.zza(zzt(context), (com.google.android.gms.internal.ads.zzarg) zzareVarZza.zzbr(), z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdA)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbf)).booleanValue() && z) {
                z2 = true;
            }
            if (zzm() == 1) {
                zzs(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    com.google.android.gms.internal.ads.zzaus zzausVarZzu = zzu(this.zzj, this.zzl, z2, this.zzn);
                    this.zze.set(zzausVarZzu);
                    if (this.zzg && !zzausVarZzu.zzr()) {
                        this.zzo = 1;
                        zzs(z2);
                    }
                } catch (java.lang.NullPointerException e) {
                    this.zzo = 1;
                    zzs(z2);
                    this.zzi.zzc(2031, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final java.lang.String zzb(android.content.Context context, byte[] bArr) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq;
        if (!zzj() || (zzauvVarZzq = zzq()) == null) {
            return "";
        }
        zzr();
        return zzauvVarZzq.zzf(zzt(context));
    }

    final /* synthetic */ void zzc(boolean z) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z, this.zzn).zzp();
        } catch (java.lang.NullPointerException e) {
            this.zzi.zzc(2027, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzd(android.content.Context context, java.lang.String str, android.view.View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        if (!zzj()) {
            return "";
        }
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkz)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
        }
        if (zzauvVarZzq == null) {
            return "";
        }
        zzr();
        return zzauvVarZzq.zze(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzf(android.content.Context context) {
        return zzb(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzg(final android.content.Context context) {
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzgch.zzj(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzh).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcP)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return java.lang.Integer.toString(17);
        } catch (java.util.concurrent.TimeoutException unused2) {
            return com.google.android.gms.internal.ads.zzauo.zza(context, this.zzm.afmaVersion, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzh(android.content.Context context, android.view.View view, android.app.Activity activity) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzky)).booleanValue()) {
            com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkz)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
            }
            return zzauvVarZzq != null ? zzauvVarZzq.zzh(context, view, activity) : "";
        }
        if (!zzj()) {
            return "";
        }
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq2 = zzq();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkz)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        return zzauvVarZzq2 != null ? zzauvVarZzq2.zzh(context, view, activity) : "";
    }

    protected final boolean zzi() {
        android.content.Context context = this.zzj;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(this);
        com.google.android.gms.internal.ads.zzfni zzfniVar = this.zzi;
        return new com.google.android.gms.internal.ads.zzfpe(this.zzj, com.google.android.gms.internal.ads.zzfok.zzb(context, zzfniVar), zzjVar, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcw)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (java.lang.InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzk(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq == null) {
            this.zzc.add(new java.lang.Object[]{motionEvent});
        } else {
            zzr();
            zzauvVarZzq.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq == null) {
            this.zzc.add(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)});
        } else {
            zzr();
            zzauvVarZzq.zzl(i, i2, i3);
        }
    }

    protected final int zzm() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq;
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq2;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcU)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzauvVarZzq2 = zzq()) == null) {
                return;
            }
            zzauvVarZzq2.zzn(stackTraceElementArr);
            return;
        }
        if (!zzj() || (zzauvVarZzq = zzq()) == null) {
            return;
        }
        zzauvVarZzq.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzo(android.view.View view) {
        com.google.android.gms.internal.ads.zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq != null) {
            zzauvVarZzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}
