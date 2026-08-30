package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NN implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"XFhwvfKkSyEqyRRacFdsqa616PFWUHCh", "TE99xZ7RorqY7SfVqRabPy9CgIKsfp3m", "kdLoeHuwvZoF6PjW0V2phiTjzwiVAf2t", "RlTzAejg9EfvSUQcXL5xjQX", "GFFSxtzm", "K1qZUjF5HHG2weDv49vHRNq0ZyDtpmc", "H0qCz3fL", "PDkQY8eSanvsX5OhJAHoWikZaqKVEEl4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.V2 A00;

    public NN(com.facebook.ads.redexgen.core.V2 v2) {
        this.A00 = v2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (java.lang.Throwable th) {
            if (A01[0].charAt(19) == 'i') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[4] = "TKgPwnLp";
            strArr[6] = "fznJdSDC";
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
