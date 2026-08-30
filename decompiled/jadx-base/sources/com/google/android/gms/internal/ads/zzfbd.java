package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfbd implements com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdo zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbf zzb;

    zzfbd(com.google.android.gms.internal.ads.zzfbf zzfbfVar, com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = zzfbfVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
