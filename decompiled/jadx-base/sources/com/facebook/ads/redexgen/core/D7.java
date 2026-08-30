package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D7 {
    public static java.lang.String[] A0I = {"8M5RodlOPQ7x9uL", "BFvJ4Vglp8cDeiQE6xUhfEubFpJPL", "BZYHRobTnsNNM90MGp0ZS9IN9yxyVYRA", "frsVK1FdvBngWEpFEgXb3j2VH3I0QFcs", "HR9vdMTLLE1L", "IHA7NybIhxX3WQx4UeYLmhksL6wDXcjz", "KpIVD0zBVazWxl2jPlpRDfEez76Qp1Fs", "SrFaCaqx6zHunknjrTMn1T9PINlSt0tm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final com.facebook.ads.redexgen.core.C9 A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.C0750Hz> A0D = new android.util.SparseArray<>();
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.C0749Hy> A0C = new android.util.SparseArray<>();
    public com.facebook.ads.redexgen.core.D6 A06 = new com.facebook.ads.redexgen.core.D6();
    public com.facebook.ads.redexgen.core.D6 A07 = new com.facebook.ads.redexgen.core.D6();
    public byte[] A0B = new byte[128];
    public final com.facebook.ads.redexgen.core.I5 A0F = new com.facebook.ads.redexgen.core.I5(this.A0B, 0, 0);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A06(byte[] bArr, int i, int i2) {
        if (this.A08) {
            int i3 = i2 - i;
            if (this.A0B.length < this.A00 + i3) {
                this.A0B = java.util.Arrays.copyOf(this.A0B, (this.A00 + i3) * 2);
            }
            java.lang.System.arraycopy(bArr, i, this.A0B, this.A00, i3);
            this.A00 += i3;
            this.A0F.A08(this.A0B, 0, this.A00);
            if (this.A0F.A0B(8)) {
                this.A0F.A06();
                int iA05 = this.A0F.A05(2);
                this.A0F.A07(5);
                if (this.A0F.A09()) {
                    this.A0F.A04();
                    if (this.A0F.A09()) {
                        int iA04 = this.A0F.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(iA04);
                            return;
                        }
                        if (this.A0F.A09()) {
                            int iA06 = this.A0F.A04();
                            if (this.A0C.indexOfKey(iA06) < 0) {
                                this.A08 = false;
                                return;
                            }
                            com.facebook.ads.redexgen.core.C0749Hy c0749Hy = this.A0C.get(iA06);
                            com.facebook.ads.redexgen.core.C0750Hz c0750Hz = this.A0D.get(c0749Hy.A01);
                            if (A0I[1].length() == 29) {
                                A0I[1] = "jUrYfFWx4oU0PZ0BHu9RO88HJSHdN";
                                com.facebook.ads.redexgen.core.C0750Hz c0750Hz2 = c0750Hz;
                                if (c0750Hz2.A09) {
                                    if (!this.A0F.A0B(2)) {
                                        return;
                                    } else {
                                        this.A0F.A07(2);
                                    }
                                }
                                if (!this.A0F.A0B(c0750Hz2.A01)) {
                                    return;
                                }
                                boolean zA0A = false;
                                boolean z = false;
                                boolean zA0A2 = false;
                                int iA07 = this.A0F.A05(c0750Hz2.A01);
                                if (!c0750Hz2.A08) {
                                    if (!this.A0F.A0B(1)) {
                                        return;
                                    }
                                    zA0A = this.A0F.A0A();
                                    if (zA0A) {
                                        if (!this.A0F.A0B(1)) {
                                            return;
                                        }
                                        zA0A2 = this.A0F.A0A();
                                        z = true;
                                    }
                                }
                                int i4 = this.A01;
                                if (A0I[3].charAt(28) != 'b') {
                                    A0I[1] = "tJyNa4tKeVwhmsG7D71bzYfBkrrYu";
                                    boolean z2 = i4 == 5;
                                    int iA08 = 0;
                                    if (z2) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        } else {
                                            iA08 = this.A0F.A04();
                                        }
                                    }
                                    int iA09 = 0;
                                    int iA03 = 0;
                                    int iA010 = 0;
                                    int iA011 = 0;
                                    if (c0750Hz2.A04 == 0) {
                                        if (!this.A0F.A0B(c0750Hz2.A03)) {
                                            return;
                                        }
                                        iA09 = this.A0F.A05(c0750Hz2.A03);
                                        if (c0749Hy.A02 && !zA0A) {
                                            if (!this.A0F.A09()) {
                                                return;
                                            } else {
                                                iA03 = this.A0F.A03();
                                            }
                                        }
                                    } else if (c0750Hz2.A04 == 1 && !c0750Hz2.A07) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        }
                                        iA010 = this.A0F.A03();
                                        if (c0749Hy.A02 && !zA0A) {
                                            if (!this.A0F.A09()) {
                                                return;
                                            } else {
                                                iA011 = this.A0F.A03();
                                            }
                                        }
                                    }
                                    this.A07.A04(c0750Hz2, iA05, iA04, iA07, iA06, zA0A, z, zA0A2, z2, iA08, iA09, iA03, iA010, iA011);
                                    this.A08 = false;
                                    return;
                                }
                            }
                            throw new java.lang.RuntimeException();
                        }
                    }
                }
            }
        }
    }

    public D7(com.facebook.ads.redexgen.core.C9 c9, boolean z, boolean z2) {
        this.A0E = c9;
        this.A0G = z;
        this.A0H = z2;
        A01();
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
        this.A0E.AFw(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    public final void A02(long j, int i) {
        boolean z = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A00(this.A06))) {
            if (this.A09) {
                A00(i + ((int) (j - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        boolean z2 = this.A0A;
        if (this.A01 != 5) {
            boolean z3 = this.A0G;
            if (A0I[6].charAt(8) != 'V') {
                throw new java.lang.RuntimeException();
            }
            A0I[3] = "z8bmRlUG76wDgBp2wvrB0MWrv7DjKXuA";
            if (z3 && this.A01 == 1 && this.A07.A05()) {
                z = true;
            }
        } else {
            z = true;
        }
        this.A0A = z2 | z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final void A03(long j, int i, long j2) {
        int i2;
        java.lang.String[] strArr;
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (this.A0G) {
            int i3 = this.A01;
            if (A0I[6].charAt(8) != 'V') {
                throw new java.lang.RuntimeException();
            }
            A0I[1] = "fGRgHSleOioyqPSfalDbi2Th0ZNuk";
            if (i3 != 1) {
                if (this.A0H) {
                    return;
                }
                i2 = this.A01;
                strArr = A0I;
                if (strArr[5].charAt(7) != strArr[7].charAt(7)) {
                    java.lang.String[] strArr2 = A0I;
                    strArr2[5] = "RFfCf2nIAPbpjmPVi3fM6FAtUM60qcZF";
                    strArr2[7] = "7JLfCVxHN71IMtTwiclOJwxf6r9fSssd";
                    if (i2 != 5) {
                        if (this.A01 != 1 && this.A01 != 2) {
                            return;
                        }
                    }
                } else {
                    A0I[1] = "b1mBfirkBaoBPCNGYKaBtwPuSeSHS";
                    if (i2 != 5) {
                        if (this.A01 != 1) {
                            return;
                        }
                    }
                }
            }
        } else {
            if (this.A0H) {
                return;
            }
            i2 = this.A01;
            strArr = A0I;
            if (strArr[5].charAt(7) != strArr[7].charAt(7)) {
                java.lang.String[] strArr3 = A0I;
                strArr3[5] = "RFfCf2nIAPbpjmPVi3fM6FAtUM60qcZF";
                strArr3[7] = "7JLfCVxHN71IMtTwiclOJwxf6r9fSssd";
                if (i2 != 5) {
                    if (this.A01 != 1) {
                        return;
                    }
                }
            } else {
                A0I[1] = "b1mBfirkBaoBPCNGYKaBtwPuSeSHS";
                if (i2 != 5) {
                    if (this.A01 != 1) {
                        return;
                    }
                }
            }
        }
        com.facebook.ads.redexgen.core.D6 d6 = this.A06;
        com.facebook.ads.redexgen.core.D6 newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = d6;
        com.facebook.ads.redexgen.core.D6 newSliceHeader2 = this.A07;
        newSliceHeader2.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(com.facebook.ads.redexgen.core.C0749Hy c0749Hy) {
        this.A0C.append(c0749Hy.A00, c0749Hy);
    }

    public final void A05(com.facebook.ads.redexgen.core.C0750Hz c0750Hz) {
        this.A0D.append(c0750Hz.A05, c0750Hz);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
