package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class aj<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.ConcurrentLinkedQueue<T> f210a = new java.util.concurrent.ConcurrentLinkedQueue<>();

    interface a<T> {
        void a(T t);
    }

    aj() {
    }

    private boolean c(T t) {
        return this.f210a.contains(t);
    }

    final void a(com.amoad.aj.a<T> aVar) {
        synchronized (this.f210a) {
            for (T t : this.f210a) {
                if (c(t)) {
                    aVar.a(t);
                }
            }
        }
    }

    final boolean a(T t) {
        boolean z;
        synchronized (this.f210a) {
            z = !c(t) && this.f210a.add(t);
        }
        return z;
    }

    final boolean b(T t) {
        return this.f210a.remove(t);
    }
}
