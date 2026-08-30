package androidx.privacysandbox.ads.adservices.java.adselection;

/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0016\u001a\u00020\u0017H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0019\u001a\u00020\u001aH'¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "", "()V", "getAdSelectionDataAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "persistAdSelectionResultAsync", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "reportEventAsync", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportImpressionAsync", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "selectAdsAsync", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "updateAdCounterHistogramAsync", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AdSelectionManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures from(android.content.Context context) {
        return INSTANCE.from(context);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> getAdSelectionDataAsync(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> persistAdSelectionResultAsync(androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> reportEventAsync(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest);

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> reportImpressionAsync(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest);

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> selectAdsAsync(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> selectAdsAsync(androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> updateAdCounterHistogramAsync(androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0017J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "mAdSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;)V", "getAdSelectionDataAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "persistAdSelectionResultAsync", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "reportEventAsync", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportImpressionAsync", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "selectAdsAsync", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "updateAdCounterHistogramAsync", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4JavaImpl extends androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures {
        private final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> selectAdsAsync(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> selectAdsAsync(androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> reportImpressionAsync(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportImpressionRequest, "reportImpressionRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> updateAdCounterHistogramAsync(androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1(this, updateAdCounterHistogramRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> reportEventAsync(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportEventRequest, "reportEventRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> getAdSelectionDataAsync(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1(this, getAdSelectionDataRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> persistAdSelectionResultAsync(androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1(this, persistAdSelectionResultRequest, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures from(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager adSelectionManagerObtain = androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.INSTANCE.obtain(context);
            return adSelectionManagerObtain != null ? new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl(adSelectionManagerObtain) : null;
        }
    }
}
