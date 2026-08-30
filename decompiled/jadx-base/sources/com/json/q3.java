package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class q3 {

    @kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u0016¨\u0006\n"}, d2 = {"com/ironsource/q3$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "result", "", "onResult", "error", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.Continuation<kotlin.Unit> f3177a;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            this.f3177a = continuation;
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.f3177a;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(error)));
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object result) {
            kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.f3177a;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    public static final android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new com.ironsource.q3.a(continuation);
    }
}
