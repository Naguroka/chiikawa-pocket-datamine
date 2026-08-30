package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintReference implements androidx.constraintlayout.core.state.Reference {
    private java.lang.Object key;
    private float mCircularAngle;
    private float mCircularDistance;
    private androidx.constraintlayout.core.widgets.ConstraintWidget mConstraintWidget;
    final androidx.constraintlayout.core.state.State mState;
    private java.lang.Object mView;
    java.lang.String mTag = null;
    androidx.constraintlayout.core.state.helpers.Facade mFacade = null;
    int mHorizontalChainStyle = 0;
    int mVerticalChainStyle = 0;
    float mHorizontalChainWeight = -1.0f;
    float mVerticalChainWeight = -1.0f;
    float mHorizontalBias = 0.5f;
    float mVerticalBias = 0.5f;
    protected int mMarginLeft = 0;
    protected int mMarginRight = 0;
    protected int mMarginStart = 0;
    protected int mMarginEnd = 0;
    protected int mMarginTop = 0;
    protected int mMarginBottom = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginTopGone = 0;
    protected int mMarginBottomGone = 0;
    int mMarginBaseline = 0;
    int mMarginBaselineGone = 0;
    float mPivotX = Float.NaN;
    float mPivotY = Float.NaN;
    float mRotationX = Float.NaN;
    float mRotationY = Float.NaN;
    float mRotationZ = Float.NaN;
    float mTranslationX = Float.NaN;
    float mTranslationY = Float.NaN;
    float mTranslationZ = Float.NaN;
    float mAlpha = Float.NaN;
    float mScaleX = Float.NaN;
    float mScaleY = Float.NaN;
    int mVisibility = 0;
    protected java.lang.Object mLeftToLeft = null;
    protected java.lang.Object mLeftToRight = null;
    protected java.lang.Object mRightToLeft = null;
    protected java.lang.Object mRightToRight = null;
    protected java.lang.Object mStartToStart = null;
    protected java.lang.Object mStartToEnd = null;
    protected java.lang.Object mEndToStart = null;
    protected java.lang.Object mEndToEnd = null;
    protected java.lang.Object mTopToTop = null;
    protected java.lang.Object mTopToBottom = null;
    protected java.lang.Object mBottomToTop = null;
    protected java.lang.Object mBottomToBottom = null;
    java.lang.Object mBaselineToBaseline = null;
    java.lang.Object mBaselineToTop = null;
    java.lang.Object mBaselineToBottom = null;
    java.lang.Object mCircularConstraint = null;
    androidx.constraintlayout.core.state.State.Constraint mLast = null;
    androidx.constraintlayout.core.state.Dimension mHorizontalDimension = androidx.constraintlayout.core.state.Dimension.Fixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
    androidx.constraintlayout.core.state.Dimension mVerticalDimension = androidx.constraintlayout.core.state.Dimension.Fixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
    private java.util.HashMap<java.lang.String, java.lang.Integer> mCustomColors = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, java.lang.Float> mCustomFloats = new java.util.HashMap<>();

    public interface ConstraintReferenceFactory {
        androidx.constraintlayout.core.state.ConstraintReference create(androidx.constraintlayout.core.state.State state);
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object obj) {
        this.key = obj;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
        return this.key;
    }

    public void setTag(java.lang.String str) {
        this.mTag = str;
    }

    public java.lang.String getTag() {
        return this.mTag;
    }

    public void setView(java.lang.Object obj) {
        this.mView = obj;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public java.lang.Object getView() {
        return this.mView;
    }

    public void setFacade(androidx.constraintlayout.core.state.helpers.Facade facade) {
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
        return this.mFacade;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.mConstraintWidget = constraintWidget;
        constraintWidget.setCompanionWidget(this.mView);
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidgetCreateConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = constraintWidgetCreateConstraintWidget;
            constraintWidgetCreateConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget createConstraintWidget() {
        return new androidx.constraintlayout.core.widgets.ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    static class IncorrectConstraintException extends java.lang.Exception {
        private final java.util.ArrayList<java.lang.String> mErrors;

        public IncorrectConstraintException(java.util.ArrayList<java.lang.String> arrayList) {
            this.mErrors = arrayList;
        }

        public java.util.ArrayList<java.lang.String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    public void validate() throws androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException(arrayList);
        }
    }

    private java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof androidx.constraintlayout.core.state.ConstraintReference) ? this.mState.reference(obj) : obj;
    }

    public ConstraintReference(androidx.constraintlayout.core.state.State state) {
        this.mState = state;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle(int i) {
        return this.mVerticalChainStyle;
    }

    public float getHorizontalChainWeight() {
        return this.mHorizontalChainWeight;
    }

    public void setHorizontalChainWeight(float f) {
        this.mHorizontalChainWeight = f;
    }

    public float getVerticalChainWeight() {
        return this.mVerticalChainWeight;
    }

    public void setVerticalChainWeight(float f) {
        this.mVerticalChainWeight = f;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public float getTranslationX() {
        return this.mTranslationX;
    }

    public float getTranslationY() {
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getPivotX() {
        return this.mPivotX;
    }

    public float getPivotY() {
        return this.mPivotY;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotX(float f) {
        this.mPivotX = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotY(float f) {
        this.mPivotY = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationX(float f) {
        this.mRotationX = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationY(float f) {
        this.mRotationY = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationZ(float f) {
        this.mRotationZ = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationX(float f) {
        this.mTranslationX = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationY(float f) {
        this.mTranslationY = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationZ(float f) {
        this.mTranslationZ = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleX(float f) {
        this.mScaleX = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleY(float f) {
        this.mScaleY = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference alpha(float f) {
        this.mAlpha = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference visibility(int i) {
        this.mVisibility = i;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.START_TO_START;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.START_TO_END;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.END_TO_START;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.END_TO_END;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.mLast = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baseline() {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public void addCustomColor(java.lang.String str, int i) {
        this.mCustomColors.put(str, java.lang.Integer.valueOf(i));
    }

    public void addCustomFloat(java.lang.String str, float f) {
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new java.util.HashMap<>();
        }
        this.mCustomFloats.put(str, java.lang.Float.valueOf(f));
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToLeft(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToRight(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToLeft(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToRight(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToStart(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToEnd(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToStart(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToEnd(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToTop(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToBottom(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToTop(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToBottom(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBaseline(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToTop(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBottom(java.lang.Object obj) {
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerHorizontally(java.lang.Object obj) {
        java.lang.Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerVertically(java.lang.Object obj) {
        java.lang.Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference circularConstraint(java.lang.Object obj, float f, float f2) {
        this.mCircularConstraint = get(obj);
        this.mCircularAngle = f;
        this.mCircularDistance = f2;
        this.mLast = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference width(androidx.constraintlayout.core.state.Dimension dimension) {
        return setWidth(dimension);
    }

    public androidx.constraintlayout.core.state.ConstraintReference height(androidx.constraintlayout.core.state.Dimension dimension) {
        return setHeight(dimension);
    }

    public androidx.constraintlayout.core.state.Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public androidx.constraintlayout.core.state.ConstraintReference setWidth(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public androidx.constraintlayout.core.state.ConstraintReference setHeight(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object obj) {
        return margin(this.mState.convertDimension(obj));
    }

    public androidx.constraintlayout.core.state.ConstraintReference marginGone(java.lang.Object obj) {
        return marginGone(this.mState.convertDimension(obj));
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Constraint.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public androidx.constraintlayout.core.state.ConstraintReference margin(int i) {
        if (this.mLast != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[this.mLast.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTop = i;
                    break;
                case 11:
                case 12:
                    this.mMarginBottom = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaseline = i;
                    break;
                case 16:
                    this.mCircularDistance = i;
                    break;
            }
        } else {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
            this.mMarginBottom = i;
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public androidx.constraintlayout.core.state.ConstraintReference marginGone(int i) {
        if (this.mLast != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[this.mLast.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTopGone = i;
                    break;
                case 11:
                case 12:
                    this.mMarginBottomGone = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaselineGone = i;
                    break;
            }
        } else {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
            this.mMarginBottomGone = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference horizontalBias(float f) {
        this.mHorizontalBias = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference verticalBias(float f) {
        this.mVerticalBias = f;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public androidx.constraintlayout.core.state.ConstraintReference bias(float f) {
        if (this.mLast == null) {
            return this;
        }
        int i = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[this.mLast.ordinal()];
        if (i == 17) {
            this.mHorizontalBias = f;
        } else if (i != 18) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.mHorizontalBias = f;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    this.mVerticalBias = f;
                    break;
            }
        } else {
            this.mVerticalBias = f;
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public androidx.constraintlayout.core.state.ConstraintReference clear() {
        if (this.mLast != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[this.mLast.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 11:
                case 12:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case 15:
                    this.mBaselineToBaseline = null;
                    break;
                case 16:
                    this.mCircularConstraint = null;
                    break;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mCircularConstraint = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
            this.mMarginBottomGone = 0;
        }
        return this;
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getTarget(java.lang.Object obj) {
        if (obj instanceof androidx.constraintlayout.core.state.Reference) {
            return ((androidx.constraintlayout.core.state.Reference) obj).getConstraintWidget();
        }
        return null;
    }

    private void applyConnection(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.lang.Object obj, androidx.constraintlayout.core.state.State.Constraint constraint) {
        androidx.constraintlayout.core.widgets.ConstraintWidget target = getTarget(obj);
        if (target == null) {
        }
        int i = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()];
        switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
            case 1:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 2:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 3:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 4:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 5:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 6:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 7:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 8:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 9:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 10:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 11:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 12:
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 13:
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, target, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
            case 14:
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, target, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
            case 15:
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, target, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
            case 16:
                constraintWidget.connectCircularConstraint(target, this.mCircularAngle, (int) this.mCircularDistance);
                break;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.mConstraintWidget == null) {
            return;
        }
        androidx.constraintlayout.core.state.helpers.Facade facade = this.mFacade;
        if (facade != null) {
            facade.apply();
        }
        this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
        this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
        dereference();
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mRightToRight, androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mStartToStart, androidx.constraintlayout.core.state.State.Constraint.START_TO_START);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, androidx.constraintlayout.core.state.State.Constraint.START_TO_END);
        applyConnection(this.mConstraintWidget, this.mEndToStart, androidx.constraintlayout.core.state.State.Constraint.END_TO_START);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, androidx.constraintlayout.core.state.State.Constraint.END_TO_END);
        applyConnection(this.mConstraintWidget, this.mTopToTop, androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.mHorizontalChainStyle;
        if (i != 0) {
            this.mConstraintWidget.setHorizontalChainStyle(i);
        }
        int i2 = this.mVerticalChainStyle;
        if (i2 != 0) {
            this.mConstraintWidget.setVerticalChainStyle(i2);
        }
        float f = this.mHorizontalChainWeight;
        if (f != -1.0f) {
            this.mConstraintWidget.setHorizontalWeight(f);
        }
        float f2 = this.mVerticalChainWeight;
        if (f2 != -1.0f) {
            this.mConstraintWidget.setVerticalWeight(f2);
        }
        this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
        this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
        this.mConstraintWidget.frame.pivotX = this.mPivotX;
        this.mConstraintWidget.frame.pivotY = this.mPivotY;
        this.mConstraintWidget.frame.rotationX = this.mRotationX;
        this.mConstraintWidget.frame.rotationY = this.mRotationY;
        this.mConstraintWidget.frame.rotationZ = this.mRotationZ;
        this.mConstraintWidget.frame.translationX = this.mTranslationX;
        this.mConstraintWidget.frame.translationY = this.mTranslationY;
        this.mConstraintWidget.frame.translationZ = this.mTranslationZ;
        this.mConstraintWidget.frame.scaleX = this.mScaleX;
        this.mConstraintWidget.frame.scaleY = this.mScaleY;
        this.mConstraintWidget.frame.alpha = this.mAlpha;
        this.mConstraintWidget.frame.visibility = this.mVisibility;
        this.mConstraintWidget.setVisibility(this.mVisibility);
        java.util.HashMap<java.lang.String, java.lang.Integer> map = this.mCustomColors;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, this.mCustomColors.get(str).intValue());
            }
        }
        java.util.HashMap<java.lang.String, java.lang.Float> map2 = this.mCustomFloats;
        if (map2 != null) {
            for (java.lang.String str2 : map2.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str2, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT, this.mCustomFloats.get(str2).floatValue());
            }
        }
    }
}
