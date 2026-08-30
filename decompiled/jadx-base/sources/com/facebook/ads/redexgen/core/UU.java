package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UU extends com.facebook.ads.redexgen.core.KY {
    public static java.lang.String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;
    public final /* synthetic */ boolean A01;

    public UU(com.facebook.ads.redexgen.core.UQ uq, boolean z) {
        this.A00 = uq;
        this.A01 = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        boolean z;
        com.facebook.ads.redexgen.core.MQ mqA09 = this.A00.A0L.A09();
        if (mqA09 != null) {
            if (this.A01) {
                z = false;
            } else {
                boolean zA0A = mqA09.A0A();
                if (A02[4].length() != 25) {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (zA0A) {
                    z = false;
                } else {
                    z = true;
                }
            }
            mqA09.setPageDetailsVisible(z);
            mqA09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
