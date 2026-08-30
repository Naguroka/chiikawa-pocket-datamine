package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1238aV extends com.facebook.ads.redexgen.core.AbstractC03330q {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public android.view.View A00;
    public final com.facebook.ads.redexgen.core.C5P A01;
    public final com.facebook.ads.redexgen.core.C0669Ei A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new java.lang.RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1238aV(com.facebook.ads.redexgen.core.C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0C() {
        this.A02.A0E().A4A();
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1240aX(this));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0D() {
        this.A02.A0E().A4D();
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1239aW(this));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0E(android.view.View view) {
        if (view != null) {
            com.facebook.ads.redexgen.core.C0669Ei c0669Ei = this.A02;
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "eqHc";
            c0669Ei.A0E().A4C();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof com.facebook.ads.redexgen.core.C1070Up) || (this.A00 instanceof com.facebook.ads.redexgen.core.C0859Mm)) {
                com.facebook.ads.redexgen.core.AbstractC0785Jn.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            com.facebook.ads.redexgen.core.C0686Fj controller = this.A01.A08();
            if (controller != null) {
                controller.A0K();
            }
            com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1241aY(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (android.os.Build.VERSION.SDK_INT >= 18 && com.facebook.ads.redexgen.core.C0762Im.A16(this.A01.A07().getContext())) {
                final com.facebook.ads.redexgen.core.O6 o6 = new com.facebook.ads.redexgen.core.O6();
                this.A01.A0D(o6);
                o6.A0C(this.A01.getPlacementId());
                o6.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0I() != null) {
                    o6.A09(this.A01.A08().A0I().A0C());
                }
                if (this.A00 instanceof com.facebook.ads.redexgen.core.C1070Up) {
                    o6.A0A(((com.facebook.ads.redexgen.core.C1070Up) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5X
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view2) {
                        if (this.A00.A00 != null) {
                            o6.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                            o6.A0D(!o6.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(o6);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0F(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p) {
        this.A02.A0E().A4B(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0L();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0G(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A02.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01.A04()), c0779Jg.A03().getErrorCode(), c0779Jg.A04());
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1242aZ(this, c0779Jg));
    }
}
