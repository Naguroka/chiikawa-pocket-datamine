package com.bytedance.sdk.openadsdk.multipro.aidl.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.bg.eqN.IL bg;

    public bg(com.bytedance.sdk.openadsdk.bg.eqN.IL il) {
        this.bg = il;
    }

    private void bg() {
        this.bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws android.os.RemoteException {
        bg();
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg.bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg.IL();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg.this.bg.bX();
                }
            }
        });
    }
}
