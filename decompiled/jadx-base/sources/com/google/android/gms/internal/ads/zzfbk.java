package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfbk implements com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfbl zzb;

    zzfbk(com.google.android.gms.internal.ads.zzfbl zzfblVar, com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        this.zza = zzccVar;
        this.zzb = zzfblVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
