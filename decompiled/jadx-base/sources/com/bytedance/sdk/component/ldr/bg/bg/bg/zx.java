package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.sdk.component.ldr.bg.bg.zx {
    public static final com.bytedance.sdk.component.ldr.bg.bg.bg.zx bg = new com.bytedance.sdk.component.ldr.bg.bg.bg.zx();
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
                    this.IL = new com.bytedance.sdk.component.ldr.bg.bg.bg.eqN(context).getWritableDatabase();
                }
            }
        }
        return this.IL;
    }
}
