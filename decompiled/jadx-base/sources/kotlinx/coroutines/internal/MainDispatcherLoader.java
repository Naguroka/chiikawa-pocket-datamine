package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED;
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE;
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher;

    private MainDispatcherLoader() {
    }

    static {
        kotlinx.coroutines.internal.MainDispatcherLoader mainDispatcherLoader = new kotlinx.coroutines.internal.MainDispatcherLoader();
        INSTANCE = mainDispatcherLoader;
        FAST_SERVICE_LOADER_ENABLED = kotlinx.coroutines.internal.SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = mainDispatcherLoader.loadMainDispatcher();
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
        java.lang.Object next;
        kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcherTryCreateDispatcher;
        try {
            java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> listLoadMainDispatcherFactory$kotlinx_coroutines_core = FAST_SERVICE_LOADER_ENABLED ? kotlinx.coroutines.internal.FastServiceLoader.INSTANCE.loadMainDispatcherFactory$kotlinx_coroutines_core() : kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).iterator()));
            java.util.Iterator<T> it = listLoadMainDispatcherFactory$kotlinx_coroutines_core.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((kotlinx.coroutines.internal.MainDispatcherFactory) next).getLoadPriority();
                    do {
                        java.lang.Object next2 = it.next();
                        int loadPriority2 = ((kotlinx.coroutines.internal.MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (mainCoroutineDispatcherTryCreateDispatcher = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, listLoadMainDispatcherFactory$kotlinx_coroutines_core)) == null) ? kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(null, null, 3, null) : mainCoroutineDispatcherTryCreateDispatcher;
        } catch (java.lang.Throwable th) {
            return kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(th, null, 2, null);
        }
    }
}
