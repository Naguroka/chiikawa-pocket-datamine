package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends androidx.constraintlayout.widget.ConstraintHelper implements androidx.constraintlayout.motion.widget.MotionHelperInterface {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    protected android.view.View[] views;

    public boolean isDecorator() {
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(android.graphics.Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(android.graphics.Canvas canvas) {
    }

    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> controllerMap) {
    }

    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress) {
    }

    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
    }

    public void setProgress(android.view.View view, float progress) {
    }

    public MotionHelper(android.content.Context context) {
        super(context);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
    }

    public MotionHelper(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attrs);
    }

    public MotionHelper(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attrs);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionHelper_onShow) {
                    this.mUseOnShow = typedArrayObtainStyledAttributes.getBoolean(index, this.mUseOnShow);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionHelper_onHide) {
                    this.mUseOnHide = typedArrayObtainStyledAttributes.getBoolean(index, this.mUseOnHide);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
        return this.mUseOnShow;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
        return this.mUseOnHide;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.mProgress;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float progress) {
        this.mProgress = progress;
        int i = 0;
        if (this.mCount > 0) {
            this.views = getViews((androidx.constraintlayout.widget.ConstraintLayout) getParent());
            while (i < this.mCount) {
                setProgress(this.views[i], progress);
                i++;
            }
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof androidx.constraintlayout.motion.widget.MotionHelper)) {
                setProgress(childAt, progress);
            }
            i++;
        }
    }
}
