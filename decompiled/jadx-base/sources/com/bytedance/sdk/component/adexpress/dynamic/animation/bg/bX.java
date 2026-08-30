package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static volatile com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX bg;

    private bX() {
    }

    public static com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX();
                }
            }
        }
        return bg;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN bg(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        if (bgVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((android.view.ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((android.view.ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.VB(view, bgVar);
        }
        if ("translate".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Lq(view, bgVar);
        }
        if ("ripple".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Kg(view, bgVar);
        }
        if ("marquee".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.iR(view, bgVar);
        }
        if ("waggle".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.xxp(view, bgVar);
        }
        if ("shine".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.PX(view, bgVar);
        }
        if ("swing".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.yDt(view, bgVar);
        }
        if ("fade".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bg(view, bgVar);
        }
        if ("rubIn".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo(view, bgVar);
        }
        if ("rotate".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.WR(view, bgVar);
        }
        if ("cutIn".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.ldr(view, bgVar);
        }
        if ("stretch".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Ta(view, bgVar);
        }
        if ("bounce".equals(bgVar.WR())) {
            return new com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx(view, bgVar);
        }
        return null;
    }
}
