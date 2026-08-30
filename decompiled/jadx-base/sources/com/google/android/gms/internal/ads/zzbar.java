package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbar {
    private java.util.concurrent.ScheduledFuture zza = null;
    private final java.lang.Runnable zzb = new com.google.android.gms.internal.ads.zzban(this);
    private final java.lang.Object zzc = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzbau zzd;
    private android.content.Context zze;
    private com.google.android.gms.internal.ads.zzbax zzf;

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzbar zzbarVar) {
        synchronized (zzbarVar.zzc) {
            com.google.android.gms.internal.ads.zzbau zzbauVar = zzbarVar.zzd;
            if (zzbauVar == null) {
                return;
            }
            if (zzbauVar.isConnected() || zzbarVar.zzd.isConnecting()) {
                zzbarVar.zzd.disconnect();
            }
            zzbarVar.zzd = null;
            zzbarVar.zzf = null;
            android.os.Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                com.google.android.gms.internal.ads.zzbau zzbauVarZzd = zzd(new com.google.android.gms.internal.ads.zzbap(this), new com.google.android.gms.internal.ads.zzbaq(this));
                this.zzd = zzbauVarZzd;
                zzbauVarZzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(com.google.android.gms.internal.ads.zzbav zzbavVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbavVar);
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final com.google.android.gms.internal.ads.zzbas zzb(com.google.android.gms.internal.ads.zzbav zzbavVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new com.google.android.gms.internal.ads.zzbas();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbavVar);
                }
                return this.zzf.zzf(zzbavVar);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e);
                return new com.google.android.gms.internal.ads.zzbas();
            }
        }
    }

    protected final synchronized com.google.android.gms.internal.ads.zzbau zzd(com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new com.google.android.gms.internal.ads.zzbau(this.zze, com.google.android.gms.ads.internal.zzv.zzu().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(android.content.Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzem)).booleanValue()) {
                zzl();
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzel)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zzc(new com.google.android.gms.internal.ads.zzbao(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzen)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                java.util.concurrent.ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = com.google.android.gms.internal.ads.zzbzw.zzd.schedule(this.zzb, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeo)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }
}
