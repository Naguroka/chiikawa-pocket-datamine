package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class WidgetFrame {
    private static final boolean OLD_SYSTEM = true;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustom;
    public java.lang.String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    public void setCustomValue(androidx.constraintlayout.core.motion.CustomAttribute customAttribute, float[] fArr) {
    }

    public int width() {
        return java.lang.Math.max(0, this.right - this.left);
    }

    public int height() {
        return java.lang.Math.max(0, this.bottom - this.top);
    }

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new java.util.HashMap<>();
        this.name = null;
    }

    public WidgetFrame(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new java.util.HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public WidgetFrame(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new java.util.HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    public void updateAttributes(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        this.mCustom.clear();
        if (widgetFrame != null) {
            for (androidx.constraintlayout.core.motion.CustomVariable customVariable : widgetFrame.mCustom.values()) {
                this.mCustom.put(customVariable.getName(), customVariable.copy());
            }
        }
    }

    public boolean isDefaultTransform() {
        return java.lang.Float.isNaN(this.rotationX) && java.lang.Float.isNaN(this.rotationY) && java.lang.Float.isNaN(this.rotationZ) && java.lang.Float.isNaN(this.translationX) && java.lang.Float.isNaN(this.translationY) && java.lang.Float.isNaN(this.translationZ) && java.lang.Float.isNaN(this.scaleX) && java.lang.Float.isNaN(this.scaleY) && java.lang.Float.isNaN(this.alpha);
    }

    public static void interpolate(int i, int i2, androidx.constraintlayout.core.state.WidgetFrame widgetFrame, androidx.constraintlayout.core.state.WidgetFrame widgetFrame2, androidx.constraintlayout.core.state.WidgetFrame widgetFrame3, androidx.constraintlayout.core.state.Transition transition, float f) {
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f4 = 100.0f * f;
        int i12 = (int) f4;
        int i13 = widgetFrame2.left;
        int i14 = widgetFrame2.top;
        int i15 = widgetFrame3.left;
        int i16 = widgetFrame3.top;
        int i17 = widgetFrame2.right - i13;
        int i18 = widgetFrame2.bottom - i14;
        int i19 = widgetFrame3.right - i15;
        int i20 = widgetFrame3.bottom - i16;
        float f5 = widgetFrame2.alpha;
        float f6 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i14 = (int) (i14 - (i20 / 2.0f));
            i5 = (int) (i13 - (i19 / 2.0f));
            if (java.lang.Float.isNaN(f5)) {
                i4 = i20;
                i3 = i19;
                f2 = 0.0f;
            } else {
                f2 = f5;
                i3 = i19;
                i4 = i20;
            }
        } else {
            i3 = i17;
            f2 = f5;
            i4 = i18;
            i5 = i13;
        }
        if (widgetFrame3.visibility == 8) {
            i15 = (int) (i15 - (i3 / 2.0f));
            i16 = (int) (i16 - (i4 / 2.0f));
            i19 = i3;
            i20 = i4;
            if (java.lang.Float.isNaN(f6)) {
                f6 = 0.0f;
            }
        }
        if (java.lang.Float.isNaN(f2) && !java.lang.Float.isNaN(f6)) {
            f2 = 1.0f;
        }
        if (!java.lang.Float.isNaN(f2) && java.lang.Float.isNaN(f6)) {
            f6 = 1.0f;
        }
        float f7 = widgetFrame2.visibility == 4 ? 0.0f : f2;
        float f8 = widgetFrame3.visibility == 4 ? 0.0f : f6;
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            i6 = i14;
            f3 = f;
            i7 = i5;
            i8 = i15;
        } else {
            androidx.constraintlayout.core.state.Transition.KeyPosition keyPositionFindPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i12);
            i6 = i14;
            androidx.constraintlayout.core.state.Transition.KeyPosition keyPositionFindNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i12);
            if (keyPositionFindPreviousPosition == keyPositionFindNextPosition) {
                keyPositionFindNextPosition = null;
            }
            if (keyPositionFindPreviousPosition != null) {
                i5 = (int) (keyPositionFindPreviousPosition.x * i);
                i9 = i2;
                i6 = (int) (keyPositionFindPreviousPosition.y * i9);
                i10 = keyPositionFindPreviousPosition.frame;
            } else {
                i9 = i2;
                i10 = 0;
            }
            i7 = i5;
            if (keyPositionFindNextPosition != null) {
                int i21 = (int) (keyPositionFindNextPosition.x * i);
                int i22 = (int) (keyPositionFindNextPosition.y * i9);
                i11 = keyPositionFindNextPosition.frame;
                i8 = i21;
                i16 = i22;
            } else {
                i11 = 100;
                i8 = i15;
            }
            f3 = (f4 - i10) / (i11 - i10);
        }
        int i23 = i6;
        widgetFrame.widget = widgetFrame2.widget;
        int i24 = (int) (i7 + ((i8 - i7) * f3));
        widgetFrame.left = i24;
        int i25 = (int) (i23 + (f3 * (i16 - i23)));
        widgetFrame.top = i25;
        float f9 = 1.0f - f;
        widgetFrame.right = i24 + ((int) ((i3 * f9) + (i19 * f)));
        widgetFrame.bottom = i25 + ((int) ((f9 * i4) + (i20 * f)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f);
        widgetFrame.alpha = interpolate(f7, f8, 1.0f, f);
        java.util.Set<java.lang.String> setKeySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (java.lang.String str : setKeySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                androidx.constraintlayout.core.motion.CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                androidx.constraintlayout.core.motion.CustomVariable customVariable3 = new androidx.constraintlayout.core.motion.CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(java.lang.Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f)));
                } else {
                    int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i26 = 0; i26 < iNumberOfInterpolatedValues; i26++) {
                        fArr[i26] = interpolate(fArr[i26], fArr2[i26], 0.0f, f);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private static float interpolate(float f, float f2, float f3, float f4) {
        boolean zIsNaN = java.lang.Float.isNaN(f);
        boolean zIsNaN2 = java.lang.Float.isNaN(f2);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f = f3;
        }
        if (zIsNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }

    public float centerX() {
        int i = this.left;
        return i + ((this.right - i) / 2.0f);
    }

    public float centerY() {
        int i = this.top;
        return i + ((this.bottom - i) / 2.0f);
    }

    public androidx.constraintlayout.core.state.WidgetFrame update() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public androidx.constraintlayout.core.state.WidgetFrame update(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void addCustomColor(java.lang.String str, int i) {
        setCustomAttribute(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, i);
    }

    public int getCustomColor(java.lang.String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public void addCustomFloat(java.lang.String str, float f) {
        setCustomAttribute(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT, f);
    }

    public float getCustomFloat(java.lang.String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public void setCustomAttribute(java.lang.String str, int i, float f) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setFloatValue(f);
        } else {
            this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, f));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, int i2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setIntValue(i2);
        } else {
            this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, i2));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, boolean z) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setBooleanValue(z);
        } else {
            this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, z));
        }
    }

    public void setCustomAttribute(java.lang.String str, int i, java.lang.String str2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setStringValue(str2);
        } else {
            this.mCustom.put(str, new androidx.constraintlayout.core.motion.CustomVariable(str, i, str2));
        }
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String str) {
        return this.mCustom.get(str);
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    public boolean setValue(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) throws androidx.constraintlayout.core.parser.CLParsingException {
        str.hashCode();
        switch (str) {
            case "phone_orientation":
                phone_orientation = cLElement.getFloat();
                return true;
            case "bottom":
                this.bottom = cLElement.getInt();
                return true;
            case "custom":
                parseCustom(cLElement);
                return true;
            case "rotationX":
                this.rotationX = cLElement.getFloat();
                return true;
            case "rotationY":
                this.rotationY = cLElement.getFloat();
                return true;
            case "rotationZ":
                this.rotationZ = cLElement.getFloat();
                return true;
            case "translationX":
                this.translationX = cLElement.getFloat();
                return true;
            case "translationY":
                this.translationY = cLElement.getFloat();
                return true;
            case "translationZ":
                this.translationZ = cLElement.getFloat();
                return true;
            case "pivotX":
                this.pivotX = cLElement.getFloat();
                return true;
            case "pivotY":
                this.pivotY = cLElement.getFloat();
                return true;
            case "scaleX":
                this.scaleX = cLElement.getFloat();
                return true;
            case "scaleY":
                this.scaleY = cLElement.getFloat();
                return true;
            case "top":
                this.top = cLElement.getInt();
                return true;
            case "left":
                this.left = cLElement.getInt();
                return true;
            case "alpha":
                this.alpha = cLElement.getFloat();
                return true;
            case "right":
                this.right = cLElement.getInt();
                return true;
            case "interpolatedPos":
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public java.lang.String getId() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.widget;
        return constraintWidget == null ? "unknown" : constraintWidget.stringId;
    }

    void parseCustom(androidx.constraintlayout.core.parser.CLElement cLElement) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLObject cLObject = (androidx.constraintlayout.core.parser.CLObject) cLElement;
        int size = cLObject.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) cLObject.get(i);
            cLKey.content();
            androidx.constraintlayout.core.parser.CLElement value = cLKey.getValue();
            java.lang.String strContent = value.content();
            if (strContent.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(cLKey.content(), androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, java.lang.Integer.parseInt(strContent.substring(1), 16));
            } else if (value instanceof androidx.constraintlayout.core.parser.CLNumber) {
                setCustomAttribute(cLKey.content(), androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT, value.getFloat());
            } else {
                setCustomAttribute(cLKey.content(), androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, strContent);
            }
        }
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb) {
        return serialize(sb, false);
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb, boolean z) {
        sb.append("{\n");
        add(sb, androidx.media3.extractor.text.ttml.TtmlNode.LEFT, this.left);
        add(sb, "top", this.top);
        add(sb, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, this.right);
        add(sb, "bottom", this.bottom);
        add(sb, "pivotX", this.pivotX);
        add(sb, "pivotY", this.pivotY);
        add(sb, "rotationX", this.rotationX);
        add(sb, "rotationY", this.rotationY);
        add(sb, "rotationZ", this.rotationZ);
        add(sb, "translationX", this.translationX);
        add(sb, "translationY", this.translationY);
        add(sb, "translationZ", this.translationZ);
        add(sb, "scaleX", this.scaleX);
        add(sb, "scaleY", this.scaleY);
        add(sb, "alpha", this.alpha);
        add(sb, "visibility", this.visibility);
        add(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type : androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()) {
                serializeAnchor(sb, type);
            }
        }
        if (z) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (z) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb.append("custom : {\n");
            for (java.lang.String str : this.mCustom.keySet()) {
                androidx.constraintlayout.core.motion.CustomVariable customVariable = this.mCustom.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_FLOAT /* 901 */:
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR /* 902 */:
                        sb.append("'");
                        sb.append(androidx.constraintlayout.core.motion.CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING /* 903 */:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    private void serializeAnchor(java.lang.StringBuilder sb, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor == null || anchor.mTarget == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(type.name());
        sb.append(": ['");
        java.lang.String str = anchor.mTarget.getOwner().stringId;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(anchor.mTarget.getType().name());
        sb.append("', '");
        sb.append(anchor.mMargin);
        sb.append("'],\n");
    }

    private static void add(java.lang.StringBuilder sb, java.lang.String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    private static void add(java.lang.StringBuilder sb, java.lang.String str, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    void printCustomAttributes() {
        java.lang.String str;
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str = str2 + "/" + (this.widget.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> map = this.mCustom;
        if (map != null) {
            java.util.Iterator<java.lang.String> it = map.keySet().iterator();
            while (it.hasNext()) {
                java.lang.System.out.println(str + this.mCustom.get(it.next()).toString());
            }
        }
    }

    void logv(java.lang.String str) {
        java.lang.String str2;
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str2 = str3 + "/" + (this.widget.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        java.lang.System.out.println(str2 + " " + str);
    }
}
