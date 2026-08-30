package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class Transition implements androidx.constraintlayout.core.motion.utils.TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition>> keyPositions = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.WidgetState> state = new java.util.HashMap<>();
    androidx.constraintlayout.core.motion.utils.TypedBundle mBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
    private int mDefaultInterpolator = 0;
    private java.lang.String mDefaultInterpolatorString = null;
    private androidx.constraintlayout.core.motion.utils.Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = 400;
    private float mStagger = 0.0f;

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    static /* synthetic */ float lambda$getInterpolator$0(java.lang.String str, float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str).get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$1(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("standard").get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$2(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("accelerate").get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$3(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("decelerate").get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$4(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("linear").get(f);
    }

    public static androidx.constraintlayout.core.state.Interpolator getInterpolator(int i, final java.lang.String str) {
        switch (i) {
            case -1:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda0
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$0(str, f);
                    }
                };
            case 0:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$1(f);
                    }
                };
            case 1:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda2
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$2(f);
                    }
                };
            case 2:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda3
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$3(f);
                    }
                };
            case 3:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda4
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$4(f);
                    }
                };
            case 4:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda7
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$7(f);
                    }
                };
            case 5:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda6
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$6(f);
                    }
                };
            case 6:
                return new androidx.constraintlayout.core.state.Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda5
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return androidx.constraintlayout.core.state.Transition.lambda$getInterpolator$5(f);
                    }
                };
            default:
                return null;
        }
    }

    static /* synthetic */ float lambda$getInterpolator$5(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("anticipate").get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$6(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("overshoot").get(f);
    }

    static /* synthetic */ float lambda$getInterpolator$7(float f) {
        return (float) androidx.constraintlayout.core.motion.utils.Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findPreviousPosition(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        while (i >= 0) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> map = this.keyPositions.get(java.lang.Integer.valueOf(i));
            if (map != null && (keyPosition = map.get(str)) != null) {
                return keyPosition;
            }
            i--;
        }
        return null;
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findNextPosition(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        while (i <= 100) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> map = this.keyPositions.get(java.lang.Integer.valueOf(i));
            if (map != null && (keyPosition = map.get(str)) != null) {
                return keyPosition;
            }
            i++;
        }
        return null;
    }

    public int getNumberKeyPositions(androidx.constraintlayout.core.state.WidgetFrame widgetFrame) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> map = this.keyPositions.get(java.lang.Integer.valueOf(i2));
            if (map != null && map.get(widgetFrame.widget.stringId) != null) {
                i++;
            }
        }
        return i;
    }

    public androidx.constraintlayout.core.motion.Motion getMotion(java.lang.String str) {
        return getWidgetState(str, null, 0).motionControl;
    }

    public void fillKeyPositions(androidx.constraintlayout.core.state.WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> map = this.keyPositions.get(java.lang.Integer.valueOf(i2));
            if (map != null && (keyPosition = map.get(widgetFrame.widget.stringId)) != null) {
                fArr[i] = keyPosition.x;
                fArr2[i] = keyPosition.y;
                fArr3[i] = keyPosition.frame;
                i++;
            }
        }
    }

    public boolean hasPositionKeyframes() {
        return this.keyPositions.size() > 0;
    }

    public void setTransitionProperties(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 706) {
            return false;
        }
        this.mStagger = f;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, java.lang.String str) {
        if (i != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(str);
        return false;
    }

    public boolean isEmpty() {
        return this.state.isEmpty();
    }

    public void clear() {
        this.state.clear();
    }

    public boolean contains(java.lang.String str) {
        return this.state.containsKey(str);
    }

    public void addKeyPosition(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void addKeyAttribute(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(java.lang.String str, androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(java.lang.String str, int i, int i2, float f, float f2) {
        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
        typedBundle.add(510, 2);
        typedBundle.add(100, i);
        typedBundle.add(506, f);
        typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_Y, f2);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        androidx.constraintlayout.core.state.Transition.KeyPosition keyPosition = new androidx.constraintlayout.core.state.Transition.KeyPosition(str, i, i2, f, f2);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition> map = this.keyPositions.get(java.lang.Integer.valueOf(i));
        if (map == null) {
            map = new java.util.HashMap<>();
            this.keyPositions.put(java.lang.Integer.valueOf(i), map);
        }
        map.put(str, keyPosition);
    }

    public void addCustomFloat(int i, java.lang.String str, java.lang.String str2, float f) {
        getWidgetState(str, null, i).getFrame(i).addCustomFloat(str2, f);
    }

    public void addCustomColor(int i, java.lang.String str, java.lang.String str2, int i2) {
        getWidgetState(str, null, i).getFrame(i).addCustomColor(str2, i2);
    }

    public void updateFrom(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i) {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i2);
            getWidgetState(constraintWidget.stringId, null, i).update(constraintWidget, i);
        }
    }

    public void interpolate(int i, int i2, float f) {
        androidx.constraintlayout.core.motion.utils.Easing easing = this.mEasing;
        if (easing != null) {
            f = (float) easing.get(f);
        }
        java.util.Iterator<java.lang.String> it = this.state.keySet().iterator();
        while (it.hasNext()) {
            this.state.get(it.next()).interpolate(i, i2, f, this);
        }
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.start;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.end;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(java.lang.String str) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.interpolated;
    }

    public float[] getPath(java.lang.String str) {
        float[] fArr = new float[124];
        this.state.get(str).motionControl.buildPath(fArr, 62);
        return fArr;
    }

    public int getKeyFrames(java.lang.String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.state.get(str).motionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    private androidx.constraintlayout.core.state.Transition.WidgetState getWidgetState(java.lang.String str) {
        return this.state.get(str);
    }

    private androidx.constraintlayout.core.state.Transition.WidgetState getWidgetState(java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        androidx.constraintlayout.core.state.Transition.WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            widgetState = new androidx.constraintlayout.core.state.Transition.WidgetState();
            this.mBundle.applyDelta(widgetState.motionControl);
            this.state.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i);
            }
        }
        return widgetState;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).start;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).end;
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).interpolated;
    }

    public androidx.constraintlayout.core.state.Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    static class WidgetState {
        androidx.constraintlayout.core.motion.Motion motionControl;
        androidx.constraintlayout.core.motion.utils.KeyCache myKeyCache = new androidx.constraintlayout.core.motion.utils.KeyCache();
        int myParentHeight = -1;
        int myParentWidth = -1;
        androidx.constraintlayout.core.state.WidgetFrame start = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.state.WidgetFrame end = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.state.WidgetFrame interpolated = new androidx.constraintlayout.core.state.WidgetFrame();
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetStart = new androidx.constraintlayout.core.motion.MotionWidget(this.start);
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetEnd = new androidx.constraintlayout.core.motion.MotionWidget(this.end);
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetInterpolated = new androidx.constraintlayout.core.motion.MotionWidget(this.interpolated);

        public WidgetState() {
            androidx.constraintlayout.core.motion.Motion motion = new androidx.constraintlayout.core.motion.Motion(this.motionWidgetStart);
            this.motionControl = motion;
            motion.setStart(this.motionWidgetStart);
            this.motionControl.setEnd(this.motionWidgetEnd);
        }

        public void setKeyPosition(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyPosition motionKeyPosition = new androidx.constraintlayout.core.motion.key.MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.motionControl.addKey(motionKeyPosition);
        }

        public void setKeyAttribute(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyAttributes motionKeyAttributes = new androidx.constraintlayout.core.motion.key.MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.motionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
            androidx.constraintlayout.core.motion.key.MotionKeyCycle motionKeyCycle = new androidx.constraintlayout.core.motion.key.MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.motionControl.addKey(motionKeyCycle);
        }

        public void update(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
            if (i == 0) {
                this.start.update(constraintWidget);
                this.motionControl.setStart(this.motionWidgetStart);
            } else if (i == 1) {
                this.end.update(constraintWidget);
                this.motionControl.setEnd(this.motionWidgetEnd);
            }
            this.myParentWidth = -1;
        }

        public androidx.constraintlayout.core.state.WidgetFrame getFrame(int i) {
            if (i == 0) {
                return this.start;
            }
            if (i == 1) {
                return this.end;
            }
            return this.interpolated;
        }

        public void interpolate(int i, int i2, float f, androidx.constraintlayout.core.state.Transition transition) {
            this.myParentHeight = i2;
            this.myParentWidth = i;
            this.motionControl.setup(i, i2, 1.0f, java.lang.System.nanoTime());
            androidx.constraintlayout.core.state.WidgetFrame.interpolate(i, i2, this.interpolated, this.start, this.end, transition, f);
            this.interpolated.interpolatedPos = f;
            this.motionControl.interpolate(this.motionWidgetInterpolated, f, java.lang.System.nanoTime(), this.myKeyCache);
        }
    }

    static class KeyPosition {
        int frame;
        java.lang.String target;
        int type;
        float x;
        float y;

        public KeyPosition(java.lang.String str, int i, int i2, float f, float f2) {
            this.target = str;
            this.frame = i;
            this.type = i2;
            this.x = f;
            this.y = f2;
        }
    }
}
