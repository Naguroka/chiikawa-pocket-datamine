package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkMediaDrm implements androidx.media3.exoplayer.drm.ExoMediaDrm {
    private static final java.lang.String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final androidx.media3.exoplayer.drm.ExoMediaDrm.Provider DEFAULT_PROVIDER = new androidx.media3.exoplayer.drm.ExoMediaDrm.Provider() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1
        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
        public final androidx.media3.exoplayer.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID uuid) {
            return androidx.media3.exoplayer.drm.FrameworkMediaDrm.lambda$static$0(uuid);
        }
    };
    private static final java.lang.String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final java.lang.String MOCK_LA_URL_VALUE = "https://x";
    private static final java.lang.String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final android.media.MediaDrm mediaDrm;
    private int referenceCount;
    private final java.util.UUID uuid;

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 2;
    }

    static /* synthetic */ androidx.media3.exoplayer.drm.ExoMediaDrm lambda$static$0(java.util.UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (androidx.media3.exoplayer.drm.UnsupportedDrmException unused) {
            androidx.media3.common.util.Log.e(TAG, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new androidx.media3.exoplayer.drm.DummyExoMediaDrm();
        }
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID uuid) {
        return android.media.MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    public static androidx.media3.exoplayer.drm.FrameworkMediaDrm newInstance(java.util.UUID uuid) throws androidx.media3.exoplayer.drm.UnsupportedDrmException {
        try {
            return new androidx.media3.exoplayer.drm.FrameworkMediaDrm(uuid);
        } catch (android.media.UnsupportedSchemeException e) {
            throw new androidx.media3.exoplayer.drm.UnsupportedDrmException(1, e);
        } catch (java.lang.Exception e2) {
            throw new androidx.media3.exoplayer.drm.UnsupportedDrmException(2, e2);
        }
    }

    private FrameworkMediaDrm(java.util.UUID uuid) throws android.media.UnsupportedSchemeException {
        androidx.media3.common.util.Assertions.checkNotNull(uuid);
        androidx.media3.common.util.Assertions.checkArgument(!androidx.media3.common.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        android.media.MediaDrm mediaDrm = new android.media.MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (androidx.media3.common.C.WIDEVINE_UUID.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new android.media.MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f$0.m160x5e84e274(onEventListener, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnEventListener$1$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m160x5e84e274(androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener, android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new android.media.MediaDrm.OnKeyStatusChangeListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
                this.f$0.m162xc78bb65c(onKeyStatusChangeListener, mediaDrm, bArr, list, z);
            }
        }, (android.os.Handler) null);
    }

    /* JADX INFO: renamed from: lambda$setOnKeyStatusChangeListener$2$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m162xc78bb65c(androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.MediaDrm.KeyStatus keyStatus = (android.media.MediaDrm.KeyStatus) it.next();
            arrayList.add(new androidx.media3.exoplayer.drm.ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener == null ? null : new android.media.MediaDrm.OnExpirationUpdateListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
                this.f$0.m161x3bcdcffc(onExpirationUpdateListener, mediaDrm, bArr, j);
            }
        }, (android.os.Handler) null);
    }

    /* JADX INFO: renamed from: lambda$setOnExpirationUpdateListener$3$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m161x3bcdcffc(androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPlayerIdForSession(byte[] bArr, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            try {
                androidx.media3.exoplayer.drm.FrameworkMediaDrm.Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
            } catch (java.lang.UnsupportedOperationException unused) {
                androidx.media3.common.util.Log.w(TAG, "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i, java.util.HashMap<java.lang.String, java.lang.String> map) throws android.media.NotProvisionedException {
        androidx.media3.common.DrmInitData.SchemeData schemeData;
        byte[] bArrAdjustRequestInitData;
        java.lang.String strAdjustRequestMimeType;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            bArrAdjustRequestInitData = adjustRequestInitData(this.uuid, (byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData.data));
            strAdjustRequestMimeType = adjustRequestMimeType(this.uuid, schemeData.mimeType);
        } else {
            schemeData = null;
            bArrAdjustRequestInitData = null;
            strAdjustRequestMimeType = null;
        }
        android.media.MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArrAdjustRequestInitData, strAdjustRequestMimeType, i, map);
        byte[] bArrAdjustRequestData = adjustRequestData(this.uuid, keyRequest.getData());
        java.lang.String strAdjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (android.text.TextUtils.isEmpty(strAdjustLicenseServerUrl) && schemeData != null && !android.text.TextUtils.isEmpty(schemeData.licenseServerUrl)) {
            strAdjustLicenseServerUrl = schemeData.licenseServerUrl;
        }
        return new androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest(bArrAdjustRequestData, strAdjustLicenseServerUrl, androidx.media3.common.util.Util.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    private java.lang.String adjustLicenseServerUrl(java.lang.String str) {
        if (MOCK_LA_URL.equals(str)) {
            return "";
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 33 && "https://default.url".equals(str)) {
            java.lang.String propertyString = getPropertyString("version");
            if (java.util.Objects.equals(propertyString, "1.2") || java.util.Objects.equals(propertyString, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws android.media.DeniedByServerException, android.media.NotProvisionedException {
        if (androidx.media3.common.C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = androidx.media3.exoplayer.drm.ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        android.media.MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) throws android.media.DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, java.lang.String str) throws java.lang.Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            zRequiresSecureDecoderComponent = androidx.media3.exoplayer.drm.FrameworkMediaDrm.Api31.requiresSecureDecoder(this.mediaDrm, str);
        } else {
            android.media.MediaCrypto mediaCrypto = null;
            try {
                android.media.MediaCrypto mediaCrypto2 = new android.media.MediaCrypto(this.uuid, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (android.media.MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    zRequiresSecureDecoderComponent = true;
                } catch (java.lang.Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (android.media.MediaCryptoException unused2) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        return zRequiresSecureDecoderComponent && !shouldForceAllowInsecureDecoderComponents();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void acquire() {
        androidx.media3.common.util.Assertions.checkState(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            this.mediaDrm.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void removeOfflineLicense(byte[] bArr) {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.removeOfflineLicense(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.util.List<byte[]> getOfflineLicenseKeySetIds() {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException();
        }
        return this.mediaDrm.getOfflineLicenseKeySetIds();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public android.os.PersistableBundle getMetrics() {
        if (androidx.media3.common.util.Util.SDK_INT < 28) {
            return null;
        }
        return this.mediaDrm.getMetrics();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String str, java.lang.String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.FrameworkCryptoConfig createCryptoConfig(byte[] bArr) throws android.media.MediaCryptoException {
        return new androidx.media3.exoplayer.drm.FrameworkCryptoConfig(adjustUuid(this.uuid), bArr, shouldForceAllowInsecureDecoderComponents());
    }

    private boolean shouldForceAllowInsecureDecoderComponents() {
        return androidx.media3.common.util.Util.SDK_INT < 21 && androidx.media3.common.C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel"));
    }

    private static androidx.media3.common.DrmInitData.SchemeData getSchemeData(java.util.UUID uuid, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        boolean z;
        if (!androidx.media3.common.C.WIDEVINE_UUID.equals(uuid)) {
            return list.get(0);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 28 && list.size() > 1) {
            androidx.media3.common.DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                androidx.media3.common.DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData2.data);
                if (!androidx.media3.common.util.Util.areEqual(schemeData2.mimeType, schemeData.mimeType) || !androidx.media3.common.util.Util.areEqual(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) || !androidx.media3.extractor.mp4.PsshAtomUtil.isPsshAtom(bArr)) {
                    z = false;
                    break;
                }
                length += bArr.length;
                i++;
            }
            if (z) {
                byte[] bArr2 = new byte[length];
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    byte[] bArr3 = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(list.get(i3).data);
                    int length2 = bArr3.length;
                    java.lang.System.arraycopy(bArr3, 0, bArr2, i2, length2);
                    i2 += length2;
                }
                return schemeData.copyWithData(bArr2);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            androidx.media3.common.DrmInitData.SchemeData schemeData3 = list.get(i4);
            int version = androidx.media3.extractor.mp4.PsshAtomUtil.parseVersion((byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData3.data));
            if (androidx.media3.common.util.Util.SDK_INT < 23 && version == 0) {
                return schemeData3;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 23 && version == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    private static java.util.UUID adjustUuid(java.util.UUID uuid) {
        return (androidx.media3.common.util.Util.SDK_INT >= 27 || !androidx.media3.common.C.CLEARKEY_UUID.equals(uuid)) ? uuid : androidx.media3.common.C.COMMON_PSSH_UUID;
    }

    private static byte[] adjustRequestInitData(java.util.UUID uuid, byte[] bArr) {
        byte[] schemeSpecificData;
        if (androidx.media3.common.C.PLAYREADY_UUID.equals(uuid)) {
            byte[] schemeSpecificData2 = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid);
            if (schemeSpecificData2 != null) {
                bArr = schemeSpecificData2;
            }
            bArr = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(androidx.media3.common.C.PLAYREADY_UUID, addLaUrlAttributeIfMissing(bArr));
        }
        return (((androidx.media3.common.util.Util.SDK_INT >= 23 || !androidx.media3.common.C.WIDEVINE_UUID.equals(uuid)) && !(androidx.media3.common.C.PLAYREADY_UUID.equals(uuid) && "Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && ("AFTB".equals(androidx.media3.common.util.Util.MODEL) || "AFTS".equals(androidx.media3.common.util.Util.MODEL) || "AFTM".equals(androidx.media3.common.util.Util.MODEL) || "AFTT".equals(androidx.media3.common.util.Util.MODEL)))) || (schemeSpecificData = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid)) == null) ? bArr : schemeSpecificData;
    }

    private static java.lang.String adjustRequestMimeType(java.util.UUID uuid, java.lang.String str) {
        return (androidx.media3.common.util.Util.SDK_INT < 26 && androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) && (androidx.media3.common.MimeTypes.VIDEO_MP4.equals(str) || androidx.media3.common.MimeTypes.AUDIO_MP4.equals(str))) ? "cenc" : str;
    }

    private static byte[] adjustRequestData(java.util.UUID uuid, byte[] bArr) {
        return androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) ? androidx.media3.exoplayer.drm.ClearKeyUtil.adjustRequestData(bArr) : bArr;
    }

    private static void forceWidevineL3(android.media.MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(androidx.media3.common.util.Util.MODEL);
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        short littleEndianShort = parsableByteArray.readLittleEndianShort();
        short littleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (littleEndianShort != 1 || littleEndianShort2 != 1) {
            androidx.media3.common.util.Log.i(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        java.lang.String string = parsableByteArray.readString(parsableByteArray.readLittleEndianShort(), com.google.common.base.Charsets.UTF_16LE);
        if (string.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = string.indexOf("</DATA>");
        if (iIndexOf == -1) {
            androidx.media3.common.util.Log.w(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        java.lang.String str = string.substring(0, iIndexOf) + MOCK_LA_URL + string.substring(iIndexOf);
        int i = littleEndianInt + 52;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(littleEndianShort);
        byteBufferAllocate.putShort(littleEndianShort2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(com.google.common.base.Charsets.UTF_16LE));
        return byteBufferAllocate.array();
    }

    private static class Api31 {
        private Api31() {
        }

        public static boolean requiresSecureDecoder(android.media.MediaDrm mediaDrm, java.lang.String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void setLogSessionIdOnMediaDrmSession(android.media.MediaDrm mediaDrm, byte[] bArr, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((android.media.MediaDrm.PlaybackComponent) androidx.media3.common.util.Assertions.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }
}
