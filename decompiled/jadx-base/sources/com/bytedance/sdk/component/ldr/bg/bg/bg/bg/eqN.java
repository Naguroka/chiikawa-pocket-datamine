package com.bytedance.sdk.component.ldr.bg.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg {
    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg
    public byte bX() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg
    public byte eqN() {
        return (byte) 0;
    }

    public eqN(android.content.Context context, com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        super(context, bgVar);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg, com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX
    public java.lang.String IL() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        if (zxVarEqN != null) {
            return zxVarEqN.bg();
        }
        return null;
    }

    public static java.lang.String bX(java.lang.String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
