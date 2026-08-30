package com.bytedance.sdk.component.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
final class zx {
    int IL;
    int bX;
    final byte[] bg;
    boolean eqN;
    com.bytedance.sdk.component.IL.bg.IL.zx iR;
    com.bytedance.sdk.component.IL.bg.IL.zx ldr;
    boolean zx;

    zx() {
        this.bg = new byte[8192];
        this.zx = true;
        this.eqN = false;
    }

    zx(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.bg = bArr;
        this.IL = i;
        this.bX = i2;
        this.eqN = z;
        this.zx = z2;
    }

    final com.bytedance.sdk.component.IL.bg.IL.zx bg() {
        this.eqN = true;
        return new com.bytedance.sdk.component.IL.bg.IL.zx(this.bg, this.IL, this.bX, true, false);
    }

    public final com.bytedance.sdk.component.IL.bg.IL.zx IL() {
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.ldr;
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar2 = zxVar != this ? zxVar : null;
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar3 = this.iR;
        if (zxVar3 != null) {
            zxVar3.ldr = zxVar;
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar4 = this.ldr;
        if (zxVar4 != null) {
            zxVar4.iR = zxVar3;
        }
        this.ldr = null;
        this.iR = null;
        return zxVar2;
    }

    public final com.bytedance.sdk.component.IL.bg.IL.zx bg(com.bytedance.sdk.component.IL.bg.IL.zx zxVar) {
        zxVar.iR = this;
        zxVar.ldr = this.ldr;
        this.ldr.iR = zxVar;
        this.ldr = zxVar;
        return zxVar;
    }
}
