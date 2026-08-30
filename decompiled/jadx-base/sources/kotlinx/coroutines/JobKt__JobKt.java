package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class JobKt__JobKt {
    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.JobImpl(job);
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return kotlinx.coroutines.JobKt.Job(job);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m2797Job(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.JobKt.Job(job);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m2798Job$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m2797Job(job);
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job job, kotlinx.coroutines.DisposableHandle disposableHandle) {
        return job.invokeOnCompletion(new kotlinx.coroutines.DisposeOnCompletion(disposableHandle));
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        java.lang.Object objJoin = job.join(continuation);
        return objJoin == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job job, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(job, cancellationException);
    }

    public static final void cancelChildren(kotlinx.coroutines.Job job, java.util.concurrent.CancellationException cancellationException) {
        java.util.Iterator<kotlinx.coroutines.Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job job, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(job, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job job, java.lang.Throwable th) {
        for (kotlinx.coroutines.Job job2 : job.getChildren()) {
            kotlinx.coroutines.JobSupport jobSupport = job2 instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static /* synthetic */ void cancel$default(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancel(coroutineContext, cancellationException);
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static final void ensureActive(kotlinx.coroutines.Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            kotlinx.coroutines.JobKt.ensureActive(job);
        }
    }

    public static final void cancel(kotlinx.coroutines.Job job, java.lang.String str, java.lang.Throwable th) {
        job.cancel(kotlinx.coroutines.ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job job, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        kotlinx.coroutines.JobKt.cancel(job, str, th);
    }

    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        kotlinx.coroutines.JobSupport jobSupport = element instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) element : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, jobSupport));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlin.sequences.Sequence<kotlinx.coroutines.Job> children;
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static final kotlinx.coroutines.Job getJob(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job;
        }
        throw new java.lang.IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            return;
        }
        for (kotlinx.coroutines.Job job2 : job.getChildren()) {
            kotlinx.coroutines.JobSupport jobSupport = job2 instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    private static final java.lang.Throwable orCancellation$JobKt__JobKt(java.lang.Throwable th, kotlinx.coroutines.Job job) {
        return th == null ? new kotlinx.coroutines.JobCancellationException("Job was cancelled", null, job) : th;
    }
}
