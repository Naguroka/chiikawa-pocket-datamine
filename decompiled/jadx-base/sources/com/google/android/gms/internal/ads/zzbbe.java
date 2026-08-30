package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbe implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbf zzb;

    zzbbe(com.google.android.gms.internal.ads.zzbbf zzbbfVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
        this.zzb = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new java.lang.RuntimeException("Connection failed."));
        }
    }
}
