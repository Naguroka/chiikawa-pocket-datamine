package com.applovin.impl.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class BundleUtils {
    public static boolean containsAtLeastOneKey(java.util.Set<java.lang.String> set, android.os.Bundle bundle) {
        if (set != null && !set.isEmpty()) {
            java.util.Iterator<java.lang.String> it = set.iterator();
            while (it.hasNext()) {
                if (bundle.containsKey(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean getBoolean(java.lang.String str, android.os.Bundle bundle) {
        return getBoolean(str, false, bundle);
    }

    public static android.os.Bundle getBundle(java.lang.String str, android.os.Bundle bundle) {
        return getBundle(str, null, bundle);
    }

    public static int getInt(java.lang.String str, android.os.Bundle bundle) {
        return getInt(str, 0, bundle);
    }

    public static long getLong(java.lang.String str, android.os.Bundle bundle) {
        return getLong(str, 0L, bundle);
    }

    public static java.lang.String getString(java.lang.String str, android.os.Bundle bundle) {
        return getString(str, null, bundle);
    }

    public static void put(java.lang.String str, java.lang.Object obj, android.os.Bundle bundle) {
        if (obj == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Skipped insertion into Bundle because value is null.");
            return;
        }
        if (obj instanceof java.lang.String) {
            putString(str, (java.lang.String) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            putBoolean(str, (java.lang.Boolean) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            putInt(str, (java.lang.Integer) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Long) {
            putLong(str, (java.lang.Long) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Double) {
            putDouble(str, (java.lang.Double) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Byte) {
            putByte(str, (java.lang.Byte) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Character) {
            putChar(str, (java.lang.Character) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Float) {
            putFloat(str, (java.lang.Float) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.Short) {
            putShort(str, (java.lang.Short) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.CharSequence) {
            putCharSequence(str, (java.lang.CharSequence) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.String[]) {
            putStringArray(str, (java.lang.String[]) obj, bundle);
            return;
        }
        if (obj instanceof boolean[]) {
            putBooleanArray(str, (boolean[]) obj, bundle);
            return;
        }
        if (obj instanceof int[]) {
            putIntArray(str, (int[]) obj, bundle);
            return;
        }
        if (obj instanceof long[]) {
            putLongArray(str, (long[]) obj, bundle);
            return;
        }
        if (obj instanceof double[]) {
            putDoubleArray(str, (double[]) obj, bundle);
            return;
        }
        if (obj instanceof byte[]) {
            putByteArray(str, (byte[]) obj, bundle);
            return;
        }
        if (obj instanceof char[]) {
            putCharArray(str, (char[]) obj, bundle);
            return;
        }
        if (obj instanceof float[]) {
            putFloatArray(str, (float[]) obj, bundle);
            return;
        }
        if (obj instanceof short[]) {
            putShortArray(str, (short[]) obj, bundle);
            return;
        }
        if (obj instanceof java.lang.CharSequence[]) {
            putCharSequenceArray(str, (java.lang.CharSequence[]) obj, bundle);
            return;
        }
        if (obj instanceof java.util.ArrayList) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) instanceof java.lang.String) {
                    putStringArrayList(str, arrayList, bundle);
                    return;
                } else if (arrayList.get(0) instanceof java.lang.Integer) {
                    putIntegerArrayList(str, arrayList, bundle);
                    return;
                } else {
                    if (arrayList.get(0) instanceof java.lang.CharSequence) {
                        putCharSequenceArrayList(str, arrayList, bundle);
                        return;
                    }
                    return;
                }
            }
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Skipped insertion of " + obj + " into Bundle");
    }

    public static void putBoolean(java.lang.String str, java.lang.Boolean bool, android.os.Bundle bundle) {
        if (bool != null) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static void putBooleanArray(java.lang.String str, boolean[] zArr, android.os.Bundle bundle) {
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static void putByte(java.lang.String str, java.lang.Byte b, android.os.Bundle bundle) {
        if (b != null) {
            bundle.putByte(str, b.byteValue());
        }
    }

    public static void putByteArray(java.lang.String str, byte[] bArr, android.os.Bundle bundle) {
        if (bArr != null) {
            bundle.putByteArray(str, bArr);
        }
    }

    public static void putChar(java.lang.String str, java.lang.Character ch, android.os.Bundle bundle) {
        if (ch != null) {
            bundle.putChar(str, ch.charValue());
        }
    }

    public static void putCharArray(java.lang.String str, char[] cArr, android.os.Bundle bundle) {
        if (cArr != null) {
            bundle.putCharArray(str, cArr);
        }
    }

    public static void putCharSequence(java.lang.String str, java.lang.CharSequence charSequence, android.os.Bundle bundle) {
        if (charSequence != null) {
            bundle.putCharSequence(str, charSequence);
        }
    }

    public static void putCharSequenceArray(java.lang.String str, java.lang.CharSequence[] charSequenceArr, android.os.Bundle bundle) {
        if (charSequenceArr != null) {
            bundle.putCharSequenceArray(str, charSequenceArr);
        }
    }

    public static void putCharSequenceArrayList(java.lang.String str, java.util.ArrayList<java.lang.CharSequence> arrayList, android.os.Bundle bundle) {
        if (arrayList != null) {
            bundle.putCharSequenceArrayList(str, arrayList);
        }
    }

    public static void putDouble(java.lang.String str, java.lang.Double d, android.os.Bundle bundle) {
        if (d != null) {
            bundle.putDouble(str, d.doubleValue());
        }
    }

    public static void putDoubleArray(java.lang.String str, double[] dArr, android.os.Bundle bundle) {
        if (dArr != null) {
            bundle.putDoubleArray(str, dArr);
        }
    }

    public static void putFloat(java.lang.String str, java.lang.Float f, android.os.Bundle bundle) {
        if (f != null) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    public static void putFloatArray(java.lang.String str, float[] fArr, android.os.Bundle bundle) {
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public static void putInt(java.lang.String str, java.lang.Integer num, android.os.Bundle bundle) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static void putIntArray(java.lang.String str, int[] iArr, android.os.Bundle bundle) {
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        }
    }

    public static void putIntegerArrayList(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList, android.os.Bundle bundle) {
        if (arrayList != null) {
            bundle.putIntegerArrayList(str, arrayList);
        }
    }

    public static void putLong(java.lang.String str, java.lang.Long l, android.os.Bundle bundle) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    public static void putLongArray(java.lang.String str, long[] jArr, android.os.Bundle bundle) {
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        }
    }

    public static void putShort(java.lang.String str, java.lang.Short sh, android.os.Bundle bundle) {
        if (sh != null) {
            bundle.putShort(str, sh.shortValue());
        }
    }

    public static void putShortArray(java.lang.String str, short[] sArr, android.os.Bundle bundle) {
        if (sArr != null) {
            bundle.putShortArray(str, sArr);
        }
    }

    public static void putString(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void putStringArray(java.lang.String str, java.lang.String[] strArr, android.os.Bundle bundle) {
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        }
    }

    public static void putStringArrayList(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList, android.os.Bundle bundle) {
        if (arrayList != null) {
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public static void putStringIfValid(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (com.applovin.sdk.AppLovinSdkUtils.isValidString(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static org.json.JSONObject toJSONObject(android.os.Bundle bundle) {
        if (bundle == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj != null) {
                    if (obj instanceof android.os.Bundle) {
                        jSONObject.put(str, toJSONObject((android.os.Bundle) obj));
                    } else if ((obj instanceof java.util.Collection) || (obj instanceof android.os.Parcelable[])) {
                        java.util.Collection collectionAsList = obj instanceof java.util.Collection ? (java.util.Collection) obj : java.util.Arrays.asList((android.os.Parcelable[]) obj);
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (java.lang.Object obj2 : collectionAsList) {
                            if (obj2 instanceof android.os.Bundle) {
                                jSONArray.put(toJSONObject((android.os.Bundle) obj2));
                            } else {
                                jSONArray.put(obj2);
                            }
                        }
                        jSONObject.put(str, jSONArray);
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
            }
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.c("AppLovinSdk", "Failed to convert Bundle to JSONObject", e);
        }
        return jSONObject;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> toMap(android.os.Bundle bundle) {
        if (bundle == null) {
            return new java.util.HashMap();
        }
        java.util.HashMap map = new java.util.HashMap(bundle.size());
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof android.os.Bundle) {
                    map.put(str, toMap((android.os.Bundle) obj));
                } else {
                    boolean z = obj instanceof java.util.Collection;
                    if (z || (obj instanceof android.os.Parcelable[])) {
                        java.util.Collection collectionAsList = z ? (java.util.Collection) obj : java.util.Arrays.asList((android.os.Parcelable[]) obj);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : collectionAsList) {
                            if (obj2 instanceof android.os.Bundle) {
                                arrayList.add(toMap((android.os.Bundle) obj2));
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        map.put(str, arrayList);
                    } else {
                        map.put(str, obj);
                    }
                }
            }
        }
        return map;
    }

    public static java.util.Map<java.lang.String, java.lang.String> toStringMap(android.os.Bundle bundle) {
        if (bundle == null) {
            return new java.util.HashMap(0);
        }
        java.util.HashMap map = new java.util.HashMap(bundle.size());
        for (java.lang.String str : bundle.keySet()) {
            map.put(str, java.lang.String.valueOf(bundle.get(str)));
        }
        return map;
    }

    public static boolean getBoolean(java.lang.String str, boolean z, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) obj).booleanValue();
            }
            if (obj instanceof java.lang.Number) {
                return ((java.lang.Number) obj).intValue() != 0;
            }
            if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.equalsIgnoreCase(com.json.mediationsdk.metadata.a.g) || str2.equalsIgnoreCase("1")) {
                    return true;
                }
                if (str2.equalsIgnoreCase("false") || str2.equalsIgnoreCase("0")) {
                    return false;
                }
                return z;
            }
        }
        return z;
    }

    public static android.os.Bundle getBundle(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Bundle bundle3;
        return (android.text.TextUtils.isEmpty(str) || bundle2 == null || (bundle3 = bundle2.getBundle(str)) == null) ? bundle : bundle3;
    }

    public static int getInt(java.lang.String str, int i, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.Number) {
                return ((java.lang.Number) obj).intValue();
            }
            if (obj instanceof java.lang.String) {
                try {
                    return java.lang.Integer.parseInt((java.lang.String) obj);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return i;
    }

    public static long getLong(java.lang.String str, long j, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(str)) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.Number) {
                return ((java.lang.Number) obj).longValue();
            }
            if (obj instanceof java.lang.String) {
                try {
                    return java.lang.Long.parseLong((java.lang.String) obj);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return j;
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str) || bundle == null || !bundle.containsKey(str)) {
            return str2;
        }
        java.lang.Object obj = bundle.get(str);
        return obj instanceof java.lang.String ? (java.lang.String) obj : java.lang.String.valueOf(obj);
    }
}
