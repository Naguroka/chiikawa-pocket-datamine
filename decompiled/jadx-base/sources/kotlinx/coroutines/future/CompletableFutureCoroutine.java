package kotlinx.coroutines.future;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0014R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/future/CompletableFutureCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljava/util/function/BiFunction;", "", "", "context", "Lkotlin/coroutines/CoroutineContext;", "future", "Ljava/util/concurrent/CompletableFuture;", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CompletableFuture;)V", "apply", "value", "exception", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "onCancelled", "cause", "handled", "", "onCompleted", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CompletableFutureCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.Unit> {
    private final java.util.concurrent.CompletableFuture<T> future;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ kotlin.Unit apply(java.lang.Object obj, java.lang.Throwable th) {
        apply2(obj, th);
        return kotlin.Unit.INSTANCE;
    }

    public CompletableFutureCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CompletableFuture<T> completableFuture) {
        super(coroutineContext, true, true);
        this.future = completableFuture;
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T value, java.lang.Throwable exception) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCompleted(T value) {
        this.future.complete(value);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(java.lang.Throwable cause, boolean handled) {
        this.future.completeExceptionally(cause);
    }
}
