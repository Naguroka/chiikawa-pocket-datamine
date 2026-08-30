package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Group extends androidx.constraintlayout.widget.ConstraintHelper {
    public Group(android.content.Context context) {
        super(context);
    }

    public Group(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public Group(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        this.mUseViewMeasure = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyLayoutFeatures();
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

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout container) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.widget.setWidth(0);
        layoutParams.widget.setHeight(0);
    }
}
