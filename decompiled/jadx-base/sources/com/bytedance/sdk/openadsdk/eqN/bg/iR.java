package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
class iR implements com.bytedance.sdk.component.ldr.bg.zx.bX {
    private final com.bytedance.sdk.component.iR.IL.IL bg;

    public iR() {
        com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
        this.bg = ilBX;
        ilBX.bg(7);
        ilBX.bg("track_url");
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx.bX
    public void bg(java.lang.String str) {
        this.bg.IL(str);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        this.bg.IL(str, str2);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx.bX
    public com.bytedance.sdk.component.ldr.bg.zx.eqN bg() {
        return new com.bytedance.sdk.openadsdk.eqN.bg.WR(this.bg.bg());
    }
}
