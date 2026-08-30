package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {72, 74, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "startState"}, s = {"L$0", "L$0", "L$1"})
final class DataStoreImpl$data$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$data$1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$data$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.DataStoreImpl$data$1 dataStoreImpl$data$1 = new androidx.datastore.core.DataStoreImpl$data$1(this.this$0, continuation);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$data$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        ?? r1;
        androidx.datastore.core.State state;
        ?? r3;
        androidx.datastore.core.State state2;
        ?? r2;
        final kotlinx.coroutines.flow.Flow flowDropWhile;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            java.lang.Object state3 = this.this$0.readState(false, this);
            if (state3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            r1 = flowCollector;
            obj = state3;
        } else {
            if (i == 1) {
                kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                r1 = flowCollector2;
            } else if (i == 2) {
                state2 = (androidx.datastore.core.State) this.L$1;
                kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                r3 = flowCollector3;
                state = state2;
                r2 = r3;
                r2 = r1;
                flowDropWhile = kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.takeWhile(kotlinx.coroutines.flow.FlowKt.onStart(((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass1(this.this$0, null)), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2(null)), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3(state, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r2, kotlinx.coroutines.flow.FlowKt.onCompletion(new kotlinx.coroutines.flow.Flow<T>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector4, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object objCollect = flowDropWhile.collect(new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector4), continuation);
                        return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object L$0;
                            int label;
                            /* synthetic */ java.lang.Object result;

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) throws java.lang.Throwable {
                            androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            if (continuation instanceof androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                            }
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = anonymousClass1.label;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                androidx.datastore.core.State state = (androidx.datastore.core.State) obj;
                                if (state instanceof androidx.datastore.core.ReadException) {
                                    throw ((androidx.datastore.core.ReadException) state).getReadException();
                                }
                                if (!(state instanceof androidx.datastore.core.Data)) {
                                    if (state instanceof androidx.datastore.core.Final ? true : state instanceof androidx.datastore.core.UnInitialized) {
                                        throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                    }
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                java.lang.Object value = ((androidx.datastore.core.Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                }, new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass5(this.this$0, null)), this) == coroutine_suspended) {
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
        state = (androidx.datastore.core.State) obj;
        if (state instanceof androidx.datastore.core.Data) {
            this.L$0 = r1;
            this.L$1 = state;
            this.label = 2;
            if (r1.emit(((androidx.datastore.core.Data) state).getValue(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r3 = r1;
            state2 = state;
            state = state2;
            r2 = r3;
        } else {
            if (state instanceof androidx.datastore.core.UnInitialized) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
            }
            if (state instanceof androidx.datastore.core.ReadException) {
                throw ((androidx.datastore.core.ReadException) state).getReadException();
            }
            if (state instanceof androidx.datastore.core.Final) {
                r2 = r1;
                return kotlin.Unit.INSTANCE;
            }
        }
        r2 = r1;
        flowDropWhile = kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.takeWhile(kotlinx.coroutines.flow.FlowKt.onStart(((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass1(this.this$0, null)), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2(null)), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3(state, null));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r2, kotlinx.coroutines.flow.FlowKt.onCompletion(new kotlinx.coroutines.flow.Flow<T>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector4, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flowDropWhile.collect(new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector4), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) throws java.lang.Throwable {
                    androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        androidx.datastore.core.State state = (androidx.datastore.core.State) obj;
                        if (state instanceof androidx.datastore.core.ReadException) {
                            throw ((androidx.datastore.core.ReadException) state).getReadException();
                        }
                        if (!(state instanceof androidx.datastore.core.Data)) {
                            if (state instanceof androidx.datastore.core.Final ? true : state instanceof androidx.datastore.core.UnInitialized) {
                                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.Object value = ((androidx.datastore.core.Data) state).getValue();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
        }, new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass5(this.this$0, null)), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.datastore.core.State<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.datastore.core.State<T>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.incrementCollector(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.State<T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.core.State<T> state, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass2) create(state, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(((androidx.datastore.core.State) this.L$0) instanceof androidx.datastore.core.Final));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.State<T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.core.State<T> $startState;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.datastore.core.State<T> state, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3 anonymousClass3 = new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3(this.$startState, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.core.State<T> state, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass3) create(state, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.core.State state = (androidx.datastore.core.State) this.L$0;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((state instanceof androidx.datastore.core.Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass5> continuation) {
            super(3, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass5(this.this$0, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.decrementCollector(this) == coroutine_suspended) {
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
