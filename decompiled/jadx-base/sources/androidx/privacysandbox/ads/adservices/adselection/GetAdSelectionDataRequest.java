package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: GetAdSelectionDataRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "coordinatorOriginUri", "Landroid/net/Uri;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Landroid/net/Uri;)V", "getCoordinatorOriginUri$annotations", "()V", "getCoordinatorOriginUri", "()Landroid/net/Uri;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertToAdServices", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "Ext10Impl", "Ext12Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetAdSelectionDataRequest {
    private final android.net.Uri coordinatorOriginUri;
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetAdSelectionDataRequest(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller) {
        this(seller, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seller, "seller");
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext12OptIn
    public static /* synthetic */ void getCoordinatorOriginUri$annotations() {
    }

    public GetAdSelectionDataRequest(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seller, "seller");
        this.seller = seller;
        this.coordinatorOriginUri = uri;
    }

    public /* synthetic */ GetAdSelectionDataRequest(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier, android.net.Uri uri, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, (i & 2) != 0 ? null : uri);
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final android.net.Uri getCoordinatorOriginUri() {
        return this.coordinatorOriginUri;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest = (androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.seller, getAdSelectionDataRequest.seller) && kotlin.jvm.internal.Intrinsics.areEqual(this.coordinatorOriginUri, getAdSelectionDataRequest.coordinatorOriginUri);
    }

    public int hashCode() {
        int iHashCode = this.seller.hashCode() * 31;
        android.net.Uri uri = this.coordinatorOriginUri;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.seller + ", coordinatorOriginUri=" + this.coordinatorOriginUri;
    }

    public final android.adservices.adselection.GetAdSelectionDataRequest convertToAdServices$ads_adservices_release() {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 12 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 12) {
            return androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext12Impl.INSTANCE.convertGetAdSelectionDataRequest(this);
        }
        return androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext10Impl.INSTANCE.convertGetAdSelectionDataRequest(this);
    }

    /* JADX INFO: compiled from: GetAdSelectionDataRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext12Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext12Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext12Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext12Impl.Companion(null);

        private Ext12Impl() {
        }

        /* JADX INFO: compiled from: GetAdSelectionDataRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext12Impl$Companion;", "", "()V", "convertGetAdSelectionDataRequest", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = new android.adservices.adselection.GetAdSelectionDataRequest.Builder().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).setCoordinatorOriginUri(request.getCoordinatorOriginUri()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }
        }
    }

    /* JADX INFO: compiled from: GetAdSelectionDataRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext10Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest.Ext10Impl.Companion(null);

        private Ext10Impl() {
        }

        /* JADX INFO: compiled from: GetAdSelectionDataRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest$Ext10Impl$Companion;", "", "()V", "convertGetAdSelectionDataRequest", "Landroid/adservices/adselection/GetAdSelectionDataRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = new android.adservices.adselection.GetAdSelectionDataRequest.Builder().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }
        }
    }
}
