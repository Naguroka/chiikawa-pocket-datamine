package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: GetDiagnosticEventBatchRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "", "()V", "invoke", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEvents", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetDiagnosticEventBatchRequest {
    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> diagnosticEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEvents, "diagnosticEvents");
        gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builderNewBuilder = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllBatch(dsl_create.getBatch(), diagnosticEvents);
        return dsl_create._build();
    }
}
