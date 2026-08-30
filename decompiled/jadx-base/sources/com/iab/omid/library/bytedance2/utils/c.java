package com.iab.omid.library.bytedance2.utils;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.view.WindowManager f2406a;
    private static java.lang.String[] b = {"x", "y", "width", "height"};
    static float c = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2407a;

        static {
            int[] iArr = new int[com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.values().length];
            f2407a = iArr;
            try {
                iArr[com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f2408a;
        final float b;

        b(float f, float f2) {
            this.f2408a = f;
            this.b = f2;
        }
    }

    static float a(int i) {
        return i / c;
    }

    private static com.iab.omid.library.bytedance2.utils.c.b a(org.json.JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f2406a != null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            f2406a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new com.iab.omid.library.bytedance2.utils.c.b(fA, fA2);
    }

    public static org.json.JSONObject a(int i, int i2, int i3, int i4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f2406a = (android.view.WindowManager) context.getSystemService("window");
        }
    }

    public static void a(org.json.JSONObject jSONObject, com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with setting output device status", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.a.C0220a c0220a) {
        com.iab.omid.library.bytedance2.internal.e eVarA = c0220a.a();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = c0220a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with setting has window focus", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with setting ad session id", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("JSONException during JSONObject.put for name [" + str + com.ironsource.y8.i.e, e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new org.json.JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (org.json.JSONException unused) {
        }
    }

    private static boolean a(com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus outputDeviceStatus) {
        return com.iab.omid.library.bytedance2.utils.c.a.f2407a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static void b(org.json.JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.utils.c.b bVarA = a(jSONObject);
        try {
            jSONObject.put("width", bVarA.f2408a);
            jSONObject.put("height", bVarA.b);
        } catch (org.json.JSONException unused) {
        }
    }

    public static void b(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.bytedance2.utils.d.a("Error with setting not visible reason", e);
        }
    }

    private static boolean b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        for (java.lang.String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }
}
