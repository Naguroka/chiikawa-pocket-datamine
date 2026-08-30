package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonClearCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonClearCache;", "Lcom/unity3d/ads/core/domain/ClearCache;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonClearCache implements com.unity3d.ads.core.domain.ClearCache {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonClearCache$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonClearCache.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonClearCache", f = "CommonClearCache.kt", i = {0, 0, 1, 1, 1}, l = {18, 19}, m = "invoke", n = {"this", "startTime", "this", "startTime", "currentSize"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonClearCache.this.invoke(this);
        }
    }

    public CommonClearCache(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.ClearCache
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.CommonClearCache commonClearCache;
        long j;
        com.unity3d.ads.core.domain.CommonClearCache commonClearCache2;
        long j2;
        long j3;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.CommonClearCache.AnonymousClass1(continuation);
        }
        java.lang.Object cacheSize = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(cacheSize);
            long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = jM2767markNowz9LOYto;
            anonymousClass1.label = 1;
            cacheSize = cacheRepository.getCacheSize(anonymousClass1);
            if (cacheSize == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonClearCache = this;
            j = jM2767markNowz9LOYto;
        } else {
            if (i == 1) {
                j = anonymousClass1.J$0;
                commonClearCache = (com.unity3d.ads.core.domain.CommonClearCache) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(cacheSize);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = anonymousClass1.J$1;
                j2 = anonymousClass1.J$0;
                commonClearCache2 = (com.unity3d.ads.core.domain.CommonClearCache) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(cacheSize);
            }
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonClearCache2.sendDiagnosticEvent, "native_initialize_clear_cache_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j2))), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (j3 / ((long) 1024))))), null, 20, null);
            return kotlin.Unit.INSTANCE;
        }
        long jLongValue = ((java.lang.Number) cacheSize).longValue();
        com.unity3d.ads.core.data.repository.CacheRepository cacheRepository2 = commonClearCache.cacheRepository;
        anonymousClass1.L$0 = commonClearCache;
        anonymousClass1.J$0 = j;
        anonymousClass1.J$1 = jLongValue;
        anonymousClass1.label = 2;
        if (cacheRepository2.clearCache(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        commonClearCache2 = commonClearCache;
        j2 = j;
        j3 = jLongValue;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonClearCache2.sendDiagnosticEvent, "native_initialize_clear_cache_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j2))), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (j3 / ((long) 1024))))), null, 20, null);
        return kotlin.Unit.INSTANCE;
    }
}
