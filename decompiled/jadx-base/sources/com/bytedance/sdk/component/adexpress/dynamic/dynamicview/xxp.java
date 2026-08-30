package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class xxp extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr implements com.bytedance.sdk.component.adexpress.dynamic.IL {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public boolean zx() {
        return true;
    }

    public xxp(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Lq = new android.widget.ImageView(context);
        this.Lq.setTag(5);
        addView(this.Lq, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().JAA()) {
            return;
        }
        this.Lq.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.yDt.mIsMute);
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.component.adexpress.eqN.bX.bg(getContext(), this.PX);
            if (drawableBg != null) {
                ((android.widget.ImageView) this.Lq).setBackground(drawableBg);
            }
        } else {
            ((android.widget.ImageView) this.Lq).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.eqN.WR.bg(0, java.lang.Integer.valueOf(this.PX.DDQ()), new int[]{this.Kg / 2}, null, null, null));
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.IL
    public void setSoundMute(boolean z) {
        int iEqN;
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            if (z) {
                iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_reward_full_mute");
            } else {
                iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_mute");
        } else {
            iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_unmute");
        }
        ((android.widget.ImageView) this.Lq).setImageResource(iEqN);
        if (((android.widget.ImageView) this.Lq).getDrawable() != null) {
            ((android.widget.ImageView) this.Lq).getDrawable().setAutoMirrored(true);
        }
    }
}
