package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0756If implements java.lang.Runnable {
    public static java.lang.String[] A02 = {"13oaU3ARqDr4RH9jpYNK93c", "TYF7Qt", "xUTRJm4Rg673ApQEKqlQsSs", "hRIg6SPEQXGq6T", "3QHfr38dRkY9JxUpCoLwEkFMMlSloeG2", "i8J6r6uMy266kC8rTF8mGIBzqV5dBCmb", "x98fVhayFhYlIbQQOJ9BjMfXcd34KCSx", "Z1GLpHy0HwkqSwW9khwr1bkH6PCRqbO5"};
    public final /* synthetic */ android.view.Surface A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0758Ih A01;

    public RunnableC0756If(com.facebook.ads.redexgen.core.C0758Ih c0758Ih, android.view.Surface surface) {
        this.A01 = c0758Ih;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADM(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            if (A02[1].length() == 19) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "65yeGhez1WQhZvxg8qVLZrzPC2Ou4KSa";
        }
    }
}
