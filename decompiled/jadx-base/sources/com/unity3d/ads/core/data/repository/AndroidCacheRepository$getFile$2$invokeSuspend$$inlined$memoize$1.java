package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/unity3d/services/core/extensions/CoroutineExtensionsKt$memoize$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1", f = "AndroidCacheRepository.kt", i = {0, 0}, l = {52, 45}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
public final class AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult>, java.lang.Object> {
    final /* synthetic */ java.lang.String $filename$inlined;
    final /* synthetic */ java.lang.Object $key;
    final /* synthetic */ int $priority$inlined;
    final /* synthetic */ java.lang.String $url$inlined;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1(java.lang.Object obj, kotlin.coroutines.Continuation continuation, com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, java.lang.String str, java.lang.String str2, int i) {
        super(2, continuation);
        this.$key = obj;
        this.this$0 = androidCacheRepository;
        this.$filename$inlined = str;
        this.$url$inlined = str2;
        this.$priority$inlined = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1 androidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1(this.$key, continuation, this.this$0, this.$filename$inlined, this.$url$inlined, this.$priority$inlined);
        androidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1.L$0 = obj;
        return androidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.sync.Mutex mutex2 = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getMutex();
            java.lang.Object obj3 = this.$key;
            this.L$0 = coroutineScope;
            this.L$1 = mutex2;
            this.L$2 = obj3;
            this.label = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            obj2 = obj3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            obj2 = this.L$2;
            mutex = (kotlinx.coroutines.sync.Mutex) this.L$1;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getDeferreds();
            kotlinx.coroutines.Deferred<?> deferredAsync$default = deferreds.get(obj2);
            if (deferredAsync$default == null) {
                deferredAsync$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1.AnonymousClass1(null, this.this$0, this.$filename$inlined, this.$url$inlined, this.$priority$inlined), 3, null);
                deferreds.put(obj2, deferredAsync$default);
            }
            kotlinx.coroutines.Deferred<?> deferred = deferredAsync$default;
            mutex.unlock(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            java.lang.Object objAwait = deferred.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/unity3d/services/core/extensions/CoroutineExtensionsKt$memoize$2$deferred$1$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1$1", f = "AndroidCacheRepository.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult>, java.lang.Object> {
        final /* synthetic */ java.lang.String $filename$inlined;
        final /* synthetic */ int $priority$inlined;
        final /* synthetic */ java.lang.String $url$inlined;
        int label;
        final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.Continuation continuation, com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, java.lang.String str, java.lang.String str2, int i) {
            super(2, continuation);
            this.this$0 = androidCacheRepository;
            this.$filename$inlined = str;
            this.$url$inlined = str2;
            this.$priority$inlined = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1.AnonymousClass1(continuation, this.this$0, this.$filename$inlined, this.$url$inlined, this.$priority$inlined);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$invokeSuspend$$inlined$memoize$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.data.datasource.CacheDataSource cacheDataSource = this.this$0.remoteCacheDataSource;
                java.io.File file = this.this$0.cacheDir;
                java.lang.String str = this.$filename$inlined;
                java.lang.String str2 = this.$url$inlined;
                java.lang.Integer numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$priority$inlined);
                this.label = 1;
                obj = cacheDataSource.getFile(file, str, str2, numBoxInt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
