package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hc {
    static boolean a(java.util.List list, java.lang.Object obj) {
        if (obj == com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list2 = (java.util.List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof java.util.RandomAccess) || !(list2 instanceof java.util.RandomAccess)) {
            return com.applovin.impl.wb.a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!com.applovin.exoplayer2.common.base.Objects.equal(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static java.util.ArrayList a() {
        return new java.util.ArrayList();
    }

    public static java.util.ArrayList a(java.util.Iterator it) {
        java.util.ArrayList arrayListA = a();
        com.applovin.impl.wb.a(arrayListA, it);
        return arrayListA;
    }

    static int b(java.util.List list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return c(list, obj);
        }
        java.util.ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.applovin.exoplayer2.common.base.Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(java.util.List list, java.lang.Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int d(java.util.List list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return e(list, obj);
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.applovin.exoplayer2.common.base.Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(java.util.List list, java.lang.Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }
}
