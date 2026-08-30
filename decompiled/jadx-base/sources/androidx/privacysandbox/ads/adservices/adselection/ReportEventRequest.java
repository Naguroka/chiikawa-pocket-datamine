package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: ReportEventRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001f !\"B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "", "adSelectionId", "", "eventKey", "", "eventData", "reportingDestinations", "", "inputEvent", "Landroid/view/InputEvent;", "(JLjava/lang/String;Ljava/lang/String;ILandroid/view/InputEvent;)V", "getAdSelectionId", "()J", "getEventData", "()Ljava/lang/String;", "getEventKey", "getInputEvent$annotations", "()V", "getInputEvent", "()Landroid/view/InputEvent;", "getReportingDestinations", "()I", "convertToAdServices", "Landroid/adservices/adselection/ReportEventRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "Companion", "Ext10Impl", "Ext8Impl", "ReportingDestination", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
public final class ReportEventRequest {
    public static final int FLAG_REPORTING_DESTINATION_BUYER = 2;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = 1;
    private final long adSelectionId;
    private final java.lang.String eventData;
    private final java.lang.String eventKey;
    private final android.view.InputEvent inputEvent;
    private final int reportingDestinations;

    /* JADX INFO: compiled from: ReportEventRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$ReportingDestination;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface ReportingDestination {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportEventRequest(long j, java.lang.String eventKey, java.lang.String eventData, int i) {
        this(j, eventKey, eventData, i, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventData, "eventData");
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public static /* synthetic */ void getInputEvent$annotations() {
    }

    public ReportEventRequest(long j, java.lang.String eventKey, java.lang.String eventData, int i, android.view.InputEvent inputEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.adSelectionId = j;
        this.eventKey = eventKey;
        this.eventData = eventData;
        this.reportingDestinations = i;
        this.inputEvent = inputEvent;
        if (!(i > 0 && i <= 3)) {
            throw new java.lang.IllegalArgumentException("Invalid reporting destinations bitfield.".toString());
        }
    }

    public /* synthetic */ ReportEventRequest(long j, java.lang.String str, java.lang.String str2, int i, android.view.InputEvent inputEvent, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, i, (i2 & 16) != 0 ? null : inputEvent);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final java.lang.String getEventKey() {
        return this.eventKey;
    }

    public final java.lang.String getEventData() {
        return this.eventData;
    }

    public final int getReportingDestinations() {
        return this.reportingDestinations;
    }

    public final android.view.InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest = (androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest) other;
        return this.adSelectionId == reportEventRequest.adSelectionId && kotlin.jvm.internal.Intrinsics.areEqual(this.eventKey, reportEventRequest.eventKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventData, reportEventRequest.eventData) && this.reportingDestinations == reportEventRequest.reportingDestinations && kotlin.jvm.internal.Intrinsics.areEqual(this.inputEvent, reportEventRequest.inputEvent);
    }

    public int hashCode() {
        int iHashCode = ((((((java.lang.Long.hashCode(this.adSelectionId) * 31) + this.eventKey.hashCode()) * 31) + this.eventData.hashCode()) * 31) + java.lang.Integer.hashCode(this.reportingDestinations)) * 31;
        android.view.InputEvent inputEvent = this.inputEvent;
        return iHashCode + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ReportEventRequest: adSelectionId=" + this.adSelectionId + ", eventKey=" + this.eventKey + ", eventData=" + this.eventData + ", reportingDestinations=" + this.reportingDestinations + "inputEvent=" + this.inputEvent;
    }

    public final android.adservices.adselection.ReportEventRequest convertToAdServices$ads_adservices_release() {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext10Impl.INSTANCE.convertReportEventRequest(this);
        }
        return androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext8Impl.INSTANCE.convertReportEventRequest(this);
    }

    /* JADX INFO: compiled from: ReportEventRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext10Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext10Impl.Companion(null);

        private Ext10Impl() {
        }

        /* JADX INFO: compiled from: ReportEventRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl$Companion;", "", "()V", "convertReportEventRequest", "Landroid/adservices/adselection/ReportEventRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = new android.adservices.adselection.ReportEventRequest.Builder(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).setInputEvent(request.getInputEvent()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }
        }
    }

    /* JADX INFO: compiled from: ReportEventRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext8Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext8Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest.Ext8Impl.Companion(null);

        private Ext8Impl() {
        }

        /* JADX INFO: compiled from: ReportEventRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl$Companion;", "", "()V", "convertReportEventRequest", "Landroid/adservices/adselection/ReportEventRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                if (request.getInputEvent() != null) {
                    android.util.Log.w("ReportEventRequest", "inputEvent is ignored. Min version to use inputEvent is API 31 ext 10");
                }
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = new android.adservices.adselection.ReportEventRequest.Builder(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }
        }
    }
}
