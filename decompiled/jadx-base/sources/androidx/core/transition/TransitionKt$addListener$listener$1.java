package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = org.objectweb.asm.Opcodes.ARETURN)
public final class TransitionKt$addListener$listener$1 implements android.transition.Transition.TransitionListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onCancel;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onPause;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onResume;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function5) {
        this.$onEnd = function1;
        this.$onResume = function2;
        this.$onPause = function3;
        this.$onCancel = function4;
        this.$onStart = function5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(android.transition.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "transition");
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(android.transition.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "transition");
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(android.transition.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
