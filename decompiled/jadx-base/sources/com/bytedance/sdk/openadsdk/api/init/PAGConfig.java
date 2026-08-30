package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: loaded from: classes4.dex */
public final class PAGConfig implements com.bytedance.sdk.openadsdk.InitConfig {
    private static java.lang.String VB;
    private boolean IL;
    private boolean Kg;
    private java.lang.String WR;
    private int bX;
    private java.lang.String bg;
    private java.lang.String eo;
    private int eqN = -1;
    private int zx = -1;
    private int ldr = -1;
    private int iR = 0;

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public java.lang.String getData() {
        return this.eo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str) {
        this.eo = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public java.lang.String getAppId() {
        return this.bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(java.lang.String str) {
        this.bg = str;
    }

    public boolean getDebugLog() {
        return this.IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z) {
        this.IL = z;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.bX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i) {
        this.bX = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.eqN = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.eqN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.zx = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.zx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.ldr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.iR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @java.lang.Deprecated
    public void zx(int i) {
        this.iR = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.Kg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z) {
        this.Kg = z;
        com.bykv.vk.openvk.bg.bg.bg.bX.bg(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(java.lang.String str) {
        this.WR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public java.lang.String getPackageName() {
        if (android.text.TextUtils.isEmpty(this.WR)) {
            return VB;
        }
        return this.WR;
    }

    public static void setChildDirected(int i) {
        if (com.bytedance.sdk.openadsdk.utils.ayS.WR("setCoppa")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            com.bytedance.sdk.openadsdk.core.DDQ.bg().IL(i);
        }
    }

    public static int getChildDirected() {
        if (com.bytedance.sdk.openadsdk.utils.ayS.WR("getCoppa")) {
            return com.bytedance.sdk.openadsdk.core.DDQ.bg().IL();
        }
        return -1;
    }

    public static void setGDPRConsent(int i) {
        com.bytedance.sdk.openadsdk.utils.ayS.WR("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        com.bytedance.sdk.openadsdk.core.DDQ.bg().bX(i);
    }

    public static int getGDPRConsent() {
        if (!com.bytedance.sdk.openadsdk.utils.ayS.WR("getGdpr")) {
            return -1;
        }
        int iBX = com.bytedance.sdk.openadsdk.core.DDQ.bg().bX();
        if (iBX == 1) {
            return 0;
        }
        if (iBX == 0) {
            return 1;
        }
        return iBX;
    }

    public static void setDoNotSell(int i) {
        if (com.bytedance.sdk.openadsdk.utils.ayS.WR("setCCPA")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            com.bytedance.sdk.openadsdk.core.DDQ.bg().eqN(i);
        }
    }

    public static int getDoNotSell() {
        if (com.bytedance.sdk.openadsdk.utils.ayS.WR("getCCPA")) {
            return com.bytedance.sdk.openadsdk.core.DDQ.bg().ldr();
        }
        return -1;
    }

    public static void debugLog(boolean z) {
        if (com.bytedance.sdk.openadsdk.core.DDQ.bg() != null) {
            if (z) {
                com.bytedance.sdk.openadsdk.core.DDQ.bg().zx(1);
                com.bytedance.sdk.openadsdk.core.DDQ.bg().bg();
                return;
            }
            com.bytedance.sdk.openadsdk.core.DDQ.bg().zx(0);
            com.bytedance.sdk.component.iR.eqN.bX.bg(com.bytedance.sdk.component.iR.eqN.bX.bg.OFF);
            com.bytedance.sdk.component.utils.PX.bX();
            com.bykv.vk.openvk.bg.bg.bg.iR.bX.IL();
            com.bytedance.sdk.openadsdk.utils.LZ.IL();
        }
    }

    public static void setAppIconId(int i) {
        if (com.bytedance.sdk.openadsdk.core.DDQ.bg() != null) {
            com.bytedance.sdk.openadsdk.core.DDQ.bg().ldr(i);
        }
    }

    public static void setUserData(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.DDQ.bg() != null) {
            com.bytedance.sdk.openadsdk.core.DDQ.bg().IL(str);
        }
    }

    public static void setPackageName(java.lang.String str) {
        VB = str;
    }

    public static class Builder {
        private boolean IL;
        private java.lang.String VB;
        private java.lang.String[] WR;
        private int bX;
        private java.lang.String bg;
        private java.lang.String eo;
        private int eqN = -1;
        private int zx = -1;
        private int ldr = -1;
        private int iR = 0;
        private boolean Kg = false;

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder useTextureView(boolean z) {
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder setUserData(java.lang.String str) {
            this.VB = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder appId(java.lang.String str) {
            this.bg = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder debugLog(boolean z) {
            this.IL = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder appIcon(int i) {
            this.bX = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder setChildDirected(int i) {
            this.eqN = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder setGDPRConsent(int i) {
            this.zx = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder setDoNotSell(int i) {
            this.ldr = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder titleBarTheme(int i) {
            this.iR = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder supportMultiProcess(boolean z) {
            this.Kg = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder needClearTaskReset(java.lang.String... strArr) {
            this.WR = strArr;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder setPackageName(java.lang.String str) {
            this.eo = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.api.init.PAGConfig build() {
            com.bytedance.sdk.openadsdk.api.init.PAGConfig pAGConfig = new com.bytedance.sdk.openadsdk.api.init.PAGConfig();
            pAGConfig.IL(this.bg);
            pAGConfig.IL(this.eqN);
            pAGConfig.bg(this.bX);
            pAGConfig.zx(this.iR);
            pAGConfig.IL(this.Kg);
            pAGConfig.bX(this.zx);
            pAGConfig.eqN(this.ldr);
            pAGConfig.bg(this.IL);
            pAGConfig.bX(this.eo);
            pAGConfig.bg(this.VB);
            return pAGConfig;
        }
    }
}
