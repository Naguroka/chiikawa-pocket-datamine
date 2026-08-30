package com.bytedance.sdk.openadsdk.core.act;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.openadsdk.core.act.IL {
    public static void bg(android.content.Context context, java.lang.String str, androidx.browser.customtabs.CustomTabsIntent customTabsIntent, android.net.Uri uri) {
        customTabsIntent.intent.setPackage(str);
        customTabsIntent.launchUrl(context, uri);
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.IL
    public void bg(androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        throw null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.IL
    public void bg() {
        throw null;
    }
}
