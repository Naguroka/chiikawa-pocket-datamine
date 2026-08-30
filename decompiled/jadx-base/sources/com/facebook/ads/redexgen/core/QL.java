package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QL implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"hS5f9KbstsMPLbUbPSxFVdCfAROmcRtV", "DUM08yoPCPer4HETov37xY8lXqOkWet1", "HD0hLshA4", "cNo3fMkBKvz7jHUo", "0KN3KUldF", "ICLtCAijF", "iMQeuY1uIySJVoFID8xkudblEyJz6Aif", "P1hZJiyY"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.QM A00;

    public QL(com.facebook.ads.redexgen.core.QM qm) {
        this.A00 = qm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            if (A01[6].charAt(1) == 'N') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "I2wlNoUiFEETsNdyZ3cedgIbWPjbODtt";
            strArr[1] = "f6nspZJA1kETXV8rRnTaX6zeidOCX4th";
        }
    }
}
