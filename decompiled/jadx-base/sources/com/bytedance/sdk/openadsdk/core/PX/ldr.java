package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private com.bytedance.sdk.openadsdk.core.PX.iR IL;
    final java.util.Set<android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose>> bg = new java.util.HashSet();

    private ldr() {
        com.bytedance.sdk.openadsdk.core.PX.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
    }

    private android.os.Handler zx() {
        return com.bytedance.sdk.component.utils.iR.IL();
    }

    public static com.bytedance.sdk.openadsdk.core.PX.ldr bg() {
        return new com.bytedance.sdk.openadsdk.core.PX.ldr();
    }

    public void bg(final android.webkit.WebView webView) {
        if (webView == null || this.IL != null) {
            return;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(webView);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.webkit.WebView webView) {
        try {
            if (this.IL == null) {
                this.IL = com.bytedance.sdk.openadsdk.core.PX.Kg.bg(webView);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL("createWebViewSession failed : ".concat(java.lang.String.valueOf(th)));
            java.util.HashMap map = new java.util.HashMap();
            map.put("scene", "createWebViewSession");
            map.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, th.getMessage());
            com.bytedance.sdk.openadsdk.core.PX.zx.bg(map);
        }
    }

    public void bg(final android.view.View view, final java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set) {
        if (this.IL != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(view, set);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(view, (java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo>) set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.view.View view, java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set) {
        try {
            if (this.IL == null) {
                this.IL = com.bytedance.sdk.openadsdk.core.PX.Kg.bg(view, set);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL("createVideoSession failed : ".concat(java.lang.String.valueOf(th)));
            java.util.HashMap map = new java.util.HashMap();
            map.put("scene", "createVideoSession");
            map.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, th.getMessage());
            com.bytedance.sdk.openadsdk.core.PX.zx.bg(map);
        }
    }

    public void IL() {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            ldr();
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.5
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.ldr();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() {
        if (this.IL != null) {
            try {
                bg((android.view.View) null, (com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose) null);
                this.IL.IL();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(final boolean z, final float f) {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(z, f);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.6
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z, float f) {
        if (this.IL != null) {
            try {
                bg((android.view.View) null, (com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose) null);
                this.IL.bg(z, f);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bX() {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            iR();
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.iR();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iR() {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        if (iRVar != null) {
            try {
                iRVar.eqN();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void eqN() {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            Kg();
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.8
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.Kg();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kg() {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        if (iRVar != null) {
            try {
                iRVar.bX();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(final android.view.View view, final com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(view, friendlyObstructionPurpose);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.9
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose) {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        try {
            if (iRVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.bg.add(new android.util.Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                iRVar.bg(view, friendlyObstructionPurpose);
            }
            if (this.bg.size() > 0) {
                iRVar.bg(this.bg);
                this.bg.clear();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(final long j, final boolean z) {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(j, z);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.10
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(j, z);
                }
            });
        }
    }

    public void IL(long j, boolean z) {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        if (iRVar != null) {
            try {
                iRVar.bg(j / 1000.0f, z);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(final boolean z) {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(z);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        if (iRVar != null) {
            try {
                iRVar.bg(z);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(final int i) {
        if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            IL(i);
        } else {
            zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.ldr.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.PX.ldr.this.IL(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i) {
        com.bytedance.sdk.openadsdk.core.PX.iR iRVar = this.IL;
        if (iRVar != null) {
            try {
                iRVar.IL(i);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
