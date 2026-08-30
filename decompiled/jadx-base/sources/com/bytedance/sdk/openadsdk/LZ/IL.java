package com.bytedance.sdk.openadsdk.LZ;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private final android.content.Context IL;
    private final java.lang.String bX;
    private android.content.SharedPreferences bg;

    public IL(android.content.Context context, java.lang.String str) {
        this.IL = context;
        this.bX = str;
    }

    private android.content.SharedPreferences IL() {
        android.content.Context context;
        android.content.SharedPreferences sharedPreferences = this.bg;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (android.text.TextUtils.isEmpty(this.bX) || (context = this.IL) == null) {
            return null;
        }
        try {
            this.bg = context.getSharedPreferences(this.bX, 0);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("SPUnit", th.getMessage());
        }
        return this.bg;
    }

    public void bg(org.json.JSONObject jSONObject) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null) {
                android.content.SharedPreferences.Editor editorEdit = sharedPreferencesIL.edit();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    try {
                        if (!android.text.TextUtils.isEmpty(next)) {
                            java.lang.Object obj = jSONObject.get(next);
                            if (obj instanceof java.lang.Integer) {
                                editorEdit.putInt(next, ((java.lang.Integer) obj).intValue());
                            } else if (obj instanceof java.lang.Long) {
                                editorEdit.putLong(next, ((java.lang.Long) obj).longValue());
                            } else if (obj instanceof java.lang.String) {
                                editorEdit.putString(next, (java.lang.String) obj);
                            } else if (obj instanceof java.lang.Boolean) {
                                editorEdit.putBoolean(next, ((java.lang.Boolean) obj).booleanValue());
                            } else if (obj instanceof java.lang.Float) {
                                editorEdit.putFloat(next, ((java.lang.Float) obj).floatValue());
                            } else if (obj instanceof java.lang.Double) {
                                editorEdit.putFloat(next, java.lang.Double.valueOf(((java.lang.Double) obj).doubleValue()).floatValue());
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        android.util.Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (java.lang.Throwable th2) {
            android.util.Log.e("SPUnit", th2.getMessage());
        }
    }

    public void bg(java.lang.String str, long j) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null) {
                android.content.SharedPreferences.Editor editorEdit = sharedPreferencesIL.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("SPUnit", th.getMessage());
        }
    }

    public int bg(java.lang.String str, int i) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null && sharedPreferencesIL.contains(str)) {
                return sharedPreferencesIL.getInt(str, i);
            }
            return i;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("SPUnit", this.bX + th.getMessage());
            return i;
        }
    }

    public long IL(java.lang.String str, long j) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null && sharedPreferencesIL.contains(str)) {
                return sharedPreferencesIL.getLong(str, j);
            }
            return j;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("SPUnit", this.bX + th.getMessage());
            return j;
        }
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null && sharedPreferencesIL.contains(str)) {
                return sharedPreferencesIL.getString(str, str2);
            }
            return str2;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("SPUnit", this.bX + th.getMessage());
            return str2;
        }
    }

    public boolean bg(java.lang.String str, boolean z) {
        try {
            android.content.SharedPreferences sharedPreferencesIL = IL();
            if (sharedPreferencesIL != null && sharedPreferencesIL.contains(str)) {
                return sharedPreferencesIL.getBoolean(str, z);
            }
            return z;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("SPUnit", this.bX + th.getMessage());
            return z;
        }
    }

    public void bg() {
        android.content.SharedPreferences sharedPreferencesIL = IL();
        if (sharedPreferencesIL != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferencesIL.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
