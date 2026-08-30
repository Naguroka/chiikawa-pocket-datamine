package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface NativeMediationAdRequest extends com.google.android.gms.ads.mediation.MediationAdRequest {
    float getAdVolume();

    @java.lang.Deprecated
    com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions();

    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    java.util.Map zza();

    boolean zzb();
}
