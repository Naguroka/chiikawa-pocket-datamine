package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aG\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001as\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.INVOKESPECIAL}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {org.objectweb.asm.Opcodes.INVOKESPECIAL}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.INVOKESPECIAL}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C18531<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18531(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.INVOKESPECIAL}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C18543<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18543(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    static final class C18551<T, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18551(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    static final class C18561<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18561(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {org.objectweb.asm.Opcodes.GOTO}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    static final class C18581<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18581(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    static final class C18601<S, T extends S> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18601(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    static final class C18621<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18621(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.INVOKESPECIAL}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C18641<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18641(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super S> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601 c18601;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601) {
            c18601 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601) continuation;
            if ((c18601.label & Integer.MIN_VALUE) != 0) {
                c18601.label -= Integer.MIN_VALUE;
            } else {
                c18601 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601(continuation);
            }
        } else {
            c18601 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18601(continuation);
        }
        java.lang.Object obj = c18601.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18601.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> c18612 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18612<>(objectRef2, function3);
            c18601.L$0 = objectRef2;
            c18601.label = 1;
            if (flow.collect(c18612, c18601) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18601.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            throw new java.util.NoSuchElementException("Empty flow can't be reduced");
        }
        return objectRef.element;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C18612<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        C18612(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
            kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
            kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) {
                flowKt__ReduceKt$reduce$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) continuation;
                if ((flowKt__ReduceKt$reduce$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$reduce$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$reduce$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
            java.lang.Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__ReduceKt$reduce$2$emit$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef = this.$accumulator;
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> function3 = this.$operation;
                    java.lang.Object obj2 = this.$accumulator.element;
                    flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                    flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                    java.lang.Object objInvoke = function3.invoke((S) obj2, t, flowKt__ReduceKt$reduce$2$emit$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    objectRef2 = objectRef;
                }
                objectRef.element = t;
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj3 = obj;
            objectRef = objectRef2;
            t = (T) obj3;
            objectRef.element = t;
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551 c18551;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551) {
            c18551 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551) continuation;
            if ((c18551.label & Integer.MIN_VALUE) != 0) {
                c18551.label -= Integer.MIN_VALUE;
            } else {
                c18551 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551(continuation);
            }
        } else {
            c18551 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18551(continuation);
        }
        java.lang.Object obj = c18551.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18551.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = r;
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass2<>(objectRef2, function3);
            c18551.L$0 = objectRef2;
            c18551.label = 1;
            if (flow.collect(anonymousClass2, c18551) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18551.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) {
                flowKt__ReduceKt$fold$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) continuation;
                if ((flowKt__ReduceKt$fold$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$fold$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$fold$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            }
            java.lang.Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__ReduceKt$fold$2$emit$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.$accumulator;
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.$operation;
                T t2 = objectRef2.element;
                flowKt__ReduceKt$fold$2$emit$1.L$0 = objectRef2;
                flowKt__ReduceKt$fold$2$emit$1.label = 1;
                java.lang.Object objInvoke = function3.invoke((R) t2, t, flowKt__ReduceKt$fold$2$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = (T) objInvoke;
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            objectRef.element = (T) obj;
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final java.lang.Object emit$$forInline(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlin.jvm.internal.InlineMarker.mark(4);
            new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            kotlin.jvm.internal.InlineMarker.mark(5);
            kotlin.jvm.internal.Ref.ObjectRef<R> objectRef = this.$accumulator;
            objectRef.element = (T) this.$operation.invoke((R) objectRef.element, t, (kotlin.coroutines.Continuation<? super R>) continuation);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> java.lang.Object fold$$forInline(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = r;
        kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass2(objectRef, function3);
        kotlin.jvm.internal.InlineMarker.mark(0);
        flow.collect(anonymousClass2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621 c18621;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621) {
            c18621 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621) continuation;
            if ((c18621.label & Integer.MIN_VALUE) != 0) {
                c18621.label -= Integer.MIN_VALUE;
            } else {
                c18621 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621(continuation);
            }
        } else {
            c18621 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18621(continuation);
        }
        java.lang.Object obj = c18621.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18621.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    if (!(objectRef2.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL)) {
                        throw new java.lang.IllegalArgumentException("Flow has more than one element".toString());
                    }
                    objectRef2.element = t;
                    return kotlin.Unit.INSTANCE;
                }
            };
            c18621.L$0 = objectRef2;
            c18621.label = 1;
            if (flow.collect(flowCollector, c18621) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18621.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            throw new java.util.NoSuchElementException("Flow is empty");
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641 c18641;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641) {
            c18641 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641) continuation;
            if ((c18641.label & Integer.MIN_VALUE) != 0) {
                c18641.label -= Integer.MIN_VALUE;
            } else {
                c18641 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641(continuation);
            }
        } else {
            c18641 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18641(continuation);
        }
        java.lang.Object obj = c18641.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18641.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    boolean z;
                    if (objectRef2.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        objectRef2.element = t;
                        z = true;
                    } else {
                        objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                        z = false;
                    }
                    if (!z) {
                        throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            };
            try {
                c18641.L$0 = objectRef2;
                c18641.L$1 = flowCollector2;
                c18641.label = 1;
                if (flow.collect(flowCollector2, c18641) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowCollector2;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) c18641.L$1;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18641.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            return null;
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1 anonymousClass1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    objectRef2.element = t;
                    throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                }
            };
            try {
                anonymousClass1.L$0 = objectRef2;
                anonymousClass1.L$1 = flowCollector2;
                anonymousClass1.label = 1;
                if (flow.collect(flowCollector2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowCollector2;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) anonymousClass1.L$1;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            throw new java.util.NoSuchElementException("Expected at least one element");
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3 anonymousClass3;
        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3) {
            anonymousClass3 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.AnonymousClass3(continuation);
        }
        java.lang.Object obj = anonymousClass3.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass3.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                anonymousClass3.L$0 = function2;
                anonymousClass3.L$1 = objectRef2;
                anonymousClass3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                anonymousClass3.label = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, anonymousClass3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function3 = function2;
                objectRef = objectRef2;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                function3 = function2;
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass3.L$2;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) anonymousClass3.L$1;
            function3 = (kotlin.jvm.functions.Function2) anonymousClass3.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            throw new java.util.NoSuchElementException("Expected at least one element matching the predicate " + function3);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531 c18531;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531) {
            c18531 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531) continuation;
            if ((c18531.label & Integer.MIN_VALUE) != 0) {
                c18531.label -= Integer.MIN_VALUE;
            } else {
                c18531 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531(continuation);
            }
        } else {
            c18531 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18531(continuation);
        }
        java.lang.Object obj = c18531.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18531.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    objectRef2.element = t;
                    throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                }
            };
            try {
                c18531.L$0 = objectRef2;
                c18531.L$1 = flowCollector2;
                c18531.label = 1;
                if (flow.collect(flowCollector2, c18531) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowCollector2;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c18531.L$1;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18531.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543 c18543;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543) {
            c18543 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543) continuation;
            if ((c18543.label & Integer.MIN_VALUE) != 0) {
                c18543.label -= Integer.MIN_VALUE;
            } else {
                c18543 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543(continuation);
            }
        } else {
            c18543 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18543(continuation);
        }
        java.lang.Object obj = c18543.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18543.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                c18543.L$0 = objectRef2;
                c18543.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                c18543.label = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, c18543) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c18543.L$1;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18543.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561 c18561;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561) {
            c18561 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561) continuation;
            if ((c18561.label & Integer.MIN_VALUE) != 0) {
                c18561.label -= Integer.MIN_VALUE;
            } else {
                c18561 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561(continuation);
            }
        } else {
            c18561 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18561(continuation);
        }
        java.lang.Object obj = c18561.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18561.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.last.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    objectRef2.element = t;
                    return kotlin.Unit.INSTANCE;
                }
            };
            c18561.L$0 = objectRef2;
            c18561.label = 1;
            if (flow.collect(flowCollector, c18561) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18561.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            throw new java.util.NoSuchElementException("Expected at least one element");
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581 c18581;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581) {
            c18581 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581) continuation;
            if ((c18581.label & Integer.MIN_VALUE) != 0) {
                c18581.label -= Integer.MIN_VALUE;
            } else {
                c18581 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581(continuation);
            }
        } else {
            c18581 = new kotlinx.coroutines.flow.FlowKt__ReduceKt.C18581(continuation);
        }
        java.lang.Object obj = c18581.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18581.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                    objectRef2.element = t;
                    return kotlin.Unit.INSTANCE;
                }
            };
            c18581.L$0 = objectRef2;
            c18581.label = 1;
            if (flow.collect(flowCollector, c18581) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c18581.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }
}
