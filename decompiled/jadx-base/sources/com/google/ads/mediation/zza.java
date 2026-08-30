package com.google.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    public zza(com.google.android.gms.ads.formats.UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zzh());
        setImages(unifiedNativeAd.zzk());
        setBody(unifiedNativeAd.zzf());
        setIcon(unifiedNativeAd.zzb());
        setCallToAction(unifiedNativeAd.zzg());
        setAdvertiser(unifiedNativeAd.zze());
        setStarRating(unifiedNativeAd.zzc());
        setStore(unifiedNativeAd.zzj());
        setPrice(unifiedNativeAd.zzi());
        zzd(unifiedNativeAd.zzd());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(unifiedNativeAd.zza());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        if (view instanceof com.google.android.gms.ads.formats.zzj) {
            throw null;
        }
        if (((com.google.android.gms.ads.formats.zze) com.google.android.gms.ads.formats.zze.zza.get(view)) != null) {
            throw null;
        }
    }
}
