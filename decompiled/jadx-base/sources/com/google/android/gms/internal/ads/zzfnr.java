package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfnr implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfop zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.LinkedBlockingQueue zzd;
    private final android.os.HandlerThread zze;
    private final com.google.android.gms.internal.ads.zzfni zzf;
    private final long zzg;
    private final int zzh;

    public zzfnr(android.content.Context context, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzfni zzfniVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfniVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfop zzfopVar = new com.google.android.gms.internal.ads.zzfop(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfopVar;
        this.zzd = new java.util.concurrent.LinkedBlockingQueue();
        zzfopVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, java.lang.Exception exc) {
        this.zzf.zzc(i, java.lang.System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfou zzfouVarZzc = zzc();
        if (zzfouVarZzc != null) {
            try {
                com.google.android.gms.internal.ads.zzfpb zzfpbVarZzf = zzfouVarZzc.zzf(new com.google.android.gms.internal.ads.zzfoz(1, this.zzh, this.zzb, this.zzc));
                zzd(com.json.mediationsdk.utils.IronSourceConstants.errorCode_internal, this.zzg, null);
                this.zzd.put(zzfpbVarZzf);
            } catch (java.lang.Throwable th) {
                try {
                    zzd(com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, this.zzg, new java.lang.Exception(th));
                } finally {
                    zzb();
                    this.zze.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new com.google.android.gms.internal.ads.zzfpb(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new com.google.android.gms.internal.ads.zzfpb(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final com.google.android.gms.internal.ads.zzfpb zza(int i) {
        com.google.android.gms.internal.ads.zzfpb zzfpbVar;
        try {
            zzfpbVar = (com.google.android.gms.internal.ads.zzfpb) this.zzd.poll(50000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            zzd(com.facebook.ads.AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e);
            zzfpbVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfpbVar != null) {
            if (zzfpbVar.zzc == 7) {
                com.google.android.gms.internal.ads.zzfni.zzg(3);
            } else {
                com.google.android.gms.internal.ads.zzfni.zzg(2);
            }
        }
        return zzfpbVar == null ? new com.google.android.gms.internal.ads.zzfpb(null, 1) : zzfpbVar;
    }

    public final void zzb() {
        com.google.android.gms.internal.ads.zzfop zzfopVar = this.zza;
        if (zzfopVar != null) {
            if (zzfopVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.zzfou zzc() {
        try {
            return this.zza.zzp();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }
}
