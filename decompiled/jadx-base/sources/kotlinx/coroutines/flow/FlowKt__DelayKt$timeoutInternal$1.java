package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downStream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
final class FlowKt__DelayKt$timeoutInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$timeoutInternal$1(long j, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j;
        this.$this_timeoutInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0085 -> B:15:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            if (r1 != r2) goto L20
            long r4 = r12.J$0
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r12.L$0
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.throwOnFailure(r13)
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r12
            goto L8c
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L28:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            long r4 = r12.$timeout
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.INSTANCE
            long r6 = r6.m2731getZEROUwyO8pc()
            int r4 = kotlin.time.Duration.m2627compareToLRDsOJo(r4, r6)
            if (r4 <= 0) goto L9d
            kotlinx.coroutines.flow.Flow<T> r4 = r12.$this_timeoutInternal
            r5 = 0
            r6 = 2
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.buffer$default(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r13 = kotlinx.coroutines.flow.FlowKt.produceIn(r4, r13)
            long r4 = r12.$timeout
            r6 = r1
            r1 = r13
            r13 = r12
        L52:
            kotlinx.coroutines.selects.SelectImplementation r7 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r8 = r13.get$context()
            r7.<init>(r8)
            r8 = r7
            kotlinx.coroutines.selects.SelectBuilder r8 = (kotlinx.coroutines.selects.SelectBuilder) r8
            kotlinx.coroutines.selects.SelectClause1 r9 = r1.getOnReceiveCatching()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r10.<init>(r6, r3)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r8.invoke(r9, r10)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r9.<init>(r4, r3)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            kotlinx.coroutines.selects.OnTimeoutKt.m2872onTimeout8Mi8wO0(r8, r4, r9)
            r13.L$0 = r6
            r13.L$1 = r1
            r13.J$0 = r4
            r13.label = r2
            java.lang.Object r7 = r7.doSelect(r13)
            if (r7 != r0) goto L85
            return r0
        L85:
            r11 = r0
            r0 = r13
            r13 = r7
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r11
        L8c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L97
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L97:
            r13 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r6 = r7
            goto L52
        L9d:
            kotlinx.coroutines.TimeoutCancellationException r13 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
