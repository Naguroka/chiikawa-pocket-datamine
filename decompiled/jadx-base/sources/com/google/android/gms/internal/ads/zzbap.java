package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbap implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbar zza;

    zzbap(com.google.android.gms.internal.ads.zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                com.google.android.gms.internal.ads.zzbar zzbarVar = this.zza;
                if (zzbarVar.zzd != null) {
                    zzbarVar.zzf = zzbarVar.zzd.zzq();
                }
            } catch (android.os.DeadObjectException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                com.google.android.gms.internal.ads.zzbar.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
