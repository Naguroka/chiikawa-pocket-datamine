package com.bytedance.sdk.openadsdk.ldr;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile com.bytedance.sdk.openadsdk.ldr.bg bg;
    private boolean IL;
    private int[] Kg;
    private int Lq;
    private int[] PX;
    private boolean Ta;
    private boolean VB;
    private int[] WR;
    private boolean bX;
    private boolean eo;
    private boolean eqN;
    private int[] iR;
    private int[] ldr;
    private boolean vb;
    private boolean xxp;
    private boolean yDt;
    private int[] zx;

    private bg() {
        IL();
    }

    public static com.bytedance.sdk.openadsdk.ldr.bg bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.ldr.bg();
                }
            }
        }
        return bg;
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.bg.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ldr.bg.this.yDt = com.bytedance.sdk.openadsdk.Fy.bg.bg("feature_switch", false);
                if (com.bytedance.sdk.openadsdk.ldr.bg.this.yDt) {
                    try {
                        com.bytedance.sdk.openadsdk.ldr.bg.this.xxp = com.bytedance.sdk.openadsdk.Fy.bg.bg("exclude_banner_native", false);
                        com.bytedance.sdk.openadsdk.ldr.bg.this.Lq = com.bytedance.sdk.openadsdk.Fy.bg.bg("feature_timer_interval", 10000);
                        com.bytedance.sdk.openadsdk.ldr.bg.this.vb = com.bytedance.sdk.openadsdk.Fy.bg.bg("enable_feature_cids", true);
                        java.lang.String[] strArrSplit = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_ad_show_cnt", "1,3,5&session").split(com.ironsource.y8.i.c);
                        java.lang.String[] strArrSplit2 = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_ad_click_cnt", "1,3,5&session").split(com.ironsource.y8.i.c);
                        java.lang.String[] strArrSplit3 = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_video_play_cnt", "1,3,5&session").split(com.ironsource.y8.i.c);
                        java.lang.String[] strArrSplit4 = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_dislike_cnt", "1,3,5session").split(",");
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar.IL = bgVar.bg(strArrSplit);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar2 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar2.bX = bgVar2.bg(strArrSplit2);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar3 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar3.eqN = bgVar3.bg(strArrSplit3);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar4 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar4.zx = bgVar4.IL(strArrSplit);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar5 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar5.ldr = bgVar5.IL(strArrSplit2);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar6 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar6.iR = bgVar6.IL(strArrSplit3);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar7 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar7.PX = bgVar7.bX(strArrSplit4);
                        java.lang.String[] strArrSplit5 = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_landingPage_stay_time", "1,3,5&session").split(com.ironsource.y8.i.c);
                        java.lang.String[] strArrSplit6 = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_video_stay_time", "1,3,5&session").split(com.ironsource.y8.i.c);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar8 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar8.eo = bgVar8.bg(strArrSplit5);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar9 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar9.VB = bgVar9.bg(strArrSplit6);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar10 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar10.Kg = bgVar10.IL(strArrSplit5);
                        com.bytedance.sdk.openadsdk.ldr.bg bgVar11 = com.bytedance.sdk.openadsdk.ldr.bg.this;
                        bgVar11.WR = bgVar11.IL(strArrSplit6);
                        com.bytedance.sdk.openadsdk.ldr.bg.this.Ta = com.bytedance.sdk.openadsdk.Fy.bg.bg("pag_video_30p_session", true);
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(java.lang.String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] IL(java.lang.String[] strArr) {
        return strArr.length > 0 ? bX(strArr[0].split(",")) : new int[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] bX(java.lang.String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (java.lang.String str : strArr) {
            try {
                int i2 = java.lang.Integer.parseInt(str);
                iArr[i] = i2;
                if (i2 > 0) {
                    i++;
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public boolean bX() {
        return this.yDt;
    }

    public int eqN() {
        return this.Lq;
    }

    public boolean zx() {
        return this.vb;
    }

    public boolean ldr() {
        return this.IL;
    }

    public boolean iR() {
        return this.bX;
    }

    public boolean Kg() {
        return this.eqN;
    }

    public int[] WR() {
        return this.zx;
    }

    public int[] eo() {
        return this.ldr;
    }

    public int[] VB() {
        return this.iR;
    }

    public int[] PX() {
        return this.Kg;
    }

    public int[] Ta() {
        return this.WR;
    }

    public boolean yDt() {
        return this.eo;
    }

    public boolean Lq() {
        return this.VB;
    }

    public int[] vb() {
        return this.PX;
    }

    public boolean xxp() {
        return this.Ta;
    }

    public boolean VzQ() {
        return this.xxp;
    }
}
