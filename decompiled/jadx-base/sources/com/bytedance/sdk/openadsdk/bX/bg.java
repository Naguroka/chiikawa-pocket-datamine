package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.zx.Kg {
    private float IL;
    private boolean bX;
    private android.graphics.Paint bg;
    private int eqN;

    public bg(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        this.IL = com.bytedance.sdk.openadsdk.utils.ZQc.bg(getContext(), 8.0f);
        this.bg = new android.graphics.Paint();
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.IL = f;
    }

    private void bg(java.lang.String str, int i) {
        if (!this.bX && i > 0) {
            float textSize = getTextSize();
            this.bg.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fBg = bg(textSize, str);
            while (fBg > paddingLeft) {
                textSize -= 1.0f;
                this.bg.setTextSize(textSize);
                if (textSize <= this.IL) {
                    break;
                } else {
                    fBg = bg(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.bX = true;
        }
    }

    private float bg(float f, java.lang.String str) {
        this.bg.setTextSize(f);
        return this.bg.measureText(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.Kg, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.eqN = getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, this.eqN);
        } else {
            layoutParams.height = this.eqN;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.Kg, android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.eqN;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        bg(getText().toString(), getWidth());
    }
}
