package com.bytedance.sdk.openadsdk.xxp;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.component.iR.bX.IL {
    public static java.lang.String bg = "sp_multi_ttadnet_config";
    private final android.content.Context IL;

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public java.lang.String IL() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public java.lang.String bX() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public android.location.Address bg(android.content.Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public int eqN() {
        return com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE;
    }

    public IL(android.content.Context context) {
        this.IL = context;
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public int bg() {
        return java.lang.Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public java.lang.String zx() {
        return com.bytedance.sdk.openadsdk.core.PX.bg(this.IL);
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public java.lang.String bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL(bg, str, str2);
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public void bg(android.content.Context context, java.util.Map<java.lang.String, ?> map) {
        if (map != null) {
            try {
                for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
                    java.lang.Object value = entry.getValue();
                    if (value instanceof java.lang.Integer) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(bg, entry.getKey(), (java.lang.Integer) value);
                    } else if (value instanceof java.lang.Long) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(bg, entry.getKey(), (java.lang.Long) value);
                    } else if (value instanceof java.lang.Float) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(bg, entry.getKey(), (java.lang.Float) value);
                    } else if (value instanceof java.lang.Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(bg, entry.getKey(), (java.lang.Boolean) value);
                    } else if (value instanceof java.lang.String) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(bg, entry.getKey(), (java.lang.String) value);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.iR.bX.IL
    public java.lang.String[] ldr() {
        java.lang.String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        java.lang.String strCQc = com.bytedance.sdk.openadsdk.core.VzQ.eqN().CQc();
        if (!android.text.TextUtils.isEmpty(strCQc)) {
            return ("SG".equals(strCQc) || "CN".equals(strCQc)) ? new java.lang.String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int iVb = com.bytedance.sdk.openadsdk.utils.ayS.vb();
        return (iVb == 2 || iVb == 1) ? new java.lang.String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
