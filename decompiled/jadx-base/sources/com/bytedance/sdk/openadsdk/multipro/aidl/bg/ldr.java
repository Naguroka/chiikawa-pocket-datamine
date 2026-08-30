package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.component.ldr.bg.ldr.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr bg;

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr IL() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr();
                }
            }
        }
        return bg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr
    public java.util.Map bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.multipro.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(uri, strArr, str, strArr2, str2));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr
    public java.lang.String bg(android.net.Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return com.bytedance.sdk.openadsdk.multipro.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr
    public java.lang.String bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        android.net.Uri uriBg;
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg() && (uriBg = com.bytedance.sdk.openadsdk.multipro.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(uri, contentValues)) != null) {
            return uriBg.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr
    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return com.bytedance.sdk.openadsdk.multipro.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr
    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return com.bytedance.sdk.openadsdk.multipro.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
