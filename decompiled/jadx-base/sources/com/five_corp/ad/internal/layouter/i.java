package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1944a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public i(int i, int i2, int i3, float f, boolean z, boolean z2, boolean z3) {
        this.f1944a = i;
        this.c = i2;
        this.b = i3;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static com.five_corp.ad.internal.layouter.i a(int i, int i2, boolean z, boolean z2, boolean z3) {
        int iMin;
        float f;
        int i3;
        float f2;
        if (z) {
            f2 = 1.0f;
            i3 = i2;
        } else {
            if (i2 <= 0) {
                iMin = 0;
                f = 0.0f;
            } else {
                iMin = java.lang.Math.min(i, i2);
                f = iMin / i2;
            }
            i3 = iMin;
            f2 = f;
        }
        return new com.five_corp.ad.internal.layouter.i(i3, i2, i2 - i3, f2, z, z2, z3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.five_corp.ad.internal.layouter.i)) {
            return false;
        }
        com.five_corp.ad.internal.layouter.i iVar = (com.five_corp.ad.internal.layouter.i) obj;
        return this.f1944a == iVar.f1944a && this.c == iVar.c && this.e == iVar.e && this.f == iVar.f && this.g == iVar.g;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.g) + ((java.lang.Boolean.hashCode(this.f) + ((java.lang.Boolean.hashCode(this.e) + (((this.f1944a * 13) + this.c) * 13)) * 13)) * 13);
    }
}
