package com.unity3d.ads.core.domain.attribution;

/* JADX INFO: compiled from: AndroidAttribution.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", "context", "Landroid/content/Context;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "measurementManager", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager$delegate", "Lkotlin/Lazy;", "getUri", "Landroid/net/Uri;", "baseUrl", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "isAvailable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerClick", "url", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerView", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidAttribution {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: measurementManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy measurementManager;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidAttribution(final android.content.Context context, com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.adservices.measurement.MeasurementManager>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$measurementManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.adservices.measurement.MeasurementManager invoke() {
                return this.this$0.getMeasurementManager(context);
            }
        });
    }

    private final android.adservices.measurement.MeasurementManager getMeasurementManager() {
        return (android.adservices.measurement.MeasurementManager) this.measurementManager.getValue();
    }

    public final java.lang.Object isAvailable(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        kotlin.Unit unit;
        if (com.unity3d.services.core.device.Device.getApiLevel() < 33) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (android.os.ext.SdkExtensions.getExtensionVersion(1000000) < 4) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (!android.adservices.AdServicesState.isAdServicesStateEnabled()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        android.adservices.measurement.MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                @Override // android.os.OutcomeReceiver
                public /* bridge */ /* synthetic */ void onResult(java.lang.Integer num) {
                    onResult(num.intValue());
                }

                public void onResult(int status) {
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(java.lang.Boolean.valueOf(status == 1)));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(java.lang.Exception error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(false));
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final java.lang.Object registerView(java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        android.adservices.measurement.MeasurementManager measurementManager = getMeasurementManager();
        kotlin.Unit unit = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(java.lang.Object p0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(true));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(java.lang.Exception error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(false));
                }
            });
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final java.lang.Object registerClick(java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        com.unity3d.ads.adplayer.WebViewContainer webViewContainer;
        kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> lastInputEvent;
        android.view.InputEvent value;
        kotlin.Unit unit;
        if (getMeasurementManager() == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        com.unity3d.ads.adplayer.AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (value = lastInputEvent.getValue()) == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        android.adservices.measurement.MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), value, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(java.lang.Object p0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(true));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(java.lang.Exception error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(false));
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.measurement.MeasurementManager getMeasurementManager(android.content.Context context) {
        if (com.unity3d.services.core.device.Device.getApiLevel() >= 33 && android.os.ext.SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (android.adservices.measurement.MeasurementManager) context.getSystemService(android.adservices.measurement.MeasurementManager.class);
        }
        return null;
    }

    private final android.net.Uri getUri(java.lang.String baseUrl, com.unity3d.ads.core.data.model.AdObject adObject) {
        android.net.Uri uri = android.net.Uri.parse(baseUrl);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        android.net.Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }
}
