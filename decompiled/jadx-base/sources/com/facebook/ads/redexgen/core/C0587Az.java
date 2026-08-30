package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0587Az {
    public static byte[] A0P;
    public static java.lang.String[] A0Q = {"LlgsTT0Zui6IKPeQPgD8fSGM6QqYY5Rc", "pm8SMp4UFXjr9JE8LdvH4UGGKUCw8m3c", "zxRdy6MMcurCLd", "LTFO7rX5uSjfOX3uaTYKwhSNZ2EHHmg0", "A3FflbVDLT8hKrCOMbhf6ddg", "YVrA88PsPmqtAXS24dEjb0zjZhY9NNbQ", "ykDXgz0RSMwhstOtB5XzMrmFiU4VC1of", "nTtGLRyiyXzbXESigTOLKBAlDpVOCduX"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public android.media.AudioTrack A0H;
    public com.facebook.ads.redexgen.core.C0584Aw A0I;
    public java.lang.reflect.Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final com.facebook.ads.redexgen.core.InterfaceC0585Ax A0N;
    public final long[] A0O;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0P, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0Q[5].charAt(9) != 'm') {
                throw new java.lang.RuntimeException();
            }
            A0Q[7] = "gTtjPRse8wyQODgaJCc8oOoIzj4GdKlV";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
            i4++;
        }
    }

    public static void A06() {
        A0P = new byte[]{72, 74, 91, 99, 78, 91, 74, 65, 76, 86};
    }

    static {
        A06();
    }

    public C0587Az(com.facebook.ads.redexgen.core.InterfaceC0585Ax interfaceC0585Ax) {
        this.A0N = (com.facebook.ads.redexgen.core.InterfaceC0585Ax) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0585Ax);
        if (com.facebook.ads.redexgen.core.IK.A02 >= 18) {
            try {
                this.A0J = android.media.AudioTrack.class.getMethod(A03(0, 10, 120), null);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    private long A00() {
        if (this.A0G != androidx.media3.common.C.TIME_UNSET) {
            long jElapsedRealtime = (((long) this.A03) * ((android.os.SystemClock.elapsedRealtime() * 1000) - this.A0G)) / 1000000;
            long framesSinceStop = this.A06;
            long elapsedTimeSinceStopUs = this.A0F;
            return java.lang.Math.min(framesSinceStop, elapsedTimeSinceStopUs + jElapsedRealtime);
        }
        android.media.AudioTrack audioTrack = this.A0H;
        if (A0Q[5].charAt(9) != 'm') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0Q;
        strArr[1] = "d80ONhhmndH09owa4u2QAX5SlUichMvU";
        strArr[6] = "CIqJ6TE5ysQtBriEUDM02SGlAUBl025g";
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        int state = this.A0H.getPlaybackHeadPosition();
        long j = ((long) state) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        if (this.A0M) {
            if (playState == 2 && j == 0) {
                this.A0C = this.A0A;
            }
            j += this.A0C;
        }
        int i = com.facebook.ads.redexgen.core.IK.A02;
        java.lang.String[] strArr2 = A0Q;
        java.lang.String str = strArr2[1];
        java.lang.String str2 = strArr2[6];
        int iCharAt = str.charAt(25);
        int state2 = str2.charAt(25);
        if (iCharAt != state2) {
            A0Q[7] = "5iWZAq8M1nv4aO5I6gqcI5mp7gM0VRVV";
            if (i <= 28) {
                if (j != 0 && this.A0A > 0 && playState == 3) {
                    if (this.A07 == androidx.media3.common.C.TIME_UNSET) {
                        this.A07 = android.os.SystemClock.elapsedRealtime();
                    }
                    return this.A0A;
                }
                this.A07 = androidx.media3.common.C.TIME_UNSET;
            }
        } else {
            A0Q[7] = "djRU2aqvmlim9RkyPQU7a4pzcS1yn5uI";
            if (i <= 28) {
                if (j != 0) {
                }
                this.A07 = androidx.media3.common.C.TIME_UNSET;
            }
        }
        if (this.A0A > j) {
            this.A0D++;
        }
        this.A0A = j;
        return (this.A0D << 32) + j;
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j) {
        return (1000000 * j) / ((long) this.A03);
    }

    private void A04() {
        long jA01 = A01();
        if (jA01 == 0) {
            return;
        }
        long jNanoTime = java.lang.System.nanoTime() / 1000;
        if (jNanoTime - this.A09 >= 30000) {
            this.A0O[this.A01] = jA01 - jNanoTime;
            this.A01 = (this.A01 + 1) % 10;
            if (this.A04 < 10) {
                this.A04++;
            }
            this.A09 = jNanoTime;
            this.A0E = 0L;
            for (int i = 0; i < this.A04; i++) {
                long j = this.A0E;
                long j2 = this.A0O[i];
                long playbackPositionUs = this.A04;
                this.A0E = j + (j2 / playbackPositionUs);
            }
        }
        if (this.A0M) {
            return;
        }
        A08(jNanoTime, jA01);
        java.lang.String[] strArr = A0Q;
        if (strArr[0].charAt(8) != strArr[3].charAt(8)) {
            throw new java.lang.RuntimeException();
        }
        A0Q[4] = "NIXZw08ktYL6dUzDfb0VMH0i";
        A07(jNanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j) {
        if (this.A0L && this.A0J != null && j - this.A08 >= 500000) {
            try {
                this.A0B = (((long) ((java.lang.Integer) this.A0J.invoke(this.A0H, null)).intValue()) * 1000) - this.A05;
                this.A0B = java.lang.Math.max(this.A0B, 0L);
                if (this.A0B > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                    this.A0N.ACM(this.A0B);
                    this.A0B = 0L;
                }
            } catch (java.lang.Exception unused) {
                this.A0J = null;
            }
            this.A08 = j;
        }
    }

    private void A08(long j, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j)) {
            return;
        }
        long jA02 = this.A0I.A02();
        long jA01 = this.A0I.A01();
        if (java.lang.Math.abs(jA02 - j) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
            this.A0N.ADk(jA01, jA02, j, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (java.lang.Math.abs(A02(jA01) - audioTimestampSystemTimeUs) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
            this.A0N.ADB(jA01, jA02, j, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i) {
        return com.facebook.ads.redexgen.core.IK.A02 < 23 && (i == 5 || i == 6);
    }

    public final int A0B(long j) {
        int bytesPending = (int) (j - (A00() * ((long) this.A02)));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z) {
        long positionUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long timestampPositionUs = java.lang.System.nanoTime() / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs = this.A0I.A01();
            long timestampPositionFrames = A02(systemTimeUs);
            if (!this.A0I.A07()) {
                return timestampPositionFrames;
            }
            long systemTimeUs2 = this.A0I.A02();
            return timestampPositionFrames + (timestampPositionUs - systemTimeUs2);
        }
        if (this.A04 == 0) {
            positionUs = A01();
        } else {
            long positionUs2 = this.A0E;
            positionUs = positionUs2 + timestampPositionUs;
        }
        if (!z) {
            long j = this.A0B;
            java.lang.String[] strArr = A0Q;
            if (strArr[0].charAt(8) != strArr[3].charAt(8)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Q;
            strArr2[0] = "lcRtxCp1u16sb9wLaNGF5MQQPhmhPIjy";
            strArr2[3] = "crTnJJYSu7Bzqj8lWvsfk12r9Prdsw4f";
            return positionUs - j;
        }
        return positionUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j) {
        this.A0F = A00();
        this.A0G = android.os.SystemClock.elapsedRealtime() * 1000;
        this.A06 = j;
    }

    public final void A0G(android.media.AudioTrack audioTrack, int i, int i2, int i3) {
        long jA02;
        this.A0H = audioTrack;
        this.A02 = i2;
        this.A00 = i3;
        this.A0I = new com.facebook.ads.redexgen.core.C0584Aw(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i);
        this.A0L = com.facebook.ads.redexgen.core.IK.A0c(i);
        if (this.A0L) {
            long j = i3 / i2;
            if (A0Q[7].charAt(5) == 'U') {
                throw new java.lang.RuntimeException();
            }
            A0Q[7] = "0drPZAnnslhsUu7nqTZLhFKaqhlU4ehr";
            jA02 = A02(j);
        } else {
            jA02 = -9223372036854775807L;
        }
        this.A05 = jA02;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = androidx.media3.common.C.TIME_UNSET;
        this.A07 = androidx.media3.common.C.TIME_UNSET;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == androidx.media3.common.C.TIME_UNSET) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j) {
        return j > A00() || A09();
    }

    public final boolean A0K(long j) {
        return this.A07 != androidx.media3.common.C.TIME_UNSET && j > 0 && android.os.SystemClock.elapsedRealtime() - this.A07 >= 200;
    }

    public final boolean A0L(long j) {
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        this.A0K = A0J(j);
        if (hadData && !this.A0K && playState != 1 && this.A0N != null) {
            this.A0N.ADt(this.A00, com.facebook.ads.redexgen.core.AbstractC05389b.A01(this.A05));
        }
        return true;
    }
}
