package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class Fy {
    private android.widget.TextView IL;
    private android.view.ViewGroup Kg;
    private android.content.Context bX;
    private android.view.View bg;
    private com.bytedance.sdk.openadsdk.core.Ta.IL.bg eqN;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL iR;
    private boolean ldr = false;
    private com.bytedance.sdk.openadsdk.core.widget.Fy.IL zx;

    public interface IL {
        void VB();

        boolean eo();
    }

    public enum bg {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public void bg(android.content.Context context, android.view.ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof android.view.ViewGroup)) {
            return;
        }
        this.Kg = viewGroup;
        this.bX = com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext();
    }

    private void bg(android.content.Context context, android.view.View view, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParamsBg;
        if (context == null || view == null || this.bg != null || (layoutParamsBg = bg(this.Kg)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.Ta.Lq lq = new com.bytedance.sdk.openadsdk.Ta.Lq(context);
        this.bg = lq;
        lq.setLayoutParams(layoutParamsBg);
        this.Kg.addView(this.bg);
        this.IL = (android.widget.TextView) this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.IE);
        android.view.View viewFindViewById = this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Vm);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Fy.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    com.bytedance.sdk.openadsdk.core.widget.Fy.this.bX();
                    if (com.bytedance.sdk.openadsdk.core.widget.Fy.this.eqN != null) {
                        com.bytedance.sdk.openadsdk.core.widget.Fy.this.eqN.bg(com.bytedance.sdk.openadsdk.core.widget.Fy.bg.START_VIDEO, (java.lang.String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private android.view.ViewGroup.LayoutParams bg(android.view.ViewGroup viewGroup) {
        if (viewGroup instanceof android.widget.RelativeLayout) {
            return new android.widget.RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof android.widget.LinearLayout) {
            return new android.widget.LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof android.widget.FrameLayout) {
            return new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bg bgVar, com.bytedance.sdk.openadsdk.core.widget.Fy.IL il) {
        this.zx = il;
        this.eqN = bgVar;
    }

    private void IL() {
        this.iR = null;
    }

    public boolean bg(int i, com.bykv.vk.openvk.bg.bg.bg.bX.IL il, boolean z) {
        android.content.Context context = this.bX;
        if (context == null || il == null) {
            return true;
        }
        bg(context, this.Kg, z);
        this.iR = il;
        if (i == 1 || i == 2) {
            return bg(i);
        }
        return true;
    }

    private boolean bg(int i) {
        com.bytedance.sdk.openadsdk.core.widget.Fy.IL il;
        if (bg() || this.ldr) {
            return true;
        }
        if (this.eqN != null && (il = this.zx) != null) {
            if (il.eo()) {
                this.eqN.zx(null, null);
            }
            this.eqN.bg(com.bytedance.sdk.openadsdk.core.widget.Fy.bg.PAUSE_VIDEO, (java.lang.String) null);
        }
        bg(this.iR, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        if (this.bX == null) {
            return;
        }
        eqN();
    }

    public void bg(boolean z) {
        if (z) {
            IL();
        }
        eqN();
    }

    public boolean bg() {
        android.view.View view = this.bg;
        return view != null && view.getVisibility() == 0;
    }

    private void eqN() {
        android.view.View view = this.bg;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void bg(com.bykv.vk.openvk.bg.bg.bg.bX.IL il, boolean z) {
        android.view.View view;
        java.lang.String str;
        android.view.View view2;
        if (il == null || (view = this.bg) == null || this.bX == null || view.getVisibility() == 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Fy.IL il2 = this.zx;
        if (il2 != null) {
            il2.VB();
        }
        double dCeil = java.lang.Math.ceil((il.zx() * 1.0d) / 1048576.0d);
        if (z) {
            str = java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(this.bX, "tt_video_without_wifi_tips"), java.lang.Float.valueOf(java.lang.Double.valueOf(dCeil).floatValue()));
        } else {
            str = com.bytedance.sdk.component.utils.Fy.bg(this.bX, "tt_video_without_wifi_tips") + com.bytedance.sdk.component.utils.Fy.bg(this.bX, "tt_video_bytesize");
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.bg, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.IL, str);
        android.util.Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.bg) || (view2 = this.bg) == null) {
            return;
        }
        view2.bringToFront();
        android.util.Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
