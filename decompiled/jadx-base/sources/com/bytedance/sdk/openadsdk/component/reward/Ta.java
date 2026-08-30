package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
class Ta implements com.bytedance.sdk.openadsdk.TTClientBidding {
    private final com.bytedance.sdk.openadsdk.component.reward.ldr bg;

    Ta(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.bg = new com.bytedance.sdk.openadsdk.component.reward.ldr(context, bgVar);
    }

    public com.bytedance.sdk.openadsdk.component.reward.ldr bg() {
        return this.bg;
    }

    public void bg(boolean z) {
        this.bg.bg(z);
    }

    public void IL() {
        this.bg.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(java.lang.Double d) {
        this.bg.win(d);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(java.lang.Double d, java.lang.String str, java.lang.String str2) {
        this.bg.loss(d, str, str2);
    }
}
