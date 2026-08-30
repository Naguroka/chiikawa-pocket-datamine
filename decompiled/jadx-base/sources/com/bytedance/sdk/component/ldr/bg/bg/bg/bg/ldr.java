package com.bytedance.sdk.component.ldr.bg.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR {
    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR
    public byte bX() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR
    public byte bg() {
        return (byte) 1;
    }

    public ldr(android.content.Context context, com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        super(context, bgVar);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR, com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX
    public java.lang.String IL() {
        return com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().zx();
    }

    public static java.lang.String bg(java.lang.String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
