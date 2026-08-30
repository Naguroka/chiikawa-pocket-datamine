package androidx.datastore.core;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\n\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\u0010\rJ\u0013\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015R,\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onComplete", "Lkotlin/Function1;", "", "", "onUndeliveredElement", "Lkotlin/Function2;", "consumeMessage", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "messageQueue", "Lkotlinx/coroutines/channels/Channel;", "remainingMessages", "Landroidx/datastore/core/AtomicInt;", "offer", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "(Ljava/lang/Object;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleActor<T> {
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> consumeMessage;
    private final kotlinx.coroutines.channels.Channel<T> messageQueue;
    private final androidx.datastore.core.AtomicInt remainingMessages;
    private final kotlinx.coroutines.CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onComplete, final kotlin.jvm.functions.Function2<? super T, ? super java.lang.Throwable, kotlin.Unit> onUndeliveredElement, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> consumeMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new androidx.datastore.core.AtomicInt(0);
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) scope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.datastore.core.SimpleActor.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    kotlin.Unit unit;
                    onComplete.invoke(th);
                    ((androidx.datastore.core.SimpleActor) this).messageQueue.close(th);
                    do {
                        java.lang.Object objM2820getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m2820getOrNullimpl(((androidx.datastore.core.SimpleActor) this).messageQueue.mo2810tryReceivePtdJZtk());
                        if (objM2820getOrNullimpl != null) {
                            onUndeliveredElement.invoke((T) objM2820getOrNullimpl, th);
                            unit = kotlin.Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    } while (unit != null);
                }
            });
        }
    }

    public final void offer(T msg) {
        java.lang.Object obj = this.messageQueue.mo2805trySendJP2dKIU(msg);
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            java.lang.Throwable thM2819exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m2819exceptionOrNullimpl(obj);
            if (thM2819exceptionOrNullimpl != null) {
                throw thM2819exceptionOrNullimpl;
            }
            throw new kotlinx.coroutines.channels.ClosedSendChannelException("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.ChannelResult.m2825isSuccessimpl(obj)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new androidx.datastore.core.SimpleActor.AnonymousClass2(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleActor.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.datastore.core.SimpleActor<T> simpleActor, kotlin.coroutines.Continuation<? super androidx.datastore.core.SimpleActor.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.SimpleActor.AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.datastore.core.SimpleActor.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x005f  */
        /* JADX WARN: Code duplicated, block: B:22:0x006f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0070  */
        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:24:0x0072). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L72
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.L$0
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.ResultKt.throwOnFailure(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L64
            L27:
                kotlin.ResultKt.throwOnFailure(r8)
                androidx.datastore.core.SimpleActor<T> r8 = r7.this$0
                androidx.datastore.core.AtomicInt r8 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L38
                r8 = r3
                goto L39
            L38:
                r8 = 0
            L39:
                if (r8 == 0) goto L81
                r8 = r7
            L3c:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                kotlinx.coroutines.CoroutineScope r1 = androidx.datastore.core.SimpleActor.access$getScope$p(r1)
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r1)
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r1)
                androidx.datastore.core.SimpleActor<T> r4 = r8.this$0
                kotlinx.coroutines.channels.Channel r4 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r4)
                r5 = r8
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.receive(r5)
                if (r4 != r0) goto L5f
                return r0
            L5f:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L64:
                r5 = 0
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                r8 = r0
                r0 = r1
            L72:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                androidx.datastore.core.AtomicInt r1 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3c
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L81:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
