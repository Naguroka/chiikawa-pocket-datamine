package com.json;

/* JADX INFO: loaded from: classes5.dex */
class so extends com.json.e {
    private final java.lang.String i = com.json.gp.f2697a;

    so(int i) {
        this.g = i;
    }

    @Override // com.json.e
    public java.lang.String a() {
        return com.json.gp.f2697a;
    }

    @Override // com.json.e
    public java.lang.String a(java.util.ArrayList<com.json.wb> arrayList, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        this.f = jSONObject;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator<com.json.wb> it = arrayList.iterator();
            while (it.hasNext()) {
                org.json.JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.json.e
    public java.lang.String c() {
        return "outcome";
    }
}
