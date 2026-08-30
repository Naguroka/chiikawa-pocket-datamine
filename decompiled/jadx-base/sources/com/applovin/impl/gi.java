package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class gi extends com.applovin.impl.i2 {
    public gi(com.applovin.impl.ho hoVar, long j, long j2) {
        super(new com.applovin.impl.i2.b(), new com.applovin.impl.gi.b(hoVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class b implements com.applovin.impl.i2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ho f824a;
        private final com.applovin.impl.ah b;

        private b(com.applovin.impl.ho hoVar) {
            this.f824a = hoVar;
            this.b = new com.applovin.impl.ah();
        }

        @Override // com.applovin.impl.i2.f
        public void a() {
            this.b.a(com.applovin.impl.xp.f);
        }

        private com.applovin.impl.i2.e a(com.applovin.impl.ah ahVar, long j, long j2) {
            int iD = -1;
            int iD2 = -1;
            long j3 = -9223372036854775807L;
            while (ahVar.a() >= 4) {
                if (com.applovin.impl.gi.b(ahVar.c(), ahVar.d()) != 442) {
                    ahVar.g(1);
                } else {
                    ahVar.g(4);
                    long jC = com.applovin.impl.hi.c(ahVar);
                    if (jC != androidx.media3.common.C.TIME_UNSET) {
                        long jB = this.f824a.b(jC);
                        if (jB > j) {
                            if (j3 == androidx.media3.common.C.TIME_UNSET) {
                                return com.applovin.impl.i2.e.a(jB, j2);
                            }
                            return com.applovin.impl.i2.e.a(j2 + ((long) iD2));
                        }
                        if (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jB > j) {
                            return com.applovin.impl.i2.e.a(j2 + ((long) ahVar.d()));
                        }
                        iD2 = ahVar.d();
                        j3 = jB;
                    }
                    a(ahVar);
                    iD = ahVar.d();
                }
            }
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                return com.applovin.impl.i2.e.b(j3, j2 + ((long) iD));
            }
            return com.applovin.impl.i2.e.d;
        }

        @Override // com.applovin.impl.i2.f
        public com.applovin.impl.i2.e a(com.applovin.impl.k8 k8Var, long j) {
            long jF = k8Var.f();
            int iMin = (int) java.lang.Math.min(20000L, k8Var.a() - jF);
            this.b.d(iMin);
            k8Var.c(this.b.c(), 0, iMin);
            return a(this.b, j, jF);
        }

        private static void a(com.applovin.impl.ah ahVar) {
            int iB;
            int iE = ahVar.e();
            if (ahVar.a() < 10) {
                ahVar.f(iE);
                return;
            }
            ahVar.g(9);
            int iW = ahVar.w() & 7;
            if (ahVar.a() < iW) {
                ahVar.f(iE);
                return;
            }
            ahVar.g(iW);
            if (ahVar.a() >= 4) {
                if (com.applovin.impl.gi.b(ahVar.c(), ahVar.d()) == 443) {
                    ahVar.g(4);
                    int iC = ahVar.C();
                    if (ahVar.a() < iC) {
                        ahVar.f(iE);
                        return;
                    }
                    ahVar.g(iC);
                }
                while (ahVar.a() >= 4 && (iB = com.applovin.impl.gi.b(ahVar.c(), ahVar.d())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                    ahVar.g(4);
                    if (ahVar.a() < 2) {
                        ahVar.f(iE);
                        return;
                    }
                    ahVar.f(java.lang.Math.min(ahVar.e(), ahVar.d() + ahVar.C()));
                }
                return;
            }
            ahVar.f(iE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
