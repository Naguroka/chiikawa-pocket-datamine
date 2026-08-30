package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: ShowStatusExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUnityAdsShowCompletionState", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShowStatusExtensionsKt {

    /* JADX INFO: compiled from: ShowStatusExtensions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.adplayer.model.ShowStatus.values().length];
            try {
                iArr[com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.unity3d.ads.UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(com.unity3d.ads.adplayer.model.ShowStatus showStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showStatus, "<this>");
        int i = com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i == 1) {
            return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i == 2) {
            return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        throw new java.lang.IllegalStateException("Unexpected show status: " + showStatus);
    }
}
