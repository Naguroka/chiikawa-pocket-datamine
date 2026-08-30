package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3623a = "com.google.market";
    public static final java.lang.String b = "com.android.vending";
    public static final java.lang.String c = "isInstalled";
    private static final java.lang.String d = "zo";
    private static final java.util.ArrayList<java.lang.String> e = new com.ironsource.zo.a();

    class a extends java.util.ArrayList<java.lang.String> {
        a() {
            add(com.json.zo.f3623a);
            add("com.android.vending");
        }
    }

    class b extends org.json.JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3624a;

        b(boolean z) throws org.json.JSONException {
            this.f3624a = z;
            put("isInstalled", z);
        }
    }

    private enum c {
        GOOGLE_PLAY(2, new java.lang.String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new java.lang.String[]{com.json.zo.f3623a}),
        SAMSUNG(5, new java.lang.String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new java.lang.String[]{"com.amazon.venezia"}),
        HUAWEI(7, new java.lang.String[]{"com.huawei.appmarket"});

        private static final java.util.Map<java.lang.String, com.ironsource.zo.c> h = new java.util.HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3625a;
        private final java.lang.String[] b;

        static {
            for (com.ironsource.zo.c cVar : values()) {
                for (java.lang.String str : cVar.d()) {
                    h.put(str, cVar);
                }
            }
        }

        c(int i2, java.lang.String[] strArr) {
            this.f3625a = i2;
            this.b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.ArrayList<java.lang.String> b() {
            return new java.util.ArrayList<>(h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f3625a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String[] d() {
            return this.b;
        }
    }

    private static org.json.JSONObject a(android.content.Context context) {
        return a(context, e);
    }

    private static org.json.JSONObject a(android.content.Context context, java.util.ArrayList<java.lang.String> arrayList) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.ArrayList<java.lang.String> arrayListB = b(context);
            for (java.lang.String str : arrayList) {
                jSONObject.put(str, a(arrayListB.contains(str.trim().toLowerCase(java.util.Locale.getDefault()))));
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            android.util.Log.d(d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static org.json.JSONObject a(boolean z) throws org.json.JSONException {
        return new com.ironsource.zo.b(z);
    }

    private static java.util.ArrayList<java.lang.String> b(android.content.Context context) {
        java.util.List<android.content.pm.ApplicationInfo> listO = com.json.im.S().f().o(context);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (android.content.pm.ApplicationInfo applicationInfo : listO) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(java.util.Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static java.lang.Integer c(android.content.Context context) {
        org.json.JSONObject jSONObjectA = a(context, com.ironsource.zo.c.b());
        int iPow = 0;
        for (com.ironsource.zo.c cVar : com.ironsource.zo.c.values()) {
            for (java.lang.String str : cVar.d()) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(str);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (((double) iPow) + java.lang.Math.pow(2.0d, cVar.c() - 1));
                    break;
                }
            }
        }
        return java.lang.Integer.valueOf(iPow);
    }

    public static boolean d(android.content.Context context) {
        org.json.JSONObject jSONObjectA = a(context);
        java.util.Iterator<java.lang.String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }
}
