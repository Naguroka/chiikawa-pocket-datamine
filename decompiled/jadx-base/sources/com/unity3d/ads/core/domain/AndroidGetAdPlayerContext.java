package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetAdPlayerContext {
    public static final java.lang.String KEY_GAME_ID = "gameId";
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", i = {0}, l = {15}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1(continuation);
        }
        java.lang.Object objStaticDeviceInfo = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidGetAdPlayerContext = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidGetAdPlayerContext = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
        }
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
        java.lang.String gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bundleId", staticDeviceInfo.getBundleId()), kotlin.TuplesKt.to("bundleVersion", staticDeviceInfo.getBundleVersion()), kotlin.TuplesKt.to("webviewHash", "unknown"), kotlin.TuplesKt.to("sdkVersion", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.unity3d.services.core.properties.SdkProperties.getVersionCode())), kotlin.TuplesKt.to("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName()), kotlin.TuplesKt.to("osVersion", staticDeviceInfo.getOsVersion()), kotlin.TuplesKt.to("systemLanguage", java.util.Locale.getDefault().toString()), kotlin.TuplesKt.to(com.ironsource.y8.i.l, staticDeviceInfo.getDeviceModel()), kotlin.TuplesKt.to("limitAdTracking", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(dynamicDeviceInfo.getLimitedTracking())), kotlin.TuplesKt.to("maxVolume", kotlin.coroutines.jvm.internal.Boxing.boxDouble(dynamicDeviceInfo.getAndroid().getMaxVolume())), kotlin.TuplesKt.to(KEY_GAME_ID, gameId));
    }
}
