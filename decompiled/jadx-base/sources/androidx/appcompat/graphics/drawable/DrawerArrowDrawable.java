package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class DrawerArrowDrawable extends android.graphics.drawable.Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) java.lang.Math.toRadians(45.0d);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    private static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public DrawerArrowDrawable(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        this.mPath = new android.graphics.Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, androidx.appcompat.R.styleable.DrawerArrowToggle, androidx.appcompat.R.attr.drawerArrowStyle, androidx.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(typedArrayObtainStyledAttributes.getColor(androidx.appcompat.R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = typedArrayObtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setArrowHeadLength(float f) {
        if (this.mArrowHeadLength != f) {
            this.mArrowHeadLength = f;
            invalidateSelf();
        }
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public void setArrowShaftLength(float f) {
        if (this.mArrowShaftLength != f) {
            this.mArrowShaftLength = f;
            invalidateSelf();
        }
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public void setBarLength(float f) {
        if (this.mBarLength != f) {
            this.mBarLength = f;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (i != this.mPaint.getColor()) {
            this.mPaint.setColor(i);
            invalidateSelf();
        }
    }

    public int getColor() {
        return this.mPaint.getColor();
    }

    public void setBarThickness(float f) {
        if (this.mPaint.getStrokeWidth() != f) {
            this.mPaint.setStrokeWidth(f);
            this.mMaxCutForBarSize = (float) (((double) (f / 2.0f)) * java.lang.Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    public void setGapSize(float f) {
        if (f != this.mBarGap) {
            this.mBarGap = f;
            invalidateSelf();
        }
    }

    public void setDirection(int i) {
        if (i != this.mDirection) {
            this.mDirection = i;
            invalidateSelf();
        }
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    public void setSpinEnabled(boolean z) {
        if (this.mSpin != z) {
            this.mSpin = z;
            invalidateSelf();
        }
    }

    public int getDirection() {
        return this.mDirection;
    }

    public void setVerticalMirror(boolean z) {
        if (this.mVerticalMirror != z) {
            this.mVerticalMirror = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int i = this.mDirection;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 0 : androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f = this.mArrowHeadLength;
        float fLerp = lerp(this.mBarLength, (float) java.lang.Math.sqrt(f * f * 2.0f), this.mProgress);
        float fLerp2 = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        float fRound = java.lang.Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        float fLerp3 = lerp(0.0f, ARROW_HEAD_ANGLE, this.mProgress);
        float fLerp4 = lerp(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.mProgress);
        double d = fLerp;
        double d2 = fLerp3;
        boolean z2 = z;
        float fRound2 = java.lang.Math.round(java.lang.Math.cos(d2) * d);
        float fRound3 = java.lang.Math.round(d * java.lang.Math.sin(d2));
        this.mPath.rewind();
        float fLerp5 = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        float f2 = (-fLerp2) / 2.0f;
        this.mPath.moveTo(f2 + fRound, 0.0f);
        this.mPath.rLineTo(fLerp2 - (fRound * 2.0f), 0.0f);
        this.mPath.moveTo(f2, fLerp5);
        this.mPath.rLineTo(fRound2, fRound3);
        this.mPath.moveTo(f2, -fLerp5);
        this.mPath.rLineTo(fRound2, -fRound3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f3 = this.mBarGap;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * f3))) / 4) * 2) + (strokeWidth * 1.5f) + f3);
        if (this.mSpin) {
            canvas.rotate(fLerp4 * (this.mVerticalMirror ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public void setProgress(float f) {
        if (this.mProgress != f) {
            this.mProgress = f;
            invalidateSelf();
        }
    }

    public final android.graphics.Paint getPaint() {
        return this.mPaint;
    }
}
