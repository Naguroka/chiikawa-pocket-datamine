package com.unity3d.services.core.di;

/* JADX INFO: compiled from: UnityAdsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0*J\u0014\u0010(\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\u0014\u0010+\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010,\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001e\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0006\u0010.\u001a\u00020\u0011J\u001e\u0010/\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0006\u00100\u001a\u00020\u0011J\u0016\u00101\u001a\u0002022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\u0014\u00103\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001e\u00104\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\u0014\u00105\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\u0014\u00106\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020?H\u0002J\u000e\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u000208J\u0006\u0010D\u001a\u00020#J\u0006\u0010E\u001a\u00020\nJ\u001e\u0010F\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0016\u0010G\u001a\u00020H2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J\u001e\u0010I\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OJ\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011¨\u0006R"}, d2 = {"Lcom/unity3d/services/core/di/UnityAdsModule;", "", "()V", "androidContext", "Landroid/content/Context;", "asyncTokenStorage", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "tokenStorage", "Lcom/unity3d/services/ads/token/TokenStorage;", "sdkMetricsSender", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "auidDataStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "gatewayCacheDataStore", "gatewayDataStore", "context", "dispatcher", "getDefaultAdOperations", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultRequestPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestRetryPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestTimeoutPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getTokenCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "parentJob", "Lkotlinx/coroutines/Job;", "glInfoDataStore", "fetchGLInfo", "Landroidx/datastore/core/DataMigration;", "iapTransactionDataStore", "idfiDataStore", "initCoroutineScope", "ioDispatcher", "loadCoroutineScope", "mainDispatcher", "measurementService", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "nativeConfigurationDataStore", "omidCoroutineScope", "privacyDataStore", "privacyFsmDataStore", "privateJsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "provideByteStringDataSource", "provideByteStringDataStore", "dataStoreFile", "", "provideJsonStorage", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "publicApiJob", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "publicJsonStorage", "sdkDispatchers", "sdkMetrics", "showCoroutineScope", "topicsService", "Lcom/unity3d/services/ads/topics/TopicsService;", "transactionCoroutineScope", "universalRequestDataStore", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "volumeChangeMonitor", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "volumeChange", "Lcom/unity3d/services/core/device/VolumeChange;", "webViewConfigurationDataStore", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsModule {
    public final android.content.Context androidContext() {
        android.content.Context applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final kotlinx.coroutines.CoroutineDispatcher mainDispatcher() {
        return kotlinx.coroutines.Dispatchers.getMain();
    }

    public final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher() {
        return kotlinx.coroutines.Dispatchers.getDefault();
    }

    public final kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    public final com.unity3d.services.core.domain.ISDKDispatchers sdkDispatchers() {
        return new com.unity3d.services.core.domain.SDKDispatchers();
    }

    public final com.unity3d.services.core.request.metrics.SDKMetricsSender sdkMetrics() {
        com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetrics = com.unity3d.services.core.request.metrics.SDKMetrics.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final kotlinx.coroutines.CoroutineScope initCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.CoroutineScope loadCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.CoroutineScope showCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.CoroutineScope transactionCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.CoroutineScope getTokenCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.CoroutineScope omidCoroutineScope(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, kotlinx.coroutines.CoroutineExceptionHandler errorHandler, kotlinx.coroutines.Job parentJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new kotlinx.coroutines.CoroutineName(com.unity3d.services.core.di.ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    public final kotlinx.coroutines.Job publicApiJob(final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlinx.coroutines.CompletableJob completableJobJob$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        completableJobJob$default.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.services.core.di.UnityAdsModule$publicApiJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                diagnosticEventRepository.flush();
            }
        });
        return completableJobJob$default;
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(final android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher, androidx.datastore.core.DataMigration<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> fetchGLInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchGLInfo, "fetchGLInfo");
        return androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, new com.unity3d.ads.core.data.model.ByteStringSerializer(), null, kotlin.collections.CollectionsKt.listOf(fetchGLInfo), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.glInfoDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return com.unity3d.ads.core.extensions.ContextExtensionsKt.unityAdsDataStoreFile(context, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GL_INFO);
            }
        }, 2, null);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestDataStore(final android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, new com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer(), null, null, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.universalRequestDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return com.unity3d.ads.core.extensions.ContextExtensionsKt.unityAdsDataStoreFile(context, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(final android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, new com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer(), null, null, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.webViewConfigurationDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return com.unity3d.ads.core.extensions.ContextExtensionsKt.unityAdsDataStoreFile(context, com.unity3d.services.core.di.ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
            }
        }, 4, null);
    }

    public final com.unity3d.services.ads.token.AsyncTokenStorage asyncTokenStorage(com.unity3d.services.ads.token.TokenStorage tokenStorage, com.unity3d.services.core.request.metrics.SDKMetricsSender sdkMetricsSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        return new com.unity3d.services.ads.token.InMemoryAsyncTokenStorage(null, new android.os.Handler(android.os.Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final com.unity3d.services.core.device.VolumeChangeMonitor volumeChangeMonitor(com.unity3d.services.core.device.VolumeChange volumeChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        return new com.unity3d.services.core.device.VolumeChangeMonitor(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final com.unity3d.services.core.misc.JsonStorage publicJsonStorage() {
        return provideJsonStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC);
    }

    public final com.unity3d.services.core.misc.JsonStorage privateJsonStorage() {
        return provideJsonStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource gatewayCacheDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource idfiDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource auidDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyFsmDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource nativeConfigurationDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource glInfoDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionDataStore(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final com.unity3d.services.ads.measurements.MeasurementsService measurementService(android.content.Context context, com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return new com.unity3d.services.ads.measurements.MeasurementsService(context, dispatchers, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final com.unity3d.services.ads.topics.TopicsService topicsService(android.content.Context context, com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return new com.unity3d.services.ads.topics.TopicsService(context, dispatchers, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    private final com.unity3d.services.core.misc.JsonStorage provideJsonStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        if (!com.unity3d.services.core.device.StorageManager.init(com.unity3d.services.core.properties.ClientProperties.getApplicationContext())) {
            throw new java.lang.IllegalStateException("StorageManager failed to initialize".toString());
        }
        com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(storageType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storage, "getStorage(storageType)");
        return storage;
    }

    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource provideByteStringDataSource(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource(dataStore);
    }

    private final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(final android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher, final java.lang.String dataStoreFile) {
        return androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, new com.unity3d.ads.core.data.model.ByteStringSerializer(), null, null, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.provideByteStringDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return com.unity3d.ads.core.extensions.ContextExtensionsKt.unityAdsDataStoreFile(context, dataStoreFile);
            }
        }, 4, null);
    }

    public final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        gatewayprotocol.v1.NativeConfigurationKt.Dsl.Companion companion = gatewayprotocol.v1.NativeConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        gatewayprotocol.v1.DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = gatewayprotocol.v1.DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        gatewayprotocol.v1.DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        return dsl_create._build();
    }

    private final gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        gatewayprotocol.v1.AdOperationsConfigurationKt.Dsl.Companion companion = gatewayprotocol.v1.AdOperationsConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(com.unity3d.services.UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        gatewayprotocol.v1.RequestPolicyKt.Dsl.Companion companion = gatewayprotocol.v1.RequestPolicyKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        gatewayprotocol.v1.RequestRetryPolicyKt.Dsl.Companion companion = gatewayprotocol.v1.RequestRetryPolicyKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(com.unity3d.services.UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(1000);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl.Companion companion = gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(10000);
        dsl_create.setReadTimeoutMs(10000);
        dsl_create.setWriteTimeoutMs(10000);
        dsl_create.setOverallTimeoutMs(20000);
        return dsl_create._build();
    }
}
