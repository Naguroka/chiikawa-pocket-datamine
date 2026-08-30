package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.component.Kg.Kg {
    private final java.util.List<? extends com.bytedance.sdk.component.Kg.Kg> bg;

    public IL(java.lang.String str, java.util.List<? extends com.bytedance.sdk.component.Kg.Kg> list) {
        super(str);
        this.bg = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<? extends com.bytedance.sdk.component.Kg.Kg> list;
        if (com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()) != 0 && (list = this.bg) != null) {
            java.util.Iterator<? extends com.bytedance.sdk.component.Kg.Kg> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.utils.VJ.bg(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.iR.bg().removeCallbacks(this);
        } catch (java.lang.Exception unused) {
        }
    }
}
