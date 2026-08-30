package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: GetAdRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH¦Bø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdRequest;", "", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetAdRequest {
    java.lang.Object invoke(java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation);

    /* JADX INFO: compiled from: GetAdRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.GetAdRequest getAdRequest, java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                bannerSize = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, continuation);
        }
    }
}
