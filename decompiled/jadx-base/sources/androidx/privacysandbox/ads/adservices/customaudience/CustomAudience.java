package androidx.privacysandbox.ads.adservices.customaudience;

/* JADX INFO: compiled from: CustomAudience.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001*Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "dailyUpdateUri", "Landroid/net/Uri;", "biddingLogicUri", "ads", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "activationTime", "Ljava/time/Instant;", "expirationTime", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "trustedBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;)V", "getActivationTime", "()Ljava/time/Instant;", "getAds", "()Ljava/util/List;", "getBiddingLogicUri", "()Landroid/net/Uri;", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getDailyUpdateUri", "getExpirationTime", "getName", "()Ljava/lang/String;", "getTrustedBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "getUserBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "equals", "", "other", "hashCode", "", "toString", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomAudience {
    private final java.time.Instant activationTime;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> ads;
    private final android.net.Uri biddingLogicUri;
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer;
    private final android.net.Uri dailyUpdateUri;
    private final java.time.Instant expirationTime;
    private final java.lang.String name;
    private final androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingSignals;
    private final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals userBiddingSignals;

    public CustomAudience(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer, java.lang.String name, android.net.Uri dailyUpdateUri, android.net.Uri biddingLogicUri, java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> ads, java.time.Instant instant, java.time.Instant instant2, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals, androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyer, "buyer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ads, "ads");
        this.buyer = buyer;
        this.name = name;
        this.dailyUpdateUri = dailyUpdateUri;
        this.biddingLogicUri = biddingLogicUri;
        this.ads = ads;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public /* synthetic */ CustomAudience(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier, java.lang.String str, android.net.Uri uri, android.net.Uri uri2, java.util.List list, java.time.Instant instant, java.time.Instant instant2, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals, androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, str, uri, uri2, list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : adSelectionSignals, (i & 256) != 0 ? null : trustedBiddingData);
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final android.net.Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final android.net.Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> getAds() {
        return this.ads;
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

    public final androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.customaudience.CustomAudience)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.customaudience.CustomAudience customAudience = (androidx.privacysandbox.ads.adservices.customaudience.CustomAudience) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.buyer, customAudience.buyer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, customAudience.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        java.time.Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        java.time.Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public java.lang.String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", name=" + this.name + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    /* JADX INFO: compiled from: CustomAudience.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "dailyUpdateUri", "Landroid/net/Uri;", "biddingLogicUri", "ads", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "activationTime", "Ljava/time/Instant;", "expirationTime", "trustedBiddingData", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "build", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "setActivationTime", "setAds", "setBiddingLogicUri", "setBuyer", "setDailyUpdateUri", "setExpirationTime", "setName", "setTrustedBiddingData", "trustedBiddingSignals", "setUserBiddingSignals", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.time.Instant activationTime;
        private java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> ads;
        private android.net.Uri biddingLogicUri;
        private androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer;
        private android.net.Uri dailyUpdateUri;
        private java.time.Instant expirationTime;
        private java.lang.String name;
        private androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingData;
        private androidx.privacysandbox.ads.adservices.common.AdSelectionSignals userBiddingSignals;

        public Builder(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer, java.lang.String name, android.net.Uri dailyUpdateUri, android.net.Uri biddingLogicUri, java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> ads) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyer, "buyer");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setBuyer(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setName(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setActivationTime(java.time.Instant activationTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setExpirationTime(java.time.Instant expirationTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setDailyUpdateUri(android.net.Uri dailyUpdateUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setUserBiddingSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals userBiddingSignals) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setTrustedBiddingData(androidx.privacysandbox.ads.adservices.customaudience.TrustedBiddingData trustedBiddingSignals) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setBiddingLogicUri(android.net.Uri biddingLogicUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience.Builder setAds(java.util.List<androidx.privacysandbox.ads.adservices.common.AdData> ads) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ads, "ads");
            this.ads = ads;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience build() {
            return new androidx.privacysandbox.ads.adservices.customaudience.CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }
    }
}
