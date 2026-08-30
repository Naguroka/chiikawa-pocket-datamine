package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg IL;
    private boolean bX = true;
    protected int bg;
    private com.bytedance.sdk.openadsdk.component.reward.bg.PX.bg eqN;

    public PX(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = 0;
        this.IL = bgVar;
        bX();
        if (bgVar.bg == 2) {
            return;
        }
        try {
            this.bg = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(bgVar.uu, com.bytedance.sdk.openadsdk.utils.ZQc.bg());
            if (!bgVar.uu.getWindow().hasFeature(1)) {
                bgVar.uu.requestWindowFeature(1);
            }
            bgVar.uu.getWindow().addFlags(16777344);
            if (bgVar.GvG == 2 || !com.bytedance.sdk.openadsdk.utils.ZQc.bX(bgVar.uu)) {
                bgVar.uu.getWindow().addFlags(1024);
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    public void bg(com.bytedance.sdk.component.utils.JAA jaa) {
        if (jaa == null) {
            return;
        }
        jaa.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.1
            @Override // java.lang.Runnable
            public void run() {
                android.view.View viewFindViewById;
                try {
                    android.view.View decorView = com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(android.R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (java.lang.Exception unused) {
                }
            }
        }, 300L);
    }

    private void bX() {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        bgVar.lM = bgVar.IL.jf();
        if (26 == android.os.Build.VERSION.SDK_INT) {
            if (this.IL.uu.getResources().getConfiguration().orientation == 1) {
                this.IL.GvG = 1;
                return;
            } else {
                this.IL.GvG = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar2 = this.IL;
        bgVar2.GvG = bgVar2.IL.xFs();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    public void bg(boolean z) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i;
        if (android.os.Build.VERSION.SDK_INT != 26) {
            if (android.os.Build.VERSION.SDK_INT == 27) {
                try {
                    eqN();
                } catch (java.lang.Throwable unused) {
                }
            } else {
                eqN();
            }
        }
        float fZx = zx();
        float fLdr = ldr();
        if (this.IL.GvG == 2) {
            fMin = java.lang.Math.max(fZx, fLdr);
            fMax = java.lang.Math.min(fZx, fLdr);
        } else {
            fMin = java.lang.Math.min(fZx, fLdr);
            fMax = java.lang.Math.max(fZx, fLdr);
        }
        android.app.Activity activity = this.IL.uu;
        int iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(activity, com.bytedance.sdk.openadsdk.utils.ZQc.bg());
        if (this.IL.GvG != 2) {
            if (com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity)) {
                fMax -= iEqN;
            }
        } else if (com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity)) {
            fMin -= iEqN;
        }
        if (z) {
            this.IL.gXn = (int) fMin;
            this.IL.GZ = (int) fMax;
            return;
        }
        int i2 = 20;
        if (this.IL.GvG != 2) {
            if (this.IL.lM == 0.0f || this.IL.lM == 100.0f) {
                i2 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax2 = (int) java.lang.Math.max((fMax - (((fMin - 20.0f) - 20.0f) / this.IL.lM)) / 2.0f, 0.0f);
                i = iMax2;
                iMax = 20;
            }
        } else if (this.IL.lM == 0.0f || this.IL.lM == 100.0f) {
            i2 = 0;
            iMax = 0;
            iMax2 = 0;
            i = 0;
        } else {
            iMax = (int) java.lang.Math.max((fMin - (((fMax - 20.0f) - 20.0f) * this.IL.lM)) / 2.0f, 0.0f);
            iMax2 = 20;
            i = 20;
            i2 = iMax;
        }
        float f = i2;
        float f2 = iMax;
        this.IL.gXn = (int) ((fMin - f) - f2);
        float f3 = iMax2;
        float f4 = i;
        this.IL.GZ = (int) ((fMax - f3) - f4);
        activity.getWindow().getDecorView().setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity, f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity, f3), com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity, f2), com.bytedance.sdk.openadsdk.utils.ZQc.bX(activity, f4));
    }

    public void IL(com.bytedance.sdk.component.utils.JAA jaa) {
        try {
            if (this.IL.kU == null || this.IL.kU.WR <= 0) {
                final boolean z = true;
                final boolean z2 = this.bX && com.bytedance.sdk.openadsdk.core.VzQ.eqN().ZQc() == 1;
                if (!this.bX || !com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL.uu)) {
                    z = false;
                }
                if (z || z2) {
                    if (this.eqN == null) {
                        this.eqN = new com.bytedance.sdk.openadsdk.component.reward.bg.PX.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.2
                            boolean bg;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super();
                            }

                            /* JADX WARN: Code duplicated, block: B:28:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Code duplicated, block: B:31:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.sdk.openadsdk.component.reward.bg.PX.bg
                            void bg(int i, int i2) {
                                int iAbs;
                                float fBg;
                                try {
                                    if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.GvG != 2 || com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getResources().getConfiguration().orientation != 2) {
                                        iAbs = java.lang.Math.abs(com.bytedance.sdk.openadsdk.utils.ZQc.WR(com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu) - com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getWindow().getDecorView().getHeight());
                                    } else {
                                        iAbs = java.lang.Math.abs(com.bytedance.sdk.openadsdk.utils.ZQc.eo(com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu) - com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getWindow().getDecorView().getWidth());
                                    }
                                    android.view.View decorView = com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getWindow().getDecorView();
                                    int paddingLeft = decorView.getPaddingLeft();
                                    int paddingRight = decorView.getPaddingRight();
                                    int paddingBottom = decorView.getPaddingBottom();
                                    if (iAbs == 0) {
                                        int paddingTop = decorView.getPaddingTop();
                                        if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.GvG != 1 || com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getResources().getConfiguration().orientation != 1) {
                                            if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.GvG == 2 && com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getResources().getConfiguration().orientation == 2) {
                                                if (z) {
                                                    paddingLeft += (int) com.bytedance.sdk.openadsdk.utils.ZQc.bg();
                                                }
                                                if (z2) {
                                                    fBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg();
                                                }
                                            }
                                            if (decorView.isAttachedToWindow()) {
                                                decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                this.bg = true;
                                            }
                                            if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.lM == 100.0f) {
                                                decorView.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
                                                return;
                                            }
                                            return;
                                        }
                                        fBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg();
                                        paddingTop += (int) fBg;
                                        if (decorView.isAttachedToWindow()) {
                                            decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                            this.bg = true;
                                        }
                                        if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.lM == 100.0f) {
                                            decorView.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
                                            return;
                                        }
                                        return;
                                    }
                                    if (this.bg) {
                                        decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                        this.bg = false;
                                    }
                                } catch (java.lang.Throwable unused) {
                                }
                            }
                        };
                    }
                    this.IL.uu.getWindow().getDecorView().addOnLayoutChangeListener(this.eqN);
                }
                this.bX = false;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public float[] bg(int i) {
        float[] fArrIL = new float[2];
        android.app.Activity activity = this.IL.uu;
        android.view.View decorView = activity.getWindow().getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 35 && this.IL.IL.jf() == 100.0f) {
            fArrIL[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArrIL[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArrIL[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArrIL[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArrIL[0] = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(activity, fArrIL[0]);
        float fEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(activity, fArrIL[1]);
        fArrIL[1] = fEqN;
        if (fArrIL[0] < 10.0f || fEqN < 10.0f) {
            fArrIL = IL(this.bg);
        }
        if (android.os.Build.VERSION.SDK_INT != 26 && android.os.Build.VERSION.SDK_INT != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                if (i == 2) {
                    float f = fArrIL[0];
                    float f2 = fArrIL[1];
                    if (f < f2) {
                        fArrIL[1] = f;
                        fArrIL[0] = f2;
                    }
                } else {
                    float f3 = fArrIL[0];
                    float f4 = fArrIL[1];
                    if (f3 > f4) {
                        fArrIL[1] = f3;
                        fArrIL[0] = f4;
                    }
                }
            }
        }
        return fArrIL;
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.IL.uu);
        this.IL.uu.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.isFinishing()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu.getWindow().getDecorView().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.bytedance.sdk.openadsdk.utils.ZQc.bg(com.bytedance.sdk.openadsdk.component.reward.bg.PX.this.IL.uu);
                            }
                        }, 2500L);
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private float[] IL(int i) {
        float fLdr = ldr();
        float fZx = zx();
        if ((this.IL.GvG == 1) != (fLdr > fZx)) {
            float f = fLdr + fZx;
            fZx = f - fZx;
            fLdr = f - fZx;
        }
        if (this.IL.GvG == 1) {
            fLdr -= i;
        } else {
            fZx -= i;
        }
        return new float[]{fZx, fLdr};
    }

    private void eqN() {
        if (this.IL.GvG == 2) {
            if (this.IL.bCU) {
                bg(this.IL.uu, 8);
                return;
            } else {
                bg(this.IL.uu, 0);
                return;
            }
        }
        bg(this.IL.uu, 1);
    }

    private static void bg(android.app.Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        activity.setRequestedOrientation(i);
    }

    private float zx() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL.uu, com.bytedance.sdk.openadsdk.utils.ZQc.eo(this.IL.uu));
    }

    private float ldr() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL.uu, com.bytedance.sdk.openadsdk.utils.ZQc.WR(this.IL.uu));
    }

    public void IL() {
        if (this.eqN != null) {
            this.IL.uu.getWindow().getDecorView().removeOnLayoutChangeListener(this.eqN);
            this.eqN = null;
        }
    }

    private static abstract class bg implements android.view.View.OnLayoutChangeListener {
        private int IL;
        private int bg;

        abstract void bg(int i, int i2);

        private bg() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.bg && i10 == this.IL) {
                return;
            }
            this.bg = i9;
            this.IL = i10;
            bg(i9, i10);
        }
    }
}
