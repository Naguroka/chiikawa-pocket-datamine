package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzck<V> extends com.google.android.gms.internal.play_billing.zzdf implements com.google.android.gms.internal.play_billing.zzcz<V> {
    static final java.lang.Object zza = new java.lang.Object();
    static final com.google.android.gms.internal.play_billing.zzcy zzb = new com.google.android.gms.internal.play_billing.zzcy(com.google.android.gms.internal.play_billing.zzcj.class);
    static final boolean zzc;
    private static final com.google.android.gms.internal.play_billing.zzck.zza zzd;
    volatile com.google.android.gms.internal.play_billing.zzcj.zzd listenersField;
    volatile java.lang.Object valueField;
    volatile com.google.android.gms.internal.play_billing.zzck.zze waitersField;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    abstract class zza {
        /* synthetic */ zza(com.google.android.gms.internal.play_billing.zzco zzcoVar) {
        }

        abstract com.google.android.gms.internal.play_billing.zzcj.zzd zza(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar);

        abstract com.google.android.gms.internal.play_billing.zzck.zze zzb(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar);

        abstract void zzc(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2);

        abstract void zzd(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, java.lang.Thread thread);

        abstract boolean zze(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2);

        abstract boolean zzf(com.google.android.gms.internal.play_billing.zzck zzckVar, java.lang.Object obj, java.lang.Object obj2);

        abstract boolean zzg(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2);
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzb extends com.google.android.gms.internal.play_billing.zzck.zza {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.play_billing.zzck.zze, java.lang.Thread> zza = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck.zze.class, java.lang.Thread.class, "thread");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.play_billing.zzck.zze, com.google.android.gms.internal.play_billing.zzck.zze> zzb = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck.zze.class, com.google.android.gms.internal.play_billing.zzck.zze.class, "next");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.play_billing.zzck<?>, com.google.android.gms.internal.play_billing.zzck.zze> zzc = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck.class, com.google.android.gms.internal.play_billing.zzck.zze.class, "waitersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.play_billing.zzck<?>, com.google.android.gms.internal.play_billing.zzcj.zzd> zzd = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck.class, com.google.android.gms.internal.play_billing.zzcj.zzd.class, "listenersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.play_billing.zzck<?>, java.lang.Object> zze = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck.class, java.lang.Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(com.google.android.gms.internal.play_billing.zzco zzcoVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzcj.zzd zza(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar) {
            return zzd.getAndSet(zzckVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzck.zze zzb(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar) {
            return zzc.getAndSet(zzckVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzc(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzd(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, java.lang.Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zze(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2) {
            return com.google.android.gms.internal.play_billing.zzcl.zza(zzd, zzckVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzf(com.google.android.gms.internal.play_billing.zzck zzckVar, java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.play_billing.zzcl.zza(zze, zzckVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzg(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            return com.google.android.gms.internal.play_billing.zzcl.zza(zzc, zzckVar, zzeVar, zzeVar2);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzc extends com.google.android.gms.internal.play_billing.zzck.zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(com.google.android.gms.internal.play_billing.zzco zzcoVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzcj.zzd zza(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar) {
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2;
            synchronized (zzckVar) {
                zzdVar2 = zzckVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzckVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzck.zze zzb(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar) {
            com.google.android.gms.internal.play_billing.zzck.zze zzeVar2;
            synchronized (zzckVar) {
                zzeVar2 = zzckVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzckVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzc(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzd(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, java.lang.Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zze(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2) {
            synchronized (zzckVar) {
                if (zzckVar.listenersField != zzdVar) {
                    return false;
                }
                zzckVar.listenersField = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzf(com.google.android.gms.internal.play_billing.zzck zzckVar, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (zzckVar) {
                if (zzckVar.valueField != obj) {
                    return false;
                }
                zzckVar.valueField = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzg(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            synchronized (zzckVar) {
                if (zzckVar.waitersField != zzeVar) {
                    return false;
                }
                zzckVar.waitersField = zzeVar2;
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zzd extends com.google.android.gms.internal.play_billing.zzck.zza {
        static final sun.misc.Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcn
                    @Override // java.security.PrivilegedExceptionAction
                    public final java.lang.Object run() throws java.lang.IllegalAccessException {
                        int i = com.google.android.gms.internal.play_billing.zzck.zzd.zzg;
                        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            java.lang.Object obj = field.get(null);
                            if (sun.misc.Unsafe.class.isInstance(obj)) {
                                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                            }
                        }
                        throw new java.lang.NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.zzck.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.zzck.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.zzck.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.zzck.zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.zzck.zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(com.google.android.gms.internal.play_billing.zzco zzcoVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzcj.zzd zza(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar) {
            com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2;
            do {
                zzdVar2 = zzckVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzckVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final com.google.android.gms.internal.play_billing.zzck.zze zzb(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar) {
            com.google.android.gms.internal.play_billing.zzck.zze zzeVar2;
            do {
                zzeVar2 = zzckVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzckVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzc(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final void zzd(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, java.lang.Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zze(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2) {
            return com.google.android.gms.internal.play_billing.zzcm.zza(zza, zzckVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzf(com.google.android.gms.internal.play_billing.zzck zzckVar, java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.play_billing.zzcm.zza(zza, zzckVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        final boolean zzg(com.google.android.gms.internal.play_billing.zzck zzckVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar, com.google.android.gms.internal.play_billing.zzck.zze zzeVar2) {
            return com.google.android.gms.internal.play_billing.zzcm.zza(zza, zzckVar, zzc, zzeVar, zzeVar2);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    final class zze {
        static final com.google.android.gms.internal.play_billing.zzck.zze zza = new com.google.android.gms.internal.play_billing.zzck.zze(false);
        volatile com.google.android.gms.internal.play_billing.zzck.zze next;
        volatile java.lang.Thread thread;

        zze() {
            com.google.android.gms.internal.play_billing.zzck.zzn(this, java.lang.Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.play_billing.zzck.zza zzcVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        zzc = z;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        com.google.android.gms.internal.play_billing.zzco zzcoVar = null;
        if (property == null || property.contains(com.json.y8.d)) {
            try {
                zzcVar = new com.google.android.gms.internal.play_billing.zzck.zzd(zzcoVar);
            } catch (java.lang.Error | java.lang.Exception e) {
                try {
                    th = e;
                    th2 = null;
                    zzcVar = new com.google.android.gms.internal.play_billing.zzck.zzb(zzcoVar);
                } catch (java.lang.Error | java.lang.Exception e2) {
                    th = e;
                    th2 = e2;
                    zzcVar = new com.google.android.gms.internal.play_billing.zzck.zzc(zzcoVar);
                }
            }
        } else {
            try {
                zzcVar = new com.google.android.gms.internal.play_billing.zzck.zzb(zzcoVar);
            } catch (java.lang.NoClassDefFoundError unused2) {
                zzcVar = new com.google.android.gms.internal.play_billing.zzck.zzc(zzcoVar);
            }
        }
        th2 = null;
        th = null;
        zzd = zzcVar;
        if (th2 != null) {
            com.google.android.gms.internal.play_billing.zzcy zzcyVar = zzb;
            zzcyVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzcyVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzck() {
    }

    private final void zza(com.google.android.gms.internal.play_billing.zzck.zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            com.google.android.gms.internal.play_billing.zzck.zze zzeVar2 = this.waitersField;
            if (zzeVar2 != com.google.android.gms.internal.play_billing.zzck.zze.zza) {
                com.google.android.gms.internal.play_billing.zzck.zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    com.google.android.gms.internal.play_billing.zzck.zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzd.zzg(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.play_billing.zzck.zze zzeVar, java.lang.Thread thread) {
        zzd.zzd(zzeVar, thread);
    }

    static boolean zzq(com.google.android.gms.internal.play_billing.zzck zzckVar, java.lang.Object obj, java.lang.Object obj2) {
        return zzd.zzf(zzckVar, obj, obj2);
    }

    final com.google.android.gms.internal.play_billing.zzcj.zzd zzk(com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar) {
        return zzd.zza(this, zzdVar);
    }

    final java.lang.Object zzl() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.valueField;
        if ((obj2 != null) && com.google.android.gms.internal.play_billing.zzcj.zzh(obj2)) {
            return com.google.android.gms.internal.play_billing.zzcj.zzc(obj2);
        }
        com.google.android.gms.internal.play_billing.zzck.zze zzeVar = this.waitersField;
        if (zzeVar != com.google.android.gms.internal.play_billing.zzck.zze.zza) {
            com.google.android.gms.internal.play_billing.zzck.zze zzeVar2 = new com.google.android.gms.internal.play_billing.zzck.zze();
            do {
                com.google.android.gms.internal.play_billing.zzck.zza zzaVar = zzd;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & com.google.android.gms.internal.play_billing.zzcj.zzh(obj)));
                    return com.google.android.gms.internal.play_billing.zzcj.zzc(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != com.google.android.gms.internal.play_billing.zzck.zze.zza);
        }
        return com.google.android.gms.internal.play_billing.zzcj.zzc(java.util.Objects.requireNonNull(this.valueField));
    }

    final java.lang.Object zzm(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && com.google.android.gms.internal.play_billing.zzcj.zzh(obj)) {
            return com.google.android.gms.internal.play_billing.zzcj.zzc(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.android.gms.internal.play_billing.zzck.zze zzeVar = this.waitersField;
            if (zzeVar != com.google.android.gms.internal.play_billing.zzck.zze.zza) {
                com.google.android.gms.internal.play_billing.zzck.zze zzeVar2 = new com.google.android.gms.internal.play_billing.zzck.zze();
                while (true) {
                    com.google.android.gms.internal.play_billing.zzck.zza zzaVar = zzd;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.valueField;
                            if ((obj2 != null) && com.google.android.gms.internal.play_billing.zzcj.zzh(obj2)) {
                                return com.google.android.gms.internal.play_billing.zzcj.zzc(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == com.google.android.gms.internal.play_billing.zzck.zze.zza) {
                    }
                }
            }
            return com.google.android.gms.internal.play_billing.zzcj.zzc(java.util.Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.valueField;
            if ((obj3 != null) && com.google.android.gms.internal.play_billing.zzcj.zzh(obj3)) {
                return com.google.android.gms.internal.play_billing.zzcj.zzc(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                java.lang.String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(strConcat + " for " + string);
    }

    final void zzo() {
        for (com.google.android.gms.internal.play_billing.zzck.zze zzeVarZzb = zzd.zzb(this, com.google.android.gms.internal.play_billing.zzck.zze.zza); zzeVarZzb != null; zzeVarZzb = zzeVarZzb.next) {
            java.lang.Thread thread = zzeVarZzb.thread;
            if (thread != null) {
                zzeVarZzb.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    final boolean zzp(com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar, com.google.android.gms.internal.play_billing.zzcj.zzd zzdVar2) {
        return zzd.zze(this, zzdVar, zzdVar2);
    }
}
