package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J-\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0010J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ironsource/p3;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/r3$a;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/p3$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/adservices/measurement/MeasurementManager;", "measurementManager", "Lcom/ironsource/r3$a$a;", "Landroid/net/Uri;", "uri", "Landroid/view/MotionEvent;", "inputEvent", "", "(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/MotionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ironsource/r3;", "", "reason", "<init>", "()V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p3 {
    private static final java.lang.String b;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/ironsource/p3$a;", "", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "other", "", "equals", "", "hashCode", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/zg$e;", "b", "c", "d", "name", com.ironsource.y8.h.m, "demandSourceName", "params", "toString", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/ironsource/zg$e;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/ironsource/zg$e;", "e", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Lcom/ironsource/zg$e;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final com.ironsource.zg.e productType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.lang.String demandSourceName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final org.json.JSONObject params;

        public a(java.lang.String name, com.ironsource.zg.e productType, java.lang.String demandSourceName, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            this.name = name;
            this.productType = productType;
            this.demandSourceName = demandSourceName;
            this.params = params;
        }

        public static /* synthetic */ com.ironsource.p3.a a(com.ironsource.p3.a aVar, java.lang.String str, com.ironsource.zg.e eVar, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.name;
            }
            if ((i & 2) != 0) {
                eVar = aVar.productType;
            }
            if ((i & 4) != 0) {
                str2 = aVar.demandSourceName;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.params;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        public final com.ironsource.p3.a a(java.lang.String name, com.ironsource.zg.e productType, java.lang.String demandSourceName, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            return new com.ironsource.p3.a(name, productType, demandSourceName, params);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.ironsource.zg.e getProductType() {
            return this.productType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final java.lang.String getDemandSourceName() {
            return this.demandSourceName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final org.json.JSONObject getParams() {
            return this.params;
        }

        public final java.lang.String e() {
            return this.demandSourceName;
        }

        public boolean equals(java.lang.Object other) {
            if (!(other instanceof com.ironsource.p3.a)) {
                return false;
            }
            if (this == other) {
                return true;
            }
            com.ironsource.p3.a aVar = (com.ironsource.p3.a) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, aVar.name) && this.productType == aVar.productType && kotlin.jvm.internal.Intrinsics.areEqual(this.demandSourceName, aVar.demandSourceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.params.toString(), aVar.params.toString());
        }

        public final java.lang.String f() {
            return this.name;
        }

        public final org.json.JSONObject g() {
            return this.params;
        }

        public final com.ironsource.zg.e h() {
            return this.productType;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final org.json.JSONObject i() throws org.json.JSONException {
            org.json.JSONObject jSONObjectPut = new org.json.JSONObject(this.params.toString()).put(com.ironsource.y8.h.m, this.productType).put("demandSourceName", this.demandSourceName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public java.lang.String toString() {
            return "CallbackResult(name=" + this.name + ", productType=" + this.productType + ", demandSourceName=" + this.demandSourceName + ", params=" + this.params + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3141a;
        final /* synthetic */ android.adservices.measurement.MeasurementManager c;
        final /* synthetic */ android.net.Uri d;
        final /* synthetic */ android.view.MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, android.view.MotionEvent motionEvent, kotlin.coroutines.Continuation<? super com.ironsource.p3.c> continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ironsource.p3.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.json.p3.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3141a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.json.p3 p3Var = com.json.p3.this;
                android.adservices.measurement.MeasurementManager measurementManager = this.c;
                android.net.Uri uri = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                android.view.MotionEvent motionEvent = this.e;
                this.f3141a = 1;
                if (p3Var.a(measurementManager, uri, motionEvent, this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3142a;
        final /* synthetic */ android.adservices.measurement.MeasurementManager c;
        final /* synthetic */ android.net.Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, kotlin.coroutines.Continuation<? super com.ironsource.p3.d> continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ironsource.p3.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.json.p3.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3142a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.json.p3 p3Var = com.json.p3.this;
                android.adservices.measurement.MeasurementManager measurementManager = this.c;
                android.net.Uri uri = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.f3142a = 1;
                if (p3Var.a(measurementManager, uri, null, this) == coroutine_suspended) {
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

    static {
        com.json.p3.Companion companion = new com.json.p3.Companion(null);
        INSTANCE = companion;
        java.lang.String name = companion.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        b = name;
    }

    private final com.ironsource.p3.a a(android.content.Context context, com.ironsource.r3.a message) {
        android.adservices.measurement.MeasurementManager measurementManagerA = com.json.h1.a(context);
        if (measurementManagerA == null) {
            com.json.sdk.utils.Logger.i(b, "could not obtain measurement manager");
            return a(message, "could not obtain measurement manager");
        }
        try {
            if (message instanceof com.ironsource.r3.a.b) {
                return a(message, measurementManagerA);
            }
            if (message instanceof com.ironsource.r3.a.C0241a) {
                return a((com.ironsource.r3.a.C0241a) message, measurementManagerA);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return a(message, "failed to handle attribution, message: " + e.getMessage());
        }
    }

    private final com.ironsource.p3.a a(com.ironsource.r3.a.C0241a message, android.adservices.measurement.MeasurementManager measurementManager) throws java.lang.InterruptedException {
        android.net.Uri uri = android.net.Uri.parse(message.getUrl());
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.ironsource.p3.c(measurementManager, uri, android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, message.m(), message.n().c(), message.n().d(), message.o()), null), 1, null);
        return a(message);
    }

    private final com.ironsource.p3.a a(com.ironsource.r3.a message) throws org.json.JSONException {
        org.json.JSONObject params = new org.json.JSONObject().put("params", new org.json.JSONObject().put("type", message instanceof com.ironsource.r3.a.C0241a ? com.json.z8.CLICK : "impression"));
        java.lang.String successCallback = message.getSuccessCallback();
        com.ironsource.zg.e productType = message.getCom.ironsource.y8.h.m java.lang.String();
        java.lang.String demandSourceName = message.getDemandSourceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(params, "params");
        return new com.ironsource.p3.a(successCallback, productType, demandSourceName, params);
    }

    private final com.ironsource.p3.a a(com.ironsource.r3.a message, android.adservices.measurement.MeasurementManager measurementManager) throws java.lang.InterruptedException {
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.ironsource.p3.d(measurementManager, android.net.Uri.parse(message.getUrl()), null), 1, null);
        return a(message);
    }

    private final com.ironsource.p3.a a(com.json.r3 message, java.lang.String reason) throws org.json.JSONException {
        org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put("reason", reason).put("type", message instanceof com.ironsource.r3.a.C0241a ? com.json.z8.CLICK : "impression");
        java.lang.String failCallback = message.getFailCallback();
        com.ironsource.zg.e productType = message.getCom.ironsource.y8.h.m java.lang.String();
        java.lang.String demandSourceName = message.getDemandSourceName();
        org.json.JSONObject jSONObjectPut2 = new org.json.JSONObject().put("params", jSONObjectPut);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new com.ironsource.p3.a(failCallback, productType, demandSourceName, jSONObjectPut2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object a(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, android.view.MotionEvent motionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        measurementManager.registerSource(uri, motionEvent, java.util.concurrent.Executors.newSingleThreadExecutor(), com.json.q3.a(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : kotlin.Unit.INSTANCE;
    }

    public final com.ironsource.p3.a a(android.content.Context context, com.json.r3 message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof com.ironsource.r3.a) {
            return a(context, (com.ironsource.r3.a) message);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
