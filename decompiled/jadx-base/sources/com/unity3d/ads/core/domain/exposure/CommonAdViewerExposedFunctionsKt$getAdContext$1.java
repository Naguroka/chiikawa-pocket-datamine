package com.unity3d.ads.core.domain.exposure;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ java.lang.String $adData;
    final /* synthetic */ java.lang.String $adDataRefreshToken;
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ java.lang.String $impressionConfig;
    final /* synthetic */ com.unity3d.ads.core.domain.om.IsOMActivated $isOMActivated;

    CommonAdViewerExposedFunctionsKt$getAdContext$1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext, com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) throws org.json.JSONException {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        java.lang.String str;
        com.unity3d.ads.core.data.model.AdObject adObject;
        com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label -= Integer.MIN_VALUE;
            } else {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, continuation);
            }
        } else {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, continuation);
        }
        java.lang.Object objInvoke = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            java.lang.String str2 = this.$adData;
            java.lang.String str3 = this.$impressionConfig;
            java.lang.String str4 = this.$adDataRefreshToken;
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
            com.unity3d.ads.core.data.model.AdObject adObject2 = this.$adObject;
            com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated2 = this.$isOMActivated;
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("adData", str2);
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
            mapCreateMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = mapCreateMapBuilder;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = mapCreateMapBuilder;
            str = com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = mapCreateMapBuilder;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
            objInvoke = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            adObject = adObject2;
            isOMActivated = isOMActivated2;
            map = mapCreateMapBuilder;
            map2 = map;
            map3 = map2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
            str = (java.lang.String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
            map2 = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
            map3 = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
            isOMActivated = (com.unity3d.ads.core.domain.om.IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
            adObject = (com.unity3d.ads.core.data.model.AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
            kotlin.ResultKt.throwOnFailure(objInvoke);
        }
        map.put(str, objInvoke);
        map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        org.json.JSONObject data = adObject.getLoadOptions().getData();
        if (data != null && data.length() != 0) {
            java.util.Iterator<java.lang.String> itKeys = data.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "loadOptions.keys()");
            kotlin.sequences.Sequence<java.lang.String> sequenceAsSequence = kotlin.sequences.SequencesKt.asSequence(itKeys);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str5 : sequenceAsSequence) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str5, "adMarkup") && !kotlin.jvm.internal.Intrinsics.areEqual(str5, "objectId")) {
                    jSONObject = jSONObject.put(str5, data.get(str5));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "acc.put(key, loadOptions[key])");
                }
            }
            map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
        }
        if (isOMActivated.invoke()) {
            map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMID, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), kotlin.TuplesKt.to(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
        }
        map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, adObject.isHeaderBidding());
        return kotlin.collections.MapsKt.build(map3);
    }
}
