package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public final class m<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f3798a;
    private final B b;

    public m(A a2, B b) {
        this.f3798a = a2;
        this.b = b;
    }

    public static <A, B> com.pgl.ssdk.m<A, B> a(A a2, B b) {
        return new com.pgl.ssdk.m<>(a2, b);
    }

    public B b() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.pgl.ssdk.m.class != obj.getClass()) {
            return false;
        }
        com.pgl.ssdk.m mVar = (com.pgl.ssdk.m) obj;
        A a2 = this.f3798a;
        if (a2 == null) {
            if (mVar.f3798a != null) {
                return false;
            }
        } else if (!a2.equals(mVar.f3798a)) {
            return false;
        }
        B b = this.b;
        if (b == null) {
            if (mVar.b != null) {
                return false;
            }
        } else if (!b.equals(mVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.f3798a;
        int iHashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
        B b = this.b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public A a() {
        return this.f3798a;
    }
}
