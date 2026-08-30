package androidx.privacysandbox.ads.adservices.common;

/* JADX INFO: compiled from: AdData.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003 !\"B3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\fB?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData;", "", "renderUri", "Landroid/net/Uri;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "", "adCounterKeys", "", "", "adFilters", "Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Set;Landroidx/privacysandbox/ads/adservices/common/AdFilters;)V", "(Landroid/net/Uri;Ljava/lang/String;)V", "adRenderId", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Set;Landroidx/privacysandbox/ads/adservices/common/AdFilters;Ljava/lang/String;)V", "getAdCounterKeys", "()Ljava/util/Set;", "getAdFilters", "()Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "getAdRenderId", "()Ljava/lang/String;", "getMetadata", "getRenderUri", "()Landroid/net/Uri;", "convertToAdServices", "Landroid/adservices/common/AdData;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "Ext10Impl", "Ext4Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdData {
    private final java.util.Set<java.lang.Integer> adCounterKeys;
    private final androidx.privacysandbox.ads.adservices.common.AdFilters adFilters;
    private final java.lang.String adRenderId;
    private final java.lang.String metadata;
    private final android.net.Uri renderUri;

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public AdData(android.net.Uri renderUri, java.lang.String metadata, java.util.Set<java.lang.Integer> adCounterKeys, androidx.privacysandbox.ads.adservices.common.AdFilters adFilters, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "metadata");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCounterKeys, "adCounterKeys");
        this.renderUri = renderUri;
        this.metadata = metadata;
        this.adCounterKeys = adCounterKeys;
        this.adFilters = adFilters;
        this.adRenderId = str;
    }

    public final android.net.Uri getRenderUri() {
        return this.renderUri;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ AdData(android.net.Uri uri, java.lang.String str, java.util.Set set, androidx.privacysandbox.ads.adservices.common.AdFilters adFilters, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 8) != 0 ? null : adFilters, (i & 16) != 0 ? null : str2);
    }

    public final java.util.Set<java.lang.Integer> getAdCounterKeys() {
        return this.adCounterKeys;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdFilters getAdFilters() {
        return this.adFilters;
    }

    public final java.lang.String getAdRenderId() {
        return this.adRenderId;
    }

    public /* synthetic */ AdData(android.net.Uri uri, java.lang.String str, java.util.Set set, androidx.privacysandbox.ads.adservices.common.AdFilters adFilters, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 8) != 0 ? null : adFilters);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public AdData(android.net.Uri renderUri, java.lang.String metadata, java.util.Set<java.lang.Integer> adCounterKeys, androidx.privacysandbox.ads.adservices.common.AdFilters adFilters) {
        this(renderUri, metadata, adCounterKeys, adFilters, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "metadata");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCounterKeys, "adCounterKeys");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdData(android.net.Uri renderUri, java.lang.String metadata) {
        this(renderUri, metadata, kotlin.collections.SetsKt.emptySet(), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "metadata");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.common.AdData)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.common.AdData adData = (androidx.privacysandbox.ads.adservices.common.AdData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.renderUri, adData.renderUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, adData.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.adCounterKeys, adData.adCounterKeys) && kotlin.jvm.internal.Intrinsics.areEqual(this.adFilters, adData.adFilters) && kotlin.jvm.internal.Intrinsics.areEqual(this.adRenderId, adData.adRenderId);
    }

    public int hashCode() {
        int iHashCode = ((((this.renderUri.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.adCounterKeys.hashCode()) * 31;
        androidx.privacysandbox.ads.adservices.common.AdFilters adFilters = this.adFilters;
        int iHashCode2 = (iHashCode + (adFilters != null ? adFilters.hashCode() : 0)) * 31;
        java.lang.String str = this.adRenderId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + "', adCounterKeys=" + this.adCounterKeys + ", adFilters=" + this.adFilters + ", adRenderId=" + this.adRenderId;
    }

    public final android.adservices.common.AdData convertToAdServices$ads_adservices_release() {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.common.AdData.Ext10Impl.INSTANCE.convertAdData(this);
        }
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 8 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
            return androidx.privacysandbox.ads.adservices.common.AdData.Ext8Impl.INSTANCE.convertAdData(this);
        }
        return androidx.privacysandbox.ads.adservices.common.AdData.Ext4Impl.INSTANCE.convertAdData(this);
    }

    /* JADX INFO: compiled from: AdData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.common.AdData.Ext10Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.common.AdData.Ext10Impl.Companion(null);

        private Ext10Impl() {
        }

        /* JADX INFO: compiled from: AdData.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(androidx.privacysandbox.ads.adservices.common.AdData adData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
                android.adservices.common.AdData.Builder adCounterKeys = new android.adservices.common.AdData.Builder().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).setAdCounterKeys(adData.getAdCounterKeys());
                androidx.privacysandbox.ads.adservices.common.AdFilters adFilters = adData.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).setAdRenderId(adData.getAdRenderId()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }
        }
    }

    /* JADX INFO: compiled from: AdData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext8Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.common.AdData.Ext8Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.common.AdData.Ext8Impl.Companion(null);

        private Ext8Impl() {
        }

        /* JADX INFO: compiled from: AdData.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(androidx.privacysandbox.ads.adservices.common.AdData adData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
                if (adData.getAdRenderId() != null) {
                    android.util.Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                android.adservices.common.AdData.Builder adCounterKeys = new android.adservices.common.AdData.Builder().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).setAdCounterKeys(adData.getAdCounterKeys());
                androidx.privacysandbox.ads.adservices.common.AdFilters adFilters = adData.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }
        }
    }

    /* JADX INFO: compiled from: AdData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext4Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.common.AdData.Ext4Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.common.AdData.Ext4Impl.Companion(null);

        private Ext4Impl() {
        }

        /* JADX INFO: compiled from: AdData.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl$Companion;", "", "()V", "convertAdData", "Landroid/adservices/common/AdData;", "adData", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(androidx.privacysandbox.ads.adservices.common.AdData adData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
                if (!adData.getAdCounterKeys().isEmpty()) {
                    android.util.Log.w("AdData", "adCounterKeys is ignored. Min version to use adCounterKeys is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdFilters() != null) {
                    android.util.Log.w("AdData", "adFilters is ignored. Min version to use adFilters is API 33 ext 8 or API 31/32 ext 9");
                }
                if (adData.getAdRenderId() != null) {
                    android.util.Log.w("AdData", "adRenderId is ignored. Min version to use adRenderId is API 31 ext 10");
                }
                android.adservices.common.AdData adDataBuild = new android.adservices.common.AdData.Builder().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }
        }
    }
}
