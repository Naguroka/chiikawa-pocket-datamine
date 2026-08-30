package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0097@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0097@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0097@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020#H\u0083@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0097@¢\u0006\u0002\u0010(R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006+"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "mAdSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "(Landroid/adservices/adselection/AdSelectionManager;)V", "getMAdSelectionManager", "()Landroid/adservices/adselection/AdSelectionManager;", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportEvent", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportImpression", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAdsInternal", "Landroid/adservices/adselection/AdSelectionOutcome;", "Landroid/adservices/adselection/AdSelectionConfig;", "(Landroid/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AdSelectionManagerImplCommon extends androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager {
    private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", i = {}, l = {44}, m = "selectAds$suspendImpl", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.this, (androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig) null, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object getAdSelectionData(androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> continuation) {
        return getAdSelectionData$suspendImpl(this, getAdSelectionDataRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object persistAdSelectionResult(androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        return persistAdSelectionResult$suspendImpl(this, persistAdSelectionResultRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object reportEvent(androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return reportEvent$suspendImpl(this, reportEventRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object reportImpression(androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return reportImpression$suspendImpl(this, reportImpressionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        return selectAds$suspendImpl(this, adSelectionConfig, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        return selectAds$suspendImpl(this, adSelectionFromOutcomesConfig, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public java.lang.Object updateAdCounterHistogram(androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return updateAdCounterHistogram$suspendImpl(this, updateAdCounterHistogramRequest, continuation);
    }

    protected final android.adservices.adselection.AdSelectionManager getMAdSelectionManager() {
        return this.mAdSelectionManager;
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
        this.mAdSelectionManager = mAdSelectionManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ java.lang.Object selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig adSelectionConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1 anonymousClass1;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1) {
            anonymousClass1 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = adSelectionManagerImplCommon.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = adSelectionManagerImplCommon.new AnonymousClass1(continuation);
        }
        java.lang.Object objSelectAdsInternal = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objSelectAdsInternal);
            android.adservices.adselection.AdSelectionConfig adSelectionConfigConvertToAdServices$ads_adservices_release = adSelectionConfig.convertToAdServices$ads_adservices_release();
            anonymousClass1.label = 1;
            objSelectAdsInternal = adSelectionManagerImplCommon.selectAdsInternal(adSelectionConfigConvertToAdServices$ads_adservices_release, anonymousClass1);
            if (objSelectAdsInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objSelectAdsInternal);
        }
        return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome((android.adservices.adselection.AdSelectionOutcome) objSelectAdsInternal);
    }

    static /* synthetic */ java.lang.Object selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.INSTANCE.selectAds(adSelectionManagerImplCommon.mAdSelectionManager, adSelectionFromOutcomesConfig, continuation);
        }
        throw new java.lang.UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    static /* synthetic */ java.lang.Object reportEvent$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 8 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
            java.lang.Object objReportEvent = androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext8Impl.INSTANCE.reportEvent(adSelectionManagerImplCommon.mAdSelectionManager, reportEventRequest, continuation);
            return objReportEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objReportEvent : kotlin.Unit.INSTANCE;
        }
        throw new java.lang.UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
    }

    static /* synthetic */ java.lang.Object updateAdCounterHistogram$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 8 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
            java.lang.Object objUpdateAdCounterHistogram = androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext8Impl.INSTANCE.updateAdCounterHistogram(adSelectionManagerImplCommon.mAdSelectionManager, updateAdCounterHistogramRequest, continuation);
            return objUpdateAdCounterHistogram == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateAdCounterHistogram : kotlin.Unit.INSTANCE;
        }
        throw new java.lang.UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
    }

    static /* synthetic */ java.lang.Object getAdSelectionData$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> continuation) {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.INSTANCE.getAdSelectionData(adSelectionManagerImplCommon.mAdSelectionManager, getAdSelectionDataRequest, continuation);
        }
        throw new java.lang.UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    static /* synthetic */ java.lang.Object persistAdSelectionResult$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.INSTANCE.persistAdSelectionResult(adSelectionManagerImplCommon.mAdSelectionManager, persistAdSelectionResultRequest, continuation);
        }
        throw new java.lang.UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion(null);

        private Ext10Impl() {
        }

        /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0087@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0087@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion;", "", "()V", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "adSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            public final java.lang.Object getAdSelectionData(android.adservices.adselection.AdSelectionManager adSelectionManager, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> continuation) {
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1;
                if (continuation instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) continuation;
                    if ((adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.label & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.label -= Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, continuation);
                }
                java.lang.Object result = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(result);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.L$0 = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.L$1 = getAdSelectionDataRequest;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.label = 1;
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$2 = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$2), 1);
                    cancellableContinuationImpl.initCancellability();
                    adSelectionManager.getAdSelectionData(getAdSelectionDataRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$2);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(result);
                }
                return new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome((android.adservices.adselection.GetAdSelectionDataOutcome) result);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            public final java.lang.Object persistAdSelectionResult(android.adservices.adselection.AdSelectionManager adSelectionManager, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1;
                if (continuation instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) continuation;
                    if ((adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.label & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.label -= Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, continuation);
                }
                java.lang.Object result = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(result);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.L$0 = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.L$1 = persistAdSelectionResultRequest;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.label = 1;
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$2 = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$2), 1);
                    cancellableContinuationImpl.initCancellability();
                    adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$2);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(result);
                }
                return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome((android.adservices.adselection.AdSelectionOutcome) result);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            public final java.lang.Object selectAds(android.adservices.adselection.AdSelectionManager adSelectionManager, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                if (continuation instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) continuation;
                    if ((adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label -= Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                }
                java.lang.Object result = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(result);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$0 = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$1 = adSelectionFromOutcomesConfig;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label = 1;
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$2 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$2), 1);
                    cancellableContinuationImpl.initCancellability();
                    adSelectionManager.selectAds(adSelectionFromOutcomesConfig.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$2);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(result);
                }
                return new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome((android.adservices.adselection.AdSelectionOutcome) result);
            }
        }
    }

    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl;", "", "()V", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext8Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext8Impl.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext8Impl.Companion(null);

        private Ext8Impl() {
        }

        /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion;", "", "()V", "reportEvent", "", "adSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final java.lang.Object updateAdCounterHistogram(android.adservices.adselection.AdSelectionManager adSelectionManager, androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.initCancellability();
                adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                java.lang.Object result = cancellableContinuationImpl.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
            }

            public final java.lang.Object reportEvent(android.adservices.adselection.AdSelectionManager adSelectionManager, androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest reportEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.initCancellability();
                adSelectionManager.reportEvent(reportEventRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                java.lang.Object result = cancellableContinuationImpl.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, kotlin.coroutines.Continuation<? super android.adservices.adselection.AdSelectionOutcome> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        getMAdSelectionManager().selectAds(adSelectionConfig, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static /* synthetic */ java.lang.Object reportImpression$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon adSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest reportImpressionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        adSelectionManagerImplCommon.getMAdSelectionManager().reportImpression(reportImpressionRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
