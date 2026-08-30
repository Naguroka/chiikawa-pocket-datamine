package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p2 {
    public static void a(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((java.lang.ClassLoader) com.applovin.impl.xp.a(com.applovin.impl.p2.class.getClassLoader()));
        }
    }

    public static java.util.List a(com.applovin.impl.o2.a aVar, java.util.List list, java.util.List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static android.util.SparseArray a(com.applovin.impl.o2.a aVar, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        android.util.SparseArray sparseArray3 = new android.util.SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), aVar.a((android.os.Bundle) sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    public static com.applovin.impl.o2 a(com.applovin.impl.o2.a aVar, android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static com.applovin.impl.db a(com.applovin.impl.o2.a aVar, java.util.List list) {
        com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
        for (int i = 0; i < list.size(); i++) {
            aVarF.b(aVar.a((android.os.Bundle) com.applovin.impl.b1.a((android.os.Bundle) list.get(i))));
        }
        return aVarF.a();
    }
}
