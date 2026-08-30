package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidPrivacyDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidPrivacyDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "idfaInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "fetch", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "allowed", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAdvertisingTrackingId", "", "getOpenAdvertisingTrackingId", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidPrivacyDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource {
    private final android.content.Context context;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.idfaInitialized = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public gatewayprotocol.v1.PiiOuterClass.Pii fetch(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowed, "allowed");
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(true);
            com.unity3d.services.core.device.AdvertisingId.init(this.context);
            com.unity3d.services.core.device.OpenAdvertisingId.init(this.context);
        }
        gatewayprotocol.v1.PiiKt.Dsl.Companion companion = gatewayprotocol.v1.PiiKt.Dsl.INSTANCE;
        gatewayprotocol.v1.PiiOuterClass.Pii.Builder builderNewBuilder = gatewayprotocol.v1.PiiOuterClass.Pii.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (allowed.getIdfa()) {
            java.lang.String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                java.util.UUID uuidFromString = java.util.UUID.fromString(advertisingTrackingId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(adId)");
                dsl_create.setAdvertisingId(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString));
            }
            java.lang.String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                java.util.UUID uuidFromString2 = java.util.UUID.fromString(openAdvertisingTrackingId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(openAdId)");
                dsl_create.setOpenAdvertisingTrackingId(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString2));
            }
        }
        return dsl_create._build();
    }

    private final java.lang.String getAdvertisingTrackingId() {
        java.lang.String advertisingTrackingId = com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final java.lang.String getOpenAdvertisingTrackingId() {
        java.lang.String openAdvertisingTrackingId = com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }
}
