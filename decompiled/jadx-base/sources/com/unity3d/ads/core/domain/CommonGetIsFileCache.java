package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetIsFileCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetIsFileCache;", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetIsFileCache implements com.unity3d.ads.core.domain.GetIsFileCache {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetIsFileCache.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", i = {0, 0, 0}, l = {22}, m = "invoke", n = {"this", "url", "startTime"}, s = {"L$0", "L$1", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    public java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.CommonGetIsFileCache commonGetIsFileCache;
        long j;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1(continuation);
        }
        java.lang.Object objDoesFileExist = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objDoesFileExist);
            long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            java.lang.String strSubstringBefore$default = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfterLast$default(str, "/", (java.lang.String) null, 2, (java.lang.Object) null), ".", (java.lang.String) null, 2, (java.lang.Object) null);
            com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.J$0 = jM2767markNowz9LOYto;
            anonymousClass1.label = 1;
            objDoesFileExist = cacheRepository.doesFileExist(strSubstringBefore$default, anonymousClass1);
            if (objDoesFileExist == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonGetIsFileCache = this;
            j = jM2767markNowz9LOYto;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass1.J$0;
            str = (java.lang.String) anonymousClass1.L$1;
            commonGetIsFileCache = (com.unity3d.ads.core.domain.CommonGetIsFileCache) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(objDoesFileExist);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objDoesFileExist).booleanValue();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, zBooleanValue ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, null, 24, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(zBooleanValue);
    }
}
