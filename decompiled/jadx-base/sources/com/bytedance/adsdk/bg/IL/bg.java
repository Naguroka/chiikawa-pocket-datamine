package com.bytedance.adsdk.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static final com.bytedance.adsdk.bg.IL.bX.bg bg;
    private final com.bytedance.adsdk.bg.IL.bX.bg IL;
    private com.bytedance.adsdk.bg.IL.IL.bg bX;
    private java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> eqN = new java.util.LinkedList();
    private java.lang.String zx;

    static {
        int i = 8;
        com.bytedance.adsdk.bg.IL.bX.bg.ldr[] ldrVarArr = {new com.bytedance.adsdk.bg.IL.bX.bg.eo(), new com.bytedance.adsdk.bg.IL.bX.bg.eqN(), new com.bytedance.adsdk.bg.IL.bX.bg.WR(), new com.bytedance.adsdk.bg.IL.bX.bg.IL(), new com.bytedance.adsdk.bg.IL.bX.bg.zx(), new com.bytedance.adsdk.bg.IL.bX.bg.bg(), new com.bytedance.adsdk.bg.IL.bX.bg.iR(), new com.bytedance.adsdk.bg.IL.bX.bg.bX(), new com.bytedance.adsdk.bg.IL.bX.bg.Kg()};
        final com.bytedance.adsdk.bg.IL.bX.bg bgVar = new com.bytedance.adsdk.bg.IL.bX.bg() { // from class: com.bytedance.adsdk.bg.IL.bg.1
            @Override // com.bytedance.adsdk.bg.IL.bX.bg
            public int bg(java.lang.String str, int i2, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final com.bytedance.adsdk.bg.IL.bX.bg.ldr ldrVar = ldrVarArr[i];
            i--;
            bgVar = new com.bytedance.adsdk.bg.IL.bX.bg() { // from class: com.bytedance.adsdk.bg.IL.bg.2
                @Override // com.bytedance.adsdk.bg.IL.bX.bg
                public int bg(java.lang.String str, int i2, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque) {
                    return ldrVar.bg(str, i2, deque, bgVar);
                }
            };
        }
        bg = bgVar;
    }

    private bg(java.lang.String str, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        this.IL = bgVar;
        this.zx = str;
        try {
            bg();
        } catch (java.lang.Exception e) {
            throw new com.bytedance.adsdk.bg.bg.IL(str, e);
        }
    }

    public static com.bytedance.adsdk.bg.IL.bg bg(java.lang.String str) {
        return new com.bytedance.adsdk.bg.IL.bg(str, bg);
    }

    private void bg() {
        int length = this.zx.length();
        int i = 0;
        while (i < length) {
            int iBg = this.IL.bg(this.zx, i, this.eqN);
            if (iBg == i) {
                throw new java.lang.IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.zx.substring(0, i));
            }
            i = iBg;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.bytedance.adsdk.bg.IL.IL.bg bgVarPollFirst = this.eqN.pollFirst();
            if (bgVarPollFirst != null) {
                arrayList.add(0, bgVarPollFirst);
            } else {
                this.bX = com.bytedance.adsdk.bg.IL.zx.IL.bg(arrayList, this.zx, i);
                this.eqN = null;
                return;
            }
        }
    }

    public <T> T bg(org.json.JSONObject jSONObject) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("default_key", jSONObject);
        return (T) bg(map);
    }

    public <T> T bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        return (T) this.bX.bg(map);
    }
}
