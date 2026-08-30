package kotlinx.coroutines;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class ThreadPoolDispatcherKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i, java.lang.String str) {
        return kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(i, str);
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String str) {
        return kotlinx.coroutines.ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
