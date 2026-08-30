package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0813Kq {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final java.lang.Package A02;
    public static final java.lang.String A03;
    public static final java.lang.String A04;
    public static final java.lang.String A05;
    public static final java.util.Set<com.facebook.ads.redexgen.core.C1199Zs> A06;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC0820Kz> A07;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.L1> A08;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 54, 51, 57, 32, 40, 54, 51, 40, 56, 53, kotlin.io.encoding.Base64.padSymbol, 40, 62, 51, 40, 60, 50, 46, 57, 86, 83, 89, 64, 72, 88, 69, 94, 80, 94, 89, 86, 91, 72, 82, 79, 67, 69, 86, 68, 21, 122, 127, 117, 108, 100, 104, 122, 109, 126, 127, 100, 104, 111, 122, 111, 126, 100, 127, 122, 111, 122, 75, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, 57, 23, 21, 2, 41, 3, 2, 31, 26, 26, 21, 36, 24, 23, 18, 30, 21, 15, 36, 15, 20, 16, 30, 21, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 85, 98, 106, 104, 115, 98, 70, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, 67, 106, 119, 87, 96, 118, 112, 105, 113, 15, 8, 29, 14, 8, kotlin.io.encoding.Base64.padSymbol, 31, 8, 21, 10, 21, 8, 5, 3, 4, 17, 2, 4, 49, 19, 4, 25, 6, 25, 4, 9, 54, 31, 2, 34, 21, 3, 5, 28, 4};
    }

    static {
        A07();
        A02 = com.facebook.ads.redexgen.core.C0813Kq.class.getPackage();
        A04 = A02 + A06(40, 22, 116);
        A03 = A02 + A06(0, 19, 56);
        A05 = A02 + A06(19, 21, 88);
        A06 = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        A07 = new java.util.concurrent.atomic.AtomicReference<>();
        A08 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static android.content.Intent A00(android.content.Intent intent) {
        android.content.Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(intent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static android.content.Intent A01(android.content.Intent intent, java.lang.ClassLoader classLoader) {
        android.content.Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        android.os.Bundle audienceNetworkActivityBundle = new android.os.Bundle();
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            audienceNetworkActivityBundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(audienceNetworkActivityBundle);
        return intentCloneFilter;
    }

    public static android.os.Bundle A02(android.os.Bundle bundle, java.lang.ClassLoader classLoader) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            android.os.Bundle bundle2 = parcelObtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            parcelObtain.recycle();
            return bundle2;
        }
        throw new java.lang.IllegalStateException(A06(62, 28, 87));
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A03(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (com.facebook.ads.redexgen.core.C1199Zs c1199Zs : A06) {
                java.lang.String adId = c1199Zs.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c1199Zs;
                }
            }
            return null;
        }
        return null;
    }

    public static com.facebook.ads.internal.util.activity.AdActivityIntent A04(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent = new com.facebook.ads.internal.util.activity.AdActivityIntent(c1199Zs.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1199Zs.A0E().getId());
        A06.add(c1199Zs);
        return adActivityIntent;
    }

    public static java.lang.Class A05() {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return java.lang.Class.forName(A06(113, 59, 72));
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return com.facebook.ads.AudienceNetworkActivity.class;
    }

    public static void A08(android.app.Activity activity, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C0811Ko {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C0811Ko(e);
        }
    }

    public static void A09(android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A0A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent) throws com.facebook.ads.redexgen.core.C0811Ko {
        android.content.Context launchContext;
        android.content.Context applicationContext = c1199Zs.getApplicationContext();
        if (com.facebook.ads.redexgen.core.C0762Im.A2Q(c1199Zs) && (launchContext = c1199Zs.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0J(c1199Zs, adActivityIntent)) {
                    c1199Zs.A0E().AFT();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C0811Ko(e);
        }
    }

    public static boolean A0B(android.content.Intent intent, java.util.Set<java.lang.String> set) {
        android.net.Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        java.lang.String string = intentUri.toString();
        java.util.Iterator<java.lang.String> it = set.iterator();
        do {
            boolean zHasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!zHasNext) {
                return false;
            }
        } while (!string.startsWith(it.next()));
        return true;
    }

    public static boolean A0C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C0811Ko {
        A07.get();
        return A0G(c1199Zs, intent, null);
    }

    public static boolean A0D(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C0811Ko {
        A07.get();
        if (0 != 0) {
            android.app.Activity activityA0D = c1199Zs.A0D();
            if (A01[7].length() == 30) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (activityA0D != null) {
                c1199Zs.A0B();
                try {
                    c1199Zs.A0D();
                    throw new java.lang.NullPointerException(A06(com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED, 22, 63));
                } catch (android.content.ActivityNotFoundException e) {
                    throw new com.facebook.ads.redexgen.core.C0811Ko(e);
                } catch (java.lang.Exception e2) {
                    c1199Zs.A07().AA0(A06(90, 8, 57), com.facebook.ads.redexgen.core.C8E.A07, new com.facebook.ads.redexgen.core.C8F(e2));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0E(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C0811Ko {
        return A0F(c1199Zs, A00(intent), -1);
    }

    public static boolean A0F(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.content.Intent intent, int i) throws com.facebook.ads.redexgen.core.C0811Ko {
        try {
            android.app.Activity currentActivity = com.facebook.ads.internal.util.activity.ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1199Zs.A0D();
            }
            if (currentActivity != null) {
                if (i >= 0) {
                    currentActivity.startActivityForResult(intent, i);
                    return true;
                }
                currentActivity.startActivity(intent);
                return true;
            }
            return false;
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C0811Ko(e);
        }
    }

    public static boolean A0G(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.content.Intent intent, com.facebook.ads.redexgen.core.InterfaceC0820Kz interfaceC0820Kz) throws com.facebook.ads.redexgen.core.C0811Ko {
        if (A0B(intent, com.facebook.ads.redexgen.core.C0762Im.A0X(c1199Zs))) {
            return false;
        }
        android.content.Context context = c1199Zs;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            android.content.Context startContext = c1199Zs.A0D();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (interfaceC0820Kz != null && !A0B(intent, com.facebook.ads.redexgen.core.C0762Im.A0Z(c1199Zs))) {
                c1199Zs.A0B();
                try {
                    throw new java.lang.NullPointerException(A06(org.objectweb.asm.Opcodes.ARRAYLENGTH, 13, 51));
                } catch (android.content.ActivityNotFoundException e) {
                    throw new com.facebook.ads.redexgen.core.C0811Ko(e);
                } catch (java.lang.Exception e2) {
                    c1199Zs.A07().AA0(A06(90, 8, 57), com.facebook.ads.redexgen.core.C8E.A08, new com.facebook.ads.redexgen.core.C8F(e2));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (android.content.ActivityNotFoundException e3) {
                throw new com.facebook.ads.redexgen.core.C0811Ko(e3);
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0H(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) throws android.content.ActivityNotFoundException {
        A08.get();
        return A0I(c1199Zs, uri, str, null);
    }

    public static boolean A0I(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str, com.facebook.ads.redexgen.core.L1 l1) throws android.content.ActivityNotFoundException {
        if (l1 == null || c1199Zs.A0D() == null) {
            return false;
        }
        new android.os.Bundle().putString(A06(98, 15, 52), str);
        uri.toString();
        c1199Zs.A0D();
        throw new java.lang.NullPointerException(A06(172, 18, 74));
    }

    public static boolean A0J(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent) throws com.facebook.ads.redexgen.core.C0811Ko {
        return A0F(c1199Zs, A00(adActivityIntent), 0);
    }
}
