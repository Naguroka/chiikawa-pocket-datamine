package com.bytedance.sdk.openadsdk.multipro.aidl.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub {
    private final java.lang.String IL;
    private final com.bytedance.sdk.openadsdk.core.bX.eqN.bg bg;

    public IL(java.lang.String str, com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        this.IL = str;
        this.bg = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws android.os.RemoteException {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL.this.bg.bg();
                    com.bytedance.sdk.openadsdk.bX.eo.bg(6, com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL.this.IL);
                }
            }
        });
    }
}
