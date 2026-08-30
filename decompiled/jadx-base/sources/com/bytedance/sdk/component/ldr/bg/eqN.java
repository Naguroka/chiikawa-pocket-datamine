package com.bytedance.sdk.component.ldr.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static final com.bytedance.sdk.component.ldr.bg.eqN bg = new com.bytedance.sdk.component.ldr.bg.eqN();

    public void bg(com.bytedance.sdk.component.ldr.bg.bg bgVar, android.content.Context context) {
        IL(bgVar, context);
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(context);
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.eo());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().IL(bgVar.iR());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bX(bgVar.Kg());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.IL());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN(bgVar.WR());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().zx(bgVar.ldr());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.bg() == null ? com.bytedance.sdk.component.ldr.bg.bg.bg.zx.bg : bgVar.bg());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().IL(bgVar.VB());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.eqN());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.bX());
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar.zx());
        com.bytedance.sdk.component.ldr.bg.IL.bX.bX.bg(bgVar.Ta());
        com.bytedance.sdk.component.ldr.bg.IL.bX.bX.IL(bgVar.PX());
        bg(bgVar);
    }

    private void bg(com.bytedance.sdk.component.ldr.bg.bg bgVar) {
        java.util.concurrent.Executor executorZx;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper() && com.bytedance.sdk.component.ldr.bg.bX.bg.IL()) {
            com.bytedance.sdk.component.ldr.bg.bX.bg.bg();
            return;
        }
        com.bytedance.sdk.component.ldr.bg.zx zxVarEqN = bgVar.eqN();
        if (zxVarEqN == null || !com.bytedance.sdk.component.ldr.bg.bX.bg.IL() || (executorZx = zxVarEqN.zx()) == null) {
            return;
        }
        executorZx.execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.ldr.bg.bX.bg.bg();
            }
        });
    }

    public void bg(boolean z) {
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(z);
    }

    private void IL(com.bytedance.sdk.component.ldr.bg.bg bgVar, android.content.Context context) {
        com.bytedance.sdk.component.ldr.bg.bX.bg(context, "context == null");
        com.bytedance.sdk.component.ldr.bg.bX.bg(bgVar, "AdLogConfig == null");
        com.bytedance.sdk.component.ldr.bg.bX.bg(bgVar.eqN(), "AdLogDepend ==null");
    }

    private boolean bg(android.content.Context context, com.bytedance.sdk.component.ldr.bg.zx zxVar) {
        if (context == null || zxVar == null) {
            return false;
        }
        if (zxVar.ldr() == 2) {
            return true;
        }
        if (zxVar.ldr() == 1) {
            return zxVar.yDt();
        }
        try {
            return com.bytedance.sdk.component.utils.VzQ.bg(context);
        } catch (java.lang.Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void bg() {
        final com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null) {
            return;
        }
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().IL()) {
            if (bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), zxVarVb)) {
                com.bytedance.sdk.component.ldr.bg.Kg.iR().WR();
                return;
            } else if (bX()) {
                zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.zx.zx(androidx.media3.extractor.text.ttml.TtmlNode.START) { // from class: com.bytedance.sdk.component.ldr.bg.eqN.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ldr.bg.eqN.this.bg(zxVarVb.ldr());
                    }
                });
                return;
            } else {
                bg(zxVarVb.ldr());
                return;
            }
        }
        com.bytedance.sdk.component.ldr.bg.Kg.iR().WR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.bg.bg();
        } else if (i == 1) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.IL.bg();
        }
    }

    public void IL() {
        final com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null) {
            return;
        }
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().IL()) {
            if (bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), zxVarVb)) {
                com.bytedance.sdk.component.ldr.bg.Kg.iR().VB();
                return;
            } else if (bX()) {
                zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("stop") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ldr.bg.eqN.this.IL(zxVarVb.ldr());
                    }
                });
                return;
            } else {
                IL(zxVarVb.ldr());
                return;
            }
        }
        com.bytedance.sdk.component.ldr.bg.Kg.iR().VB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.bg.IL();
        } else if (i == 1) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.IL.IL();
        }
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        IL(bgVar);
    }

    private boolean bX() {
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread();
    }

    private void IL(final com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        final com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (bgVar == null || zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null) {
            return;
        }
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().IL()) {
            if (bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), zxVarVb)) {
                com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar);
                return;
            }
            bX();
            if (bX()) {
                zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("dispatchEvent") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ldr.bg.eqN.this.bg(bgVar, zxVarVb.ldr());
                    }
                });
                return;
            } else {
                bg(bgVar, zxVarVb.ldr());
                return;
            }
        }
        com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(bgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.bg.bg(bgVar);
        } else if (i == 1) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.IL.bg(bgVar);
        }
    }

    public void bg(final java.lang.String str, final java.util.List<java.lang.String> list, final boolean z, java.util.Map<java.lang.String, java.lang.String> map, final int i, final java.lang.String str2) {
        final com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null) {
            return;
        }
        if (zxVarVb.Kg()) {
            if (zxVarVb.ldr() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (zxVarVb.ldr() == 0 && (android.text.TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().IL() && !bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), zxVarVb)) {
                if (bX()) {
                    zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("trackFailed") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.5
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.ldr.bg.eqN.this.bg(str, (java.util.List<java.lang.String>) list, z, zxVarVb.ldr(), i, str2);
                        }
                    });
                    return;
                } else {
                    bg(str, list, z, zxVarVb.ldr(), i, str2);
                    return;
                }
            }
            com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(str, list, z, map, i, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, java.util.List<java.lang.String> list, boolean z, int i, int i2, java.lang.String str2) {
        if (i == 0) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.bg.bg(str, list, z);
        } else if (i == 1) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.IL.bg(str, list, z, i2, str2);
        }
    }

    public void bg(final java.lang.String str, final boolean z) {
        final com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null || zxVarVb.eqN() == null || !zxVarVb.Kg()) {
            return;
        }
        if (zxVarVb.ldr() == 0 && android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!com.bytedance.sdk.component.ldr.bg.Kg.iR().IL() || bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr(), zxVarVb)) {
            com.bytedance.sdk.component.ldr.bg.Kg.iR().bg(str, z);
        } else if (bX()) {
            zxVarVb.eqN().execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("trackFailed") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.6
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.ldr.bg.eqN.this.bg(str, zxVarVb.ldr(), z);
                }
            });
        } else {
            bg(str, zxVarVb.ldr(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, int i, boolean z) {
        if (i == 0) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.bg.bg(str);
        } else if (i == 1) {
            com.bytedance.sdk.component.ldr.bg.IL.IL.IL.bg(str, z);
        }
    }
}
