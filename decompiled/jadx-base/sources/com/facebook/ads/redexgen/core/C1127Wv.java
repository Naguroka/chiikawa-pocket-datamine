package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1127Wv {
    public static java.lang.String[] A03 = {"ZyytKuNh7ntg7sY8uFdOkQQn3Zd8e", "OPYUEYxxfuFToCoqAJ7LijcBVLMkd", "hMaagKVbo326jUCFjE6xrMqdrUFYGLiL", "YWHqi729yDjGR8jfxkm0wnxT", "fBJq4naDVNOawpqdOhpwTAHQcatL3neF", "IBZtQd8oLy5hBWitakJgcXsasC5LRKBV", "BBZxvQdMJfTK4iSntx4hV9BXJvxyJ8bf", "qOO0IEqnjZtOEmSRMHkcuAad"};
    public com.facebook.ads.redexgen.core.HC<? extends com.facebook.ads.redexgen.core.HD> A00;
    public java.io.IOException A01;
    public final java.util.concurrent.ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final <T extends com.facebook.ads.redexgen.core.HD> long A04(T t, com.facebook.ads.redexgen.core.HB<T> hb, int i) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.facebook.ads.redexgen.core.HC(this, looperMyLooper, t, hb, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public C1127Wv(java.lang.String str) {
        this.A02 = com.facebook.ads.redexgen.core.IK.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws java.io.IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                com.facebook.ads.redexgen.core.HC<? extends com.facebook.ads.redexgen.core.HD> hc = this.A00;
                if (i == Integer.MIN_VALUE) {
                    i = this.A00.A03;
                }
                hc.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A07(com.facebook.ads.redexgen.core.HE he) {
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.HC<? extends com.facebook.ads.redexgen.core.HD> hc = this.A00;
            if (A03[1].length() != 29) {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "olNXxetGG";
            hc.A07(true);
        }
        if (he != null) {
            this.A02.execute(new com.facebook.ads.redexgen.core.HF(he));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
