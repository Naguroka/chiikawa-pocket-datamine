package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionFromOutcomesConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "adSelectionIds", "", "", "adSelectionSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "selectionLogicUri", "Landroid/net/Uri;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/util/List;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroid/net/Uri;)V", "getAdSelectionIds", "()Ljava/util/List;", "getAdSelectionSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getSelectionLogicUri", "()Landroid/net/Uri;", "setSelectionLogicUri", "(Landroid/net/Uri;)V", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertToAdServices", "Landroid/adservices/adselection/AdSelectionFromOutcomesConfig;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionFromOutcomesConfig {
    private final java.util.List<java.lang.Long> adSelectionIds;
    private final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals;
    private android.net.Uri selectionLogicUri;
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller;

    public AdSelectionFromOutcomesConfig(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller, java.util.List<java.lang.Long> adSelectionIds, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals, android.net.Uri selectionLogicUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seller, "seller");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionIds, "adSelectionIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionLogicUri, "selectionLogicUri");
        this.seller = seller;
        this.adSelectionIds = adSelectionIds;
        this.adSelectionSignals = adSelectionSignals;
        this.selectionLogicUri = selectionLogicUri;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final java.util.List<java.lang.Long> getAdSelectionIds() {
        return this.adSelectionIds;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final android.net.Uri getSelectionLogicUri() {
        return this.selectionLogicUri;
    }

    public final void setSelectionLogicUri(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.selectionLogicUri = uri;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.seller, adSelectionFromOutcomesConfig.seller) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSelectionIds, adSelectionFromOutcomesConfig.adSelectionIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSelectionSignals, adSelectionFromOutcomesConfig.adSelectionSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectionLogicUri, adSelectionFromOutcomesConfig.selectionLogicUri);
    }

    public int hashCode() {
        return (((((this.seller.hashCode() * 31) + this.adSelectionIds.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.selectionLogicUri.hashCode();
    }

    public java.lang.String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.seller + ", adSelectionIds='" + this.adSelectionIds + "', adSelectionSignals=" + this.adSelectionSignals + ", selectionLogicUri=" + this.selectionLogicUri;
    }

    public final android.adservices.adselection.AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = new android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder().setSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setAdSelectionIds(this.adSelectionIds).setSelectionLogicUri(this.selectionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSelectionFromOutcomesConfigBuild, "Builder()\n            .s…s())\n            .build()");
        return adSelectionFromOutcomesConfigBuild;
    }
}
