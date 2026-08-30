package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: Listeners.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/model/Listeners;", "", "onClick", "", com.json.y8.j, "", "onComplete", "state", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "onError", "error", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "onLeftApplication", "onStart", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Listeners {

    /* JADX INFO: compiled from: Listeners.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onClick(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onComplete(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String placementId, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        }

        public static void onError(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String placementId, com.unity3d.ads.UnityAds.UnityAdsShowError error, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        }

        public static void onLeftApplication(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onStart(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String placementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        }
    }

    void onClick(java.lang.String placementId);

    void onComplete(java.lang.String placementId, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState state);

    void onError(java.lang.String placementId, com.unity3d.ads.UnityAds.UnityAdsShowError error, java.lang.String message);

    void onLeftApplication(java.lang.String placementId);

    void onStart(java.lang.String placementId);
}
