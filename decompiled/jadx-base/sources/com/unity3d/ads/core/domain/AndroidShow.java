package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidShow.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "gameServerIdReader", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "context", "Landroid/content/Context;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "terminate", "", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidShow implements com.unity3d.ads.core.domain.Show {
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.configuration.GameServerIdReader gameServerIdReader;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidShow(com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.configuration.GameServerIdReader gameServerIdReader, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gameServerIdReader, "gameServerIdReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidShow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", i = {0, 0}, l = {23, 39}, m = "invokeSuspend", n = {"$this$flow", "opportunityId"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ android.content.Context $context;
        final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.AndroidShow androidShow, android.content.Context context, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$context = context;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1 anonymousClass1 = new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1(this.$adObject, this.this$0, this.$context, this.$showOptions, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object ad;
            final kotlinx.coroutines.flow.FlowCollector flowCollector;
            com.google.protobuf.ByteString byteString;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                if (!(!this.$adObject.getOpportunityId().isEmpty())) {
                    throw new java.lang.IllegalArgumentException("No opportunityId".toString());
                }
                com.google.protobuf.ByteString opportunityId = this.$adObject.getOpportunityId();
                this.L$0 = flowCollector2;
                this.L$1 = opportunityId;
                this.label = 1;
                ad = this.this$0.adRepository.getAd(opportunityId, this);
                if (ad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = flowCollector2;
                byteString = opportunityId;
            } else {
                if (i == 1) {
                    byteString = (com.google.protobuf.ByteString) this.L$1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector3;
                    ad = obj;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            com.unity3d.ads.core.data.model.AdObject adObject = (com.unity3d.ads.core.data.model.AdObject) ad;
            if (adObject != null) {
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, 14, null);
                com.unity3d.ads.adplayer.AdPlayer adPlayer = adObject.getAdPlayer();
                if (adPlayer == null) {
                    throw new java.lang.IllegalStateException("No adPlayer associated with ad");
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (kotlinx.coroutines.flow.FlowKt.transformWhile(kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.onStart(adPlayer.getOnShowEvent(), new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2(adObject, this.this$0, this.$context, this.$showOptions, null)), new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass3(this.this$0, byteString, null)), new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object objEmit = flowCollector.emit(showEvent, continuation);
                        return objEmit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return emit((com.unity3d.ads.core.data.model.ShowEvent) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("No ad associated with opportunityId");
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $ad;
            final /* synthetic */ android.content.Context $context;
            final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.AndroidShow androidShow, android.content.Context context, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$context = context;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2(this.$ad, this.this$0, this.$context, this.$showOptions, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) throws org.json.JSONException {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.data.model.AdObject adObject = this.$ad;
                com.unity3d.ads.core.configuration.GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                java.lang.Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
                    if (!(obj2 instanceof java.lang.String)) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        obj2 = null;
                    }
                } else {
                    obj2 = null;
                }
                java.lang.Object obj3 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj3 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(key)");
                    gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                }
                adObject.setPlayerServerId((java.lang.String) obj2);
                com.unity3d.ads.adplayer.AdPlayer adPlayer = this.$ad.getAdPlayer();
                android.content.Context context = this.$context;
                org.json.JSONObject data = this.$showOptions.getData();
                adPlayer.show(new com.unity3d.ads.adplayer.AndroidShowOptions(context, data != null ? com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(data) : null));
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
            int label;
            final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(com.unity3d.ads.core.domain.AndroidShow androidShow, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass3(this.this$0, this.$opportunityId, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.adRepository.removeAd(this.$opportunityId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidShow.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, com.unity3d.ads.core.data.model.ShowEvent, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
            private /* synthetic */ java.lang.Object L$0;
            /* synthetic */ java.lang.Object L$1;
            int label;

            AnonymousClass4(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass4> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass4 anonymousClass4 = new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass4(continuation);
                anonymousClass4.L$0 = flowCollector;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.unity3d.ads.core.data.model.ShowEvent showEvent;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                    com.unity3d.ads.core.data.model.ShowEvent showEvent2 = (com.unity3d.ads.core.data.model.ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (flowCollector.emit(showEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (com.unity3d.ads.core.data.model.ShowEvent) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) || (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) ? false : true);
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.Show
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> invoke(android.content.Context context, com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.UnityAdsShowOptions showOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1(adObject, this, context, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public java.lang.Object terminate(com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object objDestroy = adPlayer.destroy(continuation);
        return objDestroy == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDestroy : kotlin.Unit.INSTANCE;
    }
}
