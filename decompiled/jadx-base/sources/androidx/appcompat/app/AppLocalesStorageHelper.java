package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final java.lang.String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0042 A[EXC_TOP_SPLITTER, PHI: r2
  0x0042: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:24:0x004d, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    static java.lang.String readLocales(android.content.Context context) {
        java.lang.String attributeValue = "";
        try {
            java.io.FileInputStream fileInputStreamOpenFileInput = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);
            try {
                try {
                    org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = android.util.Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, com.adjust.sdk.Constants.ENCODING);
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals(LOCALE_RECORD_FILE_TAG)) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, LOCALE_RECORD_ATTRIBUTE_TAG);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused2) {
                    android.util.Log.w(TAG, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
                if (!attributeValue.isEmpty()) {
                    android.util.Log.d(TAG, "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + attributeValue);
                } else {
                    context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
                }
                return attributeValue;
            } catch (java.lang.Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused4) {
            android.util.Log.w(TAG, "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    static void persistLocales(android.content.Context context, java.lang.String str) {
        if (str.equals("")) {
            context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
            return;
        }
        try {
            java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);
            org.xmlpull.v1.XmlSerializer xmlSerializerNewSerializer = android.util.Xml.newSerializer();
            try {
                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                xmlSerializerNewSerializer.startDocument(com.adjust.sdk.Constants.ENCODING, true);
                xmlSerializerNewSerializer.startTag(null, LOCALE_RECORD_FILE_TAG);
                xmlSerializerNewSerializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, str);
                xmlSerializerNewSerializer.endTag(null, LOCALE_RECORD_FILE_TAG);
                xmlSerializerNewSerializer.endDocument();
                android.util.Log.d(TAG, "Storing App Locales : app-locales: " + str + " persisted successfully.");
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Storing App Locales : Failed to persist app-locales: " + str, e);
            } finally {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        } catch (java.io.FileNotFoundException unused2) {
            android.util.Log.w(TAG, java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", APPLICATION_LOCALES_RECORD_FILE));
        }
    }

    static void syncLocalesToFramework(android.content.Context context) {
        android.content.ComponentName componentName = new android.content.ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
        if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
            androidx.appcompat.app.AppCompatDelegate.setAppContext(context);
            if (androidx.appcompat.app.AppCompatDelegate.getApplicationLocales().isEmpty()) {
                androidx.appcompat.app.AppCompatDelegate.setApplicationLocales(androidx.core.os.LocaleListCompat.forLanguageTags(readLocales(context)));
            }
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    }

    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock = new java.lang.Object();
        final java.util.Queue<java.lang.Runnable> mTasks = new java.util.ArrayDeque();

        SerialExecutor(java.util.concurrent.Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final java.lang.Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m6xd188c474(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-appcompat-app-AppLocalesStorageHelper$SerialExecutor, reason: not valid java name */
        /* synthetic */ void m6xd188c474(java.lang.Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                java.lang.Runnable runnablePoll = this.mTasks.poll();
                this.mActive = runnablePoll;
                if (runnablePoll != null) {
                    this.mExecutor.execute(runnablePoll);
                }
            }
        }
    }
}
