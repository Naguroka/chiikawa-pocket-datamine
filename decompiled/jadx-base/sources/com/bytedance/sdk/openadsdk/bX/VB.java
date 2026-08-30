package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class VB extends android.view.View {
    private final int bg;

    public VB(android.content.Context context) {
        this(context, android.graphics.Color.parseColor("#25000000"));
    }

    public VB(android.content.Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.bg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.bg);
    }
}
