package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
class PreferenceInflater {
    private static final java.lang.String EXTRA_TAG_NAME = "extra";
    private static final java.lang.String INTENT_TAG_NAME = "intent";
    private final java.lang.Object[] mConstructorArgs = new java.lang.Object[2];
    private final android.content.Context mContext;
    private java.lang.String[] mDefaultPackages;
    private androidx.preference.PreferenceManager mPreferenceManager;
    private static final java.lang.Class<?>[] CONSTRUCTOR_SIGNATURE = {android.content.Context.class, android.util.AttributeSet.class};
    private static final java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> CONSTRUCTOR_MAP = new java.util.HashMap<>();

    public PreferenceInflater(android.content.Context context, androidx.preference.PreferenceManager preferenceManager) {
        this.mContext = context;
        init(preferenceManager);
    }

    private void init(androidx.preference.PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        setDefaultPackages(new java.lang.String[]{androidx.preference.Preference.class.getPackage().getName() + ".", androidx.preference.SwitchPreference.class.getPackage().getName() + "."});
    }

    public void setDefaultPackages(java.lang.String[] strArr) {
        this.mDefaultPackages = strArr;
    }

    public java.lang.String[] getDefaultPackages() {
        return this.mDefaultPackages;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public androidx.preference.Preference inflate(int i, androidx.preference.PreferenceGroup preferenceGroup) {
        android.content.res.XmlResourceParser xml = getContext().getResources().getXml(i);
        try {
            return inflate(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public androidx.preference.Preference inflate(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.PreferenceGroup preferenceGroup) {
        int next;
        androidx.preference.PreferenceGroup preferenceGroupOnMergeRoots;
        synchronized (this.mConstructorArgs) {
            android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
            this.mConstructorArgs[0] = this.mContext;
            do {
                try {
                    try {
                        next = xmlPullParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (org.xmlpull.v1.XmlPullParserException e) {
                        android.view.InflateException inflateException = new android.view.InflateException(e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    }
                } catch (android.view.InflateException e2) {
                    throw e2;
                } catch (java.io.IOException e3) {
                    android.view.InflateException inflateException2 = new android.view.InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupOnMergeRoots = onMergeRoots(preferenceGroup, (androidx.preference.PreferenceGroup) createItemFromTag(xmlPullParser.getName(), attributeSetAsAttributeSet));
            rInflate(xmlPullParser, preferenceGroupOnMergeRoots, attributeSetAsAttributeSet);
        }
        return preferenceGroupOnMergeRoots;
    }

    private androidx.preference.PreferenceGroup onMergeRoots(androidx.preference.PreferenceGroup preferenceGroup, androidx.preference.PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.onAttachedToHierarchy(this.mPreferenceManager);
        return preferenceGroup2;
    }

    private androidx.preference.Preference createItem(java.lang.String str, java.lang.String[] strArr, android.util.AttributeSet attributeSet) throws android.view.InflateException, java.lang.ClassNotFoundException {
        java.lang.Class<?> cls;
        java.lang.reflect.Constructor<?> constructor = CONSTRUCTOR_MAP.get(str);
        if (constructor == null) {
            try {
                try {
                    java.lang.ClassLoader classLoader = this.mContext.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = java.lang.Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        java.lang.ClassNotFoundException e = null;
                        for (java.lang.String str2 : strArr) {
                            try {
                                cls = java.lang.Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (java.lang.ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                    }
                    constructor = cls.getConstructor(CONSTRUCTOR_SIGNATURE);
                    constructor.setAccessible(true);
                    CONSTRUCTOR_MAP.put(str, constructor);
                } catch (java.lang.Exception e3) {
                    android.view.InflateException inflateException = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (java.lang.ClassNotFoundException e4) {
                throw e4;
            }
        }
        java.lang.Object[] objArr = this.mConstructorArgs;
        objArr[1] = attributeSet;
        return (androidx.preference.Preference) constructor.newInstance(objArr);
    }

    protected androidx.preference.Preference onCreateItem(java.lang.String str, android.util.AttributeSet attributeSet) throws java.lang.ClassNotFoundException {
        return createItem(str, this.mDefaultPackages, attributeSet);
    }

    private androidx.preference.Preference createItemFromTag(java.lang.String str, android.util.AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return onCreateItem(str, attributeSet);
            }
            return createItem(str, null, attributeSet);
        } catch (android.view.InflateException e) {
            throw e;
        } catch (java.lang.ClassNotFoundException e2) {
            android.view.InflateException inflateException = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (java.lang.Exception e3) {
            android.view.InflateException inflateException2 = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    private void rInflate(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.Preference preference, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (INTENT_TAG_NAME.equals(name)) {
                    try {
                        preference.setIntent(android.content.Intent.parseIntent(getContext().getResources(), xmlPullParser, attributeSet));
                    } catch (java.io.IOException e) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if (EXTRA_TAG_NAME.equals(name)) {
                    getContext().getResources().parseBundleExtra(EXTRA_TAG_NAME, attributeSet, preference.getExtras());
                    try {
                        skipCurrentTag(xmlPullParser);
                    } catch (java.io.IOException e2) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException2 = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    androidx.preference.Preference preferenceCreateItemFromTag = createItemFromTag(name, attributeSet);
                    ((androidx.preference.PreferenceGroup) preference).addItemFromInflater(preferenceCreateItemFromTag);
                    rInflate(xmlPullParser, preferenceCreateItemFromTag, attributeSet);
                }
            }
        }
    }

    private static void skipCurrentTag(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}
