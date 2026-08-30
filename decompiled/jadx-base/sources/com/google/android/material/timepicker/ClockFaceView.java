package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class ClockFaceView extends com.google.android.material.timepicker.RadialViewGroup implements com.google.android.material.timepicker.ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final java.lang.String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final android.graphics.RectF scratch;
    private final android.content.res.ColorStateList textColor;
    private final android.util.SparseArray<android.widget.TextView> textViewPool;
    private final android.graphics.Rect textViewRect;
    private final androidx.core.view.AccessibilityDelegateCompat valueAccessibilityDelegate;
    private java.lang.String[] values;

    public ClockFaceView(android.content.Context context) {
        this(context, null);
    }

    public ClockFaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialClockStyle);
    }

    public ClockFaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textViewRect = new android.graphics.Rect();
        this.scratch = new android.graphics.RectF();
        this.textViewPool = new android.util.SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ClockFaceView, i, com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock);
        android.content.res.Resources resources = getResources();
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        android.view.LayoutInflater.from(context).inflate(com.google.android.material.R.layout.material_clockface_view, (android.view.ViewGroup) this, true);
        com.google.android.material.timepicker.ClockHandView clockHandView = (com.google.android.material.timepicker.ClockHandView) findViewById(com.google.android.material.R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(com.google.android.material.R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, com.google.android.material.R.color.material_timepicker_clockface).getDefaultColor();
        android.content.res.ColorStateList colorStateList2 = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!com.google.android.material.timepicker.ClockFaceView.this.isShown()) {
                    return true;
                }
                com.google.android.material.timepicker.ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                com.google.android.material.timepicker.ClockFaceView.this.setRadius(((com.google.android.material.timepicker.ClockFaceView.this.getHeight() / 2) - com.google.android.material.timepicker.ClockFaceView.this.clockHandView.getSelectorRadius()) - com.google.android.material.timepicker.ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iIntValue = ((java.lang.Integer) view.getTag(com.google.android.material.R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((android.view.View) com.google.android.material.timepicker.ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view, int i2, android.os.Bundle bundle) {
                if (i2 == 16) {
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    float x = view.getX() + (view.getWidth() / 2.0f);
                    float height = (view.getHeight() / 2.0f) + view.getY();
                    com.google.android.material.timepicker.ClockFaceView.this.clockHandView.onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x, height, 0));
                    com.google.android.material.timepicker.ClockFaceView.this.clockHandView.onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x, height, 0));
                    return true;
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        };
        java.lang.String[] strArr = new java.lang.String[12];
        java.util.Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(com.google.android.material.R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(com.google.android.material.R.dimen.material_clock_size);
    }

    public void setValues(java.lang.String[] strArr, int i) {
        this.values = strArr;
        updateTextViews(i);
    }

    private void updateTextViews(int i) {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        for (int i2 = 0; i2 < java.lang.Math.max(this.values.length, size); i2++) {
            android.widget.TextView textView = this.textViewPool.get(i2);
            if (i2 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i2);
            } else {
                if (textView == null) {
                    textView = (android.widget.TextView) layoutInflaterFrom.inflate(com.google.android.material.R.layout.material_clockface_textview, (android.view.ViewGroup) this, false);
                    this.textViewPool.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.values[i2]);
                textView.setTag(com.google.android.material.R.id.material_value_index, java.lang.Integer.valueOf(i2));
                androidx.core.view.ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.values[i2]));
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.values.length, false, 1));
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        findIntersectingTextView();
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
        findIntersectingTextView();
    }

    private void findIntersectingTextView() {
        android.graphics.RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        for (int i = 0; i < this.textViewPool.size(); i++) {
            android.widget.TextView textView = this.textViewPool.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.textViewRect);
                offsetDescendantRectToMyCoords(textView, this.textViewRect);
                textView.setSelected(currentSelectorBox.contains(this.textViewRect.centerX(), this.textViewRect.centerY()));
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, this.textViewRect, textView));
                textView.invalidate();
            }
        }
    }

    private android.graphics.RadialGradient getGradientForTextView(android.graphics.RectF rectF, android.graphics.Rect rect, android.widget.TextView textView) {
        this.scratch.set(rect);
        this.scratch.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (android.graphics.RectF.intersects(rectF, this.scratch)) {
            return new android.graphics.RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, android.graphics.Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (java.lang.Math.abs(this.currentHandRotation - f) > EPSILON) {
            this.currentHandRotation = f;
            findIntersectingTextView();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    private static float max3(float f, float f2, float f3) {
        return java.lang.Math.max(java.lang.Math.max(f, f2), f3);
    }
}
