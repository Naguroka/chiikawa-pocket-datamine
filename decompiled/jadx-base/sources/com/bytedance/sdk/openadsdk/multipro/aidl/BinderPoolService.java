package com.bytedance.sdk.openadsdk.multipro.aidl;

/* JADX INFO: loaded from: classes4.dex */
public class BinderPoolService extends android.app.Service {
    private static boolean bX;
    public static volatile boolean bg;
    private final android.os.Binder IL = new com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.bg();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.bytedance.sdk.openadsdk.core.VzQ.IL(getApplicationContext());
        bg = true;
        if (!bX) {
            com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.this.getApplicationContext());
                }
            });
        }
        bX = true;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.IL;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public static class bg extends com.bytedance.sdk.openadsdk.IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public android.os.IBinder queryBinder(int i) throws android.os.RemoteException {
            if (i == 0) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR.bg();
            }
            if (i == 1) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx.bg();
            }
            if (i == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX.bg();
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
        }
    }
}
