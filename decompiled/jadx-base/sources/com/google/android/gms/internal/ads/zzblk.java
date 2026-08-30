package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzblk implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzblm zzb;

    zzblk(com.google.android.gms.internal.ads.zzblm zzblmVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
        this.zzb = zzblmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (android.os.DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new java.lang.RuntimeException("onConnectionSuspended: " + i));
    }
}
