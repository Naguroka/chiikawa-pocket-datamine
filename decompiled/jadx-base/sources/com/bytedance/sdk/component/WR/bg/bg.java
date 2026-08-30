package com.bytedance.sdk.component.WR.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static volatile com.bytedance.sdk.component.WR.bg.bg IL;
    private volatile com.bytedance.sdk.component.WR.bg.IL bg;

    private bg() {
    }

    public static com.bytedance.sdk.component.WR.bg.bg bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.component.WR.bg.bg.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.component.WR.bg.bg();
                }
            }
        }
        return IL;
    }

    public void bg(com.bytedance.sdk.component.WR.bg.IL il) {
        this.bg = il;
    }

    public com.bytedance.sdk.component.WR.bg.IL IL() {
        return this.bg;
    }
}
