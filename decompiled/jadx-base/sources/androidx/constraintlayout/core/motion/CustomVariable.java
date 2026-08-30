package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: classes.dex */
public class CustomVariable {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private int mType;

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    public androidx.constraintlayout.core.motion.CustomVariable copy() {
        return new androidx.constraintlayout.core.motion.CustomVariable(this);
    }

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable customVariable) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        this.mIntegerValue = customVariable.mIntegerValue;
        this.mFloatValue = customVariable.mFloatValue;
        this.mStringValue = customVariable.mStringValue;
        this.mBooleanValue = customVariable.mBooleanValue;
    }

    public CustomVariable(java.lang.String str, int i, java.lang.String str2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mName = str;
        this.mType = i;
        this.mStringValue = str2;
    }

    public CustomVariable(java.lang.String str, int i, int i2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        if (i == 901) {
            this.mFloatValue = i2;
        } else {
            this.mIntegerValue = i2;
        }
    }

    public CustomVariable(java.lang.String str, int i, float f) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        this.mFloatValue = f;
    }

    public CustomVariable(java.lang.String str, int i, boolean z) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        this.mBooleanValue = z;
    }

    public static java.lang.String colorString(int i) {
        java.lang.String str = "00000000" + java.lang.Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public java.lang.String toString() {
        java.lang.String str = this.mName + ':';
        switch (this.mType) {
            case 900:
                return str + this.mIntegerValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return str + this.mFloatValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                return str + colorString(this.mIntegerValue);
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                return str + this.mStringValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return str + java.lang.Boolean.valueOf(this.mBooleanValue);
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return str + this.mFloatValue;
            default:
                return str + "????";
        }
    }

    public int getType() {
        return this.mType;
    }

    public boolean getBooleanValue() {
        return this.mBooleanValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public int getColorValue() {
        return this.mIntegerValue;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public java.lang.String getStringValue() {
        return this.mStringValue;
    }

    public boolean isContinuous() {
        int i = this.mType;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setBooleanValue(boolean z) {
        this.mBooleanValue = z;
    }

    public void setIntValue(int i) {
        this.mIntegerValue = i;
    }

    public void setStringValue(java.lang.String str) {
        this.mStringValue = str;
    }

    public int numberOfInterpolatedValues() {
        return this.mType != 902 ? 1 : 4;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case 900:
                return this.mIntegerValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return this.mFloatValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                throw new java.lang.RuntimeException("Color does not have a single color to interpolate");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case 900:
                fArr[0] = this.mIntegerValue;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                fArr[0] = this.mFloatValue;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                int i = this.mIntegerValue;
                int i2 = (i >> 24) & 255;
                float fPow = (float) java.lang.Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) java.lang.Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) java.lang.Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (this.mType) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.mIntegerValue = (int) fArr[0];
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = fArr[0];
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.mIntegerValue = ((java.lang.Math.round(fArr[3] * 255.0f) & 255) << 24) | ((java.lang.Math.round(((float) java.lang.Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((java.lang.Math.round(((float) java.lang.Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (java.lang.Math.round(((float) java.lang.Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new java.lang.RuntimeException("Cannot interpolate String");
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public boolean diff(androidx.constraintlayout.core.motion.CustomVariable customVariable) {
        int i;
        if (customVariable == null || (i = this.mType) != customVariable.mType) {
            return false;
        }
        switch (i) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                return this.mIntegerValue == customVariable.mIntegerValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                return this.mFloatValue == customVariable.mFloatValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                return this.mIntegerValue == customVariable.mIntegerValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                return this.mIntegerValue == customVariable.mIntegerValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return this.mBooleanValue == customVariable.mBooleanValue;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.mFloatValue == customVariable.mFloatValue;
            default:
                return false;
        }
    }

    public CustomVariable(java.lang.String str, int i) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
    }

    public CustomVariable(java.lang.String str, int i, java.lang.Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        setValue(obj);
    }

    public CustomVariable(androidx.constraintlayout.core.motion.CustomVariable customVariable, java.lang.Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        setValue(obj);
    }

    public void setValue(java.lang.Object obj) {
        switch (this.mType) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.mIntegerValue = ((java.lang.Integer) obj).intValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                this.mFloatValue = ((java.lang.Float) obj).floatValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                this.mIntegerValue = ((java.lang.Integer) obj).intValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                this.mStringValue = (java.lang.String) obj;
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.mBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = ((java.lang.Float) obj).floatValue();
                break;
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public void setInterpolatedValue(androidx.constraintlayout.core.motion.MotionWidget motionWidget, float[] fArr) {
        int i = this.mType;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.mName, i, (int) fArr[0]);
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i, fArr[0]);
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                motionWidget.setCustomAttribute(this.mName, this.mType, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                throw new java.lang.RuntimeException("unable to interpolate " + this.mName);
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.mName, i, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f2 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public void applyToWidget(androidx.constraintlayout.core.motion.MotionWidget motionWidget) {
        int i = this.mType;
        switch (i) {
            case 900:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.mName, i, this.mIntegerValue);
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i, this.mFloatValue);
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.mName, i, this.mStringValue);
                break;
            case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.mName, i, this.mBooleanValue);
                break;
        }
    }

    public java.lang.String getName() {
        return this.mName;
    }
}
