package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUncaughtCoroutineException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        java.util.Iterator<kotlinx.coroutines.CoroutineExceptionHandler> it = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(th, th2));
            }
        }
        try {
            kotlin.ExceptionsKt.addSuppressed(th, new kotlinx.coroutines.internal.DiagnosticCoroutineContextException(coroutineContext));
        } catch (java.lang.Throwable unused2) {
        }
        kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th);
    }
}
