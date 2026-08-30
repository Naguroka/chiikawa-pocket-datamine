package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"runBlocking", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class BuildersKt__BuildersKt {
    public static /* synthetic */ java.lang.Object runBlocking$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) throws java.lang.InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return kotlinx.coroutines.BuildersKt.runBlocking(coroutineContext, function2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    public static final <T> T runBlocking(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) throws java.lang.InterruptedException {
        kotlinx.coroutines.EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core;
        kotlin.coroutines.CoroutineContext coroutineContextNewCoroutineContext;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        kotlin.coroutines.ContinuationInterceptor continuationInterceptor = (kotlin.coroutines.ContinuationInterceptor) coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            eventLoopCurrentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            coroutineContextNewCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext.plus(eventLoopCurrentOrNull$kotlinx_coroutines_core));
        } else {
            kotlinx.coroutines.EventLoop eventLoop = continuationInterceptor instanceof kotlinx.coroutines.EventLoop ? (kotlinx.coroutines.EventLoop) continuationInterceptor : null;
            if (eventLoop == null) {
                eventLoopCurrentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            } else {
                kotlinx.coroutines.EventLoop eventLoop2 = eventLoop.shouldBeProcessedFromContext() ? eventLoop : null;
                if (eventLoop2 == null) {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
                } else {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = eventLoop2;
                }
            }
            coroutineContextNewCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext);
        }
        kotlinx.coroutines.BlockingCoroutine blockingCoroutine = new kotlinx.coroutines.BlockingCoroutine(coroutineContextNewCoroutineContext, threadCurrentThread, eventLoopCurrentOrNull$kotlinx_coroutines_core);
        blockingCoroutine.start(kotlinx.coroutines.CoroutineStart.DEFAULT, blockingCoroutine, function2);
        return (T) blockingCoroutine.joinBlocking();
    }
}
