package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0837Lq implements android.view.View.OnSystemUiVisibilityChangeListener {
    public static java.lang.String[] A05 = {"dzM0rIEz66", "2I5EpQxo3JaAydz5j2evjw", "riIr", "aw8X8aEsXK", "46V10M2ortldVuyFN9G4Mh", "Zv9bhia2uUXHxfPHNrQGPj2Fgj", "UQeU", "fL70pxGMq2jlNC9xIpTd7nvL"};
    public int A00;
    public android.view.Window A01;
    public final android.view.View A03;
    public com.facebook.ads.redexgen.core.EnumC0836Lp A02 = com.facebook.ads.redexgen.core.EnumC0836Lp.A02;
    public final java.lang.Runnable A04 = new com.facebook.ads.redexgen.core.C1089Vi(this);

    public ViewOnSystemUiVisibilityChangeListenerC0837Lq(android.view.View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i, boolean z) {
        if (this.A01 == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = this.A01.getAttributes();
        if (z) {
            attributes.flags |= i;
        } else {
            int i2 = attributes.flags;
            java.lang.String[] strArr = A05;
            if (strArr[0].length() != strArr[3].length()) {
                A05[5] = "Y2LIVjWWRefqfkQFwWbZLdxa4m";
                attributes.flags = i2 & (i ^ (-1));
            } else {
                java.lang.String[] strArr2 = A05;
                strArr2[0] = "3EQzEkO0gc";
                strArr2[3] = "SinRvB2gIw";
                attributes.flags = i2 & (i ^ (-1));
            }
        }
        android.view.Window window = this.A01;
        java.lang.String[] strArr3 = A05;
        if (strArr3[1].length() != strArr3[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A05;
        strArr4[1] = "fe0FngUkI8h9c1BO2CK76I";
        strArr4[4] = "nmFu9vDS7iLUjXhy5dSdRg";
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z) {
        if (com.facebook.ads.redexgen.core.EnumC0836Lp.A02.equals(this.A02)) {
            return;
        }
        int i = 3840;
        if (!z) {
            i = 3840 | 7;
        }
        android.os.Handler handler = this.A03.getHandler();
        if (handler != null && z) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(android.view.Window window) {
        this.A01 = window;
    }

    public final void A05(com.facebook.ads.redexgen.core.EnumC0836Lp enumC0836Lp) {
        this.A02 = enumC0836Lp;
        switch (this.A02) {
            case A03:
                A00(67108864, true);
                A00(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, true);
                A02(false);
                break;
            default:
                A00(67108864, false);
                A00(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, false);
                this.A03.setSystemUiVisibility(0);
                break;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int diff = this.A00 ^ i;
        this.A00 = i;
        if ((diff & 2) != 0) {
            int i2 = i & 2;
            if (A05[5].length() != 26) {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "1GVM4GUQqWgiX1iklRLLb2m9Tx";
            if (i2 == 0) {
                if (A05[5].length() != 26) {
                    A02(true);
                    return;
                }
                java.lang.String[] strArr = A05;
                strArr[0] = "67GBv9MjXI";
                strArr[3] = "0u8xrudpsw";
                A02(true);
            }
        }
    }
}
