package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(android.content.Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        if (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(com.google.android.material.R.id.cancel_button);
            setNextFocusRightId(com.google.android.material.R.id.confirm_button);
        }
        this.nestedScrollable = com.google.android.material.datepicker.MaterialDatePicker.isNestedScrollable(getContext());
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public com.google.android.material.datepicker.MonthAdapter getAdapter() {
        return (com.google.android.material.datepicker.MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(android.widget.ListAdapter listAdapter) {
        if (!(listAdapter instanceof com.google.android.material.datepicker.MonthAdapter)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s must have its Adapter set to a %2$s", com.google.android.material.datepicker.MaterialCalendarGridView.class.getCanonicalName(), com.google.android.material.datepicker.MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int iDayToPosition;
        int iHorizontalMidPoint;
        int iDayToPosition2;
        int iHorizontalMidPoint2;
        int width;
        int i;
        int left;
        int left2;
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        com.google.android.material.datepicker.MonthAdapter adapter = getAdapter();
        com.google.android.material.datepicker.DateSelector<?> dateSelector = adapter.dateSelector;
        com.google.android.material.datepicker.CalendarStyle calendarStyle = adapter.calendarStyle;
        int iMax = java.lang.Math.max(adapter.firstPositionInMonth(), getFirstVisiblePosition());
        int iMin = java.lang.Math.min(adapter.lastPositionInMonth(), getLastVisiblePosition());
        java.lang.Long item = adapter.getItem(iMax);
        java.lang.Long item2 = adapter.getItem(iMin);
        java.util.Iterator<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            androidx.core.util.Pair<java.lang.Long, java.lang.Long> next = it.next();
            if (next.first == null) {
                materialCalendarGridView = this;
            } else if (next.second != null) {
                long jLongValue = next.first.longValue();
                long jLongValue2 = next.second.longValue();
                if (!skipMonth(item, item2, java.lang.Long.valueOf(jLongValue), java.lang.Long.valueOf(jLongValue2))) {
                    boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.isFirstInRow(iMax)) {
                            left2 = 0;
                        } else if (!zIsLayoutRtl) {
                            left2 = materialCalendarGridView.getChildAtPosition(iMax - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.getChildAtPosition(iMax - 1).getLeft();
                        }
                        iHorizontalMidPoint = left2;
                        iDayToPosition = iMax;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue);
                        iDayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.isLastInRow(iMin)) {
                            left = getWidth();
                        } else if (!zIsLayoutRtl) {
                            left = materialCalendarGridView.getChildAtPosition(iMin).getRight();
                        } else {
                            left = materialCalendarGridView.getChildAtPosition(iMin).getLeft();
                        }
                        iHorizontalMidPoint2 = left;
                        iDayToPosition2 = iMin;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue2);
                        iDayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(iDayToPosition);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iDayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        android.view.View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                        int top = childAtPosition.getTop() + calendarStyle.day.getTopInset();
                        com.google.android.material.datepicker.MonthAdapter monthAdapter = adapter;
                        int bottom = childAtPosition.getBottom() - calendarStyle.day.getBottomInset();
                        if (!zIsLayoutRtl) {
                            i = numColumns > iDayToPosition ? 0 : iHorizontalMidPoint;
                            width = iDayToPosition2 > numColumns2 ? getWidth() : iHorizontalMidPoint2;
                        } else {
                            int i4 = iDayToPosition2 > numColumns2 ? 0 : iHorizontalMidPoint2;
                            width = numColumns > iDayToPosition ? getWidth() : iHorizontalMidPoint;
                            i = i4;
                        }
                        canvas.drawRect(i, top, width, bottom, calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.nestedScrollable) {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    private void gainFocus(int i, android.graphics.Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private android.view.View getChildAtPosition(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static boolean skipMonth(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    private static int horizontalMidPoint(android.view.View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
