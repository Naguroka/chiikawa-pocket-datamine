package com.bytedance.adsdk.ugeno.WR.iR;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg extends com.bytedance.adsdk.ugeno.IL.bg<com.bytedance.adsdk.ugeno.WR.IL.bg> {
    public bg(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                IL(str, str2);
                break;
        }
    }
}
