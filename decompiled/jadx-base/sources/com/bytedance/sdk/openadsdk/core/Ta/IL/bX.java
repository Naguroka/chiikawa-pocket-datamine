package com.bytedance.sdk.openadsdk.core.Ta.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.core.Ta.bg.bg {
    private final com.bytedance.sdk.component.utils.rri.bg ApA;
    private boolean CQc;
    private int Dxa;
    private int GvG;
    private final boolean LKE;
    private com.bytedance.sdk.openadsdk.core.Ta.IL.IL Pae;
    private final com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg RJ;
    private long VJ;
    private long VW;
    private final boolean ZQc;
    private final java.lang.String ayS;
    private int bN;
    private final boolean daV;
    private com.bytedance.sdk.openadsdk.eqN.iR jz;
    private boolean lM;
    private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg> qC;
    private final java.lang.Runnable sVc;
    private int txA;
    private java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN> uu;

    public interface bg {
        void bg(int i);

        void ldr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bX(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void iR(boolean z) {
        this.CQc = z;
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg bgVar) {
        if (!this.Lq || this.iR == null) {
            return;
        }
        this.iR.bg(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.2
            @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg
            public void bg(android.view.View view, int i) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg bgVar2 = bgVar;
                if (bgVar2 != null) {
                    bgVar2.bg(view, i);
                }
            }
        });
    }

    public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        if (!this.Lq || this.iR == null) {
            return;
        }
        this.iR.bg(pAGNativeAd);
    }

    public void bg(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.Dxa = i;
        this.bN = i2;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.IL.IL il) {
        this.Pae = il;
    }

    private void bg(android.content.Context context) {
        android.view.ViewGroup ta;
        if (this.Lq) {
            ta = new com.bytedance.sdk.openadsdk.Ta.yDt(context);
        } else {
            ta = new com.bytedance.sdk.openadsdk.Ta.Ta(context);
        }
        android.view.ViewGroup viewGroup = ta;
        if (this.Lq) {
            this.iR = new com.bytedance.sdk.openadsdk.core.Ta.IL.zx(context, viewGroup, true, 17, this.Kg, this, rri());
        } else {
            this.iR = new com.bytedance.sdk.openadsdk.core.Ta.IL.eqN(context, viewGroup, true, 17, this.Kg, this, false);
        }
        this.iR.bg(this);
    }

    public bX(android.content.Context context, android.view.ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        super(context, tuv, viewGroup);
        this.VW = 0L;
        this.VJ = 0L;
        this.CQc = true;
        this.Dxa = 0;
        this.bN = 0;
        this.RJ = new com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1
            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void IL(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i) {
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bX(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 5);
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(9);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.ayS();
                    }
                });
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi() == null || com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi().bg() == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi().bg().eqN(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, long j) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.kMt = false;
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.removeCallbacks(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.sVc);
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                        }
                        if (!com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Lq || com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.qC == null || com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.qC.get() == null) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg) com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.qC.get()).ldr();
                    }
                });
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.VW();
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 0);
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bX();
                }
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX bXVar = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this;
                bXVar.bg(bXVar.jz);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void IL(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.removeCallbacks(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.sVc);
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu != null && com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu.get() != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu.get();
                        }
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                        }
                    }
                });
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.daV) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX bXVar = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this;
                bXVar.bg(bXVar.jz);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, final com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar2) {
                com.bytedance.sdk.component.utils.PX.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg, "onError: " + bgVar2.bg() + ", " + bgVar2.IL() + ", " + bgVar2.bX());
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iBg = bgVar2.bg();
                        int iIL = bgVar2.IL();
                        if (!com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Ja() || iIL == -1004) {
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX(iBg, iIL)) {
                                com.bytedance.sdk.component.utils.PX.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg, "Play video error，show result page、、、、、、、");
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, (java.lang.ref.WeakReference<android.content.Context>) null, false);
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX(true);
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.eqN();
                            }
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                            }
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Uw != null) {
                                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Uw.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.VJ, com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR, com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Uq));
                            }
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu == null || com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu.get() == null || com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Ja()) {
                                return;
                            }
                            ((com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN) com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.uu.get()).bg(iBg, iIL);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg(bgVar2);
                com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi();
                if (bgVarHi != null && bgVarHi.bg() != null) {
                    bgVarHi.bg().bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 6);
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(14);
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, boolean z4) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i, int i2) {
                com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.LKE();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.kMt = true;
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.xxp();
                            com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.postDelayed(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.sVc, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 2);
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(4);
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.kMt = false;
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.removeCallbacks(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.sVc);
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                    }
                });
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 0);
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(5);
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, final long j, final long j2) {
                if (java.lang.Math.abs(j - com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR) < 50) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX bXVar = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this;
                bXVar.bg(bXVar.jz);
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg(j, j2);
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.IL(j, j2);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void eqN(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
                com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi();
                if (bgVarHi != null && bgVarHi.bg() != null) {
                    bgVarHi.bg().IL(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR);
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, 3);
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(0);
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
            public void zx(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
                com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg.hi();
                if (bgVarHi != null && bgVarHi.bg() != null) {
                    bgVarHi.bg().bX(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR);
                }
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.DDQ.bg(1);
                }
            }
        };
        this.txA = 0;
        this.sVc = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.Kg, (java.lang.ref.WeakReference<android.content.Context>) null, false);
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.IL();
                    com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bX(true);
                    com.bytedance.sdk.component.utils.PX.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg, "Show result page after error.......showAdCard");
                }
            }
        };
        this.ApA = new com.bytedance.sdk.component.utils.rri.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.6
            @Override // com.bytedance.sdk.component.utils.rri.bg
            public void bg(android.content.Context context2, android.content.Intent intent, boolean z4, final int i) {
                com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.zx(i);
                    }
                });
            }
        };
        this.lM = false;
        this.GvG = com.bytedance.sdk.component.utils.Lq.bX(context);
        bg(z);
        this.ayS = str;
        try {
            this.Dxa = viewGroup.getWidth();
            this.bN = viewGroup.getHeight();
        } catch (java.lang.Throwable unused) {
        }
        bg(context);
        this.daV = true;
        this.ZQc = z2;
        this.LKE = z3;
        if (iRVar != null) {
            this.jz = iRVar;
        }
    }

    public com.bytedance.sdk.openadsdk.core.PX.ldr bg(android.view.View view, java.util.List<android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose>> list) {
        if (!this.Kg.HXG()) {
            return null;
        }
        if (this.DDQ == null) {
            this.DDQ = com.bytedance.sdk.openadsdk.core.PX.ldr.bg();
        }
        this.DDQ.bg(view, this.Kg.hi().yDt());
        if (list != null && list.size() > 0) {
            for (android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    this.DDQ.bg((android.view.View) pair.first, pair.second == null ? com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER : (com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose) pair.second);
                }
            }
        }
        return this.DDQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.bg.bg, com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN eqn) {
        this.uu = new java.lang.ref.WeakReference<>(eqn);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (this.ldr != null) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("", "twice playVideoUrl", new java.lang.IllegalStateException());
            return true;
        }
        if (android.text.TextUtils.isEmpty(bXVar.Ta())) {
            com.bytedance.sdk.component.utils.PX.bg(this.bg, "[video] play video stop , because no video info");
            return false;
        }
        bX(false);
        bXVar.Ta();
        IL(bXVar);
        Uq();
        if (this.DDQ != null) {
            this.DDQ.bg(false, 0.0f);
        }
        if (!com.bytedance.sdk.openadsdk.core.Kg.kMt.IL(this.ayS) || this.WR <= 0) {
            this.WR = bXVar.iR();
        }
        if (bXVar.iR() <= 0) {
            this.LZ = false;
            this.Fy.set(false);
        } else {
            this.WR = bXVar.iR();
            this.eo = java.lang.Math.max(this.eo, this.WR);
        }
        if (this.iR != null) {
            this.iR.bg();
            if (this.txA == 0) {
                this.iR.iR();
            }
            this.iR.bX(bXVar.zx(), bXVar.ldr());
            this.iR.bX(this.JAA);
            this.iR.bg(bXVar.zx(), bXVar.ldr());
        }
        if (this.ldr == null) {
            this.ldr = new com.bytedance.sdk.openadsdk.core.Ta.eqN.bX();
            this.ldr.bg(this.RJ);
        }
        tuV();
        this.VJ = 0L;
        try {
            bX(bXVar);
            return true;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg(this.bg, "[video] invoke NativeVideoController#playVideo cause exception :".concat(java.lang.String.valueOf(e)));
            return false;
        }
    }

    private void bX(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        bXVar.bX(0);
        this.ldr.bg(bXVar);
        this.VW = java.lang.System.currentTimeMillis();
        this.iR.bX(8);
        this.iR.bX(0);
        bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.ldr == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.VW = java.lang.System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.iR.eqN(0);
                com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.ldr.bg(true, com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.WR, com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.vb);
            }
        });
        if (this.Lq) {
            VzQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ayS() {
        this.txA++;
        if (this.iR == null) {
            return;
        }
        this.iR.IL();
        if (this.Uw != null) {
            this.Uw.bg(this.VJ, com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(this.WR, this.Uq));
        }
        this.VJ = java.lang.System.currentTimeMillis() - this.VW;
        if (this.CQc) {
            this.iR.bg(this.Kg, (java.lang.ref.WeakReference<android.content.Context>) null, true);
        }
        if (!this.LZ) {
            this.LZ = true;
            IL(this.Uq, this.Uq);
            long j = this.Uq;
            this.WR = j;
            this.eo = j;
            IL(this.jz);
        }
        if (!this.Lq && this.tuV) {
            zx(this.iR, null);
        }
        this.yDt = true;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL() {
        if (this.iR != null) {
            this.iR.bg();
        }
        if (this.iR != null) {
            this.iR.VzQ();
        }
        ZQc();
    }

    public void Kg(boolean z) {
        if (this.iR != null) {
            this.iR.bg();
        }
        if (this.iR != null && z) {
            this.iR.VzQ();
        }
        ZQc();
    }

    private void ZQc() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Boolean.valueOf(this.Ta);
        if (this.ldr != null) {
            if (this.ldr.iR()) {
                if (this.Ta) {
                    LZ();
                } else {
                    IL(this.aGH);
                }
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                java.lang.Boolean.valueOf(this.Ta);
            } else {
                this.ldr.bg(false, this.WR, this.vb);
            }
        }
        if (this.Fy.get()) {
            Uw();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bX() {
        bg(true, 3);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(boolean z, int i) {
        if (!this.LZ && this.Fy.get()) {
            if (z) {
                com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
                bgVar.bg(zx());
                bgVar.bX(Kg());
                bgVar.IL(ldr());
                bgVar.bX(i);
                bgVar.eqN(iR());
                com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.iR, bgVar, this.jz);
                this.LZ = false;
            } else {
                DDQ();
            }
        }
        eqN();
        if (this.DDQ != null) {
            this.DDQ.eqN();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void eqN() {
        if (this.ldr != null) {
            this.ldr.PX();
            this.ldr = null;
        }
        if (this.CQc) {
            if (!"embeded_ad".equals(this.ayS)) {
                this.iR.bg(this.Kg, (java.lang.ref.WeakReference<android.content.Context>) null, true);
            } else {
                this.iR.Fy();
            }
            this.bX.removeCallbacksAndMessages(null);
            this.PX.clear();
            if (this.Lq) {
                VJ();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LKE() {
        int i;
        int i2;
        try {
            if (CQc() != null && this.ldr != null && this.JAA != null) {
                int iEqN = this.ldr.eqN();
                int iZx = this.ldr.zx();
                final int width = this.JAA.getWidth();
                final int height = this.JAA.getHeight();
                if (width > 0 && height > 0 && iZx > 0 && iEqN > 0) {
                    if (iEqN == iZx) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (iEqN > iZx) {
                        i2 = (int) ((((double) width) * 1.0d) / ((double) ((iEqN * 1.0f) / iZx)));
                        i = width;
                    } else {
                        i = (int) ((((double) height) * 1.0d) / ((double) ((iZx * 1.0f) / iEqN)));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.bX.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.CQc() instanceof android.view.TextureView) {
                                    ((android.view.TextureView) com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.CQc()).setLayoutParams(layoutParams);
                                    java.lang.String unused = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg;
                                } else if (com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.CQc() instanceof android.view.SurfaceView) {
                                    ((android.view.SurfaceView) com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.CQc()).setLayoutParams(layoutParams);
                                    java.lang.String unused2 = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg;
                                }
                            } catch (java.lang.Throwable unused3) {
                                java.lang.String unused4 = com.bytedance.sdk.openadsdk.core.Ta.IL.bX.this.bg;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            new java.lang.StringBuilder("[step-1] >>>>> mContextRef=").append(this.VB).append(",getIRenderView() =").append(CQc());
            com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
            com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar2 = this.ldr;
        } catch (java.lang.Throwable th) {
            new java.lang.StringBuilder("[step-11] >>>>> changeVideoSize error !!!!! ：").append(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.bg.bg.bg.ldr.IL CQc() {
        if (this.VB.getResources().getConfiguration().orientation != 1 || this.iR == null) {
            return null;
        }
        return this.iR.Ta();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view) {
        if (this.ldr == null) {
            return;
        }
        if (this.ldr.ldr()) {
            bg();
            this.iR.IL(true, false);
            this.iR.ldr();
        } else {
            if (!this.ldr.iR()) {
                if (this.iR != null) {
                    this.iR.bX(this.JAA);
                }
                eqN(this.WR);
                if (this.iR != null) {
                    this.iR.IL(false, false);
                    return;
                }
                return;
            }
            Kg(false);
            if (this.iR != null) {
                this.iR.IL(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(long j, long j2) {
        this.Kg.bX(j);
        this.WR = j;
        this.Uq = j2;
        this.iR.bg(j, j2);
        this.iR.bg(com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(j, j2));
        try {
            if (this.Uw != null) {
                this.Uw.bg(j, j2);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg(this.bg, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = this.Kg.hi();
        if (bgVarHi == null || bgVarHi.bg() == null) {
            return;
        }
        bgVarHi.bg().bg(j, j2, this.DDQ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.bg.bg
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view, boolean z) {
        ldr(!this.tuV);
        if (this.VB instanceof android.app.Activity) {
            if (this.iR != null) {
                this.iR.IL(this.JAA);
                this.iR.bX(false);
            }
            bg(1);
            com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL il2 = this.Ja != null ? this.Ja.get() : null;
            if (il2 != null) {
                il2.bg(this.tuV);
            }
        }
    }

    private boolean IL(int i, int i2) {
        if (i2 == 0) {
            bg();
            this.xxp = true;
            if (this.iR != null) {
                this.iR.bg(this.Kg, (java.lang.ref.WeakReference<android.content.Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.iR != null) {
                this.iR.bg();
            }
            bg();
            this.xxp = true;
            this.VzQ = false;
            if (this.iR != null) {
                return this.iR.bg(i, this.Kg.Dxa(), this.LKE);
            }
        } else if (i2 == 4) {
            this.xxp = false;
            if (this.iR != null) {
                this.iR.Lq();
            }
        }
        return true;
    }

    private void eqN(int i) {
        if (this.GvG == i) {
            return;
        }
        this.GvG = i;
        if (i != 4 && i != 0) {
            this.VzQ = false;
        }
        if (!this.VzQ && !Lq() && this.ZQc) {
            IL(2, i);
        }
        java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg> weakReference = this.qC;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qC.get().bg(this.GvG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zx(int i) {
        eqN(i);
        if (i == 4) {
            this.xxp = false;
        }
    }

    public void bX(int i) {
        eqN(i);
        if (i == 4) {
            this.xxp = false;
            IL();
        }
    }

    public void VzQ() {
        if (this.lM || !this.tC) {
            return;
        }
        android.content.Context applicationContext = com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext();
        this.lM = true;
        com.bytedance.sdk.component.utils.rri.bg(this.ApA, applicationContext);
    }

    public void VJ() {
        if (this.lM && this.tC) {
            this.lM = false;
            com.bytedance.sdk.component.utils.rri.bg(this.ApA);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg bgVar) {
        this.qC = new java.lang.ref.WeakReference<>(bgVar);
    }

    public void daV() {
        if (this.DDQ != null) {
            this.DDQ.bg(13);
        }
    }
}
