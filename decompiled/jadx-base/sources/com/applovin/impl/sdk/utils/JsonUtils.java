package com.applovin.impl.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class JsonUtils {
    public static final java.lang.String EMPTY_JSON = "{}";

    private static java.util.List a(org.json.JSONArray jSONArray, java.util.List list) {
        if (jSONArray == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static boolean containsCaseInsensitiveString(java.lang.String str, org.json.JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                java.lang.Object obj = jSONArray.get(i);
                if ((obj instanceof java.lang.String) && ((java.lang.String) obj).equalsIgnoreCase(str)) {
                    return true;
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }

    public static boolean containsJSONObjectContainingInt(org.json.JSONArray jSONArray, int i, java.lang.String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt(str) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static org.json.JSONObject deepCopy(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof org.json.JSONObject) {
                    jSONObject2.put(next, deepCopy((org.json.JSONObject) obj));
                } else if (obj instanceof org.json.JSONArray) {
                    jSONObject2.put(next, deepCopy((org.json.JSONArray) obj));
                } else {
                    jSONObject2.put(next, obj);
                }
            } catch (org.json.JSONException unused) {
                com.applovin.impl.sdk.n.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject deep copy");
            }
        }
        return jSONObject2;
    }

    public static org.json.JSONObject deserialize(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to deserialize into JSON: " + str, th);
            return null;
        }
    }

    public static java.lang.Boolean getBoolean(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (org.json.JSONException unused) {
            return java.lang.Boolean.valueOf(getInt(jSONObject, str, (bool == null || !bool.booleanValue()) ? 0 : 1) > 0);
        }
    }

    public static double getDouble(org.json.JSONObject jSONObject, java.lang.String str, double d) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return d;
        }
        try {
            return jSONObject.getDouble(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve double property for key = " + str, e);
            return d;
        }
    }

    public static float getFloat(org.json.JSONObject jSONObject, java.lang.String str, float f) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return f;
        }
        try {
            double d = jSONObject.getDouble(str);
            return (-3.4028234663852886E38d >= d || d >= 3.4028234663852886E38d) ? f : (float) d;
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve float property for key = " + str, e);
            return f;
        }
    }

    public static int getInt(org.json.JSONObject jSONObject, java.lang.String str, int i) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return i;
        }
        try {
            return jSONObject.getInt(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve int property for key = " + str, e);
            return i;
        }
    }

    public static java.lang.Integer getInteger(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return java.lang.Integer.valueOf(jSONObject.getInt(str));
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve int property for key = " + str, e);
            return num;
        }
    }

    public static java.util.List<java.lang.Integer> getIntegerList(org.json.JSONObject jSONObject, java.lang.String str, java.util.List<java.lang.Integer> list) {
        org.json.JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toIntegerList(jSONArray) : list;
    }

    public static org.json.JSONArray getJSONArray(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONArray;
        }
        try {
            return jSONObject.getJSONArray(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve JSON array for key = " + str, e);
            return jSONArray;
        }
    }

    public static org.json.JSONObject getJSONObject(org.json.JSONObject jSONObject, java.lang.String str) {
        return getJSONObject(jSONObject, str, (org.json.JSONObject) null);
    }

    public static java.util.List getList(org.json.JSONObject jSONObject, java.lang.String str, java.util.List list) {
        try {
            org.json.JSONArray jSONArray = getJSONArray(jSONObject, str, null);
            return jSONArray != null ? toList(jSONArray) : list;
        } catch (org.json.JSONException unused) {
            return list;
        }
    }

    public static long getLong(org.json.JSONObject jSONObject, java.lang.String str, long j) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return j;
        }
        try {
            return jSONObject.getLong(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve long property for key = " + str, e);
            return j;
        }
    }

    public static java.lang.Object getObject(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return obj;
        }
        try {
            java.lang.Object obj2 = jSONObject.get(str);
            return obj2 != null ? obj2 : obj;
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve Object for key = " + str, e);
            return obj;
        }
    }

    public static java.lang.Object getObjectAtIndex(org.json.JSONArray jSONArray, int i, java.lang.Object obj) {
        if (jSONArray == null || jSONArray.length() <= i) {
            return obj;
        }
        try {
            return jSONArray.get(i);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve object at index " + i + " for JSON array", e);
            return obj;
        }
    }

    public static java.lang.String getString(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        if (jSONObject == null) {
            return str2;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getString(str) : str2;
        } catch (java.lang.Exception e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve string property for key = " + str, e);
            return str2;
        }
    }

    public static java.util.List<java.lang.String> getStringList(org.json.JSONObject jSONObject, java.lang.String str, java.util.List<java.lang.String> list) {
        org.json.JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toStringList(jSONArray) : list;
    }

    public static org.json.JSONObject jsonObjectFromJsonString(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to convert JSON string '" + str + "' to JSONObject", e);
            return jSONObject;
        }
    }

    public static java.lang.String maybeConvertToIndentedString(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(4);
        } catch (org.json.JSONException unused) {
            return jSONObject.toString();
        }
    }

    public static <T> java.util.List<T> optList(org.json.JSONArray jSONArray, java.util.List<T> list) {
        try {
            return a(jSONArray, list);
        } catch (org.json.JSONException unused) {
            return list;
        }
    }

    public static void putAll(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object object = getObject(jSONObject2, next, null);
            if (object != null) {
                putObject(jSONObject, next, object);
            }
        }
    }

    public static void putBoolean(org.json.JSONObject jSONObject, java.lang.String str, boolean z) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put boolean property for key = " + str, e);
            }
        }
    }

    public static void putBooleanIfValid(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Boolean bool) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || bool == null) {
            return;
        }
        putBoolean(jSONObject, str, bool.booleanValue());
    }

    public static void putDouble(org.json.JSONObject jSONObject, java.lang.String str, double d) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put double property for key = " + str, e);
            }
        }
    }

    public static void putInt(org.json.JSONObject jSONObject, java.lang.String str, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put int property for key = " + str, e);
            }
        }
    }

    public static void putJSONObject(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put JSON property for key = " + str, e);
            }
        }
    }

    public static void putJSONObjectIfValid(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            return;
        }
        putJSONObject(jSONObject, str, jSONObject2);
    }

    public static void putJsonArray(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put JSONArray property for key = " + str, e);
            }
        }
    }

    public static void putJsonArrayIfValid(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        putJsonArray(jSONObject, str, jSONArray);
    }

    public static void putLong(org.json.JSONObject jSONObject, java.lang.String str, long j) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put long property for key = " + str, e);
            }
        }
    }

    public static void putObject(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put Object property for key = " + str, e);
            }
        }
    }

    public static void putString(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (org.json.JSONException e) {
                com.applovin.impl.sdk.n.b("JsonUtils", "Failed to put String property for key = " + str, e);
            }
        }
    }

    public static void putStringIfValid(org.json.JSONArray jSONArray, java.lang.String str) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            jSONArray.put(str);
        }
    }

    public static void removeObjectsForKeys(org.json.JSONObject jSONObject, java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            jSONObject.remove(str);
        }
    }

    public static org.json.JSONObject shallowCopy(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.get(next));
            } catch (org.json.JSONException unused) {
                com.applovin.impl.sdk.n.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject copy");
            }
        }
        return jSONObject2;
    }

    public static android.os.Bundle toBundle(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        if (obj instanceof org.json.JSONObject) {
            jSONObject = (org.json.JSONObject) obj;
        } else if (obj instanceof java.lang.String) {
            try {
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            } catch (org.json.JSONException unused) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return toBundle(jSONObject);
    }

    public static java.util.List<java.lang.Integer> toIntegerList(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add((java.lang.Integer) jSONArray.get(i));
            } catch (java.lang.Throwable unused) {
            }
        }
        return arrayList;
    }

    public static org.json.JSONArray toJsonArray(java.lang.String str, org.json.JSONArray jSONArray) {
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return jSONArray;
        }
    }

    public static <T> java.util.List<T> toList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return a(jSONArray, new java.util.ArrayList());
    }

    public static java.util.List<java.lang.String> toStringList(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add((java.lang.String) jSONArray.get(i));
            } catch (java.lang.Throwable unused) {
            }
        }
        return arrayList;
    }

    public static java.util.Map<java.lang.String, java.lang.String> toStringMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)).toString());
        }
        return map;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> toStringObjectMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    public static java.util.Map<java.lang.String, java.lang.String> tryToStringMap(org.json.JSONObject jSONObject) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                java.lang.Object objA = a(jSONObject.get(next));
                map.put(next, objA != null ? objA.toString() : null);
            } catch (java.lang.Throwable unused) {
            }
        }
        return map;
    }

    public static boolean valueExists(org.json.JSONObject jSONObject, java.lang.String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static org.json.JSONObject getJSONObject(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONObject2;
        }
        try {
            return jSONObject.getJSONObject(str);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve JSON property for key = " + str, e);
            return jSONObject2;
        }
    }

    public static boolean valueExists(org.json.JSONArray jSONArray, java.lang.Object obj) {
        if (jSONArray != null && obj != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (obj.equals(getObjectAtIndex(jSONArray, i, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void putStringIfValid(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            putString(jSONObject, str, str2);
        }
    }

    private static java.lang.Object a(java.lang.Object obj) {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        if (obj instanceof org.json.JSONObject) {
            return toStringObjectMap((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? toList((org.json.JSONArray) obj) : obj;
    }

    public static java.lang.String maybeConvertToIndentedString(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new org.json.JSONObject(str).toString(i);
        } catch (org.json.JSONException unused) {
            return str;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> toStringObjectMap(java.lang.String str) {
        try {
            return toStringObjectMap(new org.json.JSONObject(str));
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to convert json string '" + str + "' to map", e);
            return new java.util.HashMap();
        }
    }

    public static java.lang.Double getDouble(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Double d) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return d;
        }
        try {
            return java.lang.Double.valueOf(jSONObject.getDouble(str));
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve Double property for key = " + str, e);
            return d;
        }
    }

    public static org.json.JSONArray getJSONArray(java.lang.Object obj) {
        if (obj == null) {
            return new org.json.JSONArray();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    public static org.json.JSONObject getJSONObject(org.json.JSONArray jSONArray, int i, org.json.JSONObject jSONObject) {
        if (jSONArray == null || i >= jSONArray.length()) {
            return jSONObject;
        }
        try {
            return jSONArray.getJSONObject(i);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve JSON object from array for index = " + i, e);
            return jSONObject;
        }
    }

    public static void putAll(org.json.JSONObject jSONObject, java.util.Map<java.lang.String, ?> map) {
        if (jSONObject == null || map == null) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null) {
                putObject(jSONObject, key, value);
            }
        }
    }

    public static java.lang.Float getFloat(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Float f) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return f;
        }
        try {
            double d = jSONObject.getDouble(str);
            return (-3.4028234663852886E38d >= d || d >= 3.4028234663852886E38d) ? f : java.lang.Float.valueOf((float) d);
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.b("JsonUtils", "Failed to retrieve float property for key = " + str, e);
            return f;
        }
    }

    public static org.json.JSONArray shallowCopy(org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    public static android.os.Bundle toBundle(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (jSONObject.isNull(next)) {
                    bundle.putString(next, null);
                } else {
                    java.lang.Object objOpt = jSONObject.opt(next);
                    if (objOpt instanceof org.json.JSONObject) {
                        bundle.putBundle(next, toBundle((org.json.JSONObject) objOpt));
                    } else if (objOpt instanceof org.json.JSONArray) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                        if (jSONArray.length() == 0) {
                            bundle.putStringArrayList(next, new java.util.ArrayList<>(0));
                        } else if (getObjectAtIndex(jSONArray, 0, null) instanceof java.lang.String) {
                            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                arrayList.add((java.lang.String) getObjectAtIndex(jSONArray, i, null));
                            }
                            bundle.putStringArrayList(next, arrayList);
                        } else {
                            bundle.putParcelableArrayList(next, toBundle(jSONArray));
                        }
                    } else if (objOpt instanceof java.lang.Boolean) {
                        bundle.putBoolean(next, ((java.lang.Boolean) objOpt).booleanValue());
                    } else if (objOpt instanceof java.lang.String) {
                        bundle.putString(next, (java.lang.String) objOpt);
                    } else if (objOpt instanceof java.lang.Integer) {
                        bundle.putInt(next, ((java.lang.Integer) objOpt).intValue());
                    } else if (objOpt instanceof java.lang.Long) {
                        bundle.putLong(next, ((java.lang.Long) objOpt).longValue());
                    } else if (objOpt instanceof java.lang.Double) {
                        bundle.putDouble(next, ((java.lang.Double) objOpt).doubleValue());
                    }
                }
            }
            return bundle;
        }
        return new android.os.Bundle();
    }

    public static org.json.JSONArray deepCopy(org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                java.lang.Object obj = jSONArray.get(i);
                if (obj instanceof org.json.JSONObject) {
                    jSONArray2.put(i, deepCopy((org.json.JSONObject) obj));
                } else if (obj instanceof org.json.JSONArray) {
                    jSONArray2.put(i, deepCopy((org.json.JSONArray) obj));
                } else {
                    jSONArray2.put(i, obj);
                }
            } catch (org.json.JSONException unused) {
                com.applovin.impl.sdk.n.l("JsonUtils", "Failed to copy over item at index " + i + " to JSONArray deep copy");
            }
        }
        return jSONArray2;
    }

    public static java.util.ArrayList<android.os.Bundle> toBundle(org.json.JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(toBundle(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        }
        return new java.util.ArrayList<>();
    }
}
