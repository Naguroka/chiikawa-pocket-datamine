package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(java.lang.Throwable.class, -1);

    static {
        kotlinx.coroutines.internal.WeakMapCtorCache weakMapCtorCache;
        try {
            weakMapCtorCache = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED() ? kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE : kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE;
        } catch (java.lang.Throwable unused) {
            weakMapCtorCache = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE;
        }
        ctorCache = weakMapCtorCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends java.lang.Throwable> E tryCopyException(E e) {
        java.lang.Object objM1301constructorimpl;
        if (e instanceof kotlinx.coroutines.CopyableThrowable) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(((kotlinx.coroutines.CopyableThrowable) e).createCopy());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
                objM1301constructorimpl = null;
            }
            return (E) objM1301constructorimpl;
        }
        return (E) ctorCache.get(e.getClass()).invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> cls) {
        java.lang.Object next;
        kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function1;
        kotlin.Pair pair;
        kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            next = null;
            if (i >= length) {
                break;
            }
            final java.lang.reflect.Constructor<?> constructor = constructors[i];
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Throwable invoke(java.lang.Throwable th) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                        java.lang.Object objNewInstance = constructor.newInstance(new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        java.lang.Throwable th2 = (java.lang.Throwable) objNewInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 0);
            } else if (length2 == 1) {
                java.lang.Class<?> cls2 = parameterTypes[0];
                if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.String.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                            java.lang.Object objNewInstance = constructor.newInstance(th.getMessage());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            java.lang.Throwable th2 = (java.lang.Throwable) objNewInstance;
                            th2.initCause(th);
                            return th2;
                        }
                    }), 2);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                            java.lang.Object objNewInstance = constructor.newInstance(th);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (java.lang.Throwable) objNewInstance;
                        }
                    }), 1);
                } else {
                    pair = kotlin.TuplesKt.to(null, -1);
                }
            } else if (length2 == 2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[1], java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                            java.lang.Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (java.lang.Throwable) objNewInstance;
                        }
                    }), 3);
                } else {
                    pair = kotlin.TuplesKt.to(null, -1);
                }
            } else {
                pair = kotlin.TuplesKt.to(null, -1);
            }
            arrayList.add(pair);
            i++;
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((java.lang.Number) ((kotlin.Pair) next).getSecond()).intValue();
                do {
                    java.lang.Object next2 = it.next();
                    int iIntValue2 = ((java.lang.Number) ((kotlin.Pair) next2).getSecond()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.Pair pair2 = (kotlin.Pair) next;
        return (pair2 == null || (function1 = (kotlin.jvm.functions.Function1) pair2.getFirst()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : function1;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(final kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> function1) {
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt.safeCtor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Throwable invoke(java.lang.Throwable th) {
                java.lang.Object objM1301constructorimpl;
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function2 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    java.lang.Throwable thInvoke = function2.invoke(th);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(th.getMessage(), thInvoke.getMessage()) && !kotlin.jvm.internal.Intrinsics.areEqual(thInvoke.getMessage(), th.toString())) {
                        thInvoke = null;
                    }
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(thInvoke);
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                return (java.lang.Throwable) (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl) ? null : objM1301constructorimpl);
            }
        };
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> cls, int i) {
        java.lang.Object objM1301constructorimpl;
        kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(java.lang.Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
            objM1301constructorimpl = numValueOf;
        }
        return ((java.lang.Number) objM1301constructorimpl).intValue();
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class cls, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCount(java.lang.Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
