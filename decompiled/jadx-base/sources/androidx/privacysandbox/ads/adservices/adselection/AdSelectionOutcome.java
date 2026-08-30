package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionOutcome.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "", com.json.hs.n, "Landroid/adservices/adselection/AdSelectionOutcome;", "(Landroid/adservices/adselection/AdSelectionOutcome;)V", "adSelectionId", "", "renderUri", "Landroid/net/Uri;", "(JLandroid/net/Uri;)V", "getAdSelectionId", "()J", "getRenderUri", "()Landroid/net/Uri;", "equals", "", "other", "hasOutcome", "hashCode", "", "toString", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionOutcome {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome.Companion(null);
    public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome NO_OUTCOME;
    private final long adSelectionId;
    private final android.net.Uri renderUri;

    public AdSelectionOutcome(long j, android.net.Uri renderUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        this.adSelectionId = j;
        this.renderUri = renderUri;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final android.net.Uri getRenderUri() {
        return this.renderUri;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome adSelectionOutcome = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome) other;
        return this.adSelectionId == adSelectionOutcome.adSelectionId && kotlin.jvm.internal.Intrinsics.areEqual(this.renderUri, adSelectionOutcome.renderUri);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.adSelectionId) * 31) + this.renderUri.hashCode();
    }

    public java.lang.String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public final boolean hasOutcome() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this, NO_OUTCOME);
    }

    /* JADX INFO: compiled from: AdSelectionOutcome.kt */
    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome$Companion;", "", "()V", "NO_OUTCOME", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "getNO_OUTCOME$annotations", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
        public static /* synthetic */ void getNO_OUTCOME$annotations() {
        }

        private Companion() {
        }
    }

    static {
        android.net.Uri EMPTY = android.net.Uri.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        NO_OUTCOME = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome(0L, EMPTY);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        long adSelectionId = response.getAdSelectionId();
        android.net.Uri renderUri = response.getRenderUri();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
        this(adSelectionId, renderUri);
    }
}
