package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends androidx.constraintlayout.widget.ConstraintHelper {
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;

    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    public VirtualLayout(android.content.Context context) {
        super(context);
    }

    public VirtualLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public VirtualLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.constraintlayout.widget.ConstraintLayout) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.mCount; i++) {
                    android.view.View viewById = constraintLayout.getViewById(this.mIds[i]);
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
    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout container) {
        applyLayoutFeatures(container);
    }
}
