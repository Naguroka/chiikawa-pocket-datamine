package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";
    private int mResourceId;
    private androidx.core.content.FileProvider.PathStrategy mStrategy;
    private static final java.lang.String[] COLUMNS = {"_display_name", "_size"};
    private static final java.io.File DEVICE_ROOT = new java.io.File("/");
    private static final java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> sCache = new java.util.HashMap<>();

    interface PathStrategy {
        java.io.File getFileForUri(android.net.Uri uri);

        android.net.Uri getUriForFile(java.io.File file);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public FileProvider() {
        this.mResourceId = 0;
    }

    protected FileProvider(int i) {
        this.mResourceId = i;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grant uri permissions");
        }
        java.lang.String str = providerInfo.authority.split(";")[0];
        java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
        this.mStrategy = getPathStrategy(context, str, this.mResourceId);
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file) {
        return getPathStrategy(context, str, 0).getUriForFile(file);
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file, java.lang.String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        java.io.File fileForUri = this.mStrategy.getFileForUri(uri);
        java.lang.String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        java.lang.Object[] objArr = new java.lang.Object[strArr.length];
        int i2 = 0;
        for (java.lang.String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileForUri.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = java.lang.Long.valueOf(fileForUri.length());
                }
            }
            i2 = i;
        }
        java.lang.String[] strArrCopyOf = copyOf(strArr3, i2);
        java.lang.Object[] objArrCopyOf = copyOf(objArr, i2);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        java.io.File fileForUri = this.mStrategy.getFileForUri(uri);
        int iLastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return this.mStrategy.getFileForUri(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return android.os.ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(str));
    }

    private static androidx.core.content.FileProvider.PathStrategy getPathStrategy(android.content.Context context, java.lang.String str, int i) {
        androidx.core.content.FileProvider.PathStrategy pathStrategy;
        java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> map = sCache;
        synchronized (map) {
            pathStrategy = map.get(str);
            if (pathStrategy == null) {
                try {
                    try {
                        pathStrategy = parsePathStrategy(context, str, i);
                        map.put(str, pathStrategy);
                    } catch (org.xmlpull.v1.XmlPullParserException e) {
                        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (java.io.IOException e2) {
                    throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return pathStrategy;
    }

    static android.content.res.XmlResourceParser getFileProviderPathsMetaData(android.content.Context context, java.lang.String str, android.content.pm.ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new java.lang.IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i != 0) {
            providerInfo.metaData = new android.os.Bundle(1);
            providerInfo.metaData.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        android.content.res.XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new java.lang.IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static androidx.core.content.FileProvider.PathStrategy parsePathStrategy(android.content.Context context, java.lang.String str, int i) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.core.content.FileProvider.SimplePathStrategy simplePathStrategy = new androidx.core.content.FileProvider.SimplePathStrategy(str);
        android.content.res.XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                java.lang.String name = fileProviderPathsMetaData.getName();
                java.io.File externalStorageDirectory = null;
                java.lang.String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                java.lang.String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    java.io.File[] externalFilesDirs = androidx.core.content.ContextCompat.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    java.io.File[] externalCacheDirs = androidx.core.content.ContextCompat.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    java.io.File[] externalMediaDirs = androidx.core.content.FileProvider.Api21Impl.getExternalMediaDirs(context);
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    simplePathStrategy.addRoot(attributeValue, buildPath(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    static class SimplePathStrategy implements androidx.core.content.FileProvider.PathStrategy {
        private final java.lang.String mAuthority;
        private final java.util.HashMap<java.lang.String, java.io.File> mRoots = new java.util.HashMap<>();

        SimplePathStrategy(java.lang.String str) {
            this.mAuthority = str;
        }

        void addRoot(java.lang.String str, java.io.File file) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("Name must not be empty");
            }
            try {
                this.mRoots.put(str, file.getCanonicalFile());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public android.net.Uri getUriForFile(java.io.File file) {
            java.lang.String strSubstring;
            try {
                java.lang.String canonicalPath = file.getCanonicalPath();
                java.util.Map.Entry<java.lang.String, java.io.File> entry = null;
                for (java.util.Map.Entry<java.lang.String, java.io.File> entry2 : this.mRoots.entrySet()) {
                    java.lang.String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new java.lang.IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                java.lang.String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    strSubstring = canonicalPath.substring(path2.length());
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                }
                return new android.net.Uri.Builder().scheme("content").authority(this.mAuthority).encodedPath(android.net.Uri.encode(entry.getKey()) + '/' + android.net.Uri.encode(strSubstring, "/")).build();
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public java.io.File getFileForUri(android.net.Uri uri) {
            java.lang.String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            java.lang.String strDecode = android.net.Uri.decode(encodedPath.substring(1, iIndexOf));
            java.lang.String strDecode2 = android.net.Uri.decode(encodedPath.substring(iIndexOf + 1));
            java.io.File file = this.mRoots.get(strDecode);
            if (file == null) {
                throw new java.lang.IllegalArgumentException("Unable to find configured root for " + uri);
            }
            java.io.File file2 = new java.io.File(file, strDecode2);
            try {
                java.io.File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new java.lang.SecurityException("Resolved path jumped beyond configured root");
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    private static int modeToMode(java.lang.String str) {
        if (com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new java.lang.IllegalArgumentException("Invalid mode: " + str);
    }

    private static java.io.File buildPath(java.io.File file, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (str != null) {
                file = new java.io.File(file, str);
            }
        }
        return file;
    }

    private static java.lang.String[] copyOf(java.lang.String[] strArr, int i) {
        java.lang.String[] strArr2 = new java.lang.String[i];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.io.File[] getExternalMediaDirs(android.content.Context context) {
            return context.getExternalMediaDirs();
        }
    }
}
