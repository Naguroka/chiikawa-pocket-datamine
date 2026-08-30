package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class Lq extends com.bytedance.sdk.openadsdk.core.zx.bX implements com.bytedance.sdk.openadsdk.bX.eo.IL {
    private com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private com.bytedance.sdk.openadsdk.common.Lq.bg bX;
    private android.view.View bg;
    private android.content.Context eqN;
    private final com.bytedance.sdk.openadsdk.bX.eo iR;
    private boolean ldr;
    private java.lang.String zx;

    public interface bg {
        void IL(android.view.View view);

        void bg(android.view.View view);

        void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord);
    }

    public Lq(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this(context.getApplicationContext());
        this.IL = tuv;
        this.eqN = context;
        eqN();
        zx();
    }

    private void eqN() {
        this.iR.bg(this.IL.Ny());
        this.iR.bg(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lq(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ldr = false;
        this.iR = new com.bytedance.sdk.openadsdk.bX.eo();
        bg(context, attributeSet);
    }

    private void bg(android.content.Context context, android.util.AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Lq.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.common.Lq.this.iR != null) {
                    com.bytedance.sdk.openadsdk.common.Lq.this.iR.zx();
                } else {
                    com.bytedance.sdk.openadsdk.common.Lq.this.IL();
                }
            }
        });
        setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
        this.bg = new com.bytedance.sdk.openadsdk.bX.WR(context, this.iR);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 20.0f);
        layoutParams.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 20.0f);
        this.bg.setLayoutParams(layoutParams);
        this.bg.setClickable(true);
        zx();
    }

    private void zx() {
        com.bytedance.sdk.openadsdk.bX.eo eoVar;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv == null || (eoVar = this.iR) == null) {
            return;
        }
        eoVar.bg(tuv.kU());
    }

    public void setDislikeSource(java.lang.String str) {
        this.zx = str;
        this.iR.IL(str);
    }

    public void bg() {
        if (this.bg.getParent() == null) {
            addView(this.bg);
        }
        setVisibility(0);
        this.ldr = true;
        com.bytedance.sdk.openadsdk.common.Lq.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(this);
        }
    }

    public void IL() {
        setVisibility(8);
        this.ldr = false;
        com.bytedance.sdk.openadsdk.common.Lq.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.IL(this);
        }
    }

    public void setCallback(com.bytedance.sdk.openadsdk.common.Lq.bg bgVar) {
        this.bX = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.IL
    public void bg(int i) {
        if (com.bytedance.sdk.openadsdk.bX.eo.IL == i) {
            com.bytedance.sdk.openadsdk.FilterWord filterWordIL = this.iR.IL();
            if (filterWordIL == null || com.bytedance.sdk.openadsdk.bX.eo.bg.equals(filterWordIL)) {
                return;
            }
            com.bytedance.sdk.openadsdk.common.Lq.bg bgVar = this.bX;
            if (bgVar != null) {
                try {
                    bgVar.bg(filterWordIL);
                } catch (java.lang.Throwable unused) {
                }
            }
            IL();
            return;
        }
        if (com.bytedance.sdk.openadsdk.bX.eo.bX == i) {
            IL();
        } else if (com.bytedance.sdk.openadsdk.bX.eo.zx == i) {
            bX();
        }
    }

    public void bX() {
        android.content.Context context = this.eqN;
        if (context instanceof android.app.Activity) {
            boolean z = !((android.app.Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.bX.PX px = new com.bytedance.sdk.openadsdk.bX.PX(this.eqN, this.iR);
            px.bg(ldr());
            px.bg(this.IL.Ny(), this.IL.ZTq().toString());
            px.bg(this.zx);
            if (!z || px.isShowing()) {
                return;
            }
            px.show();
        }
    }

    private com.bytedance.sdk.openadsdk.bX.PX.bg ldr() {
        return new com.bytedance.sdk.openadsdk.bX.PX.bg() { // from class: com.bytedance.sdk.openadsdk.common.Lq.2
            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.common.Lq.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void IL() {
                com.bytedance.sdk.openadsdk.common.Lq.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bX() {
                com.bytedance.sdk.openadsdk.common.Lq.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.bX.PX.bg
            public void bg(int i, com.bytedance.sdk.openadsdk.FilterWord filterWord, java.lang.String str) {
                com.bytedance.sdk.openadsdk.common.Lq.this.iR.bX(str);
                com.bytedance.sdk.openadsdk.common.Lq.this.setVisibility(0);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.iR;
        if (eoVar != null) {
            eoVar.bg();
        }
    }
}
