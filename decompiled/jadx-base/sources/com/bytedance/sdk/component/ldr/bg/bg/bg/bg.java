package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.ldr.bg.bg.bg.IL {
    private static volatile com.bytedance.sdk.component.ldr.bg.bg.bg.bg bg;

    @Override // com.bytedance.sdk.component.ldr.bg.bg.bg.IL
    public /* bridge */ /* synthetic */ com.bytedance.sdk.component.ldr.bg.bg.bg.IL.C0115IL bg() {
        return super.bg();
    }

    public static com.bytedance.sdk.component.ldr.bg.bg.bg.bg bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.ldr.bg.bg.bg.bg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg(context);
                }
            }
        }
        return bg;
    }

    private bg(android.content.Context context) {
        super(context);
    }
}
