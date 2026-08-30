package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\r\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020&0%*\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0003J&\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010(0'*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\fH\u0003R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006*"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "decisionLogicUri", "Landroid/net/Uri;", "customAudienceBuyers", "", "adSelectionSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "sellerSignals", "perBuyerSignals", "", "trustedScoringSignalsUri", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Landroid/net/Uri;Ljava/util/List;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Ljava/util/Map;Landroid/net/Uri;)V", "getAdSelectionSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getCustomAudienceBuyers", "()Ljava/util/List;", "getDecisionLogicUri", "()Landroid/net/Uri;", "getPerBuyerSignals", "()Ljava/util/Map;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSellerSignals", "getTrustedScoringSignalsUri", "convertToAdServices", "Landroid/adservices/adselection/AdSelectionConfig;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "", "Landroid/adservices/common/AdTechIdentifier;", "", "Landroid/adservices/common/AdSelectionSignals;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.Companion(null);
    private static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig EMPTY;
    private final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> customAudienceBuyers;
    private final android.net.Uri decisionLogicUri;
    private final java.util.Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> perBuyerSignals;
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller;
    private final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals sellerSignals;
    private final android.net.Uri trustedScoringSignalsUri;

    public AdSelectionConfig(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller, android.net.Uri decisionLogicUri, java.util.List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> customAudienceBuyers, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals sellerSignals, java.util.Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> perBuyerSignals, android.net.Uri trustedScoringSignalsUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seller, "seller");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decisionLogicUri, "decisionLogicUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAudienceBuyers, "customAudienceBuyers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sellerSignals, "sellerSignals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(perBuyerSignals, "perBuyerSignals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.seller = seller;
        this.decisionLogicUri = decisionLogicUri;
        this.customAudienceBuyers = customAudienceBuyers;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = sellerSignals;
        this.perBuyerSignals = perBuyerSignals;
        this.trustedScoringSignalsUri = trustedScoringSignalsUri;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final android.net.Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    public final java.util.Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    public final android.net.Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.seller, adSelectionConfig.seller) && kotlin.jvm.internal.Intrinsics.areEqual(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.sellerSignals, adSelectionConfig.sellerSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && kotlin.jvm.internal.Intrinsics.areEqual(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    public int hashCode() {
        return (((((((((((this.seller.hashCode() * 31) + this.decisionLogicUri.hashCode()) * 31) + this.customAudienceBuyers.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.sellerSignals.hashCode()) * 31) + this.perBuyerSignals.hashCode()) * 31) + this.trustedScoringSignalsUri.hashCode();
    }

    public java.lang.String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }

    public final android.adservices.adselection.AdSelectionConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = new android.adservices.adselection.AdSelectionConfig.Builder().setAdSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setCustomAudienceBuyers(convertToAdServices(this.customAudienceBuyers)).setDecisionLogicUri(this.decisionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).setPerBuyerSignals(convertToAdServices(this.perBuyerSignals)).setSellerSignals(this.sellerSignals.convertToAdServices$ads_adservices_release()).setTrustedScoringSignalsUri(this.trustedScoringSignalsUri).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
        return adSelectionConfigBuild;
    }

    private final java.util.List<android.adservices.common.AdTechIdentifier> convertToAdServices(java.util.List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    private final java.util.Map<android.adservices.common.AdTechIdentifier, android.adservices.common.AdSelectionSignals> convertToAdServices(java.util.Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
            android.adservices.common.AdTechIdentifier adTechIdentifierConvertToAdServices$ads_adservices_release = adTechIdentifier.convertToAdServices$ads_adservices_release();
            androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
            map2.put(adTechIdentifierConvertToAdServices$ads_adservices_release, adSelectionSignals != null ? adSelectionSignals.convertToAdServices$ads_adservices_release() : null);
        }
        return map2;
    }

    /* JADX INFO: compiled from: AdSelectionConfig.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig$Companion;", "", "()V", "EMPTY", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "getEMPTY", "()Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig getEMPTY() {
            return androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig.EMPTY;
        }
    }

    static {
        androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier = new androidx.privacysandbox.ads.adservices.common.AdTechIdentifier("");
        android.net.Uri EMPTY2 = android.net.Uri.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = new androidx.privacysandbox.ads.adservices.common.AdSelectionSignals("");
        androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals2 = new androidx.privacysandbox.ads.adservices.common.AdSelectionSignals("");
        java.util.Map mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        android.net.Uri EMPTY3 = android.net.Uri.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY3, "EMPTY");
        EMPTY = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig(adTechIdentifier, EMPTY2, listEmptyList, adSelectionSignals, adSelectionSignals2, mapEmptyMap, EMPTY3);
    }
}
