package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private static volatile java.lang.String IL = "";
    private static java.lang.String bX = null;
    private static volatile java.lang.String bg = "";
    private static volatile int eqN;

    public static void bg() {
        try {
            com.google.android.gms.appset.AppSet.getClient(com.bytedance.sdk.openadsdk.core.VzQ.bg()).getAppSetIdInfo().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener<com.google.android.gms.appset.AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(com.google.android.gms.appset.AppSetIdInfo appSetIdInfo) {
                    java.lang.String unused = com.bytedance.sdk.openadsdk.core.settings.eqN.bg = java.lang.Integer.toString(appSetIdInfo.getScope());
                    java.lang.String unused2 = com.bytedance.sdk.openadsdk.core.settings.eqN.IL = appSetIdInfo.getId();
                    int unused3 = com.bytedance.sdk.openadsdk.core.settings.eqN.eqN = 1;
                }
            });
        } catch (java.lang.Throwable unused) {
            eqN = 2;
        }
    }

    public static java.lang.String IL() {
        if (eqN != 0) {
            return bg;
        }
        bg();
        return bg;
    }

    public static java.lang.String bX() {
        if (eqN != 0) {
            return IL;
        }
        bg();
        return IL;
    }

    public static java.lang.String eqN() {
        if (android.text.TextUtils.isEmpty(bX)) {
            bX = com.bytedance.sdk.openadsdk.core.VzQ.bg().getPackageManager().getInstallerPackageName(com.bytedance.sdk.openadsdk.utils.ayS.zx());
        }
        if (bX == null) {
            bX = "";
        }
        return bX;
    }
}
