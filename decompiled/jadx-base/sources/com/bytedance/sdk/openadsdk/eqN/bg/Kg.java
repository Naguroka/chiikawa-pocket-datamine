package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Kg implements com.bytedance.sdk.component.ldr.bg.bg.zx {
    public static final com.bytedance.sdk.openadsdk.eqN.bg.Kg bg = new com.bytedance.sdk.openadsdk.eqN.bg.Kg();
    private volatile android.database.sqlite.SQLiteDatabase IL;

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String IL() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String bX() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String bg() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String eqN() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String ldr() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public java.lang.String zx() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.zx
    public android.database.sqlite.SQLiteDatabase bg(android.content.Context context) {
        if (this.IL == null) {
            synchronized (this) {
                if (this.IL == null) {
                    this.IL = com.bytedance.sdk.openadsdk.core.zx.bg(context).bg().bg();
                }
            }
        }
        return this.IL;
    }
}
