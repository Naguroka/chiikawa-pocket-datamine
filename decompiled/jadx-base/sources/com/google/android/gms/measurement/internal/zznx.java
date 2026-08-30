package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zznx implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zza;
    private volatile boolean zzb;
    private volatile com.google.android.gms.measurement.internal.zzgy zzc;

    protected zznx(com.google.android.gms.measurement.internal.zzny zznyVar) {
        this.zza = zznyVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zza.zzu.zzaX().zzn();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
                this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzns(this, (com.google.android.gms.measurement.internal.zzgl) this.zzc.getService()));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zza;
        zznyVar.zzu.zzaX().zzn();
        com.google.android.gms.measurement.internal.zzhe zzheVarZzl = zznyVar.zzu.zzl();
        if (zzheVarZzl != null) {
            zzheVarZzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zznw(this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
        zzioVar.zzaX().zzn();
        zzioVar.zzaW().zzd().zza("Service connection suspended");
        zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zznt(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zza.zzu.zzaX().zzn();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaW().zze().zza("Service connected with null binder");
                return;
            }
            com.google.android.gms.measurement.internal.zzgl zzgjVar = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzgjVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.measurement.internal.zzgl ? (com.google.android.gms.measurement.internal.zzgl) iInterfaceQueryLocalInterface : new com.google.android.gms.measurement.internal.zzgj(iBinder);
                    this.zza.zzu.zzaW().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaW().zze().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.zza.zzu.zzaW().zze().zza("Service connect failed to get IMeasurementService");
            }
            if (zzgjVar == null) {
                this.zzb = false;
                try {
                    com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
                    com.google.android.gms.measurement.internal.zzny zznyVar = this.zza;
                    connectionTracker.unbindService(zznyVar.zzu.zzaT(), zznyVar.zza);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zznq(this, zzgjVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
        zzioVar.zzaX().zzn();
        zzioVar.zzaW().zzd().zza("Service disconnected");
        zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zznr(this, componentName));
    }

    public final void zzb(android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zza;
        zznyVar.zzg();
        android.content.Context contextZzaT = zznyVar.zzu.zzaT();
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzu.zzaW().zzj().zza("Connection attempt already in progress");
                return;
            }
            com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zza;
            zznyVar2.zzu.zzaW().zzj().zza("Using local app measurement service");
            this.zzb = true;
            connectionTracker.bindService(contextZzaT, intent, zznyVar2.zza, 129);
        }
    }

    public final void zzc() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zza;
        zznyVar.zzg();
        android.content.Context contextZzaT = zznyVar.zzu.zzaT();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzu.zzaW().zzj().zza("Connection attempt already in progress");
                return;
            }
            if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzu.zzaW().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.zzc = new com.google.android.gms.measurement.internal.zzgy(contextZzaT, android.os.Looper.getMainLooper(), this, this);
            this.zza.zzu.zzaW().zzj().zza("Connecting to remote service");
            this.zzb = true;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
