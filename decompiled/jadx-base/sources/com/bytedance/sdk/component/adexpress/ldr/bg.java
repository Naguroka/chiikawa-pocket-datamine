package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.TextSwitcher implements android.widget.ViewSwitcher.ViewFactory, com.bytedance.sdk.component.utils.JAA.bg {
    private java.util.List<java.lang.String> IL;
    private int Kg;
    private int PX;
    private int Ta;
    private int VB;
    private float WR;
    private int bX;
    android.view.animation.Animation.AnimationListener bg;
    private int eo;
    private final int eqN;
    private int iR;
    private android.widget.TextView ldr;
    private android.os.Handler yDt;
    private android.content.Context zx;

    public bg(android.content.Context context, int i, float f, int i2, int i3) {
        super(context);
        this.IL = new java.util.ArrayList();
        this.bX = 0;
        this.eqN = 1;
        this.yDt = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
        this.bg = new android.view.animation.Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.bg.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                if (com.bytedance.sdk.component.adexpress.ldr.bg.this.ldr != null) {
                    com.bytedance.sdk.component.adexpress.ldr.bg.this.ldr.setText("");
                }
            }
        };
        this.zx = context;
        this.Kg = i;
        this.WR = f;
        this.eo = i2;
        this.Ta = i3;
        bX();
    }

    private void bX() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.PX = i;
    }

    public void setAnimationDuration(int i) {
        this.iR = i;
    }

    public void bg() {
        int i = this.PX;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.Fy.WR(this.zx, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.Fy.WR(this.zx, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.Fy.WR(this.zx, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.Fy.WR(this.zx, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new android.view.animation.LinearInterpolator());
            getOutAnimation().setInterpolator(new android.view.animation.LinearInterpolator());
            getInAnimation().setAnimationListener(this.bg);
            getOutAnimation().setAnimationListener(this.bg);
        }
        this.yDt.sendEmptyMessage(1);
    }

    public void setAnimationText(java.util.List<java.lang.String> list) {
        this.IL = list;
    }

    public void IL() {
        java.util.List<java.lang.String> list = this.IL;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.bX;
        this.bX = i + 1;
        this.VB = i;
        setText(this.IL.get(i));
        if (this.bX > this.IL.size() - 1) {
            this.bX = 0;
        }
    }

    public void setTextColor(int i) {
        this.Kg = i;
    }

    public void setTextSize(float f) {
        this.WR = f;
    }

    public void setMaxLines(int i) {
        this.eo = i;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public android.view.View makeView() {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.ldr = textView;
        textView.setTextColor(this.Kg);
        this.ldr.setTextSize(this.WR);
        this.ldr.setMaxLines(this.eo);
        this.ldr.setTextAlignment(this.Ta);
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        IL();
        this.yDt.sendEmptyMessageDelayed(1, this.iR);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL(this.IL.get(this.VB), this.WR, false)[0], 1073741824), i);
        } catch (java.lang.Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.yDt.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.yDt.sendEmptyMessageDelayed(1, this.iR);
    }
}
