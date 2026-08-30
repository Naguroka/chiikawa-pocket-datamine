package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\f\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "getParameters", "()[Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/OnActivityDestroyedEvent;", "Lcom/unity3d/ads/adplayer/model/OnAllowedPiiChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnBroadcastEvent;", "Lcom/unity3d/ads/adplayer/model/OnFocusChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnMuteChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnPrivacyFsmChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnStorageEvent;", "Lcom/unity3d/ads/adplayer/model/OnUserConsentChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnVisibilityChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnVolumeChangeEvent;", "Lcom/unity3d/ads/adplayer/model/OnWebRequestComplete;", "Lcom/unity3d/ads/adplayer/model/OnWebRequestFailed;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebViewEvent {
    java.lang.String getCategory();

    java.lang.String getName();

    java.lang.Object[] getParameters();
}
