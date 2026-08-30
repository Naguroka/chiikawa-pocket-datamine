package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D8 {
    public static java.lang.String[] A0D = {"noL", "G1jHhVyg98ySaI4z53KV1", "b", "fvCE7VWYYz7k3T7kDHLiEZoK7CGAkaBB", "ZtfNba1ZWzV3M3XLiIRFTuzciE54fxB9", "uHtea0jMeQZ2HH8", "", "Y4q"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.C9 A0C;

    public D8(com.facebook.ads.redexgen.core.C9 c9) {
        this.A0C = c9;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void A00(int i) {
        boolean z = this.A0A;
        this.A0C.AFw(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j, int i) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            this.A0B = false;
        } else {
            if (!this.A05 && !this.A06) {
                return;
            }
            if (this.A09) {
                A00(i + ((int) (j - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A09 = true;
            this.A0A = this.A08;
        }
    }

    public final void A03(long j, int i, int i2, long j2) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = j;
        if (i2 >= 32) {
            if (!this.A0B && this.A09) {
                A00(i);
                this.A09 = false;
            }
            if (i2 <= 34) {
                this.A05 = !this.A0B;
                this.A0B = true;
            }
        }
        this.A08 = i2 >= 16 && i2 <= 21;
        this.A07 = this.A08 || i2 <= 9;
        java.lang.String[] strArr = A0D;
        if (strArr[7].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A0D[4] = "m7KNvRLlG2HGx5CxJtjuXbqCPolwiEk2";
    }

    public final void A04(byte[] bArr, int i, int i2) {
        if (this.A07) {
            int i3 = (i + 2) - this.A00;
            if (A0D[3].charAt(21) == '7') {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "4fmXv5sAMrrm0rmwROK6LVqun";
            if (i3 < i2) {
                int headerOffset = bArr[i3];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i2 - i;
        }
    }
}
