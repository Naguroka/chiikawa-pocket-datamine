package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg extends com.bytedance.sdk.openadsdk.activity.ldr implements com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL {
    protected com.bytedance.sdk.openadsdk.component.reward.IL.IL IL;
    private boolean Lq;
    private int Ta;
    protected com.bytedance.sdk.openadsdk.component.reward.bg.bg bX;
    protected final com.bytedance.sdk.component.utils.JAA bg;
    protected int eqN;
    private android.os.Bundle iR;
    private int ldr;
    private boolean yDt;
    private final java.util.concurrent.atomic.AtomicBoolean zx;

    protected abstract void IL();

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void PX() {
    }

    protected abstract void bX();

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public abstract void bg(android.os.Bundle bundle);

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(boolean z) {
    }

    protected abstract void iR();

    @Override // com.bytedance.sdk.openadsdk.activity.ldr, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void yDt() {
    }

    public bg(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        super(il, tuv, i);
        this.bg = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
        this.zx = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.ldr = 1;
        this.Ta = 0;
        this.yDt = false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void bg(android.app.Activity activity, android.os.Bundle bundle) {
        this.iR = bundle;
        super.bg(activity, bundle);
        bg(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final android.view.View bg() {
        return this.bX.CQc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        super.bg(activity, zxVar);
        this.ldr = this.Kg.xFs();
        bg(this.Kg, this.iR);
        if (this.bX.Ny && this.WR > 0) {
            this.bX.RJ = zxVar.eqN;
        }
        try {
            rri();
            aGH();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.yDt.bX.IL();
            Ja();
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.os.Bundle bundle) {
        android.app.Activity activityJAA = JAA();
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = new com.bytedance.sdk.openadsdk.component.reward.bg.bg(activityJAA, this.bg, tuv, this, 1);
        this.bX = bgVar;
        bgVar.Ny = kMt().bg();
        this.bX.bOf = kMt().iR();
        this.bX.kU = this;
        this.bX.VW = kMt().xxp();
        android.content.Intent intent = activityJAA.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(this.bX, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(intent, this.bX);
            tuv.bg(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.bX.Ld) {
            IL();
        }
        com.bytedance.sdk.openadsdk.component.reward.IL.IL ilBg = com.bytedance.sdk.openadsdk.component.reward.IL.ldr.bg(this.bX);
        this.IL = ilBg;
        this.bX.dS = ilBg;
        this.bX.ZQc.bg(this);
        if (this.bX.Ny) {
            this.bX.rri.bg(new com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg() { // from class: com.bytedance.sdk.openadsdk.activity.bg.1
                @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg
                public void bg(int i) {
                    com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.bg.this.kMt();
                    if (ilKMt == null) {
                        return;
                    }
                    ilKMt.bg(i);
                }
            });
            kMt().iR().setShowSound(com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv));
        }
        com.bytedance.sdk.openadsdk.utils.PX.bg(this.bX);
        new java.lang.StringBuilder("init: mAdType = ").append(this.IL);
    }

    private void rri() {
        this.bX.CQc.bg(this.IL);
        this.IL.bg(this, this.bg);
        this.IL.VB();
    }

    private void aGH() {
        this.IL.bg(this.PX);
        this.eqN = (int) this.bX.rri.DDQ();
        if (this.bX.Ny) {
            bg(this.bX.DDQ.zx());
            bg(this.bX.DDQ.eqN());
        }
        bX();
        daV();
        if (this.bX.IL.hi() == null || this.bX.IL.hi().bg() == null) {
            return;
        }
        this.bX.IL.hi().bg().bg(0L);
    }

    private void bg(com.bytedance.sdk.openadsdk.core.IL.IL il) {
        if (il != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("ad_show_order", java.lang.Integer.valueOf(this.WR + 1));
            il.bg(map);
        }
    }

    private boolean VW() {
        if (this.bX.eo.get() && this.bX.iR) {
            return false;
        }
        if (this.Kg.bg()) {
            return this.bX.eo.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(android.app.Activity activity) {
        super.bg(activity);
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        if (bgVar == null) {
            return;
        }
        bgVar.Uw.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void IL(android.app.Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il;
        super.IL(activity);
        if (this.bX == null || (il = this.IL) == null) {
            return;
        }
        il.xxp();
        this.bX.txA = true;
        this.bX.Uw.IL(this.bg);
        if (VW()) {
            this.bX.ayS.bg(this.bX.IL.ZyO());
        }
        this.bX.LKE.Lq();
        this.bX.VJ.tC();
        this.bX.JAA.Ta();
        if (this.IL.IL()) {
            this.bX.rri.bg(this.IL);
            this.bX.rri.bg(false, this, this.Ta != 0);
        }
        this.Ta++;
        VJ();
        if (this.bX.Ja != null) {
            this.bX.Ja.iR();
        }
        this.bX.Uw.bg(this.bg);
        this.IL.tuV();
    }

    private void VJ() {
        if (this.Kg.bg() && !this.yDt) {
            this.yDt = true;
            bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.bg.2
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
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr ldrVar = com.bytedance.sdk.openadsdk.activity.bg.this.bX.Uq;
                    float[] fArrBg = com.bytedance.sdk.openadsdk.activity.bg.this.bX.Uw.bg(com.bytedance.sdk.openadsdk.activity.bg.this.ldr);
                    com.bytedance.sdk.openadsdk.activity.bg bgVar = com.bytedance.sdk.openadsdk.activity.bg.this;
                    ldrVar.bg(fArrBg, bgVar, bgVar.IL);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bX(android.app.Activity activity) {
        super.bX(activity);
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.LZ();
    }

    private void daV() {
        if (this.Kg.bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bX.IL)) {
            bg(false, com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.bX);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il != null) {
            il.bg(this.bX.LKE.ldr());
            this.IL.Ja();
        }
    }

    public final void bg(boolean z, int i) {
        bg(z, false, i);
    }

    public final void bg(boolean z, boolean z2, int i) {
        this.bX.ZQc.bg(z, z2, false, this.bX.dS, i);
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public final void bg(android.os.Message message) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.bg(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void eqN() {
        Uq();
        this.bX.IL.fkt();
        this.bX.IL.bg(true);
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX.IL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bX.IL, this.bX.zx, this.bX.IL.xZ());
        }
    }

    protected final void zx() {
        android.os.Message message = new android.os.Message();
        message.what = 400;
        if (this.Kg.fE()) {
            bg(10000);
        }
        this.bg.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void ldr() {
        if (this.zx.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onShow, ".concat(java.lang.String.valueOf(this)));
            iR();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void Kg() {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.Ta();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void eqN(android.app.Activity activity) {
        super.eqN(activity);
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        if (bgVar == null) {
            return;
        }
        bgVar.VJ.VJ();
        com.bytedance.sdk.openadsdk.utils.bX.bg(activity, this.bX.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void zx(android.app.Activity activity) {
        super.zx(activity);
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.Fy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void WR() {
        this.bX.rri.Uq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final android.view.View eo() {
        return this.bX.rri.aGH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void VB() {
        if (!this.bX.yDt.getAndSet(true) || com.bytedance.sdk.openadsdk.core.model.rri.bX(this.bX.IL)) {
            this.bX.DDQ.bg();
        }
    }

    protected final void Ta() {
        this.bg.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void Lq() {
        super.Lq();
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.tC();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg
    public void bg(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.IL.IL il, int i) {
        bg(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg
    public void vb() {
        com.bytedance.sdk.openadsdk.activity.bX bXVarZx;
        com.bytedance.sdk.openadsdk.activity.IL ilKMt = kMt();
        if (ilKMt == null || (bXVarZx = ilKMt.zx()) == null) {
            return;
        }
        bXVarZx.zx();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void xxp() {
        super.xxp();
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il != null) {
            il.rri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.ldr ldrVar2, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        super.bg(ldrVar, ldrVar2, zxVar);
        if (ldrVar == this && (ldrVar2 instanceof com.bytedance.sdk.openadsdk.activity.bX)) {
            if (zxVar.IL == 3) {
                this.bX.rri.bg(!this.bX.rri.Uw() ? 1 : 0, 2);
            } else if (zxVar.IL == 6) {
                this.bX.rri.bg(!this.bX.rri.Uw() ? 1 : 0, !this.bX.rri.Uw() ? 1 : 0);
            } else if (zxVar.IL == 5 && !com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX.IL) && zxVar.zx) {
                this.bX.rri.bg("skip", true);
            }
            this.bX.ayS.bg(false);
            this.bX.ayS.eqN(false);
        }
        if (ldrVar2.WR != 0 || this.WR == 0) {
            return;
        }
        this.Kg.WR("0");
        java.util.Map<java.lang.String, java.lang.Object> mapJA = this.Kg.jA();
        if (mapJA != null) {
            mapJA.put("price", "0");
        }
    }

    public void bg(float f) {
        com.bytedance.sdk.openadsdk.activity.IL ilKMt = kMt();
        if (ilKMt == null) {
            return;
        }
        ilKMt.bg(f);
        if (this.Lq || f < this.Kg.jB() / 100.0f) {
            return;
        }
        this.Lq = true;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVarKg = ilKMt.Kg();
        if (ldrVarKg instanceof com.bytedance.sdk.openadsdk.activity.bg) {
            ((com.bytedance.sdk.openadsdk.activity.bg) ldrVarKg).VzQ();
        }
    }

    public void VzQ() {
        com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.Kg.uV()).bg(), this.Kg);
        ilBg.bg("material_meta", this.Kg);
        ilBg.bg("ad_slot", this.Kg.VW());
        com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.activity.bg.3
            @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public boolean tuV() {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        return bgVar != null && bgVar.rri.kMt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    protected java.lang.String Fy() {
        return this.bX.Pae;
    }

    protected com.bytedance.sdk.openadsdk.activity.IL.zx IL(int i) {
        com.bytedance.sdk.openadsdk.activity.IL.zx zxVar = new com.bytedance.sdk.openadsdk.activity.IL.zx(i, this.bX);
        zxVar.eqN = this.bX.RJ;
        return zxVar;
    }

    public void LZ() {
        kMt().bg(this, IL(com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.IL));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        if (bgVar != null && bgVar.DDQ != null) {
            this.bX.DDQ.IL(z);
            this.bX.DDQ.bX(z);
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar2 = this.bX;
        if (bgVar2 == null || !(bgVar2.dS instanceof com.bytedance.sdk.openadsdk.component.reward.IL.zx)) {
            return;
        }
        ((com.bytedance.sdk.openadsdk.component.reward.IL.zx) this.bX.dS).IL(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public com.bytedance.sdk.openadsdk.component.reward.bg.bg tC() {
        return this.bX;
    }
}
