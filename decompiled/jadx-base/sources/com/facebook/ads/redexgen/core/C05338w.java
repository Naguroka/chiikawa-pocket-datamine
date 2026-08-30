package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05338w<T extends com.facebook.ads.redexgen.core.AbstractC05348x, E extends com.facebook.ads.redexgen.core.C05328v> {
    public final java.util.Map<java.lang.Class<E>, java.util.List<java.lang.ref.WeakReference<T>>> A00 = new java.util.HashMap();
    public final java.util.Queue<E> A01 = new java.util.ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A00(E e) {
        java.util.List<java.lang.ref.WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(list).iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.AbstractC05348x abstractC05348x = (com.facebook.ads.redexgen.core.AbstractC05348x) ((java.lang.ref.WeakReference) it.next()).get();
            if (abstractC05348x != null && abstractC05348x.A00(e)) {
                abstractC05348x.A03(e);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        java.lang.Class<E> clsA01 = t.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new java.util.ArrayList());
        }
        java.util.List<java.lang.ref.WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new java.lang.ref.WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> subscribers) {
        if (subscribers != null) {
            int writePtr = 0;
            for (int i = 0; i < writePtr; i++) {
                java.lang.ref.WeakReference<T> weakReference = subscribers.get(i);
                if (weakReference.get() != null) {
                    subscribers.set(writePtr, weakReference);
                    writePtr++;
                }
            }
            int writePtr2 = subscribers.size();
            for (int writePtr3 = writePtr2 - 1; writePtr3 >= writePtr; writePtr3--) {
                subscribers.remove(writePtr3);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        java.util.List<java.lang.ref.WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == subscriber) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}
