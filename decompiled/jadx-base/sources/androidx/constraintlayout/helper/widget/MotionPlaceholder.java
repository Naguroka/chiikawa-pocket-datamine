package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends androidx.constraintlayout.widget.VirtualLayout {
    private static final java.lang.String TAG = "MotionPlaceholder";
    androidx.constraintlayout.core.widgets.Placeholder mPlaceholder;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer container, androidx.constraintlayout.core.widgets.Helper helper, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> map) {
    }

    public MotionPlaceholder(android.content.Context context) {
        super(context);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        onMeasure(this.mPlaceholder, widthMeasureSpec, heightMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout != null) {
            layout.measure(mode, size, mode2, size2);
            setMeasuredDimension(layout.getMeasuredWidth(), layout.getMeasuredHeight());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        this.mHelperWidget = new androidx.constraintlayout.core.widgets.Placeholder();
        validateParams();
    }
}
