package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ki implements com.applovin.impl.o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.impl.o2.a f962a = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.ki$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.ki.a(bundle);
        }
    };

    ki() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.ki a(android.os.Bundle bundle) {
        int i = bundle.getInt(a(0), -1);
        if (i == 0) {
            return (com.applovin.impl.ki) com.applovin.impl.ma.d.a(bundle);
        }
        if (i == 1) {
            return (com.applovin.impl.ki) com.applovin.impl.fh.c.a(bundle);
        }
        if (i == 2) {
            return (com.applovin.impl.ki) com.applovin.impl.cl.d.a(bundle);
        }
        if (i != 3) {
            throw new java.lang.IllegalArgumentException("Encountered unknown rating type: " + i);
        }
        return (com.applovin.impl.ki) com.applovin.impl.co.d.a(bundle);
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
