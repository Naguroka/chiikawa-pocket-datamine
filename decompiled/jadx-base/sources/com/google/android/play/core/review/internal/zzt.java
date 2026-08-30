package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzt {
    private static final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.play.core.review.internal.zzi zzc;
    private boolean zzh;
    private final android.content.Intent zzi;
    private android.content.ServiceConnection zzm;
    private android.os.IInterface zzn;
    private final com.google.android.play.core.review.zze zzo;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.Set zzf = new java.util.HashSet();
    private final java.lang.Object zzg = new java.lang.Object();
    private final android.os.IBinder.DeathRecipient zzk = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzl
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.play.core.review.internal.zzt.zzh(this.zza);
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger zzl = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.String zzd = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    private final java.lang.ref.WeakReference zzj = new java.lang.ref.WeakReference(null);

    public zzt(android.content.Context context, com.google.android.play.core.review.internal.zzi zziVar, java.lang.String str, android.content.Intent intent, com.google.android.play.core.review.zze zzeVar, com.google.android.play.core.review.internal.zzo zzoVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zziVar;
        this.zzi = intent;
        this.zzo = zzeVar;
    }

    public static /* synthetic */ void zzh(com.google.android.play.core.review.internal.zzt zztVar) {
        zztVar.zzc.zzd("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.play.core.review.internal.zzo zzoVar = (com.google.android.play.core.review.internal.zzo) zztVar.zzj.get();
        if (zzoVar != null) {
            zztVar.zzc.zzd("calling onBinderDied", new java.lang.Object[0]);
            zzoVar.zza();
        } else {
            zztVar.zzc.zzd("%s : Binder has died.", zztVar.zzd);
            java.util.Iterator it = zztVar.zze.iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.review.internal.zzj) it.next()).zzc(zztVar.zzs());
            }
            zztVar.zze.clear();
        }
        zztVar.zzt();
    }

    static /* bridge */ /* synthetic */ void zzn(com.google.android.play.core.review.internal.zzt zztVar) {
        zztVar.zzc.zzd("linkToDeath", new java.lang.Object[0]);
        try {
            zztVar.zzn.asBinder().linkToDeath(zztVar.zzk, 0);
        } catch (android.os.RemoteException e) {
            zztVar.zzc.zzc(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzo(com.google.android.play.core.review.internal.zzt zztVar) {
        zztVar.zzc.zzd("unlinkToDeath", new java.lang.Object[0]);
        zztVar.zzn.asBinder().unlinkToDeath(zztVar.zzk, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        synchronized (this.zzg) {
            java.util.Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.tasks.TaskCompletionSource) it.next()).trySetException(zzs());
            }
            this.zzf.clear();
        }
    }

    public final android.os.Handler zzc() {
        android.os.Handler handler;
        java.util.Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = (android.os.Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final android.os.IInterface zze() {
        return this.zzn;
    }

    public final void zzp(com.google.android.play.core.review.internal.zzj zzjVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzk
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    this.zza.zzq(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.zzg) {
            if (this.zzl.getAndIncrement() > 0) {
                this.zzc.zza("Already connected to the service.", new java.lang.Object[0]);
            }
        }
        zzc().post(new com.google.android.play.core.review.internal.zzm(this, zzjVar.zzb(), zzjVar));
    }

    final /* synthetic */ void zzq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzr(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        synchronized (this.zzg) {
            if (this.zzl.get() > 0 && this.zzl.decrementAndGet() > 0) {
                this.zzc.zzd("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
            } else {
                zzc().post(new com.google.android.play.core.review.internal.zzn(this));
            }
        }
    }

    private final android.os.RemoteException zzs() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.play.core.review.internal.zzt zztVar, com.google.android.play.core.review.internal.zzj zzjVar) {
        if (zztVar.zzn != null || zztVar.zzh) {
            if (!zztVar.zzh) {
                zzjVar.run();
                return;
            } else {
                zztVar.zzc.zzd("Waiting to bind to the service.", new java.lang.Object[0]);
                zztVar.zze.add(zzjVar);
                return;
            }
        }
        zztVar.zzc.zzd("Initiate binding to the service.", new java.lang.Object[0]);
        zztVar.zze.add(zzjVar);
        com.google.android.play.core.review.internal.zzs zzsVar = new com.google.android.play.core.review.internal.zzs(zztVar, null);
        zztVar.zzm = zzsVar;
        zztVar.zzh = true;
        if (zztVar.zzb.bindService(zztVar.zzi, zzsVar, 1)) {
            return;
        }
        zztVar.zzc.zzd("Failed to bind to the service.", new java.lang.Object[0]);
        zztVar.zzh = false;
        java.util.Iterator it = zztVar.zze.iterator();
        while (it.hasNext()) {
            ((com.google.android.play.core.review.internal.zzj) it.next()).zzc(new com.google.android.play.core.review.internal.zzu());
        }
        zztVar.zze.clear();
    }
}
