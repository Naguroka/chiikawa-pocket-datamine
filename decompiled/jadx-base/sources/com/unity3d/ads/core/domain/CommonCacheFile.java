package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonCacheFile.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "headers", "Lorg/json/JSONArray;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonCacheFile implements com.unity3d.ads.core.domain.CacheFile {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCacheFile$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonCacheFile.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", i = {0, 0, 0, 0}, l = {28}, m = "invoke", n = {"this", "url", "adObject", "startTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonCacheFile.this.invoke(null, null, null, 0, this);
        }
    }

    public CommonCacheFile(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    public java.lang.Object invoke(java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1 anonymousClass1;
        long jM2767markNowz9LOYto;
        java.lang.String str2;
        java.lang.Object file;
        com.unity3d.ads.core.domain.CommonCacheFile commonCacheFile;
        com.unity3d.ads.core.data.model.AdObject adObject2;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1(continuation);
        }
        com.unity3d.ads.core.domain.CommonCacheFile.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object obj = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
            java.lang.String iSO8859String = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(adObject.getOpportunityId());
            anonymousClass2.L$0 = this;
            str2 = str;
            anonymousClass2.L$1 = str2;
            anonymousClass2.L$2 = adObject;
            anonymousClass2.J$0 = jM2767markNowz9LOYto;
            anonymousClass2.label = 1;
            file = cacheRepository.getFile(str, iSO8859String, jSONArray, i, anonymousClass2);
            if (file == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonCacheFile = this;
            adObject2 = adObject;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = anonymousClass2.J$0;
            com.unity3d.ads.core.data.model.AdObject adObject3 = (com.unity3d.ads.core.data.model.AdObject) anonymousClass2.L$2;
            java.lang.String str3 = (java.lang.String) anonymousClass2.L$1;
            commonCacheFile = (com.unity3d.ads.core.domain.CommonCacheFile) anonymousClass2.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            jM2767markNowz9LOYto = j;
            adObject2 = adObject3;
            file = obj;
            str2 = str3;
        }
        com.unity3d.ads.core.data.model.CacheResult cacheResult = (com.unity3d.ads.core.data.model.CacheResult) file;
        if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
            com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult;
            commonCacheFile.sendDiagnosticEvent.invoke("native_load_cache_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cache_source", success.getSource().toString()), kotlin.TuplesKt.to("url", str2), kotlin.TuplesKt.to("protocol", success.getCachedFile().getProtocol())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (success.getCachedFile().getContentLength() / ((long) 1024))))), adObject2);
        } else if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Failure) {
            com.unity3d.ads.core.data.model.CacheResult.Failure failure = (com.unity3d.ads.core.data.model.CacheResult.Failure) cacheResult;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonCacheFile.sendDiagnosticEvent, "native_load_cache_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cache_source", failure.getSource().toString()), kotlin.TuplesKt.to("url", str2), kotlin.TuplesKt.to("reason", failure.getError().toString())), null, adObject2, 8, null);
        }
        return cacheResult;
    }
}
