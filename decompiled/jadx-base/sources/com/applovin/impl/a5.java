package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 implements com.applovin.impl.o2 {
    public static final com.applovin.impl.a5 s = new com.applovin.impl.a5.b().a("").a();
    public static final com.applovin.impl.o2.a t = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.a5$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.a5.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f580a;
    public final android.text.Layout.Alignment b;
    public final android.text.Layout.Alignment c;
    public final android.graphics.Bitmap d;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    private a5(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            com.applovin.impl.b1.a(bitmap);
        } else {
            com.applovin.impl.b1.a(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.f580a = android.text.SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f580a = charSequence.toString();
        } else {
            this.f580a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.a5.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.a5 a5Var = (com.applovin.impl.a5) obj;
        return android.text.TextUtils.equals(this.f580a, a5Var.f580a) && this.b == a5Var.b && this.c == a5Var.c && ((bitmap = this.d) != null ? !((bitmap2 = a5Var.d) == null || !bitmap.sameAs(bitmap2)) : a5Var.d == null) && this.f == a5Var.f && this.g == a5Var.g && this.h == a5Var.h && this.i == a5Var.i && this.j == a5Var.j && this.k == a5Var.k && this.l == a5Var.l && this.m == a5Var.m && this.n == a5Var.n && this.o == a5Var.o && this.p == a5Var.p && this.q == a5Var.q && this.r == a5Var.r;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.base.Objects.hashCode(this.f580a, this.b, this.c, this.d, java.lang.Float.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.h), java.lang.Float.valueOf(this.i), java.lang.Integer.valueOf(this.j), java.lang.Float.valueOf(this.k), java.lang.Float.valueOf(this.l), java.lang.Boolean.valueOf(this.m), java.lang.Integer.valueOf(this.n), java.lang.Integer.valueOf(this.o), java.lang.Float.valueOf(this.p), java.lang.Integer.valueOf(this.q), java.lang.Float.valueOf(this.r));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.CharSequence f581a;
        private android.graphics.Bitmap b;
        private android.text.Layout.Alignment c;
        private android.text.Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public b() {
            this.f581a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
            this.p = Integer.MIN_VALUE;
        }

        public java.lang.CharSequence e() {
            return this.f581a;
        }

        public com.applovin.impl.a5.b a(android.graphics.Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public com.applovin.impl.a5.b b() {
            this.n = false;
            return this;
        }

        private b(com.applovin.impl.a5 a5Var) {
            this.f581a = a5Var.f580a;
            this.b = a5Var.d;
            this.c = a5Var.b;
            this.d = a5Var.c;
            this.e = a5Var.f;
            this.f = a5Var.g;
            this.g = a5Var.h;
            this.h = a5Var.i;
            this.i = a5Var.j;
            this.j = a5Var.o;
            this.k = a5Var.p;
            this.l = a5Var.k;
            this.m = a5Var.l;
            this.n = a5Var.m;
            this.o = a5Var.n;
            this.p = a5Var.q;
            this.q = a5Var.r;
        }

        public com.applovin.impl.a5.b a(float f) {
            this.m = f;
            return this;
        }

        public com.applovin.impl.a5.b d(float f) {
            this.l = f;
            return this;
        }

        public com.applovin.impl.a5.b b(float f) {
            this.h = f;
            return this;
        }

        public com.applovin.impl.a5.b c(float f) {
            this.q = f;
            return this;
        }

        public com.applovin.impl.a5.b a(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public com.applovin.impl.a5.b b(int i) {
            this.i = i;
            return this;
        }

        public com.applovin.impl.a5.b d(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public com.applovin.impl.a5.b c(int i) {
            this.p = i;
            return this;
        }

        public com.applovin.impl.a5.b a(int i) {
            this.g = i;
            return this;
        }

        public com.applovin.impl.a5.b b(android.text.Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public com.applovin.impl.a5.b a(android.text.Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public com.applovin.impl.a5.b b(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public com.applovin.impl.a5.b a(java.lang.CharSequence charSequence) {
            this.f581a = charSequence;
            return this;
        }

        public com.applovin.impl.a5 a() {
            return new com.applovin.impl.a5(this.f581a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public com.applovin.impl.a5.b a() {
        return new com.applovin.impl.a5.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.applovin.impl.a5 a(android.os.Bundle bundle) {
        com.applovin.impl.a5.b bVar = new com.applovin.impl.a5.b();
        java.lang.CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.a(charSequence);
        }
        android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.b(alignment);
        }
        android.text.Layout.Alignment alignment2 = (android.text.Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.a(alignment2);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.b(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.d(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.a(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.d(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(a(15))) {
            bVar.c(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.c(bundle.getFloat(a(16)));
        }
        return bVar.a();
    }
}
