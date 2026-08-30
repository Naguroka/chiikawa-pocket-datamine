package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/animation/Api19Impl;", "", "()V", "addPauseListener", "", "animator", "Landroid/animation/Animator;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Api19Impl {
    public static final androidx.core.animation.Api19Impl INSTANCE = new androidx.core.animation.Api19Impl();

    private Api19Impl() {
    }

    @kotlin.jvm.JvmStatic
    public static final void addPauseListener(android.animation.Animator animator, android.animation.Animator.AnimatorPauseListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        animator.addPauseListener(listener);
    }
}
