package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.ViewParent, android.view.ViewParent> {
    public static final androidx.core.view.ViewKt$ancestors$1 INSTANCE = new androidx.core.view.ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, android.view.ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final android.view.ViewParent invoke(android.view.ViewParent p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getParent();
    }
}
