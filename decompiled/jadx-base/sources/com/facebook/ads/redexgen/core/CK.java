package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CK {
    public static java.lang.String[] A06 = {"ASrRCYsKepDTUmzFsC2sW3QzilFSgfPw", "pk2aHy5Gwagx08DT23n03plQM468sRYy", "xOM6LRz9nNuHtWN", "TvyhqxunvhStLR7Kd", "aVtXkPwucpWHbVIgTuViY5Suu", "ZnIfrZLnsjfgp1sFLfOTBH8y8Mk5lEFn", "0lbnIxGi57zCIaJmDAHnbRN3bazOyET0", "5wZWnu4zbKghJljNFYmlUiyghG2Nmbcr"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i, int i2) throws java.lang.InterruptedException, java.io.IOException {
        if (!this.A04) {
            interfaceC0610By.AEO(this.A05, 0, 10);
            interfaceC0610By.AFq();
            if (com.facebook.ads.redexgen.core.AV.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            if (A06[4].length() != 25) {
                throw new java.lang.RuntimeException();
            }
            A06[3] = "JjREElMDljsf0pPk3";
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(com.facebook.ads.redexgen.core.CJ cj) {
        if (this.A04) {
            int i = this.A02;
            if (A06[3].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A06[3] = "G4r0EfytzI47OGcaJ";
            if (i > 0) {
                cj.A0W.AFw(this.A03, this.A00, this.A01, 0, cj.A0V);
                this.A02 = 0;
            }
        }
    }

    public final void A03(com.facebook.ads.redexgen.core.CJ cj, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        this.A02 = i + 1;
        if (i == 0) {
            this.A03 = j;
        }
        if (this.A02 < 16) {
            return;
        }
        cj.A0W.AFw(this.A03, this.A00, this.A01, 0, cj.A0V);
        this.A02 = 0;
    }
}
