package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransitionPropagation {
    public abstract void captureValues(androidx.transition.TransitionValues transitionValues);

    public abstract java.lang.String[] getPropagationProperties();

    public abstract long getStartDelay(android.view.ViewGroup viewGroup, androidx.transition.Transition transition, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2);
}
