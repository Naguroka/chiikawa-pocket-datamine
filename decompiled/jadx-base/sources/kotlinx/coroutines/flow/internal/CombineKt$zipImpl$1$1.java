package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlinx.coroutines.flow.Flow<? extends T2> flow, kotlinx.coroutines.flow.Flow<? extends T1> flow2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.$this_unsafeFlow = flowCollector;
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, continuation);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            if (r2 != 0) {
                if (r2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    r2 = receiveChannel;
                } catch (kotlinx.coroutines.flow.internal.AbortFlowException e) {
                    e = e;
                    kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, this.$this_unsafeFlow);
                    r2 = receiveChannel;
                }
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) r2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.channels.ReceiveChannel receiveChannelProduce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            final kotlinx.coroutines.CompletableJob completableJobJob$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannelProduce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            final kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
            ((kotlinx.coroutines.channels.SendChannel) receiveChannelProduce$default).invokeOnClose(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
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
                    if (completableJobJob$default.isActive()) {
                        completableJobJob$default.cancel((java.util.concurrent.CancellationException) new kotlinx.coroutines.flow.internal.AbortFlowException(flowCollector));
                    }
                }
            });
            try {
                kotlin.coroutines.CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                java.lang.Object objThreadContextElements = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(coroutineContext);
                this.L$0 = receiveChannelProduce$default;
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(coroutineScope.getCoroutineContext().plus(completableJobJob$default), kotlin.Unit.INSTANCE, null, new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2(this.$flow, coroutineContext, objThreadContextElements, receiveChannelProduce$default, this.$this_unsafeFlow, this.$transform, null), this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = receiveChannelProduce$default;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) r2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return kotlin.Unit.INSTANCE;
            } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                e = e2;
                receiveChannel = receiveChannelProduce$default;
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, this.$this_unsafeFlow);
                r2 = receiveChannel;
            } catch (java.lang.Throwable th) {
                th = th;
                r2 = receiveChannelProduce$default;
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) r2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                throw th;
            }
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, this.$this_unsafeFlow);
            r2 = receiveChannel;
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) r2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $cnt;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
        final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$flow = flow;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = flowCollector;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ java.lang.Object $cnt;
            final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
            final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
                this.$scopeContext = coroutineContext;
                this.$cnt = obj;
                this.$second = receiveChannel;
                this.$this_unsafeFlow = flowCollector;
                this.$transform = function3;
            }

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, org.objectweb.asm.Opcodes.IINC, org.objectweb.asm.Opcodes.IINC}, m = "invokeSuspend", n = {}, s = {})
            static final class C02721 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                final /* synthetic */ T1 $value;
                java.lang.Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C02721(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, T1 t1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02721> continuation) {
                    super(2, continuation);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform = function3;
                    this.$value = t1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02721(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02721) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0076 A[RETURN] */
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
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
                    java.lang.Object objMo2809receiveCatchingJP2dKIU;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        objMo2809receiveCatchingJP2dKIU = this.$second.mo2809receiveCatchingJP2dKIU(this);
                        if (objMo2809receiveCatchingJP2dKIU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i == 1) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            objMo2809receiveCatchingJP2dKIU = ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
                        } else if (i == 2) {
                            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            flowCollector = flowCollector2;
                            this.L$0 = null;
                            this.label = 3;
                            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = this.$this_unsafeFlow;
                    if (objMo2809receiveCatchingJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                        java.lang.Throwable thM2819exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m2819exceptionOrNullimpl(objMo2809receiveCatchingJP2dKIU);
                        if (thM2819exceptionOrNullimpl == null) {
                            throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowCollector3);
                        }
                        throw thM2819exceptionOrNullimpl;
                    }
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.$transform;
                    T1 t1 = this.$value;
                    if (objMo2809receiveCatchingJP2dKIU == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        objMo2809receiveCatchingJP2dKIU = null;
                    }
                    this.L$0 = flowCollector3;
                    this.label = 2;
                    obj = function3.invoke(t1, objMo2809receiveCatchingJP2dKIU, this);
                    flowCollector = flowCollector3;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (flowCollector.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T1 t1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (continuation instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    if ((combineKt$zipImpl$1$1$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label -= Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                }
                java.lang.Object obj = combineKt$zipImpl$1$1$2$1$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.$scopeContext;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    java.lang.Object obj2 = this.$cnt;
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02721 c02721 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02721(this.$second, this.$this_unsafeFlow, this.$transform, t1, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(coroutineContext, unit, obj2, c02721, combineKt$zipImpl$1$1$2$1$emit$1) == coroutine_suspended) {
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<T1> flow = this.$flow;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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
