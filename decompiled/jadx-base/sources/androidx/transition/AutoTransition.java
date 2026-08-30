package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTransition extends androidx.transition.TransitionSet {
    public AutoTransition() {
        init();
    }

    public AutoTransition(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        setOrdering(1);
        addTransition(new androidx.transition.Fade(2)).addTransition(new androidx.transition.ChangeBounds()).addTransition(new androidx.transition.Fade(1));
    }
}
