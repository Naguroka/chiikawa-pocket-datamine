package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4T {
    public static java.lang.String[] A0C = {"zYBO", "VrDNMGAmElYb4SYFj9Lpkrq1UWScNn1g", "4mNmwJxO6cgQvBVSRxGC", "9gqvUwqHV9nyPc72vXSv6mEX866dBdM", "nltTkdARyojUYdv3T0NiqQmXwvESfaB", "A7Q8ygVI07x7oKl7LsiAf8", "TfmPmCKdg", "Y"};
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public java.util.List<com.facebook.ads.redexgen.core.AnonymousClass56> A08 = null;

    private android.view.View A00() {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = this.A08.get(i).A0H;
            com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
            if (!c04354p.A02()) {
                int i2 = this.A01;
                int size2 = c04354p.A00();
                if (i2 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        java.lang.String[] strArr = A0C;
        java.lang.String str = strArr[3];
        java.lang.String str2 = strArr[4];
        int length = str.length();
        int size3 = str2.length();
        if (length != size3) {
            throw new java.lang.RuntimeException();
        }
        A0C[0] = "XAMH";
        return null;
    }

    private final android.view.View A01(android.view.View view) {
        int size = this.A08.size();
        android.view.View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view3 = this.A08.get(i2).A0H;
            com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view3.getLayoutParams();
            if (view3 != view) {
                boolean zA02 = c04354p.A02();
                if (A0C[1].charAt(18) != 'L') {
                    throw new java.lang.RuntimeException();
                }
                A0C[2] = "5fjKcvOJD7";
                if (zA02) {
                    continue;
                } else {
                    int iA00 = c04354p.A00();
                    int size2 = this.A01;
                    int i3 = iA00 - size2;
                    int size3 = this.A03;
                    int i4 = i3 * size3;
                    if (i4 >= 0 && i4 < i) {
                        view2 = view3;
                        i = i4;
                        if (i4 == 0) {
                            break;
                        }
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(android.view.View view) {
        android.view.View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((com.facebook.ads.redexgen.core.C04354p) closest.getLayoutParams()).A00();
        }
    }

    public final android.view.View A03(com.facebook.ads.redexgen.core.C04414w c04414w) {
        if (this.A08 != null) {
            return A00();
        }
        android.view.View viewA0G = c04414w.A0G(this.A01);
        this.A01 += this.A03;
        return viewA0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return this.A01 >= 0 && this.A01 < anonymousClass53.A03();
    }
}
