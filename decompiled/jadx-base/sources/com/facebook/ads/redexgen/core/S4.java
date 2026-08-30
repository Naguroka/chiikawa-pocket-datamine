package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S4 implements java.util.Map<java.lang.String, java.lang.String> {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Cy9Ol7puM0ud9B1M8hlJlb0", "qBLGxoigf1fC", "mxspOl2wXxp96xi", "1GotRAtMtk4n0Ye4yuR0usUojP3tB7kg", "Q5cfUKUjlAvrOqac2Z528PAxhBhncEkS", "XGB7", "HNCS9EbNXrRkXrCNXemSKzc47T2AJZ", "NeqKP8obYXci"};
    public java.util.Map<java.lang.String, java.lang.String> A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -42, 18, 17, 3, -22, -11};
    }

    static {
        A03();
    }

    public S4() {
        this.A00 = new java.util.HashMap();
    }

    public S4(java.util.Map<java.lang.String, java.lang.String> map) {
        this.A00 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final java.lang.String get(java.lang.Object obj) {
        return this.A00.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final java.lang.String remove(java.lang.Object obj) {
        return this.A00.remove(obj);
    }

    public final com.facebook.ads.redexgen.core.S4 A04(java.lang.String str, java.lang.String str2) {
        this.A00.put(str, str2);
        return this;
    }

    public final com.facebook.ads.redexgen.core.S4 A05(java.util.Map<? extends java.lang.String, ? extends java.lang.String> arg) {
        putAll(arg);
        return this;
    }

    public final java.lang.String A06() {
        if (this.A00 == null) {
            return A00(0, 0, 123);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.A00.keySet()) {
            java.lang.String[] strArr = A02;
            if (strArr[1].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[3] = "zd0VkDByyj8QSiyKJuZO82g8n4nVkMDg";
            java.lang.String str2 = str;
            if (sb.length() > 0) {
                sb.append(A00(0, 1, 60));
            }
            sb.append(str2);
            java.lang.String str3 = this.A00.get(str2);
            if (str3 != null) {
                sb.append(A00(1, 1, 85));
                try {
                    sb.append(java.net.URLEncoder.encode(str3, A00(2, 5, 121)));
                } catch (java.io.UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final java.lang.String put(java.lang.String str, java.lang.String str2) {
        return this.A00.put(str, str2);
    }

    public final byte[] A08() {
        byte[] bytes = null;
        try {
            bytes = A06().getBytes(A00(2, 5, 121));
            return bytes;
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return bytes;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.String> arg) {
        this.A00.putAll(arg);
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.lang.String> values() {
        return this.A00.values();
    }
}
