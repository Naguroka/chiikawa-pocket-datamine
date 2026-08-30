package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class eb extends com.applovin.impl.gb implements com.applovin.impl.ec {
    public static com.applovin.impl.eb.a k() {
        return new com.applovin.impl.eb.a();
    }

    public static com.applovin.impl.eb l() {
        return com.applovin.impl.q7.g;
    }

    public static final class a extends com.applovin.impl.gb.b {
        @Override // com.applovin.impl.gb.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.eb.a a(java.lang.Object obj, java.lang.Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public com.applovin.impl.eb c() {
            return (com.applovin.impl.eb) super.a();
        }

        public com.applovin.impl.eb.a b(java.lang.Object obj, java.lang.Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    static com.applovin.impl.eb a(java.util.Collection collection, java.util.Comparator comparator) {
        com.applovin.impl.db dbVarA;
        if (collection.isEmpty()) {
            return l();
        }
        com.applovin.impl.fb.a aVar = new com.applovin.impl.fb.a(collection.size());
        java.util.Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.Collection collection2 = (java.util.Collection) entry.getValue();
            if (comparator == null) {
                dbVarA = com.applovin.impl.db.a(collection2);
            } else {
                dbVarA = com.applovin.impl.db.a(comparator, (java.lang.Iterable) collection2);
            }
            if (!dbVarA.isEmpty()) {
                aVar.a(key, dbVarA);
                size += dbVarA.size();
            }
        }
        return new com.applovin.impl.eb(aVar.a(), size);
    }

    eb(com.applovin.impl.fb fbVar, int i) {
        super(fbVar, i);
    }

    public com.applovin.impl.db b(java.lang.Object obj) {
        com.applovin.impl.db dbVar = (com.applovin.impl.db) this.d.get(obj);
        return dbVar == null ? com.applovin.impl.db.h() : dbVar;
    }
}
