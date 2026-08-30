package com.bytedance.sdk.openadsdk.core.act;

/* JADX INFO: loaded from: classes4.dex */
public class ActServiceConnection extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private com.bytedance.sdk.openadsdk.core.act.IL mConnectionCallback;

    public ActServiceConnection(com.bytedance.sdk.openadsdk.core.act.IL il) {
        this.mConnectionCallback = il;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        com.bytedance.sdk.openadsdk.core.act.IL il = this.mConnectionCallback;
        if (il != null) {
            il.bg(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.bytedance.sdk.openadsdk.core.act.IL il = this.mConnectionCallback;
        if (il != null) {
            il.bg();
        }
    }
}
