package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> arrayList) {
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass1.add(arrayList.get(i).freeze());
        }
        return anonymousClass1;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> iterable) {
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            anonymousClass1.add(it.next().freeze());
        }
        return anonymousClass1;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] eArr) {
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e : eArr) {
            anonymousClass1.add(e.freeze());
        }
        return anonymousClass1;
    }
}
