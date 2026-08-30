package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ActivityChooserModel extends android.database.DataSetObservable {
    static final java.lang.String ATTRIBUTE_ACTIVITY = "activity";
    static final java.lang.String ATTRIBUTE_TIME = "time";
    static final java.lang.String ATTRIBUTE_WEIGHT = "weight";
    static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final java.lang.String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    static final java.lang.String LOG_TAG = "ActivityChooserModel";
    static final java.lang.String TAG_HISTORICAL_RECORD = "historical-record";
    static final java.lang.String TAG_HISTORICAL_RECORDS = "historical-records";
    private androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
    final android.content.Context mContext;
    final java.lang.String mHistoryFileName;
    private android.content.Intent mIntent;
    private static final java.lang.Object sRegistryLock = new java.lang.Object();
    private static final java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> sDataModelRegistry = new java.util.HashMap();
    private final java.lang.Object mInstanceLock = new java.lang.Object();
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mActivities = new java.util.ArrayList();
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> mHistoricalRecords = new java.util.ArrayList();
    private androidx.appcompat.widget.ActivityChooserModel.ActivitySorter mActivitySorter = new androidx.appcompat.widget.ActivityChooserModel.DefaultSorter();
    private int mHistoryMaxSize = 50;
    boolean mCanReadHistoricalData = true;
    private boolean mReadShareHistoryCalled = false;
    private boolean mHistoricalRecordsChanged = true;
    private boolean mReloadActivities = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel activityChooserModel);
    }

    public interface ActivitySorter {
        void sort(android.content.Intent intent, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list2);
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel activityChooserModel, android.content.Intent intent);
    }

    public static androidx.appcompat.widget.ActivityChooserModel get(android.content.Context context, java.lang.String str) {
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel;
        synchronized (sRegistryLock) {
            java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> map = sDataModelRegistry;
            activityChooserModel = map.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new androidx.appcompat.widget.ActivityChooserModel(context, str);
                map.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    private ActivityChooserModel(android.content.Context context, java.lang.String str) {
        this.mContext = context.getApplicationContext();
        if (!android.text.TextUtils.isEmpty(str) && !str.endsWith(HISTORY_FILE_EXTENSION)) {
            this.mHistoryFileName = str + HISTORY_FILE_EXTENSION;
        } else {
            this.mHistoryFileName = str;
        }
    }

    public void setIntent(android.content.Intent intent) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == intent) {
                return;
            }
            this.mIntent = intent;
            this.mReloadActivities = true;
            ensureConsistentState();
        }
    }

    public android.content.Intent getIntent() {
        android.content.Intent intent;
        synchronized (this.mInstanceLock) {
            intent = this.mIntent;
        }
        return intent;
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mActivities.size();
        }
        return size;
    }

    public android.content.pm.ResolveInfo getActivity(int i) {
        android.content.pm.ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            resolveInfo = this.mActivities.get(i).resolveInfo;
        }
        return resolveInfo;
    }

    public int getActivityIndex(android.content.pm.ResolveInfo resolveInfo) {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list = this.mActivities;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).resolveInfo == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public android.content.Intent chooseActivity(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            ensureConsistentState();
            androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
            android.content.ComponentName componentName = new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
            android.content.Intent intent = new android.content.Intent(this.mIntent);
            intent.setComponent(componentName);
            if (this.mActivityChoserModelPolicy != null) {
                if (this.mActivityChoserModelPolicy.onChooseActivity(this, new android.content.Intent(intent))) {
                    return null;
                }
            }
            addHistoricalRecord(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(componentName, java.lang.System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public void setOnChooseActivityListener(androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.mInstanceLock) {
            this.mActivityChoserModelPolicy = onChooseActivityListener;
        }
    }

    public android.content.pm.ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            if (this.mActivities.isEmpty()) {
                return null;
            }
            return this.mActivities.get(0).resolveInfo;
        }
    }

    public void setDefaultActivity(int i) {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
            androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = this.mActivities.get(0);
            addHistoricalRecord(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), java.lang.System.currentTimeMillis(), activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f));
        }
    }

    private void persistHistoricalDataIfNeeded() {
        if (!this.mReadShareHistoryCalled) {
            throw new java.lang.IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.mHistoricalRecordsChanged) {
            this.mHistoricalRecordsChanged = false;
            if (android.text.TextUtils.isEmpty(this.mHistoryFileName)) {
                return;
            }
            new androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.util.ArrayList(this.mHistoricalRecords), this.mHistoryFileName);
        }
    }

    public void setActivitySorter(androidx.appcompat.widget.ActivityChooserModel.ActivitySorter activitySorter) {
        synchronized (this.mInstanceLock) {
            if (this.mActivitySorter == activitySorter) {
                return;
            }
            this.mActivitySorter = activitySorter;
            if (sortActivitiesIfNeeded()) {
                notifyChanged();
            }
        }
    }

    public void setHistoryMaxSize(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mHistoryMaxSize == i) {
                return;
            }
            this.mHistoryMaxSize = i;
            pruneExcessiveHistoricalRecordsIfNeeded();
            if (sortActivitiesIfNeeded()) {
                notifyChanged();
            }
        }
    }

    public int getHistoryMaxSize() {
        int i;
        synchronized (this.mInstanceLock) {
            i = this.mHistoryMaxSize;
        }
        return i;
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    private void ensureConsistentState() {
        boolean zLoadActivitiesIfNeeded = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (zLoadActivitiesIfNeeded) {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    private boolean sortActivitiesIfNeeded() {
        if (this.mActivitySorter == null || this.mIntent == null || this.mActivities.isEmpty() || this.mHistoricalRecords.isEmpty()) {
            return false;
        }
        this.mActivitySorter.sort(this.mIntent, this.mActivities, java.util.Collections.unmodifiableList(this.mHistoricalRecords));
        return true;
    }

    private boolean loadActivitiesIfNeeded() {
        if (!this.mReloadActivities || this.mIntent == null) {
            return false;
        }
        this.mReloadActivities = false;
        this.mActivities.clear();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.mActivities.add(new androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo(listQueryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean readHistoricalDataIfNeeded() {
        if (!this.mCanReadHistoricalData || !this.mHistoricalRecordsChanged || android.text.TextUtils.isEmpty(this.mHistoryFileName)) {
            return false;
        }
        this.mCanReadHistoricalData = false;
        this.mReadShareHistoryCalled = true;
        readHistoricalDataImpl();
        return true;
    }

    private boolean addHistoricalRecord(androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord) {
        boolean zAdd = this.mHistoricalRecords.add(historicalRecord);
        if (zAdd) {
            this.mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return zAdd;
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        int size = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (size <= 0) {
            return;
        }
        this.mHistoricalRecordsChanged = true;
        for (int i = 0; i < size; i++) {
            this.mHistoricalRecords.remove(0);
        }
    }

    public static final class HistoricalRecord {
        public final android.content.ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(java.lang.String str, long j, float f) {
            this(android.content.ComponentName.unflattenFromString(str), j, f);
        }

        public HistoricalRecord(android.content.ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public int hashCode() {
            android.content.ComponentName componentName = this.activity;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.time;
            return ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.weight);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) obj;
            android.content.ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && java.lang.Float.floatToIntBits(this.weight) == java.lang.Float.floatToIntBits(historicalRecord.weight);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[; activity:");
            sb.append(this.activity);
            sb.append("; time:").append(this.time);
            sb.append("; weight:").append(new java.math.BigDecimal(this.weight));
            sb.append(com.ironsource.y8.i.e);
            return sb.toString();
        }
    }

    public static final class ActivityResolveInfo implements java.lang.Comparable<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> {
        public final android.content.pm.ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(android.content.pm.ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.weight) + 31;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && java.lang.Float.floatToIntBits(this.weight) == java.lang.Float.floatToIntBits(((androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) obj).weight);
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo) {
            return java.lang.Float.floatToIntBits(activityResolveInfo.weight) - java.lang.Float.floatToIntBits(this.weight);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[resolveInfo:");
            sb.append(this.resolveInfo.toString());
            sb.append("; weight:").append(new java.math.BigDecimal(this.weight));
            sb.append(com.ironsource.y8.i.e);
            return sb.toString();
        }
    }

    private static final class DefaultSorter implements androidx.appcompat.widget.ActivityChooserModel.ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap = new java.util.HashMap();

        DefaultSorter() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(android.content.Intent intent, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list2) {
            java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> map = this.mPackageNameToActivityMap;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = list.get(i);
                activityResolveInfo.weight = 0.0f;
                map.put(new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), activityResolveInfo);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = list2.get(size2);
                androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= WEIGHT_DECAY_COEFFICIENT;
                }
            }
            java.util.Collections.sort(list);
        }
    }

    private void readHistoricalDataImpl() {
        try {
            java.io.FileInputStream fileInputStreamOpenFileInput = this.mContext.openFileInput(this.mHistoryFileName);
            try {
                try {
                    try {
                        org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = android.util.Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, com.adjust.sdk.Constants.ENCODING);
                        for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                        }
                        if (!TAG_HISTORICAL_RECORDS.equals(xmlPullParserNewPullParser.getName())) {
                            throw new org.xmlpull.v1.XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list = this.mHistoricalRecords;
                        list.clear();
                        while (true) {
                            int next2 = xmlPullParserNewPullParser.next();
                            if (next2 == 1) {
                                if (fileInputStreamOpenFileInput != null) {
                                    break;
                                } else {
                                    return;
                                }
                            } else if (next2 != 3 && next2 != 4) {
                                if (!TAG_HISTORICAL_RECORD.equals(xmlPullParserNewPullParser.getName())) {
                                    throw new org.xmlpull.v1.XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(xmlPullParserNewPullParser.getAttributeValue(null, ATTRIBUTE_ACTIVITY), java.lang.Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, ATTRIBUTE_TIME)), java.lang.Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, ATTRIBUTE_WEIGHT))));
                            }
                        }
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (java.io.IOException unused) {
                        }
                    } catch (java.io.IOException e) {
                        android.util.Log.e(LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, e);
                        if (fileInputStreamOpenFileInput == null) {
                        }
                    }
                } catch (org.xmlpull.v1.XmlPullParserException e2) {
                    android.util.Log.e(LOG_TAG, "Error reading historical recrod file: " + this.mHistoryFileName, e2);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                }
            } catch (java.lang.Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
        }
    }

    private final class PersistHistoryAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {
        PersistHistoryAsyncTask() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x006f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        public java.lang.Void doInBackground(java.lang.Object... objArr) {
            java.util.List list = (java.util.List) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            try {
                java.io.FileOutputStream fileOutputStreamOpenFileOutput = androidx.appcompat.widget.ActivityChooserModel.this.mContext.openFileOutput(str, 0);
                org.xmlpull.v1.XmlSerializer xmlSerializerNewSerializer = android.util.Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument(com.adjust.sdk.Constants.ENCODING, true);
                    xmlSerializerNewSerializer.startTag(null, androidx.appcompat.widget.ActivityChooserModel.TAG_HISTORICAL_RECORDS);
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, androidx.appcompat.widget.ActivityChooserModel.TAG_HISTORICAL_RECORD);
                        xmlSerializerNewSerializer.attribute(null, androidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_ACTIVITY, historicalRecord.activity.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, androidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_TIME, java.lang.String.valueOf(historicalRecord.time));
                        xmlSerializerNewSerializer.attribute(null, androidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_WEIGHT, java.lang.String.valueOf(historicalRecord.weight));
                        xmlSerializerNewSerializer.endTag(null, androidx.appcompat.widget.ActivityChooserModel.TAG_HISTORICAL_RECORD);
                    }
                    xmlSerializerNewSerializer.endTag(null, androidx.appcompat.widget.ActivityChooserModel.TAG_HISTORICAL_RECORDS);
                    xmlSerializerNewSerializer.endDocument();
                } catch (java.io.IOException e) {
                    android.util.Log.e(androidx.appcompat.widget.ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + androidx.appcompat.widget.ActivityChooserModel.this.mHistoryFileName, e);
                } catch (java.lang.IllegalStateException e2) {
                    android.util.Log.e(androidx.appcompat.widget.ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + androidx.appcompat.widget.ActivityChooserModel.this.mHistoryFileName, e2);
                } catch (java.lang.IllegalArgumentException e3) {
                    android.util.Log.e(androidx.appcompat.widget.ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + androidx.appcompat.widget.ActivityChooserModel.this.mHistoryFileName, e3);
                } finally {
                    androidx.appcompat.widget.ActivityChooserModel.this.mCanReadHistoricalData = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
                return null;
            } catch (java.io.FileNotFoundException e4) {
                android.util.Log.e(androidx.appcompat.widget.ActivityChooserModel.LOG_TAG, "Error writing historical record file: " + str, e4);
                return null;
            }
        }
    }
}
