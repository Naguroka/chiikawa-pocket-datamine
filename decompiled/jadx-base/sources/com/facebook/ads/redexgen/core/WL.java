package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WL extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public static java.lang.String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A00;

    public WL(com.facebook.ads.redexgen.core.WJ wj) {
        this.A00 = wj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A00() {
        if (this.A00.A04 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.WJ wj = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new java.lang.RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        wj.A04.A0W();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        if (this.A00.A04 != null) {
            if (!this.A00.A0B) {
                if (this.A00.A0A) {
                    this.A00.A0J(com.facebook.ads.redexgen.core.EnumC0969Qs.A02);
                } else {
                    com.facebook.ads.redexgen.core.WJ wj = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new java.lang.RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    if (wj.A0K()) {
                        this.A00.A0J(com.facebook.ads.redexgen.core.EnumC0969Qs.A02);
                    }
                }
            }
            this.A00.A0A = false;
            this.A00.A0B = false;
        }
    }
}
