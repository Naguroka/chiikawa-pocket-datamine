package com.unity3d.ads.core.data.manager;

/* JADX INFO: compiled from: TransactionEventManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u0086\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "storeMonitor", "Lcom/unity3d/services/store/StoreMonitor;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionRequest", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/services/store/StoreMonitor;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "onPurchasesReceived", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "purchases", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventManager {
    private static final java.lang.String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    private final com.unity3d.ads.core.domain.events.GetTransactionData getTransactionData;
    private final com.unity3d.ads.core.domain.events.GetTransactionRequest getTransactionRequest;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.services.store.StoreMonitor storeMonitor;
    private final com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository;

    public TransactionEventManager(kotlinx.coroutines.CoroutineScope scope, com.unity3d.services.store.StoreMonitor storeMonitor, com.unity3d.ads.core.domain.events.GetTransactionData getTransactionData, com.unity3d.ads.core.domain.events.GetTransactionRequest getTransactionRequest, com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository, com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeMonitor, "storeMonitor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionData, "getTransactionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionRequest, "getTransactionRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.storeMonitor = storeMonitor;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ void access$onPurchasesReceived(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.TransactionEventManager.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.manager.TransactionEventManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.manager.TransactionEventManager.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!com.unity3d.ads.core.data.manager.TransactionEventManager.this.storeMonitor.isInitialized()) {
                        final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager = com.unity3d.ads.core.data.manager.TransactionEventManager.this;
                        this.L$0 = transactionEventManager;
                        this.label = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        transactionEventManager.storeMonitor.initialize(new com.unity3d.services.store.gpbl.listeners.BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                            private final void tryResume() {
                                if (cancellableContinuationImpl2.isActive()) {
                                    kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
                                }
                            }

                            private final void tryResumeWithException(java.lang.Exception exception) {
                                if (cancellableContinuationImpl2.isActive()) {
                                    kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(exception)));
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                            public void onIsAlreadyInitialized() {
                                tryResume();
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingSetupFinished(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                                if (billingResult.getResponseCode() != com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
                                    tryResumeWithException(new com.unity3d.ads.core.data.model.exception.TransactionException("Billing setup failed"));
                                } else {
                                    tryResume();
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingServiceDisconnected() {
                                tryResumeWithException(new com.unity3d.ads.core.data.model.exception.TransactionException("Billing service disconnected"));
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                            public void onPurchaseUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                                transactionEventManager.onPurchasesReceived(billingResult, purchases);
                            }
                        });
                        java.lang.Object result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.store.StoreMonitor storeMonitor = com.unity3d.ads.core.data.manager.TransactionEventManager.this.storeMonitor;
                final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager2 = com.unity3d.ads.core.data.manager.TransactionEventManager.this;
                storeMonitor.getPurchases(42, "inapp", new com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda0
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list) {
                        com.unity3d.ads.core.data.manager.TransactionEventManager.access$onPurchasesReceived(transactionEventManager2, billingResultBridge, list);
                    }
                });
            } catch (java.lang.Exception unused) {
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.data.manager.TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, 30, null);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public final void invoke() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.core.data.manager.TransactionEventManager.AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 1}, l = {92, 109, 112}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE, "index$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "purchaseTime", "transactionDataList"}, s = {"L$0", "L$1", "L$4", "I$0", "I$1", "J$0", "L$0"})
    static final class C16391 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> $purchases;
        int I$0;
        int I$1;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        final /* synthetic */ com.unity3d.ads.core.data.manager.TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16391(java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list, com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.TransactionEventManager.C16391> continuation) {
            super(2, continuation);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.data.manager.TransactionEventManager.C16391(this.$purchases, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.manager.TransactionEventManager.C16391) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:24:0x00e3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:28:0x010a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0137  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e4 -> B:26:0x00f3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C16391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3$lambda$2(java.util.List list, int i, java.util.List list2, com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.services.store.gpbl.bridges.PurchaseBridge purchaseBridge, com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.util.List list3) {
            if (list3 == null || billingResultBridge.getResponseCode() != com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
                ((kotlinx.coroutines.CompletableDeferred) list.get(i)).complete(kotlin.Unit.INSTANCE);
                return;
            }
            java.util.List list4 = list3;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(transactionEventManager.getTransactionData.invoke(purchaseBridge, (com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge) it.next()));
            }
            list2.addAll(arrayList);
            ((kotlinx.coroutines.CompletableDeferred) list.get(i)).complete(kotlin.Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases) {
        if (billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
            java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> list = purchases;
            if (list == null || list.isEmpty()) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.core.data.manager.TransactionEventManager.C16391(purchases, this, null), 3, null);
        }
    }
}
