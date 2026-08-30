package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbll implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;

    zzbll(com.google.android.gms.internal.ads.zzblm zzblmVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zza.zzd(new java.lang.RuntimeException("Connection failed."));
    }
}
