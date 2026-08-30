package kotlinx.coroutines.tasks;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", "T", "Lcom/google/android/gms/tasks/Task;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", "asTask", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TasksKt {
    public static final <T> com.google.android.gms.tasks.Task<T> asTask(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt.asTask.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                if (th instanceof java.util.concurrent.CancellationException) {
                    cancellationTokenSource.cancel();
                    return;
                }
                java.lang.Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
                if (completionExceptionOrNull == null) {
                    taskCompletionSource.setResult((T) deferred.getCompleted());
                    return;
                }
                com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource2 = taskCompletionSource;
                com.google.android.gms.tasks.RuntimeExecutionException runtimeExecutionException = completionExceptionOrNull instanceof java.lang.Exception ? (java.lang.Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new com.google.android.gms.tasks.RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource2.setException(runtimeExecutionException);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task) {
        return asDeferredImpl(task, null);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    private static final <T> kotlinx.coroutines.Deferred<T> asDeferredImpl(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        final kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableDeferredCompletableDeferred$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                } else {
                    completableDeferredCompletableDeferred$default.complete(task.getResult());
                }
            } else {
                completableDeferredCompletableDeferred$default.completeExceptionally(exception);
            }
        } else {
            task.addOnCompleteListener(kotlinx.coroutines.tasks.DirectExecutor.INSTANCE, new com.google.android.gms.tasks.OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task2) {
                    kotlinx.coroutines.tasks.TasksKt.asDeferredImpl$lambda$0(completableDeferredCompletableDeferred$default, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        return new kotlinx.coroutines.Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
                return completableDeferredCompletableDeferred$default.attachChild(child);
            }

            @Override // kotlinx.coroutines.Deferred
            public java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
                return completableDeferredCompletableDeferred$default.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ void cancel() {
                completableDeferredCompletableDeferred$default.cancel();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(java.util.concurrent.CancellationException cause) {
                completableDeferredCompletableDeferred$default.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ boolean cancel(java.lang.Throwable cause) {
                return completableDeferredCompletableDeferred$default.cancel(cause);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
                return (R) completableDeferredCompletableDeferred$default.fold(initial, operation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
                return (E) completableDeferredCompletableDeferred$default.get(key);
            }

            @Override // kotlinx.coroutines.Job
            public java.util.concurrent.CancellationException getCancellationException() {
                return completableDeferredCompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
                return completableDeferredCompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            public T getCompleted() {
                return completableDeferredCompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            public java.lang.Throwable getCompletionExceptionOrNull() {
                return completableDeferredCompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
                return completableDeferredCompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
                return completableDeferredCompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
                return completableDeferredCompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.Job getParent() {
                return completableDeferredCompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferredCompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferredCompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferredCompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return completableDeferredCompletableDeferred$default.join(continuation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
                return completableDeferredCompletableDeferred$default.minusKey(key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
                return completableDeferredCompletableDeferred$default.plus(context);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other) {
                return completableDeferredCompletableDeferred$default.plus(other);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferredCompletableDeferred$default.start();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$0(kotlinx.coroutines.CompletableDeferred completableDeferred, com.google.android.gms.tasks.Task task) {
        java.lang.Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableDeferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return;
            } else {
                completableDeferred.complete(task.getResult());
                return;
            }
        }
        completableDeferred.completeExceptionally(exception);
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, kotlin.coroutines.Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) {
        return awaitImpl(task, cancellationTokenSource, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.lang.Object awaitImpl(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Exception {
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new java.util.concurrent.CancellationException("Task " + task + " was cancelled normally.");
                }
                return task.getResult();
            }
            throw exception;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        task.addOnCompleteListener(kotlinx.coroutines.tasks.DirectExecutor.INSTANCE, new com.google.android.gms.tasks.OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task<T> task2) {
                java.lang.Exception exception2 = task2.getException();
                if (exception2 == null) {
                    if (task2.isCanceled()) {
                        kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl2, null, 1, null);
                        return;
                    }
                    kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m1301constructorimpl(task2.getResult()));
                    return;
                }
                kotlin.coroutines.Continuation continuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation3.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(exception2)));
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
