package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class es {
    public static final com.applovin.impl.es f = new com.applovin.impl.es();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.es f770a;
    private final java.lang.String b;
    private final java.util.Map c;
    protected java.lang.String d;
    protected final java.util.List e;

    public java.lang.String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + '}';
    }

    private es() {
        this.f770a = null;
        this.b = "";
        this.c = java.util.Collections.emptyMap();
        this.d = "";
        this.e = java.util.Collections.emptyList();
    }

    public java.lang.String c() {
        return this.b;
    }

    public es(java.lang.String str, java.util.Map map, com.applovin.impl.es esVar) {
        this.f770a = esVar;
        this.b = str;
        this.c = java.util.Collections.unmodifiableMap(map);
        this.e = new java.util.ArrayList();
    }

    public java.lang.String d() {
        return this.d;
    }

    public java.util.List b() {
        return java.util.Collections.unmodifiableList(this.e);
    }

    public java.util.List a(java.lang.String str) {
        if (str != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.e.size());
            for (com.applovin.impl.es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    arrayList.add(esVar);
                }
            }
            return arrayList;
        }
        throw new java.lang.IllegalArgumentException("No name specified.");
    }

    public java.util.Map a() {
        return this.c;
    }

    public com.applovin.impl.es c(java.lang.String str) {
        if (str != null) {
            for (com.applovin.impl.es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    return esVar;
                }
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("No name specified.");
    }

    public com.applovin.impl.es b(java.lang.String str) {
        if (str != null) {
            if (this.e.size() <= 0) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                com.applovin.impl.es esVar = (com.applovin.impl.es) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(esVar.c())) {
                    return esVar;
                }
                arrayList.addAll(esVar.b());
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("No name specified.");
    }
}
