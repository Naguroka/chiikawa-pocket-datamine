package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzs extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb = new java.util.HashMap();
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzq zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    zzs(android.content.Context context, android.os.Looper looper, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.internal.zzq zzqVar = new com.google.android.gms.common.internal.zzq(this, null);
        this.zze = zzqVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzh(looper, zzqVar);
        this.zzf = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.ConnectionResult connectionResultZzd;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.google.android.gms.common.internal.zzp zzpVar = (com.google.android.gms.common.internal.zzp) this.zzb.get(zzoVar);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzpVar == null) {
                zzpVar = new com.google.android.gms.common.internal.zzp(this, zzoVar);
                zzpVar.zze(serviceConnection, serviceConnection, str);
                connectionResultZzd = com.google.android.gms.common.internal.zzp.zzd(zzpVar, str, executor);
                this.zzb.put(zzoVar, zzpVar);
            } else {
                this.zzd.removeMessages(0, zzoVar);
                if (zzpVar.zzh(serviceConnection)) {
                    throw new java.lang.IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar.toString());
                }
                zzpVar.zze(serviceConnection, serviceConnection, str);
                int iZza = zzpVar.zza();
                if (iZza == 1) {
                    serviceConnection.onServiceConnected(zzpVar.zzb(), zzpVar.zzc());
                } else if (iZza == 2) {
                    connectionResultZzd = com.google.android.gms.common.internal.zzp.zzd(zzpVar, str, executor);
                }
                connectionResultZzd = null;
            }
            if (zzpVar.zzj()) {
                return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            }
            if (connectionResultZzd == null) {
                connectionResultZzd = new com.google.android.gms.common.ConnectionResult(-1);
            }
            return connectionResultZzd;
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzb(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            com.google.android.gms.common.internal.zzp zzpVar = (com.google.android.gms.common.internal.zzp) this.zzb.get(zzoVar);
            if (zzpVar == null) {
                throw new java.lang.IllegalStateException("Nonexistent connection status for service config: " + zzoVar.toString());
            }
            if (!zzpVar.zzh(serviceConnection)) {
                throw new java.lang.IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar.toString());
            }
            zzpVar.zzf(serviceConnection, str);
            if (zzpVar.zzi()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
            }
        }
    }

    final void zzi(java.util.concurrent.Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    final void zzj(android.os.Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzh(looper, this.zze);
        }
    }
}
