package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1545g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.onevcat.uniwebview.AbstractC1554j f3722a;
    public java.lang.String b;
    public final boolean c;

    public C1545g(com.onevcat.uniwebview.AbstractC1554j downloadType, java.lang.String fileName, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f3722a = downloadType;
        this.b = fileName;
        this.c = z;
    }

    public final java.lang.String a() {
        com.onevcat.uniwebview.AbstractC1554j abstractC1554j = this.f3722a;
        if (abstractC1554j instanceof com.onevcat.uniwebview.C1551i) {
            return ((com.onevcat.uniwebview.C1551i) abstractC1554j).f3728a;
        }
        if (abstractC1554j instanceof com.onevcat.uniwebview.C1548h) {
            return ((com.onevcat.uniwebview.C1548h) abstractC1554j).f3725a;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.onevcat.uniwebview.C1545g)) {
            return false;
        }
        com.onevcat.uniwebview.C1545g c1545g = (com.onevcat.uniwebview.C1545g) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3722a, c1545g.f3722a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c1545g.b) && this.c == c1545g.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3722a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final java.lang.String toString() {
        return "DownloadTask(downloadType=" + this.f3722a + ", fileName=" + this.b + ", shouldSendEvent=" + this.c + ')';
    }
}
