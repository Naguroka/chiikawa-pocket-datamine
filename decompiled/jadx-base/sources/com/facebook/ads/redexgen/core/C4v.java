package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4v {
    public android.util.SparseArray<com.facebook.ads.redexgen.core.C04404u> A00 = new android.util.SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private com.facebook.ads.redexgen.core.C04404u A01(int i) {
        com.facebook.ads.redexgen.core.C04404u c04404u = this.A00.get(i);
        if (c04404u == null) {
            com.facebook.ads.redexgen.core.C04404u c04404u2 = new com.facebook.ads.redexgen.core.C04404u();
            this.A00.put(i, c04404u2);
            return c04404u2;
        }
        return c04404u;
    }

    private final void A02() {
        for (int i = 0; i < i; i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass56 A03(int i) {
        com.facebook.ads.redexgen.core.C04404u c04404u = this.A00.get(i);
        if (c04404u != null && !c04404u.A03.isEmpty()) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> arrayList = c04404u.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        com.facebook.ads.redexgen.core.C04404u c04404uA01 = A01(i);
        c04404uA01.A01 = A00(c04404uA01.A01, j);
    }

    public final void A06(int i, long j) {
        com.facebook.ads.redexgen.core.C04404u c04404uA01 = A01(i);
        c04404uA01.A02 = A00(c04404uA01.A02, j);
    }

    public final void A07(com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c) {
        this.A01++;
    }

    public final void A08(com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c, com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c2, boolean z) {
        if (abstractC04224c != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC04224c2 != null) {
            A07(abstractC04224c2);
        }
    }

    public final void A09(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        int iA0H = anonymousClass56.A0H();
        java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> arrayList = A01(iA0H).A03;
        int i = this.A00.get(iA0H).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        anonymousClass56.A0Q();
        arrayList.add(anonymousClass56);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
