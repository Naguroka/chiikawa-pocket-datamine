package com.bytedance.sdk.component.ldr.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.ldr.bg.ldr.IL {
    private final com.bytedance.sdk.component.ldr.bg.ldr.zx IL;
    private final android.content.Context bg;

    public bX(android.content.Context context, com.bytedance.sdk.component.ldr.bg.ldr.zx zxVar) {
        this.bg = context;
        this.IL = zxVar;
    }

    public android.content.Context bg() {
        android.content.Context context = this.bg;
        return context == null ? com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() : context;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.IL
    public void bg(java.lang.String str, java.util.List<java.lang.String> list, boolean z, java.util.Map<java.lang.String, java.lang.String> map, int i, java.lang.String str2) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null || !zxVarVb.bX() || list == null || list.size() == 0) {
            return;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.ldr.bX.bg(new com.bytedance.sdk.component.ldr.bg.ldr.eqN(java.util.UUID.randomUUID().toString() + "_" + java.lang.System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.IL
    public java.lang.Runnable bg(final com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn, final java.lang.String str, final java.util.Map<java.lang.String, java.lang.String> map) {
        if (eqn == null || android.text.TextUtils.isEmpty(eqn.bg())) {
            return null;
        }
        return new java.lang.Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.ldr.bX.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bg(eqn.bg()) != null) {
                    new com.bytedance.sdk.component.ldr.bg.ldr.bX.bg(eqn, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.IL
    public void bg(final java.lang.String str, final boolean z) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || !zxVarVb.bX()) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.zx.zx zxVar = new com.bytedance.sdk.component.ldr.bg.zx.zx("trackFailedUrls") { // from class: com.bytedance.sdk.component.ldr.bg.ldr.bX.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.ldr.bg.ldr.bX.this.bg(com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bg(), str, z);
            }
        };
        zxVar.bg(1);
        if (zxVarVb.eqN() != null) {
            zxVarVb.eqN().execute(zxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.ldr.eqN> list, java.lang.String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        for (com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn : list) {
            if (zxVarVb != null && zxVarVb.eqN() != null) {
                eqn.bg(z);
                zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.ldr.bX.bg(eqn, str, null));
            }
        }
    }

    private class bg extends com.bytedance.sdk.component.ldr.bg.zx.zx {
        private final com.bytedance.sdk.component.ldr.bg.ldr.eqN IL;
        private final java.lang.String bX;
        private final java.util.Map<java.lang.String, java.lang.String> eqN;

        private bg(com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            super("AdsStats");
            this.IL = eqn;
            this.bX = str;
            this.eqN = map;
        }

        private java.lang.String bX(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                str = str.replace("{TS}", java.lang.String.valueOf(jCurrentTimeMillis)).replace("__TS__", java.lang.String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !android.text.TextUtils.isEmpty(this.bX)) ? str.replace("{UID}", this.bX).replace("__UID__", this.bX) : str;
        }

        boolean bg(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        java.lang.String IL(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", java.lang.String.valueOf(com.bytedance.sdk.component.ldr.bg.ldr.bX.bX().nextLong())).replace("[ss_timestamp]", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            } catch (java.lang.Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.ldr.bg.zx.eqN eqnBg;
            com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
            if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || !zxVarVb.bX() || !bg(this.IL.IL())) {
                return;
            }
            if (this.IL.eqN() >= zxVarVb.bX(this.IL.ldr())) {
                com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bX(this.IL);
                return;
            }
            try {
                zxVarVb.Ta();
                if (this.IL.VB()) {
                    com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bg(this.IL);
                }
                if (zxVarVb.bg(com.bytedance.sdk.component.ldr.bg.ldr.bX.this.bg())) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.String strIL = this.IL.IL();
                    if (zxVarVb.ldr() == 0) {
                        strIL = bX(this.IL.IL());
                        if (this.IL.bX()) {
                            strIL = IL(strIL);
                        }
                    }
                    com.bytedance.sdk.component.ldr.bg.zx.bX bXVarEo = zxVarVb.eo();
                    if (bXVarEo == null) {
                        return;
                    }
                    bXVarEo.bg(com.google.common.net.HttpHeaders.USER_AGENT, zxVarVb.WR());
                    bXVarEo.bg("csj_client_source_from", "1");
                    if (this.eqN != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.eqN.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        bXVarEo.bg("csj_extra_info", jSONObject.toString());
                    }
                    bXVarEo.bg(strIL);
                    try {
                        eqnBg = bXVarEo.bg();
                        try {
                            zxVarVb.bg(eqnBg.bg());
                        } catch (java.lang.Throwable unused) {
                        }
                    } catch (java.lang.Throwable unused2) {
                        eqnBg = null;
                    }
                    com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn = this.IL;
                    eqn.bg(eqn.eqN() + 1);
                    if (eqnBg != null && eqnBg.bg()) {
                        com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bX(this.IL);
                        this.IL.IL();
                        zxVarVb.bg(true, 200, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, this.IL);
                        return;
                    }
                    if (eqnBg != null) {
                        this.IL.IL(eqnBg.IL());
                        this.IL.bX(eqnBg.bX());
                    }
                    if (eqnBg != null && eqnBg.IL() == 8848) {
                        eqnBg.bX();
                        com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bX(this.IL);
                    } else {
                        this.IL.IL();
                        if (this.IL.eqN() >= zxVarVb.bX(this.IL.ldr())) {
                            com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.bX(this.IL);
                            this.IL.IL();
                        } else {
                            com.bytedance.sdk.component.ldr.bg.ldr.bX.this.IL.IL(this.IL);
                        }
                    }
                    zxVarVb.bg(false, this.IL.Kg(), java.lang.System.currentTimeMillis() - jCurrentTimeMillis, this.IL);
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Random bX() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                return java.security.SecureRandom.getInstanceStrong();
            } catch (java.lang.Throwable unused) {
                return new java.security.SecureRandom();
            }
        }
        return new java.security.SecureRandom();
    }
}
