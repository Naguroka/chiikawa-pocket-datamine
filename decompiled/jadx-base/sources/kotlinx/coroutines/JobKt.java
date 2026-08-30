package kotlinx.coroutines;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class JobKt {
    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.JobKt__JobKt.Job(job);
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.JobKt__JobKt.cancel(coroutineContext, cancellationException);
    }

    public static final void cancel(kotlinx.coroutines.Job job, java.lang.String str, java.lang.Throwable th) {
        kotlinx.coroutines.JobKt__JobKt.cancel(job, str, th);
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.JobKt__JobKt.cancelAndJoin(job, continuation);
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(kotlinx.coroutines.Job job, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(job, cancellationException);
    }

    public static final void cancelFutureOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, java.util.concurrent.Future<?> future) {
        kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(kotlinx.coroutines.Job job, java.util.concurrent.Future<?> future) {
        return kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCompletion(job, future);
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job job, kotlinx.coroutines.DisposableHandle disposableHandle) {
        return kotlinx.coroutines.JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.JobKt__JobKt.ensureActive(coroutineContext);
    }

    public static final void ensureActive(kotlinx.coroutines.Job job) {
        kotlinx.coroutines.JobKt__JobKt.ensureActive(job);
    }

    public static final kotlinx.coroutines.Job getJob(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.JobKt__JobKt.getJob(coroutineContext);
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.JobKt__JobKt.isActive(coroutineContext);
    }
}
