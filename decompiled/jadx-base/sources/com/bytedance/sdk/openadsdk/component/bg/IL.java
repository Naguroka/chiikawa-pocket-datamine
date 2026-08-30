package com.bytedance.sdk.openadsdk.component.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static com.bytedance.sdk.openadsdk.component.bg.bg bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.app.Activity activity, com.bytedance.sdk.openadsdk.component.Kg.bg bgVar) {
        com.bytedance.sdk.openadsdk.component.bg.bg bgVar2 = new com.bytedance.sdk.openadsdk.component.bg.bg(activity.getApplicationContext(), tuv, "open_ad", 4, bgVar);
        bgVar2.bg(activity.findViewById(android.R.id.content));
        bgVar2.IL(activity.findViewById(520093713));
        bg(activity.getApplicationContext(), tuv, bgVar2);
        bg(bgVar2, tuv);
        return bgVar2;
    }

    public static com.bytedance.sdk.openadsdk.core.Kg.WR bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.app.Activity activity, final com.bytedance.sdk.openadsdk.component.Kg.bg bgVar, com.bytedance.sdk.openadsdk.component.WR.IL il) {
        com.bytedance.sdk.openadsdk.core.Kg.WR wr = new com.bytedance.sdk.openadsdk.core.Kg.WR(activity, tuv, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.bg.IL.1
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                java.util.HashMap map = new java.util.HashMap();
                map.put("duration", java.lang.Long.valueOf(bgVar.IL()));
                bg(map);
                super.bg(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        wr.bg(il);
        bg(activity.getApplicationContext(), tuv, wr);
        bg(wr, tuv);
        return wr;
    }

    public static com.bytedance.sdk.openadsdk.core.Kg.Kg IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.app.Activity activity, final com.bytedance.sdk.openadsdk.component.Kg.bg bgVar, com.bytedance.sdk.openadsdk.component.WR.IL il) {
        com.bytedance.sdk.openadsdk.core.Kg.Kg kg = new com.bytedance.sdk.openadsdk.core.Kg.Kg(activity.getApplicationContext(), tuv, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.bg.IL.2
            @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                java.util.HashMap map = new java.util.HashMap();
                map.put("duration", java.lang.Long.valueOf(bgVar.IL()));
                bg(map);
                super.bg(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        kg.bg((android.view.View) il);
        bg(activity.getApplicationContext(), tuv, kg);
        bg(kg, tuv);
        return kg;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.IL.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("click_area", java.lang.Integer.valueOf(tuv.PX()));
        map.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) ? 3 : 1));
        il.bg(map);
    }

    private static void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.IL.IL il) {
        if (tuv == null || tuv.jz() != 4) {
            return;
        }
        il.bg(com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(context, tuv, "open_ad"));
    }
}
