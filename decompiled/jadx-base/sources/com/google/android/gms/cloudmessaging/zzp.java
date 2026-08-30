package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzp implements android.content.ServiceConnection {
    com.google.android.gms.cloudmessaging.zzq zzc;
    final /* synthetic */ com.google.android.gms.cloudmessaging.zzv zzf;
    int zza = 0;
    final android.os.Messenger zzb = new android.os.Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            int i = message.arg1;
            if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                android.util.Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            com.google.android.gms.cloudmessaging.zzp zzpVar = this.zza;
            synchronized (zzpVar) {
                com.google.android.gms.cloudmessaging.zzs zzsVar = (com.google.android.gms.cloudmessaging.zzs) zzpVar.zze.get(i);
                if (zzsVar == null) {
                    android.util.Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                zzpVar.zze.remove(i);
                zzpVar.zzf();
                android.os.Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzsVar.zzc(new com.google.android.gms.cloudmessaging.zzt(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzsVar.zza(data);
                return true;
            }
        }
    }));
    final java.util.Queue zzd = new java.util.ArrayDeque();
    final android.util.SparseArray zze = new android.util.SparseArray();

    /* synthetic */ zzp(com.google.android.gms.cloudmessaging.zzv zzvVar, com.google.android.gms.cloudmessaging.zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service connected");
        }
        this.zzf.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.cloudmessaging.zzp zzpVar = this.zza;
                android.os.IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    try {
                        if (iBinder2 == null) {
                            zzpVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzpVar.zzc = new com.google.android.gms.cloudmessaging.zzq(iBinder2);
                            zzpVar.zza = 2;
                            zzpVar.zzc();
                        } catch (android.os.RemoteException e) {
                            zzpVar.zza(0, e.getMessage());
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.zzf.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    final synchronized void zza(int i, java.lang.String str) {
        zzb(i, str, null);
    }

    final synchronized void zzb(int i, java.lang.String str, java.lang.Throwable th) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Disconnected: ".concat(java.lang.String.valueOf(str)));
        }
        int i2 = this.zza;
        if (i2 == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.zza = 4;
        com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        com.google.android.gms.cloudmessaging.zzt zztVar = new com.google.android.gms.cloudmessaging.zzt(i, str, th);
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.cloudmessaging.zzs) it.next()).zzc(zztVar);
        }
        this.zzd.clear();
        for (int i3 = 0; i3 < this.zze.size(); i3++) {
            ((com.google.android.gms.cloudmessaging.zzs) this.zze.valueAt(i3)).zzc(zztVar);
        }
        this.zze.clear();
    }

    final void zzc() {
        this.zzf.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final com.google.android.gms.cloudmessaging.zzs zzsVar;
                while (true) {
                    final com.google.android.gms.cloudmessaging.zzp zzpVar = this.zza;
                    synchronized (zzpVar) {
                        if (zzpVar.zza != 2) {
                            return;
                        }
                        if (zzpVar.zzd.isEmpty()) {
                            zzpVar.zzf();
                            return;
                        } else {
                            zzsVar = (com.google.android.gms.cloudmessaging.zzs) zzpVar.zzd.poll();
                            zzpVar.zze.put(zzsVar.zza, zzsVar);
                            zzpVar.zzf.zzc.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzpVar.zze(zzsVar.zza);
                                }
                            }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                        }
                    }
                    if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzsVar))));
                    }
                    com.google.android.gms.cloudmessaging.zzv zzvVar = zzpVar.zzf;
                    android.os.Messenger messenger = zzpVar.zzb;
                    int i = zzsVar.zzc;
                    android.content.Context context = zzvVar.zzb;
                    android.os.Message messageObtain = android.os.Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = zzsVar.zza;
                    messageObtain.replyTo = messenger;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("oneWay", zzsVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzsVar.zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzpVar.zzc.zza(messageObtain);
                    } catch (android.os.RemoteException e) {
                        zzpVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    final synchronized void zze(int i) {
        com.google.android.gms.cloudmessaging.zzs zzsVar = (com.google.android.gms.cloudmessaging.zzs) this.zze.get(i);
        if (zzsVar != null) {
            android.util.Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.zze.remove(i);
            zzsVar.zzc(new com.google.android.gms.cloudmessaging.zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        }
    }

    final synchronized boolean zzg(com.google.android.gms.cloudmessaging.zzs zzsVar) {
        try {
            int i = this.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzd.add(zzsVar);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.zzd.add(zzsVar);
                zzc();
                return true;
            }
            this.zzd.add(zzsVar);
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza == 0);
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.zza = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                    this.zzf.zzc.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd();
                        }
                    }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                } else {
                    zza(0, "Unable to bind to service");
                }
            } catch (java.lang.SecurityException e) {
                zzb(0, "Unable to bind to service", e);
            }
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
