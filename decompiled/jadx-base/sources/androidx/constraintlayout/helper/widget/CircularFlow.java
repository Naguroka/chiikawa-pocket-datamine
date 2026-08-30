package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends androidx.constraintlayout.widget.VirtualLayout {
    private static float DEFAULT_ANGLE = 0.0f;
    private static int DEFAULT_RADIUS = 0;
    private static final java.lang.String TAG = "CircularFlow";
    private float[] mAngles;
    androidx.constraintlayout.widget.ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private java.lang.String mReferenceAngles;
    private java.lang.Float mReferenceDefaultAngle;
    private java.lang.Integer mReferenceDefaultRadius;
    private java.lang.String mReferenceRadius;
    int mViewCenter;

    public CircularFlow(android.content.Context context) {
        super(context);
    }

    public CircularFlow(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularFlow(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int[] getRadius() {
        return java.util.Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    public float[] getAngles() {
        return java.util.Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet attrs) {
        super.init(attrs);
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    java.lang.String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    java.lang.Float fValueOf = java.lang.Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, DEFAULT_ANGLE));
                    this.mReferenceDefaultAngle = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, DEFAULT_RADIUS));
                    this.mReferenceDefaultRadius = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        java.lang.String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        java.lang.Float f = this.mReferenceDefaultAngle;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        java.lang.Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    private void anchorReferences() {
        this.mContainer = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            android.view.View viewById = this.mContainer.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = DEFAULT_RADIUS;
                float f = DEFAULT_ANGLE;
                int[] iArr = this.mRadius;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    java.lang.Integer num = this.mReferenceDefaultRadius;
                    if (num != null && num.intValue() != -1) {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i2;
                    } else {
                        android.util.Log.e(TAG, "Added radius to view with id: " + this.mMap.get(java.lang.Integer.valueOf(viewById.getId())));
                    }
                }
                float[] fArr = this.mAngles;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    java.lang.Float f2 = this.mReferenceDefaultAngle;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f;
                    } else {
                        android.util.Log.e(TAG, "Added angle to view with id: " + this.mMap.get(java.lang.Integer.valueOf(viewById.getId())));
                    }
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    public void addViewToCircularFlow(android.view.View view, int radius, float angle) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.mCountAngle++;
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[this.mCountAngle - 1] = angle;
        this.mCountRadius++;
        int[] radius2 = getRadius();
        this.mRadius = radius2;
        radius2[this.mCountRadius - 1] = (int) (radius * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public void updateRadius(android.view.View view, int radius) {
        if (!isUpdatable(view)) {
            android.util.Log.e(TAG, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mRadius.length) {
            return;
        }
        int[] radius2 = getRadius();
        this.mRadius = radius2;
        radius2[iIndexFromId] = (int) (radius * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public void updateAngle(android.view.View view, float angle) {
        if (!isUpdatable(view)) {
            android.util.Log.e(TAG, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mAngles.length) {
            return;
        }
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[iIndexFromId] = angle;
        anchorReferences();
    }

    public void updateReference(android.view.View view, int radius, float angle) {
        if (!isUpdatable(view)) {
            android.util.Log.e(TAG, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (getAngles().length > iIndexFromId) {
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[iIndexFromId] = angle;
        }
        if (getRadius().length > iIndexFromId) {
            int[] radius2 = getRadius();
            this.mRadius = radius2;
            radius2[iIndexFromId] = (int) (radius * this.myContext.getResources().getDisplayMetrics().density);
        }
        anchorReferences();
    }

    public void setDefaultAngle(float angle) {
        DEFAULT_ANGLE = angle;
    }

    public void setDefaultRadius(int radius) {
        DEFAULT_RADIUS = radius;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(android.view.View view) {
        int iRemoveView = super.removeView(view);
        if (iRemoveView == -1) {
            return iRemoveView;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (iRemoveView < fArr.length) {
            this.mAngles = removeAngle(fArr, iRemoveView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (iRemoveView < iArr.length) {
            this.mRadius = removeRadius(iArr, iRemoveView);
            this.mCountRadius--;
        }
        anchorReferences();
        return iRemoveView;
    }

    private float[] removeAngle(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.mCountAngle) ? angles : removeElementFromArray(angles, index);
    }

    private int[] removeRadius(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.mCountRadius) ? radius : removeElementFromArray(radius, index);
    }

    private void setAngles(java.lang.String idList) {
        if (idList == null) {
            return;
        }
        int i = 0;
        this.mCountAngle = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i);
            if (iIndexOf == -1) {
                addAngle(idList.substring(i).trim());
                return;
            } else {
                addAngle(idList.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(java.lang.String idList) {
        if (idList == null) {
            return;
        }
        int i = 0;
        this.mCountRadius = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i);
            if (iIndexOf == -1) {
                addRadius(idList.substring(i).trim());
                return;
            } else {
                addRadius(idList.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void addAngle(java.lang.String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = java.util.Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = java.lang.Integer.parseInt(angleString);
        this.mCountAngle++;
    }

    private void addRadius(java.lang.String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = java.util.Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.mRadius[this.mCountRadius] = (int) (java.lang.Integer.parseInt(radiusString) * this.myContext.getResources().getDisplayMetrics().density);
        this.mCountRadius++;
    }

    public static int[] removeElementFromArray(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i = 0;
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 != index) {
                iArr[i] = array[i2];
                i++;
            }
        }
        return iArr;
    }

    public static float[] removeElementFromArray(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i = 0;
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 != index) {
                fArr[i] = array[i2];
                i++;
            }
        }
        return fArr;
    }

    public boolean isUpdatable(android.view.View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }
}
