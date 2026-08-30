package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vj {
    private static com.applovin.impl.sdk.j b;
    private static android.content.SharedPreferences c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f1432a;

    public vj(com.applovin.impl.sdk.j jVar) {
        this.f1432a = com.applovin.impl.sdk.j.m().getSharedPreferences("com.applovin.sdk.preferences." + jVar.a0(), 0);
        b = jVar;
    }

    public void b(com.applovin.impl.uj ujVar, java.lang.Object obj) {
        b(ujVar, obj, this.f1432a);
    }

    public static void b(com.applovin.impl.uj ujVar, java.lang.Object obj, android.content.Context context) {
        a(ujVar.a(), obj, a(context), (android.content.SharedPreferences.Editor) null);
    }

    public void b(com.applovin.impl.uj ujVar, java.lang.Object obj, android.content.SharedPreferences sharedPreferences) {
        a(ujVar.a(), obj, sharedPreferences);
    }

    public void a(android.content.SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public java.lang.Object a(com.applovin.impl.uj ujVar, java.lang.Object obj) {
        return a(ujVar, obj, this.f1432a);
    }

    public void b(com.applovin.impl.uj ujVar) {
        a(this.f1432a.edit().remove(ujVar.a()));
    }

    public static java.lang.Object a(com.applovin.impl.uj ujVar, java.lang.Object obj, android.content.Context context) {
        return a(ujVar.a(), obj, ujVar.b(), a(context));
    }

    public java.lang.Object a(com.applovin.impl.uj ujVar, java.lang.Object obj, android.content.SharedPreferences sharedPreferences) {
        return a(ujVar.a(), obj, ujVar.b(), sharedPreferences);
    }

    public static java.lang.Object a(com.applovin.impl.uj ujVar, java.lang.Object obj, android.content.SharedPreferences sharedPreferences, boolean z) {
        return a(ujVar.a(), obj, ujVar.b(), sharedPreferences, z);
    }

    public static java.lang.Object a(java.lang.String str, java.lang.Object obj, java.lang.Class cls, android.content.SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static java.lang.Object a(java.lang.String str, java.lang.Object obj, java.lang.Class cls, android.content.SharedPreferences sharedPreferences, boolean z) {
        java.lang.Object stringSet;
        long jLongValue;
        int iIntValue;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (java.lang.Boolean.class.equals(cls)) {
                    if (obj != null) {
                        stringSet = java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
                    } else {
                        stringSet = java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                    }
                } else if (java.lang.Float.class.equals(cls)) {
                    if (obj != null) {
                        stringSet = java.lang.Float.valueOf(sharedPreferences.getFloat(str, ((java.lang.Float) obj).floatValue()));
                    } else {
                        stringSet = java.lang.Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                    }
                } else if (java.lang.Integer.class.equals(cls)) {
                    if (obj != null) {
                        if (obj.getClass().equals(java.lang.Long.class)) {
                            iIntValue = ((java.lang.Long) obj).intValue();
                        } else {
                            iIntValue = ((java.lang.Integer) obj).intValue();
                        }
                        stringSet = java.lang.Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                    } else {
                        stringSet = java.lang.Integer.valueOf(sharedPreferences.getInt(str, 0));
                    }
                } else if (java.lang.Long.class.equals(cls)) {
                    if (obj != null) {
                        if (obj.getClass().equals(java.lang.Integer.class)) {
                            jLongValue = ((java.lang.Integer) obj).longValue();
                        } else {
                            jLongValue = ((java.lang.Long) obj).longValue();
                        }
                        stringSet = java.lang.Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                    } else {
                        stringSet = java.lang.Long.valueOf(sharedPreferences.getLong(str, 0L));
                    }
                } else if (java.lang.Double.class.equals(cls)) {
                    if (obj != null) {
                        stringSet = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(sharedPreferences.getLong(str, java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()))));
                    } else {
                        stringSet = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                    }
                } else if (java.lang.String.class.equals(cls)) {
                    stringSet = sharedPreferences.getString(str, (java.lang.String) obj);
                } else {
                    stringSet = java.util.Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (java.util.Set) obj) : obj;
                }
                if (stringSet != null) {
                    java.lang.Object objCast = cls.cast(stringSet);
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return objCast;
                }
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return obj;
        } catch (java.lang.Throwable th) {
            if (z) {
                try {
                    com.applovin.impl.sdk.n.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public java.lang.Object a(com.applovin.impl.uj ujVar) {
        java.lang.Object objA = a(ujVar, null);
        b(ujVar);
        return objA;
    }

    public void a(java.lang.String str, java.lang.Object obj, android.content.SharedPreferences.Editor editor) {
        a(str, obj, (android.content.SharedPreferences) null, editor);
    }

    public void a(java.lang.String str, java.lang.Object obj, android.content.SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (android.content.SharedPreferences.Editor) null);
    }

    public static void a(java.lang.String str, java.lang.Object obj, android.content.SharedPreferences sharedPreferences, android.content.SharedPreferences.Editor editor) {
        boolean z = editor != null;
        if (!z) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof java.lang.Boolean) {
                editor.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Float) {
                editor.putFloat(str, ((java.lang.Float) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                editor.putInt(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                editor.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                editor.putLong(str, java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
            } else if (obj instanceof java.lang.String) {
                editor.putString(str, (java.lang.String) obj);
            } else if (obj instanceof java.util.Set) {
                editor.putStringSet(str, (java.util.Set) obj);
            } else {
                com.applovin.impl.sdk.n.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z) {
            return;
        }
        a(editor);
    }

    private static void a(final android.content.SharedPreferences.Editor editor) {
        try {
            if (com.applovin.impl.yp.h()) {
                com.applovin.impl.sdk.j jVar = b;
                if (jVar != null && jVar.i0() != null) {
                    com.applovin.impl.tm tmVarI0 = b.i0();
                    com.applovin.impl.sdk.j jVar2 = b;
                    java.util.Objects.requireNonNull(editor);
                    tmVarI0.a((com.applovin.impl.yl) new com.applovin.impl.jn(jVar2, true, "commitSharedPreferencesChanges", new java.lang.Runnable() { // from class: com.applovin.impl.vj$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            editor.commit();
                        }
                    }), com.applovin.impl.tm.b.OTHER);
                } else {
                    editor.apply();
                }
            } else {
                editor.commit();
            }
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static android.content.SharedPreferences a(android.content.Context context) {
        if (c == null) {
            c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return c;
    }
}
