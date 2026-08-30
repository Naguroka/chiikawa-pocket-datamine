package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
final class InitializeStateReset$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset.Params $params;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2(com.unity3d.services.core.domain.task.InitializeStateReset.Params params, com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:22:0x005f, B:27:0x006d, B:29:0x007c, B:31:0x0082, B:33:0x0090, B:34:0x0092, B:36:0x0095, B:38:0x00a1, B:39:0x00ac, B:40:0x00af, B:41:0x00b8, B:42:0x00bf, B:43:0x00c0, B:44:0x00c7, B:25:0x0065, B:26:0x006c, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Throwable thM1304exceptionOrNullimpl;
        com.unity3d.services.core.domain.task.InitializeStateReset.Params params;
        com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset;
        com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset2;
        int i;
        java.lang.Class[] moduleConfigurationList;
        com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                params = this.$params;
                initializeStateReset = this.this$0;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: starting init");
                com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
                if (currentApp != null) {
                    currentApp.resetWebViewAppInitialization();
                }
                if ((currentApp != null ? currentApp.getWebView() : null) != null) {
                    long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                    com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                    this.L$0 = params;
                    this.L$1 = initializeStateReset;
                    this.label = 1;
                    java.lang.Object objWithTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    initializeStateReset2 = initializeStateReset;
                    obj = objWithTimeoutOrNull;
                }
                initializeStateReset.unregisterLifecycleCallbacks();
                com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
                com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(null);
                if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() != null) {
                    throw new java.lang.Exception("Cache directory is NULL");
                }
                if (com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory() != null) {
                    throw new java.lang.Exception("WebView cache directory is NULL");
                }
                com.unity3d.services.core.properties.SdkProperties.setInitialized(false);
                moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new java.lang.Class[0];
                }
                for (java.lang.Class cls : moduleConfigurationList) {
                    moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(moduleConfiguration.resetState(params.getConfig()));
                    }
                }
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(params.getConfig());
                if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                } else {
                    thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                    if (thM1304exceptionOrNullimpl != null) {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                    }
                }
                return kotlin.Result.m1300boximpl(objM1301constructorimpl);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initializeStateReset2 = (com.unity3d.services.core.domain.task.InitializeStateReset) this.L$1;
            params = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((kotlin.Unit) obj) != null) {
                initializeStateReset = initializeStateReset2;
                initializeStateReset.unregisterLifecycleCallbacks();
                com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
                com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(null);
                if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() != null) {
                    throw new java.lang.Exception("Cache directory is NULL");
                }
                if (com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory() != null) {
                    throw new java.lang.Exception("WebView cache directory is NULL");
                }
                com.unity3d.services.core.properties.SdkProperties.setInitialized(false);
                moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new java.lang.Class[0];
                }
                while (i < r2) {
                    moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(moduleConfiguration.resetState(params.getConfig()));
                    }
                }
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(params.getConfig());
                if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                } else {
                    thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                    if (thM1304exceptionOrNullimpl != null) {
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                    }
                }
                return kotlin.Result.m1300boximpl(objM1301constructorimpl);
            }
            throw new java.lang.Exception("Reset failed on opening ConditionVariable");
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }
}
