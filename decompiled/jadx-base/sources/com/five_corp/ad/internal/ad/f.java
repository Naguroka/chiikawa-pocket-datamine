package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1810a;
    public final int b;
    public final int c;

    public f(int i, int i2, int i3) {
        this.f1810a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.five_corp.ad.internal.ad.f.class != obj.getClass()) {
            return false;
        }
        com.five_corp.ad.internal.ad.f fVar = (com.five_corp.ad.internal.ad.f) obj;
        return this.f1810a == fVar.f1810a && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return (((this.f1810a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "CcId{campaignId=" + this.f1810a + ", campaignVersion=" + this.b + ", creativeId=" + this.c + '}';
    }
}
