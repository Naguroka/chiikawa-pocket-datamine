package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.cc.c f671a;
    protected boolean b;
    protected android.text.SpannedString c;
    protected android.text.SpannedString d;
    protected java.lang.String e;
    protected java.lang.String f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;

    public static com.applovin.impl.cc.b a() {
        return a(com.applovin.impl.cc.c.RIGHT_DETAIL);
    }

    public static int n() {
        return com.applovin.impl.cc.c.COUNT.c();
    }

    public static com.applovin.impl.cc.b a(com.applovin.impl.cc.c cVar) {
        return new com.applovin.impl.cc.b(cVar);
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f673a;

        c(int i2) {
            this.f673a = i2;
        }

        public int c() {
            return this.f673a;
        }

        public int b() {
            if (this == SECTION) {
                return com.applovin.sdk.R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return com.applovin.sdk.R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            if (this == DETAIL) {
                return com.applovin.sdk.R.layout.applovin_debugger_list_item_detail;
            }
            return com.applovin.sdk.R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    private cc(com.applovin.impl.cc.b bVar) {
        this.g = 0;
        this.h = 0;
        this.i = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.j = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f671a = bVar.f672a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
    }

    public int m() {
        return this.f671a.c();
    }

    public int j() {
        return this.f671a.b();
    }

    public boolean o() {
        return this.b;
    }

    public android.text.SpannedString k() {
        return this.c;
    }

    public android.text.SpannedString f() {
        return this.d;
    }

    public java.lang.String c() {
        return this.e;
    }

    public java.lang.String b() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public boolean p() {
        return this.m;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.impl.cc.c f672a;
        boolean b;
        android.text.SpannedString c;
        android.text.SpannedString d;
        java.lang.String e;
        java.lang.String f;
        int g = 0;
        int h = 0;
        int i = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        int j = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        int k = 0;
        int l = 0;
        boolean m;

        public b(com.applovin.impl.cc.c cVar) {
            this.f672a = cVar;
        }

        public com.applovin.impl.cc.b d(java.lang.String str) {
            return b(!android.text.TextUtils.isEmpty(str) ? new android.text.SpannedString(str) : null);
        }

        public com.applovin.impl.cc.b c(java.lang.String str) {
            return a(!android.text.TextUtils.isEmpty(str) ? new android.text.SpannedString(str) : null);
        }

        public com.applovin.impl.cc.b b(java.lang.String str) {
            this.e = str;
            return this;
        }

        public com.applovin.impl.cc.b a(java.lang.String str) {
            this.f = str;
            return this;
        }

        public com.applovin.impl.cc.b d(int i) {
            this.i = i;
            return this;
        }

        public com.applovin.impl.cc.b c(int i) {
            this.j = i;
            return this;
        }

        public com.applovin.impl.cc.b a(int i) {
            this.h = i;
            return this;
        }

        public com.applovin.impl.cc.b b(int i) {
            this.l = i;
            return this;
        }

        public com.applovin.impl.cc.b a(android.content.Context context) {
            this.h = com.applovin.sdk.R.drawable.applovin_ic_disclosure_arrow;
            this.l = com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public com.applovin.impl.cc.b b(boolean z) {
            this.m = z;
            return this;
        }

        public com.applovin.impl.cc.b a(boolean z) {
            this.b = z;
            return this;
        }

        public com.applovin.impl.cc.b b(android.text.SpannedString spannedString) {
            this.c = spannedString;
            return this;
        }

        public com.applovin.impl.cc.b a(android.text.SpannedString spannedString) {
            this.d = spannedString;
            return this;
        }

        public com.applovin.impl.cc a() {
            return new com.applovin.impl.cc(this);
        }
    }

    protected cc(com.applovin.impl.cc.c cVar) {
        this.g = 0;
        this.h = 0;
        this.i = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.j = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f671a = cVar;
    }
}
