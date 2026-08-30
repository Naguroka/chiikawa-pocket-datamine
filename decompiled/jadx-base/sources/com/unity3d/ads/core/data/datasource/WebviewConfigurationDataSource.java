package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "", "webviewConfigurationStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "(Landroidx/datastore/core/DataStore;)V", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebviewConfigurationDataSource {
    private final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    public WebviewConfigurationDataSource(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "exception", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                java.lang.Throwable th = (java.lang.Throwable) this.L$1;
                if (th instanceof androidx.datastore.core.CorruptionException) {
                    com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(defaultInstance, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw th;
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

    public final java.lang.Object get(kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> continuation) {
        return kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.m2834catch(this.webviewConfigurationStore.getData(), new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.AnonymousClass2(null)), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16382 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16382(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.C16382> continuation) {
            super(2, continuation);
            this.$data = webViewConfigurationStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.C16382(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> continuation) {
            return ((com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.C16382) create(webViewConfigurationStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.$data;
        }
    }

    public final java.lang.Object set(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateData = this.webviewConfigurationStore.updateData(new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.C16382(webViewConfigurationStore, null), continuation);
        return objUpdateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : kotlin.Unit.INSTANCE;
    }
}
