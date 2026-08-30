package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: GetDiagnosticEventRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jt\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "invoke", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", com.ironsource.y8.h.j0, "", "tags", "", "intTags", "", "value", "", "hb", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetDiagnosticEventRequest {
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps;

    public GetDiagnosticEventRequest(com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(java.lang.String eventName, java.util.Map<java.lang.String, java.lang.String> tags, java.util.Map<java.lang.String, java.lang.Integer> intTags, java.lang.Double value, java.lang.Boolean hb, com.google.protobuf.ByteString opportunityId, java.lang.String placement, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl.Companion companion = gatewayprotocol.v1.DiagnosticEventKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setEventType(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(eventName);
        if (tags != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), tags);
        }
        if (intTags != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), intTags);
        }
        if (value != null) {
            dsl_create.setTimeValue(value.doubleValue());
        }
        if (hb != null) {
            dsl_create.setIsHeaderBidding(hb.booleanValue());
        }
        if (opportunityId != null) {
            dsl_create.setImpressionOpportunityId(opportunityId);
        }
        if (placement != null) {
            dsl_create.setPlacementId(placement);
        }
        if (adType != null) {
            dsl_create.setAdType(adType);
        }
        return dsl_create._build();
    }
}
