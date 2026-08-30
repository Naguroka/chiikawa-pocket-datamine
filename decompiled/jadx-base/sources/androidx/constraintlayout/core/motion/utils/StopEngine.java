package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public interface StopEngine {
    java.lang.String debug(java.lang.String str, float f);

    float getInterpolation(float f);

    float getVelocity();

    float getVelocity(float f);

    boolean isStopped();
}
