package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TTBaseVideoActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity implements com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL {
    com.bytedance.sdk.openadsdk.component.reward.bg.bg IL;
    boolean Kg;
    private int PX;
    private final java.util.concurrent.atomic.AtomicBoolean Ta;
    private boolean VB;
    int WR;
    protected com.bytedance.sdk.openadsdk.component.reward.IL.IL bX;
    public final java.lang.String bg;
    protected com.bytedance.sdk.openadsdk.PX.zx eo;
    final com.bytedance.sdk.component.utils.JAA eqN;
    int ldr;
    protected com.bytedance.sdk.openadsdk.IListenerManager zx;

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void PX() {
    }

    public boolean VzQ() {
        return false;
    }

    protected abstract void bg();

    protected void bg(android.content.Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
    }

    protected abstract void vb();

    public abstract boolean xxp();

    protected abstract void zx();

    public TTBaseVideoActivity() {
        this.bg = xxp() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.eqN = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
        this.VB = false;
        this.PX = 0;
        this.WR = 1;
        this.Ta = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.eo = new com.bytedance.sdk.openadsdk.PX.zx() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.PX.zx
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this.yDt();
            }
        };
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar;
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onCreate ".concat(java.lang.String.valueOf(this)));
        com.bytedance.sdk.openadsdk.core.VzQ.IL(getApplicationContext());
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(getIntent(), bundle, this);
        if (tuvBg == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.IL.bg(tuvBg);
        this.WR = tuvBg.xFs();
        bg(tuvBg, bundle);
        if (bundle != null) {
            if (tuvBg.dY()) {
                this.Ta.set(true);
            }
            if (tuvBg.XQ() && (bgVar = this.IL) != null) {
                bgVar.Ta.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar2 = this.IL;
            if (bgVar2 != null) {
                bgVar2.DDQ.iR();
            }
        }
        try {
            tuV();
            Fy();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.BVA", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.yDt.bX.IL();
            finish();
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.os.Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = new com.bytedance.sdk.openadsdk.component.reward.bg.bg(this, this.eqN, tuv, this, 0);
        this.IL = bgVar;
        com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(bgVar, getIntent(), bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            bg(intent);
            tuv.bg(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.IL.Ld) {
            bg();
        }
        com.bytedance.sdk.openadsdk.component.reward.IL.IL ilBg = com.bytedance.sdk.openadsdk.component.reward.IL.ldr.bg(this.IL);
        this.bX = ilBg;
        this.IL.dS = ilBg;
        com.bytedance.sdk.openadsdk.utils.PX.bg(this.IL);
        new java.lang.StringBuilder("init: mAdType = ").append(this.bX);
    }

    private void tuV() {
        setContentView(this.IL.CQc);
        this.IL.CQc.bg(this.bX);
        this.bX.bg(this, this.eqN);
        this.bX.VB();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar == null || bgVar.IL == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL.IL;
        if (this.iR && !tuv.rr() && !android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tuV.bg(this, tuv))) {
            finish();
        }
        if (tuv.rr()) {
            tuv.zx(false);
        }
    }

    private void Fy() {
        this.bX.bg(this.eo);
        this.ldr = (int) this.IL.rri.DDQ();
        vb();
        bX();
        if (this.IL.IL.hi() == null || this.IL.IL.hi().bg() == null) {
            return;
        }
        this.IL.IL.hi().bg().bg(0L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar != null && bgVar.DDQ != null) {
            this.IL.DDQ.IL(z);
            this.IL.DDQ.bX(z);
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar2 = this.IL;
        if (bgVar2 == null || !(bgVar2.dS instanceof com.bytedance.sdk.openadsdk.component.reward.IL.zx)) {
            return;
        }
        ((com.bytedance.sdk.openadsdk.component.reward.IL.zx) this.IL.dS).IL(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void VB() {
        if (!this.IL.yDt.getAndSet(true) || com.bytedance.sdk.openadsdk.core.model.rri.bX(this.IL.IL)) {
            this.IL.DDQ.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void Kg() {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.Ta();
    }

    public void bg(boolean z, int i) {
        bg(z, false, i);
    }

    public void bg(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.bg(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void WR() {
        this.IL.rri.Uq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public android.view.View eo() {
        return this.IL.rri.aGH();
    }

    protected void bX() {
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.IL.IL)) {
            bg(false, com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.bX);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il != null) {
            il.bg(this.IL.LKE.ldr());
            this.bX.Ja();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onStart ".concat(java.lang.String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar == null) {
            return;
        }
        bgVar.VJ.VJ();
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.IL.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il;
        super.onResume();
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onResume ".concat(java.lang.String.valueOf(this)));
        if (this.IL == null || (il = this.bX) == null) {
            return;
        }
        il.xxp();
        this.IL.txA = true;
        this.IL.Uw.IL(this.eqN);
        if (LZ()) {
            this.IL.ayS.bg(this.IL.IL.ZyO());
        }
        this.IL.LKE.Lq();
        this.IL.VJ.tC();
        this.IL.JAA.Ta();
        if (this.bX.IL()) {
            this.IL.rri.bg(this.bX);
            this.IL.rri.bg(false, this, this.PX != 0);
        }
        this.PX++;
        iR();
        if (this.IL.Ja != null) {
            this.IL.Ja.iR();
        }
        this.IL.Uw.bg(this.eqN);
        this.bX.tuV();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onPause ".concat(java.lang.String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.Fy();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onStop ".concat(java.lang.String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.LZ();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "onDestroy ".concat(java.lang.String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar == null || this.bX == null) {
            return;
        }
        if (bgVar.cZH > 0 && this.IL.Ta.get()) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime() - this.IL.cZH), this.IL.IL, this.bg, this.IL.rri.bg());
            this.IL.cZH = 0L;
        }
        this.IL.aGH.IL();
        this.eqN.removeCallbacksAndMessages(null);
        this.bX.tC();
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.IL.IL);
        final com.bytedance.sdk.openadsdk.AdSlot adSlotVW = this.IL.IL.VW();
        if (!this.IL.rri.kMt() && adSlotVW != null && android.text.TextUtils.isEmpty(adSlotVW.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this.xxp()) {
                        com.bytedance.sdk.openadsdk.component.reward.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(adSlotVW);
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(adSlotVW);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.utils.PX.bg();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (bgVar.Ta.get()) {
            this.IL.IL.Kg(true);
        }
        if (this.Ta.get()) {
            this.IL.IL.wF();
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(this.IL, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il;
        if (this.IL == null || (il = this.bX) == null) {
            super.onBackPressed();
        } else {
            il.rri();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.IL;
        if (bgVar == null) {
            return;
        }
        bgVar.Uw.bg();
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.bg(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void ldr() {
        if (this.Ta.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onShow, ".concat(java.lang.String.valueOf(this)));
            zx();
        }
    }

    protected com.bytedance.sdk.openadsdk.IListenerManager IL(int i) {
        if (this.zx == null) {
            this.zx = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(i));
        }
        return this.zx;
    }

    protected void iR() {
        if (VzQ() && !this.VB) {
            this.VB = true;
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr ldrVar = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this.IL.Uq;
                    float[] fArrBg = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this.IL.Uw.bg(com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this.WR);
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity tTBaseVideoActivity = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this;
                    ldrVar.bg(fArrBg, tTBaseVideoActivity, tTBaseVideoActivity.bX);
                }
            });
        }
    }

    protected void Ta() {
        android.os.Message message = new android.os.Message();
        message.what = 400;
        if (xxp()) {
            bg(10000);
        }
        this.eqN.sendMessageDelayed(message, 2000L);
    }

    protected void Lq() {
        this.eqN.removeMessages(400);
    }

    private boolean LZ() {
        if (this.IL.eo.get() && this.IL.iR) {
            return false;
        }
        if ((this instanceof com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity) || (this instanceof com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity)) {
            return this.IL.eo.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.IL == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.JAA.zx()) {
            com.bytedance.sdk.openadsdk.utils.ZQc.IL((android.app.Activity) this);
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.IL.IL) && !this.IL.eo.get()) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("invalid finish", "playable", new java.lang.RuntimeException());
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.zx(this.IL.IL) || this.IL.JAA.Kg(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.IL)) {
                return;
            }
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("invalid finish", "playable", new java.lang.RuntimeException());
        }
    }
}
