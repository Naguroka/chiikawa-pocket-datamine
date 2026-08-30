package androidx.constraintlayout.core.state.helpers;

/* JADX INFO: loaded from: classes.dex */
public class GuidelineReference implements androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference {
    private java.lang.Object key;
    private androidx.constraintlayout.core.widgets.Guideline mGuidelineWidget;
    private int mOrientation;
    final androidx.constraintlayout.core.state.State mState;
    private int mStart = -1;
    private int mEnd = -1;
    private float mPercent = 0.0f;

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object obj) {
        this.key = obj;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
        return this.key;
    }

    public GuidelineReference(androidx.constraintlayout.core.state.State state) {
        this.mState = state;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference start(java.lang.Object obj) {
        this.mStart = this.mState.convertDimension(obj);
        this.mEnd = -1;
        this.mPercent = 0.0f;
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference end(java.lang.Object obj) {
        this.mStart = -1;
        this.mEnd = this.mState.convertDimension(obj);
        this.mPercent = 0.0f;
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference percent(float f) {
        this.mStart = -1;
        this.mEnd = -1;
        this.mPercent = f;
        return this;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i = this.mStart;
        if (i != -1) {
            this.mGuidelineWidget.setGuideBegin(i);
            return;
        }
        int i2 = this.mEnd;
        if (i2 != -1) {
            this.mGuidelineWidget.setGuideEnd(i2);
        } else {
            this.mGuidelineWidget.setGuidePercent(this.mPercent);
        }
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
        if (this.mGuidelineWidget == null) {
            this.mGuidelineWidget = new androidx.constraintlayout.core.widgets.Guideline();
        }
        return this.mGuidelineWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
            this.mGuidelineWidget = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
        } else {
            this.mGuidelineWidget = null;
        }
    }
}
