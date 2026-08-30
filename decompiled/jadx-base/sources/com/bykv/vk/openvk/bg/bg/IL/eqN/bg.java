package com.bykv.vk.openvk.bg.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg implements com.bykv.vk.openvk.bg.bg.IL.eqN.bX {
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx IL;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN Kg;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL bX;
    protected boolean bg = false;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg eqN;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX iR;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR ldr;
    private com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr zx;

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx zxVar) {
        this.IL = zxVar;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL il) {
        this.bX = il;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg bgVar) {
        this.eqN = bgVar;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr ldrVar) {
        this.zx = ldrVar;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX interfaceC0069bX) {
        this.iR = interfaceC0069bX;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN eqn) {
        this.Kg = eqn;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public final void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR iRVar) {
        this.ldr = iRVar;
    }

    public void bg() {
        this.IL = null;
        this.eqN = null;
        this.bX = null;
        this.zx = null;
        this.ldr = null;
        this.iR = null;
        this.Kg = null;
    }

    protected final void IL() {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx zxVar = this.IL;
            if (zxVar != null) {
                zxVar.IL(this);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final void bX() {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL il = this.bX;
            if (il != null) {
                il.bg(this);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final void bg(int i) {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg bgVar = this.eqN;
            if (bgVar != null) {
                bgVar.bg(this, i);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final void eqN() {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr ldrVar = this.zx;
            if (ldrVar != null) {
                ldrVar.bX(this);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final void bg(int i, int i2, int i3, int i4) {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR iRVar = this.ldr;
            if (iRVar != null) {
                iRVar.bg(this, i, i2, i3, i4);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final boolean bg(int i, int i2) {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX interfaceC0069bX = this.iR;
            return interfaceC0069bX != null && interfaceC0069bX.bg(this, i, i2);
        } catch (java.lang.Throwable unused) {
        }
    }

    protected final boolean IL(int i, int i2) {
        try {
            com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN eqn = this.Kg;
            return eqn != null && eqn.IL(this, i, i2);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(boolean z) {
        this.bg = z;
    }
}
