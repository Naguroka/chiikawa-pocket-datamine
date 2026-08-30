package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    private static final java.util.Map<java.lang.Integer, com.bytedance.sdk.openadsdk.rri.bg.IL> bg = new java.util.concurrent.ConcurrentHashMap();

    public static void bg(android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        if (view == null || tuv == null || tuv.JxS()) {
            return;
        }
        boolean zBX = bX(tuv);
        if (com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) && bgVar != null) {
            bgVar.bg = -1;
        }
        bg(bg(view, tuv, zBX, bgVar));
    }

    private static boolean bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
        return (((("open_ad".equals(strBg) || "fullscreen_interstitial_ad".equals(strBg) || "rewarded_video".equals(strBg)) && !com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) && tuv.vb() != 5) && tuv.vb() != 33) && com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) && tuv.Dxa() != null;
    }

    private static com.bytedance.sdk.openadsdk.rri.bg.IL bg(android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        if (view == null || tuv == null || tuv.Ys() == null) {
            return null;
        }
        java.lang.Integer numIL = IL(tuv);
        java.util.Map<java.lang.Integer, com.bytedance.sdk.openadsdk.rri.bg.IL> map = bg;
        if (map.containsKey(numIL)) {
            com.bytedance.sdk.openadsdk.rri.bg.IL il = map.get(numIL);
            if (il != null) {
                il.bg(view);
            }
            return il;
        }
        com.bytedance.sdk.openadsdk.rri.bg.IL ilBg = com.bytedance.sdk.openadsdk.rri.bg.IL.bg(z, numIL, view, tuv, bgVar);
        map.put(numIL, ilBg);
        return ilBg;
    }

    private static void bg(com.bytedance.sdk.openadsdk.rri.bg.IL il) {
        if (il == null) {
            return;
        }
        il.bg();
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        if (tuv == null || tuv.Ys() == null) {
            return;
        }
        bg(bg.get(IL(tuv)), i);
    }

    public static void bg(com.bytedance.sdk.openadsdk.rri.bg.IL il, int i) {
        if (il == null) {
            return;
        }
        il.bg(i);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || tuv.Ys() == null) {
            return;
        }
        java.lang.Integer numIL = IL(tuv);
        java.util.Map<java.lang.Integer, com.bytedance.sdk.openadsdk.rri.bg.IL> map = bg;
        com.bytedance.sdk.openadsdk.rri.bg.IL il = map.get(numIL);
        if (il != null) {
            il.eo();
        }
        IL(numIL);
        if (map.size() <= 0) {
            com.bytedance.sdk.openadsdk.rri.bg.iR.bg();
        }
    }

    public static com.bytedance.sdk.openadsdk.rri.bg.IL bg(java.lang.Integer num) {
        return bg.get(num);
    }

    public static void IL(java.lang.Integer num) {
        bg.remove(num);
    }

    public static java.lang.Integer IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return java.lang.Integer.valueOf((tuv.waE() + tuv.Ys()).hashCode());
    }

    public static class bg {
        public int IL = -1;
        public int bg;

        public bg(int i) {
            this.bg = i;
        }
    }
}
