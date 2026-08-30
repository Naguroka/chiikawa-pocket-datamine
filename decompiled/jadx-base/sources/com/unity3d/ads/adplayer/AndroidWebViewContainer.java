package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AndroidWebViewContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0011\u0010#\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0011\u0010*\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;)V", "_lastInputEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/view/InputEvent;", "get_lastInputEvent", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getWebView", "()Landroid/webkit/WebView;", "addJavascriptInterface", "", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "script", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "url", "onRenderProcessGone", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidWebViewContainer implements com.unity3d.ads.adplayer.WebViewContainer {
    private final kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> _lastInputEvent;
    private final kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> lastInputEvent;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final android.webkit.WebView webView;
    private final com.unity3d.ads.adplayer.AndroidWebViewClient webViewClient;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {}, l = {91}, m = "addJavascriptInterface", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {0}, l = {109}, m = "destroy", n = {"this"}, s = {"L$0"})
    static final class C16101 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C16101(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {}, l = {81}, m = "evaluateJavascript", n = {}, s = {})
    static final class C16121 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C16121(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.evaluateJavascript(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {0, 1, 2, 2}, l = {67, 71, 73}, m = "loadUrl", n = {"this", "this", "this", "loadResult"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class C16141 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C16141(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {0}, l = {55}, m = "onRenderProcessGone", n = {"this"}, s = {"L$0"})
    static final class C16161 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C16161(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(android.webkit.WebView webView, com.unity3d.ads.adplayer.AndroidWebViewClient webViewClient, com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, kotlinx.coroutines.CoroutineDispatcher mainDispatcher, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, kotlinx.coroutines.CoroutineScope adPlayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        kotlinx.coroutines.CoroutineScope coroutineScopePlus = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, mainDispatcher), new kotlinx.coroutines.CoroutineName("AndroidWebViewContainer"));
        this.scope = coroutineScopePlus;
        kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this._lastInputEvent = MutableStateFlow;
        this.lastInputEvent = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> stateFlowIsRenderProcessGone = webViewClient.isRenderProcessGone();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = stateFlowIsRenderProcessGone.collect(new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, new com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2(null)), kotlinx.coroutines.CoroutineScopeKt.plus(coroutineScopePlus, defaultDispatcher));
        webView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.unity3d.ads.adplayer.AndroidWebViewContainer._init_$lambda$1(this.f$0, view, motionEvent);
            }
        });
    }

    public final android.webkit.WebView getWebView() {
        return this.webView;
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> get_lastInputEvent() {
        return this._lastInputEvent;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> getLastInputEvent() {
        return this.lastInputEvent;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.adplayer.AndroidWebViewContainer.this.onRenderProcessGone(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(com.unity3d.ads.adplayer.AndroidWebViewContainer this$0, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        this$0._lastInputEvent.setValue(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object onRenderProcessGone(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161 c16161;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161) {
            c16161 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161) continuation;
            if ((c16161.label & Integer.MIN_VALUE) != 0) {
                c16161.label -= Integer.MIN_VALUE;
            } else {
                c16161 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161(continuation);
            }
        } else {
            c16161 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16161(continuation);
        }
        java.lang.Object obj = c16161.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16161.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c16161.L$0 = this;
            c16161.label = 1;
            if (destroy(c16161) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidWebViewContainer = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) c16161.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(kotlin.collections.CollectionsKt.listOf(new com.unity3d.ads.adplayer.model.WebViewClientError("Render process gone", com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16152 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16152(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16152> continuation) {
            super(2, continuation);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new C16152(this.$url, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.C16152) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public java.lang.Object loadUrl(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws com.unity3d.ads.adplayer.LoadWebViewError {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141 c16141;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> list;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer2;
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> list2;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141) {
            c16141 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141) continuation;
            if ((c16141.label & Integer.MIN_VALUE) != 0) {
                c16141.label -= Integer.MIN_VALUE;
            } else {
                c16141 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141(continuation);
            }
        } else {
            c16141 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16141(continuation);
        }
        java.lang.Object objAwait = c16141.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16141.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objAwait);
            kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
            com.unity3d.ads.adplayer.AndroidWebViewContainer.C16152 c16152 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16152(str, null);
            c16141.L$0 = this;
            c16141.label = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, c16152, c16141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidWebViewContainer = this;
        } else {
            if (i == 1) {
                androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) c16141.L$0;
                kotlin.ResultKt.throwOnFailure(objAwait);
            } else if (i == 2) {
                androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) c16141.L$0;
                kotlin.ResultKt.throwOnFailure(objAwait);
                list = (java.util.List) objAwait;
                if (!list.isEmpty()) {
                    c16141.L$0 = androidWebViewContainer;
                    c16141.L$1 = list;
                    c16141.label = 3;
                    if (androidWebViewContainer.destroy(c16141) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidWebViewContainer2 = androidWebViewContainer;
                    list2 = list;
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) c16141.L$1;
                androidWebViewContainer2 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) c16141.L$0;
                kotlin.ResultKt.throwOnFailure(objAwait);
            }
            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
            throw new com.unity3d.ads.adplayer.LoadWebViewError(list2);
        }
        kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> onLoadFinished = androidWebViewContainer.webViewClient.getOnLoadFinished();
        c16141.L$0 = androidWebViewContainer;
        c16141.label = 2;
        objAwait = onLoadFinished.await(c16141);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (java.util.List) objAwait;
        if (!list.isEmpty()) {
            c16141.L$0 = androidWebViewContainer;
            c16141.L$1 = list;
            c16141.label = 3;
            if (androidWebViewContainer.destroy(c16141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidWebViewContainer2 = androidWebViewContainer;
            list2 = list;
            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
            throw new com.unity3d.ads.adplayer.LoadWebViewError(list2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public java.lang.Object evaluateJavascript(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121 c16121;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121) {
            c16121 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121) continuation;
            if ((c16121.label & Integer.MIN_VALUE) != 0) {
                c16121.label -= Integer.MIN_VALUE;
            } else {
                c16121 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121(continuation);
            }
        } else {
            c16121 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16121(continuation);
        }
        java.lang.Object obj = c16121.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16121.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                com.unity3d.ads.adplayer.AndroidWebViewContainer.C16132 c16132 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16132(str, null);
                c16121.label = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, c16132, c16121) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16132 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $script;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16132(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16132> continuation) {
            super(2, continuation);
            this.$script = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new C16132(this.$script, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.C16132) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge webViewBridge, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1 anonymousClass1;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                com.unity3d.ads.adplayer.AndroidWebViewContainer.C16092 c16092 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16092(str, webViewBridge, null);
                anonymousClass1.label = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, c16092, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16092 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $name;
        final /* synthetic */ com.unity3d.ads.adplayer.WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16092(java.lang.String str, com.unity3d.ads.adplayer.WebViewBridge webViewBridge, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16092> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new C16092(this.$name, this.$webViewBridgeInterface, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.C16092) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            final com.unity3d.ads.adplayer.WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new com.unity3d.ads.adplayer.model.WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @android.webkit.JavascriptInterface
                public void handleInvocation(java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                    webViewBridge.handleInvocation(message);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @android.webkit.JavascriptInterface
                public void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
                    webViewBridge.handleCallback(callbackId, callbackStatus, rawParameters);
                }
            }, this.$name);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16112 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        C16112(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.C16112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new C16112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.C16112) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.ViewParent parent = com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView());
            }
            com.unity3d.ads.adplayer.AndroidWebViewContainer.this.getWebView().destroy();
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101 c16101;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101) {
            c16101 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101) continuation;
            if ((c16101.label & Integer.MIN_VALUE) != 0) {
                c16101.label -= Integer.MIN_VALUE;
            } else {
                c16101 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101(continuation);
            }
        } else {
            c16101 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16101(continuation);
        }
        java.lang.Object obj = c16101.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16101.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.coroutines.CoroutineContext coroutineContextPlus = this.scope.getCoroutineContext().plus(kotlinx.coroutines.NonCancellable.INSTANCE);
            com.unity3d.ads.adplayer.AndroidWebViewContainer.C16112 c16112 = new com.unity3d.ads.adplayer.AndroidWebViewContainer.C16112(null);
            c16101.L$0 = this;
            c16101.label = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineContextPlus, c16112, c16101) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidWebViewContainer = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) c16101.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(androidWebViewContainer.scope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
