package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.common.PX {
    public bX(android.content.Context context) {
        super(context);
        this.IL = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.PX
    public void bg() {
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bX.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.common.bX.this.bg != null) {
                    com.bytedance.sdk.openadsdk.common.bX.this.setVisibility(0);
                }
            }
        });
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, java.lang.String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, i, str2, android.os.SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.IL();
        }
    }
}
