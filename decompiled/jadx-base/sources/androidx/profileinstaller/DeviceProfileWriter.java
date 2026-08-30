package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceProfileWriter {
    private final java.lang.String mApkName;
    private final android.content.res.AssetManager mAssetManager;
    private final java.io.File mCurProfile;
    private final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback mDiagnostics;
    private final java.util.concurrent.Executor mExecutor;
    private androidx.profileinstaller.DexProfileData[] mProfile;
    private final java.lang.String mProfileMetaSourceLocation;
    private final java.lang.String mProfileSourceLocation;
    private byte[] mTranscodedProfile;
    private boolean mDeviceSupportsAotProfile = false;
    private final byte[] mDesiredVersion = desiredVersion();

    private void result(final int i, final java.lang.Object obj) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.DeviceProfileWriter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m464lambda$result$0$androidxprofileinstallerDeviceProfileWriter(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$result$0$androidx-profileinstaller-DeviceProfileWriter, reason: not valid java name */
    /* synthetic */ void m464lambda$result$0$androidxprofileinstallerDeviceProfileWriter(int i, java.lang.Object obj) {
        this.mDiagnostics.onResultReceived(i, obj);
    }

    public DeviceProfileWriter(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = str;
        this.mProfileSourceLocation = str2;
        this.mProfileMetaSourceLocation = str3;
        this.mCurProfile = file;
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion == null) {
            result(3, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.mCurProfile.canWrite()) {
            result(4, null);
            return false;
        }
        this.mDeviceSupportsAotProfile = true;
        return true;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (!this.mDeviceSupportsAotProfile) {
            throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public androidx.profileinstaller.DeviceProfileWriter read() {
        androidx.profileinstaller.DeviceProfileWriter deviceProfileWriterAddMetadata;
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        java.io.InputStream profileInputStream = getProfileInputStream(this.mAssetManager);
        if (profileInputStream != null) {
            this.mProfile = readProfileInternal(profileInputStream);
        }
        androidx.profileinstaller.DexProfileData[] dexProfileDataArr = this.mProfile;
        return (dexProfileDataArr == null || !requiresMetadata() || (deviceProfileWriterAddMetadata = addMetadata(dexProfileDataArr, this.mDesiredVersion)) == null) ? this : deviceProfileWriterAddMetadata;
    }

    private java.io.InputStream openStreamFromAssets(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e) {
            java.lang.String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.mDiagnostics.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    private java.io.InputStream getProfileInputStream(android.content.res.AssetManager assetManager) {
        try {
            return openStreamFromAssets(assetManager, this.mProfileSourceLocation);
        } catch (java.io.FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(6, e);
            return null;
        } catch (java.io.IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
            return null;
        }
    }

    private androidx.profileinstaller.DexProfileData[] readProfileInternal(java.io.InputStream inputStream) {
        try {
            try {
                try {
                    androidx.profileinstaller.DexProfileData[] profile = androidx.profileinstaller.ProfileTranscoder.readProfile(inputStream, androidx.profileinstaller.ProfileTranscoder.readHeader(inputStream, androidx.profileinstaller.ProfileTranscoder.MAGIC_PROF), this.mApkName);
                    try {
                        inputStream.close();
                        return profile;
                    } catch (java.io.IOException e) {
                        this.mDiagnostics.onResultReceived(7, e);
                        return profile;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e2) {
                        this.mDiagnostics.onResultReceived(7, e2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e3) {
                this.mDiagnostics.onResultReceived(7, e3);
                inputStream.close();
                return null;
            } catch (java.lang.IllegalStateException e4) {
                this.mDiagnostics.onResultReceived(8, e4);
                inputStream.close();
                return null;
            }
        } catch (java.io.IOException e5) {
            this.mDiagnostics.onResultReceived(7, e5);
        }
    }

    private androidx.profileinstaller.DeviceProfileWriter addMetadata(androidx.profileinstaller.DexProfileData[] dexProfileDataArr, byte[] bArr) {
        try {
            java.io.InputStream inputStreamOpenStreamFromAssets = openStreamFromAssets(this.mAssetManager, this.mProfileMetaSourceLocation);
            if (inputStreamOpenStreamFromAssets == null) {
                if (inputStreamOpenStreamFromAssets != null) {
                    inputStreamOpenStreamFromAssets.close();
                }
                return null;
            }
            try {
                this.mProfile = androidx.profileinstaller.ProfileTranscoder.readMeta(inputStreamOpenStreamFromAssets, androidx.profileinstaller.ProfileTranscoder.readHeader(inputStreamOpenStreamFromAssets, androidx.profileinstaller.ProfileTranscoder.MAGIC_PROFM), bArr, dexProfileDataArr);
                if (inputStreamOpenStreamFromAssets != null) {
                    inputStreamOpenStreamFromAssets.close();
                }
                return this;
            } catch (java.lang.Throwable th) {
                if (inputStreamOpenStreamFromAssets != null) {
                    try {
                        inputStreamOpenStreamFromAssets.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(9, e);
        } catch (java.io.IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
        } catch (java.lang.IllegalStateException e3) {
            this.mProfile = null;
            this.mDiagnostics.onResultReceived(8, e3);
        }
    }

    public androidx.profileinstaller.DeviceProfileWriter transcodeIfNeeded() {
        androidx.profileinstaller.DexProfileData[] dexProfileDataArr = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (dexProfileDataArr != null && bArr != null) {
            assertDeviceAllowsProfileInstallerAotWritesCalled();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    androidx.profileinstaller.ProfileTranscoder.writeHeader(byteArrayOutputStream, bArr);
                    if (!androidx.profileinstaller.ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                        this.mDiagnostics.onResultReceived(5, null);
                        this.mProfile = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.mProfile = null;
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                this.mDiagnostics.onResultReceived(7, e);
            } catch (java.lang.IllegalStateException e2) {
                this.mDiagnostics.onResultReceived(8, e2);
            }
        }
        return this;
    }

    public boolean write() {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return false;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.mCurProfile);
                    try {
                        androidx.profileinstaller.Encoding.writeAll(byteArrayInputStream, fileOutputStream);
                        result(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.mTranscodedProfile = null;
                        this.mProfile = null;
                        return true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th5) {
                this.mTranscodedProfile = null;
                this.mProfile = null;
                throw th5;
            }
        } catch (java.io.FileNotFoundException e) {
            result(6, e);
            this.mTranscodedProfile = null;
            this.mProfile = null;
            return false;
        } catch (java.io.IOException e2) {
            result(7, e2);
            this.mTranscodedProfile = null;
            this.mProfile = null;
            return false;
        }
    }

    private static byte[] desiredVersion() {
        if (android.os.Build.VERSION.SDK_INT > 33) {
            return null;
        }
        switch (android.os.Build.VERSION.SDK_INT) {
            case 24:
            case 25:
                return androidx.profileinstaller.ProfileVersion.V001_N;
            case 26:
                return androidx.profileinstaller.ProfileVersion.V005_O;
            case 27:
                return androidx.profileinstaller.ProfileVersion.V009_O_MR1;
            case 28:
            case 29:
            case 30:
                return androidx.profileinstaller.ProfileVersion.V010_P;
            case 31:
            case 32:
            case 33:
                return androidx.profileinstaller.ProfileVersion.V015_S;
            default:
                return null;
        }
    }

    private static boolean requiresMetadata() {
        if (android.os.Build.VERSION.SDK_INT > 33) {
            return false;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
