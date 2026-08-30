package kotlinx.coroutines.future;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/future/ContinuationHandler;", "T", "Ljava/util/function/BiFunction;", "", "", "cont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "apply", "result", "exception", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ContinuationHandler<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.Unit> {
    public volatile kotlin.coroutines.Continuation<? super T> cont;

    public ContinuationHandler(kotlin.coroutines.Continuation<? super T> continuation) {
        this.cont = continuation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ kotlin.Unit apply(java.lang.Object obj, java.lang.Throwable th) {
        apply2(obj, th);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T result, java.lang.Throwable exception) {
        java.lang.Throwable cause;
        kotlin.coroutines.Continuation<? super T> continuation = this.cont;
        if (continuation == null) {
            return;
        }
        if (exception == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m1301constructorimpl(result));
            return;
        }
        java.util.concurrent.CompletionException completionException = exception instanceof java.util.concurrent.CompletionException ? (java.util.concurrent.CompletionException) exception : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            exception = cause;
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(exception)));
    }
}
