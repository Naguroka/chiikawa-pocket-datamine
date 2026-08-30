package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.t1.a f1345a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    public t1(android.media.AudioTrack audioTrack) {
        if (com.applovin.impl.xp.f1515a >= 19) {
            this.f1345a = new com.applovin.impl.t1.a(audioTrack);
            f();
        } else {
            this.f1345a = null;
            a(3);
        }
    }

    public void e() {
        a(4);
    }

    public void a() {
        if (this.b == 4) {
            f();
        }
    }

    public boolean d() {
        return this.b == 2;
    }

    public void f() {
        if (this.f1345a != null) {
            a(0);
        }
    }

    public long c() {
        com.applovin.impl.t1.a aVar = this.f1345a;
        return aVar != null ? aVar.b() : androidx.media3.common.C.TIME_UNSET;
    }

    public long b() {
        com.applovin.impl.t1.a aVar = this.f1345a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.media.AudioTrack f1346a;
        private final android.media.AudioTimestamp b = new android.media.AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(android.media.AudioTrack audioTrack) {
            this.f1346a = audioTrack;
        }

        public boolean c() {
            boolean timestamp = this.f1346a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public long a() {
            return this.e;
        }
    }

    public boolean a(long j) {
        com.applovin.impl.t1.a aVar = this.f1345a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean zC = aVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else if (zC) {
                        f();
                    }
                } else if (!zC) {
                    f();
                }
            } else if (!zC) {
                f();
            } else if (this.f1345a.a() > this.f) {
                a(2);
            }
        } else if (zC) {
            if (this.f1345a.b() < this.c) {
                return false;
            }
            this.f = this.f1345a.a();
            a(1);
        } else if (j - this.c > 500000) {
            a(3);
        }
        return zC;
    }

    private void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = java.lang.System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new java.lang.IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
