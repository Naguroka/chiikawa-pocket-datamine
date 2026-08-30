package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class TransitionBuilder {
    private static final java.lang.String TAG = "TransitionBuilder";

    public static void validate(androidx.constraintlayout.motion.widget.MotionLayout layout) {
        if (layout.mScene == null) {
            throw new java.lang.RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = layout.mScene;
        if (!motionScene.validateLayout(layout)) {
            throw new java.lang.RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (motionScene.mCurrentTransition == null || motionScene.getDefinedTransitions().isEmpty()) {
            throw new java.lang.RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }

    public static androidx.constraintlayout.motion.widget.MotionScene.Transition buildTransition(androidx.constraintlayout.motion.widget.MotionScene scene, int transitionId, int startConstraintSetId, androidx.constraintlayout.widget.ConstraintSet startConstraintSet, int endConstraintSetId, androidx.constraintlayout.widget.ConstraintSet endConstraintSet) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(transitionId, scene, startConstraintSetId, endConstraintSetId);
        updateConstraintSetInMotionScene(scene, transition, startConstraintSet, endConstraintSet);
        return transition;
    }

    private static void updateConstraintSetInMotionScene(androidx.constraintlayout.motion.widget.MotionScene scene, androidx.constraintlayout.motion.widget.MotionScene.Transition transition, androidx.constraintlayout.widget.ConstraintSet startConstraintSet, androidx.constraintlayout.widget.ConstraintSet endConstraintSet) {
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        scene.setConstraintSet(startConstraintSetId, startConstraintSet);
        scene.setConstraintSet(endConstraintSetId, endConstraintSet);
    }
}
