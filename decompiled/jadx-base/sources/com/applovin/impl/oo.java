package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class oo implements com.applovin.impl.o2 {
    public static final com.applovin.impl.o2.a d = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.oo$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.oo.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1127a;
    private final com.applovin.impl.e9[] b;
    private int c;

    private static int c(int i) {
        return i | 16384;
    }

    public oo(com.applovin.impl.e9... e9VarArr) {
        com.applovin.impl.b1.a(e9VarArr.length > 0);
        this.b = e9VarArr;
        this.f1127a = e9VarArr.length;
        a();
    }

    public com.applovin.impl.e9 a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.oo.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.oo ooVar = (com.applovin.impl.oo) obj;
        return this.f1127a == ooVar.f1127a && java.util.Arrays.equals(this.b, ooVar.b);
    }

    private static java.lang.String b(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public int a(com.applovin.impl.e9 e9Var) {
        int i = 0;
        while (true) {
            com.applovin.impl.e9[] e9VarArr = this.b;
            if (i >= e9VarArr.length) {
                return -1;
            }
            if (e9Var == e9VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static java.lang.String a(java.lang.String str) {
        return (str == null || str.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private void a() {
        java.lang.String strA = a(this.b[0].c);
        int iC = c(this.b[0].f);
        int i = 1;
        while (true) {
            com.applovin.impl.e9[] e9VarArr = this.b;
            if (i >= e9VarArr.length) {
                return;
            }
            if (!strA.equals(a(e9VarArr[i].c))) {
                com.applovin.impl.e9[] e9VarArr2 = this.b;
                a("languages", e9VarArr2[0].c, e9VarArr2[i].c, i);
                return;
            } else {
                if (iC != c(this.b[i].f)) {
                    a("role flags", java.lang.Integer.toBinaryString(this.b[0].f), java.lang.Integer.toBinaryString(this.b[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.oo a(android.os.Bundle bundle) {
        return new com.applovin.impl.oo((com.applovin.impl.e9[]) com.applovin.impl.p2.a(com.applovin.impl.e9.I, bundle.getParcelableArrayList(b(0)), com.applovin.impl.db.h()).toArray(new com.applovin.impl.e9[0]));
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        com.applovin.impl.oc.a("TrackGroup", "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
