package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements com.applovin.impl.o2 {
    public static final com.applovin.impl.u h = new com.applovin.impl.u(null, new com.applovin.impl.u.a[0], 0, androidx.media3.common.C.TIME_UNSET, 0);
    private static final com.applovin.impl.u.a i = new com.applovin.impl.u.a(0).c(0);
    public static final com.applovin.impl.o2.a j = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.u$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.u.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1376a;
    public final int b;
    public final long c;
    public final long d;
    public final int f;
    private final com.applovin.impl.u.a[] g;

    public static final class a implements com.applovin.impl.o2 {
        public static final com.applovin.impl.o2.a i = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.u$a$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.u.a.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1377a;
        public final int b;
        public final android.net.Uri[] c;
        public final int[] d;
        public final long[] f;
        public final long g;
        public final boolean h;

        public a(long j) {
            this(j, -1, new int[0], new android.net.Uri[0], new long[0], 0L, false);
        }

        public boolean c() {
            return this.b == -1 || a() < this.b;
        }

        public boolean b() {
            if (this.b == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.d[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.u.a.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.u.a aVar = (com.applovin.impl.u.a) obj;
            return this.f1377a == aVar.f1377a && this.b == aVar.b && java.util.Arrays.equals(this.c, aVar.c) && java.util.Arrays.equals(this.d, aVar.d) && java.util.Arrays.equals(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            long j = this.f1377a;
            int iHashCode = (((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + java.util.Arrays.hashCode(this.c)) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + java.util.Arrays.hashCode(this.f)) * 31;
            long j2 = this.g;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.h ? 1 : 0);
        }

        private a(long j, int i2, int[] iArr, android.net.Uri[] uriArr, long[] jArr, long j2, boolean z) {
            com.applovin.impl.b1.a(iArr.length == uriArr.length);
            this.f1377a = j;
            this.b = i2;
            this.d = iArr;
            this.c = uriArr;
            this.f = jArr;
            this.g = j2;
            this.h = z;
        }

        private static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = java.lang.Math.max(i2, length);
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax);
            java.util.Arrays.fill(jArrCopyOf, length, iMax, androidx.media3.common.C.TIME_UNSET);
            return jArrCopyOf;
        }

        public com.applovin.impl.u.a c(int i2) {
            int[] iArrA = a(this.d, i2);
            long[] jArrA = a(this.f, i2);
            return new com.applovin.impl.u.a(this.f1377a, i2, iArrA, (android.net.Uri[]) java.util.Arrays.copyOf(this.c, i2), jArrA, this.g, this.h);
        }

        private static java.lang.String b(int i2) {
            return java.lang.Integer.toString(i2, 36);
        }

        private static int[] a(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = java.lang.Math.max(i2, length);
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
            java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.u.a a(android.os.Bundle bundle) {
            long j = bundle.getLong(b(0));
            int i2 = bundle.getInt(b(1), -1);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j2 = bundle.getLong(b(5));
            boolean z = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new com.applovin.impl.u.a(j, i2, intArray, parcelableArrayList == null ? new android.net.Uri[0] : (android.net.Uri[]) parcelableArrayList.toArray(new android.net.Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.d;
                if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }
    }

    private u(java.lang.Object obj, com.applovin.impl.u.a[] aVarArr, long j2, long j3, int i2) {
        this.f1376a = obj;
        this.c = j2;
        this.d = j3;
        this.b = aVarArr.length + i2;
        this.g = aVarArr;
        this.f = i2;
    }

    public int b(long j2, long j3) {
        int i2 = this.b - 1;
        while (i2 >= 0 && a(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !a(i2).b()) {
            return -1;
        }
        return i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.u.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.u uVar = (com.applovin.impl.u) obj;
        return com.applovin.impl.xp.a(this.f1376a, uVar.f1376a) && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d && this.f == uVar.f && java.util.Arrays.equals(this.g, uVar.g);
    }

    public int hashCode() {
        int i2 = this.b * 31;
        java.lang.Object obj = this.f1376a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.f) * 31) + java.util.Arrays.hashCode(this.g);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f1376a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.g[i2].f1377a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.g[i2].d.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.g[i2].d[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.g[i2].f[i3]);
                sb.append(')');
                if (i3 < this.g[i2].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.u a(android.os.Bundle bundle) {
        com.applovin.impl.u.a[] aVarArr;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new com.applovin.impl.u.a[0];
        } else {
            com.applovin.impl.u.a[] aVarArr2 = new com.applovin.impl.u.a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = (com.applovin.impl.u.a) com.applovin.impl.u.a.i.a((android.os.Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new com.applovin.impl.u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), androidx.media3.common.C.TIME_UNSET), bundle.getInt(b(4)));
    }

    public com.applovin.impl.u.a a(int i2) {
        int i3 = this.f;
        if (i2 < i3) {
            return i;
        }
        return this.g[i2 - i3];
    }

    private static java.lang.String b(int i2) {
        return java.lang.Integer.toString(i2, 36);
    }

    public int a(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != androidx.media3.common.C.TIME_UNSET && j2 >= j3) {
            return -1;
        }
        int i2 = this.f;
        while (i2 < this.b && ((a(i2).f1377a != Long.MIN_VALUE && a(i2).f1377a <= j2) || !a(i2).c())) {
            i2++;
        }
        if (i2 < this.b) {
            return i2;
        }
        return -1;
    }

    private boolean a(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = a(i2).f1377a;
        if (j4 == Long.MIN_VALUE) {
            return j3 == androidx.media3.common.C.TIME_UNSET || j2 < j3;
        }
        return j2 < j4;
    }
}
