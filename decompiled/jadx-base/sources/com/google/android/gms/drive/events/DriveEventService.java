package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public class DriveEventService extends android.app.Service implements com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.drive.events.CompletionListener, com.google.android.gms.drive.events.zzd, com.google.android.gms.drive.events.zzi {
    public static final java.lang.String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("DriveEventService", "");
    private final java.lang.String name;
    private java.util.concurrent.CountDownLatch zzcj;
    com.google.android.gms.drive.events.DriveEventService.zza zzck;
    boolean zzcl;
    private int zzcm;

    final class zzb extends com.google.android.gms.internal.drive.zzet {
        private zzb() {
        }

        @Override // com.google.android.gms.internal.drive.zzes
        public final void zzc(com.google.android.gms.internal.drive.zzfp zzfpVar) throws android.os.RemoteException {
            synchronized (com.google.android.gms.drive.events.DriveEventService.this) {
                com.google.android.gms.drive.events.DriveEventService.this.zzw();
                if (com.google.android.gms.drive.events.DriveEventService.this.zzck != null) {
                    com.google.android.gms.drive.events.DriveEventService.this.zzck.sendMessage(com.google.android.gms.drive.events.DriveEventService.this.zzck.zzb(zzfpVar));
                } else {
                    com.google.android.gms.drive.events.DriveEventService.zzbz.e("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }

        /* synthetic */ zzb(com.google.android.gms.drive.events.DriveEventService driveEventService, com.google.android.gms.drive.events.zzh zzhVar) {
            this();
        }
    }

    protected DriveEventService(java.lang.String str) {
        this.zzcl = false;
        this.zzcm = -1;
        this.name = str;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        return true;
    }

    static final class zza extends com.google.android.gms.internal.drive.zzir {
        private final java.lang.ref.WeakReference<com.google.android.gms.drive.events.DriveEventService> zzcp;

        private zza(com.google.android.gms.drive.events.DriveEventService driveEventService) {
            this.zzcp = new java.lang.ref.WeakReference<>(driveEventService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Message zzb(com.google.android.gms.internal.drive.zzfp zzfpVar) {
            return obtainMessage(1, zzfpVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Message zzy() {
            return obtainMessage(2);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    getLooper().quit();
                    return;
                } else {
                    com.google.android.gms.drive.events.DriveEventService.zzbz.wfmt("DriveEventService", "Unexpected message type: %s", java.lang.Integer.valueOf(message.what));
                    return;
                }
            }
            com.google.android.gms.drive.events.DriveEventService driveEventService = this.zzcp.get();
            if (driveEventService == null) {
                getLooper().quit();
            } else {
                driveEventService.zza((com.google.android.gms.internal.drive.zzfp) message.obj);
            }
        }

        /* synthetic */ zza(com.google.android.gms.drive.events.DriveEventService driveEventService, com.google.android.gms.drive.events.zzh zzhVar) {
            this(driveEventService);
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        com.google.android.gms.drive.events.zzh zzhVar = null;
        if (!ACTION_HANDLE_EVENT.equals(intent.getAction())) {
            return null;
        }
        if (this.zzck == null && !this.zzcl) {
            this.zzcl = true;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            this.zzcj = new java.util.concurrent.CountDownLatch(1);
            new com.google.android.gms.drive.events.zzh(this, countDownLatch).start();
            try {
                if (!countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    zzbz.e("DriveEventService", "Failed to synchronously initialize event handler.");
                }
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.RuntimeException("Unable to start event handler", e);
            }
        }
        return new com.google.android.gms.drive.events.DriveEventService.zzb(this, zzhVar).asBinder();
    }

    @Override // android.app.Service
    public synchronized void onDestroy() {
        com.google.android.gms.drive.events.DriveEventService.zza zzaVar = this.zzck;
        if (zzaVar != null) {
            this.zzck.sendMessage(zzaVar.zzy());
            this.zzck = null;
            try {
                if (!this.zzcj.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    zzbz.w("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (java.lang.InterruptedException unused) {
            }
            this.zzcj = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public void onChange(com.google.android.gms.drive.events.ChangeEvent changeEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled change event in %s: %s", this.name, changeEvent);
    }

    @Override // com.google.android.gms.drive.events.zzd
    public final void zza(com.google.android.gms.drive.events.zzb zzbVar) {
        zzbz.wfmt("DriveEventService", "Unhandled changes available event in %s: %s", this.name, zzbVar);
    }

    @Override // com.google.android.gms.drive.events.CompletionListener
    public void onCompletion(com.google.android.gms.drive.events.CompletionEvent completionEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled completion event in %s: %s", this.name, completionEvent);
    }

    protected int getCallingUid() {
        return android.os.Binder.getCallingUid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.internal.drive.zzfp zzfpVar) {
        com.google.android.gms.drive.events.DriveEvent driveEventZzat = zzfpVar.zzat();
        try {
            int type = driveEventZzat.getType();
            if (type == 1) {
                onChange((com.google.android.gms.drive.events.ChangeEvent) driveEventZzat);
                return;
            }
            if (type == 2) {
                onCompletion((com.google.android.gms.drive.events.CompletionEvent) driveEventZzat);
                return;
            }
            if (type == 4) {
                zza((com.google.android.gms.drive.events.zzb) driveEventZzat);
            } else if (type == 7) {
                zzbz.wfmt("DriveEventService", "Unhandled transfer state event in %s: %s", this.name, (com.google.android.gms.drive.events.zzv) driveEventZzat);
            } else {
                zzbz.wfmt("DriveEventService", "Unhandled event: %s", driveEventZzat);
            }
        } catch (java.lang.Exception e) {
            zzbz.e("DriveEventService", java.lang.String.format("Error handling event in %s", this.name), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() throws java.lang.SecurityException {
        int callingUid = getCallingUid();
        if (callingUid == this.zzcm) {
            return;
        }
        if (com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this, callingUid)) {
            this.zzcm = callingUid;
            return;
        }
        throw new java.lang.SecurityException("Caller is not GooglePlayServices");
    }
}
