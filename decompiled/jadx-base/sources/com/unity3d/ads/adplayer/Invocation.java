package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: Invocation.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0013\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J1\u0010\u0015\u001a\u00020\t2\u001e\b\u0002\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/adplayer/Invocation;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "", "parameters", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "_isHandled", "Lkotlinx/coroutines/CompletableDeferred;", "", "completableDeferred", "isHandled", "Lkotlinx/coroutines/Deferred;", "()Lkotlinx/coroutines/Deferred;", "getLocation", "()Ljava/lang/String;", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handle", "handler", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Invocation {
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> _isHandled;
    private final kotlinx.coroutines.CompletableDeferred<java.lang.Object> completableDeferred;
    private final java.lang.String location;
    private final java.lang.Object[] parameters;

    public Invocation(java.lang.String location, java.lang.Object[] parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.completableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    public final java.lang.String getLocation() {
        return this.location;
    }

    public final java.lang.Object[] getParameters() {
        return this.parameters;
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> isHandled() {
        return this._isHandled;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.Invocation.AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.Invocation.AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.Invocation.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object handle$default(com.unity3d.ads.adplayer.Invocation invocation, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new com.unity3d.ads.adplayer.Invocation.AnonymousClass2(null);
        }
        return invocation.handle(function1, continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> $handler;
        int label;
        final /* synthetic */ com.unity3d.ads.adplayer.Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1, com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.Invocation.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$handler = function1;
            this.this$0 = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.Invocation.AnonymousClass3(this.$handler, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.Invocation.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function1 = this.$handler;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.this$0.completableDeferred.complete(obj);
            } catch (java.lang.Throwable th) {
                this.this$0.completableDeferred.completeExceptionally(th);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public final java.lang.Object handle(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this._isHandled.complete(kotlin.Unit.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(continuation.getContext()), null, null, new com.unity3d.ads.adplayer.Invocation.AnonymousClass3(function1, this, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object getResult(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return this.completableDeferred.await(continuation);
    }
}
