package com.bytedance.sdk.component.adexpress.zx;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static int Kg = 10;
    private static volatile com.bytedance.sdk.component.adexpress.zx.zx WR = null;
    private static int ldr = 10;
    private static final byte[] zx = new byte[0];
    private final java.util.concurrent.atomic.AtomicBoolean iR = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.List<com.bytedance.sdk.component.WR.eqN> bg = new java.util.ArrayList();
    private java.util.List<com.bytedance.sdk.component.WR.eqN> IL = new java.util.ArrayList();
    private java.util.Map<java.lang.Integer, com.bytedance.sdk.component.adexpress.zx.bX> bX = new java.util.HashMap();
    private java.util.Map<java.lang.Integer, com.bytedance.sdk.component.adexpress.zx.eqN> eqN = new java.util.HashMap();

    private zx() {
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        if (bXVarBX != null) {
            ldr = bXVarBX.eo();
            Kg = bXVarBX.VB();
        }
    }

    public static com.bytedance.sdk.component.adexpress.zx.zx bg() {
        if (WR == null) {
            synchronized (com.bytedance.sdk.component.adexpress.zx.zx.class) {
                if (WR == null) {
                    WR = new com.bytedance.sdk.component.adexpress.zx.zx();
                }
            }
        }
        return WR;
    }

    public com.bytedance.sdk.component.WR.eqN bg(android.content.Context context, java.lang.String str) {
        if (eqN() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.eqN.zx.bg(str) && eqN() <= 1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(eqN());
            return null;
        }
        com.bytedance.sdk.component.WR.eqN eqnRemove = this.IL.remove(0);
        if (eqnRemove == null) {
            return null;
        }
        try {
            android.content.Context context2 = eqnRemove.getContext();
            if (context2 instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                eqnRemove.setRecycler(false);
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                java.lang.Integer.valueOf(eqN());
            }
            return eqnRemove;
        } catch (java.lang.Throwable unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            java.lang.Integer.valueOf(eqN());
            return null;
        }
    }

    public void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        if (this.IL.size() >= Kg) {
            try {
                android.content.Context context = eqn.getContext();
                if (context instanceof android.content.MutableContextWrapper) {
                    ((android.content.MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                eqn.PX();
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                th.getMessage();
                return;
            }
        }
        if (this.IL.contains(eqn)) {
            return;
        }
        try {
            android.content.Context context2 = eqn.getContext();
            if (context2 instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                eqn.setRecycler(true);
                this.IL.add(eqn);
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                java.lang.Integer.valueOf(eqN());
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Object[] objArr3 = new java.lang.Object[4];
            java.lang.Integer.valueOf(eqN());
            th2.getMessage();
        }
    }

    public void IL(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        iR(eqn);
        eqn.b_("SDK_INJECT_GLOBAL");
        ldr(eqn);
        bg(eqn);
    }

    public com.bytedance.sdk.component.WR.eqN IL(android.content.Context context, java.lang.String str) {
        if (bX() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.eqN.zx.bg(str) && bX() <= 1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(bX());
            return null;
        }
        com.bytedance.sdk.component.WR.eqN eqnRemove = this.bg.remove(0);
        if (eqnRemove == null) {
            return null;
        }
        try {
            android.content.Context context2 = eqnRemove.getContext();
            if (context2 instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                eqnRemove.setRecycler(false);
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                java.lang.Integer.valueOf(bX());
            }
            return eqnRemove;
        } catch (java.lang.Throwable unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            java.lang.Integer.valueOf(bX());
            return null;
        }
    }

    public void bX(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        iR(eqn);
        eqn.b_("SDK_INJECT_GLOBAL");
        ldr(eqn);
        eqN(eqn);
    }

    public void eqN(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        if (this.bg.size() >= ldr) {
            try {
                android.content.Context context = eqn.getContext();
                if (context instanceof android.content.MutableContextWrapper) {
                    ((android.content.MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                eqn.PX();
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                th.getMessage();
                return;
            }
        }
        if (this.bg.contains(eqn)) {
            return;
        }
        try {
            android.content.Context context2 = eqn.getContext();
            if (context2 instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                eqn.setRecycler(true);
                this.bg.add(eqn);
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                java.lang.Integer.valueOf(bX());
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Object[] objArr3 = new java.lang.Object[4];
            java.lang.Integer.valueOf(bX());
            th2.getMessage();
        }
    }

    public boolean zx(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return false;
        }
        try {
            android.content.Context context = eqn.getContext();
            if (context instanceof android.content.MutableContextWrapper) {
                ((android.content.MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            eqn.PX();
            return true;
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            th.getMessage();
            return true;
        }
    }

    public void IL() {
        for (com.bytedance.sdk.component.WR.eqN eqn : this.bg) {
            if (eqn != null) {
                try {
                    android.content.Context context = eqn.getContext();
                    if (context instanceof android.content.MutableContextWrapper) {
                        ((android.content.MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    eqn.PX();
                } catch (java.lang.Throwable th) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    th.getMessage();
                }
            }
        }
        this.bg.clear();
        for (com.bytedance.sdk.component.WR.eqN eqn2 : this.IL) {
            if (eqn2 != null) {
                try {
                    android.content.Context context2 = eqn2.getContext();
                    if (context2 instanceof android.content.MutableContextWrapper) {
                        ((android.content.MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    eqn2.PX();
                } catch (java.lang.Throwable th2) {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    th2.getMessage();
                }
            }
        }
        this.IL.clear();
    }

    public int bX() {
        return this.bg.size();
    }

    public int eqN() {
        return this.IL.size();
    }

    private void iR(com.bytedance.sdk.component.WR.eqN eqn) {
        eqn.removeAllViews();
        eqn.bX();
        eqn.setWebChromeClient(null);
        eqn.setWebViewClient(null);
        eqn.setDownloadListener(null);
        eqn.setJavaScriptEnabled(true);
        eqn.setAppCacheEnabled(false);
        eqn.setSupportZoom(false);
        eqn.setUseWideViewPort(true);
        eqn.setJavaScriptCanOpenWindowsAutomatically(true);
        eqn.setDomStorageEnabled(true);
        eqn.setBuiltInZoomControls(false);
        eqn.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
        eqn.setLoadWithOverviewMode(false);
        eqn.setDefaultTextEncodingName(com.adjust.sdk.Constants.ENCODING);
        eqn.setDefaultFontSize(16);
    }

    public void bg(com.bytedance.sdk.component.WR.eqN eqn, com.bytedance.sdk.component.adexpress.zx.IL il) {
        if (eqn == null || il == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zx.bX bXVar = this.bX.get(java.lang.Integer.valueOf(eqn.hashCode()));
        if (bXVar != null) {
            bXVar.bg(il);
        } else {
            bXVar = new com.bytedance.sdk.component.adexpress.zx.bX(il);
            this.bX.put(java.lang.Integer.valueOf(eqn.hashCode()), bXVar);
        }
        eqn.bg(bXVar, "SDK_INJECT_GLOBAL");
    }

    public void ldr(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zx.bX bXVar = this.bX.get(java.lang.Integer.valueOf(eqn.hashCode()));
        if (bXVar != null) {
            bXVar.bg(null);
        }
        eqn.b_("SDK_INJECT_GLOBAL");
    }

    public void bg(android.webkit.WebView webView, com.bytedance.sdk.component.bg.Ja ja, java.lang.String str) {
        if (webView == null || ja == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zx.eqN eqn = this.eqN.get(java.lang.Integer.valueOf(webView.hashCode()));
        if (eqn != null) {
            eqn.bg(ja);
        } else {
            eqn = new com.bytedance.sdk.component.adexpress.zx.eqN(ja);
            this.eqN.put(java.lang.Integer.valueOf(webView.hashCode()), eqn);
        }
        webView.addJavascriptInterface(eqn, str);
    }

    public void bg(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zx.eqN eqn = this.eqN.get(java.lang.Integer.valueOf(webView.hashCode()));
        if (eqn != null) {
            eqn.bg(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void bg(int i) {
        synchronized (zx) {
            ldr = i;
        }
    }

    public void IL(int i) {
        synchronized (zx) {
            Kg = i;
        }
    }
}
