package com.bytedance.sdk.openadsdk.WR;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.component.zx.LZ {
    private static int bg;
    private long IL = 0;
    private long bX;
    private boolean eqN;
    private final java.lang.String zx;

    public zx() {
        bg++;
        this.zx = "image_request_" + bg;
    }

    @Override // com.bytedance.sdk.component.zx.LZ
    public void bg(java.lang.String str, com.bytedance.sdk.component.zx.WR wr) {
        if (!this.eqN) {
            wr.bg();
            wr.IL();
            wr.bX();
            this.eqN = true;
        }
        this.IL = java.lang.System.currentTimeMillis();
        bX(str, wr);
    }

    @Override // com.bytedance.sdk.component.zx.LZ
    public void IL(java.lang.String str, com.bytedance.sdk.component.zx.WR wr) {
        this.bX += java.lang.System.currentTimeMillis() - this.IL;
        bX(str, wr);
    }

    private java.lang.String bX(java.lang.String str, com.bytedance.sdk.component.zx.WR wr) {
        com.bytedance.sdk.component.zx.bX.bg bgVarVzQ;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "success":
                    return "success";
                case "raw_cache":
                    return "raw cache";
                case "image_type":
                    return "image type：";
                case "disk_cache":
                    return "disk cache";
                case "decode":
                    return "decode";
                case "failed":
                    if (!(wr instanceof com.bytedance.sdk.component.zx.bX.bX) || (bgVarVzQ = ((com.bytedance.sdk.component.zx.bX.bX) wr).VzQ()) == null) {
                        return com.ironsource.y8.f.e;
                    }
                    java.lang.Throwable thBX = bgVarVzQ.bX();
                    return "fail：code:" + bgVarVzQ.bg() + ", msg:" + bgVarVzQ.IL() + ", exception:" + (thBX != null ? thBX.getMessage() : "null \r\n");
                case "check_duplicate":
                    return "duplicate request";
                case "memory_cache":
                    return "memory cache";
                case "net_request":
                    return "net request";
                case "generate_key":
                    return "generate key:" + wr.zx();
                case "cache_policy":
                    return "cache policy";
            }
        }
        return str;
    }
}
