package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1583a;
    private final java.util.List b;

    public MaxSegment(int i, java.util.List<java.lang.Integer> list) {
        this.f1583a = i;
        this.b = list;
        a(i);
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        com.applovin.impl.sdk.n.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f1583a;
    }

    public java.util.List<java.lang.Integer> getValues() {
        return this.b;
    }

    public java.lang.String toString() {
        return "MaxSegment{key=" + this.f1583a + ", values=" + this.b + '}';
    }
}
