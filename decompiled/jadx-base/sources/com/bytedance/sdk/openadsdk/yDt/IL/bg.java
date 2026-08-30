package com.bytedance.sdk.openadsdk.yDt.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.component.Kg.bX {
    @Override // com.bytedance.sdk.component.Kg.bX
    public void bg(final com.bytedance.sdk.component.Kg.IL.bg bgVar) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("stats_sdk_thread_num", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.IL.bg.1
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                com.bytedance.sdk.component.Kg.IL.bg bgVar2;
                if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().ApA() || (bgVar2 = bgVar) == null || bgVar2.bg() == null) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("stats_sdk_thread_num").IL(bgVar.bg().toString());
            }
        });
    }
}
