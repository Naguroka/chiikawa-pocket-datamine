package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ub {

    public interface a {
        java.lang.Object a();
    }

    public interface b {
        void a(java.lang.Object obj);
    }

    java.lang.Object a(com.applovin.impl.ub.a aVar);

    void a(java.lang.Object obj, com.applovin.impl.ub.b bVar);

    public static class d implements com.applovin.impl.ub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ub.c f1397a = new com.applovin.impl.ub.c();

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.ref.WeakReference b(com.applovin.impl.ub.a aVar) {
            return new java.lang.ref.WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.ub
        public java.lang.Object a(final com.applovin.impl.ub.a aVar) {
            java.lang.Object obj;
            do {
                obj = ((java.lang.ref.WeakReference) this.f1397a.a(new com.applovin.impl.ub.a() { // from class: com.applovin.impl.ub$d$$ExternalSyntheticLambda0
                    @Override // com.applovin.impl.ub.a
                    public final java.lang.Object a() {
                        return com.applovin.impl.ub.d.b(aVar);
                    }
                })).get();
            } while (obj == null);
            return obj;
        }

        @Override // com.applovin.impl.ub
        public void a(final java.lang.Object obj, final com.applovin.impl.ub.b bVar) {
            com.applovin.impl.p6.a(obj);
            this.f1397a.a(new java.lang.ref.WeakReference(obj), new com.applovin.impl.ub.b() { // from class: com.applovin.impl.ub$d$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.ub.b
                public final void a(java.lang.Object obj2) {
                    bVar.a(obj);
                }
            });
        }
    }

    public static class c implements com.applovin.impl.ub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1396a;
        private final java.util.Stack b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.ub
        public synchronized java.lang.Object a(com.applovin.impl.ub.a aVar) {
            return this.b.isEmpty() ? aVar.a() : this.b.pop();
        }

        public c(int i) {
            this.b = new java.util.Stack();
            this.f1396a = i;
        }

        @Override // com.applovin.impl.ub
        public synchronized void a(java.lang.Object obj, com.applovin.impl.ub.b bVar) {
            if (this.b.size() < this.f1396a) {
                this.b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (java.lang.RuntimeException e) {
                    com.applovin.impl.p6.a((java.lang.Throwable) e);
                }
            }
        }
    }
}
