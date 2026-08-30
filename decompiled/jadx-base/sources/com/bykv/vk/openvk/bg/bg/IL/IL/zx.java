package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    static volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX IL;
    private static volatile android.content.Context VB;
    public static volatile java.lang.Integer WR;
    static volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.IL bg;
    private static volatile com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX eo;
    public static volatile boolean eqN;
    static volatile boolean ldr;
    public static final boolean bX = com.bytedance.sdk.component.utils.PX.eqN();
    static volatile boolean zx = true;
    static volatile int iR = 0;
    public static volatile int Kg = 3;

    public static android.content.Context bg() {
        return VB;
    }

    public static void bg(boolean z) {
        zx = z;
    }

    public static void IL(boolean z) {
        ldr = z;
    }

    public static void bg(int i) {
        iR = i;
    }

    public static void bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bXVar, android.content.Context context) {
        if (bXVar == null || context == null) {
            throw new java.lang.IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        VB = context.getApplicationContext();
        if (IL != null) {
            return;
        }
        if (bg != null) {
            throw null;
        }
        IL = bXVar;
        eo = com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.bg(context);
        IL.bg(new com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.zx.1
            @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg
            public void bg(java.lang.String str) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(java.lang.String.valueOf(str)));
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.bg
            public void bg(java.util.Set<java.lang.String> set) {
                com.bykv.vk.openvk.bg.bg.IL.IL.zx.eo.bg(set, 0);
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(java.lang.String.valueOf(set)));
                }
            }
        });
        com.bykv.vk.openvk.bg.bg.IL.IL.ldr ldrVarBg = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg();
        ldrVarBg.bg(bXVar);
        ldrVarBg.bg(eo);
        com.bykv.vk.openvk.bg.bg.IL.IL.eqN eqnBX = com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX();
        eqnBX.bg(bXVar);
        eqnBX.bg(eo);
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX IL() {
        return IL;
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.bg.IL bX() {
        return bg;
    }
}
