package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: ParallelInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class g<T> extends com.bykv.vk.openvk.preload.b.d<java.util.List<T>, T> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ java.lang.Object a(final com.bykv.vk.openvk.preload.b.b bVar, java.lang.Object obj) throws java.lang.Throwable {
        java.util.List list = (java.util.List) obj;
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(list.size());
        final java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        final java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        for (final java.lang.Object obj2 : list) {
            com.bykv.vk.openvk.preload.geckox.b.p().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.b.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            copyOnWriteArrayList.add(bVar.a(obj2));
                        } catch (java.lang.Throwable th) {
                            countDownLatch.countDown();
                            throw th;
                        }
                    } catch (com.bykv.vk.openvk.preload.b.i.a e) {
                        java.lang.Throwable cause = e.getCause();
                        copyOnWriteArrayList2.add(cause);
                        com.bykv.vk.openvk.preload.b.g.this.d(cause);
                    } catch (java.lang.Throwable th2) {
                        copyOnWriteArrayList2.add(th2);
                        com.bykv.vk.openvk.preload.b.g.this.d(th2);
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new com.bykv.vk.openvk.preload.b.a.a(copyOnWriteArrayList2);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        if (objArr != null) {
            if (objArr.length != 1) {
                throw new java.lang.IllegalArgumentException("ParallelInterceptor only need one param");
            }
            if (!(objArr[0] instanceof java.util.concurrent.Executor)) {
                throw new java.lang.IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
            }
        }
    }
}
