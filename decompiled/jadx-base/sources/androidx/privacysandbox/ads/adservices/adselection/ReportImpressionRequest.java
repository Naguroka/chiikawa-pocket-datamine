package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: ReportImpressionRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "", "adSelectionId", "", "(J)V", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(JLandroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;)V", "getAdSelectionConfig", "()Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "getAdSelectionId", "()J", "convertToAdServices", "Landroid/adservices/adselection/ReportImpressionRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "Ext10Impl", "Ext4Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReportImpressionRequest {
    private final androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public ReportImpressionRequest(long j, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j;
        this.adSelectionConfig = adSelectionConfig;
    }

    public final androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public ReportImpressionRequest(long j) {
        this(j, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.INSTANCE.getEMPTY());
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest = (androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest) other;
        return this.adSelectionId == reportImpressionRequest.adSelectionId && kotlin.jvm.internal.Intrinsics.areEqual(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.adSelectionId) * 31) + this.adSelectionConfig.hashCode();
    }

    public java.lang.String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }

    public final android.adservices.adselection.ReportImpressionRequest convertToAdServices$ads_adservices_release() {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext10Impl.INSTANCE.convertReportImpressionRequest(this);
        }
        return androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext4Impl.INSTANCE.convertReportImpressionRequest(this);
    }

    /* JADX INFO: compiled from: ReportImpressionRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext10Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext10Impl.Companion(null);

        private Ext10Impl() {
        }

        /* JADX INFO: compiled from: ReportImpressionRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext10Impl$Companion;", "", "()V", "convertReportImpressionRequest", "Landroid/adservices/adselection/ReportImpressionRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                if (kotlin.jvm.internal.Intrinsics.areEqual(request.getAdSelectionConfig(), androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.INSTANCE.getEMPTY())) {
                    return new android.adservices.adselection.ReportImpressionRequest(request.getAdSelectionId());
                }
                return new android.adservices.adselection.ReportImpressionRequest(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }
        }
    }

    /* JADX INFO: compiled from: ReportImpressionRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext4Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext4Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext4Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest.Ext4Impl.Companion(null);

        private Ext4Impl() {
        }

        /* JADX INFO: compiled from: ReportImpressionRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest$Ext4Impl$Companion;", "", "()V", "convertReportImpressionRequest", "Landroid/adservices/adselection/ReportImpressionRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                if (kotlin.jvm.internal.Intrinsics.areEqual(request.getAdSelectionConfig(), androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.INSTANCE.getEMPTY())) {
                    throw new java.lang.UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                }
                return new android.adservices.adselection.ReportImpressionRequest(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }
        }
    }
}
