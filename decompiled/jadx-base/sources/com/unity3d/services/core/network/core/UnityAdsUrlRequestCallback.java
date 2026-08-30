package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\b \u0018\u0000 +2\u00020\u0001:\u0001+B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J$\u0010#\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0016\u0010&\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010'\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010'\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H&J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/unity3d/services/core/network/core/UnityAdsUrlRequestCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "readTimeout", "", com.ironsource.y8.h.b, "Ljava/io/File;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;JLjava/io/File;)V", "bytesReceived", "Ljava/io/ByteArrayOutputStream;", "getFile", "()Ljava/io/File;", "getReadTimeout", "()J", "receiveChannel", "Ljava/nio/channels/WritableByteChannel;", "kotlin.jvm.PlatformType", "sink", "Lokio/BufferedSink;", "task", "Lkotlinx/coroutines/Job;", "cancelTimer", "", "onCanceled", "request", "Lorg/chromium/net/UrlRequest;", "info", "Lorg/chromium/net/UrlResponseInfo;", "onFailed", "error", "Lorg/chromium/net/CronetException;", "onReadCompleted", "byteBuffer", "Ljava/nio/ByteBuffer;", "onRedirectReceived", "newLocationUrl", "", "onResponseStarted", "onSucceeded", "bodyBytes", "", "startTimer", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class UnityAdsUrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    private final java.io.ByteArrayOutputStream bytesReceived;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final java.io.File file;
    private final long readTimeout;
    private final java.nio.channels.WritableByteChannel receiveChannel;
    private okio.BufferedSink sink;
    private kotlinx.coroutines.Job task;

    public abstract void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, byte[] bodyBytes);

    public UnityAdsUrlRequestCallback(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, long j, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.readTimeout = j;
        this.file = file;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = java.nio.channels.Channels.newChannel(byteArrayOutputStream);
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, java.lang.String newLocationUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        java.io.File file = this.file;
        boolean z = false;
        if (file != null && file.exists()) {
            z = true;
        }
        if (z) {
            okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(okio.Okio.sink(this.file));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bufferedSinkBuffer, "buffer(Okio.sink(file))");
            this.sink = bufferedSinkBuffer;
        }
        startTimer(request);
        request.read(java.nio.ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        cancelTimer();
        byteBuffer.flip();
        java.io.File file = this.file;
        boolean z = false;
        if (file != null && file.exists()) {
            z = true;
        }
        if (z) {
            okio.BufferedSink bufferedSink = this.sink;
            if (bufferedSink == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink = null;
            }
            bufferedSink.write(byteBuffer);
        } else {
            this.receiveChannel.write(byteBuffer);
        }
        byteBuffer.clear();
        startTimer(request);
        request.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        cancelTimer();
        byte[] bodyBytes = this.bytesReceived.toByteArray();
        java.io.File file = this.file;
        if (file != null && file.exists()) {
            okio.BufferedSink bufferedSink = this.sink;
            if (bufferedSink == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sink");
                bufferedSink = null;
            }
            bufferedSink.close();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bodyBytes, "bodyBytes");
        onSucceeded(request, info, bodyBytes);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
        super.onCanceled(request, info);
        cancelTimer();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, org.chromium.net.CronetException error) {
        cancelTimer();
    }

    public final void startTimer(org.chromium.net.UrlRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        cancelTimer();
        this.task = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.dispatchers.getIo()), null, null, new com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.AnonymousClass1(request, null), 3, null);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1, reason: invalid class name */
    /* JADX INFO: compiled from: UnityAdsUrlRequestCallback.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1", f = "UnityAdsUrlRequestCallback.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ org.chromium.net.UrlRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(org.chromium.net.UrlRequest urlRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = urlRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback.this.getReadTimeout(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.$request.cancel();
            return kotlin.Unit.INSTANCE;
        }
    }

    private final void cancelTimer() {
        kotlinx.coroutines.Job job = this.task;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.task = null;
    }
}
