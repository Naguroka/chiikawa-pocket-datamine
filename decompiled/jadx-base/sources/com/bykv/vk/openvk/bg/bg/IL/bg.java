package com.bykv.vk.openvk.bg.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static int IL = 10;
    public static int bX = 10;
    public static int bg = 10;
    public static int eqN = 10;
    private static com.bykv.vk.openvk.bg.bg.bg.bg.IL zx;

    public static void bg(android.content.Context context) {
        com.bykv.vk.openvk.bg.bg.bg.iR.bg.bg(context);
    }

    public static void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            bg = jSONObject.optInt("splash", 10);
            IL = jSONObject.optInt(com.json.s.j, 10);
            bX = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            eqN = iOptInt;
            if (bg < 0) {
                bg = 10;
            }
            if (IL < 0) {
                IL = 10;
            }
            if (bX < 0) {
                bX = 10;
            }
            if (iOptInt < 0) {
                eqN = 10;
            }
            java.lang.Object[] objArr = new java.lang.Object[8];
            java.lang.Integer.valueOf(bg);
            java.lang.Integer.valueOf(IL);
            java.lang.Integer.valueOf(bX);
            java.lang.Integer.valueOf(eqN);
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    public static void bg(com.bykv.vk.openvk.bg.bg.bg.bg.IL il) {
        zx = il;
    }

    public static void bg() {
        com.bykv.vk.openvk.bg.bg.bg.bg.IL il = zx;
        if (il != null) {
            il.eqN();
        }
    }

    public static int IL() {
        return bg;
    }

    public static int bX() {
        return IL;
    }

    public static int eqN() {
        return bX;
    }

    public static int zx() {
        return eqN;
    }
}
