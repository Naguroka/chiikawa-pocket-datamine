package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eo implements com.bytedance.adsdk.bg.IL.IL.bg {
    private java.lang.String IL;
    private com.bytedance.adsdk.bg.IL.bg.bg bX;
    private com.bytedance.adsdk.bg.IL.IL.bg[] bg;

    public eo(java.lang.String str) {
        this.IL = str;
    }

    public void bg(com.bytedance.adsdk.bg.IL.IL.bg[] bgVarArr) {
        this.bg = bgVarArr;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        com.bytedance.adsdk.bg.IL.bg.bg bgVar = new com.bytedance.adsdk.bg.IL.bg.bg();
        this.bX = bgVar;
        bgVar.bg(this.IL);
        java.lang.Object[] objArr = new java.lang.Object[this.bg.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.bg.IL.IL.bg[] bgVarArr = this.bg;
            if (i < bgVarArr.length) {
                com.bytedance.adsdk.bg.IL.IL.bg bgVar2 = bgVarArr[i];
                if (bgVar2 != null) {
                    objArr[i] = bgVar2.bg(map);
                }
                i++;
            } else {
                this.bX.bg(objArr);
                return com.bytedance.adsdk.bg.iR.bg(this.IL).bg(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.IL.METHOD;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.IL).append("(");
        com.bytedance.adsdk.bg.IL.IL.bg[] bgVarArr = this.bg;
        if (bgVarArr != null && bgVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.bg.IL.IL.bg[] bgVarArr2 = this.bg;
                if (i >= bgVarArr2.length) {
                    break;
                }
                sb.append(bgVarArr2[i].IL()).append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
