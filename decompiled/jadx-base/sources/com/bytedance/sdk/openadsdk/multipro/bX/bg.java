package com.bytedance.sdk.openadsdk.multipro.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.multipro.bg {
    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.database.Cursor bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.net.Uri bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg() {
        return "t_frequent";
    }

    private static com.bytedance.sdk.component.ldr.bg.ldr eqN() {
        try {
            if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
                return com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static boolean bg(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            return false;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarEqN = eqN();
            if (ldrVarEqN != null) {
                return com.json.mediationsdk.metadata.a.g.equals(ldrVarEqN.bg(android.net.Uri.parse(zx() + "checkFrequency?rit=" + str)));
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static boolean IL() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            return false;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarEqN = eqN();
            if (ldrVarEqN != null) {
                return com.json.mediationsdk.metadata.a.g.equals(ldrVarEqN.bg(android.net.Uri.parse(zx() + "isSilent")));
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static java.lang.String bX() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarEqN = eqN();
            if (ldrVarEqN != null) {
                return ldrVarEqN.bg(android.net.Uri.parse(zx() + "maxRit"));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    private static java.lang.String zx() {
        return com.bytedance.sdk.openadsdk.multipro.eqN.IL + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg(android.net.Uri uri) {
        new java.lang.StringBuilder("get type uri: ").append(uri);
        java.lang.String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.iR.bg.bg().bg(uri.getQueryParameter("rit")) ? com.json.mediationsdk.metadata.a.g : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.iR.bg.bg().IL() ? com.json.mediationsdk.metadata.a.g : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.iR.bg.bg().bX();
        }
        return null;
    }
}
