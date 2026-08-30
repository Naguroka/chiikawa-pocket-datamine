package com.apm.insight.l;

/* JADX INFO: compiled from: JSONWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.Writer f446a;
    private final java.util.List<com.apm.insight.l.h.a> b = new java.util.ArrayList();

    public final java.lang.String toString() {
        return "";
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: JSONWriter.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.apm.insight.l.h.a f447a = new com.apm.insight.l.h.a("EMPTY_ARRAY", 0);
        public static final com.apm.insight.l.h.a b = new com.apm.insight.l.h.a("NONEMPTY_ARRAY", 1);
        public static final com.apm.insight.l.h.a c = new com.apm.insight.l.h.a("EMPTY_OBJECT", 2);
        public static final com.apm.insight.l.h.a d = new com.apm.insight.l.h.a("DANGLING_KEY", 3);
        public static final com.apm.insight.l.h.a e = new com.apm.insight.l.h.a("NONEMPTY_OBJECT", 4);
        public static final com.apm.insight.l.h.a f = new com.apm.insight.l.h.a("NULL", 5);

        private a(java.lang.String str, int i) {
            super(str, i);
        }
    }

    private h(java.io.Writer writer) {
        this.f446a = writer;
    }

    private com.apm.insight.l.h a() throws org.json.JSONException, java.io.IOException {
        return a(com.apm.insight.l.h.a.f447a, com.ironsource.y8.i.d);
    }

    private com.apm.insight.l.h b() throws org.json.JSONException, java.io.IOException {
        com.apm.insight.l.h.a aVar = com.apm.insight.l.h.a.f447a;
        com.apm.insight.l.h.a aVar2 = com.apm.insight.l.h.a.b;
        return a(com.ironsource.y8.i.e);
    }

    private com.apm.insight.l.h c() throws org.json.JSONException, java.io.IOException {
        return a(com.apm.insight.l.h.a.c, "{");
    }

    private com.apm.insight.l.h d() throws org.json.JSONException, java.io.IOException {
        com.apm.insight.l.h.a aVar = com.apm.insight.l.h.a.c;
        com.apm.insight.l.h.a aVar2 = com.apm.insight.l.h.a.e;
        return a("}");
    }

    private com.apm.insight.l.h a(com.apm.insight.l.h.a aVar, java.lang.String str) throws org.json.JSONException, java.io.IOException {
        f();
        this.b.add(aVar);
        this.f446a.write(str);
        return this;
    }

    private com.apm.insight.l.h a(java.lang.String str) throws org.json.JSONException, java.io.IOException {
        e();
        java.util.List<com.apm.insight.l.h.a> list = this.b;
        list.remove(list.size() - 1);
        this.f446a.write(str);
        return this;
    }

    private com.apm.insight.l.h.a e() throws org.json.JSONException {
        java.util.List<com.apm.insight.l.h.a> list = this.b;
        return list.get(list.size() - 1);
    }

    private void a(com.apm.insight.l.h.a aVar) {
        java.util.List<com.apm.insight.l.h.a> list = this.b;
        list.set(list.size() - 1, aVar);
    }

    private com.apm.insight.l.h a(java.lang.Object obj) throws org.json.JSONException, java.io.IOException {
        if (obj instanceof org.json.JSONArray) {
            a((org.json.JSONArray) obj);
            return this;
        }
        if (obj instanceof org.json.JSONObject) {
            a((org.json.JSONObject) obj);
            return this;
        }
        f();
        if (obj == null || obj == org.json.JSONObject.NULL) {
            this.f446a.write("null");
        } else if (obj instanceof java.lang.Boolean) {
            this.f446a.write(java.lang.String.valueOf(obj));
        } else if (obj instanceof java.lang.Number) {
            this.f446a.write(org.json.JSONObject.numberToString((java.lang.Number) obj));
        } else {
            b(obj.toString());
        }
        return this;
    }

    private void b(java.lang.String str) throws java.io.IOException {
        this.f446a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                this.f446a.write("\\f");
            } else if (cCharAt == '\r') {
                this.f446a.write("\\r");
            } else {
                if (cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                    this.f446a.write(92);
                } else {
                    switch (cCharAt) {
                        case '\b':
                            this.f446a.write("\\b");
                            continue;
                        case '\t':
                            this.f446a.write("\\t");
                            continue;
                        case '\n':
                            this.f446a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f446a.write(java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                }
                this.f446a.write(cCharAt);
            }
        }
        this.f446a.write("\"");
    }

    private void f() throws org.json.JSONException, java.io.IOException {
        if (this.b.isEmpty()) {
            return;
        }
        com.apm.insight.l.h.a aVarE = e();
        if (aVarE == com.apm.insight.l.h.a.f447a) {
            a(com.apm.insight.l.h.a.b);
            return;
        }
        if (aVarE == com.apm.insight.l.h.a.b) {
            this.f446a.write(44);
        } else if (aVarE == com.apm.insight.l.h.a.d) {
            this.f446a.write(":");
            a(com.apm.insight.l.h.a.e);
        } else if (aVarE != com.apm.insight.l.h.a.f) {
            throw new org.json.JSONException("Nesting problem");
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.io.Writer writer) throws java.lang.Throwable {
        new com.apm.insight.l.h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(org.json.JSONArray jSONArray, java.io.Writer writer) throws java.lang.Throwable {
        new com.apm.insight.l.h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(org.json.JSONObject jSONObject) throws org.json.JSONException, java.io.IOException {
        c();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(org.json.JSONArray jSONArray) throws org.json.JSONException, java.io.IOException {
        a();
        for (int i = 0; i < jSONArray.length(); i++) {
            a(jSONArray.get(i));
        }
        b();
    }

    private com.apm.insight.l.h c(java.lang.String str) throws org.json.JSONException, java.io.IOException {
        com.apm.insight.l.h.a aVarE = e();
        if (aVarE == com.apm.insight.l.h.a.e) {
            this.f446a.write(44);
        } else if (aVarE != com.apm.insight.l.h.a.c) {
            throw new org.json.JSONException("Nesting problem");
        }
        a(com.apm.insight.l.h.a.d);
        b(str);
        return this;
    }
}
