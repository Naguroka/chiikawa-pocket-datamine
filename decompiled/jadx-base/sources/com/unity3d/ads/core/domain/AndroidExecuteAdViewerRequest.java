package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidExecuteAdViewerRequest;", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/services/core/network/core/HttpClient;)V", "createRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "parameters", "", "", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;)Lcom/unity3d/services/core/network/model/HttpRequest;", "invoke", "Lcom/unity3d/services/core/network/model/HttpResponse;", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidExecuteAdViewerRequest implements com.unity3d.ads.core.domain.ExecuteAdViewerRequest {
    private final com.unity3d.services.core.network.core.HttpClient httpClient;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.services.core.network.model.RequestType.values().length];
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.HEAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.services.core.network.model.RequestType.POST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.services.core.network.core.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.httpClient = httpClient;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ java.lang.Object[] $parameters;
        final /* synthetic */ com.unity3d.services.core.network.model.RequestType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.services.core.network.model.RequestType requestType, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$type = requestType;
            this.$parameters = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.this.new AnonymousClass2(this.$type, this.$parameters, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.network.model.HttpRequest httpRequestCreateRequest = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.this.createRequest(this.$type, this.$parameters);
                this.label = 1;
                obj = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.this.httpClient.execute(httpRequestCreateRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public java.lang.Object invoke(com.unity3d.services.core.network.model.RequestType requestType, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.AnonymousClass2(requestType, objArr, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.unity3d.services.core.network.model.HttpRequest createRequest(com.unity3d.services.core.network.model.RequestType type, java.lang.Object[] parameters) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapEmptyMap;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapEmptyMap2;
        java.lang.String str = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(parameters, 1);
        java.lang.String str2 = str;
        if (!(!(str2 == null || str2.length() == 0))) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(parameters, 2);
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 3);
            java.lang.Integer num2 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 4);
            if (jSONArray == null || (mapEmptyMap = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
            }
            return new com.unity3d.services.core.network.model.HttpRequest(str, null, type, null, mapEmptyMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String str3 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(parameters, 2);
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(parameters, 3);
        java.lang.Integer num3 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 4);
        java.lang.Integer num4 = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(parameters, 5);
        if (jSONArray2 == null || (mapEmptyMap2 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            mapEmptyMap2 = kotlin.collections.MapsKt.emptyMap();
        }
        return new com.unity3d.services.core.network.model.HttpRequest(str, null, type, str3, mapEmptyMap2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }
}
