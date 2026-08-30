package com.bytedance.sdk.openadsdk.multipro.aidl.IL;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.bg.zx.bg bg;

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws android.os.RemoteException {
    }

    public eqN(com.bytedance.sdk.openadsdk.bg.zx.bg bgVar) {
        this.bg = bgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        this.bg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg.bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg.IL();
                }
                com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z, final int i, final java.lang.String str, final int i2, final java.lang.String str2) throws android.os.RemoteException {
        if (this.bg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg != null) {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN.this.bg.bg(z, i, str, i2, str2);
                }
            }
        });
    }
}
