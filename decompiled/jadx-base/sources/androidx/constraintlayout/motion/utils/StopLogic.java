package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class StopLogic extends androidx.constraintlayout.motion.widget.MotionInterpolator {
    private androidx.constraintlayout.core.motion.utils.StopEngine mEngine;
    private androidx.constraintlayout.core.motion.utils.SpringStopEngine mSpringStopEngine;
    private androidx.constraintlayout.core.motion.utils.StopLogicEngine mStopLogicEngine;

    public StopLogic() {
        androidx.constraintlayout.core.motion.utils.StopLogicEngine stopLogicEngine = new androidx.constraintlayout.core.motion.utils.StopLogicEngine();
        this.mStopLogicEngine = stopLogicEngine;
        this.mEngine = stopLogicEngine;
    }

    public java.lang.String debug(java.lang.String desc, float time) {
        return this.mEngine.debug(desc, time);
    }

    public float getVelocity(float x) {
        return this.mEngine.getVelocity(x);
    }

    public void config(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        androidx.constraintlayout.core.motion.utils.StopLogicEngine stopLogicEngine = this.mStopLogicEngine;
        this.mEngine = stopLogicEngine;
        stopLogicEngine.config(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public void springConfig(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new androidx.constraintlayout.core.motion.utils.SpringStopEngine();
        }
        androidx.constraintlayout.core.motion.utils.SpringStopEngine springStopEngine = this.mSpringStopEngine;
        this.mEngine = springStopEngine;
        springStopEngine.springConfig(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float v) {
        return this.mEngine.getInterpolation(v);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.mEngine.getVelocity();
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }
}
