package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public androidx.constraintlayout.core.state.WidgetFrame frame;
    private boolean hasBaseline;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun horizontalChainRun;
    public int horizontalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenter;
    androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterX;
    androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private java.lang.Object mCompanionWidget;
    private int mContainerItemSkip;
    private java.lang.String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    androidx.constraintlayout.core.widgets.ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private java.lang.String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    androidx.constraintlayout.core.widgets.ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;
    protected int mX;
    protected int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] run;
    public java.lang.String stringId;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun verticalChainRun;
    public int verticalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.mY = i;
    }

    public void resetSolvingPassFlag() {
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.horizontalSolvingPass;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.verticalSolvingPass;
    }

    public void markHorizontalSolvingPassDone() {
        this.horizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.verticalSolvingPass = true;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.resolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.resolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight + i2;
            this.mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        if (i == 0) {
            return this.mLeft.mTarget != null && this.mLeft.mTarget.hasFinalValue() && this.mRight.mTarget != null && this.mRight.mTarget.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2;
        }
        return this.mTop.mTarget != null && this.mTop.mTarget.hasFinalValue() && this.mBottom.mTarget != null && this.mBottom.mTarget.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2;
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtualLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    protected void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public boolean isInBarrier(int i) {
        return this.mIsInBarrier[i];
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    private void serializeAnchor(java.lang.StringBuilder sb, java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(constraintAnchor.mGoneMargin);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeCircle(java.lang.StringBuilder sb, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(f);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeAttribute(java.lang.StringBuilder sb, java.lang.String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void serializeAttribute(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void serializeDimensionRatio(java.lang.StringBuilder sb, java.lang.String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    private void serializeSize(java.lang.StringBuilder sb, java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "size", i, Integer.MIN_VALUE);
        serializeAttribute(sb, "min", i2, 0);
        serializeAttribute(sb, com.applovin.sdk.AppLovinMediationProvider.MAX, i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "matchMin", i5, 0);
        serializeAttribute(sb, "matchDef", i6, 0);
        serializeAttribute(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb) {
        sb.append("{\n");
        serializeAnchor(sb, androidx.media3.extractor.text.ttml.TtmlNode.LEFT, this.mLeft);
        serializeAnchor(sb, "top", this.mTop);
        serializeAnchor(sb, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, this.mRight);
        serializeAnchor(sb, "bottom", this.mBottom);
        serializeAnchor(sb, "baseline", this.mBaseline);
        serializeAnchor(sb, "centerX", this.mCenterX);
        serializeAnchor(sb, "centerY", this.mCenterY);
        serializeCircle(sb, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb, "width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb, "height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c = i == 0 ? (char) 1 : (char) 0;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        return dimensionBehaviourArr[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviourArr[c] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(java.lang.String str) {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(java.lang.String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun(this);
        }
    }

    public ConstraintWidget(java.lang.String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public void resetSolverVariables(androidx.constraintlayout.core.Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public java.lang.String getType() {
        return this.mType;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public java.lang.String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(java.lang.String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(androidx.constraintlayout.core.LinearSystem linearSystem, java.lang.String str) {
        this.mDebugName = str;
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void createObjectVariables(androidx.constraintlayout.core.LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public java.lang.String toString() {
        return (this.mType != null ? "type: " + this.mType + " " : "") + (this.mDebugName != null ? "id: " + this.mDebugName + " " : "") + "(" + this.mX + ", " + this.mY + ") - (" + this.mWidth + " x " + this.mHeight + ")";
    }

    public int getX() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i = this.mWidth;
        if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = java.lang.Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.mWidth = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxWidth;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = java.lang.Math.max(this.mMatchConstraintMinHeight, i);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.mHeight = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxHeight;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? 0 + constraintAnchor.mMargin : 0;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? 0 + this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public java.lang.Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, int i) {
        int i2 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
            return;
        }
        if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        } else {
            if (i2 != 5) {
                return;
            }
            this.mBaseline.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(java.lang.String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            java.lang.String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST)) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                java.lang.String strSubstring2 = str.substring(i2, iIndexOf2);
                java.lang.String strSubstring3 = str.substring(iIndexOf2 + 1);
                if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = java.lang.Float.parseFloat(strSubstring2);
                    float f2 = java.lang.Float.parseFloat(strSubstring3);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else if (i3 == 1) {
                        fAbs = java.lang.Math.abs(f2 / f);
                    } else {
                        fAbs = java.lang.Math.abs(f / f2);
                    }
                }
            } else {
                java.lang.String strSubstring4 = str.substring(i2);
                if (strSubstring4.length() > 0) {
                    fAbs = java.lang.Float.parseFloat(strSubstring4);
                } else {
                    fAbs = i;
                }
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i3;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
        if (this.mMatchConstraintMaxWidth > 0 && this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = java.lang.Math.min(this.mWidth, this.mMatchConstraintMaxWidth);
        }
        if (this.mMatchConstraintMaxHeight > 0 && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = java.lang.Math.min(this.mHeight, this.mMatchConstraintMaxHeight);
        }
        int i11 = this.mWidth;
        if (i7 != i11) {
            this.mWidthOverride = i11;
        }
        int i12 = this.mHeight;
        if (i8 != i12) {
            this.mHeightOverride = i12;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(java.lang.Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
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

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER) {
            if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) {
                connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X && (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT)) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y && (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM)) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X && type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X) {
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y && type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor9 = getAnchor(type);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor11 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor12 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor13 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor14 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor opposite = getAnchor(type).getOpposite();
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor15 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor16 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor17 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        switch (androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new java.lang.AssertionError(type.name());
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.core.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.core.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
            androidx.constraintlayout.core.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.core.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15691. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    boolean addFirst() {
        return (this instanceof androidx.constraintlayout.core.widgets.VirtualLayout) || (this instanceof androidx.constraintlayout.core.widgets.Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:103:0x017f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03be  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:251:0x0406  */
    /* JADX WARN: Code duplicated, block: B:258:0x041f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0441  */
    /* JADX WARN: Code duplicated, block: B:277:0x0459  */
    /* JADX WARN: Code duplicated, block: B:280:0x045f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x046c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0472  */
    /* JADX WARN: Code duplicated, block: B:292:0x0476  */
    /* JADX WARN: Code duplicated, block: B:295:0x047b  */
    /* JADX WARN: Code duplicated, block: B:297:0x047f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0482  */
    /* JADX WARN: Code duplicated, block: B:302:0x0489  */
    /* JADX WARN: Code duplicated, block: B:304:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x0497  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:314:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:316:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:318:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:326:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    private void applyConstraints(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, boolean z5, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable;
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable2;
        boolean z15;
        int i16;
        char c;
        int i17;
        int i18;
        int i19;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i20;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        boolean z20;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        int iMax;
        int i21;
        int i22;
        int margin;
        int iMin2;
        int i23;
        int i24;
        boolean z21;
        int i25;
        int i26;
        int i27;
        boolean z22;
        int i28;
        boolean z23;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3;
        int i29;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4;
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (androidx.constraintlayout.core.LinearSystem.getMetrics() != null) {
            androidx.constraintlayout.core.LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i30 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i30++;
        }
        int i31 = z6 ? 3 : i5;
        int i32 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i32 != 1 && i32 != 2 && i32 != 3 && i32 == 4) {
            i9 = i31;
            z12 = i9 != 4;
            iMin = this.mWidthOverride;
            if (iMin == -1 && z) {
                this.mWidthOverride = -1;
                z12 = false;
            } else {
                iMin = i2;
            }
            i10 = this.mHeightOverride;
            if (i10 != -1 && !z) {
                this.mHeightOverride = -1;
                iMin = i10;
                z12 = false;
            }
            if (this.mVisibility == 8) {
                iMin = 0;
                z12 = false;
            }
            if (z11) {
                if (zIsConnected && !zIsConnected2 && !zIsConnected3) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, i);
                } else if (zIsConnected && !zIsConnected2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                }
            }
            if (!z12) {
                if (z5) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
                    if (i3 > 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i3, 8);
                    }
                    if (i4 < Integer.MAX_VALUE) {
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i4, 8);
                    }
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                }
                i12 = i8;
                i14 = i30;
                z13 = z12;
                z14 = z4;
                i15 = i7;
            } else if (i30 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                int iMax2 = java.lang.Math.max(i7, iMin);
                if (i8 > 0) {
                    iMax2 = java.lang.Math.min(i8, iMax2);
                }
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax2, 8);
                z14 = z4;
                i12 = i8;
                i14 = i30;
                z13 = false;
                i15 = i7;
            } else {
                if (i7 == -2) {
                    i11 = iMin;
                } else {
                    i11 = i7;
                }
                if (i8 == -2) {
                    i12 = iMin;
                } else {
                    i12 = i8;
                }
                if (iMin > 0 && i9 != 1) {
                    iMin = 0;
                }
                if (i11 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                    iMin = java.lang.Math.max(iMin, i11);
                }
                if (i12 > 0) {
                    if (z2 || i9 != 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i13 = 8;
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                    } else {
                        i13 = 8;
                    }
                    iMin = java.lang.Math.min(iMin, i12);
                } else {
                    i13 = 8;
                }
                if (i9 == 1) {
                    if (z2) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                    } else if (z8) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                    }
                    i14 = i30;
                    z13 = z12;
                    z14 = z4;
                    i15 = i11;
                } else if (i9 == 2) {
                    if (constraintAnchor.getType() != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || constraintAnchor.getType() == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
                    }
                    androidx.constraintlayout.core.SolverVariable solverVariable3 = solverVariableCreateObjectVariable;
                    androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = linearSystem.createRow();
                    i14 = i30 == true ? 1 : 0;
                    i15 = i11;
                    linearSystem.addConstraint(arrayRowCreateRow.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable3, f2));
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z12;
                    z14 = z4;
                } else {
                    i14 = i30;
                    i15 = i11;
                    z13 = z12;
                    z14 = true;
                }
            }
            if (z11 || z8) {
                i16 = 0;
                c = 2;
                if (i14 >= c && z2 && z14) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, i16, 8);
                    int i33 = (z || this.mBaseline.mTarget == null) ? 1 : i16;
                    if (z || this.mBaseline.mTarget == null) {
                        i17 = i33;
                    } else {
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.mBaseline.mTarget.mOwner;
                        i17 = (constraintWidget5.mDimensionRatio != 0.0f && constraintWidget5.mListDimensionBehaviors[i16] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget5.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) ? 1 : i16;
                    }
                    if (i17 != 0) {
                        linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, i16, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zIsConnected || zIsConnected2 || zIsConnected3) {
                if (!zIsConnected || zIsConnected2) {
                    if (zIsConnected || !zIsConnected2) {
                        if (zIsConnected && zIsConnected2) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = constraintAnchor.mTarget.mOwner;
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = constraintAnchor2.mTarget.mOwner;
                            androidx.constraintlayout.core.widgets.ConstraintWidget parent = getParent();
                            int i34 = 6;
                            if (!z13) {
                                if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                    linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), 8);
                                    if (z2 && z14) {
                                        int margin2 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                        if (solverVariableCreateObjectVariable6 != solverVariable2) {
                                            linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin2, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (i9 == 0) {
                                    if (i12 != 0 || i15 != 0) {
                                        z22 = false;
                                        i26 = 5;
                                        i28 = 5;
                                        z23 = true;
                                        z16 = true;
                                    } else if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                                        return;
                                    } else {
                                        z23 = false;
                                        z16 = false;
                                        i26 = 8;
                                        i28 = 8;
                                        z22 = true;
                                    }
                                    if ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                        solverVariable2 = solverVariable2;
                                        i18 = i26;
                                        i34 = 6;
                                        z18 = z22;
                                        z17 = z23;
                                        i19 = 4;
                                    } else {
                                        z18 = z22;
                                        z17 = z23;
                                        i19 = i28;
                                        i18 = i26;
                                        i34 = 6;
                                    }
                                } else if (i9 == 2) {
                                    if (!(constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) && !(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                        solverVariable2 = solverVariable2;
                                        i34 = 6;
                                        i18 = 5;
                                        i19 = 5;
                                    }
                                    z17 = true;
                                    z16 = true;
                                    z18 = false;
                                } else if (i9 == 1) {
                                    i18 = 8;
                                    i19 = 4;
                                    z17 = true;
                                    z16 = true;
                                    z18 = false;
                                } else if (i9 == 3) {
                                    if (this.mResolvedDimensionRatioSide == -1) {
                                        if (z9) {
                                            solverVariable2 = solverVariable2;
                                            i34 = z2 ? 5 : 4;
                                        } else {
                                            solverVariable2 = solverVariable2;
                                            i34 = 8;
                                        }
                                        i18 = 8;
                                    } else if (z6) {
                                        if (i6 == 2 || i6 == 1) {
                                            i26 = 5;
                                            i27 = 4;
                                        } else {
                                            i26 = 8;
                                            i27 = 5;
                                        }
                                        i19 = i27;
                                        z17 = true;
                                        z16 = true;
                                        z18 = true;
                                        i18 = i26;
                                        i34 = 6;
                                    } else {
                                        if (i12 > 0) {
                                            solverVariable2 = solverVariable2;
                                            i34 = 6;
                                            i18 = 5;
                                        } else {
                                            if (i12 != 0 || i15 != 0) {
                                                i18 = 5;
                                            } else if (z9) {
                                                i18 = (constraintWidget6 == parent || constraintWidget7 == parent) ? 5 : 4;
                                            } else {
                                                solverVariable2 = solverVariable2;
                                                i34 = 6;
                                                i18 = 5;
                                                i19 = 8;
                                            }
                                            i19 = 4;
                                        }
                                        z17 = true;
                                        z16 = true;
                                        z18 = true;
                                    }
                                    i19 = 5;
                                    z17 = true;
                                    z16 = true;
                                    z18 = true;
                                } else {
                                    solverVariable2 = solverVariable2;
                                    i34 = 6;
                                    i18 = 5;
                                    i19 = 4;
                                    z17 = false;
                                    z16 = false;
                                    z18 = false;
                                }
                                if (z16 || solverVariableCreateObjectVariable5 != solverVariableCreateObjectVariable6 || constraintWidget6 == parent) {
                                    z19 = true;
                                } else {
                                    z16 = false;
                                    z19 = false;
                                }
                                if (z17) {
                                    if (z13 && !z7 && !z9 && solverVariableCreateObjectVariable5 == solverVariable && solverVariableCreateObjectVariable6 == solverVariable2) {
                                        z20 = false;
                                        i25 = 8;
                                        i24 = 8;
                                        z21 = false;
                                    } else {
                                        z20 = z2;
                                        i24 = i34;
                                        z21 = z19;
                                        i25 = i18;
                                    }
                                    i20 = i9;
                                    constraintWidget = parent;
                                    linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i24);
                                    i18 = i25;
                                    z19 = z21;
                                } else {
                                    i20 = i9;
                                    constraintWidget = parent;
                                    z20 = z2;
                                }
                                if (this.mVisibility != 8 && !constraintAnchor2.hasDependents()) {
                                    return;
                                }
                                if (z16) {
                                    if (z20 && solverVariableCreateObjectVariable5 != solverVariableCreateObjectVariable6 && !z13 && ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier))) {
                                        i18 = 6;
                                    }
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i18);
                                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i18);
                                } else {
                                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                }
                                if (z20 || !z10 || (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                    constraintWidget2 = constraintWidget;
                                } else {
                                    constraintWidget2 = constraintWidget;
                                    if (constraintWidget7 != constraintWidget2) {
                                        i18 = 6;
                                        iMax = 6;
                                        z19 = true;
                                    }
                                    if (z19) {
                                        if (z18 && (!z9 || z3)) {
                                            if (constraintWidget6 != constraintWidget2 || constraintWidget7 == constraintWidget2) {
                                                i23 = 6;
                                            } else {
                                                i23 = iMax;
                                            }
                                            if ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Guideline) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                                                i23 = 5;
                                            }
                                            if ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                                i23 = 5;
                                            }
                                            if (z9) {
                                                i23 = 5;
                                            }
                                            iMax = java.lang.Math.max(i23, iMax);
                                        }
                                        if (z20) {
                                            iMin2 = java.lang.Math.min(i18, iMax);
                                            if (z6 || z9 || !(constraintWidget6 == constraintWidget2 || constraintWidget7 == constraintWidget2)) {
                                                iMax = iMin2;
                                            } else {
                                                iMax = 4;
                                            }
                                        }
                                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                    }
                                    if (z20) {
                                        if (solverVariable == solverVariableCreateObjectVariable5) {
                                            margin = constraintAnchor.getMargin();
                                        } else {
                                            margin = 0;
                                        }
                                        if (solverVariableCreateObjectVariable5 != solverVariable) {
                                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                        }
                                    }
                                    if (z20 || !z13 || i3 != 0 || i15 != 0) {
                                        i21 = 5;
                                        i22 = 0;
                                    } else if (z13 && i20 == 3) {
                                        i22 = 0;
                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 8);
                                        i21 = 5;
                                    } else {
                                        i22 = 0;
                                        i21 = 5;
                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 5);
                                    }
                                }
                                iMax = i19;
                                if (z19) {
                                    if (z18) {
                                        if (constraintWidget6 != constraintWidget2) {
                                            i23 = 6;
                                        } else {
                                            i23 = 6;
                                        }
                                        if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                                            i23 = 5;
                                        } else {
                                            i23 = 5;
                                        }
                                        if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                                            i23 = 5;
                                        } else {
                                            i23 = 5;
                                        }
                                        if (z9) {
                                            i23 = 5;
                                        }
                                        iMax = java.lang.Math.max(i23, iMax);
                                    }
                                    if (z20) {
                                        iMin2 = java.lang.Math.min(i18, iMax);
                                        if (z6) {
                                            iMax = iMin2;
                                        } else {
                                            iMax = iMin2;
                                        }
                                    }
                                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                }
                                if (z20) {
                                    if (solverVariable == solverVariableCreateObjectVariable5) {
                                        margin = constraintAnchor.getMargin();
                                    } else {
                                        margin = 0;
                                    }
                                    if (solverVariableCreateObjectVariable5 != solverVariable) {
                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                    }
                                }
                                if (z20) {
                                    i21 = 5;
                                    i22 = 0;
                                } else {
                                    i21 = 5;
                                    i22 = 0;
                                }
                            }
                            i18 = 5;
                            i19 = 4;
                            z17 = true;
                            z16 = true;
                            z18 = false;
                            if (z16) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            if (z17) {
                                if (z13) {
                                    z20 = z2;
                                    i24 = i34;
                                    z21 = z19;
                                    i25 = i18;
                                } else {
                                    z20 = z2;
                                    i24 = i34;
                                    z21 = z19;
                                    i25 = i18;
                                }
                                i20 = i9;
                                constraintWidget = parent;
                                linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i24);
                                i18 = i25;
                                z19 = z21;
                            } else {
                                i20 = i9;
                                constraintWidget = parent;
                                z20 = z2;
                            }
                            if (this.mVisibility != 8) {
                            }
                            if (z16) {
                                if (z20) {
                                    i18 = 6;
                                }
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i18);
                                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i18);
                            } else {
                                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                            }
                            if (z20) {
                                constraintWidget2 = constraintWidget;
                                iMax = i19;
                            } else {
                                constraintWidget2 = constraintWidget;
                                iMax = i19;
                            }
                            if (z19) {
                                if (z18) {
                                    if (constraintWidget6 != constraintWidget2) {
                                        i23 = 6;
                                    } else {
                                        i23 = 6;
                                    }
                                    if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                                        i23 = 5;
                                    } else {
                                        i23 = 5;
                                    }
                                    if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                                        i23 = 5;
                                    } else {
                                        i23 = 5;
                                    }
                                    if (z9) {
                                        i23 = 5;
                                    }
                                    iMax = java.lang.Math.max(i23, iMax);
                                }
                                if (z20) {
                                    iMin2 = java.lang.Math.min(i18, iMax);
                                    if (z6) {
                                        iMax = iMin2;
                                    } else {
                                        iMax = iMin2;
                                    }
                                }
                                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                            }
                            if (z20) {
                                if (solverVariable == solverVariableCreateObjectVariable5) {
                                    margin = constraintAnchor.getMargin();
                                } else {
                                    margin = 0;
                                }
                                if (solverVariableCreateObjectVariable5 != solverVariable) {
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                }
                            }
                            if (z20) {
                                i21 = 5;
                                i22 = 0;
                            } else {
                                i21 = 5;
                                i22 = 0;
                            }
                        }
                        i29 = i21;
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                        if (z2) {
                            if (this.OPTIMIZE_WRAP && solverVariableCreateObjectVariable3.isFinalValue && (constraintWidget3 = this.mParent) != null) {
                                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget3;
                                if (z) {
                                    constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                } else {
                                    constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                                }
                            } else {
                                i21 = 5;
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 5);
                                i22 = 0;
                            }
                        }
                    }
                    i22 = 0;
                    i21 = 5;
                } else {
                    z20 = z2;
                    i22 = 0;
                    i29 = (z2 && (constraintAnchor.mTarget.mOwner instanceof androidx.constraintlayout.core.widgets.Barrier)) ? 8 : 5;
                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                }
                if (z20 || !z14) {
                    return;
                }
                int margin3 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : i22;
                if (solverVariableCreateObjectVariable6 != solverVariable2) {
                    if (this.OPTIMIZE_WRAP && solverVariableCreateObjectVariable4.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget4;
                        if (z) {
                            constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                            return;
                        } else {
                            constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                            return;
                        }
                    }
                    linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin3, i29);
                    return;
                }
                return;
            }
            i21 = 5;
            i22 = 0;
            z20 = z2;
            i29 = i21;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        i9 = i31;
        iMin = this.mWidthOverride;
        if (iMin == -1) {
            iMin = i2;
        } else {
            iMin = i2;
        }
        i10 = this.mHeightOverride;
        if (i10 != -1) {
            this.mHeightOverride = -1;
            iMin = i10;
            z12 = false;
        }
        if (this.mVisibility == 8) {
            iMin = 0;
            z12 = false;
        }
        if (z11) {
            if (zIsConnected) {
                if (zIsConnected) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                }
            } else if (zIsConnected) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
            }
        }
        if (!z12) {
            if (z5) {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
                if (i3 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i4, 8);
                }
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
            }
            i12 = i8;
            i14 = i30;
            z13 = z12;
            z14 = z4;
            i15 = i7;
        } else if (i30 == 2) {
            if (i7 == -2) {
                i11 = iMin;
            } else {
                i11 = i7;
            }
            if (i8 == -2) {
                i12 = iMin;
            } else {
                i12 = i8;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i11 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                iMin = java.lang.Math.max(iMin, i11);
            }
            if (i12 > 0) {
                if (z2) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z15) {
                    i13 = 8;
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                } else {
                    i13 = 8;
                }
                iMin = java.lang.Math.min(iMin, i12);
            } else {
                i13 = 8;
            }
            if (i9 == 1) {
                if (z2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                } else if (z8) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                }
                i14 = i30;
                z13 = z12;
                z14 = z4;
                i15 = i11;
            } else if (i9 == 2) {
                if (constraintAnchor.getType() != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP) {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                }
                androidx.constraintlayout.core.SolverVariable solverVariable4 = solverVariableCreateObjectVariable;
                androidx.constraintlayout.core.ArrayRow arrayRowCreateRow2 = linearSystem.createRow();
                i14 = i30 == true ? 1 : 0;
                i15 = i11;
                linearSystem.addConstraint(arrayRowCreateRow2.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable4, f2));
                if (z2) {
                    z12 = false;
                }
                z13 = z12;
                z14 = z4;
            } else {
                i14 = i30;
                i15 = i11;
                z13 = z12;
                z14 = true;
            }
        } else {
            if (i7 == -2) {
                i11 = iMin;
            } else {
                i11 = i7;
            }
            if (i8 == -2) {
                i12 = iMin;
            } else {
                i12 = i8;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i11 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                iMin = java.lang.Math.max(iMin, i11);
            }
            if (i12 > 0) {
                if (z2) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z15) {
                    i13 = 8;
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                } else {
                    i13 = 8;
                }
                iMin = java.lang.Math.min(iMin, i12);
            } else {
                i13 = 8;
            }
            if (i9 == 1) {
                if (z2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                } else if (z8) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i13);
                }
                i14 = i30;
                z13 = z12;
                z14 = z4;
                i15 = i11;
            } else if (i9 == 2) {
                if (constraintAnchor.getType() != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP) {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                }
                androidx.constraintlayout.core.SolverVariable solverVariable5 = solverVariableCreateObjectVariable;
                androidx.constraintlayout.core.ArrayRow arrayRowCreateRow3 = linearSystem.createRow();
                i14 = i30 == true ? 1 : 0;
                i15 = i11;
                linearSystem.addConstraint(arrayRowCreateRow3.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable5, f2));
                if (z2) {
                    z12 = false;
                }
                z13 = z12;
                z14 = z4;
            } else {
                i14 = i30;
                i15 = i11;
                z13 = z12;
                z14 = true;
            }
        }
        if (z11) {
            i16 = 0;
            c = 2;
        } else {
            i16 = 0;
            c = 2;
        }
        if (i14 >= c) {
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalWidgetRun;
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null && horizontalWidgetRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null && verticalWidgetRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = java.util.Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) java.util.Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zIsResolved = z & this.horizontalRun.isResolved();
        boolean zIsResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zIsResolved) {
            this.mX = i3;
        }
        if (zIsResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void addChildrenToSolverByDependency(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.LinearSystem linearSystem, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    public void getSceneString(java.lang.StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        sb.append("    actualWidth:" + this.mWidth);
        sb.append("\n");
        sb.append("    actualHeight:" + this.mHeight);
        sb.append("\n");
        sb.append("    actualLeft:" + this.mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.mY);
        sb.append("\n");
        getSceneString(sb, androidx.media3.extractor.text.ttml.TtmlNode.LEFT, this.mLeft);
        getSceneString(sb, "top", this.mTop);
        getSceneString(sb, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    private void getSceneString(java.lang.StringBuilder sb, java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      size", i, 0);
        serializeAttribute(sb, "      min", i2, 0);
        serializeAttribute(sb, "      max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "      matchMin", i5, 0);
        serializeAttribute(sb, "      matchDef", i6, 0);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void getSceneString(java.lang.StringBuilder sb, java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
}
