package com.unity3d.services.core.extensions;

/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001e\b\u0004\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a.\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\"5\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"deferreds", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "memoize", "T", com.ironsource.y8.h.W, "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExtensionsKt {
    private static final java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = new java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof kotlinx.coroutines.Deferred) {
                return containsValue((kotlinx.coroutines.Deferred<?>) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(kotlinx.coroutines.Deferred<?> deferred) {
            return super.containsValue((java.lang.Object) deferred);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ java.util.Set<java.lang.Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ java.util.Collection<kotlinx.coroutines.Deferred<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set<java.lang.Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            if (obj != null && (obj2 instanceof kotlinx.coroutines.Deferred)) {
                return remove(obj, (kotlinx.coroutines.Deferred<?>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(java.lang.Object obj, kotlinx.coroutines.Deferred<?> deferred) {
            return super.remove(obj, (java.lang.Object) deferred);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Collection<kotlinx.coroutines.Deferred<?>> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>> eldest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eldest, "eldest");
            return size() > 100;
        }
    };
    private static final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    public static final <R> java.lang.Object runSuspendCatching(kotlin.jvm.functions.Function0<? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(block.invoke());
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public static final java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final kotlinx.coroutines.sync.Mutex getMutex() {
        return mutex;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", i = {0, 0}, l = {52, 45}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> $action;
        final /* synthetic */ java.lang.Object $key;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = obj;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2 anonymousClass2 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2(this.$key, this.$action, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
            return ((com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope;
            kotlinx.coroutines.sync.Mutex mutex;
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1;
            java.lang.Object obj2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        function1 = (kotlin.jvm.functions.Function1) this.L$3;
                        obj2 = this.L$2;
                        mutex = (kotlinx.coroutines.sync.Mutex) this.L$1;
                        coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                mutex = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getMutex();
                java.lang.Object obj3 = this.$key;
                function1 = this.$action;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = function1;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj3;
                java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getDeferreds();
                kotlinx.coroutines.Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                kotlinx.coroutines.Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = deferred.await(this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.sync.Mutex mutex = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getMutex();
            java.lang.Object obj2 = this.$key;
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1 = this.$action;
            com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2<T> anonymousClass2 = this;
            kotlin.jvm.internal.InlineMarker.mark(0);
            mutex.lock(null, anonymousClass2);
            kotlin.jvm.internal.InlineMarker.mark(1);
            try {
                java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getDeferreds();
                kotlinx.coroutines.Deferred<?> deferredAsync$default = deferreds.get(obj2);
                if (deferredAsync$default == null) {
                    deferredAsync$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredAsync$default);
                }
                kotlinx.coroutines.Deferred<?> deferred = deferredAsync$default;
                mutex.unlock(null);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object objAwait = deferred.await(anonymousClass2);
                kotlin.jvm.internal.InlineMarker.mark(1);
                return objAwait;
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    public static final <T> java.lang.Object memoize(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2(obj, function1, null), continuation);
    }

    private static final <T> java.lang.Object memoize$$forInline(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2 anonymousClass2 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt.AnonymousClass2(obj, function1, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object objCoroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(anonymousClass2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return objCoroutineScope;
    }

    public static final <R> java.lang.Object runReturnSuspendCatching(kotlin.jvm.functions.Function0<? extends R> block) {
        java.lang.Object objM1301constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(block.invoke());
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
        }
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
        if (thM1304exceptionOrNullimpl == null) {
            return objM1301constructorimpl;
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
    }
}
