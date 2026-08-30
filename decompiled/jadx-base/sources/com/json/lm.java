package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2894a;

    public lm(java.lang.String str) {
        this.f2894a = str;
    }

    private com.json.ih a() throws java.lang.Exception {
        com.json.ih ihVar = new com.json.ih(this.f2894a, "metadata.json");
        if (!ihVar.exists()) {
            a(ihVar);
        }
        return ihVar;
    }

    private void a(com.json.ih ihVar) throws java.lang.Exception {
        com.json.sdk.utils.IronSourceStorageUtils.saveFile(new org.json.JSONObject().toString().getBytes(), ihVar.getPath());
    }

    private boolean a(org.json.JSONObject jSONObject) throws java.lang.Exception {
        return com.json.sdk.utils.IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(java.lang.String str) throws java.lang.Exception {
        org.json.JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    synchronized boolean a(java.lang.String str, org.json.JSONObject jSONObject) throws java.lang.Exception {
        org.json.JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    boolean a(java.util.ArrayList<com.json.ih> arrayList) throws java.lang.Exception {
        java.util.Iterator<com.json.ih> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    synchronized org.json.JSONObject b() throws java.lang.Exception {
        return new org.json.JSONObject(com.json.sdk.utils.IronSourceStorageUtils.readFile(a()));
    }

    synchronized boolean b(java.lang.String str, org.json.JSONObject jSONObject) throws java.lang.Exception {
        org.json.JSONObject jSONObjectB;
        jSONObjectB = b();
        org.json.JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            jSONObjectB.putOpt(str, jSONObject);
        }
        return a(jSONObjectB);
    }
}
