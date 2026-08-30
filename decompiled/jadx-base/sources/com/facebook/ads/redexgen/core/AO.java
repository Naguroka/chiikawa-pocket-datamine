package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AO {
    public static java.lang.String[] A06 = {"pSGbucuoMvma1b5VVDAxEZMYXBJBkJd7", "jnfD7zJLfl7YfEaLudX29nBu0s4EE7wy", "kblP6w5tAUndOGYtYbLdLGUEXv4b54", "VT18E82QCK2DEIowipbGw7Y7OUzTjYnd", "AYuYTw0tW8ONeycLuKpYQRyZiiLmzDTW", "M9C1QOaf2rsBVjgJKmiK14Vpxz77Nv8B", "sFFKCjvZ8i7qkazJexEMRuLcVG", "s9HSZGEi8dFN8vFbKvf1UaL44HFpBCz2"};
    public com.facebook.ads.redexgen.core.AP A01;
    public com.facebook.ads.redexgen.core.AP A02;
    public boolean A03;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.AP> A05 = new java.util.ArrayList<>();
    public final com.facebook.ads.redexgen.core.AK A04 = new com.facebook.ads.redexgen.core.AK();
    public com.facebook.ads.redexgen.core.AM A00 = com.facebook.ads.redexgen.core.AM.A01;

    private com.facebook.ads.redexgen.core.AP A00(com.facebook.ads.redexgen.core.AP ap, com.facebook.ads.redexgen.core.AM am) {
        if (am.A0E() || this.A00.A0E()) {
            return ap;
        }
        com.facebook.ads.redexgen.core.AM am2 = this.A00;
        com.facebook.ads.redexgen.core.Et et = ap.A01;
        if (A06[0].charAt(13) == 'D') {
            throw new java.lang.RuntimeException();
        }
        A06[0] = "n7aIj5hp7lyBwHeNy22XvNfOlXYQiwaL";
        java.lang.Object uid = am2.A0A(et.A02, this.A04, true).A03;
        int newPeriodIndex = am.A04(uid);
        if (newPeriodIndex == -1) {
            return ap;
        }
        int newWindowIndex = am.A09(newPeriodIndex, this.A04).A00;
        return new com.facebook.ads.redexgen.core.AP(newWindowIndex, ap.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final com.facebook.ads.redexgen.core.AP A03() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.AP A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        return this.A05.get(this.A05.size() - 1);
    }

    public final com.facebook.ads.redexgen.core.AP A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final com.facebook.ads.redexgen.core.AP A06() {
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.Et A07(int i) {
        com.facebook.ads.redexgen.core.Et et = null;
        if (this.A00 != null) {
            int iA00 = this.A00.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                com.facebook.ads.redexgen.core.AP mediaPeriod = this.A05.get(periodIndex);
                com.facebook.ads.redexgen.core.Et match = mediaPeriod.A01;
                int i2 = match.A02;
                if (i2 < iA00 && this.A00.A09(i2, this.A04).A00 == i) {
                    if (et != null) {
                        return null;
                    }
                    et = mediaPeriod.A01;
                }
            }
        }
        return et;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A05.add(new com.facebook.ads.redexgen.core.AP(i, et));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i, com.facebook.ads.redexgen.core.Et et) {
        com.facebook.ads.redexgen.core.AP mediaPeriod;
        com.facebook.ads.redexgen.core.AP ap = new com.facebook.ads.redexgen.core.AP(i, et);
        this.A05.remove(ap);
        com.facebook.ads.redexgen.core.AP mediaPeriod2 = this.A02;
        if (ap.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                com.facebook.ads.redexgen.core.AP mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A02 = new com.facebook.ads.redexgen.core.AP(i, et);
    }

    public final void A0E(com.facebook.ads.redexgen.core.AM am) {
        for (int i = 0; i < i; i++) {
            this.A05.set(i, A00(this.A05.get(i), am));
        }
        if (this.A02 != null) {
            this.A02 = A00(this.A02, am);
        }
        this.A00 = am;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
