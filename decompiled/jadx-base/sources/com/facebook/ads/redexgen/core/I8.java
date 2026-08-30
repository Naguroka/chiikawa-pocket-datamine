package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I8 {
    public final java.lang.Object A01 = new java.lang.Object();
    public final java.util.PriorityQueue<java.lang.Integer> A02 = new java.util.PriorityQueue<>(10, java.util.Collections.reverseOrder());
    public int A00 = Integer.MIN_VALUE;

    public final void A00(int i) {
        synchronized (this.A01) {
            this.A02.add(java.lang.Integer.valueOf(i));
            this.A00 = java.lang.Math.max(this.A00, i);
        }
    }

    public final void A01(int i) throws java.lang.InterruptedException {
        synchronized (this.A01) {
            while (this.A00 != i) {
                this.A01.wait();
            }
        }
    }

    public final void A02(int i) throws com.facebook.ads.redexgen.core.I7 {
        synchronized (this.A01) {
            if (this.A00 != i) {
                throw new com.facebook.ads.redexgen.core.I7(i, this.A00);
            }
        }
    }

    public final void A03(int i) {
        synchronized (this.A01) {
            this.A02.remove(java.lang.Integer.valueOf(i));
            this.A00 = this.A02.isEmpty() ? Integer.MIN_VALUE : this.A02.peek().intValue();
            this.A01.notifyAll();
        }
    }
}
