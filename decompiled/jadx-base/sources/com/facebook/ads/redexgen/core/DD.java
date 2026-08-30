package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DD implements com.facebook.ads.redexgen.core.XQ {
    public static java.lang.String[] A06 = {"z2muy9QJdv6UNqkrRX5Tg36TVvjaRGqW", "YxwD1MugG7ZhXNTXvxibfreR7ej", "rT3nprJIB6deoGRocSgDtQnW", "BfDIjN", "UzZd8wX", "7tX", "IQas6CvLP2cXmM1lvwO9WgYKNIICj7B2", "QvQ"};
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.C04364q A02;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C04364q> A03 = new java.util.ArrayDeque<>();
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.DM> A04;
    public final java.util.PriorityQueue<com.facebook.ads.redexgen.core.C04364q> A05;

    public abstract com.facebook.ads.redexgen.core.XN A0N();

    public abstract void A0P(com.facebook.ads.redexgen.core.DO r1);

    public abstract boolean A0R();

    public DD() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new com.facebook.ads.redexgen.core.C04364q());
        }
        this.A04 = new java.util.ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new com.facebook.ads.redexgen.core.C04334n(this));
        }
        this.A05 = new java.util.PriorityQueue<>();
    }

    private void A0K(com.facebook.ads.redexgen.core.C04364q c04364q) {
        c04364q.A07();
        this.A03.add(c04364q);
    }

    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.DO A5Q() throws com.facebook.ads.redexgen.core.C0695Fu {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.DM A5R() throws com.facebook.ads.redexgen.core.C0695Fu {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((com.facebook.ads.redexgen.core.C1177Yw) this.A05.peek()).A00 <= this.A00) {
            com.facebook.ads.redexgen.core.C04364q c04364qPoll = this.A05.poll();
            if (c04364qPoll.A04()) {
                com.facebook.ads.redexgen.core.DM outputBuffer = this.A04.pollFirst();
                outputBuffer.A00(4);
                A0K(c04364qPoll);
                return outputBuffer;
            }
            A0P(c04364qPoll);
            if (A0R()) {
                com.facebook.ads.redexgen.core.XN xnA0N = A0N();
                if (!c04364qPoll.A03()) {
                    com.facebook.ads.redexgen.core.DM dmPollFirst = this.A04.pollFirst();
                    dmPollFirst.A09(((com.facebook.ads.redexgen.core.C1177Yw) c04364qPoll).A00, xnA0N, Long.MAX_VALUE);
                    A0K(c04364qPoll);
                    return dmPollFirst;
                }
            }
            A0K(c04364qPoll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.BG
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEj(com.facebook.ads.redexgen.core.DO r6) throws com.facebook.ads.redexgen.core.C0695Fu {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(r6 == this.A02);
        if (r6.A03()) {
            A0K(this.A02);
        } else {
            com.facebook.ads.redexgen.core.C04364q c04364q = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c04364q.A00 = j;
            if (A06[6].charAt(25) == 'n') {
                throw new java.lang.RuntimeException();
            }
            A06[0] = "AtrTuyLMED6qzWt7DVqAVoSQD1pO5Y9g";
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(com.facebook.ads.redexgen.core.DM dm) {
        dm.A07();
        this.A04.add(dm);
    }

    @Override // com.facebook.ads.redexgen.core.BG
    public void AEy() {
    }

    @Override // com.facebook.ads.redexgen.core.XQ
    public void AGb(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.BG
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        if (this.A02 != null) {
            A0K(this.A02);
            this.A02 = null;
        }
    }
}
