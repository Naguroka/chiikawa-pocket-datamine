package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionAdapter implements androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener {
    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
    }
}
