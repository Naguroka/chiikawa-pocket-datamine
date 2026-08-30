package com.unity3d.ads.core.utils;

/* JADX INFO: compiled from: CommonCoroutineTimer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lkotlinx/coroutines/Job;", "delayStartMillis", "", "repeatMillis", "action", "Lkotlin/Function0;", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonCoroutineTimer implements com.unity3d.ads.core.utils.CoroutineTimer {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope scope;

    public CommonCoroutineTimer(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        kotlinx.coroutines.CompletableJob completableJobSupervisorJob$default = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.job = completableJobSupervisorJob$default;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(completableJobSupervisorJob$default));
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCoroutineTimer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", i = {0, 1}, l = {21, 24}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, long j2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.utils.CommonCoroutineTimer.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delayStartMillis = j;
            this.$action = function0;
            this.$repeatMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.utils.CommonCoroutineTimer.AnonymousClass1 anonymousClass1 = new com.unity3d.ads.core.utils.CommonCoroutineTimer.AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.utils.CommonCoroutineTimer.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(this.$delayStartMillis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            while (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                this.$action.invoke();
                this.L$0 = coroutineScope;
                this.label = 2;
                if (kotlinx.coroutines.DelayKt.delay(this.$repeatMillis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public kotlinx.coroutines.Job start(long delayStartMillis, long repeatMillis, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new com.unity3d.ads.core.utils.CommonCoroutineTimer.AnonymousClass1(delayStartMillis, action, repeatMillis, null), 2, null);
    }
}
