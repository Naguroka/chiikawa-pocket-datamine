package androidx.lifecycle;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001aB\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00070\u0006H\u0007\u001a8\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\tH\u0007\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\u0010\u0005\u001a \u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u00070\u0006H\u0007\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\tH\u0007¨\u0006\f"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "mapFunction", "Landroidx/arch/core/util/Function;", "switchMap", "switchMapFunction", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Transformations {
    public static final <X, Y> androidx.lifecycle.LiveData<Y> map(androidx.lifecycle.LiveData<X> liveData, final kotlin.jvm.functions.Function1<X, Y> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(transform.invoke(liveData.getValue()));
        }
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<X, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations.map.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x) {
                mediatorLiveData.setValue((Y) transform.invoke(x));
            }
        }));
        return mediatorLiveData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.lifecycle.LiveData map(androidx.lifecycle.LiveData liveData, final androidx.arch.core.util.Function mapFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<X, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations.map.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x) {
                mediatorLiveData.setValue((Y) mapFunction.apply(x));
            }
        }));
        return mediatorLiveData;
    }

    public static final <X, Y> androidx.lifecycle.LiveData<Y> switchMap(androidx.lifecycle.LiveData<X> liveData, final kotlin.jvm.functions.Function1<X, androidx.lifecycle.LiveData<Y>> transform) {
        androidx.lifecycle.LiveData<Y> liveDataInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        if (liveData.isInitialized() && (liveDataInvoke = transform.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) {
            mediatorLiveData.setValue(liveDataInvoke.getValue());
        }
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<X, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.LiveData] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x) {
                ?? r4 = (androidx.lifecycle.LiveData) transform.invoke(x);
                if (objectRef.element != r4) {
                    if (objectRef.element != 0) {
                        androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                        T t = objectRef.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                        mediatorLiveData2.removeSource((androidx.lifecycle.LiveData<S>) ((androidx.lifecycle.LiveData) t));
                    }
                    objectRef.element = r4;
                    if (objectRef.element != 0) {
                        androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                        T t2 = objectRef.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                        final androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData4 = mediatorLiveData;
                        mediatorLiveData3.addSource((androidx.lifecycle.LiveData<S>) ((androidx.lifecycle.LiveData) t2), new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<Y, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                                invoke2(obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Y y) {
                                mediatorLiveData4.setValue(y);
                            }
                        }));
                    }
                }
            }
        }));
        return mediatorLiveData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.lifecycle.LiveData switchMap(androidx.lifecycle.LiveData liveData, final androidx.arch.core.util.Function switchMapFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Observer<X>() { // from class: androidx.lifecycle.Transformations.switchMap.2
            private androidx.lifecycle.LiveData<Y> liveData;

            public final androidx.lifecycle.LiveData<Y> getLiveData() {
                return this.liveData;
            }

            public final void setLiveData(androidx.lifecycle.LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // androidx.lifecycle.Observer
            public void onChanged(X value) {
                androidx.lifecycle.LiveData<Y> liveData2 = (androidx.lifecycle.LiveData) switchMapFunction.apply(value);
                java.lang.Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(liveData2);
                    final androidx.lifecycle.MediatorLiveData<Y> mediatorLiveData4 = mediatorLiveData;
                    mediatorLiveData3.addSource(liveData2, new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<Y, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                            invoke2(obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Y y) {
                            mediatorLiveData4.setValue(y);
                        }
                    }));
                }
            }
        });
        return mediatorLiveData;
    }

    public static final <X> androidx.lifecycle.LiveData<X> distinctUntilChanged(androidx.lifecycle.LiveData<X> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        final androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            booleanRef.element = false;
        }
        mediatorLiveData.addSource(liveData, new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1<X, kotlin.Unit>() { // from class: androidx.lifecycle.Transformations.distinctUntilChanged.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x) {
                X value = mediatorLiveData.getValue();
                if (booleanRef.element || ((value == null && x != null) || !(value == null || kotlin.jvm.internal.Intrinsics.areEqual(value, x)))) {
                    booleanRef.element = false;
                    mediatorLiveData.setValue(x);
                }
            }
        }));
        return mediatorLiveData;
    }
}
