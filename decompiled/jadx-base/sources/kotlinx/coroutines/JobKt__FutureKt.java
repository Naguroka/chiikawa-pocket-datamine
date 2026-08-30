package kotlinx.coroutines;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"cancelFutureOnCancellation", "", "Lkotlinx/coroutines/CancellableContinuation;", "future", "Ljava/util/concurrent/Future;", "cancelFutureOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__FutureKt {
    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(kotlinx.coroutines.Job job, java.util.concurrent.Future<?> future) {
        return job.invokeOnCompletion(new kotlinx.coroutines.CancelFutureOnCompletion(future));
    }

    public static final void cancelFutureOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, java.util.concurrent.Future<?> future) {
        cancellableContinuation.invokeOnCancellation(new kotlinx.coroutines.CancelFutureOnCancel(future));
    }
}
