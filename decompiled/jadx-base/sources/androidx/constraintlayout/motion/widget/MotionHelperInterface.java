package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public interface MotionHelperInterface extends androidx.constraintlayout.motion.widget.Animatable, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener {
    boolean isDecorator();

    boolean isUseOnHide();

    boolean isUsedOnShow();

    void onFinishedMotionScene(androidx.constraintlayout.motion.widget.MotionLayout motionLayout);

    void onPostDraw(android.graphics.Canvas canvas);

    void onPreDraw(android.graphics.Canvas canvas);

    void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> controllerMap);
}
