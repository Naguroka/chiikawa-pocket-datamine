package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends androidx.constraintlayout.widget.ConstraintHelper {
    private static final java.lang.String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;
    androidx.constraintlayout.widget.ConstraintLayout mContainer;
    private float mGroupRotateAngle;
    boolean mNeedBounds;
    private float mRotationCenterX;
    private float mRotationCenterY;
    private float mScaleX;
    private float mScaleY;
    private float mShiftX;
    private float mShiftY;
    android.view.View[] mViews;

    public Layer(android.content.Context context) {
        super(context);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    public Layer(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    public Layer(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        this.mUseViewMeasure = false;
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.mApplyVisibilityOnAttach = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.mApplyElevationOnAttach = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                android.view.View viewById = this.mContainer.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.mApplyVisibilityOnAttach) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout container) {
        this.mContainer = container;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (java.lang.Float.isNaN(this.mGroupRotateAngle)) {
                return;
            }
            this.mGroupRotateAngle = rotation;
            return;
        }
        this.mGroupRotateAngle = rotation;
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.mGroupRotateAngle = angle;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.mScaleX = scaleX;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.mScaleY = scaleY;
        transform();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.mRotationCenterX = pivotX;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.mRotationCenterY = pivotY;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.mShiftX = dx;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.mShiftY = dy;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout container) {
        reCacheViews();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        transform();
    }

    private void reCacheViews() {
        if (this.mContainer == null || this.mCount == 0) {
            return;
        }
        android.view.View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new android.view.View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.mViews[i] = this.mContainer.getViewById(this.mIds[i]);
        }
    }

    protected void calcCenters() {
        if (this.mContainer == null) {
            return;
        }
        if (this.mNeedBounds || java.lang.Float.isNaN(this.mComputedCenterX) || java.lang.Float.isNaN(this.mComputedCenterY)) {
            if (java.lang.Float.isNaN(this.mRotationCenterX) || java.lang.Float.isNaN(this.mRotationCenterY)) {
                android.view.View[] views = getViews(this.mContainer);
                int left = views[0].getLeft();
                int top = views[0].getTop();
                int right = views[0].getRight();
                int bottom = views[0].getBottom();
                for (int i = 0; i < this.mCount; i++) {
                    android.view.View view = views[i];
                    left = java.lang.Math.min(left, view.getLeft());
                    top = java.lang.Math.min(top, view.getTop());
                    right = java.lang.Math.max(right, view.getRight());
                    bottom = java.lang.Math.max(bottom, view.getBottom());
                }
                this.mComputedMaxX = right;
                this.mComputedMaxY = bottom;
                this.mComputedMinX = left;
                this.mComputedMinY = top;
                if (java.lang.Float.isNaN(this.mRotationCenterX)) {
                    this.mComputedCenterX = (left + right) / 2;
                } else {
                    this.mComputedCenterX = this.mRotationCenterX;
                }
                if (java.lang.Float.isNaN(this.mRotationCenterY)) {
                    this.mComputedCenterY = (top + bottom) / 2;
                    return;
                } else {
                    this.mComputedCenterY = this.mRotationCenterY;
                    return;
                }
            }
            this.mComputedCenterY = this.mRotationCenterY;
            this.mComputedCenterX = this.mRotationCenterX;
        }
    }

    private void transform() {
        if (this.mContainer == null) {
            return;
        }
        if (this.mViews == null) {
            reCacheViews();
        }
        calcCenters();
        double radians = java.lang.Float.isNaN(this.mGroupRotateAngle) ? 0.0d : java.lang.Math.toRadians(this.mGroupRotateAngle);
        float fSin = (float) java.lang.Math.sin(radians);
        float fCos = (float) java.lang.Math.cos(radians);
        float f = this.mScaleX;
        float f2 = f * fCos;
        float f3 = this.mScaleY;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.mCount; i++) {
            android.view.View view = this.mViews[i];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f7 = left - this.mComputedCenterX;
            float f8 = top - this.mComputedCenterY;
            float f9 = (((f2 * f7) + (f4 * f8)) - f7) + this.mShiftX;
            float f10 = (((f7 * f5) + (f6 * f8)) - f8) + this.mShiftY;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.mScaleY);
            view.setScaleX(this.mScaleX);
            if (!java.lang.Float.isNaN(this.mGroupRotateAngle)) {
                view.setRotation(this.mGroupRotateAngle);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout container) {
        applyLayoutFeatures(container);
    }
}
