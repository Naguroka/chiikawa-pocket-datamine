package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends android.widget.ScrollView {
    private final com.bytedance.sdk.openadsdk.core.zx.zx IL;
    private final com.bytedance.sdk.openadsdk.bX.eo bg;

    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        super(context);
        this.bg = eoVar;
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        this.IL = zxVar;
        zxVar.setOrientation(1);
        addView(zxVar, new android.widget.FrameLayout.LayoutParams(-1, -2));
        if (eoVar.Kg() == 0) {
            bg();
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void bg() {
        if (this.bg.Kg() != 0) {
            return;
        }
        this.bg.bg(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext()), com.bytedance.sdk.openadsdk.utils.ZQc.eqN(getContext()));
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        java.util.List<com.bytedance.sdk.openadsdk.FilterWord> listBX = bX(list);
        if (listBX == null) {
            return;
        }
        IL(listBX);
    }

    private void IL(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        this.IL.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.openadsdk.FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.IL.addView(new com.bytedance.sdk.openadsdk.bX.iR(getContext(), filterWord, this.bg));
            }
            if (i < list.size() - 1) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), this.bg.WR() ? 16.0f : 8.0f);
                layoutParams.topMargin = iBX;
                layoutParams.bottomMargin = iBX;
                this.IL.addView(new com.bytedance.sdk.openadsdk.bX.VB(getContext()), layoutParams);
            }
        }
    }

    private static java.util.List<com.bytedance.sdk.openadsdk.FilterWord> bX(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).hasSecondOptions()) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i2 <= list.size()) {
            i = i2;
        }
        com.bytedance.sdk.openadsdk.FilterWord filterWord = list.get(i);
        java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it = list.iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.openadsdk.FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }
}
