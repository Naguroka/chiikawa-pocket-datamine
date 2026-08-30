package com.bytedance.sdk.openadsdk.core.WR;

/* JADX INFO: loaded from: classes4.dex */
class bg {
    private volatile boolean IL;
    private com.pgl.ssdk.ces.out.PglSSManager bg;
    private volatile boolean bX = true;
    private volatile boolean eqN = false;

    public bg() {
        bg();
    }

    public synchronized void bg() {
        if (!this.IL) {
            try {
                android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                java.lang.String strEqN = com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
                if (android.text.TextUtils.isEmpty(strEqN)) {
                    strEqN = com.bytedance.sdk.openadsdk.core.WR.bg("app_id", Long.MAX_VALUE);
                }
                if (android.text.TextUtils.isEmpty(strEqN)) {
                    return;
                }
                com.pgl.ssdk.ces.out.PglSSManager.init(contextBg, com.pgl.ssdk.ces.out.PglSSConfig.builder().setAppId(strEqN).setOVRegionType(0).setAdsdkVersion(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME).build(), null, null, com.bytedance.sdk.openadsdk.core.PX.bg(contextBg), com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
                WR();
                this.IL = true;
            } catch (java.lang.Throwable unused) {
                eo();
                this.IL = false;
            }
            try {
                if (this.bX) {
                    bX(com.pgl.ssdk.ces.out.PglSSManager.getLoadError());
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.utils.LZ.IL("mssdk", th.getMessage());
            }
        }
    }

    public boolean IL() {
        return this.IL;
    }

    private boolean Kg() {
        if (!this.IL && this.bX) {
            bg();
        }
        return this.IL;
    }

    private void WR() {
        if (this.bg == null) {
            this.bg = com.pgl.ssdk.ces.out.PglSSManager.getInstance();
        }
    }

    public void bg(java.lang.String str) {
        if (Kg()) {
            WR();
            com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void bX() {
        if (Kg()) {
            WR();
            if (this.bg != null) {
                com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            java.util.HashMap map = new java.util.HashMap();
                            map.put(com.pgl.ssdk.ces.out.PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, com.bytedance.sdk.openadsdk.core.VzQ.eqN().bu());
                            com.bytedance.sdk.openadsdk.core.WR.bg.this.bg.setCustomInfo(map);
                            java.lang.Object[] objArr = new java.lang.Object[2];
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.openadsdk.utils.LZ.IL("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void IL(java.lang.String str) {
        if (Kg()) {
            WR();
            com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public void bg(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (Kg()) {
            WR();
            com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public java.lang.String eqN() {
        if (!Kg()) {
            return "";
        }
        WR();
        com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public java.lang.String zx() {
        if (!Kg()) {
            return "";
        }
        WR();
        com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public long ldr() {
        if (!Kg()) {
            return 0L;
        }
        WR();
        com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public void bg(android.view.MotionEvent motionEvent) {
        if (IL()) {
            WR();
            com.pgl.ssdk.ces.out.PglSSManager pglSSManager = this.bg;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int iR() {
        if (this.bX) {
            return com.pgl.ssdk.ces.out.PglSSManager.getInitStatus();
        }
        return 5;
    }

    public java.util.Map<java.lang.String, java.lang.String> bg(java.lang.String str, byte[] bArr) {
        java.util.Map<java.lang.String, java.lang.String> featureHash;
        return (!Kg() || (featureHash = this.bg.getFeatureHash(str, bArr)) == null) ? new java.util.HashMap() : featureHash;
    }

    private java.lang.Class eo() {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
            try {
                this.bX = true;
            } catch (java.lang.Throwable unused) {
                this.bX = false;
            }
        } catch (java.lang.Throwable unused2) {
            cls = null;
        }
        return cls;
    }

    private void bX(final java.lang.String str) {
        if (this.eqN || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.zx().bg(new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.WR.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("secsdk_init_error").IL(str);
            }
        }, false);
        this.eqN = true;
    }
}
