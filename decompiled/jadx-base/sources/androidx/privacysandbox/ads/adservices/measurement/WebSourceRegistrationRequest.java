package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: WebSourceRegistrationRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001 BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "", "webSourceParams", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "topOriginUri", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "appDestination", "webDestination", "verifiedDestination", "(Ljava/util/List;Landroid/net/Uri;Landroid/view/InputEvent;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V", "getAppDestination", "()Landroid/net/Uri;", "getInputEvent", "()Landroid/view/InputEvent;", "getTopOriginUri", "getVerifiedDestination", "getWebDestination", "getWebSourceParams", "()Ljava/util/List;", "convertToAdServices", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSourceRegistrationRequest {
    private final android.net.Uri appDestination;
    private final android.view.InputEvent inputEvent;
    private final android.net.Uri topOriginUri;
    private final android.net.Uri verifiedDestination;
    private final android.net.Uri webDestination;
    private final java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebSourceParams> webSourceParams;

    public WebSourceRegistrationRequest(java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebSourceParams> webSourceParams, android.net.Uri topOriginUri, android.view.InputEvent inputEvent, android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.webSourceParams = webSourceParams;
        this.topOriginUri = topOriginUri;
        this.inputEvent = inputEvent;
        this.appDestination = uri;
        this.webDestination = uri2;
        this.verifiedDestination = uri3;
    }

    public /* synthetic */ WebSourceRegistrationRequest(java.util.List list, android.net.Uri uri, android.view.InputEvent inputEvent, android.net.Uri uri2, android.net.Uri uri3, android.net.Uri uri4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i & 4) != 0 ? null : inputEvent, (i & 8) != 0 ? null : uri2, (i & 16) != 0 ? null : uri3, (i & 32) != 0 ? null : uri4);
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebSourceParams> getWebSourceParams() {
        return this.webSourceParams;
    }

    public final android.net.Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    public final android.view.InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final android.net.Uri getAppDestination() {
        return this.appDestination;
    }

    public final android.net.Uri getWebDestination() {
        return this.webDestination;
    }

    public final android.net.Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequest = (androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.webSourceParams, webSourceRegistrationRequest.webSourceParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.webDestination, webSourceRegistrationRequest.webDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.appDestination, webSourceRegistrationRequest.appDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.topOriginUri, webSourceRegistrationRequest.topOriginUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputEvent, webSourceRegistrationRequest.inputEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.verifiedDestination, webSourceRegistrationRequest.verifiedDestination);
    }

    public int hashCode() {
        int iHashCode = (this.webSourceParams.hashCode() * 31) + this.topOriginUri.hashCode();
        android.view.InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        android.net.Uri uri = this.appDestination;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        android.net.Uri uri2 = this.webDestination;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.topOriginUri.hashCode();
        android.view.InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        android.net.Uri uri3 = this.verifiedDestination;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    public java.lang.String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.webSourceParams + "], TopOriginUri=" + this.topOriginUri + ", InputEvent=" + this.inputEvent + ", AppDestination=" + this.appDestination + ", WebDestination=" + this.webDestination + ", VerifiedDestination=" + this.verifiedDestination) + " }";
    }

    public final android.adservices.measurement.WebSourceRegistrationRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = new android.adservices.measurement.WebSourceRegistrationRequest.Builder(androidx.privacysandbox.ads.adservices.measurement.WebSourceParams.INSTANCE.convertWebSourceParams$ads_adservices_release(this.webSourceParams), this.topOriginUri).setWebDestination(this.webDestination).setAppDestination(this.appDestination).setInputEvent(this.inputEvent).setVerifiedDestination(this.verifiedDestination).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …ion)\n            .build()");
        return webSourceRegistrationRequestBuild;
    }

    /* JADX INFO: compiled from: WebSourceRegistrationRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "", "webSourceParams", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "topOriginUri", "Landroid/net/Uri;", "(Ljava/util/List;Landroid/net/Uri;)V", "appDestination", "inputEvent", "Landroid/view/InputEvent;", "verifiedDestination", "webDestination", "build", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "setAppDestination", "setInputEvent", "setVerifiedDestination", "setWebDestination", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private android.net.Uri appDestination;
        private android.view.InputEvent inputEvent;
        private final android.net.Uri topOriginUri;
        private android.net.Uri verifiedDestination;
        private android.net.Uri webDestination;
        private final java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebSourceParams> webSourceParams;

        public Builder(java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebSourceParams> webSourceParams, android.net.Uri topOriginUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest.Builder setInputEvent(android.view.InputEvent inputEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest.Builder setAppDestination(android.net.Uri appDestination) {
            this.appDestination = appDestination;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest.Builder setWebDestination(android.net.Uri webDestination) {
            this.webDestination = webDestination;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest.Builder setVerifiedDestination(android.net.Uri verifiedDestination) {
            this.verifiedDestination = verifiedDestination;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest build() {
            return new androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }
    }
}
