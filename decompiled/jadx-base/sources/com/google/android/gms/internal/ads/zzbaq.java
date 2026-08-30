package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbaq implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbar zza;

    zzbaq(com.google.android.gms.internal.ads.zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            com.google.android.gms.internal.ads.zzbar zzbarVar = this.zza;
            if (zzbarVar.zzd != null) {
                zzbarVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
