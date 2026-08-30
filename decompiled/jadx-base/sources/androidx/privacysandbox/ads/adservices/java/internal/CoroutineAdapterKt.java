package androidx.privacysandbox.ads.adservices.java.internal;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"asListenableFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "T", "Lkotlinx/coroutines/Deferred;", "tag", "", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineAdapterKt {
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture asListenableFuture$default(kotlinx.coroutines.Deferred deferred, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(deferred, obj);
    }

    public static final <T> com.google.common.util.concurrent.ListenableFuture<T> asListenableFuture(final kotlinx.coroutines.Deferred<? extends T> deferred, final java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferred, "<this>");
        com.google.common.util.concurrent.ListenableFuture<T> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$lambda$0(deferred, obj, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object asListenableFuture$lambda$0(final kotlinx.coroutines.Deferred this_asListenableFuture, java.lang.Object obj, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
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
                if (th != null) {
                    if (th instanceof java.util.concurrent.CancellationException) {
                        completer.setCancelled();
                        return;
                    } else {
                        completer.setException(th);
                        return;
                    }
                }
                completer.set((T) this_asListenableFuture.getCompleted());
            }
        });
        return obj;
    }
}
