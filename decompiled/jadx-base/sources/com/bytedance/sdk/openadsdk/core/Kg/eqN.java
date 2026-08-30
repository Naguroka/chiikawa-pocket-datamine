package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private static int IL;
    private static volatile com.bytedance.sdk.openadsdk.core.Kg.eqN bX;
    private final java.util.List<com.bytedance.sdk.openadsdk.core.Kg.zx> bg = new java.util.ArrayList();

    public static com.bytedance.sdk.openadsdk.core.Kg.eqN bg() {
        if (bX == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.Kg.eqN.class) {
                if (bX == null) {
                    bX = new com.bytedance.sdk.openadsdk.core.Kg.eqN();
                }
            }
        }
        return bX;
    }

    public com.bytedance.sdk.openadsdk.core.Kg.zx IL() {
        com.bytedance.sdk.openadsdk.core.Kg.zx zxVarRemove;
        if (bX() > 0 && (zxVarRemove = this.bg.remove(0)) != null) {
            return zxVarRemove;
        }
        return null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Kg.zx zxVar) {
        if (zxVar != null) {
            IL(zxVar);
        }
    }

    public void IL(com.bytedance.sdk.openadsdk.core.Kg.zx zxVar) {
        if (zxVar != null) {
            if (this.bg.size() >= IL) {
                zxVar.PX();
            } else {
                if (this.bg.contains(zxVar)) {
                    return;
                }
                bX(zxVar);
                this.bg.add(zxVar);
            }
        }
    }

    public int bX() {
        return this.bg.size();
    }

    public void bX(com.bytedance.sdk.openadsdk.core.Kg.zx zxVar) {
        if (zxVar == null || zxVar.getWebView() == null) {
            return;
        }
        if (zxVar.getParent() != null) {
            ((android.view.ViewGroup) zxVar.getParent()).removeView(zxVar);
        }
        try {
            zxVar.removeAllViews();
            zxVar.bX();
            zxVar.setWebChromeClient(null);
            zxVar.setWebViewClient(null);
            zxVar.setDownloadListener(null);
            zxVar.setDefaultTextEncodingName(com.adjust.sdk.Constants.ENCODING);
            zxVar.setAllowFileAccess(false);
            zxVar.setJavaScriptEnabled(true);
            zxVar.setAppCacheEnabled(true);
            zxVar.setDatabaseEnabled(true);
            zxVar.setSupportZoom(false);
            zxVar.getWebView().setLayerType(0, null);
            zxVar.setBackgroundColor(0);
            zxVar.getWebView().setHorizontalScrollBarEnabled(false);
            zxVar.getWebView().setHorizontalScrollbarOverlay(false);
            zxVar.getWebView().setVerticalScrollBarEnabled(false);
            zxVar.getWebView().setVerticalScrollbarOverlay(false);
            zxVar.bg(true);
            zxVar.eo();
            zxVar.setMixedContentMode(0);
        } catch (java.lang.Exception unused) {
        }
    }
}
