package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends android.view.View {
    private boolean mFilterRedundantCalls;

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(android.content.Context context) {
        super(context);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideBegin == margin) {
            return;
        }
        layoutParams.guideBegin = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int margin) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideEnd == margin) {
            return;
        }
        layoutParams.guideEnd = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float ratio) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guidePercent == ratio) {
            return;
        }
        layoutParams.guidePercent = ratio;
        setLayoutParams(layoutParams);
    }

    public void setFilterRedundantCalls(boolean filter) {
        this.mFilterRedundantCalls = filter;
    }
}
