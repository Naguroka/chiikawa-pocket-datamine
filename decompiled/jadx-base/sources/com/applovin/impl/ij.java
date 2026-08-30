package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ij {
    com.applovin.impl.ij.a b(long j);

    boolean b();

    long d();

    public static class b implements com.applovin.impl.ij {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f891a;
        private final com.applovin.impl.ij.a b;

        @Override // com.applovin.impl.ij
        public boolean b() {
            return false;
        }

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.f891a;
        }

        @Override // com.applovin.impl.ij
        public com.applovin.impl.ij.a b(long j) {
            return this.b;
        }

        public b(long j, long j2) {
            this.f891a = j;
            this.b = new com.applovin.impl.ij.a(j2 == 0 ? com.applovin.impl.kj.c : new com.applovin.impl.kj(0L, j2));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.kj f890a;
        public final com.applovin.impl.kj b;

        public a(com.applovin.impl.kj kjVar) {
            this(kjVar, kjVar);
        }

        public java.lang.String toString() {
            return com.ironsource.y8.i.d + this.f890a + (this.f890a.equals(this.b) ? "" : ", " + this.b) + com.ironsource.y8.i.e;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.ij.a.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.ij.a aVar = (com.applovin.impl.ij.a) obj;
            return this.f890a.equals(aVar.f890a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.f890a.hashCode() * 31) + this.b.hashCode();
        }

        public a(com.applovin.impl.kj kjVar, com.applovin.impl.kj kjVar2) {
            this.f890a = (com.applovin.impl.kj) com.applovin.impl.b1.a(kjVar);
            this.b = (com.applovin.impl.kj) com.applovin.impl.b1.a(kjVar2);
        }
    }
}
