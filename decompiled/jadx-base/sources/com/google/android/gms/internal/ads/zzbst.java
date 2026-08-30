package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbst extends com.google.android.gms.internal.ads.zzbhj {
    private final com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener zza;

    public zzbst(com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zze(com.google.android.gms.internal.ads.zzbht zzbhtVar) {
        this.zza.onNativeAdLoaded(new com.google.android.gms.internal.ads.zzbsn(zzbhtVar));
    }
}
