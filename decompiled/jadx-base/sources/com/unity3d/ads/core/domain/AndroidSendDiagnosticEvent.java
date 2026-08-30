package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidSendDiagnosticEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JV\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidSendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;)V", "invoke", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "value", "", "tags", "", "intTags", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;)V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidSendDiagnosticEvent implements com.unity3d.ads.core.domain.SendDiagnosticEvent {
    private final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository;
    private final com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(java.lang.String event, java.lang.Double value, java.util.Map<java.lang.String, java.lang.String> tags, java.util.Map<java.lang.String, java.lang.Integer> intTags, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, tags, intTags, value, adObject != null ? adObject.isHeaderBidding() : null, adObject != null ? adObject.getOpportunityId() : null, adObject != null ? adObject.getPlacementId() : null, adObject != null ? adObject.getAdType() : null));
    }
}
