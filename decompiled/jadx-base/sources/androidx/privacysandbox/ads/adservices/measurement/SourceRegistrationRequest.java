package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: SourceRegistrationRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "", "registrationUris", "", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "(Ljava/util/List;Landroid/view/InputEvent;)V", "getInputEvent", "()Landroid/view/InputEvent;", "getRegistrationUris", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.RegisterSourceOptIn
public final class SourceRegistrationRequest {
    private final android.view.InputEvent inputEvent;
    private final java.util.List<android.net.Uri> registrationUris;

    /* JADX WARN: Multi-variable type inference failed */
    public SourceRegistrationRequest(java.util.List<? extends android.net.Uri> registrationUris, android.view.InputEvent inputEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationUris, "registrationUris");
        this.registrationUris = registrationUris;
        this.inputEvent = inputEvent;
    }

    public /* synthetic */ SourceRegistrationRequest(java.util.List list, android.view.InputEvent inputEvent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : inputEvent);
    }

    public final android.view.InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final java.util.List<android.net.Uri> getRegistrationUris() {
        return this.registrationUris;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest = (androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.registrationUris, sourceRegistrationRequest.registrationUris) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputEvent, sourceRegistrationRequest.inputEvent);
    }

    public int hashCode() {
        int iHashCode = this.registrationUris.hashCode();
        android.view.InputEvent inputEvent = this.inputEvent;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    public java.lang.String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.registrationUris + "], InputEvent=" + this.inputEvent) + " }";
    }

    /* JADX INFO: compiled from: SourceRegistrationRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder;", "", "registrationUris", "", "Landroid/net/Uri;", "(Ljava/util/List;)V", "inputEvent", "Landroid/view/InputEvent;", "build", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "setInputEvent", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private android.view.InputEvent inputEvent;
        private final java.util.List<android.net.Uri> registrationUris;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(java.util.List<? extends android.net.Uri> registrationUris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationUris, "registrationUris");
            this.registrationUris = registrationUris;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest.Builder setInputEvent(android.view.InputEvent inputEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest build() {
            return new androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest(this.registrationUris, this.inputEvent);
        }
    }
}
