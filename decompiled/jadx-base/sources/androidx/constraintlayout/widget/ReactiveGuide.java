package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends android.view.View implements androidx.constraintlayout.widget.SharedValues.SharedValuesListener {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(android.content.Context context) {
        super(context);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(null);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    private void init(android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.mAttributeId = typedArrayObtainStyledAttributes.getResourceId(index, this.mAttributeId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.mAnimateChange = typedArrayObtainStyledAttributes.getBoolean(index, this.mAnimateChange);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.mApplyToConstraintSetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mApplyToConstraintSetId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.mApplyToAllConstraintSets = typedArrayObtainStyledAttributes.getBoolean(index, this.mApplyToAllConstraintSets);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mAttributeId != -1) {
            androidx.constraintlayout.widget.ConstraintLayout.getSharedValues().addListener(this.mAttributeId, this);
        }
    }

    public int getAttributeId() {
        return this.mAttributeId;
    }

    public void setAttributeId(int id) {
        androidx.constraintlayout.widget.SharedValues sharedValues = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues();
        int i = this.mAttributeId;
        if (i != -1) {
            sharedValues.removeListener(i, this);
        }
        this.mAttributeId = id;
        if (id != -1) {
            sharedValues.addListener(id, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.mApplyToConstraintSetId;
    }

    public void setApplyToConstraintSetId(int id) {
        this.mApplyToConstraintSetId = id;
    }

    public boolean isAnimatingChange() {
        return this.mAnimateChange;
    }

    public void setAnimateChange(boolean animate) {
        this.mAnimateChange = animate;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int margin) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float ratio) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int key, int newValue, int oldValue) {
        setGuidelineBegin(newValue);
        int id = getId();
        if (id > 0 && (getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout)) {
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout = (androidx.constraintlayout.motion.widget.MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i = this.mApplyToConstraintSetId;
            if (i != 0) {
                currentState = i;
            }
            int i2 = 0;
            if (this.mAnimateChange) {
                if (this.mApplyToAllConstraintSets) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i2 < constraintSetIds.length) {
                        int i3 = constraintSetIds[i2];
                        if (i3 != currentState) {
                            changeValue(newValue, id, motionLayout, i3);
                        }
                        i2++;
                    }
                }
                androidx.constraintlayout.widget.ConstraintSet constraintSetCloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                constraintSetCloneConstraintSet.setGuidelineEnd(id, newValue);
                motionLayout.updateStateAnimate(currentState, constraintSetCloneConstraintSet, 1000);
                return;
            }
            if (this.mApplyToAllConstraintSets) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i2 < constraintSetIds2.length) {
                    changeValue(newValue, id, motionLayout, constraintSetIds2[i2]);
                    i2++;
                }
                return;
            }
            changeValue(newValue, id, motionLayout, currentState);
        }
    }

    private void changeValue(int newValue, int id, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentState) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = motionLayout.getConstraintSet(currentState);
        constraintSet.setGuidelineEnd(id, newValue);
        motionLayout.updateState(currentState, constraintSet);
    }
}
