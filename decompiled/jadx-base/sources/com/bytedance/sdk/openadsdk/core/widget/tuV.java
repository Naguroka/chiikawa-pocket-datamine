package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class tuV {
    private boolean VB;
    private final com.bytedance.sdk.openadsdk.core.widget.tuV.bg bg;
    private float eqN;
    private int iR;
    private int ldr;
    private float zx;
    private final boolean IL = false;
    private boolean bX = false;
    private boolean Kg = true;
    private boolean WR = false;
    private final android.view.View.OnTouchListener eo = new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tuV.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            if (com.bytedance.sdk.openadsdk.core.widget.tuV.this.bg.rri()) {
                return !com.bytedance.sdk.openadsdk.core.widget.tuV.this.bX;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                com.bytedance.sdk.openadsdk.core.widget.tuV tuv = com.bytedance.sdk.openadsdk.core.widget.tuV.this;
                tuv.VB = tuv.bg(motionEvent);
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.eqN = x;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.zx = y;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.ldr = (int) x;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.iR = (int) y;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.Kg = true;
                if (com.bytedance.sdk.openadsdk.core.widget.tuV.this.bg != null && com.bytedance.sdk.openadsdk.core.widget.tuV.this.bX) {
                    com.bytedance.sdk.openadsdk.core.widget.tuV.this.bg.bg(view, true);
                }
            } else if (action == 1) {
                if (java.lang.Math.abs(x - com.bytedance.sdk.openadsdk.core.widget.tuV.this.ldr) > 20.0f || java.lang.Math.abs(y - com.bytedance.sdk.openadsdk.core.widget.tuV.this.iR) > 20.0f) {
                    com.bytedance.sdk.openadsdk.core.widget.tuV.this.Kg = false;
                }
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.Kg = true;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.WR = false;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.eqN = 0.0f;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.zx = 0.0f;
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.ldr = 0;
                if (com.bytedance.sdk.openadsdk.core.widget.tuV.this.bg != null) {
                    com.bytedance.sdk.openadsdk.core.widget.tuV.this.bg.bg(view, com.bytedance.sdk.openadsdk.core.widget.tuV.this.Kg);
                }
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.VB = false;
            } else if (action == 3) {
                com.bytedance.sdk.openadsdk.core.widget.tuV.this.VB = false;
            }
            return !com.bytedance.sdk.openadsdk.core.widget.tuV.this.bX;
        }
    };

    public interface bg {
        void bg(android.view.View view, boolean z);

        boolean rri();
    }

    public tuV(com.bytedance.sdk.openadsdk.core.widget.tuV.bg bgVar) {
        this.bg = bgVar;
    }

    public void bg(android.view.View view) {
        if (view != null) {
            view.setOnTouchListener(this.eo);
        }
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext());
        int iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iBX;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iEqN;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
