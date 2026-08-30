package com.google.android.gms.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* JADX INFO: loaded from: classes5.dex */
public class WakeLock {
    private static final long zzb = java.util.concurrent.TimeUnit.DAYS.toMillis(366);
    private static volatile java.util.concurrent.ScheduledExecutorService zzc = null;
    private static final java.lang.Object zzd = new java.lang.Object();
    private static volatile com.google.android.gms.stats.zzd zze = new com.google.android.gms.stats.zzb();
    com.google.android.gms.internal.stats.zzb zza;
    private final java.lang.Object zzf;
    private final android.os.PowerManager.WakeLock zzg;
    private int zzh;
    private java.util.concurrent.Future<?> zzi;
    private long zzj;
    private final java.util.Set<com.google.android.gms.stats.zze> zzk;
    private boolean zzl;
    private int zzm;
    private com.google.android.gms.common.util.Clock zzn;
    private android.os.WorkSource zzo;
    private final java.lang.String zzp;
    private final java.lang.String zzq;
    private final android.content.Context zzr;
    private final java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> zzs;
    private java.util.concurrent.atomic.AtomicInteger zzt;
    private final java.util.concurrent.ScheduledExecutorService zzu;

    public WakeLock(android.content.Context context, int i, java.lang.String str) {
        java.lang.String packageName = context.getPackageName();
        this.zzf = new java.lang.Object();
        this.zzh = 0;
        this.zzk = new java.util.HashSet();
        this.zzl = true;
        this.zzn = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzs = new java.util.HashMap();
        this.zzt = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.zza = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzp = str;
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            this.zzp = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new java.lang.String("*gcore*:");
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (powerManager == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append((java.lang.CharSequence) "expected a non-null reference", 0, 29);
            throw new com.google.android.gms.internal.stats.zzi(sb.toString());
        }
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.zzg = wakeLockNewWakeLock;
        if (com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(context)) {
            android.os.WorkSource workSourceFromPackage = com.google.android.gms.common.util.WorkSourceUtil.fromPackage(context, com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.zzo = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                zze(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (zzd) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    com.google.android.gms.internal.stats.zzh.zza();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1));
                    zzc = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.zzu = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(com.google.android.gms.stats.WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            if (wakeLock.isHeld()) {
                android.util.Log.e("WakeLock", java.lang.String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.zzc();
                if (wakeLock.isHeld()) {
                    wakeLock.zzh = 1;
                    wakeLock.zzd(0);
                }
            }
        }
    }

    private final java.lang.String zzb(java.lang.String str) {
        if (this.zzl) {
            android.text.TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i) {
        synchronized (this.zzf) {
            if (isHeld()) {
                if (this.zzl) {
                    int i2 = this.zzh - 1;
                    this.zzh = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.zzh = 0;
                }
                zzc();
                java.util.Iterator<com.google.android.gms.stats.zzc> it = this.zzs.values().iterator();
                while (it.hasNext()) {
                    it.next().zza = 0;
                }
                this.zzs.clear();
                java.util.concurrent.Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                    this.zzi = null;
                    this.zzj = 0L;
                }
                this.zzm = 0;
                try {
                    if (this.zzg.isHeld()) {
                        try {
                            this.zzg.release();
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        } catch (java.lang.RuntimeException e) {
                            if (!e.getClass().equals(java.lang.RuntimeException.class)) {
                                throw e;
                            }
                            android.util.Log.e("WakeLock", java.lang.String.valueOf(this.zzp).concat(" failed to release!"), e);
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        }
                    } else {
                        android.util.Log.e("WakeLock", java.lang.String.valueOf(this.zzp).concat(" should be held!"));
                    }
                } catch (java.lang.Throwable th) {
                    if (this.zza != null) {
                        this.zza = null;
                    }
                    throw th;
                }
            }
        }
    }

    private static void zze(android.os.PowerManager.WakeLock wakeLock, android.os.WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException e) {
            android.util.Log.wtf("WakeLock", e.toString());
        }
    }

    public void acquire(long j) {
        this.zzt.incrementAndGet();
        long jMax = java.lang.Math.max(java.lang.Math.min(Long.MAX_VALUE, zzb), 1L);
        if (j > 0) {
            jMax = java.lang.Math.min(j, jMax);
        }
        synchronized (this.zzf) {
            if (!isHeld()) {
                this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                this.zzg.acquire();
                this.zzn.elapsedRealtime();
            }
            this.zzh++;
            this.zzm++;
            zzb(null);
            com.google.android.gms.stats.zzc zzcVar = this.zzs.get(null);
            if (zzcVar == null) {
                zzcVar = new com.google.android.gms.stats.zzc(null);
                this.zzs.put(null, zzcVar);
            }
            zzcVar.zza++;
            long jElapsedRealtime = this.zzn.elapsedRealtime();
            long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j2 > this.zzj) {
                this.zzj = j2;
                java.util.concurrent.Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzi = this.zzu.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.stats.WakeLock.zza(this.zza);
                    }
                }, jMax, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean isHeld() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzh > 0;
        }
        return z;
    }

    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            android.util.Log.e("WakeLock", java.lang.String.valueOf(this.zzp).concat(" release without a matched acquire!"));
        }
        synchronized (this.zzf) {
            zzb(null);
            if (this.zzs.containsKey(null)) {
                com.google.android.gms.stats.zzc zzcVar = this.zzs.get(null);
                if (zzcVar != null) {
                    int i = zzcVar.zza - 1;
                    zzcVar.zza = i;
                    if (i == 0) {
                        this.zzs.remove(null);
                    }
                }
            } else {
                android.util.Log.w("WakeLock", java.lang.String.valueOf(this.zzp).concat(" counter does not exist"));
            }
            zzd(0);
        }
    }

    public void setReferenceCounted(boolean z) {
        synchronized (this.zzf) {
            this.zzl = z;
        }
    }
}
