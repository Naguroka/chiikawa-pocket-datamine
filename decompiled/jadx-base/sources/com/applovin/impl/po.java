package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class po implements com.applovin.impl.o2 {
    public static final com.applovin.impl.po d = new com.applovin.impl.po(new com.applovin.impl.oo[0]);
    public static final com.applovin.impl.o2.a f = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.po$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.po.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1153a;
    private final com.applovin.impl.oo[] b;
    private int c;

    public po(com.applovin.impl.oo... ooVarArr) {
        this.b = ooVarArr;
        this.f1153a = ooVarArr.length;
    }

    public com.applovin.impl.oo a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b);
        }
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.po.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.po poVar = (com.applovin.impl.po) obj;
        return this.f1153a == poVar.f1153a && java.util.Arrays.equals(this.b, poVar.b);
    }

    public int a(com.applovin.impl.oo ooVar) {
        for (int i = 0; i < this.f1153a; i++) {
            if (this.b[i] == ooVar) {
                return i;
            }
        }
        return -1;
    }

    private static java.lang.String b(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public boolean a() {
        return this.f1153a == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.po a(android.os.Bundle bundle) {
        return new com.applovin.impl.po((com.applovin.impl.oo[]) com.applovin.impl.p2.a(com.applovin.impl.oo.d, bundle.getParcelableArrayList(b(0)), com.applovin.impl.db.h()).toArray(new com.applovin.impl.oo[0]));
    }
}
