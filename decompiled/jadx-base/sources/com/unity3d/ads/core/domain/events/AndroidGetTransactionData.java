package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: AndroidGetTransactionData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidGetTransactionData;", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "purchaseDetail", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "productDetail", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsBridge;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetTransactionData implements com.unity3d.ads.core.domain.events.GetTransactionData {
    private final com.unity3d.ads.core.domain.GetByteStringId getByteStringId;

    public AndroidGetTransactionData(com.unity3d.ads.core.domain.GetByteStringId getByteStringId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData invoke(com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseDetail, com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge productDetail) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseDetail, "purchaseDetail");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetail, "productDetail");
        gatewayprotocol.v1.TransactionDataKt.Dsl.Companion companion = gatewayprotocol.v1.TransactionDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseDetail.getOriginalJson().get(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        java.lang.Object obj = purchaseDetail.getOriginalJson().get("purchaseTime");
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(((java.lang.Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseDetail.getOriginalJson().get("orderId").toString());
        java.lang.String string = productDetail.getOriginalJson().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "productDetail.originalJson.toString()");
        dsl_create.setProduct(string);
        java.lang.String string2 = purchaseDetail.getOriginalJson().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string2);
        java.lang.Object obj2 = purchaseDetail.getOriginalJson().get("purchaseState");
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(com.unity3d.ads.core.extensions.TransactionStateExtensionsKt.fromPurchaseState(((java.lang.Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
