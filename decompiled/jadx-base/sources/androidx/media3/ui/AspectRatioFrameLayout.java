package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    private androidx.media3.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener;
    private final androidx.media3.ui.AspectRatioFrameLayout.AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, androidx.media3.ui.R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.aspectRatioUpdateDispatcher = new androidx.media3.ui.AspectRatioFrameLayout.AspectRatioUpdateDispatcher();
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(androidx.media3.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.videoAspectRatio <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.videoAspectRatio / f5) - 1.0f;
        if (java.lang.Math.abs(f6) <= MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f5, false);
            return;
        }
        int i3 = this.resizeMode;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.videoAspectRatio;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.videoAspectRatio;
                    } else {
                        f2 = this.videoAspectRatio;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.videoAspectRatio;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.videoAspectRatio;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.videoAspectRatio;
            measuredWidth = (int) (f4 * f);
        }
        this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f5, true);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    private final class AspectRatioUpdateDispatcher implements java.lang.Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        public void scheduleUpdate(float f, float f2, boolean z) {
            this.targetAspectRatio = f;
            this.naturalAspectRatio = f2;
            this.aspectRatioMismatch = z;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            androidx.media3.ui.AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            if (androidx.media3.ui.AspectRatioFrameLayout.this.aspectRatioListener == null) {
                return;
            }
            androidx.media3.ui.AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
        }
    }
}
