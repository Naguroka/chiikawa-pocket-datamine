package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetAdPlayerConfigRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "configToken", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetAdPlayerConfigRequest implements com.unity3d.ads.core.domain.GetAdPlayerConfigRequest {
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetAdPlayerConfigRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    public java.lang.Object invoke(java.lang.String str, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builderNewBuilder = gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConfigurationToken(byteString2);
        dsl_create.setPlacementId(str);
        dsl_create.setImpressionOpportunityId(byteString);
        gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest_build = dsl_create._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdPlayerConfigRequest(adPlayerConfigRequest_build);
        return this.getUniversalRequestForPayLoad.invoke(dsl_create2._build(), continuation);
    }
}
