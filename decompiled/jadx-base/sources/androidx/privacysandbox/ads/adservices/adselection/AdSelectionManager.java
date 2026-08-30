package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "", "()V", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportEvent", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportImpression", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AdSelectionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager obtain(android.content.Context context) {
        return INSTANCE.obtain(context);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract java.lang.Object getAdSelectionData(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> continuation);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract java.lang.Object persistAdSelectionResult(androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public abstract java.lang.Object reportEvent(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object reportImpression(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
    public abstract java.lang.Object updateAdCounterHistogram(androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX INFO: compiled from: AdSelectionManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager obtain(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 4) {
                return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerApi33Ext4Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager) androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE.getManager(context, "AdSelectionManager", new kotlin.jvm.functions.Function1<android.content.Context, androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerApi31Ext9Impl invoke(android.content.Context it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerApi31Ext9Impl(context);
                    }
                });
            }
            return null;
        }
    }
}
