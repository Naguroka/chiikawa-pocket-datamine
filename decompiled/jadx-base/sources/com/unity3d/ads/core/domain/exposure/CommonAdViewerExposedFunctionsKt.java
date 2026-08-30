package com.unity3d.ads.core.domain.exposure;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010\u0007\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001aH\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u000b\u0010\u001f\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010%\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010&\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010'\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010)\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010*\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000\u001a\u0013\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0000ø\u0001\u0000\u001a\u001b\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00103\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0000\u001a\u001b\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010;\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020?H\u0000ø\u0001\u0000\u001a\u000b\u0010@\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010D\u001a\u00020\u00012\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010I\u001a\u00020\u00012\u0006\u0010I\u001a\u00020JH\u0000ø\u0001\u0000\u001a\u0013\u0010K\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010L\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010M\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010N\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010O\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010P\u001a\u00020\u0001H\u0000ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"attributionRegisterClick", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "androidAttribution", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "attributionRegisterView", "clearStorage", "deleteStorage", "download", "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "getAdContext", "getAndroidAdPlayerContext", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "adData", "Lcom/unity3d/ads/core/data/model/AdData;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/ImpressionConfig;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "isOMActivated", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "getAdContext-yLuu4LI", "(Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/domain/om/IsOMActivated;Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/adplayer/ExposedFunction;", "getAllowedPii", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getConnectionType", "getDeviceMaxVolume", "getDeviceVolume", "getKeysStorage", "getPrivacy", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getPrivacyFsm", "getScreenHeight", "getScreenWidth", "getSessionToken", "getStorage", "hbTokenIncrementStarts", "hbTokenIncrementWins", "hbTokenReset", "incrementBannerImpressionCount", "isAttributionAvailable", "isFileCached", "getIfFileCache", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "markCampaignStateShown", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omGetData", "getOmData", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "omImpression", "omImpressionOccurred", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "omStartSession", "Lcom/unity3d/ads/core/domain/om/AndroidOmStartSession;", "openUrl", "handleOpenUrl", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "readStorage", "refreshAdData", "refresh", "Lcom/unity3d/ads/core/domain/Refresh;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendOperativeEvent", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "sendPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "setAllowedPii", "setPrivacy", "setPrivacyFsm", "setStorage", "updateTrackingToken", "writeStorage", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonAdViewerExposedFunctionsKt {
    /* JADX INFO: renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final com.unity3d.ads.adplayer.ExposedFunction m1115getAdContextyLuu4LI(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext getAndroidAdPlayerContext, java.lang.String adData, java.lang.String impressionConfig, java.lang.String adDataRefreshToken, com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isOMActivated, "isOMActivated");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getConnectionType(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getDeviceVolume(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getDeviceMaxVolume(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getScreenHeight(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getScreenWidth(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction openUrl(final com.unity3d.ads.core.domain.HandleOpenUrl handleOpenUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleOpenUrl, "handleOpenUrl");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object orNull = kotlin.collections.ArraysKt.getOrNull(objArr, 1);
                org.json.JSONObject jSONObject = orNull instanceof org.json.JSONObject ? (org.json.JSONObject) orNull : null;
                handleOpenUrl.invoke(str, jSONObject != null ? jSONObject.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null);
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16901 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.events.GetOperativeEventApi $getOperativeEventApi;

        C16901(com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = android.util.Base64.decode((java.lang.String) obj2, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                com.google.protobuf.ByteString byteString = com.google.protobuf.kotlin.ByteStringsKt.toByteString(bArrDecode);
                com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                if (getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction sendOperativeEvent(com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16901(getOperativeEventApi, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction writeStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.write((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction readStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.read((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction deleteStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.delete((java.lang.String) obj, (java.lang.String) obj2, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction clearStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.clear((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getKeysStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = objArr[2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                com.unity3d.services.core.api.Storage.getKeys((java.lang.String) obj, (java.lang.String) obj2, (java.lang.Boolean) obj3, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.get((java.lang.String) obj, (java.lang.String) obj2, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.set((java.lang.String) obj, (java.lang.String) obj2, objArr[2], new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16701 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository $sessionRepository;

        C16701(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, continuation);
            }
            java.lang.Object privacyFsm = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(privacyFsm);
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = 1;
                privacyFsm = sessionRepository.getPrivacyFsm(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1);
                if (privacyFsm == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(privacyFsm);
            }
            return com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) privacyFsm, false, 1, null);
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getPrivacyFsm(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16701(sessionRepository);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16941 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository $sessionRepository;

        C16941(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.$sessionRepository;
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = android.util.Base64.decode((java.lang.String) obj2, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                com.google.protobuf.ByteString byteString = com.google.protobuf.kotlin.ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacyFsm(byteString, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction setPrivacyFsm(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16941(sessionRepository);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16691 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository $sessionRepository;

        C16691(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, continuation);
            }
            java.lang.Object privacy = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(privacy);
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                privacy = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                if (privacy == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(privacy);
            }
            return com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) privacy, false, 1, null);
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getPrivacy(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16691(sessionRepository);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16931 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.repository.SessionRepository $sessionRepository;

        C16931(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.$sessionRepository;
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = android.util.Base64.decode((java.lang.String) obj2, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                com.google.protobuf.ByteString byteString = com.google.protobuf.kotlin.ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacy(byteString, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction setPrivacy(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16931(sessionRepository);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getAllowedPii(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.String strEncodeToString = android.util.Base64.encodeToString(deviceInfoRepository.getAllowedPii().getValue().toByteArray(), 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setAllowedPii(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii value;
                final gatewayprotocol.v1.AllowedPiiKt.Dsl dsl_create;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion companion = gatewayprotocol.v1.AllowedPiiKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    new kotlin.jvm.internal.MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                        public java.lang.Object get() {
                            return java.lang.Boolean.valueOf(((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).getIdfa());
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                        public void set(java.lang.Object obj2) {
                            ((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).setIdfa(((java.lang.Boolean) obj2).booleanValue());
                        }
                    }.set(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(jSONObject.optBoolean("idfa")));
                    new kotlin.jvm.internal.MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                        public java.lang.Object get() {
                            return java.lang.Boolean.valueOf(((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).getIdfv());
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                        public void set(java.lang.Object obj2) {
                            ((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).setIdfv(((java.lang.Boolean) obj2).booleanValue());
                        }
                    }.set(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(jSONObject.optBoolean("idfv")));
                } while (!allowedPii.compareAndSet(value, dsl_create._build()));
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getSessionToken(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction markCampaignStateShown(final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16881 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.Refresh $refresh;

        C16881(com.unity3d.ads.core.domain.Refresh refresh, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
            com.google.protobuf.ByteString refreshTokenByteString;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, continuation);
            }
            java.lang.Object objInvoke = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                if (objArr.length == 0) {
                    refreshTokenByteString = com.google.protobuf.ByteString.EMPTY;
                } else {
                    java.lang.Object obj = objArr[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    java.lang.String refreshToken = ((org.json.JSONObject) obj).optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refreshToken, "refreshToken");
                    refreshTokenByteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(refreshToken, false, 1, null);
                }
                com.unity3d.ads.core.domain.Refresh refresh = this.$refresh;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refreshTokenByteString, "refreshTokenByteString");
                com.google.protobuf.ByteString opportunityId = this.$adObject.getOpportunityId();
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                objInvoke = refresh.invoke(refreshTokenByteString, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) objInvoke;
            if (adDataRefreshResponse.hasError()) {
                throw new java.lang.IllegalArgumentException("Refresh failed");
            }
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            com.google.protobuf.ByteString adData = adDataRefreshResponse.getAdData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "adRefreshResponse.adData");
            mapCreateMapBuilder.put("adData", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
            com.google.protobuf.ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "adRefreshResponse.adDataRefreshToken");
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
            com.google.protobuf.ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "adRefreshResponse.trackingToken");
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
            return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction refreshAdData(com.unity3d.ads.core.domain.Refresh refresh, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refresh, "refresh");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16881(refresh, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction updateTrackingToken(final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                java.lang.String token = ((org.json.JSONObject) obj).optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                java.lang.String str = token;
                if (!(str == null || str.length() == 0)) {
                    com.unity3d.ads.core.data.model.AdObject adObject2 = adObject;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "token");
                    adObject2.setTrackingToken(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16911 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.domain.SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        C16911(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, continuation);
            }
            java.lang.Object objInvoke = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String privacyUpdateContentBase64 = jSONObject.optString("content");
                int iOptInt = jSONObject.optInt("version");
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateContentBase64, "privacyUpdateContentBase64");
                com.google.protobuf.ByteString byteStringFromBase64$default = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(privacyUpdateContentBase64, false, 1, null);
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                objInvoke = sendPrivacyUpdateRequest.invoke(iOptInt, byteStringFromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) objInvoke;
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("version", kotlin.coroutines.jvm.internal.Boxing.boxInt(privacyUpdateResponse.getVersion()));
            com.google.protobuf.ByteString content = privacyUpdateResponse.getContent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "response.content");
            mapCreateMapBuilder.put("content", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
            return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction sendPrivacyUpdateRequest(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16911(sendPrivacyUpdateRequest);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction sendDiagnosticEvent(final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.String string;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    mapCreateMapBuilder.put(next, jSONObject.getString(next));
                }
                java.util.Map mapBuild = kotlin.collections.MapsKt.build(mapCreateMapBuilder);
                java.lang.Object orNull = kotlin.collections.ArraysKt.getOrNull(objArr, 2);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (orNull == null || (string = orNull.toString()) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxDouble(java.lang.Double.parseDouble(string)), mapBuild, null, adObject, 8, null);
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction incrementBannerImpressionCount(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                sessionRepository.incrementBannerImpressionCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16631 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.CacheFile $cacheFile;

        C16631(com.unity3d.ads.core.domain.CacheFile cacheFile, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws org.json.JSONException {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            java.lang.String str;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$download$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, continuation);
            }
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            java.lang.Object objInvoke = commonAdViewerExposedFunctionsKt$download$1$invoke$2.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$download$1$invoke$2.label;
            boolean z = false;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String url = jSONObject.getString("url");
                org.json.JSONArray jSONArray = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(objArr, 2);
                int iOptInt = jSONObject.optInt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                com.unity3d.ads.core.domain.CacheFile cacheFile = this.$cacheFile;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0 = url;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.label = 1;
                objInvoke = cacheFile.invoke(url, adObject, jSONArray, iOptInt, commonAdViewerExposedFunctionsKt$download$1$invoke$2);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = url;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            com.unity3d.ads.core.data.model.CacheResult cacheResult = (com.unity3d.ads.core.data.model.CacheResult) objInvoke;
            if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult;
                java.lang.String extension = success.getCachedFile().getExtension();
                if (extension != null) {
                    if (extension.length() == 0) {
                        z = true;
                    }
                }
                if (z) {
                    str = "unity-ads-cache://unity.ads.cache/" + success.getCachedFile().getName();
                } else {
                    str = "unity-ads-cache://unity.ads.cache/" + success.getCachedFile().getName() + '.' + success.getCachedFile().getExtension();
                }
            } else if (!(cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "when (result) {\n        …sult.Failure -> url\n    }");
            return str;
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction download(com.unity3d.ads.core.domain.CacheFile cacheFile, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16631(cacheFile, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction isFileCached(final com.unity3d.ads.core.domain.GetIsFileCache getIfFileCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getIfFileCache, "getIfFileCache");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return getIfFileCache.invoke((java.lang.String) obj, continuation);
            }
        };
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16851 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.om.AndroidOmStartSession $omStartSession;

        C16851(com.unity3d.ads.core.domain.om.AndroidOmStartSession androidOmStartSession, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$omStartSession = androidOmStartSession;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                com.unity3d.ads.core.domain.om.AndroidOmStartSession androidOmStartSession = this.$omStartSession;
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = 1;
                if (androidOmStartSession.invoke(adObject, (org.json.JSONObject) obj2, commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction omStartSession(com.unity3d.ads.core.domain.om.AndroidOmStartSession omStartSession, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omStartSession, "omStartSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16851(omStartSession, adObject);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16821 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.om.OmFinishSession $omFinishSession;

        C16821(com.unity3d.ads.core.domain.om.OmFinishSession omFinishSession, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.domain.om.OmFinishSession omFinishSession = this.$omFinishSession;
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = 1;
                if (omFinishSession.invoke(adObject, commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction omFinishSession(com.unity3d.ads.core.domain.om.OmFinishSession omFinishSession, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omFinishSession, "omFinishSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16821(omFinishSession, adObject);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16841 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.domain.om.OmImpressionOccurred $omImpressionOccurred;

        C16841(com.unity3d.ads.core.domain.om.OmImpressionOccurred omImpressionOccurred, com.unity3d.ads.core.data.model.AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, continuation);
            }
            java.lang.Object obj = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                com.unity3d.ads.core.domain.om.OmImpressionOccurred omImpressionOccurred = this.$omImpressionOccurred;
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = 1;
                if (omImpressionOccurred.invoke(adObject, zBooleanValue, commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final com.unity3d.ads.adplayer.ExposedFunction omImpression(com.unity3d.ads.core.domain.om.OmImpressionOccurred omImpressionOccurred, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omImpressionOccurred, "omImpressionOccurred");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16841(omImpressionOccurred, adObject);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C16831 implements com.unity3d.ads.adplayer.ExposedFunction {
        final /* synthetic */ com.unity3d.ads.core.domain.om.GetOmData $getOmData;

        C16831(com.unity3d.ads.core.domain.om.GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
            if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) continuation;
                if ((commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, continuation);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, continuation);
            }
            java.lang.Object objInvoke = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                com.unity3d.ads.core.domain.om.GetOmData getOmData = this.$getOmData;
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                objInvoke = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            com.unity3d.ads.core.data.model.OMData oMData = (com.unity3d.ads.core.data.model.OMData) objInvoke;
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("version", oMData.getVersion());
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
            return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
        }
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction omGetData(com.unity3d.ads.core.domain.om.GetOmData getOmData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOmData, "getOmData");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16831(getOmData);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction isAttributionAvailable(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return androidAttribution.isAvailable(continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction attributionRegisterView(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution2 = androidAttribution;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((java.lang.String) obj, adObject, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction attributionRegisterClick(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution2 = androidAttribution;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((java.lang.String) obj, adObject, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenIncrementWins(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                sessionRepository.incrementTokenWinsCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenIncrementStarts(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                sessionRepository.incrementTokenStartsCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenReset(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                sessionRepository.resetTokenCounters();
                return kotlin.Unit.INSTANCE;
            }
        };
    }
}
