package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1415db {
    public static java.lang.String[] A02 = {"FI4CSn5g4hVI", "oUnbtikCS", "OTKcg3hD6eE6nFWotwGGZ5F", "qSmHeLCnLYm7Z6Tg4tQ0z3dsx", "SCLx27yKxe6yDyiZK0iEJT9ptP", "bFFCI01IIFvt0fl9DXgL6XUawg", "6J2GgEdIUlJLk3yvVentjGe1dkRWCLvM", "KM6GnpQ6vjKv"};
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.Cdo> A00;
    public final java.util.Set<com.facebook.ads.redexgen.core.Cdo> A01;

    public C1415db() {
        this.A00 = new java.util.HashMap();
        this.A01 = new java.util.HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Collection<com.facebook.ads.redexgen.core.Cdo> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Collection<com.facebook.ads.redexgen.core.Cdo> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        java.util.Iterator<com.facebook.ads.redexgen.core.Cdo> it = this.A01.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "aJOeJxsM87dt105FXzNZlrhAEbJ2aQd4";
            if (zHasNext) {
                com.facebook.ads.redexgen.core.Cdo next = it.next();
                this.A00.put(next.A00, next);
            } else {
                this.A01.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(com.facebook.ads.redexgen.core.Cdo cdo) {
        if (this.A01.add(cdo)) {
            this.A00.remove(cdo.A00);
            return true;
        }
        return false;
    }
}
