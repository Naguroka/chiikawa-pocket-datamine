package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", com.ironsource.sdk.controller.f.b.COMMAND, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StartedWhileSubscribed implements kotlinx.coroutines.flow.SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    public StartedWhileSubscribed(long j, long j2) {
        this.stopTimeout = j;
        this.replayExpiration = j2;
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (!(j2 >= 0)) {
            throw new java.lang.IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {org.objectweb.asm.Opcodes.GETSTATIC, org.objectweb.asm.Opcodes.GETFIELD, org.objectweb.asm.Opcodes.INVOKEVIRTUAL, org.objectweb.asm.Opcodes.INVOKESPECIAL, org.objectweb.asm.Opcodes.INVOKEINTERFACE}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return invoke(flowCollector, num.intValue(), continuation);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1 anonymousClass1 = kotlinx.coroutines.flow.StartedWhileSubscribed.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.I$0 = i;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        /* JADX WARN: Code duplicated, block: B:28:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x009a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (kotlinx.coroutines.flow.StartedWhileSubscribed.this.replayExpiration > 0) {
                            this.L$0 = flowCollector;
                            this.label = 3;
                            if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.L$0 = flowCollector;
                            this.label = 4;
                            if (kotlinx.coroutines.DelayKt.delay(kotlinx.coroutines.flow.StartedWhileSubscribed.this.replayExpiration, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i == 3) {
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.L$0 = flowCollector;
                        this.label = 4;
                        if (kotlinx.coroutines.DelayKt.delay(kotlinx.coroutines.flow.StartedWhileSubscribed.this.replayExpiration, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 4) {
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this.L$0 = null;
                    this.label = 5;
                    if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                if (this.I$0 <= 0) {
                    this.L$0 = flowCollector;
                    this.label = 2;
                    if (kotlinx.coroutines.DelayKt.delay(kotlinx.coroutines.flow.StartedWhileSubscribed.this.stopTimeout, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (kotlinx.coroutines.flow.StartedWhileSubscribed.this.replayExpiration > 0) {
                        this.L$0 = flowCollector;
                        this.label = 3;
                        if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.L$0 = flowCollector;
                        this.label = 4;
                        if (kotlinx.coroutines.DelayKt.delay(kotlinx.coroutines.flow.StartedWhileSubscribed.this.replayExpiration, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = null;
                    this.label = 5;
                    if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 1;
                    if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.START, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> subscriptionCount) {
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.transformLatest(subscriptionCount, new kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1(null)), new kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2(null)));
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand sharingCommand, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2) create(sharingCommand, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((kotlinx.coroutines.flow.SharingCommand) this.L$0) != kotlinx.coroutines.flow.SharingCommand.START);
        }
    }

    public java.lang.String toString() {
        java.util.List listCreateListBuilder = kotlin.collections.CollectionsKt.createListBuilder(2);
        if (this.stopTimeout > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof kotlinx.coroutines.flow.StartedWhileSubscribed) {
            kotlinx.coroutines.flow.StartedWhileSubscribed startedWhileSubscribed = (kotlinx.coroutines.flow.StartedWhileSubscribed) other;
            if (this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.stopTimeout) * 31) + java.lang.Long.hashCode(this.replayExpiration);
    }
}
