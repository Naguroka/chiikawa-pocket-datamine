package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = org.objectweb.asm.Opcodes.ARETURN)
public final class AnimatorKt$addListener$listener$1 implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onCancel;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onRepeat;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function4) {
        this.$onRepeat = function1;
        this.$onEnd = function2;
        this.$onCancel = function3;
        this.$onStart = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
