package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc {
    java.util.List<com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN> bg = new java.util.ArrayList();

    public IL(android.view.View view, java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> list) {
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> it = list.iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN eqnBg = com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX.bg().bg(view, it.next());
            if (eqnBg != null) {
                this.bg.add(eqnBg);
            }
        }
    }

    public void bg() {
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN> it = this.bg.iterator();
        while (it.hasNext()) {
            try {
                it.next().bX();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    public void IL() {
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN> it = this.bg.iterator();
        while (it.hasNext()) {
            try {
                it.next().IL();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
