package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: CommonWebViewBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J \u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0010H\u0016J;\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J5\u0010,\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J\u0019\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u00101R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;)V", "_onInvocation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "callbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CompletableDeferred;", "", "", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "execute", "", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "(Lcom/unity3d/ads/adplayer/HandlerType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCallback", "callbackId", "callbackStatus", "rawParameters", "handleInvocation", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "request", "className", "method", "params", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "respond", "status", "sendEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonWebViewBridge implements com.unity3d.ads.adplayer.WebViewBridge {
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.Invocation> _onInvocation;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> callbacks;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.adplayer.WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", i = {0}, l = {61, 63}, m = "request", n = {"callback"}, s = {"L$0"})
    static final class C16181 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C16181(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge.C16181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.adplayer.WebViewContainer webViewContainer, kotlinx.coroutines.CoroutineScope adPlayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.webViewContainer = webViewContainer;
        kotlinx.coroutines.CoroutineScope coroutineScopePlus = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, dispatcher), new kotlinx.coroutines.CoroutineName("CommonWebViewBridge"));
        this.scope = coroutineScopePlus;
        this.callbacks = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.SetsKt.emptySet());
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.Invocation> mutableSharedFlowMutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._onInvocation = mutableSharedFlowMutableSharedFlow$default;
        this.onInvocation = kotlinx.coroutines.flow.FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScopePlus, null, null, new com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.CommonWebViewBridge.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.adplayer.CommonWebViewBridge.this.webViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.CommonWebViewBridge.this, "webviewbridge", this) == coroutine_suspended) {
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
    public final java.lang.Object execute(com.unity3d.ads.adplayer.HandlerType handlerType, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", continuation);
        return objEvaluateJavascript == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEvaluateJavascript : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public java.lang.Object sendEvent(com.unity3d.ads.adplayer.model.WebViewEvent webViewEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (java.lang.Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        com.unity3d.ads.adplayer.HandlerType handlerType = com.unity3d.ads.adplayer.HandlerType.EVENT;
        java.lang.String string = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "arguments.toString()");
        java.lang.Object objExecute = execute(handlerType, string, continuation);
        return objExecute == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public java.lang.Object request(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object[]> continuation) {
        com.unity3d.ads.adplayer.CommonWebViewBridge.C16181 c16181;
        java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>> value;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        if (continuation instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C16181) {
            c16181 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C16181) continuation;
            if ((c16181.label & Integer.MIN_VALUE) != 0) {
                c16181.label -= Integer.MIN_VALUE;
            } else {
                c16181 = new com.unity3d.ads.adplayer.CommonWebViewBridge.C16181(continuation);
            }
        } else {
            c16181 = new com.unity3d.ads.adplayer.CommonWebViewBridge.C16181(continuation);
        }
        java.lang.Object objAwait = c16181.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16181.label;
        if (i != 0) {
            if (i == 1) {
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) c16181.L$0;
                kotlin.ResultKt.throwOnFailure(objAwait);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objAwait);
            }
        }
        kotlin.ResultKt.throwOnFailure(objAwait);
        kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        java.lang.String strValueOf = java.lang.String.valueOf(completableDeferredCompletableDeferred$default.hashCode());
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> mutableStateFlow = this.callbacks;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.plus(value, kotlin.TuplesKt.to(strValueOf, completableDeferredCompletableDeferred$default))));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(strValueOf);
        for (java.lang.Object obj : objArr) {
            jSONArray.put(obj);
        }
        com.unity3d.ads.adplayer.HandlerType handlerType = com.unity3d.ads.adplayer.HandlerType.INVOCATION;
        java.lang.String string = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "arguments.toString()");
        c16181.L$0 = completableDeferredCompletableDeferred$default;
        c16181.label = 1;
        if (execute(handlerType, string, c16181) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        c16181.L$0 = null;
        c16181.label = 2;
        objAwait = completableDeferred.await(c16181);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters) {
        java.lang.Object next;
        java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        java.lang.Object[] typedArray = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(new org.json.JSONArray(rawParameters));
        java.util.Iterator<T> it = this.callbacks.getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) ((kotlin.Pair) next).component1(), callbackId));
        kotlin.Pair pair = (kotlin.Pair) next;
        if (pair == null) {
            return;
        }
        kotlinx.coroutines.CompletableDeferred completableDeferred = (kotlinx.coroutines.CompletableDeferred) pair.component2();
        if (kotlin.jvm.internal.Intrinsics.areEqual(callbackStatus, "success")) {
            completableDeferred.complete(typedArray);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(callbackStatus, "error")) {
            java.lang.Object obj = typedArray[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            completableDeferred.completeExceptionally(new java.lang.Exception((java.lang.String) obj));
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> mutableStateFlow = this.callbacks;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.minus(value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(java.lang.String message) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        org.json.JSONArray jSONArray = new org.json.JSONArray(message);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = jSONArray.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
            java.lang.Object obj2 = jSONArray2.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = jSONArray2.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj3;
            java.lang.Object obj4 = jSONArray2.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            org.json.JSONArray jSONArray3 = (org.json.JSONArray) obj4;
            java.lang.Object obj5 = jSONArray2.get(3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads WebView calling for: " + str + '.' + str2 + '(' + jSONArray3 + ')');
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.adplayer.CommonWebViewBridge.C16171(str + '.' + str2, jSONArray3, this, (java.lang.String) obj5, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonWebViewBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1", f = "CommonWebViewBridge.kt", i = {0, 1}, l = {103, 105, 106, 106, 112}, m = "invokeSuspend", n = {"invocation", "invocation"}, s = {"L$0", "L$0"})
    static final class C16171 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $callback;
        final /* synthetic */ java.lang.String $location;
        final /* synthetic */ org.json.JSONArray $parameters;
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        final /* synthetic */ com.unity3d.ads.adplayer.CommonWebViewBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16171(java.lang.String str, org.json.JSONArray jSONArray, com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge, java.lang.String str2, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge.C16171> continuation) {
            super(2, continuation);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.CommonWebViewBridge.C16171(this.$location, this.$parameters, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.CommonWebViewBridge.C16171) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String message;
            com.unity3d.ads.adplayer.Invocation invocation;
            com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge;
            java.lang.String str;
            java.lang.String str2;
            java.lang.Object[] objArr;
            java.lang.Object result;
            java.lang.Object[] objArr2;
            java.lang.Object[] objArr3;
            int i;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.adplayer.Invocation invocation2 = new com.unity3d.ads.adplayer.Invocation(this.$location, com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(this.$parameters));
                    this.L$0 = invocation2;
                    this.label = 1;
                    if (this.this$0._onInvocation.emit(invocation2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    invocation = invocation2;
                } else {
                    if (i2 == 1) {
                        invocation = (com.unity3d.ads.adplayer.Invocation) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else if (i2 == 2) {
                        invocation = (com.unity3d.ads.adplayer.Invocation) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        commonWebViewBridge = this.this$0;
                        str = this.$callback;
                        str2 = "OK";
                        objArr = new java.lang.Object[1];
                        this.L$0 = objArr;
                        this.L$1 = commonWebViewBridge;
                        this.L$2 = str;
                        this.L$3 = "OK";
                        this.L$4 = objArr;
                        this.I$0 = 0;
                        this.label = 3;
                        result = invocation.getResult(this);
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objArr2 = objArr;
                        objArr3 = objArr2;
                        obj = result;
                        i = 0;
                        objArr2[i] = obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (commonWebViewBridge.respond(str, str2, objArr3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == 3) {
                        i = this.I$0;
                        objArr2 = (java.lang.Object[]) this.L$4;
                        str2 = (java.lang.String) this.L$3;
                        str = (java.lang.String) this.L$2;
                        commonWebViewBridge = (com.unity3d.ads.adplayer.CommonWebViewBridge) this.L$1;
                        objArr3 = (java.lang.Object[]) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        objArr2[i] = obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (commonWebViewBridge.respond(str, str2, objArr3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 4 && i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.L$0 = invocation;
                this.label = 2;
                if (kotlinx.coroutines.TimeoutKt.withTimeout(5000L, new com.unity3d.ads.adplayer.CommonWebViewBridge.C16171.C02551(invocation, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                commonWebViewBridge = this.this$0;
                str = this.$callback;
                str2 = "OK";
                objArr = new java.lang.Object[1];
                this.L$0 = objArr;
                this.L$1 = commonWebViewBridge;
                this.L$2 = str;
                this.L$3 = "OK";
                this.L$4 = objArr;
                this.I$0 = 0;
                this.label = 3;
                result = invocation.getResult(this);
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objArr2 = objArr;
                objArr3 = objArr2;
                obj = result;
                i = 0;
                objArr2[i] = obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                if (commonWebViewBridge.respond(str, str2, objArr3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Exception e) {
                if (e instanceof kotlinx.coroutines.TimeoutCancellationException) {
                    message = "Invocation(" + this.$location + ") is not handled";
                } else {
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                }
                com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge2 = this.this$0;
                java.lang.String str3 = this.$callback;
                java.lang.Object[] objArr4 = {message};
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
                if (commonWebViewBridge2.respond(str3, "ERROR", objArr4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: CommonWebViewBridge.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1", f = "CommonWebViewBridge.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        static final class C02551 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.unity3d.ads.adplayer.Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02551(com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge.C16171.C02551> continuation) {
                super(2, continuation);
                this.$invocation = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.adplayer.CommonWebViewBridge.C16171.C02551(this.$invocation, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.adplayer.CommonWebViewBridge.C16171.C02551) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$invocation.isHandled().await(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object respond(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new org.json.JSONArray(objArr));
        java.lang.Object objExecute = execute(com.unity3d.ads.adplayer.HandlerType.CALLBACK, com.ironsource.y8.i.d + jSONArray + ']', continuation);
        return objExecute == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : kotlin.Unit.INSTANCE;
    }
}
