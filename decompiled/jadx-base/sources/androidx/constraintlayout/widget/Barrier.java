package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends androidx.constraintlayout.widget.ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.core.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }

    public int getType() {
        return this.mIndicatedType;
    }

    public void setType(int type) {
        this.mIndicatedType = type;
    }

    private void updateType(androidx.constraintlayout.core.widgets.ConstraintWidget widget, int type, boolean isRtl) {
        this.mResolvedType = type;
        if (isRtl) {
            int i = this.mIndicatedType;
            if (i == 5) {
                this.mResolvedType = 1;
            } else if (i == 6) {
                this.mResolvedType = 0;
            }
        } else {
            int i2 = this.mIndicatedType;
            if (i2 == 5) {
                this.mResolvedType = 0;
            } else if (i2 == 6) {
                this.mResolvedType = 1;
            }
        }
        if (widget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) widget).setBarrierType(this.mResolvedType);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget widget, boolean isRtl) {
        updateType(widget, this.mIndicatedType, isRtl);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        this.mBarrier = new androidx.constraintlayout.core.widgets.Barrier();
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.mBarrier.setAllowsGoneWidget(supportGone);
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
        return this.mBarrier.getAllowsGoneWidget();
    }

    public boolean getAllowsGoneWidget() {
        return this.mBarrier.getAllowsGoneWidget();
    }

    public void setDpMargin(int margin) {
        this.mBarrier.setMargin((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public int getMargin() {
        return this.mBarrier.getMargin();
    }

    public void setMargin(int margin) {
        this.mBarrier.setMargin(margin);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.core.widgets.HelperWidget child, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mapIdToWidget) {
        super.loadParameters(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) child;
            updateType(barrier, constraint.layout.mBarrierDirection, ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) child.getParent()).isRtl());
            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
            barrier.setMargin(constraint.layout.mBarrierMargin);
        }
    }
}
