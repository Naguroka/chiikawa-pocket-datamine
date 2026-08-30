package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    private static android.graphics.drawable.Drawable IL;
    private static boolean bg;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ bX;
    private android.widget.TextView eqN;

    public void bg(com.bytedance.sdk.openadsdk.component.WR.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, float f, float f2, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        if (bXVar != null) {
            this.bX = bXVar.getHostAppIcon();
            this.eqN = bXVar.getHostAppName();
            android.view.View userInfo = bXVar.getUserInfo();
            if (bXVar instanceof com.bytedance.sdk.openadsdk.component.WR.eqN) {
                com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = this.bX;
                if (vzQ != null && (layoutParams2 = vzQ.getLayoutParams()) != null) {
                    if (tuv.xFs() == 1) {
                        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bX.getContext(), 40.0f);
                        layoutParams2.width = iBX;
                        layoutParams2.height = iBX;
                    } else {
                        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bX.getContext(), 30.0f);
                        layoutParams2.width = iBX2;
                        layoutParams2.height = iBX2;
                    }
                    this.bX.setLayoutParams(layoutParams2);
                }
                if (this.eqN != null) {
                    if (tuv.xFs() == 1) {
                        this.eqN.setTextSize(30.0f);
                    } else {
                        this.eqN.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (tuv.xFs() == 1) {
                        layoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.WR.Kg.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                    }
                });
            }
        }
    }

    public void bg() {
        java.lang.String strLdr = com.bytedance.sdk.openadsdk.core.WR.IL().ldr();
        if (android.text.TextUtils.isEmpty(strLdr)) {
            this.eqN.setVisibility(8);
        } else {
            this.eqN.setText(strLdr);
        }
        IL();
        try {
            android.graphics.drawable.Drawable drawable = IL;
            if (drawable == null) {
                this.bX.setVisibility(8);
                return;
            }
            this.bX.setImageDrawable(drawable);
            if (this.eqN.getVisibility() == 8) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.bX.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.bX.setLayoutParams(marginLayoutParams);
            }
        } catch (java.lang.Throwable unused) {
            this.bX.setVisibility(8);
        }
    }

    public void IL() {
        if (bg) {
            return;
        }
        try {
            int iIR = com.bytedance.sdk.openadsdk.core.WR.IL().iR();
            if (iIR != 0) {
                IL = com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources().getDrawable(iIR);
            }
            bg = true;
        } catch (java.lang.Throwable unused) {
            bg = true;
        }
    }

    public static android.graphics.drawable.Drawable bX() {
        return IL;
    }
}
