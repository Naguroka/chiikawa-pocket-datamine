package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidRemoteCacheDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Lcom/unity3d/services/core/network/core/HttpClient;)V", "downloadFile", "Lcom/unity3d/services/core/network/model/HttpResponse;", "url", "", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "Ljava/io/File;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", com.ironsource.rc.c.b, "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupFile", "filename", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidRemoteCacheDataSource implements com.unity3d.ads.core.data.datasource.CacheDataSource {
    private final com.unity3d.services.core.network.core.HttpClient httpClient;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRemoteCacheDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", i = {0, 0, 0, 0}, l = {26}, m = "getFile", n = {com.ironsource.rc.c.b, "url", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, com.ironsource.y8.h.b}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.this.getFile(null, null, null, null, this);
        }
    }

    public AndroidRemoteCacheDataSource(com.unity3d.services.core.network.core.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public java.lang.Object getFile(java.io.File file, java.lang.String str, java.lang.String str2, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) throws java.io.IOException {
        com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1 anonymousClass1;
        java.lang.String str3;
        java.io.File file2;
        java.lang.String str4;
        java.lang.Integer num2 = num;
        if (continuation instanceof com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (str2 == null) {
                return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.MALFORMED_URL, com.unity3d.ads.core.data.model.CacheSource.REMOTE);
            }
            java.io.File file3 = setupFile(file, str);
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = str2;
            anonymousClass1.L$2 = num2;
            anonymousClass1.L$3 = file3;
            anonymousClass1.label = 1;
            java.lang.Object objDownloadFile = downloadFile(str2, file3, num2, anonymousClass1);
            if (objDownloadFile == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str2;
            file2 = file3;
            obj = objDownloadFile;
            str4 = str;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.io.File file4 = (java.io.File) anonymousClass1.L$3;
            num2 = (java.lang.Integer) anonymousClass1.L$2;
            java.lang.String str5 = (java.lang.String) anonymousClass1.L$1;
            java.lang.String str6 = (java.lang.String) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            file2 = file4;
            str4 = str6;
            str3 = str5;
        }
        com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) obj;
        com.unity3d.ads.core.data.model.CachedFile cachedFile = new com.unity3d.ads.core.data.model.CachedFile("", str3, str4, file2, kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBefore$default(str3, "?", (java.lang.String) null, 2, (java.lang.Object) null), ".", (java.lang.String) null, 2, (java.lang.Object) null), httpResponse.getContentSize(), httpResponse.getProtocol(), num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        if (com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(httpResponse)) {
            return new com.unity3d.ads.core.data.model.CacheResult.Success(cachedFile, com.unity3d.ads.core.data.model.CacheSource.REMOTE);
        }
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object downloadFile(java.lang.String str, java.io.File file, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return this.httpClient.execute(new com.unity3d.services.core.network.model.HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, file, num != null ? num.intValue() : Integer.MAX_VALUE, 32766, null), continuation);
    }

    private final java.io.File setupFile(java.io.File cachePath, java.lang.String filename) throws java.io.IOException {
        java.io.File file = new java.io.File(cachePath, filename);
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
            file.createNewFile();
        }
        return file;
    }
}
