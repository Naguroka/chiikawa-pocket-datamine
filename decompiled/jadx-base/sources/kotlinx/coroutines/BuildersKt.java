package kotlinx.coroutines;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class BuildersKt {
    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.async(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, function2, continuation);
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> T runBlocking(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) throws java.lang.InterruptedException {
        return (T) kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(coroutineContext, function2);
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.withContext(coroutineContext, function2, continuation);
    }
}
