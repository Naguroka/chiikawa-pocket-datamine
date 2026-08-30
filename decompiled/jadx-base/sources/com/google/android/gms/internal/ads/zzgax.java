package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgax<V> extends com.google.android.gms.internal.ads.zzgdl implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final java.lang.Object zzbd;
    private static final com.google.android.gms.internal.ads.zzgax.zza zzbg;
    static final boolean zzd;
    static final com.google.android.gms.internal.ads.zzgcq zze;

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.ads.zzgax.zzd listeners;

    @javax.annotation.CheckForNull
    private volatile java.lang.Object value;

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.ads.zzgax.zzk waiters;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    abstract class zza {
        /* synthetic */ zza(com.google.android.gms.internal.ads.zzgba zzgbaVar) {
        }

        abstract com.google.android.gms.internal.ads.zzgax.zzd zza(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar);

        abstract com.google.android.gms.internal.ads.zzgax.zzk zzb(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzk zzkVar);

        abstract void zzc(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2);

        abstract void zzd(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, java.lang.Thread thread);

        abstract boolean zze(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzd zzdVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar2);

        abstract boolean zzf(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2);

        abstract boolean zzg(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzb {

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.ads.zzgax.zzb zza;

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.ads.zzgax.zzb zzb;
        final boolean zzc;

        @javax.annotation.CheckForNull
        final java.lang.Throwable zzd;

        static {
            if (com.google.android.gms.internal.ads.zzgax.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new com.google.android.gms.internal.ads.zzgax.zzb(false, null);
                zza = new com.google.android.gms.internal.ads.zzgax.zzb(true, null);
            }
        }

        zzb(boolean z, @javax.annotation.CheckForNull java.lang.Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzc {
        static final com.google.android.gms.internal.ads.zzgax.zzc zza = new com.google.android.gms.internal.ads.zzgax.zzc(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgax.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable zzb;

        zzc(java.lang.Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzd {
        static final com.google.android.gms.internal.ads.zzgax.zzd zza = new com.google.android.gms.internal.ads.zzgax.zzd();

        @javax.annotation.CheckForNull
        com.google.android.gms.internal.ads.zzgax.zzd next;

        @javax.annotation.CheckForNull
        final java.lang.Runnable zzb;

        @javax.annotation.CheckForNull
        final java.util.concurrent.Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zze extends com.google.android.gms.internal.ads.zzgax.zza {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.ads.zzgax.zzk, java.lang.Thread> zza;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.ads.zzgax.zzk, com.google.android.gms.internal.ads.zzgax.zzk> zzb;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzgax<?>, com.google.android.gms.internal.ads.zzgax.zzk> zzc;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzgax<?>, com.google.android.gms.internal.ads.zzgax.zzd> zzd;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzgax<?>, java.lang.Object> zze;

        zze(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzd zza(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar) {
            return this.zzd.getAndSet(zzgaxVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzk zzb(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzk zzkVar) {
            return this.zzc.getAndSet(zzgaxVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzc(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzd(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, java.lang.Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zze(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzd zzdVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar2) {
            return com.google.android.gms.internal.ads.zzgay.zza(this.zzd, zzgaxVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzf(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.ads.zzgay.zza(this.zze, zzgaxVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            return com.google.android.gms.internal.ads.zzgay.zza(this.zzc, zzgaxVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzf<V> implements java.lang.Runnable {
        final com.google.android.gms.internal.ads.zzgax<V> zza;
        final com.google.common.util.concurrent.ListenableFuture<? extends V> zzb;

        zzf(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
            this.zza = zzgaxVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((com.google.android.gms.internal.ads.zzgax) this.zza).value != this) {
                return;
            }
            com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = this.zzb;
            if (com.google.android.gms.internal.ads.zzgax.zzbg.zzf(this.zza, this, com.google.android.gms.internal.ads.zzgax.zze(listenableFuture))) {
                com.google.android.gms.internal.ads.zzgax.zzx(this.zza, false);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzg extends com.google.android.gms.internal.ads.zzgax.zza {
        private zzg() {
            throw null;
        }

        /* synthetic */ zzg(com.google.android.gms.internal.ads.zzgba zzgbaVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzd zza(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar) {
            com.google.android.gms.internal.ads.zzgax.zzd zzdVar2;
            synchronized (zzgaxVar) {
                zzdVar2 = zzgaxVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzgaxVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzk zzb(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzk zzkVar) {
            com.google.android.gms.internal.ads.zzgax.zzk zzkVar2;
            synchronized (zzgaxVar) {
                zzkVar2 = zzgaxVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzgaxVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzc(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzd(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, java.lang.Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zze(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzd zzdVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar2) {
            synchronized (zzgaxVar) {
                if (zzgaxVar.listeners != zzdVar) {
                    return false;
                }
                zzgaxVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzf(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            synchronized (zzgaxVar) {
                if (zzgaxVar.value != obj) {
                    return false;
                }
                zzgaxVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            synchronized (zzgaxVar) {
                if (zzgaxVar.waiters != zzkVar) {
                    return false;
                }
                zzgaxVar.waiters = zzkVar2;
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    interface zzh<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    abstract class zzi<V> extends com.google.android.gms.internal.ads.zzgax<V> implements com.google.android.gms.internal.ads.zzgax.zzh<V> {
        zzi() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzj extends com.google.android.gms.internal.ads.zzgax.zza {
        static final sun.misc.Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgax.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ sun.misc.Unsafe run() throws java.lang.Exception {
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
                zzc = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzgax.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzgax.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzgax.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzgax.zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzgax.zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }

        private zzj() {
            throw null;
        }

        /* synthetic */ zzj(com.google.android.gms.internal.ads.zzgba zzgbaVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzd zza(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar) {
            com.google.android.gms.internal.ads.zzgax.zzd zzdVar2;
            do {
                zzdVar2 = zzgaxVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgaxVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final com.google.android.gms.internal.ads.zzgax.zzk zzb(com.google.android.gms.internal.ads.zzgax zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzk zzkVar) {
            com.google.android.gms.internal.ads.zzgax.zzk zzkVar2;
            do {
                zzkVar2 = zzgaxVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgaxVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzc(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final void zzd(com.google.android.gms.internal.ads.zzgax.zzk zzkVar, java.lang.Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zze(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzd zzdVar, com.google.android.gms.internal.ads.zzgax.zzd zzdVar2) {
            return com.google.android.gms.internal.ads.zzgaz.zza(zza, zzgaxVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzf(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.ads.zzgaz.zza(zza, zzgaxVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzgax zzgaxVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar, @javax.annotation.CheckForNull com.google.android.gms.internal.ads.zzgax.zzk zzkVar2) {
            return com.google.android.gms.internal.ads.zzgaz.zza(zza, zzgaxVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    final class zzk {
        static final com.google.android.gms.internal.ads.zzgax.zzk zza = new com.google.android.gms.internal.ads.zzgax.zzk(false);

        @javax.annotation.CheckForNull
        volatile com.google.android.gms.internal.ads.zzgax.zzk next;

        @javax.annotation.CheckForNull
        volatile java.lang.Thread thread;

        zzk() {
            com.google.android.gms.internal.ads.zzgax.zzbg.zzd(this, java.lang.Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.ads.zzgax.zza zzgVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        zzd = z;
        zze = new com.google.android.gms.internal.ads.zzgcq(com.google.android.gms.internal.ads.zzgax.class);
        com.google.android.gms.internal.ads.zzgba zzgbaVar = null;
        try {
            zzgVar = new com.google.android.gms.internal.ads.zzgax.zzj(zzgbaVar);
            th2 = null;
            th = null;
        } catch (java.lang.Error | java.lang.Exception e) {
            try {
                th2 = e;
                zzgVar = new com.google.android.gms.internal.ads.zzgax.zze(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgax.zzk.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgax.zzk.class, com.google.android.gms.internal.ads.zzgax.zzk.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgax.class, com.google.android.gms.internal.ads.zzgax.zzk.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgax.class, com.google.android.gms.internal.ads.zzgax.zzd.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzgax.class, java.lang.Object.class, "value"));
                th = null;
            } catch (java.lang.Error | java.lang.Exception e2) {
                th = e2;
                th2 = e;
                zzgVar = new com.google.android.gms.internal.ads.zzgax.zzg(zzgbaVar);
            }
        }
        zzbg = zzgVar;
        if (th != null) {
            com.google.android.gms.internal.ads.zzgcq zzgcqVar = zze;
            zzgcqVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgcqVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new java.lang.Object();
    }

    protected zzgax() {
    }

    private static final java.lang.Object zzA(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzb) {
            java.lang.Throwable th = ((com.google.android.gms.internal.ads.zzgax.zzb) obj).zzd;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzc) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.ads.zzgax.zzc) obj).zzb);
        }
        if (obj == zzbd) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object zze(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        java.lang.Throwable thZzl;
        if (listenableFuture instanceof com.google.android.gms.internal.ads.zzgax.zzh) {
            java.lang.Object zzbVar = ((com.google.android.gms.internal.ads.zzgax) listenableFuture).value;
            if (zzbVar instanceof com.google.android.gms.internal.ads.zzgax.zzb) {
                com.google.android.gms.internal.ads.zzgax.zzb zzbVar2 = (com.google.android.gms.internal.ads.zzgax.zzb) zzbVar;
                if (zzbVar2.zzc) {
                    java.lang.Throwable th = zzbVar2.zzd;
                    zzbVar = th != null ? new com.google.android.gms.internal.ads.zzgax.zzb(false, th) : com.google.android.gms.internal.ads.zzgax.zzb.zzb;
                }
            }
            return java.util.Objects.requireNonNull(zzbVar);
        }
        if ((listenableFuture instanceof com.google.android.gms.internal.ads.zzgdl) && (thZzl = ((com.google.android.gms.internal.ads.zzgdl) listenableFuture).zzl()) != null) {
            return new com.google.android.gms.internal.ads.zzgax.zzc(thZzl);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!zzd) && zIsCancelled) {
            return java.util.Objects.requireNonNull(com.google.android.gms.internal.ads.zzgax.zzb.zzb);
        }
        try {
            java.lang.Object objZzf = zzf(listenableFuture);
            if (!zIsCancelled) {
                return objZzf == null ? zzbd : objZzf;
            }
            return new com.google.android.gms.internal.ads.zzgax.zzb(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + java.lang.String.valueOf(listenableFuture)));
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.android.gms.internal.ads.zzgax.zzc(e);
        } catch (java.util.concurrent.CancellationException e2) {
            return !zIsCancelled ? new com.google.android.gms.internal.ads.zzgax.zzc(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(listenableFuture))), e2)) : new com.google.android.gms.internal.ads.zzgax.zzb(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            return zIsCancelled ? new com.google.android.gms.internal.ads.zzgax.zzb(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(listenableFuture))), e3)) : new com.google.android.gms.internal.ads.zzgax.zzc(e3.getCause());
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.android.gms.internal.ads.zzgax.zzc(e);
        }
    }

    private static java.lang.Object zzf(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objZzf = zzf(this);
            sb.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb.append("null");
            } else if (objZzf == this) {
                sb.append("this future");
            } else {
                sb.append(objZzf.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(objZzf)));
            }
            sb.append(com.ironsource.y8.i.e);
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(com.ironsource.y8.i.e);
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(java.lang.StringBuilder sb) {
        java.lang.String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((com.google.android.gms.internal.ads.zzgax.zzf) obj).zzb);
            sb.append(com.ironsource.y8.i.e);
        } else {
            try {
                strConcat = com.google.android.gms.internal.ads.zzfve.zza(zza());
            } catch (java.lang.Exception | java.lang.StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e.getClass())));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append(com.ironsource.y8.i.e);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(java.lang.StringBuilder sb, @javax.annotation.CheckForNull java.lang.Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (java.lang.Exception | java.lang.StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(com.google.android.gms.internal.ads.zzgax zzgaxVar, boolean z) {
        com.google.android.gms.internal.ads.zzgax.zzd zzdVar = null;
        while (true) {
            for (com.google.android.gms.internal.ads.zzgax.zzk zzkVarZzb = zzbg.zzb(zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                java.lang.Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzgaxVar.zzq();
            }
            zzgaxVar.zzb();
            com.google.android.gms.internal.ads.zzgax.zzd zzdVar2 = zzdVar;
            com.google.android.gms.internal.ads.zzgax.zzd zzdVarZza = zzbg.zza(zzgaxVar, com.google.android.gms.internal.ads.zzgax.zzd.zza);
            com.google.android.gms.internal.ads.zzgax.zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                com.google.android.gms.internal.ads.zzgax.zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                java.lang.Runnable runnable = (java.lang.Runnable) java.util.Objects.requireNonNull(zzdVar3.zzb);
                if (runnable instanceof com.google.android.gms.internal.ads.zzgax.zzf) {
                    com.google.android.gms.internal.ads.zzgax.zzf zzfVar = (com.google.android.gms.internal.ads.zzgax.zzf) runnable;
                    zzgaxVar = zzfVar.zza;
                    if (zzgaxVar.value == zzfVar) {
                        if (zzbg.zzf(zzgaxVar, zzfVar, zze(zzfVar.zzb))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    zzy(runnable, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(zzdVar3.zzc));
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzy(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            zze.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    private final void zzz(com.google.android.gms.internal.ads.zzgax.zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            com.google.android.gms.internal.ads.zzgax.zzk zzkVar2 = this.waiters;
            if (zzkVar2 != com.google.android.gms.internal.ads.zzgax.zzk.zza) {
                com.google.android.gms.internal.ads.zzgax.zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    com.google.android.gms.internal.ads.zzgax.zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                        }
                    } else if (!zzbg.zzg(this, zzkVar2, zzkVar4)) {
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgax.zzd zzdVar;
        com.google.android.gms.internal.ads.zzfun.zzc(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.zzfun.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != com.google.android.gms.internal.ads.zzgax.zzd.zza) {
            com.google.android.gms.internal.ads.zzgax.zzd zzdVar2 = new com.google.android.gms.internal.ads.zzgax.zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbg.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != com.google.android.gms.internal.ads.zzgax.zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        java.lang.Object objRequireNonNull;
        java.lang.Object obj = this.value;
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgax.zzf) && !(obj == null)) {
            return false;
        }
        if (zzd) {
            objRequireNonNull = new com.google.android.gms.internal.ads.zzgax.zzb(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            objRequireNonNull = java.util.Objects.requireNonNull(z ? com.google.android.gms.internal.ads.zzgax.zzb.zza : com.google.android.gms.internal.ads.zzgax.zzb.zzb);
        }
        com.google.android.gms.internal.ads.zzgax<V> zzgaxVar = this;
        boolean z2 = false;
        while (true) {
            if (zzbg.zzf(zzgaxVar, obj, objRequireNonNull)) {
                zzx(zzgaxVar, z);
                if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzf) {
                    com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((com.google.android.gms.internal.ads.zzgax.zzf) obj).zzb;
                    if (listenableFuture instanceof com.google.android.gms.internal.ads.zzgax.zzh) {
                        zzgaxVar = (com.google.android.gms.internal.ads.zzgax) listenableFuture;
                        obj = zzgaxVar.value;
                        if ((obj == null) | (obj instanceof com.google.android.gms.internal.ads.zzgax.zzf)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = zzgaxVar.value;
            if (!(obj instanceof com.google.android.gms.internal.ads.zzgax.zzf)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.ads.zzgax.zzf))) {
            return zzA(obj2);
        }
        com.google.android.gms.internal.ads.zzgax.zzk zzkVar = this.waiters;
        if (zzkVar != com.google.android.gms.internal.ads.zzgax.zzk.zza) {
            com.google.android.gms.internal.ads.zzgax.zzk zzkVar2 = new com.google.android.gms.internal.ads.zzgax.zzk();
            do {
                com.google.android.gms.internal.ads.zzgax.zza zzaVar = zzbg;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof com.google.android.gms.internal.ads.zzgax.zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != com.google.android.gms.internal.ads.zzgax.zzk.zza);
        }
        return zzA(java.util.Objects.requireNonNull(this.value));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof com.google.android.gms.internal.ads.zzgax.zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.value;
        return (obj != null) & (!(obj instanceof com.google.android.gms.internal.ads.zzgax.zzf));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    protected java.lang.String zza() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void zzb() {
    }

    protected boolean zzc(java.lang.Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzbg.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    protected boolean zzd(java.lang.Throwable th) {
        th.getClass();
        if (!zzbg.zzf(this, null, new com.google.android.gms.internal.ads.zzgax.zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    @javax.annotation.CheckForNull
    protected final java.lang.Throwable zzl() {
        if (!(this instanceof com.google.android.gms.internal.ads.zzgax.zzh)) {
            return null;
        }
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzc) {
            return ((com.google.android.gms.internal.ads.zzgax.zzc) obj).zzb;
        }
        return null;
    }

    protected void zzq() {
    }

    final void zzr(@javax.annotation.CheckForNull java.util.concurrent.Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    protected final boolean zzt() {
        java.lang.Object obj = this.value;
        return (obj instanceof com.google.android.gms.internal.ads.zzgax.zzb) && ((com.google.android.gms.internal.ads.zzgax.zzb) obj).zzc;
    }

    protected final boolean zzs(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.internal.ads.zzgax.zzc zzcVar;
        listenableFuture.getClass();
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzbg.zzf(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            com.google.android.gms.internal.ads.zzgax.zzf zzfVar = new com.google.android.gms.internal.ads.zzgax.zzf(this, listenableFuture);
            if (zzbg.zzf(this, null, zzfVar)) {
                try {
                    listenableFuture.addListener(zzfVar, com.google.android.gms.internal.ads.zzgbv.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        zzcVar = new com.google.android.gms.internal.ads.zzgax.zzc(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        zzcVar = com.google.android.gms.internal.ads.zzgax.zzc.zza;
                    }
                    zzbg.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgax.zzb) {
            listenableFuture.cancel(((com.google.android.gms.internal.ads.zzgax.zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof com.google.android.gms.internal.ads.zzgax.zzf))) {
                return zzA(obj);
            }
            long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                com.google.android.gms.internal.ads.zzgax.zzk zzkVar = this.waiters;
                if (zzkVar != com.google.android.gms.internal.ads.zzgax.zzk.zza) {
                    com.google.android.gms.internal.ads.zzgax.zzk zzkVar2 = new com.google.android.gms.internal.ads.zzgax.zzk();
                    while (true) {
                        com.google.android.gms.internal.ads.zzgax.zza zzaVar = zzbg;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                                if (java.lang.Thread.interrupted()) {
                                    zzz(zzkVar2);
                                    throw new java.lang.InterruptedException();
                                }
                                java.lang.Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof com.google.android.gms.internal.ads.zzgax.zzf)))) {
                                    nanos = jNanoTime - java.lang.System.nanoTime();
                                } else {
                                    return zzA(obj2);
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                            break;
                        }
                        zzkVar = this.waiters;
                        if (zzkVar == com.google.android.gms.internal.ads.zzgax.zzk.zza) {
                        }
                    }
                }
                return zzA(java.util.Objects.requireNonNull(this.value));
            }
            while (nanos > 0) {
                java.lang.Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof com.google.android.gms.internal.ads.zzgax.zzf)))) {
                    if (!java.lang.Thread.interrupted()) {
                        nanos = jNanoTime - java.lang.System.nanoTime();
                    } else {
                        throw new java.lang.InterruptedException();
                    }
                } else {
                    return zzA(obj3);
                }
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
        throw new java.lang.InterruptedException();
    }
}
