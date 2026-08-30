package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: Load.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/Load;", "", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "context", "Landroid/content/Context;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", com.json.h6.u, "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Load {
    java.lang.Object invoke(android.content.Context context, java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation);

    /* JADX INFO: compiled from: Load.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.Load load, android.content.Context context, java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return load.invoke(context, str, byteString, headerBiddingAdMarkup, (i & 16) != 0 ? null : bannerSize, unityAdsLoadOptions, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
