package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"count", "", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$1, reason: invalid class name */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {17}, m = "count", n = {androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$3, reason: invalid class name */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {29}, m = "count", n = {androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT}, s = {"L$0"})
    static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.count(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1 anonymousClass1;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CountKt.count.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    intRef2.element++;
                    int i2 = intRef2.element;
                    return kotlin.Unit.INSTANCE;
                }
            };
            anonymousClass1.L$0 = intRef2;
            anonymousClass1.label = 1;
            if (flow.collect(flowCollector, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (kotlin.jvm.internal.Ref.IntRef) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3 anonymousClass3;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3) {
            anonymousClass3 = (kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass3(continuation);
        }
        java.lang.Object obj = anonymousClass3.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass3.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> anonymousClass4 = new kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass4<>(function2, intRef2);
            anonymousClass3.L$0 = intRef2;
            anonymousClass3.label = 1;
            if (flow.collect(anonymousClass4, anonymousClass3) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (kotlin.jvm.internal.Ref.IntRef) anonymousClass3.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$4, reason: invalid class name */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $i;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.jvm.internal.Ref.IntRef intRef) {
            this.$predicate = function2;
            this.$i = intRef;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
            kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass4<T> anonymousClass4;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) {
                flowKt__CountKt$count$4$emit$1 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) continuation;
                if ((flowKt__CountKt$count$4$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__CountKt$count$4$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__CountKt$count$4$emit$1 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1(this, continuation);
                }
            } else {
                flowKt__CountKt$count$4$emit$1 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1(this, continuation);
            }
            java.lang.Object objInvoke = flowKt__CountKt$count$4$emit$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__CountKt$count$4$emit$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.$predicate;
                flowKt__CountKt$count$4$emit$1.L$0 = this;
                flowKt__CountKt$count$4$emit$1.label = 1;
                objInvoke = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass4 = this;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass4 = (kotlinx.coroutines.flow.FlowKt__CountKt.AnonymousClass4) flowKt__CountKt$count$4$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            if (((java.lang.Boolean) objInvoke).booleanValue()) {
                anonymousClass4.$i.element++;
                int i2 = anonymousClass4.$i.element;
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
