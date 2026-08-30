package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfkh {
    protected final com.google.android.gms.ads.internal.ClientApi zza;
    protected final android.content.Context zzb;
    protected final int zzc;
    protected final com.google.android.gms.internal.ads.zzbpe zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    private final com.google.android.gms.ads.internal.client.zzcf zzg;
    private final com.google.android.gms.internal.ads.zzfjg zzi;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private com.google.android.gms.internal.ads.zzfjp zzn;
    private final com.google.android.gms.common.util.Clock zzo;
    private final java.util.concurrent.ConcurrentLinkedQueue zzh = new java.util.concurrent.ConcurrentLinkedQueue();
    protected final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean zzj = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzl = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean zzm = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzfkh(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfjg zzfjgVar, com.google.android.gms.common.util.Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpeVar;
        this.zze = zzftVar;
        this.zzg = zzcfVar;
        this.zzk = scheduledExecutorService;
        this.zzi = zzfjgVar;
        this.zzo = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzC(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Preloading " + zzftVar.zzb + ", for adUnitId:" + zzftVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.zzf.set(false);
    }

    private final synchronized void zzB() {
        java.util.Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.ads.zzfjx) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzC(boolean z) {
        if (this.zzi.zze()) {
            return;
        }
        if (z) {
            this.zzi.zzb();
        }
        this.zzk.schedule(new com.google.android.gms.internal.ads.zzfjy(this), this.zzi.zza(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private static final java.util.Optional zzD(java.util.Optional optional) {
        final java.lang.Class<com.google.android.gms.internal.ads.zzcvm> cls = com.google.android.gms.internal.ads.zzcvm.class;
        java.util.Objects.requireNonNull(com.google.android.gms.internal.ads.zzcvm.class);
        java.util.Optional optionalFilter = optional.filter(new java.util.function.Predicate() { // from class: com.google.android.gms.internal.ads.zzfjz
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return cls.isInstance((com.google.android.gms.ads.internal.client.zzdy) obj);
            }
        });
        final java.lang.Class<com.google.android.gms.internal.ads.zzcvm> cls2 = com.google.android.gms.internal.ads.zzcvm.class;
        java.util.Objects.requireNonNull(com.google.android.gms.internal.ads.zzcvm.class);
        return optionalFilter.map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzfka
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return (com.google.android.gms.internal.ads.zzcvm) cls2.cast((com.google.android.gms.ads.internal.client.zzdy) obj);
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzfkb
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.internal.ads.zzcvm) obj).zzk();
            }
        });
    }

    private final synchronized void zzu(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfjx zzfjxVar = new com.google.android.gms.internal.ads.zzfjx(obj, this.zzo);
        this.zzh.add(zzfjxVar);
        com.google.android.gms.common.util.Clock clock = this.zzo;
        final java.util.Optional optionalZzb = zzb(obj);
        final long jCurrentTimeMillis = clock.currentTimeMillis();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzx();
            }
        });
        this.zzk.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfkd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(jCurrentTimeMillis, optionalZzb);
            }
        });
        this.zzk.schedule(new com.google.android.gms.internal.ads.zzfjy(this), zzfjxVar.zza(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzv(java.lang.Throwable th) {
        this.zzj.set(false);
        if ((th instanceof com.google.android.gms.internal.ads.zzfjc) && ((com.google.android.gms.internal.ads.zzfjc) th).zza() == 0) {
            throw null;
        }
        zzC(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzw(java.lang.Object obj) {
        this.zzj.set(false);
        if (obj != null) {
            this.zzi.zzc();
            this.zzm.set(true);
            zzu(obj);
        }
        zzC(obj == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzx() {
        if (this.zzl.get()) {
            try {
                this.zzg.zze(this.zze);
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzy() {
        if (this.zzl.get()) {
            try {
                this.zzg.zzf(this.zze);
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void zzz() {
        if (this.zzm.get() && this.zzh.isEmpty()) {
            this.zzm.set(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfke
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy();
                }
            });
            this.zzk.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn();
                }
            });
        }
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zza();

    protected abstract java.util.Optional zzb(java.lang.Object obj);

    public final synchronized com.google.android.gms.internal.ads.zzfkh zzc() {
        this.zzk.submit(new com.google.android.gms.internal.ads.zzfjy(this));
        return this;
    }

    protected final synchronized java.lang.Object zzd() {
        com.google.android.gms.internal.ads.zzfjx zzfjxVar = (com.google.android.gms.internal.ads.zzfjx) this.zzh.peek();
        if (zzfjxVar == null) {
            return null;
        }
        return zzfjxVar.zzb();
    }

    public final synchronized java.lang.Object zze() {
        this.zzi.zzc();
        com.google.android.gms.internal.ads.zzfjx zzfjxVar = (com.google.android.gms.internal.ads.zzfjx) this.zzh.poll();
        this.zzm.set(zzfjxVar != null);
        zzl();
        if (zzfjxVar == null) {
            return null;
        }
        return zzfjxVar.zzb();
    }

    public final synchronized java.util.Optional zzf() {
        java.lang.Object objZzd;
        objZzd = zzd();
        return zzD(objZzd == null ? java.util.Optional.empty() : zzb(objZzd));
    }

    protected final synchronized void zzl() {
        zzB();
        zzz();
        if (!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
            this.zzj.set(true);
            com.google.android.gms.internal.ads.zzgch.zzr(zza(), new com.google.android.gms.internal.ads.zzfkg(this), this.zzk);
        }
    }

    final /* synthetic */ void zzm(long j, java.util.Optional optional) {
        com.google.android.gms.internal.ads.zzfjp zzfjpVar = this.zzn;
        if (zzfjpVar != null) {
            zzfjpVar.zzb(com.google.android.gms.ads.AdFormat.getAdFormat(this.zze.zzb), j, zzD(optional));
        }
    }

    final /* synthetic */ void zzn() {
        com.google.android.gms.internal.ads.zzfjp zzfjpVar = this.zzn;
        if (zzfjpVar != null) {
            zzfjpVar.zzc(com.google.android.gms.ads.AdFormat.getAdFormat(this.zze.zzb), this.zzo.currentTimeMillis());
        }
    }

    public final synchronized void zzo(int i) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 5);
        this.zzi.zzd(i);
    }

    public final synchronized void zzp() {
        this.zzf.set(true);
        this.zzl.set(true);
        this.zzk.submit(new com.google.android.gms.internal.ads.zzfjy(this));
    }

    public final void zzq(com.google.android.gms.internal.ads.zzfjp zzfjpVar) {
        this.zzn = zzfjpVar;
    }

    public final void zzr() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    protected final synchronized void zzs(int i) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0);
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        java.lang.String str = zzftVar.zza;
        int i2 = zzftVar.zzb;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzftVar.zzc;
        if (i <= 0) {
            i = zzftVar.zzd;
        }
        this.zze = new com.google.android.gms.ads.internal.client.zzft(str, i2, zzmVar, i);
    }

    public final synchronized boolean zzt() {
        zzB();
        return !this.zzh.isEmpty();
    }
}
