package com.unity3d.services;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\"\u0010\u0017\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "fetchToken", "", "sync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishOMIDSession", "Lkotlinx/coroutines/Job;", "opportunityId", "getToken", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "isAlternativeFlowEnabled", "", "load", com.json.y8.j, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Lcom/unity3d/ads/IUnityAdsLoadListener;", com.json.h6.u, "Lcom/unity3d/services/banners/UnityBannerSize;", com.json.j5.v, "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Lcom/unity3d/ads/core/data/model/Listeners;", "unity-ads_release", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "setInitializationState", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "initializeSDK", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "context", "Landroid/content/Context;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getAdObject", "Lcom/unity3d/ads/core/domain/GetAdObject;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsSDK implements com.unity3d.services.core.di.IServiceComponent {
    public static final com.unity3d.services.UnityAdsSDK INSTANCE = new com.unity3d.services.UnityAdsSDK();

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$fetchToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK", f = "UnityAdsSDK.kt", i = {0, 0, 0, 0, 0, 0}, l = {141}, m = "fetchToken", n = {"sync", "getInitializationState$delegate", "sendDiagnosticEvent$delegate", "reason", "reasonDebug", "startTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.services.UnityAdsSDK.this.fetchToken(null, this);
        }
    }

    private UnityAdsSDK() {
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.configuration.AlternativeFlowReader initialize$lambda$0(kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job initialize() {
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
            }
        });
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.SetInitializationState invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SetInitializationState.class));
            }
        });
        kotlin.Lazy lazy3 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.task.InitializeSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.services.core.domain.task.InitializeSDK invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeSDK.class));
            }
        });
        kotlin.Lazy lazy4 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.InitializeBoldSDK invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.InitializeBoldSDK.class));
            }
        });
        initialize$lambda$1(lazy2).invoke(com.unity3d.ads.core.data.model.InitializationState.INITIALIZING);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK.C17531(coroutineScope, lazy, lazy4, lazy3, null), 3, null);
    }

    private static final com.unity3d.ads.core.domain.SetInitializationState initialize$lambda$1(kotlin.Lazy<? extends com.unity3d.ads.core.domain.SetInitializationState> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.services.core.domain.task.InitializeSDK initialize$lambda$2(kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.InitializeBoldSDK initialize$lambda$3(kotlin.Lazy<? extends com.unity3d.ads.core.domain.InitializeBoldSDK> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", i = {}, l = {64, 66}, m = "invokeSuspend", n = {}, s = {})
    static final class C17531 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> $alternativeFlowReader$delegate;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope $initScope;
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.InitializeBoldSDK> $initializeBoldSDK$delegate;
        final /* synthetic */ kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> $initializeSDK$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17531(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.InitializeBoldSDK> lazy2, kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> lazy3, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.C17531> continuation) {
            super(2, continuation);
            this.$initScope = coroutineScope;
            this.$alternativeFlowReader$delegate = lazy;
            this.$initializeBoldSDK$delegate = lazy2;
            this.$initializeSDK$delegate = lazy3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.C17531(this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.C17531) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.unity3d.services.UnityAdsSDK.initialize$lambda$0(this.$alternativeFlowReader$delegate).invoke()) {
                    this.label = 1;
                    if (com.unity3d.services.UnityAdsSDK.initialize$lambda$3(this.$initializeBoldSDK$delegate).invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (com.unity3d.services.UnityAdsSDK.initialize$lambda$2(this.$initializeSDK$delegate).mo1219invokegIAlus(com.unity3d.services.core.domain.task.EmptyParams.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                ((kotlin.Result) obj).getValue();
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$initScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    private static final com.unity3d.ads.core.configuration.AlternativeFlowReader isAlternativeFlowEnabled$lambda$4(kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    public final boolean isAlternativeFlowEnabled() {
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        return isAlternativeFlowEnabled$lambda$4(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$isAlternativeFlowEnabled$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
            }
        })).invoke();
    }

    public static /* synthetic */ kotlinx.coroutines.Job load$default(com.unity3d.services.UnityAdsSDK unityAdsSDK, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    public final kotlinx.coroutines.Job load(java.lang.String placementId, com.unity3d.ads.UnityAdsLoadOptions loadOptions, com.unity3d.ads.IUnityAdsLoadListener listener, com.unity3d.services.banners.UnityBannerSize bannerSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        final java.lang.String str = "";
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK.C17541(placementId, loadOptions, listener, bannerSize, coroutineScope, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.content.Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final android.content.Context invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class));
            }
        }), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.content.Context load$lambda$5(kotlin.Lazy<? extends android.content.Context> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class C17541 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.banners.UnityBannerSize $bannerSize;
        final /* synthetic */ kotlin.Lazy<android.content.Context> $context$delegate;
        final /* synthetic */ com.unity3d.ads.IUnityAdsLoadListener $listener;
        final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope $loadScope;
        final /* synthetic */ java.lang.String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17541(java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends android.content.Context> lazy, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.C17541> continuation) {
            super(2, continuation);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = coroutineScope;
            this.$context$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.C17541(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.C17541) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((com.unity3d.ads.core.domain.LegacyLoadUseCase) com.unity3d.services.UnityAdsSDK.INSTANCE.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyLoadUseCase.class))).invoke(com.unity3d.services.UnityAdsSDK.load$lambda$5(this.$context$delegate), this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$loadScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    public final kotlinx.coroutines.Job show(java.lang.String placementId, com.unity3d.ads.UnityAdsShowOptions showOptions, com.unity3d.ads.core.data.model.Listeners listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_SHOW_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        final java.lang.String str = "";
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK.C17551((com.unity3d.ads.core.domain.LegacyShowUseCase) unityAdsSDK.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyShowUseCase.class)), placementId, showOptions, listener, coroutineScope, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.content.Context>() { // from class: com.unity3d.services.UnityAdsSDK$show$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final android.content.Context invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class));
            }
        }), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.content.Context show$lambda$6(kotlin.Lazy<? extends android.content.Context> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class C17551 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.Lazy<android.content.Context> $context$delegate;
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listener;
        final /* synthetic */ java.lang.String $placementId;
        final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17551(com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners listeners, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends android.content.Context> lazy, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.C17551> continuation) {
            super(2, continuation);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = coroutineScope;
            this.$context$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.C17551(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, this.$context$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.C17551) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$showBoldSDK.invoke(com.unity3d.services.UnityAdsSDK.show$lambda$6(this.$context$delegate), this.$placementId, this.$showOptions, this.$listener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$showScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    static final class C17521 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
        int label;

        C17521(kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.C17521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.C17521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.C17521) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.services.UnityAdsSDK.INSTANCE.fetchToken(com.json.mediationsdk.metadata.a.g, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public final java.lang.String getToken() {
        return (java.lang.String) kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.services.UnityAdsSDK.C17521(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken getToken$lambda$7(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job getToken(com.unity3d.ads.IUnityAdsTokenListener listener) {
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken.class));
            }
        });
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_GET_TOKEN_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK.AnonymousClass2(listener, coroutineScope, lazy, null), 3, null);
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope $getTokenScope;
        final /* synthetic */ com.unity3d.ads.IUnityAdsTokenListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> lazy, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = coroutineScope;
            this.$getAsyncHeaderBiddingToken$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.AnonymousClass2(this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.services.UnityAdsSDK.getToken$lambda$7(this.$getAsyncHeaderBiddingToken$delegate).invoke(this.$listener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$getTokenScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0128  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    public final java.lang.Object fetchToken(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.unity3d.services.UnityAdsSDK.AnonymousClass1 anonymousClass1;
        kotlin.Lazy lazy;
        kotlin.Lazy lazy2;
        long jM2767markNowz9LOYto;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        long j;
        kotlin.Lazy lazy3;
        kotlin.Lazy lazy4;
        java.lang.String str2;
        java.lang.String str3;
        java.util.Map mapCreateMapBuilder;
        java.lang.String str4 = str;
        if (continuation instanceof com.unity3d.services.UnityAdsSDK.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.services.UnityAdsSDK.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.services.UnityAdsSDK.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.services.UnityAdsSDK.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
            final java.lang.String str5 = "";
            kotlin.Lazy lazy5 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.domain.GetHeaderBiddingToken invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetHeaderBiddingToken.class));
                }
            });
            lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.domain.GetInitializationState invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class));
                }
            });
            lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.unity3d.ads.core.domain.SendDiagnosticEvent invoke() {
                    com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str5, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class));
                }
            });
            jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$10(lazy2), "native_gateway_token_started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", str4), kotlin.TuplesKt.to("state", fetchToken$lambda$9(lazy).invoke().toString())), null, null, 26, null);
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            if (fetchToken$lambda$9(lazy).invoke() != com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) {
                objectRef3.element = "not_initialized";
                objectRef2 = objectRef3;
                str2 = null;
            } else {
                try {
                    com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$8 = fetchToken$lambda$8(lazy5);
                    anonymousClass1.L$0 = str4;
                    anonymousClass1.L$1 = lazy;
                    anonymousClass1.L$2 = lazy2;
                    anonymousClass1.L$3 = objectRef3;
                    anonymousClass1.L$4 = objectRef;
                    anonymousClass1.J$0 = jM2767markNowz9LOYto;
                    anonymousClass1.label = 1;
                    objInvoke = getHeaderBiddingTokenFetchToken$lambda$8.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                    j = jM2767markNowz9LOYto;
                    lazy3 = lazy;
                    lazy4 = lazy2;
                    str2 = (java.lang.String) objInvoke;
                    jM2767markNowz9LOYto = j;
                    kotlin.Lazy lazy6 = lazy3;
                    lazy2 = lazy4;
                    lazy = lazy6;
                } catch (java.lang.Exception e) {
                    e = e;
                    objectRef2 = objectRef3;
                    j = jM2767markNowz9LOYto;
                    lazy3 = lazy;
                    lazy4 = lazy2;
                    objectRef2.element = "uncaught_exception";
                    objectRef.element = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                    jM2767markNowz9LOYto = j;
                    str2 = null;
                    kotlin.Lazy lazy7 = lazy3;
                    lazy2 = lazy4;
                    lazy = lazy7;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$10 = fetchToken$lambda$10(lazy2);
                    if (str2 == null) {
                        str3 = "native_gateway_token_failure_time";
                    } else {
                        str3 = "native_gateway_token_success_time";
                    }
                    java.lang.String str6 = str3;
                    java.lang.Double dBoxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto)));
                    mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("sync", str4);
                    mapCreateMapBuilder.put("state", fetchToken$lambda$9(lazy).invoke().toString());
                    if (((java.lang.String) objectRef2.element) != null) {
                    }
                    if (((java.lang.String) objectRef.element) != null) {
                        mapCreateMapBuilder.put("reason_debug", objectRef.element);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$10, str6, dBoxDouble, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
                    return str2;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass1.J$0;
            kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) anonymousClass1.L$4;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) anonymousClass1.L$3;
            lazy4 = (kotlin.Lazy) anonymousClass1.L$2;
            lazy3 = (kotlin.Lazy) anonymousClass1.L$1;
            java.lang.String str7 = (java.lang.String) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                objectRef = objectRef4;
                str4 = str7;
                try {
                    str2 = (java.lang.String) objInvoke;
                    jM2767markNowz9LOYto = j;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    objectRef2.element = "uncaught_exception";
                    objectRef.element = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                    jM2767markNowz9LOYto = j;
                    str2 = null;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                objectRef = objectRef4;
                str4 = str7;
                objectRef2.element = "uncaught_exception";
                objectRef.element = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                jM2767markNowz9LOYto = j;
                str2 = null;
                kotlin.Lazy lazy8 = lazy3;
                lazy2 = lazy4;
                lazy = lazy8;
                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$11 = fetchToken$lambda$10(lazy2);
                if (str2 == null) {
                    str3 = "native_gateway_token_failure_time";
                } else {
                    str3 = "native_gateway_token_success_time";
                }
                java.lang.String str8 = str3;
                java.lang.Double dBoxDouble2 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto)));
                mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("sync", str4);
                mapCreateMapBuilder.put("state", fetchToken$lambda$9(lazy).invoke().toString());
                if (((java.lang.String) objectRef2.element) != null) {
                }
                if (((java.lang.String) objectRef.element) != null) {
                    mapCreateMapBuilder.put("reason_debug", objectRef.element);
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$11, str8, dBoxDouble2, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
                return str2;
            }
            kotlin.Lazy lazy9 = lazy3;
            lazy2 = lazy4;
            lazy = lazy9;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$12 = fetchToken$lambda$10(lazy2);
        if (str2 == null) {
            str3 = "native_gateway_token_failure_time";
        } else {
            str3 = "native_gateway_token_success_time";
        }
        java.lang.String str9 = str3;
        java.lang.Double dBoxDouble3 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto)));
        mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("sync", str4);
        mapCreateMapBuilder.put("state", fetchToken$lambda$9(lazy).invoke().toString());
        if (((java.lang.String) objectRef2.element) != null) {
        }
        if (((java.lang.String) objectRef.element) != null) {
            mapCreateMapBuilder.put("reason_debug", objectRef.element);
        }
        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$12, str9, dBoxDouble3, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
        return str2;
    }

    private static final com.unity3d.ads.core.domain.GetHeaderBiddingToken fetchToken$lambda$8(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetHeaderBiddingToken> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.domain.GetInitializationState fetchToken$lambda$9(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetInitializationState> lazy) {
        return lazy.getValue();
    }

    private static final com.unity3d.ads.core.domain.SendDiagnosticEvent fetchToken$lambda$10(kotlin.Lazy<? extends com.unity3d.ads.core.domain.SendDiagnosticEvent> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.GetAdObject finishOMIDSession$lambda$14(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAdObject> lazy) {
        return lazy.getValue();
    }

    public final kotlinx.coroutines.Job finishOMIDSession(java.lang.String opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        final com.unity3d.services.UnityAdsSDK unityAdsSDK = this;
        final java.lang.String str = "";
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.GetAdObject invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdObject.class));
            }
        });
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.domain.om.OmFinishSession invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmFinishSession.class));
            }
        });
        kotlin.Lazy lazy3 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = unityAdsSDK;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class));
            }
        });
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) unityAdsSDK.getServiceProvider().getRegistry().getService(com.unity3d.services.core.di.ServiceProvider.NAMED_OMID_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class));
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.unity3d.services.UnityAdsSDK.C17511(opportunityId, coroutineScope, lazy3, lazy, lazy2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.domain.om.OmFinishSession finishOMIDSession$lambda$15(kotlin.Lazy<? extends com.unity3d.ads.core.domain.om.OmFinishSession> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.unity3d.ads.core.configuration.AlternativeFlowReader finishOMIDSession$lambda$16(kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UnityAdsSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", i = {}, l = {org.objectweb.asm.Opcodes.LOOKUPSWITCH, 172}, m = "invokeSuspend", n = {}, s = {})
    static final class C17511 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> $alternativeFlowReader$delegate;
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.GetAdObject> $getAdObject$delegate;
        final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.om.OmFinishSession> $omFinishSession$delegate;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope $omidScope;
        final /* synthetic */ java.lang.String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17511(java.lang.String str, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAdObject> lazy2, kotlin.Lazy<? extends com.unity3d.ads.core.domain.om.OmFinishSession> lazy3, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK.C17511> continuation) {
            super(2, continuation);
            this.$opportunityId = str;
            this.$omidScope = coroutineScope;
            this.$alternativeFlowReader$delegate = lazy;
            this.$getAdObject$delegate = lazy2;
            this.$omFinishSession$delegate = lazy3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.UnityAdsSDK.C17511(this.$opportunityId, this.$omidScope, this.$alternativeFlowReader$delegate, this.$getAdObject$delegate, this.$omFinishSession$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.UnityAdsSDK.C17511) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.data.model.AdObject adObject;
            com.unity3d.ads.core.domain.om.OmFinishSession omFinishSessionFinishOMIDSession$lambda$15;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$16(this.$alternativeFlowReader$delegate).invoke()) {
                    this.label = 1;
                    obj = com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$14(this.$getAdObject$delegate).invoke(this.$opportunityId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject = (com.unity3d.ads.core.data.model.AdObject) obj;
                    if (adObject != null) {
                        omFinishSessionFinishOMIDSession$lambda$15 = com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$15(this.$omFinishSession$delegate);
                        this.label = 2;
                        if (omFinishSessionFinishOMIDSession$lambda$15.invoke(adObject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                adObject = (com.unity3d.ads.core.data.model.AdObject) obj;
                if (adObject != null) {
                    omFinishSessionFinishOMIDSession$lambda$15 = com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$15(this.$omFinishSession$delegate);
                    this.label = 2;
                    if (omFinishSessionFinishOMIDSession$lambda$15.invoke(adObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$omidScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }
}
