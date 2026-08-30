package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/view/Api16Impl;", "", "()V", "postOnAnimationDelayed", "", "view", "Landroid/view/View;", "action", "Ljava/lang/Runnable;", "delayInMillis", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Api16Impl {
    public static final androidx.core.view.Api16Impl INSTANCE = new androidx.core.view.Api16Impl();

    private Api16Impl() {
    }

    @kotlin.jvm.JvmStatic
    public static final void postOnAnimationDelayed(android.view.View view, java.lang.Runnable action, long delayInMillis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        view.postOnAnimationDelayed(action, delayInMillis);
    }
}
