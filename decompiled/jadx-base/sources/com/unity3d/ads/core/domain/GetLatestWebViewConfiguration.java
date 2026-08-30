package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J;\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "webviewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "invoke", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetLatestWebViewConfiguration {
    private final com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetLatestWebViewConfiguration.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", i = {0, 0, 0, 0, 1}, l = {16, 31}, m = "invoke", n = {"this", "receivedEntryPoint", "receivedVersion", "receivedAdditionalFiles", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.this.invoke(null, null, null, this);
        }
    }

    public GetLatestWebViewConfiguration(com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration, java.lang.String str, java.lang.Integer num, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(java.lang.String str, java.lang.Integer num, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.WebViewConfiguration> continuation) {
        com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration;
        if (continuation instanceof com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                list = (java.util.List) anonymousClass1.L$3;
                num = (java.lang.Integer) anonymousClass1.L$2;
                str = (java.lang.String) anonymousClass1.L$1;
                getLatestWebViewConfiguration = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return webViewConfiguration;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        anonymousClass1.L$2 = num;
        anonymousClass1.L$3 = list;
        anonymousClass1.label = 1;
        obj = webviewConfigurationDataSource.get(anonymousClass1);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        getLatestWebViewConfiguration = this;
        com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) obj;
        int version = webViewConfigurationStore.getVersion();
        java.lang.String entryPoint = webViewConfigurationStore.getEntryPoint();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entryPoint, "it.entryPoint");
        java.util.List<java.lang.String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(additionalFilesList, "it.additionalFilesList");
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration2 = new com.unity3d.ads.core.data.model.WebViewConfiguration(version, entryPoint, additionalFilesList);
        if (str == null && num == null && list == null) {
            return webViewConfiguration2;
        }
        int iIntValue = num != null ? num.intValue() : webViewConfiguration2.getVersion();
        if (str == null) {
            str = webViewConfiguration2.getEntryPoint();
        }
        if (list == null) {
            list = webViewConfiguration2.getAdditionalFiles();
        }
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration3 = new com.unity3d.ads.core.data.model.WebViewConfiguration(iIntValue, str, list);
        if (kotlin.jvm.internal.Intrinsics.areEqual(webViewConfiguration3, webViewConfiguration2)) {
            return webViewConfiguration3;
        }
        com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource2 = getLatestWebViewConfiguration.webviewConfigurationDataSource;
        com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.Builder builderNewBuilder = com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
        builderNewBuilder.setVersion(webViewConfiguration3.getVersion());
        builderNewBuilder.setEntryPoint(webViewConfiguration3.getEntryPoint());
        builderNewBuilder.addAllAdditionalFiles(webViewConfiguration3.getAdditionalFiles());
        com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStoreBuild = builderNewBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webViewConfigurationStoreBuild, "newBuilder().apply {\n   …                }.build()");
        anonymousClass1.L$0 = webViewConfiguration3;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        if (webviewConfigurationDataSource2.set(webViewConfigurationStoreBuild, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        webViewConfiguration = webViewConfiguration3;
        return webViewConfiguration;
    }
}
