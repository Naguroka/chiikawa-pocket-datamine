package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class WR {
    public static final java.util.Set<java.lang.String> IL = new java.util.HashSet<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.core.WR.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean VzQ = false;
    public static com.bytedance.sdk.openadsdk.core.Ta bg;
    private boolean Fy;
    private boolean Kg;
    private java.lang.String LZ;
    private java.lang.Integer Lq;
    private boolean PX;
    private boolean Ta;
    private int VB;
    private java.lang.String WR;
    private boolean bX;
    private java.lang.String eo;
    private java.lang.String eqN;
    private int iR;
    private java.lang.String ldr;
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.bX.eqN.bg> rri;
    private com.bytedance.sdk.openadsdk.core.Ta.bX.bX tC;
    private int tuV;
    private java.lang.Integer vb;
    private java.lang.Integer xxp;
    private android.graphics.Bitmap yDt;
    private java.lang.String zx;

    public boolean Lq() {
        return true;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.Ta ta) {
        bg = ta;
    }

    public boolean bg() {
        return this.Fy;
    }

    public void bg(boolean z) {
        this.Fy = z;
    }

    private WR() {
        this.bX = false;
        this.VB = 0;
        this.PX = true;
        this.Ta = false;
        this.yDt = null;
        this.Lq = null;
        this.vb = null;
        this.xxp = null;
        this.tuV = 0;
        this.rri = null;
        try {
            com.bykv.vk.openvk.bg.bg.bg.iR.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static com.bytedance.sdk.openadsdk.core.WR IL() {
        return com.bytedance.sdk.openadsdk.core.WR.bg.bg;
    }

    private static class bg {
        private static final com.bytedance.sdk.openadsdk.core.WR bg = new com.bytedance.sdk.openadsdk.core.WR();
    }

    public boolean bX() {
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "sdk_activate_init", true);
    }

    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "sdk_activate_init", java.lang.Boolean.valueOf(z));
    }

    public java.lang.String eqN() {
        if (android.text.TextUtils.isEmpty(this.eqN)) {
            java.lang.String strBg = bg("app_id", Long.MAX_VALUE);
            if (!android.text.TextUtils.isEmpty(strBg)) {
                this.eqN = strBg;
            }
        }
        return this.eqN;
    }

    public void bg(java.lang.String str) {
        Kg(str);
        this.eqN = str;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        bg("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eqN(7);
    }

    public java.lang.String zx() {
        java.lang.String str = this.zx;
        if (str != null) {
            return str;
        }
        java.lang.String strBg = bg("mediation_info", Long.MAX_VALUE);
        this.zx = strBg;
        if (strBg == null) {
            this.zx = "";
        }
        return this.zx;
    }

    public void IL(java.lang.String str) {
        this.zx = str;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        bg("mediation_info", str);
    }

    public java.lang.String ldr() {
        if (android.text.TextUtils.isEmpty(this.ldr)) {
            this.ldr = bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        }
        return this.ldr;
    }

    private java.lang.String bg(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (java.lang.String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public void bg(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_icon_id", "icon_id", java.lang.Integer.valueOf(i));
        }
        this.iR = i;
    }

    public int iR() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_icon_id", "icon_id", 0);
        }
        return this.iR;
    }

    public void IL(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final java.lang.Integer num = this.Lq;
            if (num == null || num.intValue() != i) {
                this.Lq = java.lang.Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                    bg(num, i);
                } else {
                    com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.WR.this.bg(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "sdk_coppa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "sdk_coppa", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(3, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "sdk_coppa", java.lang.Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(3, true);
    }

    public int Kg() {
        java.lang.Integer num = this.Lq;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "sdk_coppa", -1);
    }

    public int WR() {
        java.lang.Integer num = this.vb;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "tt_gdpr", -1);
    }

    public void bX(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final java.lang.Integer num = this.vb;
            if (num == null || num.intValue() != i) {
                this.vb = java.lang.Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                    IL(num, i);
                } else {
                    com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.3
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.WR.this.IL(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(java.lang.Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "tt_gdpr", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "tt_gdpr", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "tt_gdpr", java.lang.Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(4, true);
    }

    public void eqN(int i) {
        if (i != 0 && i != 1) {
            i = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_coppa", java.lang.Integer.valueOf(i));
        this.tuV = i;
    }

    public int eo() {
        int iBg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_coppa", -99);
        this.tuV = iBg;
        if (iBg == -99) {
            this.tuV = Kg();
        }
        return this.tuV;
    }

    public boolean VB() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "is_paid", false);
        }
        return this.Kg;
    }

    public java.lang.String PX() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("sp_global_file", "keywords", null);
        }
        return this.WR;
    }

    public java.lang.String Ta() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("sp_global_file", "extra_data", null);
        }
        return this.eo;
    }

    public void bX(final java.lang.String str) {
        WR(str);
        if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "extra_data", str);
        }
        this.eo = str;
    }

    public void zx(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", "title_bar_theme", java.lang.Integer.valueOf(i));
        }
        this.VB = i;
    }

    private static void Kg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.Ta ta;
        if (android.text.TextUtils.isEmpty(str) && (ta = bg) != null) {
            ta.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void WR(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Ta ta = bg;
        if (ta != null) {
            ta.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public com.bytedance.sdk.openadsdk.core.Ta.bX.bX yDt() {
        if (this.tC == null) {
            this.tC = new com.bytedance.sdk.openadsdk.core.Ta.bX.bX(10, 8);
        }
        return this.tC;
    }

    public android.graphics.Bitmap vb() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.component.utils.eqN.bg(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("sp_global_file", "pause_icon", null));
        }
        return this.yDt;
    }

    public boolean xxp() {
        return IL.contains(this.eqN);
    }

    public boolean VzQ() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.ayS.zx());
    }

    public java.lang.String tuV() {
        if (!android.text.TextUtils.isEmpty(this.LZ)) {
            return this.LZ;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.WR.bg();
        this.LZ = strBg;
        if (!android.text.TextUtils.isEmpty(strBg)) {
            return this.LZ;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.WR.bg(strValueOf);
        this.LZ = strValueOf;
        return strValueOf;
    }

    private static org.json.JSONObject eo(java.lang.String str) {
        java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("sp_global_file", str, null);
        if (android.text.TextUtils.isEmpty(strIL)) {
            return null;
        }
        try {
            return new org.json.JSONObject(strIL);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", java.lang.System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_file", str, jSONObject.toString());
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static java.lang.String bg(java.lang.String str, long j) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObjectEo = eo(str);
            if (jSONObjectEo == null) {
                return null;
            }
            if (java.lang.System.currentTimeMillis() - jSONObjectEo.getLong("time") <= j) {
                return jSONObjectEo.getString("value");
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", e.getMessage());
        }
        return null;
    }

    public static android.util.Pair<java.lang.String, java.lang.Long> eqN(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObjectEo = eo(str);
            if (jSONObjectEo == null) {
                return null;
            }
            return new android.util.Pair<>(jSONObjectEo.getString("value"), java.lang.Long.valueOf(jSONObjectEo.getLong("time")));
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public int Fy() {
        java.lang.Integer num = this.xxp;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_ccpa", -1);
    }

    public void ldr(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final java.lang.Integer num = this.xxp;
            if (num == null || num.intValue() != i) {
                this.xxp = java.lang.Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                    bX(num, i);
                } else {
                    com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.5
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.WR.this.bX(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(java.lang.Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_ccpa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_ccpa", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(5, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("sp_global_privacy", "global_ccpa", java.lang.Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(5, true);
    }

    public com.bytedance.sdk.openadsdk.core.bX.eqN.bg zx(java.lang.String str) {
        try {
            if (this.rri == null || str == null) {
                return null;
            }
            return this.rri.get(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        try {
            if (android.text.TextUtils.isEmpty(str) || bgVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.bX.eo.bg(6, str, bgVar);
                return;
            }
            if (this.rri == null) {
                synchronized (com.bytedance.sdk.openadsdk.core.WR.class) {
                    if (this.rri == null) {
                        this.rri = new java.util.concurrent.ConcurrentHashMap<>();
                    }
                }
            }
            if (this.rri != null) {
                this.rri.put(str, bgVar);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void ldr(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.bX.eo.bg(6, str);
            } else if (this.rri != null) {
                this.rri.remove(str);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void LZ() {
        try {
            if (this.rri == null || this.rri.size() != 0) {
                return;
            }
            this.rri = null;
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            th.getMessage();
        }
    }

    public void bX(boolean z) {
        this.bX = z;
    }

    public static boolean tC() {
        return VzQ;
    }

    public static void rri() {
        if (android.os.Build.VERSION.SDK_INT == 26 && "MI 6".equals(android.os.Build.MODEL)) {
            VzQ = true;
        }
    }

    public static boolean iR(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.kMt.bg || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }
}
