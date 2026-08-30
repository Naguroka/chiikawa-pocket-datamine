package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\u0019\u0010'\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0016J!\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J+\u00100\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "_isOMActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "activeSessions", "", "", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "finishedSessions", "", "value", "isOMActive", "()Z", "setOMActive", "(Z)V", "omData", "Lcom/unity3d/ads/core/data/model/OMData;", "getOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "kotlin.jvm.PlatformType", "activateOM", "Lcom/unity3d/ads/core/data/model/OMResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSession", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "adSession", "buildOmData", "finishSession", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "hasSessionFinished", "impressionOccurred", "signalLoaded", "(Lcom/google/protobuf/ByteString;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSession", "sessionFinished", "startSession", "webView", "Landroid/webkit/WebView;", "options", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidOpenMeasurementRepository implements com.unity3d.ads.core.data.repository.OpenMeasurementRepository {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isOMActive;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> activeSessions;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.String>> finishedSessions;
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher;
    private final com.unity3d.ads.core.data.manager.OmidManager omidManager;
    private final com.iab.omid.library.unity3d.adsession.Partner partner;

    public AndroidOpenMeasurementRepository(kotlinx.coroutines.CoroutineDispatcher mainDispatcher, com.unity3d.ads.core.data.manager.OmidManager omidManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = com.iab.omid.library.unity3d.adsession.Partner.createPartner(com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.12.5");
        this.activeSessions = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
        this.finishedSessions = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.SetsKt.emptySet());
        this._isOMActive = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public com.unity3d.ads.core.data.model.OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        java.lang.Boolean value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._isOMActive;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
        final /* synthetic */ android.content.Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.new AnonymousClass2(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.data.model.OMResult.Failure failure;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.isOMActive()) {
                try {
                    com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                    com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository androidOpenMeasurementRepository = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this;
                    androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                    if (com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.isOMActive()) {
                        failure = com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
                    } else {
                        failure = new com.unity3d.ads.core.data.model.OMResult.Failure("om_activate_failure_time", null, 2, null);
                    }
                    return failure;
                } catch (java.lang.Throwable th) {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("uncaught_exception", java.lang.String.valueOf(th.getMessage()));
                }
            }
            return new com.unity3d.ads.core.data.model.OMResult.Failure("om_already_active", null, 2, null);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object activateOM(android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.AnonymousClass2(context, null), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16442 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ com.unity3d.ads.core.data.model.OmidOptions $options;
        final /* synthetic */ android.webkit.WebView $webView;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.iab.omid.library.unity3d.adsession.CreativeType.values().length];
                try {
                    iArr[com.iab.omid.library.unity3d.adsession.CreativeType.HTML_DISPLAY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.iab.omid.library.unity3d.adsession.CreativeType.VIDEO.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16442(com.google.protobuf.ByteString byteString, com.unity3d.ads.core.data.model.OmidOptions omidOptions, android.webkit.WebView webView, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16442> continuation) {
            super(2, continuation);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.new C16442(this.$opportunityId, this.$options, this.$webView, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16442) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContextCreateHtmlAdSessionContext;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                if (com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.isOMActive()) {
                    if (((java.util.Map) com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.activeSessions.getValue()).containsKey(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(this.$opportunityId))) {
                        return new com.unity3d.ads.core.data.model.OMResult.Failure("om_session_already_exists", null, 2, null);
                    }
                    com.iab.omid.library.unity3d.adsession.CreativeType creativeType = this.$options.getCreativeType();
                    if (creativeType == null) {
                        return new com.unity3d.ads.core.data.model.OMResult.Failure("om_creative_type_null", null, 2, null);
                    }
                    com.unity3d.ads.core.data.manager.OmidManager omidManager = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager;
                    com.iab.omid.library.unity3d.adsession.ImpressionType impressionType = this.$options.getImpressionType();
                    if (impressionType == null) {
                        impressionType = com.iab.omid.library.unity3d.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
                    }
                    com.iab.omid.library.unity3d.adsession.ImpressionType impressionType2 = impressionType;
                    com.iab.omid.library.unity3d.adsession.Owner impressionOwner = this.$options.getImpressionOwner();
                    if (impressionOwner == null) {
                        impressionOwner = com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
                    }
                    com.iab.omid.library.unity3d.adsession.Owner owner = impressionOwner;
                    com.iab.omid.library.unity3d.adsession.Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                    if (videoEventsOwner == null) {
                        videoEventsOwner = com.iab.omid.library.unity3d.adsession.Owner.JAVASCRIPT;
                    }
                    com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                    int i = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16442.WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                    if (i == 1) {
                        adSessionContextCreateHtmlAdSessionContext = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                    } else if (i == 2) {
                        adSessionContextCreateHtmlAdSessionContext = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                    } else {
                        return new com.unity3d.ads.core.data.model.OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    com.iab.omid.library.unity3d.adsession.AdSession adSessionCreateAdSession = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
                    adSessionCreateAdSession.registerAdView(this.$webView);
                    adSessionCreateAdSession.start();
                    com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, adSessionCreateAdSession);
                    return com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
                }
                return new com.unity3d.ads.core.data.model.OMResult.Failure("om_not_active", null, 2, null);
            } catch (java.lang.Throwable th) {
                return new com.unity3d.ads.core.data.model.OMResult.Failure("uncaught_exception", java.lang.String.valueOf(th.getMessage()));
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object startSession(com.google.protobuf.ByteString byteString, android.webkit.WebView webView, com.unity3d.ads.core.data.model.OmidOptions omidOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16442(byteString, omidOptions, webView, null), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16422 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16422(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16422> continuation) {
            super(2, continuation);
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.new C16422(this.$opportunityId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16422) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.isOMActive()) {
                com.iab.omid.library.unity3d.adsession.AdSession session = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                if (session == null) {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("om_session_not_found", null, 2, null);
                }
                session.finish();
                com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
                return com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
            }
            return new com.unity3d.ads.core.data.model.OMResult.Failure("om_not_active", null, 2, null);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object finishSession(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16422(byteString, null), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidOpenMeasurementRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16432 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16432(com.google.protobuf.ByteString byteString, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16432> continuation) {
            super(2, continuation);
            this.$opportunityId = byteString;
            this.$signalLoaded = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.new C16432(this.$opportunityId, this.$signalLoaded, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16432) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.iab.omid.library.unity3d.adsession.AdSession session = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
                if (session == null) {
                    return new com.unity3d.ads.core.data.model.OMResult.Failure("om_session_not_found", null, 2, null);
                }
                com.iab.omid.library.unity3d.adsession.AdEvents adEventsCreateAdEvents = com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
                if (this.$signalLoaded) {
                    adEventsCreateAdEvents.loaded();
                }
                adEventsCreateAdEvents.impressionOccurred();
                return com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object impressionOccurred(com.google.protobuf.ByteString byteString, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository.C16432(byteString, z, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.finishedSessions.getValue().contains(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(com.google.protobuf.ByteString opportunityId, com.iab.omid.library.unity3d.adsession.AdSession adSession) {
        java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession> value;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.TuplesKt.to(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId), adSession))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(com.google.protobuf.ByteString opportunityId) {
        java.util.Set<java.lang.String> value;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.String>> mutableStateFlow = this.finishedSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.plus(value, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId))));
        removeSession(opportunityId);
    }

    private final void removeSession(com.google.protobuf.ByteString opportunityId) {
        java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession> value;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.minus(value, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.iab.omid.library.unity3d.adsession.AdSession getSession(com.google.protobuf.ByteString opportunityId) {
        return this.activeSessions.getValue().get(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId));
    }

    private final com.unity3d.ads.core.data.model.OMData buildOmData() {
        return new com.unity3d.ads.core.data.model.OMData(this.omidManager.getVersion(), com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }
}
