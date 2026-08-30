package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class l9 implements com.applovin.impl.y7 {
    public static final com.applovin.impl.y7.c d = new com.applovin.impl.y7.c() { // from class: com.applovin.impl.l9$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.y7.c
        public final com.applovin.impl.y7 a(java.util.UUID uuid) {
            return com.applovin.impl.l9.b(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.UUID f983a;
    private final android.media.MediaDrm b;
    private int c;

    private static boolean e() {
        return "ASUS_Z00AD".equals(com.applovin.impl.xp.d);
    }

    @Override // com.applovin.impl.y7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.y7
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.k9 d(byte[] bArr) {
        return new com.applovin.impl.k9(a(this.f983a), bArr, com.applovin.impl.xp.f1515a < 21 && com.applovin.impl.t2.d.equals(this.f983a) && "L3".equals(a("securityLevel")));
    }

    private static byte[] e(byte[] bArr) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr);
        int iM = ahVar.m();
        short sO = ahVar.o();
        short sO2 = ahVar.o();
        if (sO != 1 || sO2 != 1) {
            com.applovin.impl.oc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sO3 = ahVar.o();
        java.nio.charset.Charset charset = com.applovin.exoplayer2.common.base.Charsets.UTF_16LE;
        java.lang.String strA = ahVar.a(sO3, charset);
        if (strA.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strA.indexOf("</DATA>");
        if (iIndexOf == -1) {
            com.applovin.impl.oc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        java.lang.String str = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
        int i = iM + 52;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sO);
        byteBufferAllocate.putShort(sO2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private l9(java.util.UUID uuid) {
        com.applovin.impl.b1.a(uuid);
        com.applovin.impl.b1.a(!com.applovin.impl.t2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f983a = uuid;
        android.media.MediaDrm mediaDrm = new android.media.MediaDrm(a(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (com.applovin.impl.t2.d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    @Override // com.applovin.impl.y7
    public void c(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    public static com.applovin.impl.l9 c(java.util.UUID uuid) throws com.applovin.impl.sp {
        try {
            return new com.applovin.impl.l9(uuid);
        } catch (android.media.UnsupportedSchemeException e) {
            throw new com.applovin.impl.sp(1, e);
        } catch (java.lang.Exception e2) {
            throw new com.applovin.impl.sp(2, e2);
        }
    }

    @Override // com.applovin.impl.y7
    public byte[] d() {
        return this.b.openSession();
    }

    @Override // com.applovin.impl.y7
    public com.applovin.impl.y7.d b() {
        android.media.MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new com.applovin.impl.y7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.y7 b(java.util.UUID uuid) {
        try {
            return c(uuid);
        } catch (com.applovin.impl.sp unused) {
            com.applovin.impl.oc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new com.applovin.impl.f7();
        }
    }

    private static void a(android.media.MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static class a {
        public static boolean a(android.media.MediaDrm mediaDrm, java.lang.String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    @Override // com.applovin.impl.y7
    public java.util.Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.y7
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (com.applovin.impl.t2.c.equals(this.f983a)) {
            bArr2 = com.applovin.impl.i3.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] b(java.util.UUID uuid, byte[] bArr) {
        byte[] bArrA;
        java.util.UUID uuid2 = com.applovin.impl.t2.e;
        if (uuid2.equals(uuid)) {
            byte[] bArrA2 = com.applovin.impl.ji.a(bArr, uuid);
            if (bArrA2 != null) {
                bArr = bArrA2;
            }
            bArr = com.applovin.impl.ji.a(uuid2, e(bArr));
        }
        if (com.applovin.impl.xp.f1515a >= 23 || !com.applovin.impl.t2.d.equals(uuid)) {
            if (uuid2.equals(uuid) && "Amazon".equals(com.applovin.impl.xp.c)) {
                java.lang.String str = com.applovin.impl.xp.d;
                if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                    bArrA = com.applovin.impl.ji.a(bArr, uuid);
                    if (bArrA != null) {
                        return bArrA;
                    }
                }
            }
        } else {
            bArrA = com.applovin.impl.ji.a(bArr, uuid);
            if (bArrA != null) {
                return bArrA;
            }
        }
        return bArr;
    }

    @Override // com.applovin.impl.y7
    public com.applovin.impl.y7.a a(byte[] bArr, java.util.List list, int i, java.util.HashMap map) throws android.media.NotProvisionedException {
        com.applovin.impl.x6.b bVarA;
        byte[] bArrB;
        java.lang.String strA;
        if (list != null) {
            bVarA = a(this.f983a, list);
            bArrB = b(this.f983a, (byte[]) com.applovin.impl.b1.a(bVarA.f));
            strA = a(this.f983a, bVarA.d);
        } else {
            bVarA = null;
            bArrB = null;
            strA = null;
        }
        android.media.MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArrB, strA, i, map);
        byte[] bArrA = a(this.f983a, keyRequest.getData());
        java.lang.String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (android.text.TextUtils.isEmpty(defaultUrl) && bVarA != null && !android.text.TextUtils.isEmpty(bVarA.c)) {
            defaultUrl = bVarA.c;
        }
        return new com.applovin.impl.y7.a(bArrA, defaultUrl, com.applovin.impl.xp.f1515a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    public java.lang.String a(java.lang.String str) {
        return this.b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.y7.b bVar, android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    @Override // com.applovin.impl.y7
    public void a(byte[] bArr) throws android.media.DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.y7
    public synchronized void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.applovin.impl.y7
    public void a(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.y7
    public void a(final com.applovin.impl.y7.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new android.media.MediaDrm.OnEventListener() { // from class: com.applovin.impl.l9$$ExternalSyntheticLambda1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f$0.a(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.y7
    public boolean a(byte[] bArr, java.lang.String str) {
        if (com.applovin.impl.xp.f1515a >= 31) {
            return com.applovin.impl.l9.a.a(this.b, str);
        }
        try {
            android.media.MediaCrypto mediaCrypto = new android.media.MediaCrypto(this.f983a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (android.media.MediaCryptoException unused) {
            return true;
        }
    }

    private static com.applovin.impl.x6.b a(java.util.UUID uuid, java.util.List list) {
        if (!com.applovin.impl.t2.d.equals(uuid)) {
            return (com.applovin.impl.x6.b) list.get(0);
        }
        if (com.applovin.impl.xp.f1515a >= 28 && list.size() > 1) {
            com.applovin.impl.x6.b bVar = (com.applovin.impl.x6.b) list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i < list.size()) {
                    com.applovin.impl.x6.b bVar2 = (com.applovin.impl.x6.b) list.get(i);
                    byte[] bArr = (byte[]) com.applovin.impl.b1.a(bVar2.f);
                    if (!com.applovin.impl.xp.a((java.lang.Object) bVar2.d, (java.lang.Object) bVar.d) || !com.applovin.impl.xp.a((java.lang.Object) bVar2.c, (java.lang.Object) bVar.c) || !com.applovin.impl.ji.a(bArr)) {
                        break;
                    }
                    length += bArr.length;
                    i++;
                } else {
                    byte[] bArr2 = new byte[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        byte[] bArr3 = (byte[]) com.applovin.impl.b1.a(((com.applovin.impl.x6.b) list.get(i3)).f);
                        int length2 = bArr3.length;
                        java.lang.System.arraycopy(bArr3, 0, bArr2, i2, length2);
                        i2 += length2;
                    }
                    return bVar.a(bArr2);
                }
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.applovin.impl.x6.b bVar3 = (com.applovin.impl.x6.b) list.get(i4);
            int iD = com.applovin.impl.ji.d((byte[]) com.applovin.impl.b1.a(bVar3.f));
            int i5 = com.applovin.impl.xp.f1515a;
            if (i5 < 23 && iD == 0) {
                return bVar3;
            }
            if (i5 >= 23 && iD == 1) {
                return bVar3;
            }
        }
        return (com.applovin.impl.x6.b) list.get(0);
    }

    private static java.util.UUID a(java.util.UUID uuid) {
        return (com.applovin.impl.xp.f1515a >= 27 || !com.applovin.impl.t2.c.equals(uuid)) ? uuid : com.applovin.impl.t2.b;
    }

    private static java.lang.String a(java.util.UUID uuid, java.lang.String str) {
        return (com.applovin.impl.xp.f1515a < 26 && com.applovin.impl.t2.c.equals(uuid) && (androidx.media3.common.MimeTypes.VIDEO_MP4.equals(str) || androidx.media3.common.MimeTypes.AUDIO_MP4.equals(str))) ? androidx.media3.common.C.CENC_TYPE_cenc : str;
    }

    private static byte[] a(java.util.UUID uuid, byte[] bArr) {
        return com.applovin.impl.t2.c.equals(uuid) ? com.applovin.impl.i3.a(bArr) : bArr;
    }
}
