package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends android.view.ViewGroup implements com.bytedance.sdk.openadsdk.bX.eo.bX {
    private final com.bytedance.sdk.openadsdk.bX.eo bg;

    public Kg(android.content.Context context, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        super(context);
        this.bg = eoVar;
        eoVar.bg(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        android.view.View.MeasureSpec.getMode(i);
        android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        android.view.View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < getChildCount()) {
            android.view.View childAt = getChildAt(i3);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = i3 != 0 ? marginLayoutParams.leftMargin : 0;
            int i7 = (measuredWidth + i6) + i5 < size ? i5 + i6 : 0;
            if (i7 == 0) {
                i4 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i5 = i7 + measuredWidth + marginLayoutParams.rightMargin;
            i3++;
        }
        setMeasuredDimension(size, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < childCount) {
            android.view.View childAt = getChildAt(i7);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = i7 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i10 + i8 < i6) {
                i5 = i8 + i10;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i5 = 0;
            }
            childAt.layout(i5, marginLayoutParams.topMargin + i9, i5 + measuredWidth, measuredHeight + i9);
            i8 = i5 + measuredWidth + marginLayoutParams.rightMargin;
            i7++;
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.openadsdk.FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(IL(filterWord));
            }
        }
    }

    private android.view.View IL(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTag(filterWord);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iBX;
        marginLayoutParams.bottomMargin = iBX;
        textView.setTextColor(bg());
        textView.setText(filterWord.getName());
        textView.setPadding(iBX, iBX, iBX, iBX);
        textView.setBackground(IL());
        textView.setSelected(false);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.Kg.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.bX.Kg.this.bg != null) {
                    if (view.isSelected()) {
                        com.bytedance.sdk.openadsdk.bX.Kg.this.bg.bg(com.bytedance.sdk.openadsdk.bX.eo.bg);
                        return;
                    }
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof com.bytedance.sdk.openadsdk.FilterWord) {
                        com.bytedance.sdk.openadsdk.bX.Kg.this.bg.bg((com.bytedance.sdk.openadsdk.FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    private android.content.res.ColorStateList bg() {
        return new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{android.graphics.Color.rgb(255, 44, 85), androidx.core.view.ViewCompat.MEASURED_STATE_MASK});
    }

    private android.graphics.drawable.Drawable IL() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        float fBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fBX);
        gradientDrawable.setColor(android.graphics.Color.parseColor("#0D000000"));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setStroke(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 1.0f), android.graphics.Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fBX);
        gradientDrawable2.setColor(android.graphics.Color.parseColor("#12FE2C55"));
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.bX
    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != null) {
                if (com.bytedance.sdk.openadsdk.bX.eo.bg.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }
}
