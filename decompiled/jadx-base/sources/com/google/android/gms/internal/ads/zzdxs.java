package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdxs implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzcab zza = new com.google.android.gms.internal.ads.zzcab();
    protected final java.lang.Object zzb = new java.lang.Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected com.google.android.gms.internal.ads.zzbvk zze;
    protected com.google.android.gms.internal.ads.zzbup zzf;

    static void zzc(android.content.Context context, com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.Executor executor) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzj.zze()).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzh.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdxp(context), executor);
        }
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzdyh(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            android.os.Binder.flushPendingCommands();
        }
    }
}
