package kotlinx.coroutines.future;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a[\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asCompletableFuture", "Ljava/util/concurrent/CompletableFuture;", "T", "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "asDeferred", "Ljava/util/concurrent/CompletionStage;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "setupCancellation", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FutureKt {
    public static /* synthetic */ java.util.concurrent.CompletableFuture future$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> future(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        if (!(!coroutineStart.isLazy())) {
            throw new java.lang.IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        kotlin.coroutines.CoroutineContext coroutineContextNewCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        java.util.concurrent.CompletableFuture<T> completableFuture = new java.util.concurrent.CompletableFuture<>();
        kotlinx.coroutines.future.CompletableFutureCoroutine completableFutureCoroutine = new kotlinx.coroutines.future.CompletableFutureCoroutine(coroutineContextNewCoroutineContext, completableFuture);
        completableFuture.handle((java.util.function.BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, function2);
        return completableFuture;
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> asCompletableFuture(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final java.util.concurrent.CompletableFuture<T> completableFuture = new java.util.concurrent.CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.future.FutureKt.asCompletableFuture.1
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
                try {
                    completableFuture.complete((T) deferred.getCompleted());
                } catch (java.lang.Throwable th2) {
                    completableFuture.completeExceptionally(th2);
                }
            }
        });
        return completableFuture;
    }

    public static final java.util.concurrent.CompletableFuture<kotlin.Unit> asCompletableFuture(kotlinx.coroutines.Job job) {
        final java.util.concurrent.CompletableFuture<kotlin.Unit> completableFuture = new java.util.concurrent.CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.future.FutureKt.asCompletableFuture.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (th == null) {
                    completableFuture.complete(kotlin.Unit.INSTANCE);
                } else {
                    completableFuture.completeExceptionally(th);
                }
            }
        });
        return completableFuture;
    }

    private static final void setupCancellation(final kotlinx.coroutines.Job job, java.util.concurrent.CompletableFuture<?> completableFuture) {
        completableFuture.handle(new java.util.function.BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return kotlinx.coroutines.future.FutureKt.setupCancellation$lambda$2(job, obj, (java.lang.Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit setupCancellation$lambda$2(kotlinx.coroutines.Job job, java.lang.Object obj, java.lang.Throwable th) {
        java.util.concurrent.CancellationException CancellationException = null;
        if (th != null) {
            CancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = kotlinx.coroutines.ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
            }
        }
        job.cancel(CancellationException);
        return kotlin.Unit.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(java.util.concurrent.CompletionStage<T> completionStage) {
        java.lang.Throwable cause;
        java.util.concurrent.CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(completableFuture.get());
            } catch (java.lang.Throwable th) {
                th = th;
                java.util.concurrent.ExecutionException executionException = th instanceof java.util.concurrent.ExecutionException ? (java.util.concurrent.ExecutionException) th : null;
                if (executionException != null && (cause = executionException.getCause()) != null) {
                    th = cause;
                }
                kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                completableDeferredCompletableDeferred$default.completeExceptionally(th);
                return completableDeferredCompletableDeferred$default;
            }
        }
        final kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final kotlin.jvm.functions.Function2<T, java.lang.Throwable, java.lang.Object> function2 = new kotlin.jvm.functions.Function2<T, java.lang.Throwable, java.lang.Object>() { // from class: kotlinx.coroutines.future.FutureKt.asDeferred.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(T t, java.lang.Throwable th2) {
                boolean zCompleteExceptionally;
                java.lang.Throwable cause2;
                try {
                    if (th2 == null) {
                        zCompleteExceptionally = completableDeferredCompletableDeferred$default2.complete(t);
                    } else {
                        kotlinx.coroutines.CompletableDeferred<T> completableDeferred = completableDeferredCompletableDeferred$default2;
                        java.util.concurrent.CompletionException completionException = th2 instanceof java.util.concurrent.CompletionException ? (java.util.concurrent.CompletionException) th2 : null;
                        if (completionException != null && (cause2 = completionException.getCause()) != null) {
                            th2 = cause2;
                        }
                        zCompleteExceptionally = completableDeferred.completeExceptionally(th2);
                    }
                    return java.lang.Boolean.valueOf(zCompleteExceptionally);
                } catch (java.lang.Throwable th3) {
                    kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, th3);
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        completionStage.handle(new java.util.function.BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return function2.invoke(obj, (java.lang.Throwable) obj2);
            }
        });
        kotlinx.coroutines.JobKt.cancelFutureOnCompletion(completableDeferredCompletableDeferred$default2, completableFuture);
        return completableDeferredCompletableDeferred$default2;
    }

    public static final <T> java.lang.Object await(java.util.concurrent.CompletionStage<T> completionStage, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        final java.util.concurrent.CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final kotlinx.coroutines.future.ContinuationHandler continuationHandler = new kotlinx.coroutines.future.ContinuationHandler(cancellableContinuationImpl2);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
