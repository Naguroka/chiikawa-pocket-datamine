package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class yDt extends android.view.View {
    private android.view.View IL;
    private final com.bytedance.sdk.openadsdk.common.yDt.bg bg;

    public interface bg {
        android.view.View bg(android.content.Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    public yDt(android.content.Context context, com.bytedance.sdk.openadsdk.common.yDt.bg bgVar) {
        super(context);
        this.bg = bgVar;
        bg();
    }

    private void bg() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        android.view.View view = this.IL;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            IL();
        }
    }

    private android.view.View IL() {
        com.bytedance.sdk.openadsdk.common.yDt.bg bgVar;
        if (this.IL == null && (bgVar = this.bg) != null) {
            this.IL = bgVar.bg(getContext());
            bg(this.IL, (android.view.ViewGroup) getParent());
        }
        return this.IL;
    }

    private void bg(android.view.View view, android.view.ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
