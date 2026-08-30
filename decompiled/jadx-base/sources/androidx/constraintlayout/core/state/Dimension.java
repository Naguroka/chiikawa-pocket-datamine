package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class Dimension {
    private final int WRAP_CONTENT;
    java.lang.Object mInitialValue;
    boolean mIsSuggested;
    int mMax;
    int mMin;
    float mPercent;
    java.lang.String mRatioString;
    int mValue;
    public static final java.lang.Object FIXED_DIMENSION = new java.lang.Object();
    public static final java.lang.Object WRAP_DIMENSION = new java.lang.Object();
    public static final java.lang.Object SPREAD_DIMENSION = new java.lang.Object();
    public static final java.lang.Object PARENT_DIMENSION = new java.lang.Object();
    public static final java.lang.Object PERCENT_DIMENSION = new java.lang.Object();
    public static final java.lang.Object RATIO_DIMENSION = new java.lang.Object();

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public boolean equalsFixedValue(int i) {
        return this.mInitialValue == null && this.mValue == i;
    }

    private Dimension() {
        this.WRAP_CONTENT = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mInitialValue = WRAP_DIMENSION;
        this.mIsSuggested = false;
    }

    private Dimension(java.lang.Object obj) {
        this.WRAP_CONTENT = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mIsSuggested = false;
        this.mInitialValue = obj;
    }

    public static androidx.constraintlayout.core.state.Dimension Suggested(int i) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension();
        dimension.suggested(i);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension Suggested(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension Fixed(int i) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(FIXED_DIMENSION);
        dimension.fixed(i);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension Fixed(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension Percent(java.lang.Object obj, float f) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension Parent() {
        return new androidx.constraintlayout.core.state.Dimension(PARENT_DIMENSION);
    }

    public static androidx.constraintlayout.core.state.Dimension Wrap() {
        return new androidx.constraintlayout.core.state.Dimension(WRAP_DIMENSION);
    }

    public static androidx.constraintlayout.core.state.Dimension Spread() {
        return new androidx.constraintlayout.core.state.Dimension(SPREAD_DIMENSION);
    }

    public static androidx.constraintlayout.core.state.Dimension Ratio(java.lang.String str) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public androidx.constraintlayout.core.state.Dimension percent(java.lang.Object obj, float f) {
        this.mPercent = f;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension min(int i) {
        if (i >= 0) {
            this.mMin = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension min(java.lang.Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.mMin = -2;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension max(int i) {
        if (this.mMax >= 0) {
            this.mMax = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension max(java.lang.Object obj) {
        java.lang.Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.mIsSuggested) {
            this.mInitialValue = obj2;
            this.mMax = Integer.MAX_VALUE;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension suggested(int i) {
        this.mIsSuggested = true;
        if (i >= 0) {
            this.mMax = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension suggested(java.lang.Object obj) {
        this.mInitialValue = obj;
        this.mIsSuggested = true;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension fixed(java.lang.Object obj) {
        this.mInitialValue = obj;
        if (obj instanceof java.lang.Integer) {
            this.mValue = ((java.lang.Integer) obj).intValue();
            this.mInitialValue = null;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension fixed(int i) {
        this.mInitialValue = null;
        this.mValue = i;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension ratio(java.lang.String str) {
        this.mRatioString = str;
        return this;
    }

    void setValue(int i) {
        this.mIsSuggested = false;
        this.mInitialValue = null;
        this.mValue = i;
    }

    int getValue() {
        return this.mValue;
    }

    public void apply(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        java.lang.String str = this.mRatioString;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.mIsSuggested) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                java.lang.Object obj = this.mInitialValue;
                if (obj == WRAP_DIMENSION) {
                    i2 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i2 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i2, this.mMin, this.mMax, this.mPercent);
                return;
            }
            int i3 = this.mMin;
            if (i3 > 0) {
                constraintWidget.setMinWidth(i3);
            }
            int i4 = this.mMax;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i4);
            }
            java.lang.Object obj2 = this.mInitialValue;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.setWidth(this.mValue);
                    return;
                }
                return;
            }
        }
        if (this.mIsSuggested) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            java.lang.Object obj3 = this.mInitialValue;
            if (obj3 == WRAP_DIMENSION) {
                i2 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i2 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i2, this.mMin, this.mMax, this.mPercent);
            return;
        }
        int i5 = this.mMin;
        if (i5 > 0) {
            constraintWidget.setMinHeight(i5);
        }
        int i6 = this.mMax;
        if (i6 < Integer.MAX_VALUE) {
            constraintWidget.setMaxHeight(i6);
        }
        java.lang.Object obj4 = this.mInitialValue;
        if (obj4 == WRAP_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == PARENT_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(this.mValue);
        }
    }
}
