package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfr extends com.google.android.gms.ads.internal.client.zzdn {
    private final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zza;

    public zzfr(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zza = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws android.os.RemoteException {
        com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener = this.zza;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
