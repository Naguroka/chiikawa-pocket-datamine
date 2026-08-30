package com.unity3d.ads.gatewayclient;

/* JADX INFO: compiled from: GatewayClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/gatewayclient/GatewayClient;", "", "request", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GatewayClient {
    java.lang.Object request(java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation);

    /* JADX INFO: compiled from: GatewayClient.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object request$default(com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 1) != 0) {
                str = com.unity3d.services.UnityAdsConstants.DefaultUrls.GATEWAY_URL;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                operationType = com.unity3d.ads.core.data.model.OperationType.UNKNOWN;
            }
            return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, continuation);
        }
    }
}
