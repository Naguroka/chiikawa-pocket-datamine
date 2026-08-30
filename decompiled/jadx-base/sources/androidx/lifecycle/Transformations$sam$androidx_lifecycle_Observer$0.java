package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements androidx.lifecycle.Observer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 function;

    Transformations$sam$androidx_lifecycle_Observer$0(kotlin.jvm.functions.Function1 function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.lifecycle.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(java.lang.Object obj) {
        this.function.invoke(obj);
    }
}
