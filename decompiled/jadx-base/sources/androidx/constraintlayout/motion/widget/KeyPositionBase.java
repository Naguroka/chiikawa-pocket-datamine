package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class KeyPositionBase extends androidx.constraintlayout.motion.widget.Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit = UNSET;

    abstract void calcPosition(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    @Override // androidx.constraintlayout.motion.widget.Key
    void getAttributeNames(java.util.HashSet<java.lang.String> attributes) {
    }

    abstract float getPositionX();

    abstract float getPositionY();

    public abstract boolean intersects(int layoutWidth, int layoutHeight, android.graphics.RectF start, android.graphics.RectF end, float x, float y);

    abstract void positionAttributes(android.view.View view, android.graphics.RectF start, android.graphics.RectF end, float x, float y, java.lang.String[] attribute, float[] value);

    KeyPositionBase() {
    }
}
