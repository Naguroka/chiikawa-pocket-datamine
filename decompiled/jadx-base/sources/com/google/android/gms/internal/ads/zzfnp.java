package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfnp implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfop zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.LinkedBlockingQueue zzd;
    private final android.os.HandlerThread zze;

    public zzfnp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.zzb = str;
        this.zzc = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        com.google.android.gms.internal.ads.zzfop zzfopVar = new com.google.android.gms.internal.ads.zzfop(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfopVar;
        this.zzd = new java.util.concurrent.LinkedBlockingQueue();
        zzfopVar.checkAvailabilityAndConnect();
    }

    static com.google.android.gms.internal.ads.zzasy zza() {
        com.google.android.gms.internal.ads.zzasc zzascVarZza = com.google.android.gms.internal.ads.zzasy.zza();
        zzascVarZza.zzD(32768L);
        return (com.google.android.gms.internal.ads.zzasy) zzascVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfou zzfouVarZzd = zzd();
        if (zzfouVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfouVarZzd.zze(new com.google.android.gms.internal.ads.zzfoq(this.zzb, this.zzc)).zza());
                } catch (java.lang.Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (java.lang.InterruptedException unused2) {
            } finally {
                zzc();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zza());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final com.google.android.gms.internal.ads.zzasy zzb(int i) {
        com.google.android.gms.internal.ads.zzasy zzasyVar;
        try {
            zzasyVar = (com.google.android.gms.internal.ads.zzasy) this.zzd.poll(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException unused) {
            zzasyVar = null;
        }
        return zzasyVar == null ? zza() : zzasyVar;
    }

    public final void zzc() {
        com.google.android.gms.internal.ads.zzfop zzfopVar = this.zza;
        if (zzfopVar != null) {
            if (zzfopVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.zzfou zzd() {
        try {
            return this.zza.zzp();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }
}
