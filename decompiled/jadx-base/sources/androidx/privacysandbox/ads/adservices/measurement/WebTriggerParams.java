package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: WebTriggerParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams;", "", "registrationUri", "Landroid/net/Uri;", "debugKeyAllowed", "", "(Landroid/net/Uri;Z)V", "getDebugKeyAllowed", "()Z", "getRegistrationUri", "()Landroid/net/Uri;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebTriggerParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams.Companion(null);
    private final boolean debugKeyAllowed;
    private final android.net.Uri registrationUri;

    public WebTriggerParams(android.net.Uri registrationUri, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.registrationUri = registrationUri;
        this.debugKeyAllowed = z;
    }

    public final boolean getDebugKeyAllowed() {
        return this.debugKeyAllowed;
    }

    public final android.net.Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams webTriggerParams = (androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.registrationUri, webTriggerParams.registrationUri) && this.debugKeyAllowed == webTriggerParams.debugKeyAllowed;
    }

    public int hashCode() {
        return (this.registrationUri.hashCode() * 31) + java.lang.Boolean.hashCode(this.debugKeyAllowed);
    }

    public java.lang.String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.registrationUri + ", DebugKeyAllowed=" + this.debugKeyAllowed + " }";
    }

    /* JADX INFO: compiled from: WebTriggerParams.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams$Companion;", "", "()V", "convertWebTriggerParams", "", "Landroid/adservices/measurement/WebTriggerParams;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams;", "convertWebTriggerParams$ads_adservices_release", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams$ads_adservices_release(java.util.List<androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams> request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.privacysandbox.ads.adservices.measurement.WebTriggerParams webTriggerParams : request) {
                android.adservices.measurement.WebTriggerParams webTriggerParamsBuild = new android.adservices.measurement.WebTriggerParams.Builder(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }
    }
}
