package com.bytedance.sdk.openadsdk.multipro.aidl;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static final com.bytedance.sdk.openadsdk.multipro.aidl.bg IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg();
    private com.bytedance.sdk.openadsdk.multipro.aidl.IL bX;
    private com.bytedance.sdk.openadsdk.IBinderPool bg;
    private long eqN = 0;
    private final android.content.ServiceConnection zx = new android.content.ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.bg.2
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.bg.2.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bg = com.bytedance.sdk.openadsdk.IBinderPool.Stub.asInterface(iBinder);
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bg.asBinder().linkToDeath(com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.ldr, 0);
                    } catch (android.os.RemoteException e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.BinderPool", "onServiceConnected throws :", e);
                    }
                    java.lang.System.currentTimeMillis();
                    long unused = com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.eqN;
                    if (com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bX != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bX.onServiceConnected();
                    }
                }
            }, 5);
        }
    };
    private final android.os.IBinder.DeathRecipient ldr = new android.os.IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.bg.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.bg.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bg.asBinder().isBinderAlive()) {
                            com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bg.asBinder().unlinkToDeath(com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.ldr, 0);
                        }
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.BinderPool", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bg = null;
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.eqN();
                }
            }, 5);
        }
    };

    private bg() {
        eqN();
    }

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg bg() {
        return IL;
    }

    public void IL() {
        try {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            contextBg.startService(new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.class));
        } catch (java.lang.Exception unused) {
        }
    }

    public void bX() {
        try {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            contextBg.bindService(new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.class), this.zx, 1);
            this.eqN = java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.multipro.aidl.IL il) {
        this.bX = il;
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bX != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.bg.this.bX.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public android.os.IBinder bg(int i) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                try {
                    com.bytedance.sdk.openadsdk.IBinderPool iBinderPool = this.bg;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i);
                    }
                    return null;
                } catch (android.os.RemoteException e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.BinderPool", e.getMessage());
                    com.bytedance.sdk.openadsdk.utils.ayS.Kg("queryBinder error");
                    return null;
                }
            }
            if (i == 0) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR.bg();
            }
            if (i == 1) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx.bg();
            }
            if (i == 5) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.IL();
            }
            if (i == 6) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN.bg();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL.bg();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bX();
        }
    }
}
