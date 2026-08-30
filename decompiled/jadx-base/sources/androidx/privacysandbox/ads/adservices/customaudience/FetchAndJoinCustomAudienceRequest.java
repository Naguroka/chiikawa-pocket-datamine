package androidx.privacysandbox.ads.adservices.customaudience;

/* JADX INFO: compiled from: FetchAndJoinCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "", "fetchUri", "Landroid/net/Uri;", "name", "", "activationTime", "Ljava/time/Instant;", "expirationTime", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "(Landroid/net/Uri;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;)V", "getActivationTime", "()Ljava/time/Instant;", "getExpirationTime", "getFetchUri", "()Landroid/net/Uri;", "getName", "()Ljava/lang/String;", "getUserBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "convertToAdServices", "Landroid/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FetchAndJoinCustomAudienceRequest {
    private final java.time.Instant activationTime;
    private final java.time.Instant expirationTime;
    private final android.net.Uri fetchUri;
    private final java.lang.String name;
    private final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals userBiddingSignals;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchAndJoinCustomAudienceRequest(android.net.Uri fetchUri) {
        this(fetchUri, null, null, null, null, 30, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchAndJoinCustomAudienceRequest(android.net.Uri fetchUri, java.lang.String str) {
        this(fetchUri, str, null, null, null, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchAndJoinCustomAudienceRequest(android.net.Uri fetchUri, java.lang.String str, java.time.Instant instant) {
        this(fetchUri, str, instant, null, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchAndJoinCustomAudienceRequest(android.net.Uri fetchUri, java.lang.String str, java.time.Instant instant, java.time.Instant instant2) {
        this(fetchUri, str, instant, instant2, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    public FetchAndJoinCustomAudienceRequest(android.net.Uri fetchUri, java.lang.String str, java.time.Instant instant, java.time.Instant instant2, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
        this.fetchUri = fetchUri;
        this.name = str;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
    }

    public /* synthetic */ FetchAndJoinCustomAudienceRequest(android.net.Uri uri, java.lang.String str, java.time.Instant instant, java.time.Instant instant2, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : adSelectionSignals);
    }

    public final android.net.Uri getFetchUri() {
        return this.fetchUri;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.time.Instant getActivationTime() {
        return this.activationTime;
    }

    public final java.time.Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest = (androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fetchUri, fetchAndJoinCustomAudienceRequest.fetchUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fetchAndJoinCustomAudienceRequest.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.activationTime, fetchAndJoinCustomAudienceRequest.activationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, fetchAndJoinCustomAudienceRequest.expirationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.userBiddingSignals, fetchAndJoinCustomAudienceRequest.userBiddingSignals);
    }

    public int hashCode() {
        int iHashCode = this.fetchUri.hashCode() * 31;
        java.lang.String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.time.Instant instant = this.activationTime;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31;
        java.time.Instant instant2 = this.expirationTime;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31;
        androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        return iHashCode4 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FetchAndJoinCustomAudienceRequest: fetchUri=" + this.fetchUri + ", name=" + this.name + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", userBiddingSignals=" + this.userBiddingSignals;
    }

    public final android.adservices.customaudience.FetchAndJoinCustomAudienceRequest convertToAdServices$ads_adservices_release() {
        android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder expirationTime = new android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder(this.fetchUri).setName(this.name).setActivationTime(this.activationTime).setExpirationTime(this.expirationTime);
        androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        android.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = expirationTime.setUserBiddingSignals(adSelectionSignals != null ? adSelectionSignals.convertToAdServices$ads_adservices_release() : null).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fetchAndJoinCustomAudienceRequestBuild, "Builder(fetchUri)\n      …s())\n            .build()");
        return fetchAndJoinCustomAudienceRequestBuild;
    }
}
