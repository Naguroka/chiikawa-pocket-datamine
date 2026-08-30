package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "onContextAvailable", "", "context", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements androidx.activity.contextaware.OnContextAvailableListener {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<R> $co;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(kotlinx.coroutines.CancellableContinuation<R> cancellableContinuation, kotlin.jvm.functions.Function1<android.content.Context, R> function1) {
        this.$co = cancellableContinuation;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(android.content.Context context) {
        java.lang.Object objM1301constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.coroutines.Continuation continuation = this.$co;
        kotlin.jvm.functions.Function1<android.content.Context, R> function1 = this.$onContextAvailable;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = this;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(function1.invoke(context));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        continuation.resumeWith(objM1301constructorimpl);
    }
}
