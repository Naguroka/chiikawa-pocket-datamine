package com.bytedance.sdk.openadsdk.core.Ta.bg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX, com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.core.Ta.IL.bg {
    protected com.bytedance.sdk.openadsdk.core.PX.ldr DDQ;
    protected final android.view.ViewGroup JAA;
    protected java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL> Ja;
    protected final com.bytedance.sdk.openadsdk.core.model.tuV Kg;
    protected boolean LZ;
    protected long Uq;
    protected com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg Uw;
    protected final android.content.Context VB;
    private long VW;
    protected android.view.SurfaceHolder eqN;
    protected com.bytedance.sdk.openadsdk.core.Ta.IL.zx iR;
    protected boolean kMt;
    protected com.bytedance.sdk.openadsdk.core.Ta.eqN.bX ldr;
    protected com.bytedance.sdk.openadsdk.core.Ta.bg.IL rri;
    protected boolean vb;
    protected android.graphics.SurfaceTexture zx;
    protected java.lang.String bg = "TTAD.VideoController";
    protected final int IL = 100;
    protected final com.bytedance.sdk.component.utils.JAA bX = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
    protected long WR = 0;
    protected long eo = 0;
    protected final java.util.List<java.lang.Runnable> PX = new java.util.ArrayList();
    protected boolean Ta = false;
    protected boolean yDt = false;
    protected boolean Lq = true;
    protected boolean xxp = false;
    protected boolean VzQ = false;
    protected boolean tuV = false;
    protected java.util.concurrent.atomic.AtomicBoolean Fy = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected boolean tC = true;
    protected java.lang.Runnable aGH = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.bg.bg.1
        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.Ta);
            com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.LZ();
        }
    };
    private long VJ = 0;
    private boolean daV = true;
    private int ayS = 1;
    private final java.util.concurrent.atomic.AtomicBoolean ZQc = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view, boolean z) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN eqn) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean xxp() {
        return true;
    }

    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.view.ViewGroup viewGroup) {
        this.Kg = tuv;
        this.VB = context;
        this.JAA = viewGroup;
        this.bg += hashCode();
    }

    protected void tuV() {
        if (this.ldr == null) {
            return;
        }
        if (VzQ()) {
            android.graphics.SurfaceTexture surfaceTexture = this.zx;
            if (surfaceTexture == null || surfaceTexture == this.ldr.tuV()) {
                return;
            }
            this.ldr.bg(this.zx);
            return;
        }
        android.view.SurfaceHolder surfaceHolder = this.eqN;
        if (surfaceHolder == null || surfaceHolder == this.ldr.VzQ()) {
            return;
        }
        this.ldr.bg(this.eqN);
    }

    private boolean VzQ() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            return zxVar.Ta() instanceof com.bykv.vk.openvk.bg.bg.bg.ldr.eqN;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public long zx() {
        return this.WR;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(long j) {
        this.WR = j;
        this.eo = java.lang.Math.max(this.eo, j);
    }

    protected void bg(java.lang.Runnable runnable) {
        if (this.iR.tC() && this.Ta) {
            runnable.run();
        } else {
            IL(runnable);
        }
    }

    protected void IL(java.lang.Runnable runnable) {
        this.PX.add(runnable);
    }

    protected void Fy() {
        if (this.PX.isEmpty()) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.PX).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.PX.clear();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.SurfaceHolder surfaceHolder) {
        this.Ta = true;
        this.eqN = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return;
        }
        bXVar.bg(surfaceHolder);
        Fy();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public void IL(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.SurfaceHolder surfaceHolder) {
        this.Ta = false;
        this.eqN = null;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg(false);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.graphics.SurfaceTexture surfaceTexture) {
        this.Ta = true;
        this.zx = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg(surfaceTexture);
            this.ldr.bg(this.Ta);
        }
        Fy();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public void IL(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.graphics.SurfaceTexture surfaceTexture) {
        this.Ta = false;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg(false);
        }
        this.zx = null;
        Fy();
    }

    protected void LZ() {
        this.bX.postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.bg.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.ldr != null) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.Ta);
                    com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.ldr.eo();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public com.bykv.vk.openvk.bg.bg.bg.bg PX() {
        return this.ldr;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    /* JADX INFO: renamed from: tC, reason: merged with bridge method [inline-methods] */
    public final com.bytedance.sdk.openadsdk.core.Ta.IL.zx Ta() {
        return this.iR;
    }

    public boolean rri() {
        return this.Lq;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(boolean z) {
        this.Lq = z;
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.eqN(z);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL(long j) {
        this.VJ = j;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean VB() {
        return this.xxp;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bX(long j) {
        this.Uq = j;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final long ldr() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return 0L;
        }
        return bXVar.yDt();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final int iR() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return 0;
        }
        return bXVar.Lq();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean yDt() {
        return this.vb;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void IL(final boolean z) {
        this.vb = z;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.IL(z);
        }
        if (this.DDQ != null) {
            if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
                this.DDQ.bg(z);
            } else {
                this.bX.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.bg.bg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.Ta.bg.bg.this.DDQ.bg(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final long Kg() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return 0L;
        }
        return bXVar.vb();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean Lq() {
        return this.yDt;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void bX(boolean z) {
        this.yDt = z;
    }

    protected void ldr(boolean z) {
        this.tuV = z;
    }

    public boolean kMt() {
        return this.daV;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void eqN(boolean z) {
        this.daV = z;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        com.bytedance.sdk.openadsdk.core.Ta.bg.IL il = (com.bytedance.sdk.openadsdk.core.Ta.bg.IL) bXVar;
        this.rri = il;
        this.vb = il.Kg();
        bXVar.eqN(java.lang.String.valueOf(this.Kg.IGR()));
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final boolean vb() {
        return this.kMt;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final int eo() {
        return com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(this.eo, this.Uq);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void zx(boolean z) {
        this.tC = z;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void IL(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view) {
        IL(il, view, false, false);
    }

    public final void IL(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view, boolean z, boolean z2) {
        ldr(!this.tuV);
        android.content.Context context = this.VB;
        if (context != null && (context instanceof android.app.Activity)) {
            if (this.tuV) {
                bg(z ? 8 : 0);
                com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
                if (zxVar != null) {
                    zxVar.bg(this.JAA);
                    this.iR.bX(false);
                }
            } else {
                bg(1);
                com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar2 = this.iR;
                if (zxVar2 != null) {
                    zxVar2.IL(this.JAA);
                    this.iR.bX(false);
                }
            }
            java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL> weakReference = this.Ja;
            com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL il2 = weakReference != null ? weakReference.get() : null;
            if (il2 != null) {
                il2.bg(this.tuV);
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL il) {
        this.Ja = new java.lang.ref.WeakReference<>(il);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void zx(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view) {
        bg(il, view, false);
    }

    public final boolean JAA() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        return bXVar == null || bXVar.IL();
    }

    public final boolean Ja() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        return bXVar != null && bXVar.ldr();
    }

    public final void bg(int i) {
        android.content.Context context = this.VB;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (java.lang.Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void bX(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view) {
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.WR();
        }
        bg(true, 3);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view, boolean z, boolean z2) {
        if (this.Lq) {
            bg();
        }
        if (z && !this.Lq && !JAA()) {
            this.iR.IL(!Ja(), false);
            this.iR.bg(z2, true, false);
        }
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null && bXVar.ldr()) {
            this.iR.ldr();
            this.iR.zx();
        } else {
            this.iR.ldr();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void eqN(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, android.view.View view) {
        if (this.tuV) {
            ldr(false);
            com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
            if (zxVar != null) {
                zxVar.IL(this.JAA);
            }
            bg(1);
            return;
        }
        bg(true, 3);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, int i, boolean z) {
        if (this.VB == null) {
            return;
        }
        long j = this.Uq;
        long j2 = (long) (((((long) i) * j) * 1.0f) / 100.0f);
        if (j > 0) {
            this.VW = (int) j2;
        } else {
            this.VW = 0L;
        }
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.bg(this.VW);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, int i) {
        if (this.ldr == null) {
            return;
        }
        bg(this.VW, bX(i));
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bg
    public final void IL(com.bykv.vk.openvk.bg.bg.bg.eqN.IL il, int i) {
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.ldr();
        }
    }

    private void bg(long j, boolean z) {
        if (this.ldr == null) {
            return;
        }
        if (z) {
            VJ();
        }
        this.ldr.bg(j);
    }

    private boolean bX(int i) {
        return this.iR.IL(i);
    }

    private void VJ() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.eqN(0);
            this.iR.bg(false, false);
            this.iR.bX(false);
            this.iR.zx();
            this.iR.iR();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bg(com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        if (this.Fy.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar = this.DDQ;
            if (ldrVar != null) {
                ldrVar.bg(Kg(), yDt());
            }
            com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
            bgVar.bg(kMt());
            bgVar.bX(Kg());
            com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.iR, bgVar, iRVar);
        }
    }

    protected final void Uw() {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(zx());
        bgVar.bX(Kg() / ((long) aGH()));
        bgVar.IL(ldr());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL(Ta(), bgVar);
    }

    protected final void DDQ() {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(zx());
        bgVar.bX(Kg() / ((long) aGH()));
        bgVar.IL(ldr());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.iR, bgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void IL(com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(zx());
        bgVar.bX(Kg() / ((long) aGH()));
        bgVar.IL(ldr());
        bgVar.eqN(iR());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL(this.iR, bgVar, iRVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar2.IL(ldr());
        bgVar2.bX(Kg() / ((long) aGH()));
        bgVar2.bg(zx());
        bgVar2.bg(bgVar);
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bX(Ta(), bgVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Uq() {
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.Kg, this.iR, this.rri);
    }

    public int aGH() {
        return this.ayS;
    }

    public void IL(int i) {
        this.ayS = i;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        this.Uw = bgVar;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.Ta.bg.bg$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.widget.Fy.bg.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.widget.Fy.bg.PAUSE_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.sdk.openadsdk.core.widget.Fy.bg.RELEASE_VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.sdk.openadsdk.core.widget.Fy.bg.START_VIDEO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.bg
    public final void bg(com.bytedance.sdk.openadsdk.core.widget.Fy.bg bgVar, java.lang.String str) {
        int i = com.bytedance.sdk.openadsdk.core.Ta.bg.bg.AnonymousClass4.bg[bgVar.ordinal()];
        if (i == 1) {
            bg();
            return;
        }
        if (i == 2) {
            bX();
        } else {
            if (i != 3) {
                return;
            }
            IL();
            this.xxp = false;
            this.VzQ = true;
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final long WR() {
        return zx() + ldr();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public final void bg() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.VB();
        }
        if (this.LZ || !this.Fy.get()) {
            return;
        }
        DDQ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void VW() {
        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(this.Kg.Ld(), true, this.Kg), 5, this.Kg.Ys());
    }

    public final void eqN(long j) {
        this.WR = j;
        this.eo = java.lang.Math.max(this.eo, j);
        com.bytedance.sdk.openadsdk.core.Ta.IL.zx zxVar = this.iR;
        if (zxVar != null) {
            zxVar.bg();
        }
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg(true, this.WR, this.vb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bg(long j, long j2) {
        if (!this.ZQc.get() && com.bytedance.sdk.openadsdk.ldr.bg.bg().bX() && (j * 1.0d) / j2 > 0.3d) {
            this.ZQc.set(true);
            if (this.Kg != null) {
                com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoPercent30", this.Kg);
            }
        }
    }
}
