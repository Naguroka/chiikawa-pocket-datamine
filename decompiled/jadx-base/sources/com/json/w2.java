package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class w2 extends com.json.br {
    private static java.lang.String h = "type";
    private static java.lang.String i = "numOfAdUnits";
    private static java.lang.String j = "firstCampaignCredits";
    private static java.lang.String k = "totalNumberCredits";
    private static java.lang.String l = "productType";
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private boolean g;

    public w2(java.lang.String str) {
        boolean z;
        super(str);
        if (a(h)) {
            k(d(h));
        }
        if (a(i)) {
            h(d(i));
            z = true;
        } else {
            z = false;
        }
        a(z);
        if (a(j)) {
            g(d(j));
        }
        if (a(k)) {
            j(d(k));
        }
        if (a(l)) {
            i(d(l));
        }
    }

    private void a(boolean z) {
        this.g = z;
    }

    public java.lang.String b() {
        return this.e;
    }

    public java.lang.String c() {
        return this.d;
    }

    public java.lang.String d() {
        return this.c;
    }

    public java.lang.String e() {
        return this.f;
    }

    public java.lang.String f() {
        return this.b;
    }

    public void g(java.lang.String str) {
        this.e = str;
    }

    public boolean g() {
        return this.g;
    }

    public void h(java.lang.String str) {
        this.d = str;
    }

    public void i(java.lang.String str) {
        this.c = str;
    }

    public void j(java.lang.String str) {
        this.f = str;
    }

    public void k(java.lang.String str) {
        this.b = str;
    }
}
