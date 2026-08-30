package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.impl.a7 f583a;
    public static final com.applovin.impl.a7 b;

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.applovin.impl.a7.b f584a = new com.applovin.impl.a7.b() { // from class: com.applovin.impl.a7$b$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.a7.b
            public final void a() {
                com.applovin.impl.a7.b.b();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void b() {
        }

        void a();
    }

    static {
        com.applovin.impl.a7.a aVar = new com.applovin.impl.a7.a();
        f583a = aVar;
        b = aVar;
    }

    int a(com.applovin.impl.e9 e9Var);

    com.applovin.impl.y6 a(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var);

    default void a() {
    }

    default void b() {
    }

    default com.applovin.impl.a7.b b(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var) {
        return com.applovin.impl.a7.b.f584a;
    }

    class a implements com.applovin.impl.a7 {
        a() {
        }

        @Override // com.applovin.impl.a7
        public com.applovin.impl.y6 a(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var) {
            if (e9Var.p == null) {
                return null;
            }
            return new com.applovin.impl.t7(new com.applovin.impl.y6.a(new com.applovin.impl.sp(1), 6001));
        }

        @Override // com.applovin.impl.a7
        public int a(com.applovin.impl.e9 e9Var) {
            return e9Var.p != null ? 1 : 0;
        }
    }
}
