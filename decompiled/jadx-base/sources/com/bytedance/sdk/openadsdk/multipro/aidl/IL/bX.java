package com.bytedance.sdk.openadsdk.multipro.aidl.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.bg.bX.IL bg;

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws android.os.RemoteException {
    }

    public bX(com.bytedance.sdk.openadsdk.bg.bX.IL il) {
        this.bg = il;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        this.bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg.bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg.IL();
                }
                com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX.this.bg();
            }
        });
    }
}
