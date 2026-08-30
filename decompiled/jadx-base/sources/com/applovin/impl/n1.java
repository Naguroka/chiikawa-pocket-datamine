package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {
    public static final com.applovin.impl.n1 c = new com.applovin.impl.n1(new int[]{2}, 8);
    private static final com.applovin.impl.n1 d = new com.applovin.impl.n1(new int[]{2, 5, 6}, 8);
    private static final int[] e = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f1081a;
    private final int b;

    private static final class a {
        public static int[] a() {
            com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
            for (int i : com.applovin.impl.n1.e) {
                if (android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(androidx.media3.extractor.OpusUtil.SAMPLE_RATE).build(), new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarF.b(java.lang.Integer.valueOf(i));
                }
            }
            aVarF.b(2);
            return com.applovin.impl.tb.a(aVarF.a());
        }
    }

    private static boolean b() {
        if (com.applovin.impl.xp.f1515a >= 17) {
            java.lang.String str = com.applovin.impl.xp.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + java.util.Arrays.toString(this.f1081a) + com.ironsource.y8.i.e;
    }

    public static com.applovin.impl.n1 a(android.content.Context context) {
        return a(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public n1(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.f1081a = iArrCopyOf;
            java.util.Arrays.sort(iArrCopyOf);
        } else {
            this.f1081a = new int[0];
        }
        this.b = i;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.n1)) {
            return false;
        }
        com.applovin.impl.n1 n1Var = (com.applovin.impl.n1) obj;
        return java.util.Arrays.equals(this.f1081a, n1Var.f1081a) && this.b == n1Var.b;
    }

    public int hashCode() {
        return this.b + (java.util.Arrays.hashCode(this.f1081a) * 31);
    }

    public boolean a(int i) {
        return java.util.Arrays.binarySearch(this.f1081a, i) >= 0;
    }

    static com.applovin.impl.n1 a(android.content.Context context, android.content.Intent intent) {
        if (b() && android.provider.Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (com.applovin.impl.xp.f1515a >= 29 && com.applovin.impl.xp.d(context)) {
            return new com.applovin.impl.n1(com.applovin.impl.n1.a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new com.applovin.impl.n1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return c;
    }
}
