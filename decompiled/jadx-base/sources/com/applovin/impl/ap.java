package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ap extends com.applovin.impl.i2 {
    public ap(com.applovin.impl.ho hoVar, long j, long j2, int i, int i2) {
        super(new com.applovin.impl.i2.b(), new com.applovin.impl.ap.a(i, hoVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }

    private static final class a implements com.applovin.impl.i2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ho f627a;
        private final com.applovin.impl.ah b = new com.applovin.impl.ah();
        private final int c;
        private final int d;

        public a(int i, com.applovin.impl.ho hoVar, int i2) {
            this.c = i;
            this.f627a = hoVar;
            this.d = i2;
        }

        @Override // com.applovin.impl.i2.f
        public void a() {
            this.b.a(com.applovin.impl.xp.f);
        }

        private com.applovin.impl.i2.e a(com.applovin.impl.ah ahVar, long j, long j2) {
            int iA;
            int iA2;
            int iE = ahVar.e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ahVar.a() >= 188 && (iA2 = (iA = com.applovin.impl.ep.a(ahVar.c(), ahVar.d(), iE)) + 188) <= iE) {
                long jA = com.applovin.impl.ep.a(ahVar, iA, this.c);
                if (jA != androidx.media3.common.C.TIME_UNSET) {
                    long jB = this.f627a.b(jA);
                    if (jB > j) {
                        if (j5 == androidx.media3.common.C.TIME_UNSET) {
                            return com.applovin.impl.i2.e.a(jB, j2);
                        }
                        return com.applovin.impl.i2.e.a(j2 + j4);
                    }
                    if (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jB > j) {
                        return com.applovin.impl.i2.e.a(j2 + ((long) iA));
                    }
                    j4 = iA;
                    j5 = jB;
                }
                ahVar.f(iA2);
                j3 = iA2;
            }
            if (j5 != androidx.media3.common.C.TIME_UNSET) {
                return com.applovin.impl.i2.e.b(j5, j2 + j3);
            }
            return com.applovin.impl.i2.e.d;
        }

        @Override // com.applovin.impl.i2.f
        public com.applovin.impl.i2.e a(com.applovin.impl.k8 k8Var, long j) {
            long jF = k8Var.f();
            int iMin = (int) java.lang.Math.min(this.d, k8Var.a() - jF);
            this.b.d(iMin);
            k8Var.c(this.b.c(), 0, iMin);
            return a(this.b, j, jF);
        }
    }
}
